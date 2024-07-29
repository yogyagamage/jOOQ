/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.jooq.ConnectionProvider;
import org.jooq.tools.jdbc.DefaultConnection;

/**
 * A {@link ConnectionProvider}-enabled connection.
 * <p>
 * This is a wrapper for both a connection that must be returned to a
 * {@link ConnectionProvider}. This wrapper abstracts closing a JDBC connection
 * when it is obtained from a data source by closing it when the
 * {@link Statement}, {@link PreparedStatement}, or {@link CallableStatement} is
 * closed.
 *
 * @author Lukas Eder
 */
final class ProviderEnabledConnection extends DefaultConnection {

    private final ConnectionProvider connectionProvider;

    ProviderEnabledConnection(ConnectionProvider connectionProvider, Connection connection) {
        super(connection);

        this.connectionProvider = connectionProvider;
    }

    // ------------------------------------------------------------------------
    // XXX Closing the connection
    // ------------------------------------------------------------------------

    @Override
    public final void close() throws SQLException {
        Connection connection = getDelegate();

        if (connection != null) {
            connectionProvider.release(connection);
        }
    }

    // ------------------------------------------------------------------------
    // XXX Creation of Statements
    // ------------------------------------------------------------------------

    @Override
    public final Statement createStatement() throws SQLException {
        return new ProviderEnabledStatement(this, getDelegate().createStatement());
    }

    @Override
    public final Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return new ProviderEnabledStatement(this, getDelegate().createStatement(resultSetType, resultSetConcurrency));
    }

    @Override
    public final Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability)
        throws SQLException {
        return new ProviderEnabledStatement(this, getDelegate().createStatement(resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    // ------------------------------------------------------------------------
    // XXX Creation of PreparedStatements
    // ------------------------------------------------------------------------

    @Override
    public final PreparedStatement prepareStatement(String sql) throws SQLException {
        return new ProviderEnabledPreparedStatement(this, getDelegate().prepareStatement(sql));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return new ProviderEnabledPreparedStatement(this, getDelegate().prepareStatement(sql, autoGeneratedKeys));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
        throws SQLException {
        return new ProviderEnabledPreparedStatement(this, getDelegate().prepareStatement(sql, resultSetType, resultSetConcurrency));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
        int resultSetHoldability) throws SQLException {
        return new ProviderEnabledPreparedStatement(this, getDelegate().prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return new ProviderEnabledPreparedStatement(this, getDelegate().prepareStatement(sql, columnIndexes));
    }

    @Override
    public final PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return new ProviderEnabledPreparedStatement(this, getDelegate().prepareStatement(sql, columnNames));
    }

    // ------------------------------------------------------------------------
    // XXX Creation of CallableStatements
    // ------------------------------------------------------------------------

    @Override
    public final CallableStatement prepareCall(String sql) throws SQLException {
        return new ProviderEnabledCallableStatement(this, getDelegate().prepareCall(sql));
    }

    @Override
    public final CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return new ProviderEnabledCallableStatement(this, getDelegate().prepareCall(sql, resultSetType, resultSetConcurrency));
    }

    @Override
    public final CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
        int resultSetHoldability) throws SQLException {
        return new ProviderEnabledCallableStatement(this, getDelegate().prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability));
    }
}

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
package org.jooq.postgres.extensions.converters;

import static org.jooq.postgres.extensions.types.Inet.inet;

import java.net.InetAddress;

import org.jooq.postgres.extensions.types.Inet;

/**
 * A converter for the PostgreSQL <code>inet</code> data type.
 *
 * @author Lukas Eder
 */
public class InetConverter extends AbstractInetConverter<Inet> {

    public InetConverter() {
        super(Inet.class);
    }

    @Override
    final Inet construct(InetAddress address, Integer prefix) {
        return inet(address, prefix);
    }
}

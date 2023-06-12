/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.h2.information_schema;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.meta.h2.information_schema.tables.Columns;
import org.jooq.meta.h2.information_schema.tables.Constraints;
import org.jooq.meta.h2.information_schema.tables.CrossReferences;
import org.jooq.meta.h2.information_schema.tables.Domains;
import org.jooq.meta.h2.information_schema.tables.FunctionAliases;
import org.jooq.meta.h2.information_schema.tables.FunctionColumns;
import org.jooq.meta.h2.information_schema.tables.Indexes;
import org.jooq.meta.h2.information_schema.tables.Schemata;
import org.jooq.meta.h2.information_schema.tables.Sequences;
import org.jooq.meta.h2.information_schema.tables.Tables;
import org.jooq.meta.h2.information_schema.tables.TypeInfo;
import org.jooq.meta.h2.information_schema.tables.Views;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InformationSchema extends SchemaImpl {

    private static final long serialVersionUID = -463923478;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA</code>
     */
    public static final InformationSchema INFORMATION_SCHEMA = new InformationSchema();

    /**
     * The table <code>INFORMATION_SCHEMA.COLUMNS</code>.
     */
    public final Columns COLUMNS = Columns.COLUMNS;

    /**
     * The table <code>INFORMATION_SCHEMA.CONSTRAINTS</code>.
     */
    public final Constraints CONSTRAINTS = Constraints.CONSTRAINTS;

    /**
     * The table <code>INFORMATION_SCHEMA.CROSS_REFERENCES</code>.
     */
    public final CrossReferences CROSS_REFERENCES = CrossReferences.CROSS_REFERENCES;

    /**
     * The table <code>INFORMATION_SCHEMA.DOMAINS</code>.
     */
    public final Domains DOMAINS = Domains.DOMAINS;

    /**
     * The table <code>INFORMATION_SCHEMA.FUNCTION_ALIASES</code>.
     */
    public final FunctionAliases FUNCTION_ALIASES = FunctionAliases.FUNCTION_ALIASES;

    /**
     * The table <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS</code>.
     */
    public final FunctionColumns FUNCTION_COLUMNS = FunctionColumns.FUNCTION_COLUMNS;

    /**
     * The table <code>INFORMATION_SCHEMA.INDEXES</code>.
     */
    public final Indexes INDEXES = Indexes.INDEXES;

    /**
     * The table <code>INFORMATION_SCHEMA.SCHEMATA</code>.
     */
    public final Schemata SCHEMATA = Schemata.SCHEMATA;

    /**
     * The table <code>INFORMATION_SCHEMA.SEQUENCES</code>.
     */
    public final Sequences SEQUENCES = Sequences.SEQUENCES;

    /**
     * The table <code>INFORMATION_SCHEMA.TABLES</code>.
     */
    public final Tables TABLES = Tables.TABLES;

    /**
     * The table <code>INFORMATION_SCHEMA.TYPE_INFO</code>.
     */
    public final TypeInfo TYPE_INFO = TypeInfo.TYPE_INFO;

    /**
     * The table <code>INFORMATION_SCHEMA.VIEWS</code>.
     */
    public final Views VIEWS = Views.VIEWS;

    /**
     * No further instances allowed
     */
    private InformationSchema() {
        super("INFORMATION_SCHEMA", null);
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Columns.COLUMNS,
            Constraints.CONSTRAINTS,
            CrossReferences.CROSS_REFERENCES,
            Domains.DOMAINS,
            FunctionAliases.FUNCTION_ALIASES,
            FunctionColumns.FUNCTION_COLUMNS,
            Indexes.INDEXES,
            Schemata.SCHEMATA,
            Sequences.SEQUENCES,
            Tables.TABLES,
            TypeInfo.TYPE_INFO,
            Views.VIEWS);
    }
}

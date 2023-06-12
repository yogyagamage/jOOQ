/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.information_schema.tables;


import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.InformationSchema;
import org.jooq.meta.postgres.information_schema.Keys;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Domains extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.domains</code>
     */
    public static final Domains DOMAINS = new Domains();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.domains.domain_catalog</code>.
     */
    public final TableField<Record, String> DOMAIN_CATALOG = createField(DSL.name("domain_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.domain_schema</code>.
     */
    public final TableField<Record, String> DOMAIN_SCHEMA = createField(DSL.name("domain_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.domain_name</code>.
     */
    public final TableField<Record, String> DOMAIN_NAME = createField(DSL.name("domain_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.data_type</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("data_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.domains.character_maximum_length</code>.
     */
    public final TableField<Record, Integer> CHARACTER_MAXIMUM_LENGTH = createField(DSL.name("character_maximum_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.domains.character_octet_length</code>.
     */
    public final TableField<Record, Integer> CHARACTER_OCTET_LENGTH = createField(DSL.name("character_octet_length"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.character_set_catalog</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_CATALOG = createField(DSL.name("character_set_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.character_set_schema</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_SCHEMA = createField(DSL.name("character_set_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.character_set_name</code>.
     */
    public final TableField<Record, String> CHARACTER_SET_NAME = createField(DSL.name("character_set_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.collation_catalog</code>.
     */
    public final TableField<Record, String> COLLATION_CATALOG = createField(DSL.name("collation_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.collation_schema</code>.
     */
    public final TableField<Record, String> COLLATION_SCHEMA = createField(DSL.name("collation_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.collation_name</code>.
     */
    public final TableField<Record, String> COLLATION_NAME = createField(DSL.name("collation_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.numeric_precision</code>.
     */
    public final TableField<Record, Integer> NUMERIC_PRECISION = createField(DSL.name("numeric_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>information_schema.domains.numeric_precision_radix</code>.
     */
    public final TableField<Record, Integer> NUMERIC_PRECISION_RADIX = createField(DSL.name("numeric_precision_radix"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.numeric_scale</code>.
     */
    public final TableField<Record, Integer> NUMERIC_SCALE = createField(DSL.name("numeric_scale"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.datetime_precision</code>.
     */
    public final TableField<Record, Integer> DATETIME_PRECISION = createField(DSL.name("datetime_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.interval_type</code>.
     */
    public final TableField<Record, String> INTERVAL_TYPE = createField(DSL.name("interval_type"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.interval_precision</code>.
     */
    public final TableField<Record, Integer> INTERVAL_PRECISION = createField(DSL.name("interval_precision"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.domain_default</code>.
     */
    public final TableField<Record, String> DOMAIN_DEFAULT = createField(DSL.name("domain_default"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.udt_catalog</code>.
     */
    public final TableField<Record, String> UDT_CATALOG = createField(DSL.name("udt_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.udt_schema</code>.
     */
    public final TableField<Record, String> UDT_SCHEMA = createField(DSL.name("udt_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.udt_name</code>.
     */
    public final TableField<Record, String> UDT_NAME = createField(DSL.name("udt_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.scope_catalog</code>.
     */
    public final TableField<Record, String> SCOPE_CATALOG = createField(DSL.name("scope_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.scope_schema</code>.
     */
    public final TableField<Record, String> SCOPE_SCHEMA = createField(DSL.name("scope_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.scope_name</code>.
     */
    public final TableField<Record, String> SCOPE_NAME = createField(DSL.name("scope_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.domains.maximum_cardinality</code>.
     */
    public final TableField<Record, Integer> MAXIMUM_CARDINALITY = createField(DSL.name("maximum_cardinality"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.domains.dtd_identifier</code>.
     */
    public final TableField<Record, String> DTD_IDENTIFIER = createField(DSL.name("dtd_identifier"), SQLDataType.VARCHAR, this, "");

    private Domains(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Domains(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    public Domains(String alias) {
        this(DSL.name(alias), DOMAINS);
    }

    /**
     * Create an aliased <code>information_schema.domains</code> table reference
     */
    public Domains(Name alias) {
        this(alias, DOMAINS);
    }

    /**
     * Create a <code>information_schema.domains</code> table reference
     */
    public Domains() {
        this(DSL.name("domains"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_DOMAINS;
    }

    @Override
    public Domains as(String alias) {
        return new Domains(DSL.name(alias), this);
    }

    @Override
    public Domains as(Name alias) {
        return new Domains(alias, this);
    }

    @Override
    public Domains as(Table<?> alias) {
        return new Domains(alias.getQualifiedName(), this);
    }
}

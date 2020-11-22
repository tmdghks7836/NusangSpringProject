/*
 * This file is generated by jOOQ.
 */
package com.mycom.jooq.tables;


import com.mycom.jooq.JSpbooter;
import com.mycom.jooq.Keys;
import com.mycom.jooq.tables.records.JLocationRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row10;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.4"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JLocation extends TableImpl<JLocationRecord> {

    private static final long serialVersionUID = 1415506563;

    /**
     * The reference instance of <code>SPBOOTER.LOCATION</code>
     */
    public static final JLocation LOCATION = new JLocation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JLocationRecord> getRecordType() {
        return JLocationRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JLocationRecord, Object> LOCATIONNO = createField(DSL.name("LOCATIONNO"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>SPBOOTER.LOCATION.CREATE_DATE</code>.
     */
    public final TableField<JLocationRecord, Timestamp> CREATE_DATE = createField(DSL.name("CREATE_DATE"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(11).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>SPBOOTER.LOCATION.LATITUDE</code>.
     */
    public final TableField<JLocationRecord, Double> LATITUDE = createField(DSL.name("LATITUDE"), org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.FLOAT)), this, "");

    /**
     * The column <code>SPBOOTER.LOCATION.LONGTITUDE</code>.
     */
    public final TableField<JLocationRecord, Double> LONGTITUDE = createField(DSL.name("LONGTITUDE"), org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.FLOAT)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JLocationRecord, Object> NAME1 = createField(DSL.name("NAME1"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JLocationRecord, Object> NAME2 = createField(DSL.name("NAME2"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JLocationRecord, Object> NAME3 = createField(DSL.name("NAME3"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JLocationRecord, Object> TABLETYPE = createField(DSL.name("TABLETYPE"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JLocationRecord, Object> VIEW_DISTANCE = createField(DSL.name("VIEW_DISTANCE"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JLocationRecord, Object> USERNO = createField(DSL.name("USERNO"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * Create a <code>SPBOOTER.LOCATION</code> table reference
     */
    public JLocation() {
        this(DSL.name("LOCATION"), null);
    }

    /**
     * Create an aliased <code>SPBOOTER.LOCATION</code> table reference
     */
    public JLocation(String alias) {
        this(DSL.name(alias), LOCATION);
    }

    /**
     * Create an aliased <code>SPBOOTER.LOCATION</code> table reference
     */
    public JLocation(Name alias) {
        this(alias, LOCATION);
    }

    private JLocation(Name alias, Table<JLocationRecord> aliased) {
        this(alias, aliased, null);
    }

    private JLocation(Name alias, Table<JLocationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JLocation(Table<O> child, ForeignKey<O, JLocationRecord> key) {
        super(child, key, LOCATION);
    }

    @Override
    public Schema getSchema() {
        return JSpbooter.SPBOOTER;
    }

    @Override
    public UniqueKey<JLocationRecord> getPrimaryKey() {
        return Keys.PK_LOCATION;
    }

    @Override
    public List<UniqueKey<JLocationRecord>> getKeys() {
        return Arrays.<UniqueKey<JLocationRecord>>asList(Keys.PK_LOCATION);
    }

    @Override
    public JLocation as(String alias) {
        return new JLocation(DSL.name(alias), this);
    }

    @Override
    public JLocation as(Name alias) {
        return new JLocation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JLocation rename(String name) {
        return new JLocation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JLocation rename(Name name) {
        return new JLocation(name, null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Object, Timestamp, Double, Double, Object, Object, Object, Object, Object, Object> fieldsRow() {
        return (Row10) super.fieldsRow();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.mycom.jooq.tables;


import com.mycom.jooq.JSpbooter;
import com.mycom.jooq.Keys;
import com.mycom.jooq.tables.records.JUser1Record;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
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
public class JUser1 extends TableImpl<JUser1Record> {

    private static final long serialVersionUID = 683721721;

    /**
     * The reference instance of <code>SPBOOTER.USER1</code>
     */
    public static final JUser1 USER1 = new JUser1();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JUser1Record> getRecordType() {
        return JUser1Record.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> USERNO = createField(DSL.name("USERNO"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> AGE = createField(DSL.name("AGE"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> AUTH_TYPE = createField(DSL.name("AUTH_TYPE"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> COIN = createField(DSL.name("COIN"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>SPBOOTER.USER1.CREATE_DATE</code>.
     */
    public final TableField<JUser1Record, Timestamp> CREATE_DATE = createField(DSL.name("CREATE_DATE"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(11).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> EMAIL = createField(DSL.name("EMAIL"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> GENDER = createField(DSL.name("GENDER"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> NICKNAME = createField(DSL.name("NICKNAME"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> PASSWORD = createField(DSL.name("PASSWORD"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> PICTURE = createField(DSL.name("PICTURE"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> ROLE = createField(DSL.name("ROLE"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> USERID = createField(DSL.name("USERID"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> USERNAME = createField(DSL.name("USERNAME"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JUser1Record, Object> LOCATIONNO = createField(DSL.name("LOCATIONNO"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * Create a <code>SPBOOTER.USER1</code> table reference
     */
    public JUser1() {
        this(DSL.name("USER1"), null);
    }

    /**
     * Create an aliased <code>SPBOOTER.USER1</code> table reference
     */
    public JUser1(String alias) {
        this(DSL.name(alias), USER1);
    }

    /**
     * Create an aliased <code>SPBOOTER.USER1</code> table reference
     */
    public JUser1(Name alias) {
        this(alias, USER1);
    }

    private JUser1(Name alias, Table<JUser1Record> aliased) {
        this(alias, aliased, null);
    }

    private JUser1(Name alias, Table<JUser1Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JUser1(Table<O> child, ForeignKey<O, JUser1Record> key) {
        super(child, key, USER1);
    }

    @Override
    public Schema getSchema() {
        return JSpbooter.SPBOOTER;
    }

    @Override
    public UniqueKey<JUser1Record> getPrimaryKey() {
        return Keys.PK_USER1;
    }

    @Override
    public List<UniqueKey<JUser1Record>> getKeys() {
        return Arrays.<UniqueKey<JUser1Record>>asList(Keys.PK_USER1);
    }

    @Override
    public JUser1 as(String alias) {
        return new JUser1(DSL.name(alias), this);
    }

    @Override
    public JUser1 as(Name alias) {
        return new JUser1(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JUser1 rename(String name) {
        return new JUser1(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JUser1 rename(Name name) {
        return new JUser1(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Object, Object, Object, Object, Timestamp, Object, Object, Object, Object, Object, Object, Object, Object, Object> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}

/*
 * This file is generated by jOOQ.
 */
package com.mycom.jooq.tables;


import com.mycom.jooq.JSpbooter;
import com.mycom.jooq.Keys;
import com.mycom.jooq.tables.records.JShopRoomRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row3;
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
public class JShopRoom extends TableImpl<JShopRoomRecord> {

    private static final long serialVersionUID = -47151235;

    /**
     * The reference instance of <code>SPBOOTER.SHOP_ROOM</code>
     */
    public static final JShopRoom SHOP_ROOM = new JShopRoom();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JShopRoomRecord> getRecordType() {
        return JShopRoomRecord.class;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JShopRoomRecord, Object> NO = createField(DSL.name("NO"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * The column <code>SPBOOTER.SHOP_ROOM.CREATE_DATE</code>.
     */
    public final TableField<JShopRoomRecord, Timestamp> CREATE_DATE = createField(DSL.name("CREATE_DATE"), org.jooq.impl.SQLDataType.TIMESTAMP.precision(11).defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled. Deprecation can be turned off using {@literal <deprecationOnUnknownTypes/>} in your code generator configuration.
     */
    @java.lang.Deprecated
    public final TableField<JShopRoomRecord, Object> ITEM_TYPE = createField(DSL.name("ITEM_TYPE"), org.jooq.impl.SQLDataType.OTHER.defaultValue(org.jooq.impl.DSL.field("", org.jooq.impl.SQLDataType.OTHER)), this, "");

    /**
     * Create a <code>SPBOOTER.SHOP_ROOM</code> table reference
     */
    public JShopRoom() {
        this(DSL.name("SHOP_ROOM"), null);
    }

    /**
     * Create an aliased <code>SPBOOTER.SHOP_ROOM</code> table reference
     */
    public JShopRoom(String alias) {
        this(DSL.name(alias), SHOP_ROOM);
    }

    /**
     * Create an aliased <code>SPBOOTER.SHOP_ROOM</code> table reference
     */
    public JShopRoom(Name alias) {
        this(alias, SHOP_ROOM);
    }

    private JShopRoom(Name alias, Table<JShopRoomRecord> aliased) {
        this(alias, aliased, null);
    }

    private JShopRoom(Name alias, Table<JShopRoomRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> JShopRoom(Table<O> child, ForeignKey<O, JShopRoomRecord> key) {
        super(child, key, SHOP_ROOM);
    }

    @Override
    public Schema getSchema() {
        return JSpbooter.SPBOOTER;
    }

    @Override
    public UniqueKey<JShopRoomRecord> getPrimaryKey() {
        return Keys.PK_SHOP_ROOM;
    }

    @Override
    public List<UniqueKey<JShopRoomRecord>> getKeys() {
        return Arrays.<UniqueKey<JShopRoomRecord>>asList(Keys.PK_SHOP_ROOM);
    }

    @Override
    public JShopRoom as(String alias) {
        return new JShopRoom(DSL.name(alias), this);
    }

    @Override
    public JShopRoom as(Name alias) {
        return new JShopRoom(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public JShopRoom rename(String name) {
        return new JShopRoom(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public JShopRoom rename(Name name) {
        return new JShopRoom(name, null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<Object, Timestamp, Object> fieldsRow() {
        return (Row3) super.fieldsRow();
    }
}

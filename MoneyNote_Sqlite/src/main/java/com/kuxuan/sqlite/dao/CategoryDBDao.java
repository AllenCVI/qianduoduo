package com.kuxuan.sqlite.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.kuxuan.sqlite.db.CategoryDB;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "CATEGORY_DB".
*/
public class CategoryDBDao extends AbstractDao<CategoryDB, Long> {

    public static final String TABLENAME = "CATEGORY_DB";

    /**
     * Properties of entity CategoryDB.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Bill_id = new Property(1, String.class, "bill_id", false, "BILL_ID");
        public final static Property Demo = new Property(2, String.class, "demo", false, "DEMO");
        public final static Property Name = new Property(3, String.class, "name", false, "NAME");
        public final static Property Type = new Property(4, int.class, "type", false, "TYPE");
        public final static Property Image_path = new Property(5, String.class, "image_path", false, "IMAGE_PATH");
        public final static Property Account = new Property(6, double.class, "account", false, "ACCOUNT");
        public final static Property Category_id = new Property(7, int.class, "category_id", false, "CATEGORY_ID");
        public final static Property Year = new Property(8, int.class, "year", false, "YEAR");
        public final static Property Month = new Property(9, int.class, "month", false, "MONTH");
        public final static Property Day = new Property(10, int.class, "day", false, "DAY");
        public final static Property CreateTime = new Property(11, long.class, "createTime", false, "CREATE_TIME");
        public final static Property UpdateTime = new Property(12, long.class, "updateTime", false, "UPDATE_TIME");
        public final static Property Time = new Property(13, long.class, "time", false, "TIME");
        public final static Property Status = new Property(14, int.class, "status", false, "STATUS");
        public final static Property User_id = new Property(15, int.class, "user_id", false, "USER_ID");
        public final static Property IsNeedSync = new Property(16, boolean.class, "isNeedSync", false, "IS_NEED_SYNC");
    }


    public CategoryDBDao(DaoConfig config) {
        super(config);
    }
    
    public CategoryDBDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"CATEGORY_DB\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BILL_ID\" TEXT," + // 1: bill_id
                "\"DEMO\" TEXT," + // 2: demo
                "\"NAME\" TEXT," + // 3: name
                "\"TYPE\" INTEGER NOT NULL ," + // 4: type
                "\"IMAGE_PATH\" TEXT," + // 5: image_path
                "\"ACCOUNT\" REAL NOT NULL ," + // 6: account
                "\"CATEGORY_ID\" INTEGER NOT NULL ," + // 7: category_id
                "\"YEAR\" INTEGER NOT NULL ," + // 8: year
                "\"MONTH\" INTEGER NOT NULL ," + // 9: month
                "\"DAY\" INTEGER NOT NULL ," + // 10: day
                "\"CREATE_TIME\" INTEGER NOT NULL ," + // 11: createTime
                "\"UPDATE_TIME\" INTEGER NOT NULL ," + // 12: updateTime
                "\"TIME\" INTEGER NOT NULL ," + // 13: time
                "\"STATUS\" INTEGER NOT NULL ," + // 14: status
                "\"USER_ID\" INTEGER NOT NULL ," + // 15: user_id
                "\"IS_NEED_SYNC\" INTEGER NOT NULL );"); // 16: isNeedSync
        // Add Indexes
        db.execSQL("CREATE UNIQUE INDEX " + constraint + "IDX_CATEGORY_DB_BILL_ID_USER_ID ON \"CATEGORY_DB\"" +
                " (\"BILL_ID\" ASC,\"USER_ID\" ASC);");
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"CATEGORY_DB\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, CategoryDB entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String bill_id = entity.getBill_id();
        if (bill_id != null) {
            stmt.bindString(2, bill_id);
        }
 
        String demo = entity.getDemo();
        if (demo != null) {
            stmt.bindString(3, demo);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
        stmt.bindLong(5, entity.getType());
 
        String image_path = entity.getImage_path();
        if (image_path != null) {
            stmt.bindString(6, image_path);
        }
        stmt.bindDouble(7, entity.getAccount());
        stmt.bindLong(8, entity.getCategory_id());
        stmt.bindLong(9, entity.getYear());
        stmt.bindLong(10, entity.getMonth());
        stmt.bindLong(11, entity.getDay());
        stmt.bindLong(12, entity.getCreateTime());
        stmt.bindLong(13, entity.getUpdateTime());
        stmt.bindLong(14, entity.getTime());
        stmt.bindLong(15, entity.getStatus());
        stmt.bindLong(16, entity.getUser_id());
        stmt.bindLong(17, entity.getIsNeedSync() ? 1L: 0L);
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, CategoryDB entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String bill_id = entity.getBill_id();
        if (bill_id != null) {
            stmt.bindString(2, bill_id);
        }
 
        String demo = entity.getDemo();
        if (demo != null) {
            stmt.bindString(3, demo);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(4, name);
        }
        stmt.bindLong(5, entity.getType());
 
        String image_path = entity.getImage_path();
        if (image_path != null) {
            stmt.bindString(6, image_path);
        }
        stmt.bindDouble(7, entity.getAccount());
        stmt.bindLong(8, entity.getCategory_id());
        stmt.bindLong(9, entity.getYear());
        stmt.bindLong(10, entity.getMonth());
        stmt.bindLong(11, entity.getDay());
        stmt.bindLong(12, entity.getCreateTime());
        stmt.bindLong(13, entity.getUpdateTime());
        stmt.bindLong(14, entity.getTime());
        stmt.bindLong(15, entity.getStatus());
        stmt.bindLong(16, entity.getUser_id());
        stmt.bindLong(17, entity.getIsNeedSync() ? 1L: 0L);
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public CategoryDB readEntity(Cursor cursor, int offset) {
        CategoryDB entity = new CategoryDB( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // bill_id
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // demo
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // name
            cursor.getInt(offset + 4), // type
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // image_path
            cursor.getDouble(offset + 6), // account
            cursor.getInt(offset + 7), // category_id
            cursor.getInt(offset + 8), // year
            cursor.getInt(offset + 9), // month
            cursor.getInt(offset + 10), // day
            cursor.getLong(offset + 11), // createTime
            cursor.getLong(offset + 12), // updateTime
            cursor.getLong(offset + 13), // time
            cursor.getInt(offset + 14), // status
            cursor.getInt(offset + 15), // user_id
            cursor.getShort(offset + 16) != 0 // isNeedSync
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, CategoryDB entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBill_id(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setDemo(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setName(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setType(cursor.getInt(offset + 4));
        entity.setImage_path(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setAccount(cursor.getDouble(offset + 6));
        entity.setCategory_id(cursor.getInt(offset + 7));
        entity.setYear(cursor.getInt(offset + 8));
        entity.setMonth(cursor.getInt(offset + 9));
        entity.setDay(cursor.getInt(offset + 10));
        entity.setCreateTime(cursor.getLong(offset + 11));
        entity.setUpdateTime(cursor.getLong(offset + 12));
        entity.setTime(cursor.getLong(offset + 13));
        entity.setStatus(cursor.getInt(offset + 14));
        entity.setUser_id(cursor.getInt(offset + 15));
        entity.setIsNeedSync(cursor.getShort(offset + 16) != 0);
     }
    
    @Override
    protected final Long updateKeyAfterInsert(CategoryDB entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(CategoryDB entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(CategoryDB entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}

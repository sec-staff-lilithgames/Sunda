package com.bytedance.sdk.openadsdk.hmu;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static String jpo() {
        return "CREATE TABLE IF NOT EXISTS trackurl (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,url TEXT ,replaceholder INTEGER default 0, retry INTEGER default 0, ad_id TEXT , url_type INTEGER default 0, error_code TEXT ,error_msg TEXT )";
    }

    public static void jpo(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN ad_id TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_code TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN error_msg TEXT ");
        sQLiteDatabase.execSQL("ALTER TABLE trackurl ADD COLUMN url_type INTEGER default 0");
    }
}

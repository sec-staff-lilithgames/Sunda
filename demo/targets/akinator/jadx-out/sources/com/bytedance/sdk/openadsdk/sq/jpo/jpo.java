package com.bytedance.sdk.openadsdk.sq.jpo;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.bytedance.sdk.component.utils.nmd;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends SQLiteOpenHelper {

    /* renamed from: jd, reason: collision with root package name */
    private static volatile jpo f21485jd;
    final Context jpo;

    private jpo(Context context) {
        super(context, "pag_monitor.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.jpo = context;
    }

    public static SQLiteDatabase jd() {
        try {
            jpo jpoVarWqx = wqx();
            if (jpoVarWqx == null) {
                return null;
            }
            SQLiteDatabase readableDatabase = jpoVarWqx.getReadableDatabase();
            if (readableDatabase.isOpen()) {
                return readableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    public static SQLiteDatabase jpo() {
        try {
            jpo jpoVarWqx = wqx();
            if (jpoVarWqx == null) {
                return null;
            }
            SQLiteDatabase writableDatabase = jpoVarWqx.getWritableDatabase();
            if (writableDatabase.isOpen()) {
                return writableDatabase;
            }
            return null;
        } catch (Throwable th2) {
            Log.i("MonitorSQLiteOpenHelper", th2.getMessage());
            return null;
        }
    }

    private static jpo wqx() {
        if (f21485jd == null) {
            synchronized (jpo.class) {
                try {
                    if (f21485jd == null) {
                        f21485jd = new jpo(com.bytedance.sdk.openadsdk.sq.jpo.jpo());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21485jd;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS monitor_table (_id INTEGER PRIMARY KEY AUTOINCREMENT,sdk_version TEXT ,scene TEXT ,start_count INTEGER default 0 , success_count INTEGER default 0  , fail_count INTEGER default 0  , rit TEXT  , tag TEXT  , label TEXT  , timestamp INTEGER default 0 ,mediation TEXT  , is_init INTEGER , extra TEXT )");
        } catch (Throwable th2) {
            Log.e("MonitorSQLiteOpenHelper", th2.getMessage());
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                onCreate(sQLiteDatabase);
            } else {
                jpo(sQLiteDatabase);
                onCreate(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }

    private ArrayList<String> jd(SQLiteDatabase sQLiteDatabase) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("select name from sqlite_master where type='table' order by name", null);
            if (cursorRawQuery != null) {
                while (cursorRawQuery.moveToNext()) {
                    String string = cursorRawQuery.getString(0);
                    if (!string.equals("android_metadata") && !string.equals("sqlite_sequence")) {
                        arrayList.add(string);
                    }
                }
                cursorRawQuery.close();
            }
            return arrayList;
        } catch (Exception e10) {
            nmd.wqx("MonitorSQLiteOpenHelper", e10.getMessage());
            return arrayList;
        }
    }

    private void jpo(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListJd = jd(sQLiteDatabase);
        if (arrayListJd == null || arrayListJd.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListJd.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}

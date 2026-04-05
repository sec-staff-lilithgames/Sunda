package com.bytedance.sdk.component.jj.jpo.jpo.jpo;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.bytedance.sdk.component.jj.jpo.xyk;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends SQLiteOpenHelper {
    final Context jpo;

    public cm(Context context) {
        super(context, "ttadlog.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.jpo = context;
    }

    private void jd(SQLiteDatabase sQLiteDatabase) throws SQLException {
        ArrayList<String> arrayListWqx = wqx(sQLiteDatabase);
        if (arrayListWqx == null || arrayListWqx.size() <= 0) {
            return;
        }
        Iterator<String> it = arrayListWqx.iterator();
        while (it.hasNext()) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + it.next() + " ;");
        }
    }

    private void jpo(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jpo.jd(xyk.qk().cm().jd()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.cm.wqx(xyk.qk().cm().jpo()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.qk.wqx(xyk.qk().cm().cm()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.jj.jpo(xyk.qk().cm().my()));
        sQLiteDatabase.execSQL(com.bytedance.sdk.component.jj.jpo.jj.jj.jd());
    }

    private ArrayList<String> wqx(SQLiteDatabase sQLiteDatabase) {
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
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            jpo(sQLiteDatabase);
        } catch (Throwable unused) {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        try {
            if (i10 <= i11) {
                jpo(sQLiteDatabase);
            } else {
                jd(sQLiteDatabase);
                jpo(sQLiteDatabase);
            }
        } catch (Throwable unused) {
        }
    }
}

package com.ironsource;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class I4 extends SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static H4 f34652a = new H4();

    public I4(Context context) {
        super(context, "reports", (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void a(P5 p52) {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f34652a.a(true, new I4(C3422r4.d().a()));
            try {
                sQLiteDatabaseA.beginTransaction();
                ContentValues contentValues = new ContentValues();
                String strE = p52.e();
                String strB = p52.b();
                String strD = p52.d();
                contentValues.put("stack_trace", strE);
                contentValues.put("crash_date", strB);
                contentValues.put("crashType", strD);
                sQLiteDatabaseA.insert("REPORTS", null, contentValues);
                sQLiteDatabaseA.setTransactionSuccessful();
                sQLiteDatabaseA.endTransaction();
                sQLiteDatabaseA.close();
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static P5 b(int i10) throws Throwable {
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f34652a.a(new I4(C3422r4.d().a()));
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
                int i11 = cursorRawQuery.getInt(0);
                String string = cursorRawQuery.getString(1);
                String string2 = cursorRawQuery.getString(2);
                String string3 = cursorRawQuery.getString(3);
                cursorRawQuery.close();
                P5 p52 = new P5(i11, string, string2, string3);
                sQLiteDatabaseA.close();
                return p52;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Cursor c() throws Throwable {
        I4 i42 = new I4(C3422r4.d().a());
        new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            SQLiteDatabase sQLiteDatabaseA = f34652a.a(i42);
            try {
                Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS;", null);
                sQLiteDatabaseA.close();
                return cursorRawQuery;
            } catch (Throwable th2) {
                th = th2;
                sQLiteDatabase = sQLiteDatabaseA;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    public static List<P5> b() {
        SQLiteDatabase sQLiteDatabaseA;
        I4 i42 = new I4(C3422r4.d().a());
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = f34652a.a(i42);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTS ;", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    arrayList.add(new P5(cursorRawQuery.getInt(0), cursorRawQuery.getString(1), cursorRawQuery.getString(2), cursorRawQuery.getString(3)));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            sQLiteDatabaseA.close();
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseA;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static Cursor a(int i10) throws Throwable {
        SQLiteDatabase sQLiteDatabaseA;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabaseA = f34652a.a(new I4(C3422r4.d().a()));
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            Cursor cursorRawQuery = sQLiteDatabaseA.rawQuery("SELECT * FROM REPORTSWHERE id= " + i10 + ";", null);
            sQLiteDatabaseA.close();
            return cursorRawQuery;
        } catch (Throwable th3) {
            th = th3;
            sQLiteDatabase = sQLiteDatabaseA;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void a() {
        SQLiteDatabase sQLiteDatabaseA = null;
        try {
            sQLiteDatabaseA = f34652a.a(true, new I4(C3422r4.d().a()));
            sQLiteDatabaseA.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabaseA.close();
        } catch (Throwable th2) {
            if (sQLiteDatabaseA != null) {
                sQLiteDatabaseA.close();
            }
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}

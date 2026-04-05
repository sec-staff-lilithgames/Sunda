package com.inmobi.media;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class C3 {

    /* renamed from: b, reason: collision with root package name */
    public static final SQLiteDatabase f31705b;

    /* renamed from: a, reason: collision with root package name */
    public static final C3 f31704a = new C3();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f31706c = new Object();

    static {
        try {
            f31705b = new B3(C2925od.d()).getWritableDatabase();
        } catch (Exception unused) {
        }
    }

    public static final int a(String tableName, ContentValues contentValues, String str, String[] strArr) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        synchronized (f31706c) {
            long jA = a(tableName, contentValues);
            if (jA == -1) {
                return b(tableName, contentValues, str, strArr);
            }
            return (int) jA;
        }
    }

    public static final int b(String tableName, ContentValues contentValues, String str, String[] strArr) {
        int iUpdateWithOnConflict;
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        synchronized (f31706c) {
            try {
                SQLiteDatabase sQLiteDatabase = f31705b;
                if (sQLiteDatabase != null) {
                    iUpdateWithOnConflict = sQLiteDatabase.updateWithOnConflict(tableName, contentValues, str, strArr, 4);
                } else {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("C3", "TAG");
                    iUpdateWithOnConflict = -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iUpdateWithOnConflict;
    }

    public static final long a(String tableName, ContentValues contentValues) {
        long jInsertWithOnConflict;
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        synchronized (f31706c) {
            try {
                SQLiteDatabase sQLiteDatabase = f31705b;
                if (sQLiteDatabase != null) {
                    jInsertWithOnConflict = sQLiteDatabase.insertWithOnConflict(tableName, null, contentValues, 4);
                } else {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("C3", "TAG");
                    jInsertWithOnConflict = -1;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jInsertWithOnConflict;
    }

    public static final List<ContentValues> b(String tableName, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        Cursor cursorQuery;
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        synchronized (f31706c) {
            SQLiteDatabase sQLiteDatabase = f31705b;
            cursorQuery = sQLiteDatabase != null ? sQLiteDatabase.query(tableName, strArr, str, strArr2, str2, str3, str4, str5) : null;
        }
        if (cursorQuery != null) {
            try {
                ArrayList arrayList = new ArrayList();
                if (cursorQuery.moveToFirst()) {
                    do {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorQuery, contentValues);
                        arrayList.add(contentValues);
                    } while (cursorQuery.moveToNext());
                }
                gv.d.closeFinally(cursorQuery, null);
                return arrayList;
            } finally {
            }
        } else {
            return uu.p0.emptyList();
        }
    }

    public static final int a(String tableName, String str, String[] strArr) {
        int iDelete;
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        synchronized (f31706c) {
            try {
                SQLiteDatabase sQLiteDatabase = f31705b;
                if (sQLiteDatabase != null) {
                    iDelete = sQLiteDatabase.delete(tableName, str, strArr);
                } else {
                    kotlin.jvm.internal.e0.checkNotNullExpressionValue("C3", "TAG");
                    iDelete = 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iDelete;
    }

    public static final void a(String tableName) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        String str = "DROP TABLE IF EXISTS \"" + tableName + AbstractJsonLexerKt.STRING;
        synchronized (f31706c) {
            SQLiteDatabase sQLiteDatabase = f31705b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    public final void a(String tableName, String tableSchema) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        kotlin.jvm.internal.e0.checkNotNullParameter(tableSchema, "tableSchema");
        String str = "CREATE TABLE IF NOT EXISTS " + tableName + tableSchema + ';';
        synchronized (f31706c) {
            SQLiteDatabase sQLiteDatabase = f31705b;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    public static final int a(String tableName, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5) {
        Cursor cursorQuery;
        int columnIndex;
        kotlin.jvm.internal.e0.checkNotNullParameter(tableName, "tableName");
        synchronized (f31706c) {
            SQLiteDatabase sQLiteDatabase = f31705b;
            cursorQuery = sQLiteDatabase != null ? sQLiteDatabase.query(tableName, new String[]{"COUNT(*) AS count"}, str, strArr2, str2, str3, str4, str5) : null;
        }
        int i10 = 0;
        try {
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst() && (columnIndex = cursorQuery.getColumnIndex("count")) >= 0) {
                        i10 = cursorQuery.getInt(columnIndex);
                    }
                    gv.d.closeFinally(cursorQuery, null);
                    return i10;
                } finally {
                }
            }
        } catch (Exception unused) {
        }
        return i10;
    }
}

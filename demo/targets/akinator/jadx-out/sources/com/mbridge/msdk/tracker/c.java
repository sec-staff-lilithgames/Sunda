package com.mbridge.msdk.tracker;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f43884a;

    /* renamed from: b, reason: collision with root package name */
    private final String f43885b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f43886c = new Object();

    public c(b bVar, String str) {
        this.f43884a = bVar;
        this.f43885b = str;
    }

    private static boolean c(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase == null || !sQLiteDatabase.isOpen() || sQLiteDatabase.isReadOnly();
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.setTransactionSuccessful();
        } catch (Exception e10) {
            if (a.f43882a) {
                Log.e("TrackManager", "transactionSuccess: ", e10);
            }
        }
    }

    public long a(i iVar) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f43886c) {
            long jInsert = -1;
            if (y.b(this.f43884a)) {
                return -1L;
            }
            try {
                writableDatabase = this.f43884a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "insert getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return -1L;
            }
            try {
                try {
                    a(writableDatabase);
                    ContentValues contentValues = new ContentValues(16);
                    e eVarA = iVar.a();
                    contentValues.put("name", eVarA.b());
                    contentValues.put("type", Integer.valueOf(eVarA.h()));
                    contentValues.put("time_stamp", Long.valueOf(eVarA.g()));
                    contentValues.put("properties", eVarA.d().toString());
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(eVarA.c()));
                    contentValues.put("state", Integer.valueOf(iVar.e()));
                    contentValues.put("report_count", Integer.valueOf(iVar.c()));
                    contentValues.put("uuid", eVarA.i());
                    contentValues.put("ignore_max_timeout", Integer.valueOf(!eVarA.k() ? 1 : 0));
                    contentValues.put("ignore_max_retry_times", Integer.valueOf(!eVarA.j() ? 1 : 0));
                    contentValues.put("invalid_time", Long.valueOf(iVar.b()));
                    jInsert = writableDatabase.insert(this.f43885b, null, contentValues);
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f43882a) {
                        Log.e("TrackManager", "insert: " + e11.getMessage());
                    }
                }
                return jInsert;
            } finally {
                b(writableDatabase);
            }
        }
    }

    public int b() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f43886c) {
            int iMax = 0;
            if (y.b(this.f43884a)) {
                return 0;
            }
            Cursor cursorQuery = null;
            try {
                writableDatabase = this.f43884a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "getAvailableCount getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return 0;
            }
            try {
                try {
                    a(writableDatabase);
                    cursorQuery = writableDatabase.query(this.f43885b, null, "state = ? OR state = ?", new String[]{String.valueOf(3), String.valueOf(0)}, null, null, null, null);
                    if (cursorQuery != null && cursorQuery.moveToNext()) {
                        iMax = Math.max(cursorQuery.getCount(), 0);
                    }
                    d(writableDatabase);
                    b(writableDatabase);
                    y.a(cursorQuery);
                } catch (Exception e11) {
                    if (a.f43882a) {
                        Log.e("TrackManager", "getAvailableCount: " + e11.getMessage());
                    }
                    b(writableDatabase);
                    y.a(cursorQuery);
                }
                return iMax;
            } catch (Throwable th2) {
                b(writableDatabase);
                y.a(cursorQuery);
                throw th2;
            }
        }
    }

    public void c(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f43886c) {
            if (y.b(this.f43884a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f43884a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "updateReportStateSuccess getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                try {
                    a(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 2);
                        writableDatabase.update(this.f43885b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f43882a) {
                        Log.e("TrackManager", "updateReportStateSuccess: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    public void c() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f43886c) {
            if (y.b(this.f43884a)) {
                return;
            }
            try {
                writableDatabase = this.f43884a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "updateReportStateForReporting getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return;
            }
            try {
                try {
                    a(writableDatabase);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("state", (Integer) 3);
                    contentValues.put("report_error_message", "update from reporting");
                    writableDatabase.update(this.f43885b, contentValues, "state = ?", new String[]{String.valueOf(1)});
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f43882a) {
                        Log.e("TrackManager", "updateReportStateForReporting: " + e11.getMessage());
                    }
                }
            } finally {
                b(writableDatabase);
            }
        }
    }

    public void b(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f43886c) {
            if (y.b(this.f43884a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f43884a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "updateReportStateReporting getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                try {
                    a(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", (Integer) 1);
                        writableDatabase.update(this.f43885b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f43882a) {
                        Log.e("TrackManager", "updateReportStateReporting: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    public List<i> a(int i10) {
        SQLiteDatabase writableDatabase;
        List<i> list;
        Cursor cursorQuery;
        synchronized (this.f43886c) {
            Cursor cursor = null;
            List<i> listB = null;
            cursor = null;
            if (y.b(this.f43884a)) {
                return null;
            }
            try {
                writableDatabase = this.f43884a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "getAvailable getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return null;
            }
            try {
                try {
                    a(writableDatabase);
                    cursorQuery = writableDatabase.query(this.f43885b, null, "state = ? OR state = ?", new String[]{String.valueOf(0), String.valueOf(3)}, null, null, "priority DESC", String.valueOf(i10));
                } catch (Exception e11) {
                    e = e11;
                    list = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                listB = y.b(cursorQuery);
                d(writableDatabase);
                b(writableDatabase);
                y.a(cursorQuery);
            } catch (Exception e12) {
                e = e12;
                List<i> list2 = listB;
                cursor = cursorQuery;
                list = list2;
                if (a.f43882a) {
                    Log.e("TrackManager", "getAvailable: " + e.getMessage());
                }
                b(writableDatabase);
                y.a(cursor);
                listB = list;
                return listB;
            } catch (Throwable th3) {
                th = th3;
                cursor = cursorQuery;
                b(writableDatabase);
                y.a(cursor);
                throw th;
            }
            return listB;
        }
    }

    private static void b(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase) || !sQLiteDatabase.inTransaction()) {
            return;
        }
        try {
            sQLiteDatabase.endTransaction();
        } catch (Exception e10) {
            if (a.f43882a) {
                Log.e("TrackManager", "endTransaction: ", e10);
            }
        }
    }

    public void a(List<i> list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f43886c) {
            if (y.b(this.f43884a) || y.b((List<?>) list)) {
                return;
            }
            try {
                writableDatabase = this.f43884a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "updateReportStateFailed getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            try {
                if (c(writableDatabase)) {
                    return;
                }
                try {
                    a(writableDatabase);
                    for (i iVar : list) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("state", Integer.valueOf(iVar.e()));
                        contentValues.put("report_count", Integer.valueOf(iVar.c()));
                        String strD = iVar.d();
                        if (!TextUtils.isEmpty(strD)) {
                            contentValues.put("report_error_message", strD);
                        }
                        writableDatabase.update(this.f43885b, contentValues, "uuid = ?", new String[]{iVar.f()});
                    }
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f43882a) {
                        Log.e("TrackManager", "updateReportStateFailed: " + e11.getMessage());
                    }
                    b(writableDatabase);
                }
            } catch (Throwable th2) {
                b(writableDatabase);
                throw th2;
            }
        }
    }

    public int a() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f43886c) {
            int iDelete = -1;
            if (y.b(this.f43884a)) {
                return -1;
            }
            try {
                writableDatabase = this.f43884a.getWritableDatabase();
            } catch (Exception e10) {
                if (a.f43882a) {
                    Log.e("TrackManager", "deleteInvalidEvents getWritableDatabase: " + e10.getMessage());
                }
                writableDatabase = null;
            }
            if (c(writableDatabase)) {
                return -1;
            }
            try {
                try {
                    a(writableDatabase);
                    iDelete = writableDatabase.delete(this.f43885b, "state = ? OR state = ?", new String[]{String.valueOf(-1), String.valueOf(2)});
                    d(writableDatabase);
                    b(writableDatabase);
                } catch (Exception e11) {
                    if (a.f43882a) {
                        Log.e("TrackManager", "deleteInvalidEvents: " + e11.getMessage());
                    }
                }
                return iDelete;
            } finally {
                b(writableDatabase);
            }
        }
    }

    private static void a(SQLiteDatabase sQLiteDatabase) {
        if (y.b(sQLiteDatabase)) {
            return;
        }
        try {
            sQLiteDatabase.beginTransaction();
        } catch (Exception e10) {
            if (a.f43882a) {
                Log.e("TrackManager", "beginTransaction: ", e10);
            }
        }
    }
}

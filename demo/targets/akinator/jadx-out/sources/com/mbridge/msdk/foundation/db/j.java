package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class j extends a<com.mbridge.msdk.foundation.entity.g> {

    /* renamed from: a, reason: collision with root package name */
    private static j f40474a;

    private j(f fVar) {
        super(fVar);
    }

    public static j a(f fVar) {
        if (f40474a == null) {
            synchronized (j.class) {
                try {
                    if (f40474a == null) {
                        f40474a = new j(fVar);
                    }
                } finally {
                }
            }
        }
        return f40474a;
    }

    public synchronized void b(String str) {
        com.mbridge.msdk.foundation.db.middle.a.b().a(str);
        if (a(str) && getReadableDatabase() != null) {
            getReadableDatabase().execSQL("UPDATE frequence Set impression_count=impression_count+1 WHERE id= ?", new Object[]{str});
        }
    }

    public synchronized void b(com.mbridge.msdk.foundation.entity.g gVar) {
        if (!a(gVar.a())) {
            a(gVar);
        }
    }

    public synchronized void a() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - 86400000;
            com.mbridge.msdk.foundation.db.middle.a.b().a(jCurrentTimeMillis);
            String[] strArr = {String.valueOf(jCurrentTimeMillis)};
            if (getWritableDatabase() != null) {
                getWritableDatabase().delete("frequence", "ts< ? ", strArr);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Finally extract failed */
    public synchronized boolean a(String str) {
        Cursor cursor = null;
        try {
            try {
                synchronized (str) {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM frequence WHERE id= ?", new String[]{str});
                    if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                        cursorRawQuery.close();
                        return true;
                    }
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return false;
                }
            } catch (Exception unused) {
                if (0 != 0) {
                    cursor.close();
                }
                return false;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    private synchronized long a(com.mbridge.msdk.foundation.entity.g gVar) {
        try {
            com.mbridge.msdk.foundation.db.middle.a.b().a(gVar);
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", gVar.a());
            contentValues.put("fc_a", Integer.valueOf(gVar.c()));
            contentValues.put("fc_b", Integer.valueOf(gVar.d()));
            contentValues.put("ts", Long.valueOf(gVar.f()));
            contentValues.put("impression_count", Integer.valueOf(gVar.e()));
            contentValues.put("click_count", Integer.valueOf(gVar.b()));
            contentValues.put("ts", Long.valueOf(gVar.f()));
            if (getWritableDatabase() == null) {
                return -1L;
            }
            return getWritableDatabase().insert("frequence", null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }
}

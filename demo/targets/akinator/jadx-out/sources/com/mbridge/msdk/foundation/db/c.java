package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class c extends a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f40444a;

    private c(f fVar) {
        super(fVar);
    }

    public static c a(f fVar) {
        if (f40444a == null) {
            synchronized (c.class) {
                try {
                    if (f40444a == null) {
                        f40444a = new c(fVar);
                    }
                } finally {
                }
            }
        }
        return f40444a;
    }

    public void b(String str, String str2, String str3) {
        if (a(str, str3)) {
            try {
                getWritableDatabase().execSQL("UPDATE CacheCampaign SET show_count = show_count + 1, show_time = ? WHERE rid = ? AND unitid = ? AND state = ?", new Object[]{Long.valueOf(System.currentTimeMillis()), str, str3, "1"});
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public long a(String str, String str2, String str3, int i10) {
        if (!a(str, str3)) {
            return -1L;
        }
        new ContentValues().put("state", Integer.valueOf(i10));
        return getWritableDatabase().update("CacheCampaign", r3, "rid= ? AND unitid = ? AND state = 0", new String[]{str, str3});
    }

    public synchronized boolean a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT rid FROM CacheCampaign WHERE rid= ? AND unitid = ? ", new String[]{str, str2});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused) {
            }
            return true;
        }
        if (cursorRawQuery != null) {
            try {
                cursorRawQuery.close();
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    public synchronized void a(String str, int i10) {
        String str2;
        SQLiteDatabase writableDatabase;
        if (i10 <= 0) {
            i10 = 1;
        }
        try {
            str2 = "unitid = ? AND ( (ts + interval_ts) < " + System.currentTimeMillis() + " OR show_count >= ?)";
            writableDatabase = getWritableDatabase();
        } catch (Exception e10) {
            p0.b("CacheCampaignDao", e10.getLocalizedMessage());
        }
        if (writableDatabase == null) {
            return;
        }
        try {
            writableDatabase.delete("CacheCampaign", str2, new String[]{str, String.valueOf(i10)});
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public synchronized void a(String str, String str2, String str3) {
        try {
        } catch (Exception e10) {
            p0.b("CampaignDao", e10.getLocalizedMessage());
        }
        if (a(str2, str)) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (writableDatabase == null) {
                return;
            }
            try {
                writableDatabase.delete("CacheCampaign", "unitid = ? AND rid = ? ", new String[]{str, str2});
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            return;
        }
        return;
    }

    public long a(List<CampaignEx> list, String str) {
        CampaignEx campaignEx;
        if (list != null) {
            try {
                if (list.size() == 0 || TextUtils.isEmpty(str) || (campaignEx = list.get(0)) == null) {
                    return 0L;
                }
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("rid", campaignEx.getRequestId());
                contentValues.put("lrid", campaignEx.getLocalRequestId());
                contentValues.put("unitid", str);
                JSONArray jSONArray = new JSONArray();
                Iterator<CampaignEx> it = list.iterator();
                while (it.hasNext()) {
                    jSONArray.put(CampaignEx.campaignToJsonObject(it.next()));
                }
                contentValues.put("campaigns", jSONArray.toString());
                contentValues.put("ts", Long.valueOf(campaignEx.getTimestamp()));
                long candidateCacheTime = campaignEx.getCandidateCacheTime();
                if (candidateCacheTime == 0) {
                    candidateCacheTime = campaignEx.getPlctb();
                    if (candidateCacheTime == 0) {
                        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
                        if (gVarD == null) {
                            gVarD = com.mbridge.msdk.setting.h.b().a();
                        }
                        candidateCacheTime = gVarD.a0();
                    }
                }
                try {
                    if (r0.a().a("c_e_t", false)) {
                        candidateCacheTime *= 24;
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                contentValues.put("interval_ts", Long.valueOf(candidateCacheTime * 1000));
                contentValues.put("ecppv", campaignEx.getEcppv());
                contentValues.put("show_count", Integer.valueOf(campaignEx.getShowCount()));
                contentValues.put("state", (Integer) 0);
                if (a(campaignEx.getRequestId(), str)) {
                    return getWritableDatabase().update("CacheCampaign", contentValues, "rid= ? AND lrid= ? AND unitid = ? AND state = 1", new String[]{campaignEx.getRequestId(), campaignEx.getLocalRequestId(), str});
                }
                return getWritableDatabase().insert("CacheCampaign", null, contentValues);
            } catch (Exception e11) {
                e11.printStackTrace();
                return -1L;
            }
        }
        return 0L;
    }

    public List<com.mbridge.msdk.foundation.cache.b> a(String str, long j10) {
        return a(str, 0, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f8 A[EXC_TOP_SPLITTER, PHI: r5
      0x00f8: PHI (r5v4 android.database.Cursor) = (r5v3 android.database.Cursor), (r5v5 android.database.Cursor) binds: [B:32:0x00f6, B:27:0x00ee] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.mbridge.msdk.foundation.cache.b> a(java.lang.String r5, int r6, long r7) {
        /*
            r4 = this;
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String[] r5 = new java.lang.String[]{r5, r6, r7}
            java.lang.String r6 = "SELECT * FROM CacheCampaign WHERE unitid = ? AND state > ? and (show_time is null or show_time < ? )"
            r7 = 0
            android.database.sqlite.SQLiteDatabase r8 = r4.getReadableDatabase()     // Catch: java.lang.Throwable -> Lf1
            android.database.Cursor r5 = r8.rawQuery(r6, r5)     // Catch: java.lang.Throwable -> Lf1
            if (r5 == 0) goto Lee
            int r6 = r5.getCount()     // Catch: java.lang.Throwable -> L6a
            if (r6 <= 0) goto Lee
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            r6.<init>()     // Catch: java.lang.Throwable -> L6a
        L24:
            boolean r8 = r5.moveToNext()     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto Lea
            com.mbridge.msdk.foundation.cache.b r8 = new com.mbridge.msdk.foundation.cache.b     // Catch: java.lang.Throwable -> L6a
            r8.<init>()     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "campaigns"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L6a
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 == 0) goto L48
            r5.close()     // Catch: java.lang.Exception -> L47
        L47:
            return r7
        L48:
            int r0 = r1.length()     // Catch: java.lang.Throwable -> L6a
            if (r0 <= 0) goto L70
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            r2 = 0
        L54:
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L6a
            if (r2 >= r3) goto L6d
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L6a
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch: java.lang.Throwable -> L6a
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = com.mbridge.msdk.foundation.entity.CampaignEx.parseCampaignWithBackData(r3)     // Catch: java.lang.Throwable -> L6a
            r0.add(r3)     // Catch: java.lang.Throwable -> L6a
            int r2 = r2 + 1
            goto L54
        L6a:
            r6 = move-exception
            goto Lf3
        L6d:
            r8.a(r0)     // Catch: java.lang.Throwable -> L6a
        L70:
            java.lang.String r0 = "lrid"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            r8.b(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "rid"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            r8.c(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "unitid"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            r8.d(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "ecppv"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = r5.getString(r0)     // Catch: java.lang.Throwable -> L6a
            r8.a(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "ts"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            long r0 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L6a
            r8.c(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "state"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            int r0 = r5.getInt(r0)     // Catch: java.lang.Throwable -> L6a
            r8.b(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "show_count"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            int r0 = r5.getInt(r0)     // Catch: java.lang.Throwable -> L6a
            r8.a(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "show_time"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            long r0 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L6a
            r8.b(r0)     // Catch: java.lang.Throwable -> L6a
            java.lang.String r0 = "interval_ts"
            int r0 = r5.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L6a
            long r0 = r5.getLong(r0)     // Catch: java.lang.Throwable -> L6a
            r8.a(r0)     // Catch: java.lang.Throwable -> L6a
            r6.add(r8)     // Catch: java.lang.Throwable -> L6a
            goto L24
        Lea:
            r5.close()     // Catch: java.lang.Exception -> Led
        Led:
            return r6
        Lee:
            if (r5 == 0) goto Lfb
            goto Lf8
        Lf1:
            r6 = move-exception
            r5 = r7
        Lf3:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> Lfc
            if (r5 == 0) goto Lfb
        Lf8:
            r5.close()     // Catch: java.lang.Exception -> Lfb
        Lfb:
            return r7
        Lfc:
            r6 = move-exception
            if (r5 == 0) goto L102
            r5.close()     // Catch: java.lang.Exception -> L102
        L102:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.c.a(java.lang.String, int, long):java.util.List");
    }
}

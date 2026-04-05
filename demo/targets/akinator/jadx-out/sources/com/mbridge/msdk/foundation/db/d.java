package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d extends a<JumpLoaderResult> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f40445a = "d";

    /* renamed from: b, reason: collision with root package name */
    private static d f40446b;

    private d(f fVar) {
        super(fVar);
    }

    public static synchronized d a(f fVar) {
        try {
            if (f40446b == null) {
                f40446b = new d(fVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40446b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0062 A[Catch: all -> 0x0040, PHI: r12
      0x0062: PHI (r12v4 android.database.Cursor) = (r12v3 android.database.Cursor), (r12v5 android.database.Cursor) binds: [B:31:0x0060, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:13:0x003b, B:32:0x0062, B:36:0x0069, B:37:0x006c), top: B:40:0x0002 }] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized com.mbridge.msdk.click.entity.JumpLoaderResult b(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            monitor-enter(r11)
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r11.getReadableDatabase()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            java.lang.String r3 = "campaignclick"
            java.lang.String r5 = "id=? AND unitid=?"
            java.lang.String[] r6 = new java.lang.String[]{r12, r13}     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            r9 = 0
            r10 = 0
            r4 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L50
            if (r12 == 0) goto L4a
            int r13 = r12.getCount()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r13 <= 0) goto L4a
            boolean r13 = r12.moveToFirst()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r13 == 0) goto L4a
            java.lang.String r13 = "result"
            int r13 = r12.getColumnIndex(r13)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            java.lang.String r13 = r12.getString(r13)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            boolean r0 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            if (r0 != 0) goto L4a
            java.lang.Object r13 = com.mbridge.msdk.foundation.tools.v0.a(r13)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            com.mbridge.msdk.click.entity.JumpLoaderResult r13 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r13     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L47
            r12.close()     // Catch: java.lang.Throwable -> L40
            monitor-exit(r11)
            return r13
        L40:
            r0 = move-exception
            r12 = r0
            goto L6d
        L43:
            r0 = move-exception
            r13 = r0
            r1 = r12
            goto L67
        L47:
            r0 = move-exception
            r13 = r0
            goto L53
        L4a:
            if (r12 == 0) goto L65
            goto L62
        L4d:
            r0 = move-exception
            r13 = r0
            goto L67
        L50:
            r0 = move-exception
            r13 = r0
            r12 = r1
        L53:
            boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L60
            java.lang.String r0 = com.mbridge.msdk.foundation.db.d.f40445a     // Catch: java.lang.Throwable -> L43
            java.lang.String r13 = r13.getMessage()     // Catch: java.lang.Throwable -> L43
            com.mbridge.msdk.foundation.tools.p0.b(r0, r13)     // Catch: java.lang.Throwable -> L43
        L60:
            if (r12 == 0) goto L65
        L62:
            r12.close()     // Catch: java.lang.Throwable -> L40
        L65:
            monitor-exit(r11)
            return r1
        L67:
            if (r1 == 0) goto L6c
            r1.close()     // Catch: java.lang.Throwable -> L40
        L6c:
            throw r13     // Catch: java.lang.Throwable -> L40
        L6d:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L40
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.d.b(java.lang.String, java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public synchronized boolean c(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ? AND cti + ts > " + System.currentTimeMillis(), new String[]{str, str2});
            if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
                cursorRawQuery.close();
                return true;
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return false;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b(f40445a, e10.getMessage());
            }
            return false;
        }
    }

    public synchronized void a() {
        try {
            getWritableDatabase().delete("campaignclick", " ( " + System.currentTimeMillis() + " - ts) > cti", null);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b(f40445a, e10.getMessage());
            }
        }
    }

    public synchronized long a(CampaignEx campaignEx, String str) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                String strA = v0.a(campaignEx.getJumpResult());
                ContentValues contentValues = new ContentValues();
                contentValues.put("id", campaignEx.getId());
                contentValues.put("unitid", str);
                contentValues.put("result", strA);
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval() * 1000));
                contentValues.put("package_name", campaignEx.getPackageName());
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
                contentValues.put("ts", Long.valueOf(System.currentTimeMillis()));
                if (gVarD != null && gVarD.X() > 0) {
                    contentValues.put("cpei", Integer.valueOf(gVarD.X() * 1000));
                }
                if (gVarD != null && gVarD.Y() > 0) {
                    contentValues.put("cpoci", Integer.valueOf(gVarD.Y() * 1000));
                }
                if (a(campaignEx.getId(), str)) {
                    if (getWritableDatabase() == null) {
                        return -1L;
                    }
                    return getWritableDatabase().update("campaignclick", contentValues, "id = ? AND unitid = ? ", new String[]{campaignEx.getId(), str});
                }
                return getWritableDatabase().insert("campaignclick", null, contentValues);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b(f40445a, e10.getMessage());
                }
                return -1L;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean a(String str, String str2) {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT id FROM campaignclick WHERE id= ? AND unitid= ?", new String[]{str, str2});
        if (cursorRawQuery != null && cursorRawQuery.getCount() > 0) {
            cursorRawQuery.close();
            return true;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return false;
    }
}

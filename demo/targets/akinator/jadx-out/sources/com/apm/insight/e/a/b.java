package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import bp.oM.DwaEpyvxz;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class b extends a<com.apm.insight.d.a> {
    public b() {
        super("duplicatelog");
    }

    @Override // com.apm.insight.e.a.a
    public final /* synthetic */ ContentValues a(com.apm.insight.d.a aVar) {
        com.apm.insight.d.a aVar2 = aVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar2.f12949a);
        contentValues.put("insert_time", Long.valueOf(aVar2.f12950b));
        return contentValues;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.database.sqlite.SQLiteDatabase r11, java.lang.String r12) {
        /*
            r10 = this;
            r1 = 0
            if (r11 == 0) goto L30
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto La
            goto L30
        La:
            java.lang.String r3 = r10.f12981a     // Catch: java.lang.Throwable -> L26
            java.lang.String r5 = "path=?"
            java.lang.String[] r6 = new java.lang.String[]{r12}     // Catch: java.lang.Throwable -> L26
            r8 = 0
            r9 = 0
            r4 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L26
            int r12 = r11.getCount()     // Catch: java.lang.Throwable -> L26
            r11.close()     // Catch: java.lang.Throwable -> L23
            goto L2c
        L23:
            r0 = move-exception
            r11 = r0
            goto L29
        L26:
            r0 = move-exception
            r11 = r0
            r12 = r1
        L29:
            com.apm.insight.a.b(r11)
        L2c:
            if (r12 <= 0) goto L30
            r11 = 1
            return r11
        L30:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.e.a.b.a(android.database.sqlite.SQLiteDatabase, java.lang.String):boolean");
    }

    @Override // com.apm.insight.e.a.a
    public final void a(SQLiteDatabase sQLiteDatabase, com.apm.insight.d.a aVar) throws SQLException {
        if (aVar == null || a(sQLiteDatabase, aVar.f12949a)) {
            return;
        }
        super.a(sQLiteDatabase, (SQLiteDatabase) aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f12981a + " where _id in (select _id from " + this.f12981a + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e10) {
            com.apm.insight.a.b((Throwable) e10);
        }
    }

    @Override // com.apm.insight.e.a.a
    public final HashMap<String, String> a() {
        HashMap<String, String> map = new HashMap<>();
        map.put(DwaEpyvxz.aOeNaYupm, "TEXT");
        map.put("insert_time", "INTEGER");
        map.put(IronSourceConstants.EVENTS_EXT1, "TEXT");
        map.put("ext2", "TEXT");
        return map;
    }
}

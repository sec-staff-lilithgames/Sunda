package com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo;

import a.b;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.sdk.component.jj.jpo.xyk;
import com.google.android.gms.internal.play_billing.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk extends wqx {
    protected List<String> jpo;
    private com.bytedance.sdk.component.jj.jpo.cm.jd.jpo wqx;

    public qk(Context context, com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar) {
        super(context);
        this.jpo = new ArrayList();
        this.wqx = jpoVar;
        if (jpoVar == null) {
            this.wqx = com.bytedance.sdk.component.jj.jpo.cm.jd.jpo.wqx();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0023 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0023: PHI (r0v2 int) = (r0v0 int), (r0v6 int) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0023: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v4 android.database.Cursor) binds: [B:10:0x0028, B:6:0x0021] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int cm() {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.my()     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = r9.jd()     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "count(1)"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> L27
            r7 = 0
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r1 = com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L27
            if (r1 == 0) goto L21
            r1.moveToFirst()     // Catch: java.lang.Throwable -> L28
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L28
        L21:
            if (r1 == 0) goto L2b
        L23:
            r1.close()     // Catch: java.lang.Exception -> L2b
            goto L2b
        L27:
            r1 = 0
        L28:
            if (r1 == 0) goto L2b
            goto L23
        L2b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.qk.cm():int");
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.wqx
    public String jd() {
        return xyk.qk().cm().cm();
    }

    @Override // com.bytedance.sdk.component.jj.jpo.jpo.jpo.jpo.wqx
    public long jj() {
        return com.bytedance.sdk.component.jj.jpo.qk.jpo.jd();
    }

    public byte jpo() {
        return (byte) 1;
    }

    public byte wqx() {
        return (byte) 2;
    }

    public static String wqx(String str) {
        return b.l("CREATE TABLE IF NOT EXISTS ", str, " (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0 , encrypt INTEGER default 0)");
    }

    public List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jd(String str) {
        com.bytedance.sdk.component.jj.jpo.cm.jd.jpo jpoVar = this.wqx;
        return jpoVar == null ? new ArrayList() : jpo(jpoVar.jd(), str);
    }

    public List<com.bytedance.sdk.component.jj.jpo.cm.jpo> jpo(int i10, String str) {
        long jJpo = com.bytedance.sdk.component.jj.jpo.jd.jpo.jpo(i10, my());
        if (jJpo <= 0) {
            jJpo = 1;
        } else if (jJpo > 100) {
            jJpo = 100;
        }
        ArrayList arrayList = new ArrayList();
        this.jpo.clear();
        Cursor cursorJpo = com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), jd(), new String[]{"id", "value", "encrypt"}, null, null, null, null, str + " DESC limit " + jJpo);
        if (cursorJpo != null) {
            while (cursorJpo.moveToNext()) {
                try {
                    try {
                        String string = cursorJpo.getString(cursorJpo.getColumnIndex("id"));
                        String string2 = cursorJpo.getString(cursorJpo.getColumnIndex("value"));
                        if (cursorJpo.getInt(cursorJpo.getColumnIndex("encrypt")) == 1) {
                            string2 = xyk.qk().hna().jpo(string2);
                        }
                        if (TextUtils.isEmpty(string2)) {
                            this.jpo.add(string);
                        } else {
                            if (arrayList.size() > 100) {
                                break;
                            }
                            com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo jpoVar = new com.bytedance.sdk.component.jj.jpo.cm.jpo.jpo(string, new JSONObject(string2));
                            jpoVar.jd(wqx());
                            jpoVar.jpo(jpo());
                            arrayList.add(jpoVar);
                        }
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
            try {
                cursorJpo.close();
                if (!this.jpo.isEmpty()) {
                    jpo(this.jpo);
                    this.jpo.clear();
                }
            } catch (Exception unused2) {
            }
        }
        return arrayList;
    }

    public void jd(List<com.bytedance.sdk.component.jj.jpo.cm.jpo> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        for (com.bytedance.sdk.component.jj.jpo.cm.jpo jpoVar : list) {
            linkedList.add(jpoVar.wqx());
            com.bytedance.sdk.component.jj.jpo.wqx.jpo.yd(jpoVar);
        }
        jd();
        linkedList.size();
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), "DELETE FROM " + jd() + " WHERE " + jpo("id", linkedList, 1000, true));
        wqx(linkedList);
    }

    private void jd(int i10, long j10) {
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), jd(), "gen_time <? AND retry >?", new String[]{String.valueOf(System.currentTimeMillis() - j10), String.valueOf(i10)});
    }

    public void jpo(List<String> list) {
        jd();
        list.size();
        com.bytedance.sdk.component.jj.jpo.jpo.jpo.wqx.jpo(my(), "DELETE FROM " + jd() + " WHERE " + jpo("id", list, 1000, true));
        com.bytedance.sdk.component.jj.jpo.wqx.jd.jpo(com.bytedance.sdk.component.jj.jpo.jd.cm.f18630cm.cgn(), list.size());
        wqx(list);
    }

    public void jpo(int i10, long j10) {
        jd(i10, j10);
    }

    public boolean jpo(int i10) {
        return this.wqx != null && cm() >= this.wqx.jpo();
    }

    private static String jpo(String str, List<?> list, int i10, boolean z10) {
        int i11;
        String str2 = z10 ? " IN " : " NOT IN ";
        String str3 = z10 ? " OR " : " AND ";
        int iMin = Math.min(i10, 1000);
        int size = list.size();
        if (size % iMin == 0) {
            i11 = size / iMin;
        } else {
            i11 = (size / iMin) + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * iMin;
            String strJpo = jpo(TextUtils.join("','", list.subList(i13, Math.min(i13 + iMin, size))), "");
            if (i12 != 0) {
                sb2.append(str3);
            }
            a.B(sb2, str, str2, "('", strJpo);
            sb2.append("')");
        }
        return jpo(sb2.toString(), i.d(str, str2, "('')"));
    }

    private static String jpo(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }
}

package com.bytedance.sdk.openadsdk.sq;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.amazon.device.ads.DTBMetricReport;
import com.bytedance.sdk.openadsdk.BusMonitorDependWrapper;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: jj, reason: collision with root package name */
    private static final long f21478jj = System.currentTimeMillis();
    public static final long jpo = com.bytedance.sdk.openadsdk.sq.cm.jpo.jpo();
    private static Context my;

    /* renamed from: cm, reason: collision with root package name */
    private Boolean f21479cm;

    /* renamed from: jd, reason: collision with root package name */
    private jd f21480jd;
    private com.bytedance.sdk.openadsdk.sq.wqx.jpo wqx;

    /* renamed from: qk, reason: collision with root package name */
    private int f21481qk = 0;
    private final ArrayList<cm> xyk = new ArrayList<>();
    private Runnable zz = new Runnable() { // from class: com.bytedance.sdk.openadsdk.sq.jpo.2
        @Override // java.lang.Runnable
        public void run() {
            jpo jpoVar = jpo.this;
            jpoVar.f21479cm = Boolean.valueOf(jpoVar.f21480jd.isMonitorOpen());
            if (jpo.this.f21479cm.booleanValue()) {
                jpo jpoVar2 = jpo.this;
                jpoVar2.jpo(jpoVar2.xyk);
                jpo.this.xyk.clear();
            }
        }
    };

    /* renamed from: yd, reason: collision with root package name */
    private Runnable f21482yd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.sq.jpo.4
        @Override // java.lang.Runnable
        public void run() {
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            String str6 = "extra";
            String str7 = "is_init";
            String str8 = DTBMetricReport.ADSERVER;
            try {
                SQLiteDatabase sQLiteDatabaseJd = com.bytedance.sdk.openadsdk.sq.jpo.jpo.jd();
                if (sQLiteDatabaseJd != null) {
                    String[] strArr = {"_id", "sdk_version", "scene", "start_count", "success_count", "fail_count", "rit", "tag", "label", "timestamp", DTBMetricReport.ADSERVER, "is_init", "extra"};
                    try {
                        String[] strArr2 = {String.valueOf(jpo.this.f21480jd.getOnceLogInterval() < 86400000 ? jpo.f21478jj : jpo.jpo)};
                        int iMax = Math.max(10, jpo.this.f21480jd.getOnceLogCount());
                        if (iMax > 100) {
                            iMax = 10;
                        }
                        Cursor cursorQuery = sQLiteDatabaseJd.query("monitor_table", strArr, "timestamp < ?", strArr2, null, null, null, String.valueOf(iMax));
                        if (cursorQuery != null) {
                            int i10 = iMax;
                            ArrayList arrayList = new ArrayList();
                            try {
                                ArrayList arrayList2 = new ArrayList();
                                while (cursorQuery.moveToNext()) {
                                    ArrayList arrayList3 = arrayList;
                                    com.bytedance.sdk.openadsdk.sq.jd.jpo jpoVar = new com.bytedance.sdk.openadsdk.sq.jd.jpo();
                                    if (cursorQuery.getColumnIndex("_id") >= 0) {
                                        str2 = str6;
                                        str3 = str7;
                                        str4 = str8;
                                        long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                                        jpoVar.jpo(j10);
                                        arrayList2.add(String.valueOf(j10));
                                    } else {
                                        str2 = str6;
                                        str3 = str7;
                                        str4 = str8;
                                    }
                                    if (cursorQuery.getColumnIndex("sdk_version") >= 0) {
                                        jpoVar.jpo(cursorQuery.getString(cursorQuery.getColumnIndex("sdk_version")));
                                    }
                                    if (cursorQuery.getColumnIndex("scene") >= 0) {
                                        jpoVar.jd(cursorQuery.getString(cursorQuery.getColumnIndex("scene")));
                                    }
                                    if (cursorQuery.getColumnIndex("start_count") >= 0) {
                                        jpoVar.jpo(cursorQuery.getInt(cursorQuery.getColumnIndex("start_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("success_count") >= 0) {
                                        jpoVar.jd(cursorQuery.getInt(cursorQuery.getColumnIndex("success_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("fail_count") >= 0) {
                                        jpoVar.wqx(cursorQuery.getInt(cursorQuery.getColumnIndex("fail_count")));
                                    }
                                    if (cursorQuery.getColumnIndex("rit") >= 0) {
                                        jpoVar.wqx(cursorQuery.getString(cursorQuery.getColumnIndex("rit")));
                                    }
                                    if (cursorQuery.getColumnIndex("tag") >= 0) {
                                        jpoVar.cm(cursorQuery.getString(cursorQuery.getColumnIndex("tag")));
                                    }
                                    if (cursorQuery.getColumnIndex("label") >= 0) {
                                        jpoVar.my(cursorQuery.getString(cursorQuery.getColumnIndex("label")));
                                    }
                                    if (cursorQuery.getColumnIndex("timestamp") >= 0) {
                                        jpoVar.jd(cursorQuery.getLong(cursorQuery.getColumnIndex("timestamp")));
                                    }
                                    String str9 = str4;
                                    if (cursorQuery.getColumnIndex(str9) >= 0) {
                                        jpoVar.jj(cursorQuery.getString(cursorQuery.getColumnIndex(str9)));
                                    }
                                    str7 = str3;
                                    if (cursorQuery.getColumnIndex(str7) >= 0) {
                                        jpoVar.cm(cursorQuery.getInt(cursorQuery.getColumnIndex(str7)));
                                    }
                                    String str10 = str2;
                                    if (cursorQuery.getColumnIndex(str10) >= 0) {
                                        str5 = str9;
                                        jpoVar.qk(cursorQuery.getString(cursorQuery.getColumnIndex(str10)));
                                    } else {
                                        str5 = str9;
                                    }
                                    arrayList3.add(jpoVar);
                                    arrayList = arrayList3;
                                    str6 = str10;
                                    str8 = str5;
                                }
                                ArrayList arrayList4 = arrayList;
                                cursorQuery.close();
                                str = "BusMonitorCenter";
                                try {
                                    Log.i(str, "exec upload ...");
                                    if (arrayList4.isEmpty()) {
                                        return;
                                    }
                                    try {
                                        jpo.this.f21480jd.onMonitorUpload(arrayList4);
                                        SQLiteDatabase sQLiteDatabaseJpo = com.bytedance.sdk.openadsdk.sq.jpo.jpo.jpo();
                                        if (sQLiteDatabaseJpo != null && sQLiteDatabaseJpo.isOpen()) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("_id IN (");
                                            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                                                sb2.append("?");
                                                if (i11 < arrayList2.size() - 1) {
                                                    sb2.append(",");
                                                }
                                            }
                                            sb2.append(")");
                                            sQLiteDatabaseJpo.delete("monitor_table", sb2.toString(), (String[]) arrayList2.toArray(new String[0]));
                                            if (jpo.this.wqx != null) {
                                                jpo.this.wqx.jpo(jpo.f21478jj);
                                            }
                                        }
                                        if (arrayList4.size() < i10 || jpo.this.f21481qk > 1000) {
                                            return;
                                        }
                                        jpo.this.jpo(false);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        Log.e(str, th.getMessage());
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                str = "BusMonitorCenter";
                                Log.e(str, th.getMessage());
                            }
                        }
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                str = "BusMonitorCenter";
            }
        }
    };

    private jpo(jd jdVar) {
        try {
            this.f21480jd = new BusMonitorDependWrapper(jdVar);
            this.wqx = new com.bytedance.sdk.openadsdk.sq.wqx.jpo(jdVar.getContext());
            my = jdVar.getContext();
        } catch (Throwable th2) {
            Log.e("BusMonitorCenter", th2.getMessage());
        }
    }

    public static /* synthetic */ int cm(jpo jpoVar) {
        int i10 = jpoVar.f21481qk;
        jpoVar.f21481qk = i10 + 1;
        return i10;
    }

    private boolean wqx() {
        if (this.f21479cm == null) {
            jd jdVar = this.f21480jd;
            return (jdVar == null || jdVar.getContext() == null || this.f21480jd.getHandler() == null) ? false : true;
        }
        jd jdVar2 = this.f21480jd;
        return (jdVar2 == null || jdVar2.getContext() == null || !this.f21480jd.isMonitorOpen() || this.f21480jd.getHandler() == null) ? false : true;
    }

    public static jpo jpo(jd jdVar) {
        return new jpo(jdVar);
    }

    public static Context jpo() {
        Context context = my;
        return context != null ? context : BusMonitorDependWrapper.getReflectContext();
    }

    public void jpo(final cm cmVar) {
        if (cmVar == null || !wqx()) {
            return;
        }
        this.f21480jd.getHandler().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sq.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                jpo jpoVar = jpo.this;
                jpoVar.f21479cm = Boolean.valueOf(jpoVar.f21480jd.isMonitorOpen());
                if (jpo.this.f21479cm.booleanValue()) {
                    jpo.this.xyk.add(cmVar);
                    if (jpo.this.xyk.size() >= 10) {
                        jpo jpoVar2 = jpo.this;
                        jpoVar2.jpo(jpoVar2.xyk);
                        jpo.this.xyk.clear();
                    }
                }
            }
        });
        this.f21480jd.getHandler().removeCallbacks(this.zz);
        this.f21480jd.getHandler().postDelayed(this.zz, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01ca A[Catch: all -> 0x01ae, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x01ae, blocks: (B:45:0x01aa, B:59:0x01ca), top: B:68:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(java.util.List<com.bytedance.sdk.openadsdk.sq.cm> r27) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.sq.jpo.jpo(java.util.List):void");
    }

    public void jpo(final boolean z10) {
        jd jdVar = this.f21480jd;
        if (jdVar == null || jdVar.getHandler() == null || this.f21480jd.getContext() == null || this.wqx == null || !this.f21480jd.isMonitorOpen()) {
            return;
        }
        this.f21480jd.getHandler().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.sq.jpo.3
            @Override // java.lang.Runnable
            public void run() {
                try {
                    jpo.cm(jpo.this);
                    if (z10) {
                        long jJpo = jpo.this.wqx.jpo();
                        if (jJpo == 0) {
                            jpo.this.wqx.jpo(System.currentTimeMillis());
                            return;
                        } else if (com.bytedance.sdk.openadsdk.sq.cm.jpo.jpo(jJpo) && System.currentTimeMillis() - jJpo < jpo.this.f21480jd.getUploadIntervalTime()) {
                            return;
                        }
                    }
                    if (jpo.this.f21480jd.getHandler() != null) {
                        jpo.this.f21480jd.getHandler().post(jpo.this.f21482yd);
                    }
                } catch (Throwable th2) {
                    Log.e("BusMonitorCenter", th2.getMessage());
                }
            }
        }, Math.max(this.f21480jd.getOnceLogInterval(), 10000));
    }
}

package com.bytedance.sdk.openadsdk.core.p000if.wqx;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.qk;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.cm.wqx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.my;
import com.bytedance.sdk.openadsdk.core.p000if.jpo;
import com.bytedance.sdk.openadsdk.core.p000if.jpo.jd;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.jd;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class cm {
    public static final List<String> jpo = Arrays.asList(QCmNMSGd.lHDLCOXBi, MimeTypes.VIDEO_H263);

    /* renamed from: jd, reason: collision with root package name */
    private static final ConcurrentHashMap<String, Boolean> f20428jd = new ConcurrentHashMap<>();

    private static double jd(String str) {
        if (str == null) {
            str = "";
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -1664118616) {
            return (iHashCode == 1331848029 && str.equals(MimeTypes.VIDEO_MP4)) ? 1.5d : 1.0d;
        }
        str.equals(MimeTypes.VIDEO_H263);
        return 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(dt dtVar, File file, my.jpo jpoVar, long j10) throws Throwable {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my myVar = new com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my(sq.jpo(), 0, 0);
        jpo jpoVarJpo = myVar.jpo((String) null, file, new ArrayList());
        if (jpoVarJpo != null) {
            jpoVar.jpo(jpoVarJpo.jpo());
            jpoVar.jpo(jpoVarJpo.au());
        }
        jd(dtVar, jpoVar.wqx(), true, j10);
        jpo(dtVar, "vast_url", jpoVarJpo, jElapsedRealtime, myVar.f20406jj);
        jd();
    }

    public static double jpo(int i10, double d10, int i11, int i12, int i13, String str) {
        double dJpo = jpo(i10, d10, i11, i12);
        return (1.0d / ((dJpo + 1.0d) + jpo(i13))) * jd(str);
    }

    private static double jpo(int i10, double d10, int i11, int i12) {
        return (d10 > 0.0d ? Math.abs(d10 - (i12 > 0 ? i11 / i12 : 0.0d)) : 0.0d) + (i10 > 0 ? Math.abs((i10 - i11) / i10) : 0.0d);
    }

    private static double jpo(int i10) {
        int iMax = Math.max(i10, 0);
        if (700 > iMax || iMax > 1500) {
            return Math.min(Math.abs(700 - iMax) / 700.0f, Math.abs(1500 - iMax) / 1500.0f);
        }
        return 0.0d;
    }

    private static void jd() {
        File[] fileArrListFiles;
        File fileJpo = jpo(sq.jpo(), jd.wqx());
        if (fileJpo == null || (fileArrListFiles = fileJpo.listFiles()) == null || fileArrListFiles.length <= 5) {
            return;
        }
        Arrays.sort(fileArrListFiles, new Comparator<File>() { // from class: com.bytedance.sdk.openadsdk.core.if.wqx.cm.2
            @Override // java.util.Comparator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public int compare(File file, File file2) {
                if (file.lastModified() < file2.lastModified()) {
                    return -1;
                }
                return file.lastModified() > file2.lastModified() ? 1 : 0;
            }
        });
        int length = fileArrListFiles.length - 5;
        for (int i10 = 0; i10 < fileArrListFiles.length && i10 < length; i10++) {
            File file = fileArrListFiles[i10];
            if (file.exists()) {
                file.delete();
            }
        }
    }

    public static void jpo(dt dtVar) throws Throwable {
        my myVarCw;
        ArrayList<my.jpo> arrayListJpo;
        dt dtVar2;
        if (dtVar == null || !my.jpo(dtVar) || (myVarCw = dtVar.cw()) == null || (arrayListJpo = myVarCw.jpo()) == null || arrayListJpo.isEmpty()) {
            return;
        }
        Iterator<my.jpo> it = arrayListJpo.iterator();
        while (it.hasNext()) {
            my.jpo next = it.next();
            String strCm = next.cm();
            if (TextUtils.isEmpty(strCm)) {
                dtVar2 = dtVar;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my myVar = new com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.my(sq.jpo(), 0, 0);
                jpo jpoVarJpo = myVar.jpo(strCm, (File) null, new ArrayList());
                if (jpoVarJpo != null) {
                    next.jpo(jpoVarJpo.jpo());
                    next.jpo(jpoVarJpo.au());
                }
                dtVar2 = dtVar;
                jpo(dtVar2, "vast_content", jpoVarJpo, jElapsedRealtime, myVar.f20406jj);
            }
            jpo(dtVar2, next);
            dtVar = dtVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void jd(dt dtVar, final String str, final boolean z10, final long j10) {
        wqx.jpo(System.currentTimeMillis(), dtVar, dtVar.my(), "track_url_request_result", new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.core.if.wqx.cm.3
            @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
            public JSONObject wqx() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", str);
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j10);
                    jSONObject.put("success", z10);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void jd(final dt dtVar, final String str, final jpo jpoVar, final long j10, final jd.jpo jpoVar2) {
        wqx.jpo(new xyk("vast_parser2") { // from class: com.bytedance.sdk.openadsdk.core.if.wqx.cm.5
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, SystemClock.elapsedRealtime() - j10);
                    jpo jpoVar3 = jpoVar;
                    String str2 = "load_vast_fail";
                    if (jpoVar3 == null) {
                        jd.jpo jpoVar4 = jpoVar2;
                        if (jpoVar4 != null) {
                            jSONObject.put("error_code", jpoVar4.jpo);
                        }
                    } else if (TextUtils.isEmpty(jpoVar3.zz()) || TextUtils.isEmpty(jpoVar.jj()) || jpoVar.xyk() <= 0.0d) {
                        jSONObject.put("error_code", -3);
                    } else {
                        str2 = "load_vast_success";
                    }
                    wqx.jd(dtVar, str, str2, jSONObject);
                    jpo jpoVar5 = jpoVar;
                    if (jpoVar5 == null || jpoVar5.jd() == null || !TextUtils.isEmpty(jpoVar.jd().jj())) {
                        return;
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put("error_code", 1000);
                        jSONObject2.put("description", "1000:Image url is null");
                    } catch (Throwable unused) {
                    }
                    wqx.jd(dtVar, str, "load_vast_icon_fail", jSONObject2);
                    jpoVar.jpo((com.bytedance.sdk.openadsdk.core.p000if.jd) null);
                } catch (Exception unused2) {
                }
            }
        });
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) throws Throwable {
        List<dt> listCm = jpoVar.cm();
        if (listCm != null) {
            Iterator<dt> it = listCm.iterator();
            while (it.hasNext()) {
                jpo(it.next());
            }
        }
    }

    private static void jpo(final dt dtVar, final my.jpo jpoVar) throws Throwable {
        File fileJpo;
        String strWqx = jpoVar.wqx();
        if (TextUtils.isEmpty(strWqx)) {
            return;
        }
        StringBuilder sbU = o2.u(strWqx);
        sbU.append(dtVar.hbg());
        final String string = sbU.toString();
        ConcurrentHashMap<String, Boolean> concurrentHashMap = f20428jd;
        if (concurrentHashMap.containsKey(string) || (fileJpo = jpo(string)) == null) {
            return;
        }
        if (fileJpo.exists() && fileJpo.length() > 0) {
            jd(dtVar, fileJpo, jpoVar, 0L);
            return;
        }
        concurrentHashMap.put(string, Boolean.TRUE);
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        com.bytedance.sdk.component.qk.jd.jpo jpoVarCm = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().cm();
        jpoVarCm.jd(strWqx);
        jpoVarCm.jpo(fileJpo.getParent(), fileJpo.getName());
        jpoVarCm.wqx(strWqx);
        jpoVarCm.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.if.wqx.cm.1
            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) throws Throwable {
                if (jdVar.jj() && jdVar.my() != null && jdVar.my().exists()) {
                    cm.jd(dtVar, jdVar.my(), jpoVar, SystemClock.elapsedRealtime() - jElapsedRealtime);
                } else {
                    cm.jd(dtVar, jpoVar.wqx(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                }
                cm.f20428jd.remove(string);
            }

            @Override // com.bytedance.sdk.component.qk.jpo.jpo
            public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                cm.jd(dtVar, jpoVar.wqx(), false, SystemClock.elapsedRealtime() - jElapsedRealtime);
                cm.f20428jd.remove(string);
            }
        });
    }

    public static File jpo(String str) {
        String strJpo = com.bytedance.sdk.component.utils.my.jpo(str);
        if (strJpo == null) {
            return null;
        }
        return qk.jpo(sq.jpo(), com.bytedance.sdk.openadsdk.multipro.jd.wqx(), j1.o2.l(new File(CacheDirFactory.getRootDir()).getName(), "/vast/"), strJpo);
    }

    private static File jpo(Context context, boolean z10) {
        return qk.jpo(context, z10, new File(CacheDirFactory.getRootDir()).getName() + "/vast/");
    }

    public static void jpo(final dt dtVar, final String str, final jpo jpoVar, final long j10, final jd.jpo jpoVar2) {
        wqx.jpo(new xyk("vast_parser1") { // from class: com.bytedance.sdk.openadsdk.core.if.wqx.cm.4
            @Override // java.lang.Runnable
            public void run() throws JSONException {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, SystemClock.elapsedRealtime() - j10);
                    jSONObject.put("from", str);
                    if (jpoVar != null) {
                        dt dtVar2 = dtVar;
                        wqx.jd(dtVar2, dtVar2.my(), "track_load_vast_success", jSONObject);
                        return;
                    }
                    jd.jpo jpoVar3 = jpoVar2;
                    if (jpoVar3 != null) {
                        jSONObject.put("error_code", jpoVar3.jpo);
                    }
                    dt dtVar3 = dtVar;
                    wqx.jd(dtVar3, dtVar3.my(), "track_load_vast_fail", jSONObject);
                } catch (Exception unused) {
                }
            }
        });
    }
}

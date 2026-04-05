package com.bytedance.sdk.openadsdk.nmd.jpo;

import a.b;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import android.webkit.WebResourceResponse;
import com.bytedance.sdk.component.utils.hna;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.rv;
import com.bytedance.sdk.component.xyk.xyk;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.settings.zz;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.bytedance.sdk.openadsdk.nmd.jd.jpo;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j1.o2;
import java.io.File;
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class wqx {
    private static volatile wqx jpo;

    /* renamed from: cm, reason: collision with root package name */
    private String f21335cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f21336jd;
    private final Set<String> my = Collections.synchronizedSet(new HashSet());
    private String wqx;

    private String cm() {
        if (TextUtils.isEmpty(this.f21336jd)) {
            try {
                File file = new File(sq.jpo().getCacheDir(), "playable");
                if (!file.exists()) {
                    file.mkdirs();
                }
                this.f21336jd = file.getAbsolutePath();
            } catch (Throwable th2) {
                nmd.wqx("PlayableResManager", "init root path error: ".concat(String.valueOf(th2)));
            }
        }
        return this.f21336jd;
    }

    private String jj() {
        if (TextUtils.isEmpty(this.f21335cm)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cm());
            String strO = o2.o(sb2, File.separator, "pregames");
            File file = new File(strO);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f21335cm = strO;
        }
        return this.f21335cm;
    }

    private String my() {
        if (TextUtils.isEmpty(this.wqx)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cm());
            String strO = o2.o(sb2, File.separator, "common");
            File file = new File(strO);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.wqx = strO;
        }
        return this.wqx;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wqx() {
        duq.jpo(new xyk("pag_plb_res_check") { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.wqx.2
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.nmd.jd.jpo jpoVarJd = com.bytedance.sdk.openadsdk.nmd.jd.jpo.jd(com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("pag_plb_config", "model", ""));
                if (jpoVarJd != null) {
                    wqx.this.jpo(jpoVarJd, null, 0);
                }
            }
        });
    }

    public void jd() {
        if (zz.jpo() && com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_res_enable", 0) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("pag_plb_config", LJjmO.nTvlS, 0L);
            final String strJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_res", "");
            long jJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_res_fetch_interval", 3600000);
            if (jJpo <= 0 || jJpo > 259200000) {
                jJpo = 3600000;
            }
            if (jCurrentTimeMillis < jJpo || TextUtils.isEmpty(strJpo)) {
                return;
            }
            int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_res_delay_fetch_time", 0);
            if (iJpo <= 0) {
                jd(strJpo);
            } else {
                oya.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.wqx.3
                    @Override // java.lang.Runnable
                    public void run() {
                        wqx.this.jd(strJpo);
                    }
                }, iJpo);
            }
        }
    }

    private static String wqx(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int iIndexOf = str.indexOf("?");
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iLastIndexOf = str.lastIndexOf(".");
        if (iLastIndexOf == -1) {
            return "";
        }
        return "." + str.substring(iLastIndexOf + 1);
    }

    public static wqx jpo() {
        if (jpo == null) {
            synchronized (wqx.class) {
                try {
                    if (jpo == null) {
                        jpo = new wqx();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(final String str) {
        duq.jpo(new xyk("pag_plb_update_config") { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.wqx.4
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.qk.jd.jd jdVarWqx = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().wqx();
                try {
                    jdVarWqx.jd(com.bytedance.sdk.openadsdk.xyk.cm.jpo(jdVarWqx, str));
                    com.bytedance.sdk.component.qk.jd jdVarJpo = jdVarWqx.jpo();
                    if (jdVarJpo == null || !jdVarJpo.jj()) {
                        return;
                    }
                    String strCm = jdVarJpo.cm();
                    com.bytedance.sdk.openadsdk.nmd.jd.jpo jpoVarJd = com.bytedance.sdk.openadsdk.nmd.jd.jpo.jd(strCm);
                    com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("pag_plb_config", "last_update_time", Long.valueOf(System.currentTimeMillis()));
                    if (jpoVarJd != null) {
                        com.bytedance.sdk.openadsdk.nmd.jd.jpo jpoVarJd2 = com.bytedance.sdk.openadsdk.nmd.jd.jpo.jd(com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("pag_plb_config", "model", ""));
                        if (jpoVarJd2 != null && jpoVarJd.jpo().equals(jpoVarJd2.jpo())) {
                            return;
                        }
                        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("pag_plb_config", "model", strCm);
                        wqx.this.jpo(jpoVarJd, jpoVarJd2, 1);
                    }
                } catch (Exception e10) {
                    nmd.wqx("PlayableResManager", e10.getMessage());
                }
            }
        });
    }

    public void jpo(Map<String, String> map) {
        File[] fileArrListFiles;
        if (zz.jpo() && com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_res_enable", 0) == 1) {
            String strJj = jj();
            if (!TextUtils.isEmpty(strJj)) {
                File file = new File(strJj);
                if (file.exists() && file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
                    for (File file2 : fileArrListFiles) {
                        if (file2 != null) {
                            try {
                                File fileJpo = com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo(file2);
                                if (fileJpo != null && fileJpo.exists()) {
                                    map.put(file2.getName(), fileJpo.getAbsolutePath());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
            int iJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_res_delay_fetch_time", 0);
            if (iJpo <= 0) {
                wqx();
            } else {
                oya.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.wqx.1
                    @Override // java.lang.Runnable
                    public void run() {
                        wqx.this.wqx();
                    }
                }, iJpo);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void jpo(com.bytedance.sdk.openadsdk.nmd.jd.jpo jpoVar, com.bytedance.sdk.openadsdk.nmd.jd.jpo jpoVar2, int i10) {
        List<jpo.C0148jpo> listWqx = null;
        jpo(jpoVar.jd(), jpoVar2 == null ? null : jpoVar2.jd(), 1, i10);
        List<jpo.C0148jpo> listWqx2 = jpoVar.wqx();
        if (jpoVar2 != null) {
            listWqx = jpoVar2.wqx();
        }
        jpo(listWqx2, listWqx, 2, i10);
    }

    private void jpo(List<jpo.C0148jpo> list, List<jpo.C0148jpo> list2, int i10, int i11) throws NoSuchAlgorithmException {
        if (list == null || list.isEmpty()) {
            return;
        }
        String strMy = i10 == 1 ? my() : jj();
        for (jpo.C0148jpo c0148jpo : list) {
            String strJpo = c0148jpo.jpo();
            String strJpo2 = hna.jpo(strJpo);
            if (!TextUtils.isEmpty(strJpo2)) {
                if (i10 == 1) {
                    StringBuilder sbU = p0.o2.u(strJpo2);
                    sbU.append(wqx(strJpo));
                    strJpo2 = sbU.toString();
                }
                String str = strJpo2;
                File file = new File(strMy, str);
                boolean zExists = file.exists();
                if (i11 == 1) {
                    if (zExists && list2 != null && list2.contains(c0148jpo)) {
                        com.bytedance.sdk.openadsdk.core.au.wqx.jpo.wqx(file);
                    } else {
                        int i12 = i10;
                        jpo(strJpo, strMy, str, i12, file, zExists);
                        i10 = i12;
                    }
                } else if (!zExists) {
                    int i122 = i10;
                    jpo(strJpo, strMy, str, i122, file, zExists);
                    i10 = i122;
                }
            }
        }
    }

    private void jpo(final String str, final String str2, final String str3, final int i10, final File file, final boolean z10) {
        String strConcat;
        if (this.my.contains(str)) {
            return;
        }
        if (i10 == 2) {
            strConcat = o2.l(str3, ".zip");
        } else {
            strConcat = z10 ? QGjYBESwAiCc.DOrIkT.concat(String.valueOf(str3)) : str3;
        }
        this.my.add(str);
        com.bytedance.sdk.component.qk.jd.jpo jpoVarCm = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().cm();
        jpoVarCm.jd(str);
        jpoVarCm.jpo(str2, strConcat);
        final com.bytedance.sdk.component.qk.jd jdVarJpo = jpoVarCm.jpo();
        this.my.remove(str);
        if (jdVarJpo == null || !jdVarJpo.jj() || jdVarJpo.my() == null || !jdVarJpo.my().exists()) {
            File file2 = new File(b.o(p0.o2.u(str2), File.separator, str3, ".tmp"));
            if (file2.exists()) {
                try {
                    file2.delete();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (i10 == 2) {
            duq.jd(new xyk("downloadZip") { // from class: com.bytedance.sdk.openadsdk.nmd.jpo.wqx.5
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (z10) {
                            file.delete();
                        }
                        String str4 = str2 + File.separator + str3;
                        rv.jpo(jdVarJpo.my().getAbsolutePath(), str4);
                        File file3 = new File(str4);
                        File fileJpo = com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo(file3);
                        if (fileJpo != null && fileJpo.exists()) {
                            com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().wqx().put(file3.getName(), fileJpo.getAbsolutePath());
                        }
                        com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jd(file3);
                    } catch (Throwable th2) {
                        nmd.wqx("PlayableResManager", "unzip error: ", th2, "tp=", Integer.valueOf(i10), ", url=", str);
                    }
                    try {
                        jdVarJpo.my().delete();
                    } catch (Throwable unused2) {
                    }
                }
            });
        } else if (z10) {
            file.delete();
            jdVarJpo.my().renameTo(file);
        }
    }

    public WebResourceResponse jpo(String str) throws NoSuchAlgorithmException {
        if (zz.jpo() && com.bytedance.sdk.openadsdk.rq.jpo.jpo("plb_res_enable", 0) == 1) {
            String strJpo = hna.jpo(str);
            if (TextUtils.isEmpty(strJpo)) {
                return null;
            }
            String strMy = my();
            StringBuilder sbU = p0.o2.u(strJpo);
            sbU.append(wqx(str));
            File file = new File(strMy, sbU.toString());
            if (file.exists()) {
                try {
                    String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(str));
                    if (TextUtils.isEmpty(mimeTypeFromExtension)) {
                        return null;
                    }
                    return new WebResourceResponse(mimeTypeFromExtension, C.UTF8_NAME, new FileInputStream(file));
                } catch (Throwable unused) {
                }
            }
        }
        return null;
    }
}

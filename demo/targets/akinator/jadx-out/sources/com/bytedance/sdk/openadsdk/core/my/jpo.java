package com.bytedance.sdk.openadsdk.core.my;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.my;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.qk;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.au.wqx.wqx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.multipro.jd;
import com.bytedance.sdk.openadsdk.prr.jpo.cm;
import com.vungle.ads.internal.protos.Sdk;
import j1.o2;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private final List<String> jpo = new CopyOnWriteArrayList();

    /* renamed from: jd, reason: collision with root package name */
    private final wqx f20811jd = new wqx(5, 5, true);
    private final ConcurrentHashMap<String, Long> wqx = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.my.jpo$jpo, reason: collision with other inner class name */
    public static class C0131jpo {
        private static final jpo jpo = new jpo();
    }

    private boolean wqx(String str) {
        return !this.jpo.contains(str);
    }

    public File jd(String str) {
        String strJpo = my.jpo(str);
        if (strJpo == null) {
            return null;
        }
        String name = new File(CacheDirFactory.getRootDir()).getName();
        return qk.jpo(sq.jpo(), jd.wqx(), jd.wqx() ? o2.l(name, "/music/") : o2.l(name, "//music/"), strJpo);
    }

    public void wqx() {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("music_preload_start", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.my.jpo.2
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                cm cmVarJpo = cm.jd().jpo("music_preload_start");
                cmVarJpo.jpo();
                return cmVarJpo;
            }
        });
    }

    public static jpo jpo() {
        return C0131jpo.jpo;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) throws JSONException {
        List<dt> listCm = jpoVar.cm();
        if (listCm == null || listCm.size() == 0) {
            return;
        }
        for (int i10 = 0; i10 < listCm.size(); i10++) {
            dt dtVar = listCm.get(i10);
            if (dtVar != null) {
                jpo(dtVar);
            }
        }
    }

    public InputStream jpo(String str) {
        File fileJd = jd(str);
        if (fileJd == null || !jpo(fileJd)) {
            return null;
        }
        try {
            return new FileInputStream(fileJd);
        } catch (Exception e10) {
            nmd.wqx("MusicCacheManager", e10.getMessage());
            return null;
        }
    }

    private void jpo(dt dtVar) throws JSONException {
        dt.jpo jpoVarVzb;
        String strZz;
        if (dtVar == null || (jpoVarVzb = dtVar.vzb()) == null || (strZz = jpoVarVzb.zz()) == null || !strZz.contains("music_url")) {
            return;
        }
        wqx();
        String strJd = jpoVarVzb.jd();
        if (TextUtils.isEmpty(strJd)) {
            try {
                new JSONObject().put("result", 0);
            } catch (JSONException e10) {
                nmd.wqx("MusicCacheManager", e10.getMessage());
            }
            jpo(0, -1L, Sdk.SDKError.Reason.AD_NO_FILL_VALUE, "music url string is null");
            return;
        }
        File fileJd = jd(strJd);
        if (fileJd == null) {
            return;
        }
        fileJd.getPath();
        if (jpo(fileJd)) {
            jpo(2, -1L, -1, null);
        } else {
            jpo(dtVar, strJd, fileJd);
        }
    }

    public void jd() {
        File fileJpo = jpo(sq.jpo(), jd.wqx());
        fileJpo.getAbsolutePath();
        try {
            this.f20811jd.jpo(fileJpo);
        } catch (IOException e10) {
            nmd.jpo("MusicCacheManager", "trimFileCache fail", e10);
        }
    }

    private boolean jpo(File file) {
        return file.exists() && file.length() != 0;
    }

    private void jpo(dt dtVar, String str, File file) {
        if (wqx(str)) {
            this.wqx.put(str, Long.valueOf(SystemClock.elapsedRealtime()));
            com.bytedance.sdk.component.qk.jd.jpo jpoVarCm = com.bytedance.sdk.openadsdk.opi.jd.jd().wqx().cm();
            jpoVarCm.jd(str);
            jpoVarCm.jpo(file.getParent(), file.getName());
            jpoVarCm.wqx(str);
            this.jpo.add(str);
            jpoVarCm.jpo(new com.bytedance.sdk.component.qk.jpo.jpo() { // from class: com.bytedance.sdk.openadsdk.core.my.jpo.1
                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, com.bytedance.sdk.component.qk.jd jdVar) {
                    jdVar.wqx();
                    jdVar.jpo();
                    String strWqx = wqxVar.wqx();
                    Long l9 = (Long) jpo.this.wqx.get(strWqx);
                    if (jdVar.jj() && jdVar.my() != null && jdVar.my().exists()) {
                        jdVar.my();
                        if (l9 != null) {
                            jpo.this.wqx.remove(strWqx);
                            jpo.this.jpo(1, SystemClock.elapsedRealtime() - l9.longValue(), -1, null);
                        }
                        try {
                            qk.jd(jdVar.my());
                        } catch (IOException e10) {
                            nmd.wqx("MusicCacheManager", e10.getMessage());
                        }
                    }
                    if (jdVar.jj() || l9 == null) {
                        return;
                    }
                    jpo.this.jpo(0, SystemClock.elapsedRealtime() - l9.longValue(), -2, "http response status code isn't 200");
                }

                @Override // com.bytedance.sdk.component.qk.jpo.jpo
                public void jpo(com.bytedance.sdk.component.qk.jd.wqx wqxVar, IOException iOException) {
                    Long l9 = (Long) jpo.this.wqx.get(wqxVar.wqx());
                    if (l9 != null) {
                        jpo.this.jpo(0, SystemClock.elapsedRealtime() - l9.longValue(), -2, "http response status code isn't 200");
                    }
                }
            });
        }
    }

    private File jpo(Context context, boolean z10) {
        String strL;
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (jd.wqx()) {
            strL = o2.l(name, "/music");
        } else {
            strL = o2.l(name, "//music");
        }
        return qk.jpo(context, z10, strL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(final int i10, final long j10, final int i11, final String str) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("music_preload_finish", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.my.jpo.3
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", i10);
                long j11 = j10;
                if (j11 != -1) {
                    jSONObject.put("load_duration", j11);
                }
                cm cmVarJd = cm.jd().jpo("music_preload_finish").jd(jSONObject.toString());
                if (!TextUtils.isEmpty(str)) {
                    cmVarJd.jd(i11);
                    cmVarJd.jj(str);
                }
                cmVarJd.jpo();
                return cmVarJd;
            }
        });
    }

    public void jpo(final boolean z10) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("music_cache", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.my.jpo.4
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", z10);
                cm cmVarJd = cm.jd().jpo("music_cache").jd(jSONObject.toString());
                cmVarJd.jpo();
                return cmVarJd;
            }
        });
    }
}

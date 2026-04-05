package com.bytedance.sdk.openadsdk.component;

import a.b;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import be.nVUQ.UupKET;
import com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo;
import com.bytedance.sdk.component.my.hna;
import com.bytedance.sdk.component.my.ju;
import com.bytedance.sdk.component.my.xyk;
import com.bytedance.sdk.component.my.yd;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.component.utils.opi;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.common.jpo;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.hx;
import com.bytedance.sdk.openadsdk.core.model.sz;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.rq;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.tu;
import com.bytedance.sdk.openadsdk.utils.dm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.sq;
import com.bytedance.sdk.openadsdk.utils.va;
import j1.o2;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jj {

    /* renamed from: jd, reason: collision with root package name */
    private static String f19768jd = "openad_image_cache";
    private static String jpo = "/openad_image_cache";
    private static volatile jj wqx;

    /* renamed from: cm, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.jd.jd f19769cm;

    /* renamed from: jj, reason: collision with root package name */
    private final Context f19770jj;
    private final tu<com.bytedance.sdk.openadsdk.cm.jpo> my;

    /* renamed from: qk, reason: collision with root package name */
    private final Map<String, AtomicInteger> f19771qk = new ConcurrentHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public interface jd {
        void jpo();

        void jpo(int i10, String str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public interface jpo {
        void jpo();

        void jpo(com.bytedance.sdk.openadsdk.opi.jpo.jd jdVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public interface wqx {
        void jpo(Object obj);
    }

    private jj(Context context) {
        if (context != null) {
            this.f19770jj = context.getApplicationContext();
        } else {
            this.f19770jj = sq.jpo();
        }
        this.f19769cm = new com.bytedance.sdk.openadsdk.jd.jd(10, 8, true);
        this.my = sq.wqx();
        if (com.bytedance.sdk.openadsdk.zz.cm.jd()) {
            jpo = o2.o(new StringBuilder(), jpo, "_p");
            f19768jd = o2.o(new StringBuilder(), f19768jd, "_p");
        }
        com.bytedance.sdk.openadsdk.common.jpo.jpo("tt_openad_materialMeta_new", new jpo.C0106jpo("tt_openad_materialMeta_new") { // from class: com.bytedance.sdk.openadsdk.component.jj.1
            @Override // com.bytedance.sdk.openadsdk.common.jpo.C0106jpo
            public String jd(String str) {
                return com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("tt_openad_materialMeta_new", "material".concat(String.valueOf(str)), null);
            }

            @Override // com.bytedance.sdk.openadsdk.common.jpo.C0106jpo
            public String jpo(String str) {
                return "tt_openad_materialMeta_new";
            }

            @Override // com.bytedance.sdk.openadsdk.common.jpo.C0106jpo
            public void jpo(AdSlot adSlot, String str, String str2) {
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad_materialMeta_new", "material".concat(String.valueOf(adSlot.getCodeId())), str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jd(AdSlot adSlot) {
        AtomicInteger atomicInteger = this.f19771qk.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        } else {
            atomicInteger.decrementAndGet();
        }
        this.f19771qk.put(adSlot.getCodeId(), atomicInteger);
    }

    public dt cm(int i10) {
        dt dtVarMy = my(i10);
        long jJpo = com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", "material_expiration_time".concat(String.valueOf(i10)), -1L);
        if (System.currentTimeMillis() / 1000 < jJpo && dtVarMy != null) {
            return dtVarMy;
        }
        if (dtVarMy == null && jJpo == -1) {
            return null;
        }
        jj(i10);
        if (dtVarMy == null) {
            return null;
        }
        com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(dtVarMy);
        return null;
    }

    public void jj(int i10) {
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad_materialMeta_new", "material".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad_materialMeta", "material".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", "material_expiration_time".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", "video_has_cached".concat(String.valueOf(i10)));
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", "image_has_cached".concat(String.valueOf(i10)));
    }

    public dt my(int i10) {
        String strJd = com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("tt_openad_materialMeta", "material".concat(String.valueOf(i10)), null);
        if (!TextUtils.isEmpty(strJd)) {
            try {
                JSONObject jSONObjectJpo = sq.wqx().jpo(new JSONObject(strJd));
                if (jSONObjectJpo == null || !jSONObjectJpo.has(UupKET.UcYh)) {
                    return com.bytedance.sdk.openadsdk.core.jd.jpo(jSONObjectJpo);
                }
                return null;
            } catch (Exception e10) {
                nmd.wqx("TTAppOpenAdCacheManager", e10.getMessage());
            }
        }
        return null;
    }

    public String wqx(int i10) {
        String strJd = com.bytedance.sdk.openadsdk.common.jpo.jpo("tt_openad_materialMeta_new").jd(String.valueOf(i10));
        long jJpo = com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", "material_expiration_time".concat(String.valueOf(i10)), -1L);
        if (System.currentTimeMillis() / 1000 < jJpo) {
            return strJd;
        }
        if (jJpo == -1) {
            return null;
        }
        jj(i10);
        jpo(strJd);
        return null;
    }

    public static jj jpo(Context context) {
        if (wqx == null) {
            synchronized (jj.class) {
                try {
                    if (wqx == null) {
                        wqx = new jj(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return wqx;
    }

    private void jd(final dt dtVar, final AdSlot adSlot, final sz szVar, final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        final int iJl = dtVar.jl();
        jpo(dtVar, szVar, new jpo() { // from class: com.bytedance.sdk.openadsdk.component.jj.10
            @Override // com.bytedance.sdk.openadsdk.component.jj.jpo
            public void jpo(com.bytedance.sdk.openadsdk.opi.jpo.jd jdVar) throws JSONException {
                com.bytedance.sdk.openadsdk.component.my.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.component.my.jpo(iJl, dtVar, jpoVar);
                jj.this.jpo(jpoVar2);
                com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(jpoVar2.jd(), 1, szVar);
                jj.this.jd(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.jj.jpo
            public void jpo() {
                jj.this.jd(adSlot);
            }
        });
    }

    public void jd(int i10) {
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", "image_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    private int wqx(AdSlot adSlot) {
        StringBuilder sb2 = new StringBuilder("material_expiration_time");
        sb2.append(adSlot.getCodeId());
        return com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", sb2.toString(), -1L) == -1 ? 0 : 1;
    }

    public String jd() {
        String name = new File(CacheDirFactory.getRootDir()).getName();
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            return o2.o(b.t(name, "/"), f19768jd, "/");
        }
        return o2.o(b.t(name, "/"), jpo, "/");
    }

    public static void jpo(dt dtVar, wqx wqxVar) {
        jpo(dtVar, wqxVar, 0);
    }

    public static void jpo(dt dtVar, final wqx wqxVar, final int i10) {
        String strYd = dtVar.ww().yd();
        if (TextUtils.isEmpty(strYd)) {
            return;
        }
        yd ydVarCm = com.bytedance.sdk.openadsdk.zz.cm.jpo(strYd).jpo(dtVar.ww().wqx()).jd(dtVar.ww().jd()).my(va.my(sq.jpo())).cm(va.wqx(sq.jpo()));
        if (i10 > 0 && Build.VERSION.SDK_INT >= 26) {
            ydVarCm.wqx(2).jpo(new xyk() { // from class: com.bytedance.sdk.openadsdk.component.jj.5
                @Override // com.bytedance.sdk.component.my.xyk
                public Bitmap jpo(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.cm.jpo.jpo(sq.jpo(), bitmap, i10);
                }
            });
        } else {
            ydVarCm.wqx(1);
        }
        ydVarCm.jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, strYd, new hna() { // from class: com.bytedance.sdk.openadsdk.component.jj.6
            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(int i11, String str, Throwable th2) {
            }

            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(ju juVar) {
                wqx wqxVar2;
                if (juVar == null || juVar.jd() == null || juVar.wqx() == null || (wqxVar2 = wqxVar) == null) {
                    return;
                }
                wqxVar2.jpo(juVar.jd());
            }
        }));
    }

    public void jpo(final AdSlot adSlot) {
        if (adSlot == null || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        AtomicInteger atomicInteger = this.f19771qk.get(adSlot.getCodeId());
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
        }
        if (atomicInteger.get() + wqx(adSlot) > 0) {
            return;
        }
        atomicInteger.incrementAndGet();
        this.f19771qk.put(adSlot.getCodeId(), atomicInteger);
        final sz szVar = new sz();
        szVar.jpo(dm.jd());
        szVar.jd(com.bytedance.sdk.openadsdk.component.qk.jpo.jd());
        szVar.jd(com.bytedance.sdk.openadsdk.component.qk.jpo.wqx());
        hx hxVar = new hx();
        hxVar.f20668ju = szVar;
        hxVar.f20665cm = 2;
        hxVar.zz = 2;
        if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
            this.my.jpo(adSlot, hxVar, 3, (com.bytedance.sdk.openadsdk.core.nmd) new rq() { // from class: com.bytedance.sdk.openadsdk.component.jj.7
                @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(int i10, String str) {
                    jj.this.jd(adSlot);
                    com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(szVar, 101, 2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.rq, com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) throws JSONException {
                    jj.this.jpo(jpoVar, wqxVar, adSlot, szVar);
                }
            });
        } else {
            this.my.jpo(adSlot, hxVar, 3, new tu.jpo() { // from class: com.bytedance.sdk.openadsdk.component.jj.8
                @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(int i10, String str) {
                    jj.this.jd(adSlot);
                    com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(szVar, 101, 2);
                }

                @Override // com.bytedance.sdk.openadsdk.core.tu.jpo
                public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar) throws JSONException {
                    jj.this.jpo(jpoVar, wqxVar, adSlot, szVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.openadsdk.core.model.jpo jpoVar, com.bytedance.sdk.openadsdk.core.model.wqx wqxVar, AdSlot adSlot, sz szVar) throws JSONException {
        com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(szVar, 101, 1);
        if (jpoVar != null && jpoVar.cm() != null && !jpoVar.cm().isEmpty()) {
            dt dtVar = jpoVar.cm().get(0);
            if (dtVar != null && dtVar.se()) {
                com.bytedance.sdk.openadsdk.component.my.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.component.my.jpo(dtVar.jl(), dtVar, jpoVar);
                jpo(jpoVar2);
                com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(jpoVar2.jd(), 1, szVar);
                jd(adSlot);
                return;
            }
            if (dt.my(dtVar)) {
                jpo(dtVar, adSlot, szVar, jpoVar);
                return;
            } else {
                jd(dtVar, adSlot, szVar, jpoVar);
                return;
            }
        }
        wqxVar.jpo(-3);
        wqxVar.wqx(2);
        com.bytedance.sdk.openadsdk.core.model.wqx.jpo(wqxVar);
    }

    private void jpo(final dt dtVar, final AdSlot adSlot, final sz szVar, final com.bytedance.sdk.openadsdk.core.model.jpo jpoVar) {
        final int iJl = dtVar.jl();
        jpo(dtVar, adSlot, szVar, new jd() { // from class: com.bytedance.sdk.openadsdk.component.jj.9
            @Override // com.bytedance.sdk.openadsdk.component.jj.jd
            public void jpo() throws JSONException {
                com.bytedance.sdk.openadsdk.component.my.jpo jpoVar2 = new com.bytedance.sdk.openadsdk.component.my.jpo(iJl, dtVar, jpoVar);
                jj.this.jpo(jpoVar2);
                com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(jpoVar2.jd(), 1, szVar);
                jj.this.jd(adSlot);
            }

            @Override // com.bytedance.sdk.openadsdk.component.jj.jd
            public void jpo(int i10, String str) {
                jj.this.jd(adSlot);
            }
        });
    }

    public void jpo(final dt dtVar, AdSlot adSlot, final sz szVar, final jd jdVar) {
        final dm dmVarJd = dm.jd();
        final int iJl = dtVar.jl();
        com.bykv.vk.openvk.jpo.jpo.jpo.wqx.jd jdVarWw = dtVar.ww();
        String strJu = jdVarWw.ju();
        String strOya = jdVarWw.oya();
        if (TextUtils.isEmpty(strOya)) {
            strOya = com.bytedance.sdk.component.utils.my.jpo(strJu);
        }
        final File fileJpo = com.bytedance.sdk.openadsdk.component.qk.jpo.jpo(strOya);
        if (fileJpo.exists()) {
            com.bytedance.sdk.openadsdk.component.qk.jpo.jpo(fileJpo);
            jpo(iJl);
            long jCm = dmVarJd.cm();
            if (szVar != null) {
                szVar.jpo(jCm);
                szVar.jpo(1);
            }
            jdVar.jpo();
            jpo(dtVar, (wqx) null);
            return;
        }
        if (sq.cm().hmu(String.valueOf(iJl)) && !opi.cm(sq.jpo())) {
            jdVar.jpo(100, QFzuMMDfrzagDN.BZPfnuPOHpOq);
            return;
        }
        com.bytedance.sdk.openadsdk.core.au.jpo.jd jdVarJpo = dt.jpo(fileJpo.getParent(), dtVar);
        jdVarJpo.jpo("material_meta", dtVar);
        jdVarJpo.jpo("ad_slot", adSlot);
        com.bytedance.sdk.openadsdk.core.au.my.jpo.jpo(jdVarJpo, new jpo.InterfaceC0054jpo() { // from class: com.bytedance.sdk.openadsdk.component.jj.11
            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) throws JSONException {
                jj.this.jpo(iJl);
                long jCm2 = dmVarJd.cm();
                com.bytedance.sdk.openadsdk.component.cm.jpo.jd(dtVar, jCm2, true);
                sz szVar2 = szVar;
                if (szVar2 != null) {
                    szVar2.jpo(jCm2);
                    szVar.jpo(2);
                }
                jdVar.jpo();
                jj.jpo(dtVar, (wqx) null);
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
            public void jpo(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10, String str) throws JSONException {
                long jCm2 = dmVarJd.cm();
                com.bytedance.sdk.openadsdk.component.cm.jpo.jd(dtVar, jCm2, false);
                sz szVar2 = szVar;
                if (szVar2 != null) {
                    szVar2.jpo(jCm2);
                }
                jdVar.jpo(i10, str);
                try {
                    if (fileJpo.exists() && fileJpo.isFile()) {
                        com.bytedance.sdk.component.utils.qk.wqx(fileJpo);
                    }
                } catch (Throwable unused) {
                }
            }

            @Override // com.bykv.vk.openvk.jpo.jpo.jpo.my.jpo.InterfaceC0054jpo
            public void jd(com.bykv.vk.openvk.jpo.jpo.jpo.wqx.wqx wqxVar, int i10) {
            }
        });
    }

    public void jpo(final dt dtVar, final sz szVar, final jpo jpoVar) {
        final dm dmVarJd = dm.jd();
        final int iJl = dtVar.jl();
        com.bytedance.sdk.openadsdk.core.model.opi opiVar = dtVar.fri().get(0);
        String strQk = opiVar.qk();
        String strJpo = opiVar.jpo();
        int iJd = opiVar.jd();
        int iWqx = opiVar.wqx();
        String strJpo2 = TextUtils.isEmpty(strQk) ? com.bytedance.sdk.component.utils.my.jpo(strJpo) : strQk;
        if (TextUtils.isEmpty(strJpo2)) {
            if (jpoVar != null) {
                jpoVar.jpo();
                return;
            }
            return;
        }
        File fileJd = com.bytedance.sdk.openadsdk.component.qk.jpo.jd(strJpo2);
        if (jpo(strJpo, strQk)) {
            jd(iJl);
            long jCm = dmVarJd.cm();
            if (szVar != null) {
                szVar.jpo(jCm);
                szVar.jpo(1);
            }
            jpoVar.jpo(null);
            return;
        }
        com.bytedance.sdk.openadsdk.utils.sq.jpo(new com.bytedance.sdk.openadsdk.opi.jpo(strJpo, opiVar.qk()), iJd, iWqx, new sq.jpo() { // from class: com.bytedance.sdk.openadsdk.component.jj.12
            @Override // com.bytedance.sdk.openadsdk.utils.sq.jpo
            public void jpo(com.bytedance.sdk.openadsdk.opi.jpo.jd jdVar) throws JSONException {
                if (!jdVar.my()) {
                    com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(dtVar, dmVarJd.cm(), false);
                    jpoVar.jpo();
                    return;
                }
                jj.this.jd(iJl);
                long jCm2 = dmVarJd.cm();
                com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(dtVar, jCm2, true);
                sz szVar2 = szVar;
                if (szVar2 != null) {
                    szVar2.jpo(jCm2);
                    szVar.jpo(2);
                }
                jpoVar.jpo(jdVar);
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sq.jpo
            public void jpo() throws JSONException {
                com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(dtVar, dmVarJd.cm(), false);
                jpoVar.jpo();
            }
        }, fileJd.getParent());
    }

    public void jpo(int i10) {
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", "video_has_cached".concat(String.valueOf(i10)), Boolean.TRUE);
    }

    public void jpo(final com.bytedance.sdk.openadsdk.component.my.jpo jpoVar) {
        oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.jj.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (jpoVar.jd() == null || dt.qk(jpoVar.jd()) || jpoVar.jd().rf()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad", "material_expiration_time" + jpoVar.jpo(), Long.valueOf(jpoVar.jd().smo()));
                    if (com.bytedance.sdk.openadsdk.utils.jd.jpo()) {
                        com.bytedance.sdk.openadsdk.common.jpo.jpo("tt_openad_materialMeta_new").jpo(jpoVar.jd().gmx(), jpoVar.wqx());
                        return;
                    }
                    com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad_materialMeta", "material" + jpoVar.jpo(), com.bytedance.sdk.component.utils.jpo.jpo(jpoVar.jd().gum()).toString());
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void jpo(final String str) {
        duq.jpo(new com.bytedance.sdk.component.xyk.xyk("opencache") { // from class: com.bytedance.sdk.openadsdk.component.jj.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.core.model.jpo jpoVarJd;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = com.bytedance.sdk.openadsdk.core.sq.wqx().jpo(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (jpoVarJd = com.bytedance.sdk.openadsdk.core.model.jpo.jd(jSONObject)) == null || !jpoVarJd.my()) {
                        return;
                    }
                    com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(jpoVarJd.jj());
                } catch (Throwable unused) {
                }
            }
        });
    }

    public String jpo(dt dtVar) {
        if (dtVar != null && dtVar.ww() != null && !TextUtils.isEmpty(dtVar.ww().ju())) {
            String strJu = dtVar.ww().ju();
            String strOya = dtVar.ww().oya();
            if (TextUtils.isEmpty(strOya)) {
                strOya = com.bytedance.sdk.component.utils.my.jpo(strJu);
            }
            File fileJpo = com.bytedance.sdk.openadsdk.component.qk.jpo.jpo(strOya);
            if (fileJpo.exists() && fileJpo.isFile()) {
                return fileJpo.getAbsolutePath();
            }
        }
        return null;
    }

    public boolean jpo(String str, String str2) throws IOException {
        boolean z10;
        File file;
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = com.bytedance.sdk.component.utils.my.jpo(str);
            }
            File fileJd = com.bytedance.sdk.openadsdk.component.qk.jpo.jd(str2);
            InputStream inputStreamJpo = com.bytedance.sdk.openadsdk.zz.cm.jpo(str, str2);
            if (inputStreamJpo != null) {
                try {
                    inputStreamJpo.close();
                } catch (IOException e10) {
                    nmd.wqx("TTAppOpenAdCacheManager", e10.getMessage());
                }
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (com.bytedance.sdk.openadsdk.zz.cm.jpo(str, str2, fileJd.getParent())) {
                    return true;
                }
                if (com.bytedance.sdk.openadsdk.zz.cm.jd()) {
                    file = new File(fileJd.getPath());
                } else {
                    file = new File(fileJd.getPath() + ".0");
                }
                if (file.exists()) {
                    return true;
                }
            }
            return z10;
        } catch (Exception e11) {
            nmd.wqx("TTAppOpenAdCacheManager", e11.getMessage());
            return false;
        }
    }

    public void jpo() {
        File[] fileArrListFiles;
        try {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad_materialMeta");
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad_materialMeta_new");
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("tt_openad");
        } catch (Throwable unused) {
        }
        try {
            File cacheDir = this.f19770jj.getCacheDir();
            if (cacheDir == null || !cacheDir.exists() || !cacheDir.isDirectory() || (fileArrListFiles = cacheDir.listFiles(new FileFilter() { // from class: com.bytedance.sdk.openadsdk.component.jj.4
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    if (file == null) {
                        return false;
                    }
                    String name = file.getName();
                    return name.contains(jj.f19768jd) || name.contains("openad_video_cache");
                }
            })) == null) {
                return;
            }
            for (File file : fileArrListFiles) {
                try {
                    com.bytedance.sdk.component.utils.qk.wqx(file);
                } catch (Throwable unused2) {
                }
            }
        } catch (Throwable unused3) {
        }
    }
}

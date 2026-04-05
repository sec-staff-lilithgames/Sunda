package com.bytedance.sdk.openadsdk.core.yd;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.Cif;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.multipro.cm.cm;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.pgl.ssdk.ces.out.PglSSCallBack;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
class jpo {

    /* renamed from: jd, reason: collision with root package name */
    private volatile boolean f21024jd;
    private PglSSManager jpo;
    private volatile boolean wqx = true;

    /* renamed from: cm, reason: collision with root package name */
    private volatile boolean f21023cm = false;

    public jpo() {
        jpo();
    }

    private boolean xyk() {
        if (!this.f21024jd && this.wqx) {
            jpo();
        }
        return this.f21024jd;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private Class yd() {
        try {
            this.wqx = true;
            return PglSSManager.class;
        } catch (Throwable unused) {
            this.wqx = false;
            return PglSSManager.class;
        }
    }

    private void zz() {
        if (this.jpo == null) {
            this.jpo = PglSSManager.getInstance();
        }
    }

    public String cm() {
        if (!xyk()) {
            return "";
        }
        zz();
        PglSSManager pglSSManager = this.jpo;
        return pglSSManager != null ? pglSSManager.getToken() : "";
    }

    public boolean jd() {
        return this.f21024jd;
    }

    public long jj() {
        if (!xyk()) {
            return 0L;
        }
        zz();
        PglSSManager pglSSManager = this.jpo;
        if (pglSSManager != null) {
            return pglSSManager.getECForBidding();
        }
        return 0L;
    }

    public String my() {
        if (!xyk()) {
            return "";
        }
        zz();
        PglSSManager pglSSManager = this.jpo;
        return pglSSManager != null ? pglSSManager.getSofChara() : "";
    }

    public int qk() {
        if (this.wqx) {
            return PglSSManager.getInitStatus();
        }
        return 5;
    }

    public void wqx() {
        if (xyk()) {
            zz();
            if (this.jpo != null) {
                oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yd.jpo.3
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HashMap map = new HashMap();
                            map.put(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ, sq.cm().cz());
                            jpo.this.jpo.setCustomInfo(map);
                        } catch (Throwable th2) {
                            nmd.wqx("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void jd(String str) {
        if (xyk()) {
            zz();
            PglSSManager pglSSManager = this.jpo;
            if (pglSSManager != null) {
                pglSSManager.setDeviceId(str);
            }
        }
    }

    public synchronized void jpo() {
        Context contextJpo;
        String strCm;
        if (!this.f21024jd) {
            try {
                contextJpo = sq.jpo();
                strCm = zz.jd().cm();
                if (TextUtils.isEmpty(strCm)) {
                    strCm = zz.jpo("app_id", Long.MAX_VALUE);
                }
            } catch (Throwable unused) {
                yd();
                this.f21024jd = false;
            }
            if (TextUtils.isEmpty(strCm)) {
                return;
            }
            String strJpo = Cif.jpo(contextJpo);
            String strJd = com.bytedance.sdk.openadsdk.jr.jpo.jd.jpo.jpo().jd();
            PglSSConfig pglSSConfigBuild = PglSSConfig.builder().setAppId(strCm).setOVRegionType(2).setAdsdkVersion(BuildConfig.VERSION_NAME).build();
            String strJd2 = cm.jd("ttopenadsdk", PglSSConfig.CUSTOMINFO_KEY_IPV6, "");
            HashMap map = new HashMap();
            if (!TextUtils.isEmpty(strJd2)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_IPV6, strJd2);
            }
            Set<String> setNp = au.jrx().np();
            if (setNp != null && !setNp.isEmpty()) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS, setNp);
            }
            String strOpi = tic.opi();
            if (!TextUtils.isEmpty(strOpi)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST, strOpi);
            }
            map.put(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC, au.jrx().ez());
            String strJpo2 = com.bytedance.sdk.openadsdk.rq.jpo.jpo(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, "");
            if (!TextUtils.isEmpty(strJpo2)) {
                map.put(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR, strJpo2);
            }
            pglSSConfigBuild.setCustomInfo(map);
            pglSSConfigBuild.setCallBack(new PglSSCallBack() { // from class: com.bytedance.sdk.openadsdk.core.yd.jpo.1
                @Override // com.pgl.ssdk.ces.out.PglSSCallBack
                public void reportSoftDecData(final String str, final String str2) {
                    com.bytedance.sdk.openadsdk.prr.wqx.jpo(str, false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.yd.jpo.1.1
                        @Override // com.bytedance.sdk.openadsdk.prr.jd
                        public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                            return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo(str).jd(str2);
                        }
                    });
                }
            });
            PglSSManager.init(contextJpo, pglSSConfigBuild, null, null, strJpo, strJd);
            zz();
            this.f21024jd = true;
            try {
                if (this.wqx) {
                    wqx(PglSSManager.getLoadError());
                }
            } catch (Throwable th2) {
                nmd.wqx("mssdk", th2.getMessage());
            }
        }
    }

    private void wqx(final String str) {
        if (this.f21023cm || TextUtils.isEmpty(str)) {
            return;
        }
        sq.my().jpo(new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.yd.jpo.4
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("secsdk_init_error").jd(str);
            }
        }, false);
        this.f21023cm = true;
    }

    public void jpo(String str) {
        if (xyk()) {
            zz();
            PglSSManager pglSSManager = this.jpo;
            if (pglSSManager != null) {
                pglSSManager.setGaid(str);
            }
        }
    }

    public void jpo(final Map<String, Object> map) {
        if (xyk()) {
            zz();
            if (this.jpo != null) {
                oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.yd.jpo.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            jpo.this.jpo.setCustomInfo(map);
                        } catch (Throwable th2) {
                            nmd.wqx("MSSdkImpl", "setCustomInfo", th2.getMessage());
                        }
                    }
                });
            }
        }
    }

    public void jpo(String str, Map<String, Object> map) {
        if (xyk()) {
            zz();
            PglSSManager pglSSManager = this.jpo;
            if (pglSSManager != null) {
                pglSSManager.reportNow(str, map);
            }
        }
    }

    public void jpo(MotionEvent motionEvent) {
        if (jd()) {
            zz();
            PglSSManager pglSSManager = this.jpo;
            if (pglSSManager != null) {
                pglSSManager.checkEventVirtual(motionEvent);
            }
        }
    }

    public Map<String, String> jpo(String str, byte[] bArr) {
        Map<String, String> featureHash;
        return (!xyk() || (featureHash = this.jpo.getFeatureHash(str, bArr)) == null) ? new HashMap() : featureHash;
    }
}

package com.bytedance.sdk.openadsdk.core;

import android.os.Build;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class nq {

    /* renamed from: cm, reason: collision with root package name */
    private static final AtomicInteger f20815cm;

    /* renamed from: jd, reason: collision with root package name */
    private static final AtomicInteger f20816jd;
    private static final AtomicInteger jpo;
    private static final AtomicInteger wqx;

    static {
        AtomicInteger atomicInteger = new AtomicInteger();
        jpo = atomicInteger;
        AtomicInteger atomicInteger2 = new AtomicInteger();
        f20816jd = atomicInteger2;
        AtomicInteger atomicInteger3 = new AtomicInteger();
        wqx = atomicInteger3;
        AtomicInteger atomicInteger4 = new AtomicInteger();
        f20815cm = atomicInteger4;
        atomicInteger.addAndGet(com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "encrypt_success_count", 0));
        atomicInteger2.addAndGet(com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "encrypt_fail_count", 0));
        atomicInteger3.addAndGet(com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "decrypt_success_count", 0));
        atomicInteger4.addAndGet(com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "decrypt_fail_count", 0));
    }

    private static void jd() {
        final int i10 = jpo.get();
        final int i11 = f20816jd.get();
        final int i12 = wqx.get();
        final int i13 = f20815cm.get();
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("crypt_v4_statistics", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.nq.1
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("encrypt_success_count", i10);
                    jSONObject.put("encrypt_fail_count", i11);
                    jSONObject.put("decrypt_success_count", i12);
                    jSONObject.put("decrypt_fail_count", i13);
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("crypt_v4_statistics").jd(jSONObject.toString());
            }
        });
    }

    public static void jpo() {
        try {
            long jJpo = com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "upload_time_key", 0L);
            if (jJpo <= 0 || System.currentTimeMillis() - jJpo < 86400000) {
                if (jJpo <= 0 || jJpo > System.currentTimeMillis()) {
                    com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
                    return;
                }
                return;
            }
            jd();
            synchronized (nq.class) {
                jpo.set(0);
                f20816jd.set(0);
                wqx.set(0);
                f20815cm.set(0);
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file");
                com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "upload_time_key", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Throwable unused) {
        }
    }

    public static synchronized void jd(boolean z10) {
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "encrypt_success_count", Integer.valueOf(jpo.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "encrypt_fail_count", Integer.valueOf(f20816jd.incrementAndGet()));
        }
    }

    public static void jpo(final int i10, final PangleEncryptConstant.CryptDataScene cryptDataScene, final int i11) {
        com.bytedance.sdk.openadsdk.prr.wqx.jpo("crypt_v4_fail", false, new com.bytedance.sdk.openadsdk.prr.jd() { // from class: com.bytedance.sdk.openadsdk.core.nq.2
            @Override // com.bytedance.sdk.openadsdk.prr.jd
            public com.bytedance.sdk.openadsdk.prr.jpo.wqx getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crypt", i10);
                    jSONObject.put("scene", cryptDataScene.value());
                    jSONObject.put("reason", i11);
                    if (i11 == 6) {
                        jSONObject.put("model", Build.MODEL);
                        jSONObject.put("vendor", Build.MANUFACTURER);
                    }
                } catch (Throwable unused) {
                }
                return com.bytedance.sdk.openadsdk.prr.jpo.cm.jd().jpo("crypt_v4_fail").jd(jSONObject.toString());
            }
        });
    }

    public static synchronized void jpo(boolean z10) {
        if (z10) {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "decrypt_success_count", Integer.valueOf(wqx.incrementAndGet()));
        } else {
            com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("encrypt_statistics_file", "decrypt_fail_count", Integer.valueOf(wqx.incrementAndGet()));
        }
    }

    public static void jpo(JSONObject jSONObject) {
        jd(jSONObject != null && jSONObject.optInt("cypher") == 4);
    }
}

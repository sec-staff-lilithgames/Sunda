package com.bytedance.sdk.openadsdk.core;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {
    private static volatile wqx jpo;

    private wqx() {
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

    public String jd(String str, String str2) {
        return com.bytedance.sdk.openadsdk.multipro.cm.cm.jd("ttopenadsdk", str, str2);
    }

    public int jd(String str, int i10) {
        return com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", str, i10);
    }

    public Long jd(String str, long j10) {
        return Long.valueOf(com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", str, j10));
    }

    public void jpo(String str, String str2) {
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", str, str2);
    }

    public void jpo(String str, int i10) {
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", str, Integer.valueOf(i10));
    }

    public void jpo(String str, long j10) {
        com.bytedance.sdk.openadsdk.multipro.cm.cm.jpo("ttopenadsdk", str, Long.valueOf(j10));
    }
}

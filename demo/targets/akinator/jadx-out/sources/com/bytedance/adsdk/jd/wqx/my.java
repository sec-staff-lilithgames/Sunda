package com.bytedance.adsdk.jd.wqx;

import com.bytedance.adsdk.jd.oya;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {
    private static final my jpo = new my();

    /* renamed from: jd, reason: collision with root package name */
    private final oya<String, com.bytedance.adsdk.jd.qk> f17522jd = new oya<>(20);

    public static my jpo() {
        return jpo;
    }

    public com.bytedance.adsdk.jd.qk jpo(String str) {
        if (str == null) {
            return null;
        }
        return this.f17522jd.jpo((oya<String, com.bytedance.adsdk.jd.qk>) str);
    }

    public void jpo(String str, com.bytedance.adsdk.jd.qk qkVar) {
        if (str == null) {
            return;
        }
        this.f17522jd.jpo(str, qkVar);
    }
}

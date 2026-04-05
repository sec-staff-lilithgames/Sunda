package com.bytedance.sdk.openadsdk.api.reward;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGRewardItem {

    /* renamed from: jd, reason: collision with root package name */
    private final String f19473jd;
    private final int jpo;

    public PAGRewardItem(int i10, String str) {
        this.jpo = i10;
        this.f19473jd = str;
    }

    public int getRewardAmount() {
        return this.jpo;
    }

    public String getRewardName() {
        return this.f19473jd;
    }
}

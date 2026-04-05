package com.bytedance.sdk.openadsdk.api.model;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class PAGErrorModel {

    /* renamed from: jd, reason: collision with root package name */
    private final String f19467jd;
    private final int jpo;

    public PAGErrorModel(int i10, String str) {
        this.jpo = i10;
        this.f19467jd = str;
    }

    public int getErrorCode() {
        return this.jpo;
    }

    public String getErrorMessage() {
        return this.f19467jd;
    }
}

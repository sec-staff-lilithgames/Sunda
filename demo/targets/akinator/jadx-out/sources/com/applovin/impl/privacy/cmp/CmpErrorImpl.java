package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* renamed from: a, reason: collision with root package name */
    private final AppLovinCmpError.Code f15056a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15057b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15058c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15059d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f15058c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f15059d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f15056a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f15057b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i10, String str2) {
        this.f15056a = code;
        this.f15057b = str;
        this.f15058c = i10;
        this.f15059d = str2;
    }
}

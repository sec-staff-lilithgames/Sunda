package com.applovin.impl.sdk;

import com.applovin.sdk.AppLovinSdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15703b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f15704c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AppLovinSdk.SdkInitializationListener f15705e;

    public /* synthetic */ w(k kVar, AppLovinSdk.SdkInitializationListener sdkInitializationListener, int i10) {
        this.f15703b = i10;
        this.f15704c = kVar;
        this.f15705e = sdkInitializationListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15703b) {
            case 0:
                this.f15704c.a(this.f15705e);
                break;
            default:
                this.f15704c.b(this.f15705e);
                break;
        }
    }
}

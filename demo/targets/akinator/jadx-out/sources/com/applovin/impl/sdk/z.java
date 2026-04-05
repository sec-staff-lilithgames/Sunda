package com.applovin.impl.sdk;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15713b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f15714c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.applovin.impl.sdk.ad.b f15715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Context f15716f;

    public /* synthetic */ z(m mVar, com.applovin.impl.sdk.ad.b bVar, Context context, int i10) {
        this.f15713b = i10;
        this.f15714c = mVar;
        this.f15715e = bVar;
        this.f15716f = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15713b) {
            case 0:
                this.f15714c.a(this.f15715e, this.f15716f);
                break;
            default:
                this.f15714c.b(this.f15715e, this.f15716f);
                break;
        }
    }
}

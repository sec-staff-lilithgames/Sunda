package com.applovin.impl.sdk;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15701b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f15702c;

    public /* synthetic */ v(d dVar, int i10) {
        this.f15701b = i10;
        this.f15702c = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15701b) {
            case 0:
                this.f15702c.c();
                break;
            default:
                this.f15702c.d();
                break;
        }
    }
}

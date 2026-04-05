package com.applovin.impl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class u8 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15814b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c4 f15815c;

    public /* synthetic */ u8(c4 c4Var, int i10) {
        this.f15814b = i10;
        this.f15815c = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15814b) {
            case 0:
                this.f15815c.b();
                break;
            case 1:
                this.f15815c.c();
                break;
            default:
                this.f15815c.d();
                break;
        }
    }
}

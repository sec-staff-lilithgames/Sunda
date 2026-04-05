package com.applovin.impl;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class e9 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f13951b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g4 f13952c;

    public /* synthetic */ e9(g4 g4Var, int i10) {
        this.f13951b = i10;
        this.f13952c = g4Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        switch (this.f13951b) {
            case 0:
                this.f13952c.f();
                break;
            default:
                this.f13952c.g();
                break;
        }
    }
}

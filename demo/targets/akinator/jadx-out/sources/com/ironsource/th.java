package com.ironsource;

import com.ironsource.C3136b3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class th implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f38961b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3136b3 f38962c;

    public /* synthetic */ th(C3136b3 c3136b3, int i10) {
        this.f38961b = i10;
        this.f38962c = c3136b3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f38961b) {
            case 0:
                C3136b3.a.a(this.f38962c);
                break;
            default:
                C3136b3.b.a(this.f38962c);
                break;
        }
    }
}

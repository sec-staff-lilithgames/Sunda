package com.fyber.inneractive.sdk.player.ui;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f26263b;

    public d(e eVar, boolean z10) {
        this.f26263b = eVar;
        this.f26262a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f26262a == this.f26263b.hasWindowFocus()) {
            this.f26263b.e();
        }
    }
}

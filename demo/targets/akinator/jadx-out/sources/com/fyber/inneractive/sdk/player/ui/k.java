package com.fyber.inneractive.sdk.player.ui;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f26277a;

    public k(l lVar) {
        this.f26277a = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l lVar = this.f26277a;
        int i10 = lVar.f26318j;
        if (i10 != 0) {
            int i11 = (lVar.f26317i / i10) + lVar.E;
            lVar.E = i11;
            lVar.a(i11);
        }
        l lVar2 = this.f26277a;
        if (lVar2.E < lVar2.F) {
            lVar2.postDelayed(lVar2.D, lVar2.f26319k);
            return;
        }
        lVar2.D = null;
        lVar2.E = 0;
        lVar2.F = 0;
    }
}

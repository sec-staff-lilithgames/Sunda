package com.fyber.inneractive.sdk.player.exoplayer2.source;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f25761a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f25762b;

    public k(p pVar, n nVar) {
        this.f25762b = pVar;
        this.f25761a = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n nVar = this.f25761a;
        if (nVar.f25777c != null) {
            nVar.f25777c = null;
        }
        int size = this.f25762b.f25794o.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((com.fyber.inneractive.sdk.player.exoplayer2.extractor.g) this.f25762b.f25794o.valueAt(i10)).b();
        }
    }
}

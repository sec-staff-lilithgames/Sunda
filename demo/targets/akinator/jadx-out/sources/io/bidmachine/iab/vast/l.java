package io.bidmachine.iab.vast;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f60498b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f60499c;

    public l(t tVar, u uVar) {
        this.f60499c = tVar;
        this.f60498b = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ((lm.c) this.f60498b).onVastLoaded(this.f60499c);
    }
}

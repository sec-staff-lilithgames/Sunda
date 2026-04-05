package io.bidmachine.iab.vast;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f60503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qm.b f60504c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f60505e;

    public n(t tVar, b bVar, qm.b bVar2) {
        this.f60505e = tVar;
        this.f60503b = bVar;
        this.f60504c = bVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        b bVar = this.f60503b;
        if (bVar != null) {
            ((lm.d) bVar).onVastShowFailed(this.f60505e, this.f60504c);
        }
    }
}

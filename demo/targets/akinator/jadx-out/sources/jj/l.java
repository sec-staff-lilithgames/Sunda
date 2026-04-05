package jj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public kj.a f69652a;

    /* renamed from: b, reason: collision with root package name */
    public kj.h f69653b;

    public l applicationModule(kj.a aVar) {
        this.f69652a = (kj.a) gj.e.checkNotNull(aVar);
        return this;
    }

    public p build() {
        gj.e.checkBuilderRequirement(this.f69652a, kj.a.class);
        if (this.f69653b == null) {
            this.f69653b = new kj.h();
        }
        return new m(this.f69652a, this.f69653b);
    }

    public l inflaterConfigModule(kj.h hVar) {
        this.f69653b = (kj.h) gj.e.checkNotNull(hVar);
        return this;
    }
}

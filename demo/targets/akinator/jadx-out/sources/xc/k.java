package xc;

import tb.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class k extends v {
    public k(wc.h hVar, jc.g gVar) {
        super(hVar, gVar);
    }

    @Override // xc.v, wc.j
    public v0 getTypeInclusion() {
        return v0.f86788c;
    }

    @Override // wc.j
    public k forProperty(jc.g gVar) {
        return this.f91940b == gVar ? this : new k(this.f91939a, gVar);
    }
}

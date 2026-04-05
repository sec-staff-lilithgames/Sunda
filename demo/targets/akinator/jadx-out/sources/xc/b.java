package xc;

import tb.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b extends v {
    public b(wc.h hVar, jc.g gVar) {
        super(hVar, gVar);
    }

    @Override // xc.v, wc.j
    public v0 getTypeInclusion() {
        return v0.f86789e;
    }

    @Override // wc.j
    public b forProperty(jc.g gVar) {
        return this.f91940b == gVar ? this : new b(this.f91939a, gVar);
    }
}

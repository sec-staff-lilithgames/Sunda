package xc;

import tb.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e extends i {
    public e(wc.h hVar, jc.g gVar, String str) {
        super(hVar, gVar, str);
    }

    @Override // xc.i, xc.b, xc.v, wc.j
    public v0 getTypeInclusion() {
        return v0.f86791g;
    }

    @Override // xc.i, xc.b, wc.j
    public e forProperty(jc.g gVar) {
        return this.f91940b == gVar ? this : new e(this.f91939a, gVar, this.f91905c);
    }
}

package xc;

import tb.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i extends b {

    /* renamed from: c, reason: collision with root package name */
    public final String f91905c;

    public i(wc.h hVar, jc.g gVar, String str) {
        super(hVar, gVar);
        this.f91905c = str;
    }

    @Override // xc.v, wc.j
    public String getPropertyName() {
        return this.f91905c;
    }

    @Override // xc.b, xc.v, wc.j
    public v0 getTypeInclusion() {
        return v0.f86787b;
    }

    @Override // xc.b, wc.j
    public i forProperty(jc.g gVar) {
        return this.f91940b == gVar ? this : new i(this.f91939a, gVar, this.f91905c);
    }
}

package lc;

import java.io.Serializable;
import tb.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class c0 extends i implements Serializable {
    public c0 copy() {
        c0 c0Var = new c0();
        c0Var.f73112b = this.f73112b;
        c0Var.f73113c = this.f73113c;
        c0Var.f73114e = this.f73114e;
        c0Var.f73115f = this.f73115f;
        c0Var.f73116g = this.f73116g;
        c0Var.f73117h = this.f73117h;
        c0Var.f73118i = this.f73118i;
        c0Var.f73119j = this.f73119j;
        return c0Var;
    }

    public c0 setFormat(tb.t tVar) {
        this.f73112b = tVar;
        return this;
    }

    public c0 setIgnorals(tb.z zVar) {
        this.f73115f = zVar;
        return this;
    }

    public c0 setInclude(tb.d0 d0Var) {
        this.f73113c = d0Var;
        return this;
    }

    public c0 setIncludeAsProperty(tb.d0 d0Var) {
        this.f73114e = d0Var;
        return this;
    }

    public c0 setIsIgnoredType(Boolean bool) {
        this.f73118i = bool;
        return this;
    }

    public c0 setMergeable(Boolean bool) {
        this.f73119j = bool;
        return this;
    }

    public c0 setSetterInfo(q0 q0Var) {
        this.f73116g = q0Var;
        return this;
    }

    public c0 setVisibility(tb.h hVar) {
        this.f73117h = hVar;
        return this;
    }
}

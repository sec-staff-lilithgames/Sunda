package lc;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b0 extends d implements Serializable {
    public b0 copy() {
        return new b0(this);
    }

    public b0 setAcceptBlankAsEmpty(Boolean bool) {
        this.f73091b = bool;
        return this;
    }

    public b0 setCoercion(f fVar, c cVar) {
        this.f73092c[fVar.ordinal()] = cVar;
        return this;
    }
}

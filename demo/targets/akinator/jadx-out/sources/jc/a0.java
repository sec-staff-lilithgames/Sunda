package jc;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a0 extends ub.k {
    public a0() {
        this(null);
    }

    @Override // ub.k
    public ub.k copy() {
        a(a0.class);
        return new a0(this, null);
    }

    @Override // ub.k, ub.m0
    public String getFormatName() {
        return "JSON";
    }

    @Override // ub.k
    public zb.d hasFormat(zb.c cVar) throws IOException {
        if (getClass() == a0.class) {
            return ec.a.hasJSONFormat(cVar);
        }
        return null;
    }

    public a0(f0 f0Var) {
        super(f0Var);
        if (f0Var == null) {
            setCodec(new f0(this));
        }
    }

    @Override // ub.k
    public final f0 getCodec() {
        return (f0) this.f88260i;
    }

    public a0(ub.k kVar, f0 f0Var) {
        super(kVar, f0Var);
        if (f0Var == null) {
            setCodec(new f0(this));
        }
    }
}

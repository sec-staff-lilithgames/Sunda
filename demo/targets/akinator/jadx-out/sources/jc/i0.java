package jc;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final i0 f69307f = new i0(null, null, null, null);

    /* renamed from: b, reason: collision with root package name */
    public final ub.b0 f69308b;

    /* renamed from: c, reason: collision with root package name */
    public final cc.e f69309c;

    /* renamed from: e, reason: collision with root package name */
    public final ub.c0 f69310e;

    public i0(ub.b0 b0Var, ub.g gVar, cc.e eVar, ub.c0 c0Var) {
        this.f69308b = b0Var;
        this.f69309c = eVar;
        this.f69310e = c0Var;
    }

    public void initialize(ub.o oVar) {
        ub.b0 b0Var = this.f69308b;
        if (b0Var != null) {
            if (b0Var == k0.f69338i) {
                oVar.setPrettyPrinter(null);
            } else {
                if (b0Var instanceof ic.h) {
                    b0Var = (ub.b0) ((ic.h) b0Var).createInstance();
                }
                oVar.setPrettyPrinter(b0Var);
            }
        }
        cc.e eVar = this.f69309c;
        if (eVar != null) {
            oVar.setCharacterEscapes(eVar);
        }
        ub.c0 c0Var = this.f69310e;
        if (c0Var != null) {
            oVar.setRootValueSeparator(c0Var);
        }
    }

    public i0 with(ub.b0 b0Var) {
        if (b0Var == null) {
            b0Var = k0.f69338i;
        }
        return b0Var == this.f69308b ? this : new i0(b0Var, null, this.f69309c, this.f69310e);
    }

    public i0 withRootValueSeparator(String str) {
        cc.e eVar = this.f69309c;
        ub.b0 b0Var = this.f69308b;
        ub.c0 c0Var = this.f69310e;
        if (str != null) {
            if (!str.equals(c0Var == null ? null : c0Var.getValue())) {
                return new i0(b0Var, null, eVar, new cc.q(str));
            }
        } else if (c0Var != null) {
            return new i0(b0Var, null, eVar, null);
        }
        return this;
    }

    public i0 with(ub.g gVar) {
        if (gVar == null) {
            return this;
        }
        return new i0(this.f69308b, gVar, this.f69309c, this.f69310e);
    }

    public i0 with(cc.e eVar) {
        if (this.f69309c == eVar) {
            return this;
        }
        return new i0(this.f69308b, null, eVar, this.f69310e);
    }

    public i0 withRootValueSeparator(ub.c0 c0Var) {
        cc.e eVar = this.f69309c;
        ub.b0 b0Var = this.f69308b;
        ub.c0 c0Var2 = this.f69310e;
        if (c0Var == null) {
            if (c0Var2 != null) {
                return new i0(b0Var, null, eVar, null);
            }
        } else if (!c0Var.equals(c0Var2)) {
            return new i0(b0Var, null, eVar, c0Var);
        }
        return this;
    }
}

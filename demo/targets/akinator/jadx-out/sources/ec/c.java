package ec;

import ic.m0;
import java.io.IOException;
import ub.a0;
import ub.c0;
import ub.j0;
import ub.o;
import ub.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class c extends wb.a {

    /* renamed from: t, reason: collision with root package name */
    public static final int[] f54013t = cc.d.get7BitOutputEscapes();

    /* renamed from: u, reason: collision with root package name */
    public static final ic.l f54014u = o.f88310e;

    /* renamed from: m, reason: collision with root package name */
    public final j0 f54015m;

    /* renamed from: n, reason: collision with root package name */
    public int[] f54016n;

    /* renamed from: o, reason: collision with root package name */
    public int f54017o;

    /* renamed from: p, reason: collision with root package name */
    public cc.e f54018p;

    /* renamed from: q, reason: collision with root package name */
    public c0 f54019q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f54020r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f54021s;

    public c(cc.h hVar, int i10, a0 a0Var) {
        super(hVar, i10, a0Var);
        this.f54016n = f54013t;
        this.f54019q = ub.k.f88253w;
        this.f54015m = hVar.streamWriteConstraints();
        if (ub.n.ESCAPE_NON_ASCII.enabledIn(i10)) {
            this.f54017o = 127;
        }
        this.f54021s = ub.n.WRITE_HEX_UPPER_CASE.enabledIn(i10);
        this.f54020r = !ub.n.QUOTE_FIELD_NAMES.enabledIn(i10);
    }

    @Override // wb.a, ub.o
    public o disable(ub.n nVar) {
        super.disable(nVar);
        if (nVar == ub.n.QUOTE_FIELD_NAMES) {
            this.f54020r = true;
            return this;
        }
        if (nVar == ub.n.WRITE_HEX_UPPER_CASE) {
            this.f54021s = false;
        }
        return this;
    }

    @Override // wb.a, ub.o
    public o enable(ub.n nVar) {
        super.enable(nVar);
        if (nVar == ub.n.QUOTE_FIELD_NAMES) {
            this.f54020r = false;
            return this;
        }
        if (nVar == ub.n.WRITE_HEX_UPPER_CASE) {
            this.f54021s = true;
        }
        return this;
    }

    @Override // ub.o
    public cc.e getCharacterEscapes() {
        return this.f54018p;
    }

    @Override // ub.o
    public int getHighestEscapedChar() {
        return this.f54017o;
    }

    @Override // ub.o
    public ic.l getWriteCapabilities() {
        return f54014u;
    }

    @Override // wb.a
    public final void n(int i10, int i11) {
        if ((wb.a.f90504l & i11) != 0) {
            this.f90508i = ub.n.WRITE_NUMBERS_AS_STRINGS.enabledIn(i10);
            ub.n nVar = ub.n.ESCAPE_NON_ASCII;
            if (nVar.enabledIn(i11)) {
                if (nVar.enabledIn(i10)) {
                    setHighestNonEscapedChar(127);
                } else {
                    setHighestNonEscapedChar(0);
                }
            }
            ub.n nVar2 = ub.n.STRICT_DUPLICATE_DETECTION;
            if (nVar2.enabledIn(i11)) {
                if (!nVar2.enabledIn(i10)) {
                    this.f90509j = this.f90509j.withDupDetector(null);
                } else if (this.f90509j.getDupDetector() == null) {
                    this.f90509j = this.f90509j.withDupDetector(b.rootDetector(this));
                }
            }
        }
        this.f54020r = !ub.n.QUOTE_FIELD_NAMES.enabledIn(i10);
        this.f54021s = ub.n.WRITE_HEX_UPPER_CASE.enabledIn(i10);
    }

    public final void p(String str) throws ub.m {
        e(e3.g.l("Can not ", str, ", expecting field name (context: ", this.f90509j.typeDesc(), ")"));
        throw null;
    }

    public final void q(int i10, String str) throws IOException {
        if (i10 == 0) {
            if (this.f90509j.inArray()) {
                this.f88311b.beforeArrayValues(this);
                return;
            } else {
                if (this.f90509j.inObject()) {
                    this.f88311b.beforeObjectEntries(this);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            this.f88311b.writeArrayValueSeparator(this);
            return;
        }
        if (i10 == 2) {
            this.f88311b.writeObjectFieldValueSeparator(this);
            return;
        }
        if (i10 == 3) {
            this.f88311b.writeRootValueSeparator(this);
        } else if (i10 != 5) {
            m0.throwInternal();
        } else {
            p(str);
            throw null;
        }
    }

    @Override // ub.o
    public o setCharacterEscapes(cc.e eVar) {
        this.f54018p = eVar;
        if (eVar == null) {
            this.f54016n = f54013t;
            return this;
        }
        this.f54016n = eVar.getEscapeCodesForAscii();
        return this;
    }

    @Override // ub.o
    public o setHighestNonEscapedChar(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f54017o = i10;
        return this;
    }

    @Override // ub.o
    public o setRootValueSeparator(c0 c0Var) {
        this.f54019q = c0Var;
        return this;
    }

    @Override // ub.o
    public j0 streamWriteConstraints() {
        return this.f54015m;
    }

    @Override // wb.a, ub.o, ub.q0
    public p0 version() {
        return m0.versionFor(getClass());
    }
}

package ub;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class l extends l0 {

    /* renamed from: n, reason: collision with root package name */
    public cc.e f88275n;

    /* renamed from: o, reason: collision with root package name */
    public c0 f88276o;

    /* renamed from: p, reason: collision with root package name */
    public int f88277p;

    /* renamed from: q, reason: collision with root package name */
    public char f88278q;

    public l() {
        super(l0.f88279k, l0.f88280l, l0.f88281m);
        this.f88278q = AbstractJsonLexerKt.STRING;
        this.f88276o = k.f88253w;
        this.f88277p = 0;
    }

    @Override // ub.l0
    public k build() {
        return new k(this);
    }

    public l characterEscapes(cc.e eVar) {
        this.f88275n = eVar;
        return this;
    }

    public l highestNonEscapedChar(int i10) {
        this.f88277p = i10 <= 0 ? 0 : Math.max(127, i10);
        return this;
    }

    public l quoteChar(char c10) {
        if (c10 > 127) {
            throw new IllegalArgumentException("Can only use Unicode characters up to 0x7F as quote characters");
        }
        this.f88278q = c10;
        return this;
    }

    public l rootValueSeparator(String str) {
        this.f88276o = str == null ? null : new cc.q(str);
        return this;
    }

    public cc.e characterEscapes() {
        return this.f88275n;
    }

    public int highestNonEscapedChar() {
        return this.f88277p;
    }

    public l rootValueSeparator(c0 c0Var) {
        this.f88276o = c0Var;
        return this;
    }

    @Override // ub.l0
    public l configure(ec.f fVar, boolean z10) {
        return z10 ? enable(fVar) : disable(fVar);
    }

    public char quoteChar() {
        return this.f88278q;
    }

    public c0 rootValueSeparator() {
        return this.f88276o;
    }

    @Override // ub.l0
    public l configure(ec.h hVar, boolean z10) {
        return z10 ? enable(hVar) : disable(hVar);
    }

    public l(k kVar) {
        super(kVar.f88256e, kVar.f88257f, kVar.f88258g);
        this.f88286e = kVar.f88265n;
        this.f88287f = kVar.f88266o;
        this.f88288g = kVar.f88262k;
        this.f88289h = kVar.f88264m;
        this.f88290i = kVar.f88263l;
        List list = kVar.f88267p;
        this.f88291j = list != null ? new ArrayList(list) : list;
        this.f88278q = AbstractJsonLexerKt.STRING;
        this.f88275n = kVar.getCharacterEscapes();
        this.f88276o = kVar.f88268q;
        this.f88277p = kVar.f88269r;
    }

    @Override // ub.l0
    public l disable(ec.f fVar) {
        r rVarMappedFeature = fVar.mappedFeature();
        if (rVarMappedFeature != null) {
            this.f88283b = (~rVarMappedFeature.getMask()) & this.f88283b;
        }
        return this;
    }

    @Override // ub.l0
    public l enable(ec.f fVar) {
        r rVarMappedFeature = fVar.mappedFeature();
        if (rVarMappedFeature != null) {
            this.f88283b = rVarMappedFeature.getMask() | this.f88283b;
        }
        return this;
    }

    @Override // ub.l0
    public l disable(ec.f fVar, ec.f... fVarArr) {
        r rVarMappedFeature = fVar.mappedFeature();
        if (rVarMappedFeature != null) {
            this.f88283b = (~rVarMappedFeature.getMask()) & this.f88283b;
        }
        for (ec.f fVar2 : fVarArr) {
            r rVarMappedFeature2 = fVar2.mappedFeature();
            if (rVarMappedFeature2 != null) {
                this.f88283b = rVarMappedFeature2.getMask() | this.f88283b;
            }
        }
        return this;
    }

    @Override // ub.l0
    public l enable(ec.f fVar, ec.f... fVarArr) {
        r rVarMappedFeature = fVar.mappedFeature();
        if (rVarMappedFeature != null) {
            this.f88283b = rVarMappedFeature.getMask() | this.f88283b;
        }
        enable(fVar);
        for (ec.f fVar2 : fVarArr) {
            r rVarMappedFeature2 = fVar2.mappedFeature();
            if (rVarMappedFeature2 != null) {
                this.f88283b = rVarMappedFeature2.getMask() | this.f88283b;
            }
        }
        return this;
    }

    @Override // ub.l0
    public l disable(ec.h hVar) {
        n nVarMappedFeature = hVar.mappedFeature();
        if (nVarMappedFeature != null) {
            this.f88284c = (~nVarMappedFeature.getMask()) & this.f88284c;
        }
        return this;
    }

    @Override // ub.l0
    public l enable(ec.h hVar) {
        n nVarMappedFeature = hVar.mappedFeature();
        if (nVarMappedFeature != null) {
            this.f88284c = nVarMappedFeature.getMask() | this.f88284c;
        }
        return this;
    }

    @Override // ub.l0
    public l disable(ec.h hVar, ec.h... hVarArr) {
        n nVarMappedFeature = hVar.mappedFeature();
        if (nVarMappedFeature != null) {
            this.f88284c = (~nVarMappedFeature.getMask()) & this.f88284c;
        }
        for (ec.h hVar2 : hVarArr) {
            n nVarMappedFeature2 = hVar2.mappedFeature();
            if (nVarMappedFeature2 != null) {
                this.f88284c = (~nVarMappedFeature2.getMask()) & this.f88284c;
            }
        }
        return this;
    }

    @Override // ub.l0
    public l enable(ec.h hVar, ec.h... hVarArr) {
        n nVarMappedFeature = hVar.mappedFeature();
        if (nVarMappedFeature != null) {
            this.f88284c = nVarMappedFeature.getMask() | this.f88284c;
        }
        for (ec.h hVar2 : hVarArr) {
            n nVarMappedFeature2 = hVar2.mappedFeature();
            if (nVarMappedFeature2 != null) {
                this.f88284c = nVarMappedFeature2.getMask() | this.f88284c;
            }
        }
        return this;
    }
}

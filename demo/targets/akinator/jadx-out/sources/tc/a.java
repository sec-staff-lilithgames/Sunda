package tc;

import ec.f;
import ec.h;
import jc.f0;
import lc.d0;
import lc.y;
import ub.k;
import ub.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class a extends f0 {
    public a() {
        this(new k());
    }

    public static C0786a builder() {
        return new C0786a(new a());
    }

    @Override // jc.f0, ub.a0
    public k getFactory() {
        return this.f69278b;
    }

    public boolean isEnabled(f fVar) {
        return isEnabled(fVar.mappedFeature());
    }

    public C0786a rebuild() {
        return new C0786a(copy());
    }

    @Override // jc.f0, ub.a0, ub.q0
    public p0 version() {
        return d0.f73093b;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: tc.a$a, reason: collision with other inner class name */
    public static class C0786a extends y {
        public C0786a(a aVar) {
            super(aVar);
        }

        public C0786a configure(f fVar, boolean z10) {
            f0 f0Var = this.f73174a;
            if (z10) {
                ((a) f0Var).enable(fVar.mappedFeature());
                return this;
            }
            ((a) f0Var).disable(fVar.mappedFeature());
            return this;
        }

        public C0786a disable(f... fVarArr) {
            for (f fVar : fVarArr) {
                ((a) this.f73174a).disable(fVar.mappedFeature());
            }
            return this;
        }

        public C0786a enable(f... fVarArr) {
            for (f fVar : fVarArr) {
                ((a) this.f73174a).enable(fVar.mappedFeature());
            }
            return this;
        }

        public C0786a disable(h... hVarArr) {
            for (h hVar : hVarArr) {
                ((a) this.f73174a).disable(hVar.mappedFeature());
            }
            return this;
        }

        public C0786a enable(h... hVarArr) {
            for (h hVar : hVarArr) {
                ((a) this.f73174a).enable(hVar.mappedFeature());
            }
            return this;
        }

        public C0786a configure(h hVar, boolean z10) {
            f0 f0Var = this.f73174a;
            if (z10) {
                ((a) f0Var).enable(hVar.mappedFeature());
                return this;
            }
            ((a) f0Var).disable(hVar.mappedFeature());
            return this;
        }
    }

    public a(k kVar) {
        super(kVar);
    }

    public static C0786a builder(k kVar) {
        return new C0786a(new a(kVar));
    }

    @Override // jc.f0
    public a copy() {
        b(a.class);
        return new a(null, this);
    }

    public boolean isEnabled(h hVar) {
        return isEnabled(hVar.mappedFeature());
    }
}

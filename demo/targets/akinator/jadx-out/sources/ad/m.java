package ad;

import rc.t0;
import tb.f1;
import tb.i1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m extends i1 {

    /* renamed from: c, reason: collision with root package name */
    public final zc.d f4283c;

    public m(t0 t0Var, zc.d dVar) {
        this(t0Var.getScope(), dVar);
    }

    @Override // tb.i1, tb.g1, tb.f1
    public boolean canUseFor(f1 f1Var) {
        if (f1Var.getClass() == getClass()) {
            m mVar = (m) f1Var;
            if (mVar.getScope() == this.f86717b && mVar.f4283c == this.f4283c) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.f1
    public f1 forScope(Class<?> cls) {
        return cls == this.f86717b ? this : new m(cls, this.f4283c);
    }

    @Override // tb.g1, tb.f1
    public Object generateId(Object obj) {
        zc.d dVar = this.f4283c;
        try {
            return dVar.get(obj);
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception e11) {
            throw new IllegalStateException("Problem accessing property '" + dVar.getName() + "': " + e11.getMessage(), e11);
        }
    }

    @Override // tb.f1
    public f1.a key(Object obj) {
        if (obj == null) {
            return null;
        }
        return new f1.a(getClass(), this.f86717b, obj);
    }

    public m(Class cls, zc.d dVar) {
        super(cls);
        this.f4283c = dVar;
    }

    @Override // tb.f1
    public f1 newForSerialization(Object obj) {
        return this;
    }
}

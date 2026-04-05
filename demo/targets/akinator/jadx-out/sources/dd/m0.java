package dd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f52081a;

    /* renamed from: b, reason: collision with root package name */
    public Class f52082b;

    /* renamed from: c, reason: collision with root package name */
    public jc.o f52083c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f52084d;

    public m0() {
    }

    public static final int typedHash(Class<?> cls) {
        return cls.getName().hashCode() + 1;
    }

    public static final int untypedHash(Class<?> cls) {
        return cls.getName().hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (m0Var.f52084d != this.f52084d) {
            return false;
        }
        Class cls = this.f52082b;
        return cls != null ? m0Var.f52082b == cls : this.f52083c.equals(m0Var.f52083c);
    }

    public Class<?> getRawType() {
        return this.f52082b;
    }

    public jc.o getType() {
        return this.f52083c;
    }

    public final int hashCode() {
        return this.f52081a;
    }

    public boolean isTyped() {
        return this.f52084d;
    }

    public final void resetTyped(Class<?> cls) {
        this.f52083c = null;
        this.f52082b = cls;
        this.f52084d = true;
        this.f52081a = typedHash(cls);
    }

    public final void resetUntyped(Class<?> cls) {
        this.f52083c = null;
        this.f52082b = cls;
        this.f52084d = false;
        this.f52081a = untypedHash(cls);
    }

    public final String toString() {
        if (this.f52082b != null) {
            StringBuilder sb2 = new StringBuilder("{class: ");
            a.b.z(this.f52082b, sb2, ", typed? ");
            return a.b.q(sb2, this.f52084d, "}");
        }
        StringBuilder sb3 = new StringBuilder("{type: ");
        sb3.append(this.f52083c);
        sb3.append(", typed? ");
        return a.b.q(sb3, this.f52084d, "}");
    }

    public m0(m0 m0Var) {
        this.f52081a = m0Var.f52081a;
        this.f52082b = m0Var.f52082b;
        this.f52083c = m0Var.f52083c;
        this.f52084d = m0Var.f52084d;
    }

    public static final int typedHash(jc.o oVar) {
        return oVar.hashCode() - 2;
    }

    public static final int untypedHash(jc.o oVar) {
        return oVar.hashCode() - 1;
    }

    public final void resetTyped(jc.o oVar) {
        this.f52083c = oVar;
        this.f52082b = null;
        this.f52084d = true;
        this.f52081a = typedHash(oVar);
    }

    public final void resetUntyped(jc.o oVar) {
        this.f52083c = oVar;
        this.f52082b = null;
        this.f52084d = false;
        this.f52081a = untypedHash(oVar);
    }

    public m0(Class<?> cls, boolean z10) {
        this.f52082b = cls;
        this.f52083c = null;
        this.f52084d = z10;
        this.f52081a = z10 ? typedHash(cls) : untypedHash(cls);
    }

    public m0(jc.o oVar, boolean z10) {
        this.f52083c = oVar;
        this.f52082b = null;
        this.f52084d = z10;
        this.f52081a = z10 ? typedHash(oVar) : untypedHash(oVar);
    }
}

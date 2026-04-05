package tb;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class q0 implements a, Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final q0 f86761e;

    /* renamed from: b, reason: collision with root package name */
    public final e1 f86762b;

    /* renamed from: c, reason: collision with root package name */
    public final e1 f86763c;

    static {
        e1 e1Var = e1.f86709f;
        f86761e = new q0(e1Var, e1Var);
    }

    public q0(e1 e1Var, e1 e1Var2) {
        this.f86762b = e1Var;
        this.f86763c = e1Var2;
    }

    public static q0 construct(e1 e1Var, e1 e1Var2) {
        e1 e1Var3 = e1.f86709f;
        if (e1Var == null) {
            e1Var = e1Var3;
        }
        if (e1Var2 == null) {
            e1Var2 = e1Var3;
        }
        return (e1Var == e1Var3 && e1Var2 == e1Var3) ? f86761e : new q0(e1Var, e1Var2);
    }

    public static q0 empty() {
        return f86761e;
    }

    public static q0 forContentNulls(e1 e1Var) {
        return construct(e1.f86709f, e1Var);
    }

    public static q0 forValueNulls(e1 e1Var) {
        return construct(e1Var, e1.f86709f);
    }

    public static q0 from(r0 r0Var) {
        return r0Var == null ? f86761e : construct(r0Var.nulls(), r0Var.contentNulls());
    }

    public static q0 merge(q0 q0Var, q0 q0Var2) {
        return q0Var == null ? q0Var2 : q0Var.withOverrides(q0Var2);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == q0.class) {
            q0 q0Var = (q0) obj;
            if (q0Var.f86762b == this.f86762b && q0Var.f86763c == this.f86763c) {
                return true;
            }
        }
        return false;
    }

    public e1 getContentNulls() {
        return this.f86763c;
    }

    public e1 getValueNulls() {
        return this.f86762b;
    }

    public int hashCode() {
        return this.f86762b.ordinal() + (this.f86763c.ordinal() << 2);
    }

    public e1 nonDefaultContentNulls() {
        e1 e1Var = e1.f86709f;
        e1 e1Var2 = this.f86763c;
        if (e1Var2 == e1Var) {
            return null;
        }
        return e1Var2;
    }

    public e1 nonDefaultValueNulls() {
        e1 e1Var = e1.f86709f;
        e1 e1Var2 = this.f86762b;
        if (e1Var2 == e1Var) {
            return null;
        }
        return e1Var2;
    }

    public String toString() {
        return "JsonSetter.Value(valueNulls=" + this.f86762b + ",contentNulls=" + this.f86763c + ")";
    }

    @Override // tb.a
    public Class<r0> valueFor() {
        return r0.class;
    }

    public q0 withContentNulls(e1 e1Var) {
        if (e1Var == null) {
            e1Var = e1.f86709f;
        }
        return e1Var == this.f86763c ? this : construct(this.f86762b, e1Var);
    }

    public q0 withOverrides(q0 q0Var) {
        if (q0Var != null && q0Var != f86761e) {
            e1 e1Var = q0Var.f86762b;
            e1 e1Var2 = q0Var.f86763c;
            e1 e1Var3 = this.f86762b;
            e1 e1Var4 = e1.f86709f;
            if (e1Var == e1Var4) {
                e1Var = e1Var3;
            }
            e1 e1Var5 = this.f86763c;
            if (e1Var2 == e1Var4) {
                e1Var2 = e1Var5;
            }
            if (e1Var != e1Var3 || e1Var2 != e1Var5) {
                return construct(e1Var, e1Var2);
            }
        }
        return this;
    }

    public q0 withValueNulls(e1 e1Var) {
        if (e1Var == null) {
            e1Var = e1.f86709f;
        }
        return e1Var == this.f86762b ? this : construct(e1Var, this.f86763c);
    }

    public static q0 forValueNulls(e1 e1Var, e1 e1Var2) {
        return construct(e1Var, e1Var2);
    }

    public q0 withValueNulls(e1 e1Var, e1 e1Var2) {
        e1 e1Var3 = e1.f86709f;
        if (e1Var == null) {
            e1Var = e1Var3;
        }
        if (e1Var2 == null) {
            e1Var2 = e1Var3;
        }
        return (e1Var == this.f86762b && e1Var2 == this.f86763c) ? this : construct(e1Var, e1Var2);
    }
}

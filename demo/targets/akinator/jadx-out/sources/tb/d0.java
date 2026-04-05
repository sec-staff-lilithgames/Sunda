package tb;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d0 implements a, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f86701g;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f86702b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f86703c;

    /* renamed from: e, reason: collision with root package name */
    public final Class f86704e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f86705f;

    static {
        c0 c0Var = c0.f86699h;
        f86701g = new d0(c0Var, c0Var, null, null);
    }

    public d0(e0 e0Var) {
        this(e0Var.value(), e0Var.content(), e0Var.valueFilter(), e0Var.contentFilter());
    }

    public static d0 construct(c0 c0Var, c0 c0Var2) {
        c0 c0Var3 = c0.f86699h;
        return ((c0Var == c0Var3 || c0Var == null) && (c0Var2 == c0Var3 || c0Var2 == null)) ? f86701g : new d0(c0Var, c0Var2, null, null);
    }

    public static d0 empty() {
        return f86701g;
    }

    public static d0 from(e0 e0Var) {
        d0 d0Var = f86701g;
        if (e0Var == null) {
            return d0Var;
        }
        c0 c0VarValue = e0Var.value();
        c0 c0VarContent = e0Var.content();
        c0 c0Var = c0.f86699h;
        if (c0VarValue == c0Var && c0VarContent == c0Var) {
            return d0Var;
        }
        Class clsValueFilter = e0Var.valueFilter();
        if (clsValueFilter == Void.class) {
            clsValueFilter = null;
        }
        Class clsContentFilter = e0Var.contentFilter();
        return new d0(c0VarValue, c0VarContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
    }

    public static d0 merge(d0 d0Var, d0 d0Var2) {
        return d0Var == null ? d0Var2 : d0Var.withOverrides(d0Var2);
    }

    public static d0 mergeAll(d0... d0VarArr) {
        d0 d0Var = null;
        for (d0 d0VarWithOverrides : d0VarArr) {
            if (d0VarWithOverrides != null) {
                if (d0Var != null) {
                    d0VarWithOverrides = d0Var.withOverrides(d0VarWithOverrides);
                }
                d0Var = d0VarWithOverrides;
            }
        }
        return d0Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return d0Var.f86702b == this.f86702b && d0Var.f86703c == this.f86703c && d0Var.f86704e == this.f86704e && d0Var.f86705f == this.f86705f;
    }

    public Class<?> getContentFilter() {
        return this.f86705f;
    }

    public c0 getContentInclusion() {
        return this.f86703c;
    }

    public Class<?> getValueFilter() {
        return this.f86704e;
    }

    public c0 getValueInclusion() {
        return this.f86702b;
    }

    public int hashCode() {
        return this.f86703c.hashCode() + (this.f86702b.hashCode() << 2);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(80);
        sb2.append("JsonInclude.Value(value=");
        sb2.append(this.f86702b);
        sb2.append(",content=");
        sb2.append(this.f86703c);
        Class cls = this.f86704e;
        if (cls != null) {
            sb2.append(",valueFilter=");
            sb2.append(cls.getName());
            sb2.append(".class");
        }
        Class cls2 = this.f86705f;
        if (cls2 != null) {
            sb2.append(",contentFilter=");
            sb2.append(cls2.getName());
            sb2.append(".class");
        }
        sb2.append(')');
        return sb2.toString();
    }

    @Override // tb.a
    public Class<e0> valueFor() {
        return e0.class;
    }

    public d0 withContentFilter(Class<?> cls) {
        c0 c0Var;
        if (cls == null || cls == Void.class) {
            c0Var = c0.f86699h;
            cls = null;
        } else {
            c0Var = c0.f86698g;
        }
        return construct(this.f86702b, c0Var, this.f86704e, cls);
    }

    public d0 withContentInclusion(c0 c0Var) {
        if (c0Var == this.f86703c) {
            return this;
        }
        return new d0(this.f86702b, c0Var, this.f86704e, this.f86705f);
    }

    public d0 withOverrides(d0 d0Var) {
        if (d0Var != null && d0Var != f86701g) {
            c0 c0Var = d0Var.f86702b;
            c0 c0Var2 = d0Var.f86703c;
            Class cls = d0Var.f86704e;
            Class cls2 = d0Var.f86705f;
            c0 c0Var3 = c0.f86699h;
            c0 c0Var4 = this.f86702b;
            boolean z10 = (c0Var == c0Var4 || c0Var == c0Var3) ? false : true;
            c0 c0Var5 = this.f86703c;
            boolean z11 = (c0Var2 == c0Var5 || c0Var2 == c0Var3) ? false : true;
            Class cls3 = this.f86704e;
            boolean z12 = (cls == cls3 && cls2 == cls3) ? false : true;
            if (z10) {
                return z11 ? new d0(c0Var, c0Var2, cls, cls2) : new d0(c0Var, c0Var5, cls, cls2);
            }
            if (z11) {
                return new d0(c0Var4, c0Var2, cls, cls2);
            }
            if (z12) {
                return new d0(c0Var4, c0Var5, cls, cls2);
            }
        }
        return this;
    }

    public d0 withValueFilter(Class<?> cls) {
        c0 c0Var;
        if (cls == null || cls == Void.class) {
            c0Var = c0.f86699h;
            cls = null;
        } else {
            c0Var = c0.f86698g;
        }
        return construct(c0Var, this.f86703c, cls, this.f86705f);
    }

    public d0 withValueInclusion(c0 c0Var) {
        if (c0Var == this.f86702b) {
            return this;
        }
        return new d0(c0Var, this.f86703c, this.f86704e, this.f86705f);
    }

    public d0(c0 c0Var, c0 c0Var2, Class cls, Class cls2) {
        c0 c0Var3 = c0.f86699h;
        this.f86702b = c0Var == null ? c0Var3 : c0Var;
        this.f86703c = c0Var2 == null ? c0Var3 : c0Var2;
        this.f86704e = cls == Void.class ? null : cls;
        this.f86705f = cls2 == Void.class ? null : cls2;
    }

    public static d0 construct(c0 c0Var, c0 c0Var2, Class<?> cls, Class<?> cls2) {
        if (cls == Void.class) {
            cls = null;
        }
        if (cls2 == Void.class) {
            cls2 = null;
        }
        c0 c0Var3 = c0.f86699h;
        if ((c0Var == c0Var3 || c0Var == null) && ((c0Var2 == c0Var3 || c0Var2 == null) && cls == null && cls2 == null)) {
            return f86701g;
        }
        return new d0(c0Var, c0Var2, cls, cls2);
    }
}

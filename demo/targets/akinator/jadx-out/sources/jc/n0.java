package jc;

import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class n0 implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final n0 f69381f = new n0("", null);

    /* renamed from: g, reason: collision with root package name */
    public static final n0 f69382g = new n0(new String(""), null);

    /* renamed from: b, reason: collision with root package name */
    public final String f69383b;

    /* renamed from: c, reason: collision with root package name */
    public final String f69384c;

    /* renamed from: e, reason: collision with root package name */
    public ub.c0 f69385e;

    public n0(String str) {
        this(str, null);
    }

    public static n0 construct(String str) {
        return (str == null || str.isEmpty()) ? f69381f : new n0(ic.i.f59487c.intern(str), null);
    }

    public static n0 merge(n0 n0Var, n0 n0Var2) {
        if (n0Var == null) {
            return n0Var2;
        }
        String str = n0Var.f69383b;
        String str2 = n0Var.f69384c;
        if (n0Var2 != null) {
            String str3 = n0Var2.f69383b;
            String str4 = n0Var2.f69384c;
            if (n0Var != f69382g) {
                String str5 = (str2 != null && (str4 == null || !str2.isEmpty())) ? str2 : str4;
                String str6 = (str != null && (str3 == null || !str.isEmpty())) ? str : str3;
                if (str5 != str2 || str6 != str) {
                    return (str5 == str4 && str6 == str3) ? n0Var2 : construct(str6, str5);
                }
            }
        }
        return n0Var;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        String str = n0Var.f69384c;
        String str2 = n0Var.f69383b;
        String str3 = this.f69383b;
        if (str3 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str3.equals(str2)) {
            return false;
        }
        String str4 = this.f69384c;
        return str4 == null ? str == null : str4.equals(str);
    }

    public String getNamespace() {
        return this.f69384c;
    }

    public String getSimpleName() {
        return this.f69383b;
    }

    public boolean hasNamespace() {
        return this.f69384c != null;
    }

    public boolean hasSimpleName() {
        return !this.f69383b.isEmpty();
    }

    public int hashCode() {
        return Objects.hashCode(this.f69384c) + (Objects.hashCode(this.f69383b) * 31);
    }

    public n0 internSimpleName() {
        String strIntern;
        String str = this.f69383b;
        return (str.isEmpty() || (strIntern = ic.i.f59487c.intern(str)) == str) ? this : new n0(strIntern, this.f69384c);
    }

    public boolean isEmpty() {
        return this.f69384c == null && this.f69383b.isEmpty();
    }

    public ub.c0 simpleAsEncoded(lc.z zVar) {
        ub.c0 c0Var = this.f69385e;
        if (c0Var != null) {
            return c0Var;
        }
        String str = this.f69383b;
        ub.c0 qVar = zVar == null ? new cc.q(str) : zVar.compileString(str);
        this.f69385e = qVar;
        return qVar;
    }

    public String toString() {
        String str = this.f69383b;
        String str2 = this.f69384c;
        if (str2 == null) {
            return str;
        }
        return "{" + str2 + "}" + str;
    }

    public n0 withNamespace(String str) {
        String str2 = this.f69384c;
        return (str != null ? !str.equals(str2) : str2 != null) ? new n0(this.f69383b, str) : this;
    }

    public n0 withSimpleName(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this.f69383b) ? this : new n0(str, this.f69384c);
    }

    public n0(String str, String str2) {
        this.f69383b = dd.i.nonNullString(str);
        this.f69384c = str2;
    }

    public boolean hasSimpleName(String str) {
        return this.f69383b.equals(str);
    }

    public static n0 construct(String str, String str2) {
        if (str == null) {
            str = "";
        }
        if (str2 == null && str.isEmpty()) {
            return f69381f;
        }
        return new n0(ic.i.f59487c.intern(str), str2);
    }
}

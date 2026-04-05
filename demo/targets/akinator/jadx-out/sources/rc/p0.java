package rc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p0 {

    /* renamed from: c, reason: collision with root package name */
    public static final Class[] f84242c = new Class[0];

    /* renamed from: a, reason: collision with root package name */
    public final String f84243a;

    /* renamed from: b, reason: collision with root package name */
    public final Class[] f84244b;

    public p0(Method method) {
        this(method.getName(), method.getParameterTypes().length > 0 ? method.getParameterTypes() : f84242c);
    }

    public int argCount() {
        return this.f84244b.length;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != p0.class) {
            return false;
        }
        p0 p0Var = (p0) obj;
        if (!this.f84243a.equals(p0Var.f84243a)) {
            return false;
        }
        Class[] clsArr = p0Var.f84244b;
        Class[] clsArr2 = this.f84244b;
        int length = clsArr2.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (clsArr[i10] != clsArr2[i10]) {
                return false;
            }
        }
        return true;
    }

    public String getName() {
        return this.f84243a;
    }

    public int hashCode() {
        return this.f84243a.hashCode() + this.f84244b.length;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f84243a);
        sb2.append("(");
        return a.b.f(this.f84244b.length, "-args)", sb2);
    }

    public p0(Constructor<?> constructor) {
        this("", constructor.getParameterCount() > 0 ? constructor.getParameterTypes() : f84242c);
    }

    public p0(String str, Class<?>[] clsArr) {
        this.f84243a = str;
        this.f84244b = clsArr == null ? f84242c : clsArr;
    }
}

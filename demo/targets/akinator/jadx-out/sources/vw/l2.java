package vw;

import java.lang.annotation.Annotation;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f89963a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f89964b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f89965c;

    /* renamed from: d, reason: collision with root package name */
    public final String f89966d;

    public l2(i0 i0Var, Annotation annotation) {
        this.f89964b = i0Var.getDeclaringClass();
        this.f89963a = annotation.annotationType();
        this.f89966d = i0Var.getName();
        this.f89965c = i0Var.getType();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        if (l2Var == this) {
            return true;
        }
        if (l2Var.f89963a == this.f89963a && l2Var.f89964b == this.f89964b && l2Var.f89965c == this.f89965c) {
            return l2Var.f89966d.equals(this.f89966d);
        }
        return false;
    }

    public int hashCode() {
        return this.f89966d.hashCode() ^ this.f89964b.hashCode();
    }

    public String toString() {
        return "key '" + this.f89966d + "' for " + this.f89964b;
    }
}

package androidx.lifecycle;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f6587a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f6588b;

    public h(Method method, int i10) throws SecurityException {
        this.f6587a = i10;
        this.f6588b = method;
        method.setAccessible(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f6587a == hVar.f6587a && this.f6588b.getName().equals(hVar.f6588b.getName());
    }

    public int hashCode() {
        return this.f6588b.getName().hashCode() + (this.f6587a * 31);
    }
}

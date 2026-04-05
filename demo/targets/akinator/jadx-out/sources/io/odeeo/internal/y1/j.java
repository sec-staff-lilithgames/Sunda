package io.odeeo.internal.y1;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Method f67588a;

    /* renamed from: b, reason: collision with root package name */
    public final List<?> f67589b;

    public j(Method method, List<?> list) {
        this.f67588a = method;
        this.f67589b = Collections.unmodifiableList(list);
    }

    public static j of(Method method, List<?> list) {
        w.a(method, "method == null");
        w.a(list, "arguments == null");
        return new j(method, new ArrayList(list));
    }

    public List<?> arguments() {
        return this.f67589b;
    }

    public Method method() {
        return this.f67588a;
    }

    public String toString() {
        return String.format("%s.%s() %s", this.f67588a.getDeclaringClass().getName(), this.f67588a.getName(), this.f67589b);
    }
}

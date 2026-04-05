package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class SubscriberMethod {

    /* renamed from: a, reason: collision with root package name */
    final Method f40184a;

    /* renamed from: b, reason: collision with root package name */
    final ThreadMode f40185b;

    /* renamed from: c, reason: collision with root package name */
    final Class<?> f40186c;

    /* renamed from: d, reason: collision with root package name */
    String f40187d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f40184a = method;
        this.f40185b = threadMode;
        this.f40186c = cls;
    }

    private synchronized void a() {
        if (this.f40187d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f40184a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f40184a.getName());
            sb2.append('(');
            sb2.append(this.f40186c.getName());
            this.f40187d = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f40187d.equals(((SubscriberMethod) obj).f40187d);
    }

    public int hashCode() {
        return this.f40184a.hashCode();
    }
}

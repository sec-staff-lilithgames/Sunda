package lc;

import java.security.PrivilegedAction;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class x implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f73173a;

    public x(ClassLoader classLoader) {
        this.f73173a = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public ServiceLoader<Object> run() {
        ClassLoader classLoader = this.f73173a;
        return classLoader == null ? ServiceLoader.load(jc.c0.class) : ServiceLoader.load(jc.c0.class, classLoader);
    }
}

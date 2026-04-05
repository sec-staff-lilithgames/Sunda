package jc;

import java.security.PrivilegedAction;
import java.util.ServiceLoader;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 implements PrivilegedAction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ClassLoader f69271a;

    public e0(ClassLoader classLoader) {
        this.f69271a = classLoader;
    }

    @Override // java.security.PrivilegedAction
    public ServiceLoader<Object> run() {
        ClassLoader classLoader = this.f69271a;
        return classLoader == null ? ServiceLoader.load(c0.class) : ServiceLoader.load(c0.class, classLoader);
    }
}

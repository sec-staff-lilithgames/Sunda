package wc;

import java.io.Closeable;
import java.io.Serializable;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final a f90532b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f90533a;

    public a() {
        HashSet hashSet = new HashSet();
        this.f90533a = hashSet;
        hashSet.add(Object.class.getName());
        hashSet.add(Closeable.class.getName());
        hashSet.add(Serializable.class.getName());
        hashSet.add(AutoCloseable.class.getName());
        hashSet.add(Cloneable.class.getName());
        hashSet.add(Runnable.class.getName());
        hashSet.add("java.util.logging.Handler");
        hashSet.add("javax.naming.Referenceable");
        hashSet.add("javax.sql.DataSource");
    }

    public boolean isUnsafeBaseType(Class<?> cls) {
        return this.f90533a.contains(cls.getName());
    }
}

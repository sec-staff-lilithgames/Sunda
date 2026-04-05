package androidx.datastore.preferences.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d1 implements p2 {

    /* renamed from: a, reason: collision with root package name */
    public static final d1 f5848a = new d1();

    public static d1 getInstance() {
        return f5848a;
    }

    @Override // androidx.datastore.preferences.protobuf.p2
    public boolean isSupported(Class<?> cls) {
        return f1.class.isAssignableFrom(cls);
    }

    @Override // androidx.datastore.preferences.protobuf.p2
    public o2 messageInfoFor(Class<?> cls) {
        if (!f1.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (o2) f1.g(cls.asSubclass(f1.class)).f(3);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}

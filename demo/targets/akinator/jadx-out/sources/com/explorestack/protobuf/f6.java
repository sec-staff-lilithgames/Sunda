package com.explorestack.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f6 implements i9 {

    /* renamed from: a, reason: collision with root package name */
    public static final f6 f22132a = new f6();

    public static f6 getInstance() {
        return f22132a;
    }

    @Override // com.explorestack.protobuf.i9
    public boolean isSupported(Class<?> cls) {
        return h6.class.isAssignableFrom(cls);
    }

    @Override // com.explorestack.protobuf.i9
    public h9 messageInfoFor(Class<?> cls) {
        if (!h6.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (h9) h6.d(cls.asSubclass(h6.class)).c();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}

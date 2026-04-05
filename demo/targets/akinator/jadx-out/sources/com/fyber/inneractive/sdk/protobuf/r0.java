package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r0 implements b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final r0 f26464a = new r0();

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final boolean a(Class cls) {
        return z0.class.isAssignableFrom(cls);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.b2
    public final r2 b(Class cls) {
        if (!z0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (r2) z0.getDefaultInstance(cls.asSubclass(z0.class)).buildMessageInfo();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}

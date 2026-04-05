package io.bidmachine.analytics.internal;

import java.security.SecureRandom;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f60028a = new f0();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal f60029b = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public SecureRandom initialValue() {
            return f0.f60028a.a();
        }
    }

    private f0() {
    }

    private final SecureRandom b() {
        SecureRandom secureRandom = (SecureRandom) f60029b.get();
        return secureRandom == null ? a() : secureRandom;
    }

    public final byte[] a(int i10) {
        byte[] bArr = new byte[i10];
        f60028a.b().nextBytes(bArr);
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SecureRandom a() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}

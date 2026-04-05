package io.bidmachine.analytics.internal;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECGenParameterSpec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r implements D {

    /* renamed from: a, reason: collision with root package name */
    private final KeyPairGenerator f60266a;

    public r() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC");
        keyPairGenerator.initialize(new ECGenParameterSpec("secp256r1"));
        this.f60266a = keyPairGenerator;
    }

    @Override // io.bidmachine.analytics.internal.D
    public KeyPairGenerator b() {
        return this.f60266a;
    }
}

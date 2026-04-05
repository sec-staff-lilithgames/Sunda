package io.bidmachine.analytics.internal;

import java.security.KeyPair;
import java.security.KeyPairGenerator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface D {
    default KeyPair a() {
        return b().generateKeyPair();
    }

    KeyPairGenerator b();
}

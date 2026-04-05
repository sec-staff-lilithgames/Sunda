package io.ktor.util;

import bv.b;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class GenerateOnlyNonceManager implements NonceManager {
    public static final GenerateOnlyNonceManager INSTANCE = new GenerateOnlyNonceManager();

    private GenerateOnlyNonceManager() {
    }

    @Override // io.ktor.util.NonceManager
    public Object newNonce(d<? super String> dVar) {
        return CryptoKt.generateNonce();
    }

    @Override // io.ktor.util.NonceManager
    public Object verifyNonce(String str, d<? super Boolean> dVar) {
        return b.boxBoolean(true);
    }
}

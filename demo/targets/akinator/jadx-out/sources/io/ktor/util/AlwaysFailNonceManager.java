package io.ktor.util;

import tu.f;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@InternalAPI
@f
/* loaded from: classes8.dex */
public final class AlwaysFailNonceManager implements NonceManager {
    public static final AlwaysFailNonceManager INSTANCE = new AlwaysFailNonceManager();

    private AlwaysFailNonceManager() {
    }

    @Override // io.ktor.util.NonceManager
    public Object newNonce(d<? super String> dVar) {
        throw new UnsupportedOperationException("This manager should never be used");
    }

    @Override // io.ktor.util.NonceManager
    public Object verifyNonce(String str, d<? super Boolean> dVar) {
        throw new UnsupportedOperationException("This manager should never be used");
    }
}

package io.ktor.util;

import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface NonceManager {
    Object newNonce(d<? super String> dVar);

    Object verifyNonce(String str, d<? super Boolean> dVar);
}

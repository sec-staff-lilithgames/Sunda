package io.ktor.util;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class HashFunctionKt {
    public static final byte[] digest(HashFunction hashFunction, byte[] input, int i10, int i11) {
        e0.checkNotNullParameter(hashFunction, "<this>");
        e0.checkNotNullParameter(input, "input");
        hashFunction.update(input, i10, i11);
        return hashFunction.digest();
    }

    public static /* synthetic */ byte[] digest$default(HashFunction hashFunction, byte[] bArr, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = bArr.length;
        }
        return digest(hashFunction, bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int leftRotate(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }
}

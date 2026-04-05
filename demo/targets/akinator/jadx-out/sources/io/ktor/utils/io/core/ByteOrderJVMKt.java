package io.ktor.utils.io.core;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ByteOrderJVMKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ByteOrder orderOf(java.nio.ByteOrder byteOrder) {
        return byteOrder == java.nio.ByteOrder.BIG_ENDIAN ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
    }
}

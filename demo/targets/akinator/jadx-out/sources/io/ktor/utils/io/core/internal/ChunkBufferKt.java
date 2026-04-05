package io.ktor.utils.io.core.internal;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class ChunkBufferKt {
    public static final boolean isExclusivelyOwned(ChunkBuffer chunkBuffer) {
        e0.checkNotNullParameter(chunkBuffer, "<this>");
        return chunkBuffer.getReferenceCount() == 1;
    }
}

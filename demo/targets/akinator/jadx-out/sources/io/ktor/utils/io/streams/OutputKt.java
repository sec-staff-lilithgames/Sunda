package io.ktor.utils.io.streams;

import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.internal.ChunkBuffer;
import java.io.OutputStream;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class OutputKt {
    public static final Output asOutput(OutputStream outputStream) {
        e0.checkNotNullParameter(outputStream, "<this>");
        return new OutputStreamAdapter(ChunkBuffer.Companion.getPool(), outputStream);
    }
}

package io.ktor.util;

import io.ktor.utils.io.core.Input;
import io.ktor.utils.io.core.InputArraysKt;
import java.io.InputStream;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class InputJvmKt {
    public static final InputStream asStream(final Input input) {
        e0.checkNotNullParameter(input, "<this>");
        return new InputStream() { // from class: io.ktor.util.InputJvmKt.asStream.1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                input.close();
            }

            @Override // java.io.InputStream
            public int read() {
                if (input.getEndOfInput()) {
                    return -1;
                }
                return input.readByte();
            }

            @Override // java.io.InputStream
            public long skip(long j10) {
                return input.discard(j10);
            }

            @Override // java.io.InputStream
            public int read(byte[] buffer, int i10, int i11) {
                e0.checkNotNullParameter(buffer, "buffer");
                if (input.getEndOfInput()) {
                    return -1;
                }
                return InputArraysKt.readAvailable(input, buffer, i10, i11);
            }
        };
    }
}

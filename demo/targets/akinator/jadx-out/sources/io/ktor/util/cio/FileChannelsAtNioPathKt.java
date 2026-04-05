package io.ktor.util.cio;

import io.ktor.utils.io.ByteReadChannel;
import java.io.File;
import java.nio.file.Path;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class FileChannelsAtNioPathKt {
    public static final ByteReadChannel readChannel(Path path, long j10, long j11) {
        e0.checkNotNullParameter(path, "<this>");
        File file = path.toFile();
        e0.checkNotNullExpressionValue(file, "toFile()");
        return FileChannelsKt.readChannel$default(file, j10, j11, null, 4, null);
    }

    public static final ByteReadChannel readChannel(Path path) {
        e0.checkNotNullParameter(path, "<this>");
        File file = path.toFile();
        e0.checkNotNullExpressionValue(file, "toFile()");
        return FileChannelsKt.readChannel$default(file, 0L, 0L, null, 7, null);
    }
}

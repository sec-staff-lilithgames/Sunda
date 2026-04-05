package com.applovin.shadow.okhttp3.internal.cache2;

import com.applovin.shadow.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        e0.checkNotNullParameter(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j10, Buffer sink, long j11) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        long j12 = j10;
        long j13 = j11;
        while (j13 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j12, j13, sink);
            j12 += jTransferTo;
            j13 -= jTransferTo;
        }
    }

    public final void write(long j10, Buffer source, long j11) throws IOException {
        e0.checkNotNullParameter(source, "source");
        if (j11 < 0 || j11 > source.size()) {
            throw new IndexOutOfBoundsException();
        }
        long j12 = j10;
        long j13 = j11;
        while (j13 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(source, j12, j13);
            j12 += jTransferFrom;
            j13 -= jTransferFrom;
        }
    }
}

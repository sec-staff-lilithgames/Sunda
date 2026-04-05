package com.applovin.shadow.okio.internal;

import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ForwardingSource;
import com.applovin.shadow.okio.Source;
import java.io.IOException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class FixedLengthSource extends ForwardingSource {
    private long bytesReceived;
    private final long size;
    private final boolean truncate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedLengthSource(Source delegate, long j10, boolean z10) {
        super(delegate);
        e0.checkNotNullParameter(delegate, "delegate");
        this.size = j10;
        this.truncate = z10;
    }

    private final void truncateToSize(Buffer buffer, long j10) throws IOException {
        Buffer buffer2 = new Buffer();
        buffer2.writeAll(buffer);
        buffer.write(buffer2, j10);
        buffer2.clear();
    }

    @Override // com.applovin.shadow.okio.ForwardingSource, com.applovin.shadow.okio.Source
    public long read(Buffer sink, long j10) throws IOException {
        e0.checkNotNullParameter(sink, "sink");
        long j11 = this.bytesReceived;
        long j12 = this.size;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.truncate) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long j14 = super.read(sink, j10);
        if (j14 != -1) {
            this.bytesReceived += j14;
        }
        long j15 = this.bytesReceived;
        long j16 = this.size;
        if ((j15 >= j16 || j14 != -1) && j15 <= j16) {
            return j14;
        }
        if (j14 > 0 && j15 > j16) {
            truncateToSize(sink, sink.size() - (this.bytesReceived - this.size));
        }
        throw new IOException("expected " + this.size + " bytes but got " + this.bytesReceived);
    }
}

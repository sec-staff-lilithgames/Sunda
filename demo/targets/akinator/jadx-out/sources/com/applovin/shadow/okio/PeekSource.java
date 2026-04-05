package com.applovin.shadow.okio;

import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    public PeekSource(BufferedSource upstream) {
        e0.checkNotNullParameter(upstream, "upstream");
        this.upstream = upstream;
        Buffer buffer = upstream.getBuffer();
        this.buffer = buffer;
        Segment segment = buffer.head;
        this.expectedSegment = segment;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r4.pos) goto L15;
     */
    @Override // com.applovin.shadow.okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(com.applovin.shadow.okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.e0.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L74
            boolean r3 = r8.closed
            if (r3 != 0) goto L6c
            com.applovin.shadow.okio.Segment r3 = r8.expectedSegment
            if (r3 == 0) goto L2b
            com.applovin.shadow.okio.Buffer r4 = r8.buffer
            com.applovin.shadow.okio.Segment r4 = r4.head
            if (r3 != r4) goto L23
            int r3 = r8.expectedPos
            kotlin.jvm.internal.e0.checkNotNull(r4)
            int r4 = r4.pos
            if (r3 != r4) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            com.applovin.shadow.okio.BufferedSource r0 = r8.upstream
            long r1 = r8.pos
            r3 = 1
            long r1 = r1 + r3
            boolean r0 = r0.request(r1)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            com.applovin.shadow.okio.Segment r0 = r8.expectedSegment
            if (r0 != 0) goto L51
            com.applovin.shadow.okio.Buffer r0 = r8.buffer
            com.applovin.shadow.okio.Segment r0 = r0.head
            if (r0 == 0) goto L51
            r8.expectedSegment = r0
            kotlin.jvm.internal.e0.checkNotNull(r0)
            int r0 = r0.pos
            r8.expectedPos = r0
        L51:
            com.applovin.shadow.okio.Buffer r0 = r8.buffer
            long r0 = r0.size()
            long r2 = r8.pos
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            com.applovin.shadow.okio.Buffer r2 = r8.buffer
            long r4 = r8.pos
            r3 = r9
            r2.copyTo(r3, r4, r6)
            long r9 = r8.pos
            long r9 = r9 + r6
            r8.pos = r9
            return r6
        L6c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L74:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = p0.o2.m(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.PeekSource.read(com.applovin.shadow.okio.Buffer, long):long");
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return this.upstream.timeout();
    }
}

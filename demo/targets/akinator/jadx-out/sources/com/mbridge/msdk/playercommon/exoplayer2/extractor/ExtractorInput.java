package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface ExtractorInput {
    void advancePeekPosition(int i10) throws InterruptedException, IOException;

    boolean advancePeekPosition(int i10, boolean z10) throws InterruptedException, IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    void peekFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException;

    int read(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    void readFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException;

    void resetPeekPosition();

    <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable;

    int skip(int i10) throws InterruptedException, IOException;

    void skipFully(int i10) throws InterruptedException, IOException;

    boolean skipFully(int i10, boolean z10) throws InterruptedException, IOException;
}

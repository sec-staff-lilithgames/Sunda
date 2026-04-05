package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class DefaultExtractorInput implements ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final DataSource dataSource;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    public DefaultExtractorInput(DataSource dataSource, long j10, long j11) {
        this.dataSource = dataSource;
        this.position = j10;
        this.streamLength = j11;
    }

    private void commitBytesRead(int i10) {
        if (i10 != -1) {
            this.position += i10;
        }
    }

    private void ensureSpaceForPeek(int i10) {
        int i11 = this.peekBufferPosition + i10;
        byte[] bArr = this.peekBuffer;
        if (i11 > bArr.length) {
            this.peekBuffer = Arrays.copyOf(this.peekBuffer, Util.constrainValue(bArr.length * 2, 65536 + i11, i11 + PEEK_MAX_FREE_SPACE));
        }
    }

    private int readFromDataSource(byte[] bArr, int i10, int i11, int i12, boolean z10) throws InterruptedException, IOException {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        int i13 = this.dataSource.read(bArr, i10 + i12, i11 - i12);
        if (i13 != -1) {
            return i12 + i13;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    private int readFromPeekBuffer(byte[] bArr, int i10, int i11) {
        int i12 = this.peekBufferLength;
        if (i12 == 0) {
            return 0;
        }
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.peekBuffer, 0, bArr, i10, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int skipFromPeekBuffer(int i10) {
        int iMin = Math.min(this.peekBufferLength, i10);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i10) {
        int i11 = this.peekBufferLength - i10;
        this.peekBufferLength = i11;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i11 < bArr.length - PEEK_MAX_FREE_SPACE ? new byte[65536 + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.peekBuffer = bArr2;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i10, boolean z10) throws InterruptedException, IOException {
        ensureSpaceForPeek(i10);
        int iMin = Math.min(this.peekBufferLength - this.peekBufferPosition, i10);
        while (iMin < i10) {
            int i11 = i10;
            boolean z11 = z10;
            iMin = readFromDataSource(this.peekBuffer, this.peekBufferPosition, i11, iMin, z11);
            if (iMin == -1) {
                return false;
            }
            i10 = i11;
            z10 = z11;
        }
        int i12 = this.peekBufferPosition + i10;
        this.peekBufferPosition = i12;
        this.peekBufferLength = Math.max(this.peekBufferLength, i12);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + this.peekBufferPosition;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException {
        if (!advancePeekPosition(i11, z10)) {
            return false;
        }
        System.arraycopy(this.peekBuffer, this.peekBufferPosition - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public int read(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i10, i11);
        if (fromPeekBuffer == 0) {
            fromPeekBuffer = readFromDataSource(bArr, i10, i11, 0, true);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i10, i11);
        while (fromPeekBuffer < i11 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromDataSource(bArr, i10, i11, fromPeekBuffer, z10);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j10, E e10) throws Throwable {
        Assertions.checkArgument(j10 >= 0);
        this.position = j10;
        throw e10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public int skip(int i10) throws InterruptedException, IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i10);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            iSkipFromPeekBuffer = readFromDataSource(bArr, 0, Math.min(i10, bArr.length), 0, true);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i10, boolean z10) throws InterruptedException, IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i10);
        while (iSkipFromPeekBuffer < i10 && iSkipFromPeekBuffer != -1) {
            iSkipFromPeekBuffer = readFromDataSource(this.scratchSpace, -iSkipFromPeekBuffer, Math.min(i10, this.scratchSpace.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z10);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        peekFully(bArr, i10, i11, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        readFully(bArr, i10, i11, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i10) throws InterruptedException, IOException {
        advancePeekPosition(i10, false);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i10) throws InterruptedException, IOException {
        skipFully(i10, false);
    }
}

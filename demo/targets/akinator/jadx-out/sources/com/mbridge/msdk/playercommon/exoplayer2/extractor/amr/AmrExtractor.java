package com.mbridge.msdk.playercommon.exoplayer2.extractor.amr;

import a.b;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AmrExtractor implements Extractor {
    private static final int MAX_FRAME_SIZE_BYTES;
    private static final int SAMPLE_RATE_NB = 8000;
    private static final int SAMPLE_RATE_WB = 16000;
    private static final int SAMPLE_TIME_PER_FRAME_US = 20000;
    private static final int[] frameSizeBytesByTypeWb;
    private int currentSampleBytesRemaining;
    private long currentSampleTimeUs;
    private int currentSampleTotalBytes;
    private boolean hasOutputFormat;
    private boolean isWideBand;
    private final byte[] scratch = new byte[1];
    private TrackOutput trackOutput;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.amr.AmrExtractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new AmrExtractor()};
        }
    };
    private static final int[] frameSizeBytesByTypeNb = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final byte[] amrSignatureNb = Util.getUtf8Bytes("#!AMR\n");
    private static final byte[] amrSignatureWb = Util.getUtf8Bytes("#!AMR-WB\n");

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        frameSizeBytesByTypeWb = iArr;
        MAX_FRAME_SIZE_BYTES = iArr[8];
    }

    public static byte[] amrSignatureNb() {
        byte[] bArr = amrSignatureNb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static byte[] amrSignatureWb() {
        byte[] bArr = amrSignatureWb;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public static int frameSizeBytesByTypeNb(int i10) {
        return frameSizeBytesByTypeNb[i10];
    }

    public static int frameSizeBytesByTypeWb(int i10) {
        return frameSizeBytesByTypeWb[i10];
    }

    private int getFrameSizeInBytes(int i10) throws ParserException {
        if (isValidFrameType(i10)) {
            return this.isWideBand ? frameSizeBytesByTypeWb[i10] : frameSizeBytesByTypeNb[i10];
        }
        StringBuilder sb2 = new StringBuilder("Illegal AMR ");
        sb2.append(this.isWideBand ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw new ParserException(sb2.toString());
    }

    private boolean isNarrowBandValidFrameType(int i10) {
        if (this.isWideBand) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    private boolean isValidFrameType(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return isWideBandValidFrameType(i10) || isNarrowBandValidFrameType(i10);
    }

    private boolean isWideBandValidFrameType(int i10) {
        if (this.isWideBand) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    private void maybeOutputFormat() {
        if (this.hasOutputFormat) {
            return;
        }
        this.hasOutputFormat = true;
        boolean z10 = this.isWideBand;
        this.trackOutput.format(Format.createAudioSampleFormat(null, z10 ? MimeTypes.AUDIO_AMR_WB : MimeTypes.AUDIO_AMR_NB, null, -1, MAX_FRAME_SIZE_BYTES, 1, z10 ? SAMPLE_RATE_WB : 8000, -1, null, null, 0, null));
    }

    private boolean peekAmrSignature(ExtractorInput extractorInput, byte[] bArr) throws InterruptedException, IOException {
        extractorInput.resetPeekPosition();
        byte[] bArr2 = new byte[bArr.length];
        extractorInput.peekFully(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private boolean readAmrHeader(ExtractorInput extractorInput) throws InterruptedException, IOException {
        byte[] bArr = amrSignatureNb;
        if (peekAmrSignature(extractorInput, bArr)) {
            this.isWideBand = false;
            extractorInput.skipFully(bArr.length);
            return true;
        }
        byte[] bArr2 = amrSignatureWb;
        if (!peekAmrSignature(extractorInput, bArr2)) {
            return false;
        }
        this.isWideBand = true;
        extractorInput.skipFully(bArr2.length);
        return true;
    }

    private int readNextSampleSize(ExtractorInput extractorInput) throws InterruptedException, IOException {
        extractorInput.resetPeekPosition();
        extractorInput.peekFully(this.scratch, 0, 1);
        byte b10 = this.scratch[0];
        if ((b10 & 131) <= 0) {
            return getFrameSizeInBytes((b10 >> 3) & 15);
        }
        throw new ParserException(b.e(b10, "Invalid padding bits for frame header "));
    }

    private int readSample(ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (this.currentSampleBytesRemaining == 0) {
            try {
                int nextSampleSize = readNextSampleSize(extractorInput);
                this.currentSampleTotalBytes = nextSampleSize;
                this.currentSampleBytesRemaining = nextSampleSize;
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iSampleData = this.trackOutput.sampleData(extractorInput, this.currentSampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i10 = this.currentSampleBytesRemaining - iSampleData;
        this.currentSampleBytesRemaining = i10;
        if (i10 > 0) {
            return 0;
        }
        this.trackOutput.sampleMetadata(this.currentSampleTimeUs, 1, this.currentSampleTotalBytes, 0, null);
        this.currentSampleTimeUs += 20000;
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.trackOutput = extractorOutput.track(0, 1);
        extractorOutput.endTracks();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        if (extractorInput.getPosition() == 0 && !readAmrHeader(extractorInput)) {
            throw new ParserException("Could not find AMR header.");
        }
        maybeOutputFormat();
        return readSample(extractorInput);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        this.currentSampleTimeUs = 0L;
        this.currentSampleTotalBytes = 0;
        this.currentSampleBytesRemaining = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return readAmrHeader(extractorInput);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void release() {
    }
}

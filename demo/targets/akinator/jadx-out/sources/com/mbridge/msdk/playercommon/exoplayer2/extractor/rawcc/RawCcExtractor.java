package com.mbridge.msdk.playercommon.exoplayer2.extractor.rawcc;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class RawCcExtractor implements Extractor {
    private static final int HEADER_ID = Util.getIntegerCodeForString("RCC\u0001");
    private static final int HEADER_SIZE = 8;
    private static final int SCRATCH_SIZE = 9;
    private static final int STATE_READING_HEADER = 0;
    private static final int STATE_READING_SAMPLES = 2;
    private static final int STATE_READING_TIMESTAMP_AND_COUNT = 1;
    private static final int TIMESTAMP_SIZE_V0 = 4;
    private static final int TIMESTAMP_SIZE_V1 = 8;
    private final Format format;
    private int remainingSampleCount;
    private int sampleBytesWritten;
    private long timestampUs;
    private TrackOutput trackOutput;
    private int version;
    private final ParsableByteArray dataScratch = new ParsableByteArray(9);
    private int parserState = 0;

    public RawCcExtractor(Format format) {
        this.format = format;
    }

    private boolean parseHeader(ExtractorInput extractorInput) throws InterruptedException, IOException {
        this.dataScratch.reset();
        if (!extractorInput.readFully(this.dataScratch.data, 0, 8, true)) {
            return false;
        }
        if (this.dataScratch.readInt() != HEADER_ID) {
            throw new IOException("Input not RawCC");
        }
        this.version = this.dataScratch.readUnsignedByte();
        return true;
    }

    private void parseSamples(ExtractorInput extractorInput) throws InterruptedException, IOException {
        while (this.remainingSampleCount > 0) {
            this.dataScratch.reset();
            extractorInput.readFully(this.dataScratch.data, 0, 3);
            this.trackOutput.sampleData(this.dataScratch, 3);
            this.sampleBytesWritten += 3;
            this.remainingSampleCount--;
        }
        int i10 = this.sampleBytesWritten;
        if (i10 > 0) {
            this.trackOutput.sampleMetadata(this.timestampUs, 1, i10, 0, null);
        }
    }

    private boolean parseTimestampAndSampleCount(ExtractorInput extractorInput) throws InterruptedException, IOException {
        this.dataScratch.reset();
        int i10 = this.version;
        if (i10 == 0) {
            if (!extractorInput.readFully(this.dataScratch.data, 0, 5, true)) {
                return false;
            }
            this.timestampUs = (this.dataScratch.readUnsignedInt() * 1000) / 45;
        } else {
            if (i10 != 1) {
                throw new ParserException("Unsupported version number: " + this.version);
            }
            if (!extractorInput.readFully(this.dataScratch.data, 0, 9, true)) {
                return false;
            }
            this.timestampUs = this.dataScratch.readLong();
        }
        this.remainingSampleCount = this.dataScratch.readUnsignedByte();
        this.sampleBytesWritten = 0;
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
        this.trackOutput = extractorOutput.track(0, 3);
        extractorOutput.endTracks();
        this.trackOutput.format(this.format);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        while (true) {
            int i10 = this.parserState;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    parseSamples(extractorInput);
                    this.parserState = 1;
                    return 0;
                }
                if (!parseTimestampAndSampleCount(extractorInput)) {
                    this.parserState = 0;
                    return -1;
                }
                this.parserState = 2;
            } else {
                if (!parseHeader(extractorInput)) {
                    return -1;
                }
                this.parserState = 1;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        this.parserState = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        this.dataScratch.reset();
        extractorInput.peekFully(this.dataScratch.data, 0, 8);
        return this.dataScratch.readInt() == HEADER_ID;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void release() {
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
abstract class StreamReader {
    private static final int STATE_END_OF_INPUT = 3;
    private static final int STATE_READ_HEADERS = 0;
    private static final int STATE_READ_PAYLOAD = 2;
    private static final int STATE_SKIP_HEADERS = 1;
    private long currentGranule;
    private ExtractorOutput extractorOutput;
    private boolean formatSet;
    private long lengthOfReadPacket;
    private final OggPacket oggPacket = new OggPacket();
    private OggSeeker oggSeeker;
    private long payloadStartPosition;
    private int sampleRate;
    private boolean seekMapSet;
    private SetupData setupData;
    private int state;
    private long targetGranule;
    private TrackOutput trackOutput;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class SetupData {
        Format format;
        OggSeeker oggSeeker;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class UnseekableOggSeeker implements OggSeeker {
        private UnseekableOggSeeker() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public SeekMap createSeekMap() {
            return new SeekMap.Unseekable(C.TIME_UNSET);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public long read(ExtractorInput extractorInput) throws InterruptedException, IOException {
            return -1L;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public long startSeek(long j10) {
            return 0L;
        }
    }

    private int readHeaders(ExtractorInput extractorInput) throws InterruptedException, IOException {
        StreamReader streamReader;
        boolean headers = true;
        while (headers) {
            if (!this.oggPacket.populate(extractorInput)) {
                this.state = 3;
                return -1;
            }
            this.lengthOfReadPacket = extractorInput.getPosition() - this.payloadStartPosition;
            headers = readHeaders(this.oggPacket.getPayload(), this.payloadStartPosition, this.setupData);
            if (headers) {
                this.payloadStartPosition = extractorInput.getPosition();
            }
        }
        Format format = this.setupData.format;
        this.sampleRate = format.sampleRate;
        if (!this.formatSet) {
            this.trackOutput.format(format);
            this.formatSet = true;
        }
        OggSeeker oggSeeker = this.setupData.oggSeeker;
        if (oggSeeker != null) {
            this.oggSeeker = oggSeeker;
        } else {
            if (extractorInput.getLength() != -1) {
                OggPageHeader pageHeader = this.oggPacket.getPageHeader();
                streamReader = this;
                streamReader.oggSeeker = new DefaultOggSeeker(this.payloadStartPosition, extractorInput.getLength(), streamReader, pageHeader.headerSize + pageHeader.bodySize, pageHeader.granulePosition);
                streamReader.setupData = null;
                streamReader.state = 2;
                streamReader.oggPacket.trimPayload();
                return 0;
            }
            this.oggSeeker = new UnseekableOggSeeker();
        }
        streamReader = this;
        streamReader.setupData = null;
        streamReader.state = 2;
        streamReader.oggPacket.trimPayload();
        return 0;
    }

    private int readPayload(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        long j10 = this.oggSeeker.read(extractorInput);
        if (j10 >= 0) {
            positionHolder.position = j10;
            return 1;
        }
        if (j10 < -1) {
            onSeekEnd(-(j10 + 2));
        }
        if (!this.seekMapSet) {
            this.extractorOutput.seekMap(this.oggSeeker.createSeekMap());
            this.seekMapSet = true;
        }
        if (this.lengthOfReadPacket <= 0 && !this.oggPacket.populate(extractorInput)) {
            this.state = 3;
            return -1;
        }
        this.lengthOfReadPacket = 0L;
        ParsableByteArray payload = this.oggPacket.getPayload();
        long jPreparePayload = preparePayload(payload);
        if (jPreparePayload >= 0) {
            long j11 = this.currentGranule;
            if (j11 + jPreparePayload >= this.targetGranule) {
                long jConvertGranuleToTime = convertGranuleToTime(j11);
                this.trackOutput.sampleData(payload, payload.limit());
                this.trackOutput.sampleMetadata(jConvertGranuleToTime, 1, payload.limit(), 0, null);
                this.targetGranule = -1L;
            }
        }
        this.currentGranule += jPreparePayload;
        return 0;
    }

    public long convertGranuleToTime(long j10) {
        return (j10 * 1000000) / this.sampleRate;
    }

    public long convertTimeToGranule(long j10) {
        return (this.sampleRate * j10) / 1000000;
    }

    public void init(ExtractorOutput extractorOutput, TrackOutput trackOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = trackOutput;
        reset(true);
    }

    public void onSeekEnd(long j10) {
        this.currentGranule = j10;
    }

    public abstract long preparePayload(ParsableByteArray parsableByteArray);

    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        int i10 = this.state;
        if (i10 == 0) {
            return readHeaders(extractorInput);
        }
        if (i10 != 1) {
            if (i10 == 2) {
                return readPayload(extractorInput, positionHolder);
            }
            throw new IllegalStateException();
        }
        extractorInput.skipFully((int) this.payloadStartPosition);
        this.state = 2;
        return 0;
    }

    public abstract boolean readHeaders(ParsableByteArray parsableByteArray, long j10, SetupData setupData) throws InterruptedException, IOException;

    public void reset(boolean z10) {
        if (z10) {
            this.setupData = new SetupData();
            this.payloadStartPosition = 0L;
            this.state = 0;
        } else {
            this.state = 1;
        }
        this.targetGranule = -1L;
        this.currentGranule = 0L;
    }

    public final void seek(long j10, long j11) {
        this.oggPacket.reset();
        if (j10 == 0) {
            reset(!this.seekMapSet);
        } else if (this.state != 0) {
            this.targetGranule = this.oggSeeker.startSeek(j11);
            this.state = 2;
        }
    }
}

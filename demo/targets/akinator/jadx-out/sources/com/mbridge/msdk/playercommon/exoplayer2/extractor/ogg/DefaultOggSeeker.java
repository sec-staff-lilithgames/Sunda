package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class DefaultOggSeeker implements OggSeeker {
    private static final int DEFAULT_OFFSET = 30000;
    public static final int MATCH_BYTE_RANGE = 100000;
    public static final int MATCH_RANGE = 72000;
    private static final int STATE_IDLE = 3;
    private static final int STATE_READ_LAST_PAGE = 1;
    private static final int STATE_SEEK = 2;
    private static final int STATE_SEEK_TO_END = 0;
    private long end;
    private long endGranule;
    private final long endPosition;
    private final OggPageHeader pageHeader = new OggPageHeader();
    private long positionBeforeSeekToEnd;
    private long start;
    private long startGranule;
    private final long startPosition;
    private int state;
    private final StreamReader streamReader;
    private long targetGranule;
    private long totalGranules;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class OggSeekMap implements SeekMap {
        private OggSeekMap() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return DefaultOggSeeker.this.streamReader.convertGranuleToTime(DefaultOggSeeker.this.totalGranules);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j10) {
            if (j10 == 0) {
                return new SeekMap.SeekPoints(new SeekPoint(0L, DefaultOggSeeker.this.startPosition));
            }
            long jConvertTimeToGranule = DefaultOggSeeker.this.streamReader.convertTimeToGranule(j10);
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            return new SeekMap.SeekPoints(new SeekPoint(j10, defaultOggSeeker.getEstimatedPosition(defaultOggSeeker.startPosition, jConvertTimeToGranule, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL)));
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }
    }

    public DefaultOggSeeker(long j10, long j11, StreamReader streamReader, int i10, long j12) {
        Assertions.checkArgument(j10 >= 0 && j11 > j10);
        this.streamReader = streamReader;
        this.startPosition = j10;
        this.endPosition = j11;
        if (i10 != j11 - j10) {
            this.state = 0;
        } else {
            this.totalGranules = j12;
            this.state = 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getEstimatedPosition(long j10, long j11, long j12) {
        long j13 = this.endPosition;
        long j14 = this.startPosition;
        long j15 = ((((j13 - j14) * j11) / this.totalGranules) - j12) + j10;
        if (j15 >= j14) {
            j14 = j15;
        }
        return j14 >= j13 ? j13 - 1 : j14;
    }

    public long getNextSeekPosition(long j10, ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (this.start == this.end) {
            return -(this.startGranule + 2);
        }
        long position = extractorInput.getPosition();
        if (!skipToNextPage(extractorInput, this.end)) {
            long j11 = this.start;
            if (j11 != position) {
                return j11;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.pageHeader.populate(extractorInput, false);
        extractorInput.resetPeekPosition();
        OggPageHeader oggPageHeader = this.pageHeader;
        long j12 = oggPageHeader.granulePosition;
        long j13 = j10 - j12;
        int i10 = oggPageHeader.headerSize + oggPageHeader.bodySize;
        if (j13 >= 0 && j13 <= 72000) {
            extractorInput.skipFully(i10);
            return -(this.pageHeader.granulePosition + 2);
        }
        if (j13 < 0) {
            this.end = position;
            this.endGranule = j12;
        } else {
            long j14 = i10;
            long position2 = extractorInput.getPosition() + j14;
            this.start = position2;
            this.startGranule = this.pageHeader.granulePosition;
            if ((this.end - position2) + j14 < 100000) {
                extractorInput.skipFully(i10);
                return -(this.startGranule + 2);
            }
        }
        long j15 = this.end;
        long j16 = this.start;
        if (j15 - j16 < 100000) {
            this.end = j16;
            return j16;
        }
        long j17 = i10;
        long j18 = j13 > 0 ? 1L : 2L;
        long position3 = extractorInput.getPosition();
        long j19 = this.end;
        long j20 = this.start;
        return Math.min(Math.max((((j19 - j20) * j13) / (this.endGranule - this.startGranule)) + (position3 - (j17 * j18)), j20), this.end - 1);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public long read(ExtractorInput extractorInput) throws InterruptedException, IOException {
        DefaultOggSeeker defaultOggSeeker;
        ExtractorInput extractorInput2;
        DefaultOggSeeker defaultOggSeeker2;
        int i10 = this.state;
        if (i10 == 0) {
            defaultOggSeeker = this;
            extractorInput2 = extractorInput;
            long position = extractorInput2.getPosition();
            defaultOggSeeker.positionBeforeSeekToEnd = position;
            defaultOggSeeker.state = 1;
            long j10 = defaultOggSeeker.endPosition - 65307;
            if (j10 > position) {
                return j10;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                long j11 = this.targetGranule;
                long jSkipToPageOfGranule = 0;
                if (j11 == 0) {
                    defaultOggSeeker2 = this;
                } else {
                    long nextSeekPosition = getNextSeekPosition(j11, extractorInput);
                    if (nextSeekPosition >= 0) {
                        return nextSeekPosition;
                    }
                    defaultOggSeeker2 = this;
                    jSkipToPageOfGranule = defaultOggSeeker2.skipToPageOfGranule(extractorInput, this.targetGranule, -(nextSeekPosition + 2));
                }
                defaultOggSeeker2.state = 3;
                return -(jSkipToPageOfGranule + 2);
            }
            defaultOggSeeker = this;
            extractorInput2 = extractorInput;
        }
        defaultOggSeeker.totalGranules = readGranuleOfLastPage(extractorInput2);
        defaultOggSeeker.state = 3;
        return defaultOggSeeker.positionBeforeSeekToEnd;
    }

    public long readGranuleOfLastPage(ExtractorInput extractorInput) throws InterruptedException, IOException {
        skipToNextPage(extractorInput);
        this.pageHeader.reset();
        while ((this.pageHeader.type & 4) != 4 && extractorInput.getPosition() < this.endPosition) {
            this.pageHeader.populate(extractorInput, false);
            OggPageHeader oggPageHeader = this.pageHeader;
            extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
        }
        return this.pageHeader.granulePosition;
    }

    public void resetSeeking() {
        this.start = this.startPosition;
        this.end = this.endPosition;
        this.startGranule = 0L;
        this.endGranule = this.totalGranules;
    }

    public void skipToNextPage(ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (!skipToNextPage(extractorInput, this.endPosition)) {
            throw new EOFException();
        }
    }

    public long skipToPageOfGranule(ExtractorInput extractorInput, long j10, long j11) throws InterruptedException, IOException {
        this.pageHeader.populate(extractorInput, false);
        while (true) {
            OggPageHeader oggPageHeader = this.pageHeader;
            if (oggPageHeader.granulePosition >= j10) {
                extractorInput.resetPeekPosition();
                return j11;
            }
            extractorInput.skipFully(oggPageHeader.headerSize + oggPageHeader.bodySize);
            OggPageHeader oggPageHeader2 = this.pageHeader;
            long j12 = oggPageHeader2.granulePosition;
            oggPageHeader2.populate(extractorInput, false);
            j11 = j12;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public long startSeek(long j10) {
        int i10 = this.state;
        Assertions.checkArgument(i10 == 3 || i10 == 2);
        this.targetGranule = j10 != 0 ? this.streamReader.convertTimeToGranule(j10) : 0L;
        this.state = 2;
        resetSeeking();
        return this.targetGranule;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
    public OggSeekMap createSeekMap() {
        if (this.totalGranules != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    public boolean skipToNextPage(ExtractorInput extractorInput, long j10) throws InterruptedException, IOException {
        int i10;
        long jMin = Math.min(j10 + 3, this.endPosition);
        int position = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            int i11 = 0;
            if (extractorInput.getPosition() + position > jMin && (position = (int) (jMin - extractorInput.getPosition())) < 4) {
                return false;
            }
            extractorInput.peekFully(bArr, 0, position, false);
            while (true) {
                i10 = position - 3;
                if (i11 < i10) {
                    if (bArr[i11] == 79 && bArr[i11 + 1] == 103 && bArr[i11 + 2] == 103 && bArr[i11 + 3] == 83) {
                        extractorInput.skipFully(i11);
                        return true;
                    }
                    i11++;
                }
            }
            extractorInput.skipFully(i10);
        }
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Id3Peeker;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Mp3Extractor implements Extractor {
    public static final int FLAG_DISABLE_ID3_METADATA = 2;
    public static final int FLAG_ENABLE_CONSTANT_BITRATE_SEEKING = 1;
    private static final int MAX_SNIFF_BYTES = 16384;
    private static final int MAX_SYNC_BYTES = 131072;
    private static final int MPEG_AUDIO_HEADER_MASK = -128000;
    private static final int SCRATCH_LENGTH = 10;
    private static final int SEEK_HEADER_UNSET = 0;
    private long basisTimeUs;
    private ExtractorOutput extractorOutput;
    private final int flags;
    private final long forcedFirstSampleTimestampUs;
    private final GaplessInfoHolder gaplessInfoHolder;
    private final Id3Peeker id3Peeker;
    private Metadata metadata;
    private int sampleBytesRemaining;
    private long samplesRead;
    private final ParsableByteArray scratch;
    private Seeker seeker;
    private final MpegAudioHeader synchronizedHeader;
    private int synchronizedHeaderData;
    private TrackOutput trackOutput;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new Mp3Extractor()};
        }
    };
    private static final int SEEK_HEADER_XING = Util.getIntegerCodeForString("Xing");
    private static final int SEEK_HEADER_INFO = Util.getIntegerCodeForString("Info");
    private static final int SEEK_HEADER_VBRI = Util.getIntegerCodeForString("VBRI");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Seeker extends SeekMap {
        long getTimeUs(long j10);
    }

    public Mp3Extractor() {
        this(0);
    }

    private Seeker getConstantBitrateSeeker(ExtractorInput extractorInput) throws InterruptedException, IOException {
        extractorInput.peekFully(this.scratch.data, 0, 4);
        this.scratch.setPosition(0);
        MpegAudioHeader.populateHeader(this.scratch.readInt(), this.synchronizedHeader);
        return new ConstantBitrateSeeker(extractorInput.getLength(), extractorInput.getPosition(), this.synchronizedHeader);
    }

    private static int getSeekFrameHeader(ParsableByteArray parsableByteArray, int i10) {
        if (parsableByteArray.limit() >= i10 + 4) {
            parsableByteArray.setPosition(i10);
            int i11 = parsableByteArray.readInt();
            if (i11 == SEEK_HEADER_XING || i11 == SEEK_HEADER_INFO) {
                return i11;
            }
        }
        if (parsableByteArray.limit() < 40) {
            return 0;
        }
        parsableByteArray.setPosition(36);
        int i12 = parsableByteArray.readInt();
        int i13 = SEEK_HEADER_VBRI;
        if (i12 == i13) {
            return i13;
        }
        return 0;
    }

    private static boolean headersMatch(int i10, long j10) {
        return ((long) (i10 & MPEG_AUDIO_HEADER_MASK)) == (j10 & (-128000));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker maybeReadSeekFrame(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput r10) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r9 = this;
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r5 = new com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader r0 = r9.synchronizedHeader
            int r0 = r0.frameSize
            r5.<init>(r0)
            byte[] r0 = r5.data
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader r1 = r9.synchronizedHeader
            int r1 = r1.frameSize
            r6 = 0
            r10.peekFully(r0, r6, r1)
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader r0 = r9.synchronizedHeader
            int r1 = r0.version
            r2 = 1
            r1 = r1 & r2
            if (r1 == 0) goto L23
            int r0 = r0.channels
            if (r0 == r2) goto L27
            r0 = 36
        L21:
            r7 = r0
            goto L2d
        L23:
            int r0 = r0.channels
            if (r0 == r2) goto L2a
        L27:
            r0 = 21
            goto L21
        L2a:
            r0 = 13
            goto L21
        L2d:
            int r8 = getSeekFrameHeader(r5, r7)
            int r0 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.SEEK_HEADER_XING
            if (r8 == r0) goto L59
            int r0 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.SEEK_HEADER_INFO
            if (r8 != r0) goto L3a
            goto L59
        L3a:
            int r0 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.SEEK_HEADER_VBRI
            if (r8 != r0) goto L54
            long r0 = r10.getLength()
            long r2 = r10.getPosition()
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader r4 = r9.synchronizedHeader
            com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.VbriSeeker r0 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.VbriSeeker.create(r0, r2, r4, r5)
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader r1 = r9.synchronizedHeader
            int r1 = r1.frameSize
            r10.skipFully(r1)
            return r0
        L54:
            r10.resetPeekPosition()
            r10 = 0
            return r10
        L59:
            long r0 = r10.getLength()
            long r2 = r10.getPosition()
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader r4 = r9.synchronizedHeader
            com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.XingSeeker r0 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.XingSeeker.create(r0, r2, r4, r5)
            if (r0 == 0) goto L91
            com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder r1 = r9.gaplessInfoHolder
            boolean r1 = r1.hasGaplessInfo()
            if (r1 != 0) goto L91
            r10.resetPeekPosition()
            int r7 = r7 + 141
            r10.advancePeekPosition(r7)
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r1 = r9.scratch
            byte[] r1 = r1.data
            r2 = 3
            r10.peekFully(r1, r6, r2)
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r1 = r9.scratch
            r1.setPosition(r6)
            com.mbridge.msdk.playercommon.exoplayer2.extractor.GaplessInfoHolder r1 = r9.gaplessInfoHolder
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r2 = r9.scratch
            int r2 = r2.readUnsignedInt24()
            r1.setFromXingHeaderValue(r2)
        L91:
            com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader r1 = r9.synchronizedHeader
            int r1 = r1.frameSize
            r10.skipFully(r1)
            if (r0 == 0) goto La9
            boolean r1 = r0.isSeekable()
            if (r1 != 0) goto La9
            int r1 = com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.SEEK_HEADER_INFO
            if (r8 != r1) goto La9
            com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor$Seeker r10 = r9.getConstantBitrateSeeker(r10)
            return r10
        La9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.maybeReadSeekFrame(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput):com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor$Seeker");
    }

    private int readSample(ExtractorInput extractorInput) throws InterruptedException, IOException {
        if (this.sampleBytesRemaining == 0) {
            extractorInput.resetPeekPosition();
            if (!extractorInput.peekFully(this.scratch.data, 0, 4, true)) {
                return -1;
            }
            this.scratch.setPosition(0);
            int i10 = this.scratch.readInt();
            if (!headersMatch(i10, this.synchronizedHeaderData) || MpegAudioHeader.getFrameSize(i10) == -1) {
                extractorInput.skipFully(1);
                this.synchronizedHeaderData = 0;
                return 0;
            }
            MpegAudioHeader.populateHeader(i10, this.synchronizedHeader);
            if (this.basisTimeUs == C.TIME_UNSET) {
                this.basisTimeUs = this.seeker.getTimeUs(extractorInput.getPosition());
                if (this.forcedFirstSampleTimestampUs != C.TIME_UNSET) {
                    this.basisTimeUs = (this.forcedFirstSampleTimestampUs - this.seeker.getTimeUs(0L)) + this.basisTimeUs;
                }
            }
            this.sampleBytesRemaining = this.synchronizedHeader.frameSize;
        }
        int iSampleData = this.trackOutput.sampleData(extractorInput, this.sampleBytesRemaining, true);
        if (iSampleData == -1) {
            return -1;
        }
        int i11 = this.sampleBytesRemaining - iSampleData;
        this.sampleBytesRemaining = i11;
        if (i11 > 0) {
            return 0;
        }
        this.trackOutput.sampleMetadata(((this.samplesRead * 1000000) / r14.sampleRate) + this.basisTimeUs, 1, this.synchronizedHeader.frameSize, 0, null);
        this.samplesRead += this.synchronizedHeader.samplesPerFrame;
        this.sampleBytesRemaining = 0;
        return 0;
    }

    private boolean synchronize(ExtractorInput extractorInput, boolean z10) throws Throwable {
        int peekPosition;
        int i10;
        int frameSize;
        int i11 = z10 ? 16384 : 131072;
        extractorInput.resetPeekPosition();
        if (extractorInput.getPosition() == 0) {
            Metadata metadataPeekId3Data = this.id3Peeker.peekId3Data(extractorInput, (this.flags & 2) != 0 ? GaplessInfoHolder.GAPLESS_INFO_ID3_FRAME_PREDICATE : null);
            this.metadata = metadataPeekId3Data;
            if (metadataPeekId3Data != null) {
                this.gaplessInfoHolder.setFromMetadata(metadataPeekId3Data);
            }
            peekPosition = (int) extractorInput.getPeekPosition();
            if (!z10) {
                extractorInput.skipFully(peekPosition);
            }
            i10 = 0;
        } else {
            peekPosition = 0;
            i10 = 0;
        }
        int i12 = i10;
        int i13 = i12;
        while (true) {
            if (!extractorInput.peekFully(this.scratch.data, 0, 4, i10 > 0)) {
                break;
            }
            this.scratch.setPosition(0);
            int i14 = this.scratch.readInt();
            if ((i12 == 0 || headersMatch(i14, i12)) && (frameSize = MpegAudioHeader.getFrameSize(i14)) != -1) {
                i10++;
                if (i10 != 1) {
                    if (i10 == 4) {
                        break;
                    }
                } else {
                    MpegAudioHeader.populateHeader(i14, this.synchronizedHeader);
                    i12 = i14;
                }
                extractorInput.advancePeekPosition(frameSize - 4);
            } else {
                int i15 = i13 + 1;
                if (i13 == i11) {
                    if (z10) {
                        return false;
                    }
                    throw new ParserException("Searched too many bytes.");
                }
                if (z10) {
                    extractorInput.resetPeekPosition();
                    extractorInput.advancePeekPosition(peekPosition + i15);
                } else {
                    extractorInput.skipFully(1);
                }
                i12 = 0;
                i13 = i15;
                i10 = 0;
            }
        }
        if (z10) {
            extractorInput.skipFully(peekPosition + i13);
        } else {
            extractorInput.resetPeekPosition();
        }
        this.synchronizedHeaderData = i12;
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
        this.trackOutput = extractorOutput.track(0, 1);
        this.extractorOutput.endTracks();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws Throwable {
        if (this.synchronizedHeaderData == 0) {
            try {
                synchronize(extractorInput, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        if (this.seeker == null) {
            Seeker seekerMaybeReadSeekFrame = maybeReadSeekFrame(extractorInput);
            this.seeker = seekerMaybeReadSeekFrame;
            if (seekerMaybeReadSeekFrame == null || (!seekerMaybeReadSeekFrame.isSeekable() && (this.flags & 1) != 0)) {
                this.seeker = getConstantBitrateSeeker(extractorInput);
            }
            this.extractorOutput.seekMap(this.seeker);
            TrackOutput trackOutput = this.trackOutput;
            MpegAudioHeader mpegAudioHeader = this.synchronizedHeader;
            String str = mpegAudioHeader.mimeType;
            int i10 = mpegAudioHeader.channels;
            int i11 = mpegAudioHeader.sampleRate;
            GaplessInfoHolder gaplessInfoHolder = this.gaplessInfoHolder;
            trackOutput.format(Format.createAudioSampleFormat(null, str, null, -1, 4096, i10, i11, -1, gaplessInfoHolder.encoderDelay, gaplessInfoHolder.encoderPadding, null, null, 0, null, (this.flags & 2) != 0 ? null : this.metadata));
        }
        return readSample(extractorInput);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        this.synchronizedHeaderData = 0;
        this.basisTimeUs = C.TIME_UNSET;
        this.samplesRead = 0L;
        this.sampleBytesRemaining = 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws InterruptedException, IOException {
        return synchronize(extractorInput, true);
    }

    public Mp3Extractor(int i10) {
        this(i10, C.TIME_UNSET);
    }

    public Mp3Extractor(int i10, long j10) {
        this.flags = i10;
        this.forcedFirstSampleTimestampUs = j10;
        this.scratch = new ParsableByteArray(10);
        this.synchronizedHeader = new MpegAudioHeader();
        this.gaplessInfoHolder = new GaplessInfoHolder();
        this.basisTimeUs = C.TIME_UNSET;
        this.id3Peeker = new Id3Peeker();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void release() {
    }
}

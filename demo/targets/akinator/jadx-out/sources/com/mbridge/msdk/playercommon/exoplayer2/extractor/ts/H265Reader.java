package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableNalUnitBitArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class H265Reader implements ElementaryStreamReader {
    private static final int BLA_W_LP = 16;
    private static final int CRA_NUT = 21;
    private static final int PPS_NUT = 34;
    private static final int PREFIX_SEI_NUT = 39;
    private static final int RASL_R = 9;
    private static final int SPS_NUT = 33;
    private static final int SUFFIX_SEI_NUT = 40;
    private static final String TAG = "H265Reader";
    private static final int VPS_NUT = 32;
    private String formatId;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private SampleReader sampleReader;
    private final SeiReader seiReader;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[3];
    private final NalUnitTargetBuffer vps = new NalUnitTargetBuffer(32, 128);
    private final NalUnitTargetBuffer sps = new NalUnitTargetBuffer(33, 128);
    private final NalUnitTargetBuffer pps = new NalUnitTargetBuffer(34, 128);
    private final NalUnitTargetBuffer prefixSei = new NalUnitTargetBuffer(39, 128);
    private final NalUnitTargetBuffer suffixSei = new NalUnitTargetBuffer(40, 128);
    private final ParsableByteArray seiWrapper = new ParsableByteArray();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class SampleReader {
        private static final int FIRST_SLICE_FLAG_OFFSET = 2;
        private boolean isFirstParameterSet;
        private boolean isFirstSlice;
        private boolean lookingForFirstSliceFlag;
        private int nalUnitBytesRead;
        private boolean nalUnitHasKeyframeData;
        private long nalUnitStartPosition;
        private long nalUnitTimeUs;
        private final TrackOutput output;
        private boolean readingSample;
        private boolean sampleIsKeyframe;
        private long samplePosition;
        private long sampleTimeUs;
        private boolean writingParameterSets;

        public SampleReader(TrackOutput trackOutput) {
            this.output = trackOutput;
        }

        private void outputSample(int i10) {
            boolean z10 = this.sampleIsKeyframe;
            this.output.sampleMetadata(this.sampleTimeUs, z10 ? 1 : 0, (int) (this.nalUnitStartPosition - this.samplePosition), i10, null);
        }

        public void endNalUnit(long j10, int i10) {
            if (this.writingParameterSets && this.isFirstSlice) {
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
                this.writingParameterSets = false;
            } else if (this.isFirstParameterSet || this.isFirstSlice) {
                if (this.readingSample) {
                    outputSample(i10 + ((int) (j10 - this.nalUnitStartPosition)));
                }
                this.samplePosition = this.nalUnitStartPosition;
                this.sampleTimeUs = this.nalUnitTimeUs;
                this.readingSample = true;
                this.sampleIsKeyframe = this.nalUnitHasKeyframeData;
            }
        }

        public void readNalUnitData(byte[] bArr, int i10, int i11) {
            if (this.lookingForFirstSliceFlag) {
                int i12 = this.nalUnitBytesRead;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.nalUnitBytesRead = (i11 - i10) + i12;
                } else {
                    this.isFirstSlice = (bArr[i13] & 128) != 0;
                    this.lookingForFirstSliceFlag = false;
                }
            }
        }

        public void reset() {
            this.lookingForFirstSliceFlag = false;
            this.isFirstSlice = false;
            this.isFirstParameterSet = false;
            this.readingSample = false;
            this.writingParameterSets = false;
        }

        public void startNalUnit(long j10, int i10, int i11, long j11) {
            this.isFirstSlice = false;
            this.isFirstParameterSet = false;
            this.nalUnitTimeUs = j11;
            this.nalUnitBytesRead = 0;
            this.nalUnitStartPosition = j10;
            if (i11 >= 32) {
                if (!this.writingParameterSets && this.readingSample) {
                    outputSample(i10);
                    this.readingSample = false;
                }
                if (i11 <= 34) {
                    this.isFirstParameterSet = !this.writingParameterSets;
                    this.writingParameterSets = true;
                }
            }
            boolean z10 = i11 >= 16 && i11 <= 21;
            this.nalUnitHasKeyframeData = z10;
            this.lookingForFirstSliceFlag = z10 || i11 <= 9;
        }
    }

    public H265Reader(SeiReader seiReader) {
        this.seiReader = seiReader;
    }

    private void endNalUnit(long j10, int i10, int i11, long j11) {
        if (this.hasOutputFormat) {
            this.sampleReader.endNalUnit(j10, i10);
        } else {
            this.vps.endNalUnit(i11);
            this.sps.endNalUnit(i11);
            this.pps.endNalUnit(i11);
            if (this.vps.isCompleted() && this.sps.isCompleted() && this.pps.isCompleted()) {
                this.output.format(parseMediaFormat(this.formatId, this.vps, this.sps, this.pps));
                this.hasOutputFormat = true;
            }
        }
        if (this.prefixSei.endNalUnit(i11)) {
            NalUnitTargetBuffer nalUnitTargetBuffer = this.prefixSei;
            this.seiWrapper.reset(this.prefixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer.nalData, nalUnitTargetBuffer.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j11, this.seiWrapper);
        }
        if (this.suffixSei.endNalUnit(i11)) {
            NalUnitTargetBuffer nalUnitTargetBuffer2 = this.suffixSei;
            this.seiWrapper.reset(this.suffixSei.nalData, NalUnitUtil.unescapeStream(nalUnitTargetBuffer2.nalData, nalUnitTargetBuffer2.nalLength));
            this.seiWrapper.skipBytes(5);
            this.seiReader.consume(j11, this.seiWrapper);
        }
    }

    private void nalUnitData(byte[] bArr, int i10, int i11) {
        if (this.hasOutputFormat) {
            this.sampleReader.readNalUnitData(bArr, i10, i11);
        } else {
            this.vps.appendToNalUnit(bArr, i10, i11);
            this.sps.appendToNalUnit(bArr, i10, i11);
            this.pps.appendToNalUnit(bArr, i10, i11);
        }
        this.prefixSei.appendToNalUnit(bArr, i10, i11);
        this.suffixSei.appendToNalUnit(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.mbridge.msdk.playercommon.exoplayer2.Format parseMediaFormat(java.lang.String r21, com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.NalUnitTargetBuffer r22, com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.NalUnitTargetBuffer r23, com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.NalUnitTargetBuffer r24) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.H265Reader.parseMediaFormat(java.lang.String, com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.NalUnitTargetBuffer, com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.NalUnitTargetBuffer, com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.NalUnitTargetBuffer):com.mbridge.msdk.playercommon.exoplayer2.Format");
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = 0;
            while (i11 < 6) {
                int i12 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i10 << 1) + 4));
                    if (i10 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i13 = 0; i13 < iMin; i13++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i10 == 3) {
                    i12 = 3;
                }
                i11 += i12;
            }
        }
    }

    private static void skipShortTermRefPicSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        boolean bit = false;
        int i10 = 0;
        for (int i11 = 0; i11 < unsignedExpGolombCodedInt; i11++) {
            if (i11 != 0) {
                bit = parsableNalUnitBitArray.readBit();
            }
            if (bit) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                for (int i12 = 0; i12 <= i10; i12++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                    }
                }
            } else {
                int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int i13 = unsignedExpGolombCodedInt2 + unsignedExpGolombCodedInt3;
                for (int i14 = 0; i14 < unsignedExpGolombCodedInt2; i14++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                for (int i15 = 0; i15 < unsignedExpGolombCodedInt3; i15++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.skipBit();
                }
                i10 = i13;
            }
        }
    }

    private void startNalUnit(long j10, int i10, int i11, long j11) {
        int i12;
        if (this.hasOutputFormat) {
            i12 = i11;
            this.sampleReader.startNalUnit(j10, i10, i12, j11);
        } else {
            i12 = i11;
            this.vps.startNalUnit(i12);
            this.sps.startNalUnit(i12);
            this.pps.startNalUnit(i12);
        }
        this.prefixSei.startNalUnit(i12);
        this.suffixSei.startNalUnit(i12);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int position = parsableByteArray.getPosition();
            int iLimit = parsableByteArray.limit();
            byte[] bArr = parsableByteArray.data;
            this.totalBytesWritten += parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
            while (position < iLimit) {
                int iFindNalUnit = NalUnitUtil.findNalUnit(bArr, position, iLimit, this.prefixFlags);
                if (iFindNalUnit == iLimit) {
                    nalUnitData(bArr, position, iLimit);
                    return;
                }
                int h265NalUnitType = NalUnitUtil.getH265NalUnitType(bArr, iFindNalUnit);
                int i10 = iFindNalUnit - position;
                if (i10 > 0) {
                    nalUnitData(bArr, position, iFindNalUnit);
                }
                int i11 = iLimit - iFindNalUnit;
                long j10 = this.totalBytesWritten - i11;
                endNalUnit(j10, i11, i10 < 0 ? -i10 : 0, this.pesTimeUs);
                startNalUnit(j10, i11, h265NalUnitType, this.pesTimeUs);
                position = iFindNalUnit + 3;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        TrackOutput trackOutputTrack = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
        this.output = trackOutputTrack;
        this.sampleReader = new SampleReader(trackOutputTrack);
        this.seiReader.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetStarted(long j10, boolean z10) {
        this.pesTimeUs = j10;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.vps.reset();
        this.sps.reset();
        this.pps.reset();
        this.prefixSei.reset();
        this.suffixSei.reset();
        this.sampleReader.reset();
        this.totalBytesWritten = 0L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.ElementaryStreamReader
    public void packetFinished() {
    }
}

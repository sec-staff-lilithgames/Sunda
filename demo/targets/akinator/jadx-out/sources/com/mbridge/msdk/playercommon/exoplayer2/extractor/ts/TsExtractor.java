package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.PositionHolder;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class TsExtractor implements Extractor {
    private static final int BUFFER_SIZE = 9400;
    private static final int MAX_PID_PLUS_ONE = 8192;
    public static final int MODE_HLS = 2;
    public static final int MODE_MULTI_PMT = 0;
    public static final int MODE_SINGLE_PMT = 1;
    private static final int SNIFF_TS_PACKET_COUNT = 5;
    private static final int TS_PACKET_SIZE = 188;
    private static final int TS_PAT_PID = 0;
    public static final int TS_STREAM_TYPE_AAC_ADTS = 15;
    public static final int TS_STREAM_TYPE_AAC_LATM = 17;
    public static final int TS_STREAM_TYPE_AC3 = 129;
    public static final int TS_STREAM_TYPE_DTS = 138;
    public static final int TS_STREAM_TYPE_DVBSUBS = 89;
    public static final int TS_STREAM_TYPE_E_AC3 = 135;
    public static final int TS_STREAM_TYPE_H262 = 2;
    public static final int TS_STREAM_TYPE_H264 = 27;
    public static final int TS_STREAM_TYPE_H265 = 36;
    public static final int TS_STREAM_TYPE_HDMV_DTS = 130;
    public static final int TS_STREAM_TYPE_ID3 = 21;
    public static final int TS_STREAM_TYPE_MPA = 3;
    public static final int TS_STREAM_TYPE_MPA_LSF = 4;
    public static final int TS_STREAM_TYPE_SPLICE_INFO = 134;
    private static final int TS_SYNC_BYTE = 71;
    private int bytesSinceLastSync;
    private final SparseIntArray continuityCounters;
    private TsPayloadReader id3Reader;
    private final int mode;
    private ExtractorOutput output;
    private final TsPayloadReader.Factory payloadReaderFactory;
    private int remainingPmts;
    private final List<TimestampAdjuster> timestampAdjusters;
    private final SparseBooleanArray trackIds;
    private boolean tracksEnded;
    private final ParsableByteArray tsPacketBuffer;
    private final SparseArray<TsPayloadReader> tsPayloadReaders;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor.1
        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorsFactory
        public Extractor[] createExtractors() {
            return new Extractor[]{new TsExtractor()};
        }
    };
    private static final long AC3_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("AC-3");
    private static final long E_AC3_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("EAC3");
    private static final long HEVC_FORMAT_IDENTIFIER = Util.getIntegerCodeForString("HEVC");

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Mode {
    }

    public TsExtractor() {
        this(0);
    }

    public static /* synthetic */ int access$108(TsExtractor tsExtractor) {
        int i10 = tsExtractor.remainingPmts;
        tsExtractor.remainingPmts = i10 + 1;
        return i10;
    }

    private void resetPayloadReaders() {
        this.trackIds.clear();
        this.tsPayloadReaders.clear();
        SparseArray<TsPayloadReader> sparseArrayCreateInitialPayloadReaders = this.payloadReaderFactory.createInitialPayloadReaders();
        int size = sparseArrayCreateInitialPayloadReaders.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.tsPayloadReaders.put(sparseArrayCreateInitialPayloadReaders.keyAt(i10), sparseArrayCreateInitialPayloadReaders.valueAt(i10));
        }
        this.tsPayloadReaders.put(0, new SectionReader(new PatReader()));
        this.id3Reader = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.output = extractorOutput;
        extractorOutput.seekMap(new SeekMap.Unseekable(C.TIME_UNSET));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws InterruptedException, IOException {
        ParsableByteArray parsableByteArray = this.tsPacketBuffer;
        byte[] bArr = parsableByteArray.data;
        if (9400 - parsableByteArray.getPosition() < TS_PACKET_SIZE) {
            int iBytesLeft = this.tsPacketBuffer.bytesLeft();
            if (iBytesLeft > 0) {
                System.arraycopy(bArr, this.tsPacketBuffer.getPosition(), bArr, 0, iBytesLeft);
            }
            this.tsPacketBuffer.reset(bArr, iBytesLeft);
        }
        while (this.tsPacketBuffer.bytesLeft() < TS_PACKET_SIZE) {
            int iLimit = this.tsPacketBuffer.limit();
            int i10 = extractorInput.read(bArr, iLimit, 9400 - iLimit);
            if (i10 == -1) {
                return -1;
            }
            this.tsPacketBuffer.setLimit(iLimit + i10);
        }
        int iLimit2 = this.tsPacketBuffer.limit();
        int position = this.tsPacketBuffer.getPosition();
        int i11 = position;
        while (i11 < iLimit2 && bArr[i11] != 71) {
            i11++;
        }
        this.tsPacketBuffer.setPosition(i11);
        int i12 = i11 + TS_PACKET_SIZE;
        if (i12 > iLimit2) {
            int i13 = (i11 - position) + this.bytesSinceLastSync;
            this.bytesSinceLastSync = i13;
            if (this.mode != 2 || i13 <= 376) {
                return 0;
            }
            throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
        }
        this.bytesSinceLastSync = 0;
        int i14 = this.tsPacketBuffer.readInt();
        if ((8388608 & i14) != 0) {
            this.tsPacketBuffer.setPosition(i12);
            return 0;
        }
        boolean z10 = (4194304 & i14) != 0;
        int i15 = (2096896 & i14) >> 8;
        boolean z11 = (i14 & 32) != 0;
        TsPayloadReader tsPayloadReader = (i14 & 16) != 0 ? this.tsPayloadReaders.get(i15) : null;
        if (tsPayloadReader == null) {
            this.tsPacketBuffer.setPosition(i12);
            return 0;
        }
        if (this.mode != 2) {
            int i16 = i14 & 15;
            int i17 = this.continuityCounters.get(i15, i16 - 1);
            this.continuityCounters.put(i15, i16);
            if (i17 == i16) {
                this.tsPacketBuffer.setPosition(i12);
                return 0;
            }
            if (i16 != ((i17 + 1) & 15)) {
                tsPayloadReader.seek();
            }
        }
        if (z11) {
            this.tsPacketBuffer.skipBytes(this.tsPacketBuffer.readUnsignedByte());
        }
        this.tsPacketBuffer.setLimit(i12);
        tsPayloadReader.consume(this.tsPacketBuffer, z10);
        this.tsPacketBuffer.setLimit(iLimit2);
        this.tsPacketBuffer.setPosition(i12);
        return 0;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void seek(long j10, long j11) {
        int size = this.timestampAdjusters.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.timestampAdjusters.get(i10).reset();
        }
        this.tsPacketBuffer.reset();
        this.continuityCounters.clear();
        resetPayloadReaders();
        this.bytesSinceLastSync = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        r1 = r1 + 1;
     */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean sniff(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput r7) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r6 = this;
            com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r0 = r6.tsPacketBuffer
            byte[] r0 = r0.data
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.peekFully(r0, r2, r1)
            r1 = r2
        Lb:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L27
            r3 = r2
        L10:
            r4 = 5
            if (r3 != r4) goto L18
            r7.skipFully(r1)
            r7 = 1
            return r7
        L18:
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L24
            int r1 = r1 + 1
            goto Lb
        L24:
            int r3 = r3 + 1
            goto L10
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor.sniff(com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput):boolean");
    }

    public TsExtractor(int i10) {
        this(1, i10);
    }

    public TsExtractor(int i10, int i11) {
        this(i10, new TimestampAdjuster(0L), new DefaultTsPayloadReaderFactory(i11));
    }

    public TsExtractor(int i10, TimestampAdjuster timestampAdjuster, TsPayloadReader.Factory factory) {
        this.payloadReaderFactory = (TsPayloadReader.Factory) Assertions.checkNotNull(factory);
        this.mode = i10;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.timestampAdjusters = arrayList;
            arrayList.add(timestampAdjuster);
        } else {
            this.timestampAdjusters = Collections.singletonList(timestampAdjuster);
        }
        this.tsPacketBuffer = new ParsableByteArray(new byte[BUFFER_SIZE], 0);
        this.trackIds = new SparseBooleanArray();
        this.tsPayloadReaders = new SparseArray<>();
        this.continuityCounters = new SparseIntArray();
        resetPayloadReaders();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.Extractor
    public void release() {
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class PatReader implements SectionPayloadReader {
        private final ParsableBitArray patScratch = new ParsableBitArray(new byte[4]);

        public PatReader() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.readUnsignedByte() != 0) {
                return;
            }
            parsableByteArray.skipBytes(7);
            int iBytesLeft = parsableByteArray.bytesLeft() / 4;
            for (int i10 = 0; i10 < iBytesLeft; i10++) {
                parsableByteArray.readBytes(this.patScratch, 4);
                int bits = this.patScratch.readBits(16);
                this.patScratch.skipBits(3);
                if (bits == 0) {
                    this.patScratch.skipBits(13);
                } else {
                    int bits2 = this.patScratch.readBits(13);
                    TsExtractor.this.tsPayloadReaders.put(bits2, new SectionReader(TsExtractor.this.new PmtReader(bits2)));
                    TsExtractor.access$108(TsExtractor.this);
                }
            }
            if (TsExtractor.this.mode != 2) {
                TsExtractor.this.tsPayloadReaders.remove(0);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class PmtReader implements SectionPayloadReader {
        private static final int TS_PMT_DESC_AC3 = 106;
        private static final int TS_PMT_DESC_DTS = 123;
        private static final int TS_PMT_DESC_DVBSUBS = 89;
        private static final int TS_PMT_DESC_EAC3 = 122;
        private static final int TS_PMT_DESC_ISO639_LANG = 10;
        private static final int TS_PMT_DESC_REGISTRATION = 5;
        private final int pid;
        private final ParsableBitArray pmtScratch = new ParsableBitArray(new byte[5]);
        private final SparseArray<TsPayloadReader> trackIdToReaderScratch = new SparseArray<>();
        private final SparseIntArray trackIdToPidScratch = new SparseIntArray();

        public PmtReader(int i10) {
            this.pid = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader.EsInfo readEsInfo(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray r12, int r13) {
            /*
                r11 = this;
                int r0 = r12.getPosition()
                int r13 = r13 + r0
                r1 = -1
                r2 = 0
                r3 = r2
            L8:
                int r4 = r12.getPosition()
                if (r4 >= r13) goto L99
                int r4 = r12.readUnsignedByte()
                int r5 = r12.readUnsignedByte()
                int r6 = r12.getPosition()
                int r6 = r6 + r5
                r5 = 5
                if (r4 != r5) goto L3f
                long r4 = r12.readUnsignedInt()
                long r7 = com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor.access$900()
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 != 0) goto L2b
                goto L43
            L2b:
                long r7 = com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor.access$1000()
                int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r7 != 0) goto L34
                goto L4a
            L34:
                long r7 = com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor.access$1100()
                int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
                if (r4 != 0) goto L8f
                r1 = 36
                goto L8f
            L3f:
                r5 = 106(0x6a, float:1.49E-43)
                if (r4 != r5) goto L46
            L43:
                r1 = 129(0x81, float:1.81E-43)
                goto L8f
            L46:
                r5 = 122(0x7a, float:1.71E-43)
                if (r4 != r5) goto L4d
            L4a:
                r1 = 135(0x87, float:1.89E-43)
                goto L8f
            L4d:
                r5 = 123(0x7b, float:1.72E-43)
                if (r4 != r5) goto L54
                r1 = 138(0x8a, float:1.93E-43)
                goto L8f
            L54:
                r5 = 10
                r7 = 3
                if (r4 != r5) goto L62
                java.lang.String r2 = r12.readString(r7)
                java.lang.String r2 = r2.trim()
                goto L8f
            L62:
                r5 = 89
                if (r4 != r5) goto L8f
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
            L6b:
                int r3 = r12.getPosition()
                if (r3 >= r6) goto L8d
                java.lang.String r3 = r12.readString(r7)
                java.lang.String r3 = r3.trim()
                int r4 = r12.readUnsignedByte()
                r8 = 4
                byte[] r9 = new byte[r8]
                r10 = 0
                r12.readBytes(r9, r10, r8)
                com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader$DvbSubtitleInfo r8 = new com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader$DvbSubtitleInfo
                r8.<init>(r3, r4, r9)
                r1.add(r8)
                goto L6b
            L8d:
                r3 = r1
                r1 = r5
            L8f:
                int r4 = r12.getPosition()
                int r6 = r6 - r4
                r12.skipBytes(r6)
                goto L8
            L99:
                r12.setPosition(r13)
                com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader$EsInfo r4 = new com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader$EsInfo
                byte[] r12 = r12.data
                byte[] r12 = java.util.Arrays.copyOfRange(r12, r0, r13)
                r4.<init>(r1, r2, r3, r12)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor.PmtReader.readEsInfo(com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray, int):com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader$EsInfo");
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
        public void consume(ParsableByteArray parsableByteArray) {
            TimestampAdjuster timestampAdjuster;
            if (parsableByteArray.readUnsignedByte() != 2) {
                return;
            }
            if (TsExtractor.this.mode == 1 || TsExtractor.this.mode == 2 || TsExtractor.this.remainingPmts == 1) {
                timestampAdjuster = (TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0);
            } else {
                timestampAdjuster = new TimestampAdjuster(((TimestampAdjuster) TsExtractor.this.timestampAdjusters.get(0)).getFirstSampleTimestampUs());
                TsExtractor.this.timestampAdjusters.add(timestampAdjuster);
            }
            parsableByteArray.skipBytes(2);
            int unsignedShort = parsableByteArray.readUnsignedShort();
            int i10 = 5;
            parsableByteArray.skipBytes(5);
            parsableByteArray.readBytes(this.pmtScratch, 2);
            int i11 = 4;
            this.pmtScratch.skipBits(4);
            parsableByteArray.skipBytes(this.pmtScratch.readBits(12));
            if (TsExtractor.this.mode == 2 && TsExtractor.this.id3Reader == null) {
                TsPayloadReader.EsInfo esInfo = new TsPayloadReader.EsInfo(21, null, null, new byte[0]);
                TsExtractor tsExtractor = TsExtractor.this;
                tsExtractor.id3Reader = tsExtractor.payloadReaderFactory.createPayloadReader(21, esInfo);
                TsExtractor.this.id3Reader.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, 21, 8192));
            }
            this.trackIdToReaderScratch.clear();
            this.trackIdToPidScratch.clear();
            int iBytesLeft = parsableByteArray.bytesLeft();
            while (iBytesLeft > 0) {
                parsableByteArray.readBytes(this.pmtScratch, i10);
                int bits = this.pmtScratch.readBits(8);
                this.pmtScratch.skipBits(3);
                int bits2 = this.pmtScratch.readBits(13);
                this.pmtScratch.skipBits(i11);
                int bits3 = this.pmtScratch.readBits(12);
                TsPayloadReader.EsInfo esInfo2 = readEsInfo(parsableByteArray, bits3);
                if (bits == 6) {
                    bits = esInfo2.streamType;
                }
                iBytesLeft -= bits3 + 5;
                int i12 = TsExtractor.this.mode == 2 ? bits : bits2;
                if (!TsExtractor.this.trackIds.get(i12)) {
                    TsPayloadReader tsPayloadReaderCreatePayloadReader = (TsExtractor.this.mode == 2 && bits == 21) ? TsExtractor.this.id3Reader : TsExtractor.this.payloadReaderFactory.createPayloadReader(bits, esInfo2);
                    if (TsExtractor.this.mode != 2 || bits2 < this.trackIdToPidScratch.get(i12, 8192)) {
                        this.trackIdToPidScratch.put(i12, bits2);
                        this.trackIdToReaderScratch.put(i12, tsPayloadReaderCreatePayloadReader);
                    }
                }
                i10 = 5;
                i11 = 4;
            }
            int size = this.trackIdToPidScratch.size();
            for (int i13 = 0; i13 < size; i13++) {
                int iKeyAt = this.trackIdToPidScratch.keyAt(i13);
                TsExtractor.this.trackIds.put(iKeyAt, true);
                TsPayloadReader tsPayloadReaderValueAt = this.trackIdToReaderScratch.valueAt(i13);
                if (tsPayloadReaderValueAt != null) {
                    if (tsPayloadReaderValueAt != TsExtractor.this.id3Reader) {
                        tsPayloadReaderValueAt.init(timestampAdjuster, TsExtractor.this.output, new TsPayloadReader.TrackIdGenerator(unsignedShort, iKeyAt, 8192));
                    }
                    TsExtractor.this.tsPayloadReaders.put(this.trackIdToPidScratch.valueAt(i13), tsPayloadReaderValueAt);
                }
            }
            if (TsExtractor.this.mode == 2) {
                if (TsExtractor.this.tracksEnded) {
                    return;
                }
                TsExtractor.this.output.endTracks();
                TsExtractor.this.remainingPmts = 0;
                TsExtractor.this.tracksEnded = true;
                return;
            }
            TsExtractor.this.tsPayloadReaders.remove(this.pid);
            TsExtractor tsExtractor2 = TsExtractor.this;
            tsExtractor2.remainingPmts = tsExtractor2.mode != 1 ? TsExtractor.this.remainingPmts - 1 : 0;
            if (TsExtractor.this.remainingPmts == 0) {
                TsExtractor.this.output.endTracks();
                TsExtractor.this.tracksEnded = true;
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionPayloadReader
        public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        }
    }
}

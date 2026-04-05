package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.FlacStreamInfo;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class FlacReader extends StreamReader {
    private static final byte AUDIO_PACKET_TYPE = -1;
    private static final int FRAME_HEADER_SAMPLE_NUMBER_OFFSET = 4;
    private static final byte SEEKTABLE_PACKET_TYPE = 3;
    private FlacOggSeeker flacOggSeeker;
    private FlacStreamInfo streamInfo;

    private int getFlacFrameBlockSize(ParsableByteArray parsableByteArray) {
        int i10;
        int i11;
        int i12 = (parsableByteArray.data[2] & 255) >> 4;
        switch (i12) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                i10 = i12 - 2;
                i11 = 576;
                break;
            case 6:
            case 7:
                parsableByteArray.skipBytes(4);
                parsableByteArray.readUtf8EncodedLong();
                int unsignedByte = i12 == 6 ? parsableByteArray.readUnsignedByte() : parsableByteArray.readUnsignedShort();
                parsableByteArray.setPosition(0);
                return unsignedByte + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i10 = i12 - 8;
                i11 = NotificationCompat.FLAG_LOCAL_ONLY;
                break;
            default:
                return -1;
        }
        return i11 << i10;
    }

    private static boolean isAudioPacket(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean verifyBitstreamType(ParsableByteArray parsableByteArray) {
        return parsableByteArray.bytesLeft() >= 5 && parsableByteArray.readUnsignedByte() == 127 && parsableByteArray.readUnsignedInt() == 1179402563;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public long preparePayload(ParsableByteArray parsableByteArray) {
        if (isAudioPacket(parsableByteArray.data)) {
            return getFlacFrameBlockSize(parsableByteArray);
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public boolean readHeaders(ParsableByteArray parsableByteArray, long j10, StreamReader.SetupData setupData) throws InterruptedException, IOException {
        byte[] bArr = parsableByteArray.data;
        if (this.streamInfo == null) {
            this.streamInfo = new FlacStreamInfo(bArr, 17);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 9, parsableByteArray.limit());
            bArrCopyOfRange[4] = -128;
            List listSingletonList = Collections.singletonList(bArrCopyOfRange);
            int iBitRate = this.streamInfo.bitRate();
            FlacStreamInfo flacStreamInfo = this.streamInfo;
            setupData.format = Format.createAudioSampleFormat(null, MimeTypes.AUDIO_FLAC, null, -1, iBitRate, flacStreamInfo.channels, flacStreamInfo.sampleRate, listSingletonList, null, 0, null);
            return true;
        }
        if ((bArr[0] & AbstractJsonLexerKt.TC_INVALID) == 3) {
            FlacOggSeeker flacOggSeeker = new FlacOggSeeker();
            this.flacOggSeeker = flacOggSeeker;
            flacOggSeeker.parseSeekTable(parsableByteArray);
            return true;
        }
        if (!isAudioPacket(bArr)) {
            return true;
        }
        FlacOggSeeker flacOggSeeker2 = this.flacOggSeeker;
        if (flacOggSeeker2 != null) {
            flacOggSeeker2.setFirstFrameOffset(j10);
            setupData.oggSeeker = this.flacOggSeeker;
        }
        return false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.StreamReader
    public void reset(boolean z10) {
        super.reset(z10);
        if (z10) {
            this.streamInfo = null;
            this.flacOggSeeker = null;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class FlacOggSeeker implements OggSeeker, SeekMap {
        private static final int METADATA_LENGTH_OFFSET = 1;
        private static final int SEEK_POINT_SIZE = 18;
        private long firstFrameOffset = -1;
        private long pendingSeekGranule = -1;
        private long[] seekPointGranules;
        private long[] seekPointOffsets;

        public FlacOggSeeker() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return FlacReader.this.streamInfo.durationUs();
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j10) {
            int iBinarySearchFloor = Util.binarySearchFloor(this.seekPointGranules, FlacReader.this.convertTimeToGranule(j10), true, true);
            long jConvertGranuleToTime = FlacReader.this.convertGranuleToTime(this.seekPointGranules[iBinarySearchFloor]);
            SeekPoint seekPoint = new SeekPoint(jConvertGranuleToTime, this.firstFrameOffset + this.seekPointOffsets[iBinarySearchFloor]);
            if (jConvertGranuleToTime < j10) {
                long[] jArr = this.seekPointGranules;
                if (iBinarySearchFloor != jArr.length - 1) {
                    int i10 = iBinarySearchFloor + 1;
                    return new SeekMap.SeekPoints(seekPoint, new SeekPoint(FlacReader.this.convertGranuleToTime(jArr[i10]), this.firstFrameOffset + this.seekPointOffsets[i10]));
                }
            }
            return new SeekMap.SeekPoints(seekPoint);
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public void parseSeekTable(ParsableByteArray parsableByteArray) {
            parsableByteArray.skipBytes(1);
            int unsignedInt24 = parsableByteArray.readUnsignedInt24() / 18;
            this.seekPointGranules = new long[unsignedInt24];
            this.seekPointOffsets = new long[unsignedInt24];
            for (int i10 = 0; i10 < unsignedInt24; i10++) {
                this.seekPointGranules[i10] = parsableByteArray.readLong();
                this.seekPointOffsets[i10] = parsableByteArray.readLong();
                parsableByteArray.skipBytes(2);
            }
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public long read(ExtractorInput extractorInput) throws InterruptedException, IOException {
            long j10 = this.pendingSeekGranule;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.pendingSeekGranule = -1L;
            return j11;
        }

        public void setFirstFrameOffset(long j10) {
            this.firstFrameOffset = j10;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public long startSeek(long j10) {
            long jConvertTimeToGranule = FlacReader.this.convertTimeToGranule(j10);
            this.pendingSeekGranule = this.seekPointGranules[Util.binarySearchFloor(this.seekPointGranules, jConvertTimeToGranule, true, true)];
            return jConvertTimeToGranule;
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.OggSeeker
        public SeekMap createSeekMap() {
            return this;
        }
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.extractor.flv;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.CodecSpecificDataUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class AudioTagPayloadReader extends TagPayloadReader {
    private static final int AAC_PACKET_TYPE_AAC_RAW = 1;
    private static final int AAC_PACKET_TYPE_SEQUENCE_HEADER = 0;
    private static final int AUDIO_FORMAT_AAC = 10;
    private static final int AUDIO_FORMAT_ALAW = 7;
    private static final int AUDIO_FORMAT_MP3 = 2;
    private static final int AUDIO_FORMAT_ULAW = 8;
    private static final int[] AUDIO_SAMPLING_RATE_TABLE = {5512, 11025, 22050, 44100};
    private int audioFormat;
    private boolean hasOutputFormat;
    private boolean hasParsedAudioDataHeader;

    public AudioTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public boolean parseHeader(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        if (this.hasParsedAudioDataHeader) {
            parsableByteArray.skipBytes(1);
        } else {
            int unsignedByte = parsableByteArray.readUnsignedByte();
            int i10 = (unsignedByte >> 4) & 15;
            this.audioFormat = i10;
            if (i10 == 2) {
                this.output.format(Format.createAudioSampleFormat(null, MimeTypes.AUDIO_MPEG, null, -1, -1, 1, AUDIO_SAMPLING_RATE_TABLE[(unsignedByte >> 2) & 3], null, null, 0, null));
                this.hasOutputFormat = true;
            } else if (i10 == 7 || i10 == 8) {
                this.output.format(Format.createAudioSampleFormat(null, i10 == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW, null, -1, -1, 1, 8000, (unsignedByte & 1) == 1 ? 2 : 3, null, null, 0, null));
                this.hasOutputFormat = true;
            } else if (i10 != 10) {
                throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.audioFormat);
            }
            this.hasParsedAudioDataHeader = true;
        }
        return true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public void parsePayload(ParsableByteArray parsableByteArray, long j10) throws ParserException {
        if (this.audioFormat == 2) {
            int iBytesLeft = parsableByteArray.bytesLeft();
            this.output.sampleData(parsableByteArray, iBytesLeft);
            this.output.sampleMetadata(j10, 1, iBytesLeft, 0, null);
            return;
        }
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if (unsignedByte != 0 || this.hasOutputFormat) {
            if (this.audioFormat != 10 || unsignedByte == 1) {
                int iBytesLeft2 = parsableByteArray.bytesLeft();
                this.output.sampleData(parsableByteArray, iBytesLeft2);
                this.output.sampleMetadata(j10, 1, iBytesLeft2, 0, null);
                return;
            }
            return;
        }
        int iBytesLeft3 = parsableByteArray.bytesLeft();
        byte[] bArr = new byte[iBytesLeft3];
        parsableByteArray.readBytes(bArr, 0, iBytesLeft3);
        Pair<Integer, Integer> aacAudioSpecificConfig = CodecSpecificDataUtil.parseAacAudioSpecificConfig(bArr);
        this.output.format(Format.createAudioSampleFormat(null, MimeTypes.AUDIO_AAC, null, -1, -1, ((Integer) aacAudioSpecificConfig.second).intValue(), ((Integer) aacAudioSpecificConfig.first).intValue(), Collections.singletonList(bArr), null, 0, null));
        this.hasOutputFormat = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.extractor.wav;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.IOException;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";
    private static final int TYPE_FLOAT = 3;
    private static final int TYPE_PCM = 1;
    private static final int TYPE_WAVE_FORMAT_EXTENSIBLE = 65534;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* renamed from: id, reason: collision with root package name */
        public final int f42164id;
        public final long size;

        private ChunkHeader(int i10, long j10) {
            this.f42164id = i10;
            this.size = j10;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws InterruptedException, IOException {
            extractorInput.peekFully(parsableByteArray.data, 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static WavHeader peek(ExtractorInput extractorInput) throws InterruptedException, IOException {
        int i10;
        Assertions.checkNotNull(extractorInput);
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        if (ChunkHeader.peek(extractorInput, parsableByteArray).f42164id != Util.getIntegerCodeForString("RIFF")) {
            return null;
        }
        int pcmEncoding = 0;
        extractorInput.peekFully(parsableByteArray.data, 0, 4);
        parsableByteArray.setPosition(0);
        int i11 = parsableByteArray.readInt();
        if (i11 != Util.getIntegerCodeForString("WAVE")) {
            Log.e(TAG, "Unsupported RIFF format: " + i11);
            return null;
        }
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.f42164id != Util.getIntegerCodeForString("fmt ")) {
            extractorInput.advancePeekPosition((int) chunkHeaderPeek.size);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        Assertions.checkState(chunkHeaderPeek.size >= 16);
        extractorInput.peekFully(parsableByteArray.data, 0, 16);
        parsableByteArray.setPosition(0);
        int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int littleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int littleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i12 = (littleEndianUnsignedShort2 * littleEndianUnsignedShort4) / 8;
        if (littleEndianUnsignedShort3 != i12) {
            throw new ParserException(i.a(i12, littleEndianUnsignedShort3, "Expected block alignment: ", "; got: "));
        }
        if (littleEndianUnsignedShort == 1) {
            pcmEncoding = Util.getPcmEncoding(littleEndianUnsignedShort4);
        } else if (littleEndianUnsignedShort != 3) {
            if (littleEndianUnsignedShort != TYPE_WAVE_FORMAT_EXTENSIBLE) {
                Log.e(TAG, "Unsupported WAV format type: " + littleEndianUnsignedShort);
                return null;
            }
            pcmEncoding = Util.getPcmEncoding(littleEndianUnsignedShort4);
        } else {
            i10 = littleEndianUnsignedShort4 == 32 ? 4 : pcmEncoding;
        }
        if (i10 != 0) {
            extractorInput.advancePeekPosition(((int) chunkHeaderPeek.size) - 16);
            return new WavHeader(littleEndianUnsignedShort2, littleEndianUnsignedIntToInt, littleEndianUnsignedIntToInt2, littleEndianUnsignedShort3, littleEndianUnsignedShort4, i10);
        }
        Log.e(TAG, "Unsupported WAV bit depth " + littleEndianUnsignedShort4 + " for type " + littleEndianUnsignedShort);
        return null;
    }

    public static void skipToData(ExtractorInput extractorInput, WavHeader wavHeader) throws InterruptedException, IOException {
        Assertions.checkNotNull(extractorInput);
        Assertions.checkNotNull(wavHeader);
        extractorInput.resetPeekPosition();
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        ChunkHeader chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (chunkHeaderPeek.f42164id != Util.getIntegerCodeForString("data")) {
            Log.w(TAG, "Ignoring unknown WAV chunk: " + chunkHeaderPeek.f42164id);
            long j10 = chunkHeaderPeek.size + 8;
            if (chunkHeaderPeek.f42164id == Util.getIntegerCodeForString("RIFF")) {
                j10 = 12;
            }
            if (j10 > 2147483647L) {
                throw new ParserException("Chunk is too large (~2GB+) to skip; id: " + chunkHeaderPeek.f42164id);
            }
            extractorInput.skipFully((int) j10);
            chunkHeaderPeek = ChunkHeader.peek(extractorInput, parsableByteArray);
        }
        extractorInput.skipFully(8);
        wavHeader.setDataBounds(extractorInput.getPosition(), chunkHeaderPeek.size);
    }
}

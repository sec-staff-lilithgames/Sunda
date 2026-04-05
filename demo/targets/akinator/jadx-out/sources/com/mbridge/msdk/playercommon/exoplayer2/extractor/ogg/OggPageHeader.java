package com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg;

import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class OggPageHeader {
    public static final int EMPTY_PAGE_HEADER_SIZE = 27;
    public static final int MAX_PAGE_PAYLOAD = 65025;
    public static final int MAX_PAGE_SIZE = 65307;
    public static final int MAX_SEGMENT_COUNT = 255;
    private static final int TYPE_OGGS = Util.getIntegerCodeForString("OggS");
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public long pageChecksum;
    public int pageSegmentCount;
    public long pageSequenceNumber;
    public int revision;
    public long streamSerialNumber;
    public int type;
    public final int[] laces = new int[255];
    private final ParsableByteArray scratch = new ParsableByteArray(255);

    public boolean populate(ExtractorInput extractorInput, boolean z10) throws InterruptedException, IOException {
        this.scratch.reset();
        reset();
        if ((extractorInput.getLength() != -1 && extractorInput.getLength() - extractorInput.getPeekPosition() < 27) || !extractorInput.peekFully(this.scratch.data, 0, 27, true)) {
            if (z10) {
                return false;
            }
            throw new EOFException();
        }
        if (this.scratch.readUnsignedInt() != TYPE_OGGS) {
            if (z10) {
                return false;
            }
            throw new ParserException("expected OggS capture pattern at begin of page");
        }
        int unsignedByte = this.scratch.readUnsignedByte();
        this.revision = unsignedByte;
        if (unsignedByte != 0) {
            if (z10) {
                return false;
            }
            throw new ParserException("unsupported bit stream revision");
        }
        this.type = this.scratch.readUnsignedByte();
        this.granulePosition = this.scratch.readLittleEndianLong();
        this.streamSerialNumber = this.scratch.readLittleEndianUnsignedInt();
        this.pageSequenceNumber = this.scratch.readLittleEndianUnsignedInt();
        this.pageChecksum = this.scratch.readLittleEndianUnsignedInt();
        int unsignedByte2 = this.scratch.readUnsignedByte();
        this.pageSegmentCount = unsignedByte2;
        this.headerSize = unsignedByte2 + 27;
        this.scratch.reset();
        extractorInput.peekFully(this.scratch.data, 0, this.pageSegmentCount);
        for (int i10 = 0; i10 < this.pageSegmentCount; i10++) {
            this.laces[i10] = this.scratch.readUnsignedByte();
            this.bodySize += this.laces[i10];
        }
        return true;
    }

    public void reset() {
        this.revision = 0;
        this.type = 0;
        this.granulePosition = 0L;
        this.streamSerialNumber = 0L;
        this.pageSequenceNumber = 0L;
        this.pageChecksum = 0L;
        this.pageSegmentCount = 0;
        this.headerSize = 0;
        this.bodySize = 0;
    }
}

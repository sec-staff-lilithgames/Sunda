package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoderException;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataInputBuffer;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableBitArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SpliceInfoDecoder implements MetadataDecoder {
    private static final int TYPE_PRIVATE_COMMAND = 255;
    private static final int TYPE_SPLICE_INSERT = 5;
    private static final int TYPE_SPLICE_NULL = 0;
    private static final int TYPE_SPLICE_SCHEDULE = 4;
    private static final int TYPE_TIME_SIGNAL = 6;
    private final ParsableByteArray sectionData = new ParsableByteArray();
    private final ParsableBitArray sectionHeader = new ParsableBitArray();
    private TimestampAdjuster timestampAdjuster;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.MetadataDecoder
    public Metadata decode(MetadataInputBuffer metadataInputBuffer) throws MetadataDecoderException {
        TimestampAdjuster timestampAdjuster = this.timestampAdjuster;
        if (timestampAdjuster == null || metadataInputBuffer.subsampleOffsetUs != timestampAdjuster.getTimestampOffsetUs()) {
            TimestampAdjuster timestampAdjuster2 = new TimestampAdjuster(metadataInputBuffer.timeUs);
            this.timestampAdjuster = timestampAdjuster2;
            timestampAdjuster2.adjustSampleTimestamp(metadataInputBuffer.timeUs - metadataInputBuffer.subsampleOffsetUs);
        }
        ByteBuffer byteBuffer = metadataInputBuffer.data;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.sectionData.reset(bArrArray, iLimit);
        this.sectionHeader.reset(bArrArray, iLimit);
        this.sectionHeader.skipBits(39);
        long bits = (this.sectionHeader.readBits(1) << 32) | this.sectionHeader.readBits(32);
        this.sectionHeader.skipBits(20);
        int bits2 = this.sectionHeader.readBits(12);
        int bits3 = this.sectionHeader.readBits(8);
        this.sectionData.skipBytes(14);
        Metadata.Entry fromSection = bits3 != 0 ? bits3 != 255 ? bits3 != 4 ? bits3 != 5 ? bits3 != 6 ? null : TimeSignalCommand.parseFromSection(this.sectionData, bits, this.timestampAdjuster) : SpliceInsertCommand.parseFromSection(this.sectionData, bits, this.timestampAdjuster) : SpliceScheduleCommand.parseFromSection(this.sectionData) : PrivateCommand.parseFromSection(this.sectionData, bits2, bits) : new SpliceNullCommand();
        return fromSection == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(fromSection);
    }
}

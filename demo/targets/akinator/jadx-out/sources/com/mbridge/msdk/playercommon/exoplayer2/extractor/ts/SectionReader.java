package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class SectionReader implements TsPayloadReader {
    private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
    private static final int MAX_SECTION_LENGTH = 4098;
    private static final int SECTION_HEADER_LENGTH = 3;
    private int bytesRead;
    private final SectionPayloadReader reader;
    private final ParsableByteArray sectionData = new ParsableByteArray(32);
    private boolean sectionSyntaxIndicator;
    private int totalSectionLength;
    private boolean waitingForPayloadStart;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.reader = sectionPayloadReader;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader
    public void consume(ParsableByteArray parsableByteArray, boolean z10) {
        int position = z10 ? parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte() : -1;
        if (this.waitingForPayloadStart) {
            if (!z10) {
                return;
            }
            this.waitingForPayloadStart = false;
            parsableByteArray.setPosition(position);
            this.bytesRead = 0;
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i10 = this.bytesRead;
            if (i10 < 3) {
                if (i10 == 0) {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.setPosition(parsableByteArray.getPosition() - 1);
                    if (unsignedByte == 255) {
                        this.waitingForPayloadStart = true;
                        return;
                    }
                }
                int iMin = Math.min(parsableByteArray.bytesLeft(), 3 - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.data, this.bytesRead, iMin);
                int i11 = this.bytesRead + iMin;
                this.bytesRead = i11;
                if (i11 == 3) {
                    this.sectionData.reset(3);
                    this.sectionData.skipBytes(1);
                    int unsignedByte2 = this.sectionData.readUnsignedByte();
                    int unsignedByte3 = this.sectionData.readUnsignedByte();
                    this.sectionSyntaxIndicator = (unsignedByte2 & 128) != 0;
                    this.totalSectionLength = (((unsignedByte2 & 15) << 8) | unsignedByte3) + 3;
                    int iCapacity = this.sectionData.capacity();
                    int i12 = this.totalSectionLength;
                    if (iCapacity < i12) {
                        ParsableByteArray parsableByteArray2 = this.sectionData;
                        byte[] bArr = parsableByteArray2.data;
                        parsableByteArray2.reset(Math.min(4098, Math.max(i12, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.sectionData.data, 0, 3);
                    }
                }
            } else {
                int iMin2 = Math.min(parsableByteArray.bytesLeft(), this.totalSectionLength - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.data, this.bytesRead, iMin2);
                int i13 = this.bytesRead + iMin2;
                this.bytesRead = i13;
                int i14 = this.totalSectionLength;
                if (i13 != i14) {
                    continue;
                } else {
                    if (!this.sectionSyntaxIndicator) {
                        this.sectionData.reset(i14);
                    } else {
                        if (Util.crc(this.sectionData.data, 0, i14, -1) != 0) {
                            this.waitingForPayloadStart = true;
                            return;
                        }
                        this.sectionData.reset(this.totalSectionLength - 4);
                    }
                    this.reader.consume(this.sectionData);
                    this.bytesRead = 0;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.reader.init(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.waitingForPayloadStart = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsPayloadReader
    public void seek() {
        this.waitingForPayloadStart = true;
    }
}

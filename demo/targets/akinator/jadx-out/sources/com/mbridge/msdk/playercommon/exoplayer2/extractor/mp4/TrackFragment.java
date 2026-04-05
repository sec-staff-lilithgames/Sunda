package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorInput;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.vungle.ads.internal.protos.Sdk;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class TrackFragment {
    public long atomPosition;
    public long auxiliaryDataPosition;
    public long dataPosition;
    public boolean definesEncryptionData;
    public DefaultSampleValues header;
    public long nextFragmentDecodeTime;
    public int[] sampleCompositionTimeOffsetTable;
    public int sampleCount;
    public long[] sampleDecodingTimeTable;
    public ParsableByteArray sampleEncryptionData;
    public int sampleEncryptionDataLength;
    public boolean sampleEncryptionDataNeedsFill;
    public boolean[] sampleHasSubsampleEncryptionTable;
    public boolean[] sampleIsSyncFrameTable;
    public int[] sampleSizeTable;
    public TrackEncryptionBox trackEncryptionBox;
    public int trunCount;
    public long[] trunDataPosition;
    public int[] trunLength;

    public void fillEncryptionData(ExtractorInput extractorInput) throws InterruptedException, IOException {
        extractorInput.readFully(this.sampleEncryptionData.data, 0, this.sampleEncryptionDataLength);
        this.sampleEncryptionData.setPosition(0);
        this.sampleEncryptionDataNeedsFill = false;
    }

    public long getSamplePresentationTime(int i10) {
        return this.sampleDecodingTimeTable[i10] + this.sampleCompositionTimeOffsetTable[i10];
    }

    public void initEncryptionData(int i10) {
        ParsableByteArray parsableByteArray = this.sampleEncryptionData;
        if (parsableByteArray == null || parsableByteArray.limit() < i10) {
            this.sampleEncryptionData = new ParsableByteArray(i10);
        }
        this.sampleEncryptionDataLength = i10;
        this.definesEncryptionData = true;
        this.sampleEncryptionDataNeedsFill = true;
    }

    public void initTables(int i10, int i11) {
        this.trunCount = i10;
        this.sampleCount = i11;
        int[] iArr = this.trunLength;
        if (iArr == null || iArr.length < i10) {
            this.trunDataPosition = new long[i10];
            this.trunLength = new int[i10];
        }
        int[] iArr2 = this.sampleSizeTable;
        if (iArr2 == null || iArr2.length < i11) {
            int i12 = (i11 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
            this.sampleSizeTable = new int[i12];
            this.sampleCompositionTimeOffsetTable = new int[i12];
            this.sampleDecodingTimeTable = new long[i12];
            this.sampleIsSyncFrameTable = new boolean[i12];
            this.sampleHasSubsampleEncryptionTable = new boolean[i12];
        }
    }

    public void reset() {
        this.trunCount = 0;
        this.nextFragmentDecodeTime = 0L;
        this.definesEncryptionData = false;
        this.sampleEncryptionDataNeedsFill = false;
        this.trackEncryptionBox = null;
    }

    public void fillEncryptionData(ParsableByteArray parsableByteArray) {
        parsableByteArray.readBytes(this.sampleEncryptionData.data, 0, this.sampleEncryptionDataLength);
        this.sampleEncryptionData.setPosition(0);
        this.sampleEncryptionDataNeedsFill = false;
    }
}

package com.mbridge.msdk.playercommon.exoplayer2.extractor.ts;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class NalUnitTargetBuffer {
    private boolean isCompleted;
    private boolean isFilling;
    public byte[] nalData;
    public int nalLength;
    private final int targetType;

    public NalUnitTargetBuffer(int i10, int i11) {
        this.targetType = i10;
        byte[] bArr = new byte[i11 + 3];
        this.nalData = bArr;
        bArr[2] = 1;
    }

    public void appendToNalUnit(byte[] bArr, int i10, int i11) {
        if (this.isFilling) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.nalData;
            int length = bArr2.length;
            int i13 = this.nalLength + i12;
            if (length < i13) {
                this.nalData = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.nalData, this.nalLength, i12);
            this.nalLength += i12;
        }
    }

    public boolean endNalUnit(int i10) {
        if (!this.isFilling) {
            return false;
        }
        this.nalLength -= i10;
        this.isFilling = false;
        this.isCompleted = true;
        return true;
    }

    public boolean isCompleted() {
        return this.isCompleted;
    }

    public void reset() {
        this.isFilling = false;
        this.isCompleted = false;
    }

    public void startNalUnit(int i10) {
        Assertions.checkState(!this.isFilling);
        boolean z10 = i10 == this.targetType;
        this.isFilling = z10;
        if (z10) {
            this.nalLength = 3;
            this.isCompleted = false;
        }
    }
}

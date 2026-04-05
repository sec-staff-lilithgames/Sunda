package com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3;

import android.util.Log;
import b0.e2;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.MpegAudioHeader;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekPoint;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
final class VbriSeeker implements Mp3Extractor.Seeker {
    private static final String TAG = "VbriSeeker";
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j10) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j10;
    }

    public static VbriSeeker create(long j10, long j11, MpegAudioHeader mpegAudioHeader, ParsableByteArray parsableByteArray) {
        int unsignedByte;
        ParsableByteArray parsableByteArray2 = parsableByteArray;
        parsableByteArray2.skipBytes(10);
        int i10 = parsableByteArray2.readInt();
        if (i10 <= 0) {
            return null;
        }
        int i11 = mpegAudioHeader.sampleRate;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(i10, (i11 >= 32000 ? 1152 : 576) * 1000000, i11);
        int unsignedShort = parsableByteArray2.readUnsignedShort();
        int unsignedShort2 = parsableByteArray2.readUnsignedShort();
        int unsignedShort3 = parsableByteArray2.readUnsignedShort();
        parsableByteArray2.skipBytes(2);
        long j12 = j11 + mpegAudioHeader.frameSize;
        long[] jArr = new long[unsignedShort];
        long[] jArr2 = new long[unsignedShort];
        int i12 = 0;
        long j13 = j11;
        while (i12 < unsignedShort) {
            long j14 = j12;
            jArr[i12] = (i12 * jScaleLargeTimestamp) / unsignedShort;
            jArr2[i12] = Math.max(j13, j14);
            if (unsignedShort3 == 1) {
                unsignedByte = parsableByteArray2.readUnsignedByte();
            } else if (unsignedShort3 == 2) {
                unsignedByte = parsableByteArray2.readUnsignedShort();
            } else if (unsignedShort3 == 3) {
                unsignedByte = parsableByteArray2.readUnsignedInt24();
            } else {
                if (unsignedShort3 != 4) {
                    return null;
                }
                unsignedByte = parsableByteArray2.readUnsignedIntToInt();
            }
            j13 += unsignedByte * unsignedShort2;
            i12++;
            parsableByteArray2 = parsableByteArray;
            j12 = j14;
            unsignedShort = unsignedShort;
        }
        if (j10 != -1 && j10 != j13) {
            StringBuilder sbR = e2.r(j10, "VBRI data size mismatch: ", ", ");
            sbR.append(j13);
            Log.w(TAG, sbR.toString());
        }
        return new VbriSeeker(jArr, jArr2, jScaleLargeTimestamp);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j10) {
        int iBinarySearchFloor = Util.binarySearchFloor(this.timesUs, j10, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[iBinarySearchFloor], this.positions[iBinarySearchFloor]);
        if (seekPoint.timeUs >= j10 || iBinarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i10 = iBinarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i10], this.positions[i10]));
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.mp3.Mp3Extractor.Seeker
    public long getTimeUs(long j10) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j10, true, true)];
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}

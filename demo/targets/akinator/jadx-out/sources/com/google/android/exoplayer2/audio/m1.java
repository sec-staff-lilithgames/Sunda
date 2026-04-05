package com.google.android.exoplayer2.audio;

import com.amazon.device.ads.DtbConstants;
import com.applovin.shadow.okio.Utf8;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m1 {
    public static long a(byte b10, byte b11) {
        int i10;
        int i11 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        int i12 = b10 & 3;
        if (i12 != 0) {
            i10 = 2;
            if (i12 != 1 && i12 != 2) {
                i10 = b11 & Utf8.REPLACEMENT_BYTE;
            }
        } else {
            i10 = 1;
        }
        int i13 = i11 >> 3;
        return i10 * (i13 >= 16 ? 2500 << r6 : i13 >= 12 ? 10000 << (i13 & 1) : (i13 & 3) == 3 ? DtbConstants.NETWORK_READ_TIMEOUT : 10000 << r6);
    }

    public static List<byte[]> buildInitializationData(byte[] bArr) {
        long j10 = ((((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) * C.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static int getChannelCount(byte[] bArr) {
        return bArr[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public static long getPacketDurationUs(byte[] bArr) {
        return a(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int parseOggPacketAudioSampleCount(ByteBuffer byteBuffer) {
        int oggPacketForPreAudioSampleByteCount = parseOggPacketForPreAudioSampleByteCount(byteBuffer);
        int i10 = byteBuffer.get(oggPacketForPreAudioSampleByteCount + 26) + 27 + oggPacketForPreAudioSampleByteCount;
        return (int) ((a(byteBuffer.get(i10), byteBuffer.limit() - i10 > 1 ? byteBuffer.get(i10 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int parseOggPacketForPreAudioSampleByteCount(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b10 = byteBuffer.get(26);
        int i10 = 28;
        int i11 = 28;
        for (int i12 = 0; i12 < b10; i12++) {
            i11 += byteBuffer.get(i12 + 27);
        }
        byte b11 = byteBuffer.get(i11 + 26);
        for (int i13 = 0; i13 < b11; i13++) {
            i10 += byteBuffer.get(i11 + 27 + i13);
        }
        return i11 + i10;
    }

    public static int parsePacketAudioSampleCount(ByteBuffer byteBuffer) {
        return (int) ((a(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }
}

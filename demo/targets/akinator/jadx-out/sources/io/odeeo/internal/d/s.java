package io.odeeo.internal.d;

import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class s {
    public static int a(byte[] bArr) {
        return (bArr[10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
    }

    public static long b(long j10) {
        return (j10 * C.NANOS_PER_SECOND) / 48000;
    }

    public static List<byte[]> buildInitializationData(byte[] bArr) {
        long jB = b(a(bArr));
        long jB2 = b(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(a(jB));
        arrayList.add(a(jB2));
        return arrayList;
    }

    public static int getChannelCount(byte[] bArr) {
        return bArr[9] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public static byte[] a(long j10) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j10).array();
    }
}

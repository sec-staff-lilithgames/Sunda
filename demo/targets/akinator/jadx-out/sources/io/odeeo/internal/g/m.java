package io.odeeo.internal.g;

import androidx.core.app.NotificationCompat;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import io.odeeo.internal.b.g0;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class m {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f64144a;
    }

    public static boolean a(int i10, p pVar) {
        return i10 == 0 || i10 == pVar.f64156i;
    }

    public static boolean b(int i10, p pVar) {
        return i10 <= 7 ? i10 == pVar.f64154g - 1 : i10 <= 10 && pVar.f64154g == 2;
    }

    public static boolean checkAndReadFrameHeader(io.odeeo.internal.q0.x xVar, p pVar, int i10, a aVar) {
        int position = xVar.getPosition();
        long unsignedInt = xVar.readUnsignedInt();
        long j10 = unsignedInt >>> 16;
        if (j10 != i10) {
            return false;
        }
        return b((int) ((unsignedInt >> 4) & 15), pVar) && a((int) ((unsignedInt >> 1) & 7), pVar) && !(((unsignedInt & 1) > 1L ? 1 : ((unsignedInt & 1) == 1L ? 0 : -1)) == 0) && a(xVar, pVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(xVar, pVar, (int) ((unsignedInt >> 12) & 15)) && b(xVar, pVar, (int) ((unsignedInt >> 8) & 15)) && a(xVar, position);
    }

    public static boolean checkFrameHeaderFromPeek(i iVar, p pVar, int i10, a aVar) throws IOException {
        long peekPosition = iVar.getPeekPosition();
        byte[] bArr = new byte[2];
        iVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != i10) {
            iVar.resetPeekPosition();
            iVar.advancePeekPosition((int) (peekPosition - iVar.getPosition()));
            return false;
        }
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(16);
        System.arraycopy(bArr, 0, xVar.getData(), 0, 2);
        xVar.setLimit(k.peekToLength(iVar, xVar.getData(), 2, 14));
        iVar.resetPeekPosition();
        iVar.advancePeekPosition((int) (peekPosition - iVar.getPosition()));
        return checkAndReadFrameHeader(xVar, pVar, i10, aVar);
    }

    public static long getFirstSampleNumber(i iVar, p pVar) throws IOException {
        iVar.resetPeekPosition();
        iVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        iVar.peekFully(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        iVar.advancePeekPosition(2);
        int i10 = z10 ? 7 : 6;
        io.odeeo.internal.q0.x xVar = new io.odeeo.internal.q0.x(i10);
        xVar.setLimit(k.peekToLength(iVar, xVar.getData(), 0, i10));
        iVar.resetPeekPosition();
        a aVar = new a();
        if (a(xVar, pVar, z10, aVar)) {
            return aVar.f64144a;
        }
        throw g0.createForMalformedContainer(null, null);
    }

    public static int readFrameBlockSizeSamplesFromKey(io.odeeo.internal.q0.x xVar, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return xVar.readUnsignedByte() + 1;
            case 7:
                return xVar.readUnsignedShort() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i10 - 8);
            default:
                return -1;
        }
    }

    public static boolean a(io.odeeo.internal.q0.x xVar, p pVar, boolean z10, a aVar) {
        try {
            long utf8EncodedLong = xVar.readUtf8EncodedLong();
            if (!z10) {
                utf8EncodedLong *= pVar.f64149b;
            }
            aVar.f64144a = utf8EncodedLong;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean b(io.odeeo.internal.q0.x xVar, p pVar, int i10) {
        int i11 = pVar.f64152e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == pVar.f64153f;
        }
        if (i10 == 12) {
            return xVar.readUnsignedByte() * 1000 == i11;
        }
        if (i10 <= 14) {
            int unsignedShort = xVar.readUnsignedShort();
            if (i10 == 14) {
                unsignedShort *= 10;
            }
            if (unsignedShort == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean a(io.odeeo.internal.q0.x xVar, p pVar, int i10) {
        int frameBlockSizeSamplesFromKey = readFrameBlockSizeSamplesFromKey(xVar, i10);
        return frameBlockSizeSamplesFromKey != -1 && frameBlockSizeSamplesFromKey <= pVar.f64149b;
    }

    public static boolean a(io.odeeo.internal.q0.x xVar, int i10) {
        return xVar.readUnsignedByte() == io.odeeo.internal.q0.g0.crc8(xVar.getData(), i10, xVar.getPosition() - 1, 0);
    }
}

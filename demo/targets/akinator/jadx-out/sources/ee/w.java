package ee;

import androidx.core.app.NotificationCompat;
import com.google.android.exoplayer2.h2;
import com.google.android.exoplayer2.util.v0;
import com.inmobi.commons.core.configs.AdConfig;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class w {
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean checkAndReadFrameHeader(com.google.android.exoplayer2.util.v0 r17, ee.a0 r18, int r19, ee.v r20) {
        /*
            r0 = r18
            int r1 = r17.getPosition()
            long r2 = r17.readUnsignedInt()
            r4 = 16
            long r4 = r2 >>> r4
            r6 = r19
            long r6 = (long) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r7 = 0
            if (r6 == 0) goto L18
            goto Lb7
        L18:
            r8 = 1
            long r4 = r4 & r8
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            r5 = 1
            if (r4 != 0) goto L22
            r4 = r5
            goto L23
        L22:
            r4 = r7
        L23:
            r6 = 12
            long r10 = r2 >> r6
            r12 = 15
            long r10 = r10 & r12
            int r10 = (int) r10
            r11 = 8
            long r14 = r2 >> r11
            long r14 = r14 & r12
            int r11 = (int) r14
            r14 = 4
            long r14 = r2 >> r14
            long r12 = r12 & r14
            int r12 = (int) r12
            long r13 = r2 >> r5
            r15 = 7
            long r13 = r13 & r15
            int r13 = (int) r13
            long r2 = r2 & r8
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L43
            r2 = r5
            goto L44
        L43:
            r2 = r7
        L44:
            r3 = 7
            if (r12 > r3) goto L4d
            int r3 = r0.f54159g
            int r3 = r3 - r5
            if (r12 != r3) goto Lb7
            goto L56
        L4d:
            r3 = 10
            if (r12 > r3) goto Lb7
            int r3 = r0.f54159g
            r8 = 2
            if (r3 != r8) goto Lb7
        L56:
            if (r13 != 0) goto L59
            goto L5d
        L59:
            int r3 = r0.f54161i
            if (r13 != r3) goto Lb7
        L5d:
            if (r2 != 0) goto Lb7
            long r2 = r17.readUtf8EncodedLong()     // Catch: java.lang.NumberFormatException -> Lb7
            if (r4 == 0) goto L68
        L65:
            r4 = r20
            goto L6d
        L68:
            int r4 = r0.f54154b
            long r8 = (long) r4
            long r2 = r2 * r8
            goto L65
        L6d:
            r4.f54263a = r2
            r2 = r17
            int r3 = readFrameBlockSizeSamplesFromKey(r2, r10)
            r4 = -1
            if (r3 == r4) goto Lb7
            int r4 = r0.f54154b
            if (r3 > r4) goto Lb7
            int r3 = r0.f54157e
            if (r11 != 0) goto L81
            goto La3
        L81:
            r4 = 11
            if (r11 > r4) goto L8a
            int r0 = r0.f54158f
            if (r11 != r0) goto Lb7
            goto La3
        L8a:
            if (r11 != r6) goto L95
            int r0 = r2.readUnsignedByte()
            int r0 = r0 * 1000
            if (r0 != r3) goto Lb7
            goto La3
        L95:
            r0 = 14
            if (r11 > r0) goto Lb7
            int r4 = r2.readUnsignedShort()
            if (r11 != r0) goto La1
            int r4 = r4 * 10
        La1:
            if (r4 != r3) goto Lb7
        La3:
            int r0 = r2.readUnsignedByte()
            int r3 = r2.getPosition()
            byte[] r2 = r2.getData()
            int r3 = r3 - r5
            int r1 = com.google.android.exoplayer2.util.n1.crc8(r2, r1, r3, r7)
            if (r0 != r1) goto Lb7
            return r5
        Lb7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ee.w.checkAndReadFrameHeader(com.google.android.exoplayer2.util.v0, ee.a0, int, ee.v):boolean");
    }

    public static boolean checkFrameHeaderFromPeek(q qVar, a0 a0Var, int i10, v vVar) throws IOException {
        long peekPosition = qVar.getPeekPosition();
        byte[] bArr = new byte[2];
        qVar.peekFully(bArr, 0, 2);
        if ((((bArr[0] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED)) != i10) {
            qVar.resetPeekPosition();
            qVar.advancePeekPosition((int) (peekPosition - qVar.getPosition()));
            return false;
        }
        v0 v0Var = new v0(16);
        System.arraycopy(bArr, 0, v0Var.getData(), 0, 2);
        v0Var.setLimit(t.peekToLength(qVar, v0Var.getData(), 2, 14));
        qVar.resetPeekPosition();
        qVar.advancePeekPosition((int) (peekPosition - qVar.getPosition()));
        return checkAndReadFrameHeader(v0Var, a0Var, i10, vVar);
    }

    public static long getFirstSampleNumber(q qVar, a0 a0Var) throws IOException {
        qVar.resetPeekPosition();
        qVar.advancePeekPosition(1);
        byte[] bArr = new byte[1];
        qVar.peekFully(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        qVar.advancePeekPosition(2);
        int i10 = z10 ? 7 : 6;
        v0 v0Var = new v0(i10);
        v0Var.setLimit(t.peekToLength(qVar, v0Var.getData(), 0, i10));
        qVar.resetPeekPosition();
        v vVar = new v();
        try {
            long utf8EncodedLong = v0Var.readUtf8EncodedLong();
            if (!z10) {
                utf8EncodedLong *= a0Var.f54154b;
            }
            vVar.f54263a = utf8EncodedLong;
            return utf8EncodedLong;
        } catch (NumberFormatException unused) {
            throw h2.createForMalformedContainer(null, null);
        }
    }

    public static int readFrameBlockSizeSamplesFromKey(v0 v0Var, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return v0Var.readUnsignedByte() + 1;
            case 7:
                return v0Var.readUnsignedShort() + 1;
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
}

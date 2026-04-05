package ko;

import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.AdConfig;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f71645a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, DtbConstants.DEFAULT_PLAYER_HEIGHT, 400, 400, 2048};

    public static void a(io.bidmachine.media3.common.util.l0 l0Var, e eVar) throws gn.z0 {
        int bits = l0Var.readBits(5);
        l0Var.skipBits(2);
        if (l0Var.readBit()) {
            l0Var.skipBits(5);
        }
        if (bits >= 7 && bits <= 10) {
            l0Var.skipBit();
        }
        if (l0Var.readBit()) {
            int bits2 = l0Var.readBits(3);
            if (eVar.f71629b == -1 && bits >= 0 && bits <= 15 && (bits2 == 0 || bits2 == 1)) {
                eVar.f71629b = bits;
            }
            if (l0Var.readBit()) {
                c(l0Var);
            }
        }
    }

    public static void b(io.bidmachine.media3.common.util.l0 l0Var, e eVar) throws gn.z0 {
        l0Var.skipBits(2);
        boolean bit = l0Var.readBit();
        int bits = l0Var.readBits(8);
        for (int i10 = 0; i10 < bits; i10++) {
            l0Var.skipBits(2);
            if (l0Var.readBit()) {
                l0Var.skipBits(5);
            }
            if (bit) {
                l0Var.skipBits(24);
            } else {
                if (l0Var.readBit()) {
                    if (!l0Var.readBit()) {
                        l0Var.skipBits(4);
                    }
                    eVar.f71630c = l0Var.readBits(6) + 1;
                }
                l0Var.skipBits(4);
            }
        }
        if (l0Var.readBit()) {
            l0Var.skipBits(3);
            if (l0Var.readBit()) {
                c(l0Var);
            }
        }
    }

    public static void c(io.bidmachine.media3.common.util.l0 l0Var) throws gn.z0 {
        int bits = l0Var.readBits(6);
        if (bits < 2 || bits > 42) {
            throw gn.z0.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(bits)));
        }
        l0Var.skipBits(bits * 8);
    }

    public static void getAc4SampleHeader(int i10, io.bidmachine.media3.common.util.m0 m0Var) {
        m0Var.reset(7);
        byte[] data = m0Var.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i10 >> 16) & 255);
        data[5] = (byte) ((i10 >> 8) & 255);
        data[6] = (byte) (i10 & 255);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0327  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.bidmachine.media3.common.b parseAc4AnnexEFormat(io.bidmachine.media3.common.util.m0 r20, java.lang.String r21, java.lang.String r22, io.bidmachine.media3.common.DrmInitData r23) throws gn.z0 {
        /*
            Method dump skipped, instructions count: 870
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.g.parseAc4AnnexEFormat(io.bidmachine.media3.common.util.m0, java.lang.String, java.lang.String, io.bidmachine.media3.common.DrmInitData):io.bidmachine.media3.common.b");
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new io.bidmachine.media3.common.util.l0(bArr)).f71636c;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static ko.f parseAc4SyncframeInfo(io.bidmachine.media3.common.util.l0 r9) {
        /*
            r0 = 16
            int r1 = r9.readBits(r0)
            int r0 = r9.readBits(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.readBits(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.readBits(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.readBits(r1)
            boolean r2 = r9.readBit()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.readBits(r2)
            boolean r5 = r9.readBit()
            if (r5 == 0) goto L47
            int r5 = r9.readBits(r4)
            if (r5 <= 0) goto L47
            r9.skipBits(r1)
        L47:
            boolean r5 = r9.readBit()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.readBits(r3)
            int[] r8 = ko.g.f71645a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            ko.f r1 = new ko.f
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ko.g.parseAc4SyncframeInfo(io.bidmachine.media3.common.util.l0):ko.f");
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i10) {
        int i11 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i12 = ((bArr[2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        if (i12 == 65535) {
            i12 = ((bArr[4] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[5] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | (bArr[6] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
        } else {
            i11 = 4;
        }
        if (i10 == 44097) {
            i11 += 2;
        }
        return i12 + i11;
    }
}

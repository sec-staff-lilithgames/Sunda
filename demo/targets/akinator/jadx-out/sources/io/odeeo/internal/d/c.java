package io.odeeo.internal.d;

import com.amazon.device.ads.DtbConstants;
import com.inmobi.commons.core.configs.AdConfig;
import io.odeeo.internal.b.t;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f63328a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, DtbConstants.DEFAULT_PLAYER_HEIGHT, 400, 400, 2048};

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f63329a;

        /* renamed from: b, reason: collision with root package name */
        public final int f63330b;

        /* renamed from: c, reason: collision with root package name */
        public final int f63331c;

        /* renamed from: d, reason: collision with root package name */
        public final int f63332d;

        /* renamed from: e, reason: collision with root package name */
        public final int f63333e;

        public b(int i10, int i11, int i12, int i13, int i14) {
            this.f63329a = i10;
            this.f63331c = i11;
            this.f63330b = i12;
            this.f63332d = i13;
            this.f63333e = i14;
        }
    }

    public static int a(io.odeeo.internal.q0.w wVar, int i10) {
        int i11 = 0;
        while (true) {
            int bits = wVar.readBits(i10) + i11;
            if (!wVar.readBit()) {
                return bits;
            }
            i11 = (bits + 1) << i10;
        }
    }

    public static void getAc4SampleHeader(int i10, io.odeeo.internal.q0.x xVar) {
        xVar.reset(7);
        byte[] data = xVar.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i10 >> 16) & 255);
        data[5] = (byte) ((i10 >> 8) & 255);
        data[6] = (byte) (i10 & 255);
    }

    public static io.odeeo.internal.b.t parseAc4AnnexEFormat(io.odeeo.internal.q0.x xVar, String str, String str2, io.odeeo.internal.f.e eVar) {
        xVar.skipBytes(1);
        return new t.b().setId(str).setSampleMimeType("audio/ac4").setChannelCount(2).setSampleRate(((xVar.readUnsignedByte() & 32) >> 5) == 1 ? 48000 : 44100).setDrmInitData(eVar).setLanguage(str2).build();
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new io.odeeo.internal.q0.w(bArr)).f63333e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0087, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008c, code lost:
    
        if (r11 != 8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static io.odeeo.internal.d.c.b parseAc4SyncframeInfo(io.odeeo.internal.q0.w r11) {
        /*
            r0 = 16
            int r1 = r11.readBits(r0)
            int r0 = r11.readBits(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r11.readBits(r0)
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
            r8 = r0
            r0 = 2
            int r1 = r11.readBits(r0)
            r2 = 3
            if (r1 != r2) goto L2f
            int r4 = a(r11, r0)
            int r1 = r1 + r4
        L2f:
            r5 = r1
            r1 = 10
            int r1 = r11.readBits(r1)
            boolean r4 = r11.readBit()
            if (r4 == 0) goto L45
            int r4 = r11.readBits(r2)
            if (r4 <= 0) goto L45
            r11.skipBits(r0)
        L45:
            boolean r4 = r11.readBit()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r4 == 0) goto L53
            r4 = r7
            goto L55
        L53:
            r4 = r7
            r7 = r6
        L55:
            int r11 = r11.readBits(r3)
            if (r7 != r6) goto L65
            r6 = 13
            if (r11 != r6) goto L65
            int[] r0 = io.odeeo.internal.d.c.f63328a
            r11 = r0[r11]
        L63:
            r9 = r11
            goto L96
        L65:
            if (r7 != r4) goto L94
            int[] r4 = io.odeeo.internal.d.c.f63328a
            int r6 = r4.length
            if (r11 >= r6) goto L94
            r4 = r4[r11]
            int r1 = r1 % 5
            r6 = 1
            r9 = 8
            if (r1 == r6) goto L8a
            r6 = 11
            if (r1 == r0) goto L85
            if (r1 == r2) goto L8a
            if (r1 == r3) goto L7e
            goto L8f
        L7e:
            if (r11 == r2) goto L91
            if (r11 == r9) goto L91
            if (r11 != r6) goto L8f
            goto L91
        L85:
            if (r11 == r9) goto L91
            if (r11 != r6) goto L8f
            goto L91
        L8a:
            if (r11 == r2) goto L91
            if (r11 != r9) goto L8f
            goto L91
        L8f:
            r9 = r4
            goto L96
        L91:
            int r11 = r4 + 1
            goto L63
        L94:
            r11 = 0
            goto L63
        L96:
            io.odeeo.internal.d.c$b r4 = new io.odeeo.internal.d.c$b
            r6 = 2
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.d.c.parseAc4SyncframeInfo(io.odeeo.internal.q0.w):io.odeeo.internal.d.c$b");
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

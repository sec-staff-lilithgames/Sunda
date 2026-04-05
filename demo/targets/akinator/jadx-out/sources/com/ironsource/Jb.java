package com.ironsource;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.UnsupportedEncodingException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Jb {

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f34709d = {-128, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: a, reason: collision with root package name */
    private a f34710a;

    /* renamed from: b, reason: collision with root package name */
    private a f34711b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f34712c = new int[16];

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f34713a;

        /* renamed from: b, reason: collision with root package name */
        private int[] f34714b;

        /* renamed from: c, reason: collision with root package name */
        private long f34715c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f34716d;

        public /* synthetic */ a(Jb jb2, int i10) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            int[] iArr = this.f34714b;
            iArr[0] = 1732584193;
            iArr[1] = -271733879;
            iArr[2] = -1732584194;
            iArr[3] = 271733878;
            this.f34715c = 0L;
        }

        private a() {
            this.f34713a = true;
            this.f34714b = new int[4];
            this.f34716d = new byte[64];
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(a aVar) {
            byte[] bArr = aVar.f34716d;
            byte[] bArr2 = this.f34716d;
            System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
            int[] iArr = aVar.f34714b;
            int[] iArr2 = this.f34714b;
            System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
            this.f34713a = aVar.f34713a;
            this.f34715c = aVar.f34715c;
        }
    }

    public Jb() {
        int i10 = 0;
        this.f34710a = new a(this, i10);
        this.f34711b = new a(this, i10);
        c();
    }

    private static int d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int iC = p0.o2.c(i10, i12 ^ ((~i13) | i11), i14, i16);
        return ((iC >>> (32 - i15)) | (iC << i15)) + i11;
    }

    public byte[] a() {
        a aVar = this.f34711b;
        if (!aVar.f34713a) {
            aVar.a(this.f34710a);
            a aVar2 = this.f34711b;
            long j10 = aVar2.f34715c;
            int i10 = (int) ((j10 >>> 3) & 63);
            a(aVar2, f34709d, 0, i10 < 56 ? 56 - i10 : 120 - i10);
            a(this.f34711b, a(j10), 0, 8);
            this.f34711b.f34713a = true;
        }
        return a(this.f34711b.f34714b, 16);
    }

    public String b() {
        return a(a());
    }

    public void c() {
        this.f34710a.a();
        this.f34711b.f34713a = false;
    }

    public String toString() {
        return b();
    }

    public void b(byte[] bArr, int i10, int i11) {
        a(this.f34710a, bArr, i10, i11);
    }

    private static int c(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int iC = p0.o2.c(i10, (i12 ^ i11) ^ i13, i14, i16);
        return ((iC >>> (32 - i15)) | (iC << i15)) + i11;
    }

    public void b(byte[] bArr) {
        b(bArr, 0, bArr.length);
    }

    public void b(String str) {
        b(str.getBytes());
    }

    private static int b(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int iC = p0.o2.c(i10, (i12 & (~i13)) | (i11 & i13), i14, i16);
        return ((iC >>> (32 - i15)) | (iC << i15)) + i11;
    }

    public static String a(String str) {
        Jb jb2 = new Jb();
        jb2.b(str);
        return jb2.b();
    }

    private void a(a aVar, byte[] bArr, int i10, int i11) {
        int i12 = 0;
        this.f34711b.f34713a = false;
        if (i11 + i10 > bArr.length) {
            i11 = bArr.length - i10;
        }
        long j10 = aVar.f34715c;
        int i13 = ((int) (j10 >>> 3)) & 63;
        aVar.f34715c = j10 + (i11 << 3);
        int i14 = 64 - i13;
        if (i11 >= i14) {
            System.arraycopy(bArr, i10, aVar.f34716d, i13, i14);
            a(aVar, a(aVar.f34716d, 64, 0));
            while (i14 + 63 < i11) {
                a(aVar, a(bArr, 64, i14));
                i14 += 64;
            }
            i13 = 0;
            i12 = i14;
        }
        if (i12 < i11) {
            for (int i15 = i12; i15 < i11; i15++) {
                aVar.f34716d[(i13 + i15) - i12] = bArr[i15 + i10];
            }
        }
    }

    public void a(byte[] bArr, int i10) {
        b(bArr, 0, i10);
    }

    public void a(byte b10) {
        a(new byte[]{b10}, 1);
    }

    public void a(String str, String str2) throws UnsupportedEncodingException {
        b(str.getBytes(str2));
    }

    private static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer(bArr.length * 2);
        for (byte b10 : bArr) {
            int i10 = b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            if (i10 < 16) {
                stringBuffer.append("0");
            }
            stringBuffer.append(Integer.toHexString(i10));
        }
        return stringBuffer.toString();
    }

    private static int a(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        int iC = p0.o2.c(i10, (i12 & i11) | (i13 & (~i11)), i14, i16);
        return ((iC >>> (32 - i15)) | (iC << i15)) + i11;
    }

    private static byte[] a(long j10) {
        return new byte[]{(byte) (j10 & 255), (byte) ((j10 >>> 8) & 255), (byte) ((j10 >>> 16) & 255), (byte) ((j10 >>> 24) & 255), (byte) ((j10 >>> 32) & 255), (byte) ((j10 >>> 40) & 255), (byte) ((j10 >>> 48) & 255), (byte) ((j10 >>> 56) & 255)};
    }

    private static byte[] a(int[] iArr, int i10) {
        byte[] bArr = new byte[i10];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12 += 4) {
            int i13 = iArr[i11];
            bArr[i12] = (byte) (i13 & 255);
            bArr[i12 + 1] = (byte) ((i13 >>> 8) & 255);
            bArr[i12 + 2] = (byte) ((i13 >>> 16) & 255);
            bArr[i12 + 3] = (byte) ((i13 >>> 24) & 255);
            i11++;
        }
        return bArr;
    }

    private int[] a(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13 += 4) {
            this.f34712c[i12] = (bArr[i13 + i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) | ((bArr[(i13 + 1) + i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) | ((bArr[(i13 + 2) + i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[(i13 + 3) + i11] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24);
            i12++;
        }
        return this.f34712c;
    }

    private static void a(a aVar, int[] iArr) {
        int[] iArr2 = aVar.f34714b;
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        int i12 = iArr2[2];
        int i13 = iArr2[3];
        int iA = a(i10, i11, i12, i13, iArr[0], 7, -680876936);
        int iA2 = a(i13, iA, i11, i12, iArr[1], 12, -389564586);
        int iA3 = a(i12, iA2, iA, i11, iArr[2], 17, 606105819);
        int iA4 = a(i11, iA3, iA2, iA, iArr[3], 22, -1044525330);
        int iA5 = a(iA, iA4, iA3, iA2, iArr[4], 7, -176418897);
        int iA6 = a(iA2, iA5, iA4, iA3, iArr[5], 12, 1200080426);
        int iA7 = a(iA3, iA6, iA5, iA4, iArr[6], 17, -1473231341);
        int iA8 = a(iA4, iA7, iA6, iA5, iArr[7], 22, -45705983);
        int iA9 = a(iA5, iA8, iA7, iA6, iArr[8], 7, 1770035416);
        int iA10 = a(iA6, iA9, iA8, iA7, iArr[9], 12, -1958414417);
        int iA11 = a(iA7, iA10, iA9, iA8, iArr[10], 17, -42063);
        int iA12 = a(iA8, iA11, iA10, iA9, iArr[11], 22, -1990404162);
        int iA13 = a(iA9, iA12, iA11, iA10, iArr[12], 7, 1804603682);
        int iA14 = a(iA10, iA13, iA12, iA11, iArr[13], 12, -40341101);
        int iA15 = a(iA11, iA14, iA13, iA12, iArr[14], 17, -1502002290);
        int iA16 = a(iA12, iA15, iA14, iA13, iArr[15], 22, 1236535329);
        int iB = b(iA13, iA16, iA15, iA14, iArr[1], 5, -165796510);
        int iB2 = b(iA14, iB, iA16, iA15, iArr[6], 9, -1069501632);
        int iB3 = b(iA15, iB2, iB, iA16, iArr[11], 14, 643717713);
        int iB4 = b(iA16, iB3, iB2, iB, iArr[0], 20, -373897302);
        int iB5 = b(iB, iB4, iB3, iB2, iArr[5], 5, -701558691);
        int iB6 = b(iB2, iB5, iB4, iB3, iArr[10], 9, 38016083);
        int iB7 = b(iB3, iB6, iB5, iB4, iArr[15], 14, -660478335);
        int iB8 = b(iB4, iB7, iB6, iB5, iArr[4], 20, -405537848);
        int iB9 = b(iB5, iB8, iB7, iB6, iArr[9], 5, 568446438);
        int iB10 = b(iB6, iB9, iB8, iB7, iArr[14], 9, -1019803690);
        int iB11 = b(iB7, iB10, iB9, iB8, iArr[3], 14, -187363961);
        int iB12 = b(iB8, iB11, iB10, iB9, iArr[8], 20, 1163531501);
        int iB13 = b(iB9, iB12, iB11, iB10, iArr[13], 5, -1444681467);
        int iB14 = b(iB10, iB13, iB12, iB11, iArr[2], 9, -51403784);
        int iB15 = b(iB11, iB14, iB13, iB12, iArr[7], 14, 1735328473);
        int iB16 = b(iB12, iB15, iB14, iB13, iArr[12], 20, -1926607734);
        int iC = c(iB13, iB16, iB15, iB14, iArr[5], 4, -378558);
        int iC2 = c(iB14, iC, iB16, iB15, iArr[8], 11, -2022574463);
        int iC3 = c(iB15, iC2, iC, iB16, iArr[11], 16, 1839030562);
        int iC4 = c(iB16, iC3, iC2, iC, iArr[14], 23, -35309556);
        int iC5 = c(iC, iC4, iC3, iC2, iArr[1], 4, -1530992060);
        int iC6 = c(iC2, iC5, iC4, iC3, iArr[4], 11, 1272893353);
        int iC7 = c(iC3, iC6, iC5, iC4, iArr[7], 16, -155497632);
        int iC8 = c(iC4, iC7, iC6, iC5, iArr[10], 23, -1094730640);
        int iC9 = c(iC5, iC8, iC7, iC6, iArr[13], 4, 681279174);
        int iC10 = c(iC6, iC9, iC8, iC7, iArr[0], 11, -358537222);
        int iC11 = c(iC7, iC10, iC9, iC8, iArr[3], 16, -722521979);
        int iC12 = c(iC8, iC11, iC10, iC9, iArr[6], 23, 76029189);
        int iC13 = c(iC9, iC12, iC11, iC10, iArr[9], 4, -640364487);
        int iC14 = c(iC10, iC13, iC12, iC11, iArr[12], 11, -421815835);
        int iC15 = c(iC11, iC14, iC13, iC12, iArr[15], 16, 530742520);
        int iC16 = c(iC12, iC15, iC14, iC13, iArr[2], 23, -995338651);
        int iD = d(iC13, iC16, iC15, iC14, iArr[0], 6, -198630844);
        int iD2 = d(iC14, iD, iC16, iC15, iArr[7], 10, 1126891415);
        int iD3 = d(iC15, iD2, iD, iC16, iArr[14], 15, -1416354905);
        int iD4 = d(iC16, iD3, iD2, iD, iArr[5], 21, -57434055);
        int iD5 = d(iD, iD4, iD3, iD2, iArr[12], 6, 1700485571);
        int iD6 = d(iD2, iD5, iD4, iD3, iArr[3], 10, -1894986606);
        int iD7 = d(iD3, iD6, iD5, iD4, iArr[10], 15, -1051523);
        int iD8 = d(iD4, iD7, iD6, iD5, iArr[1], 21, -2054922799);
        int iD9 = d(iD5, iD8, iD7, iD6, iArr[8], 6, 1873313359);
        int iD10 = d(iD6, iD9, iD8, iD7, iArr[15], 10, -30611744);
        int iD11 = d(iD7, iD10, iD9, iD8, iArr[6], 15, -1560198380);
        int iD12 = d(iD8, iD11, iD10, iD9, iArr[13], 21, 1309151649);
        int iD13 = d(iD9, iD12, iD11, iD10, iArr[4], 6, -145523070);
        int iD14 = d(iD10, iD13, iD12, iD11, iArr[11], 10, -1120210379);
        int iD15 = d(iD11, iD14, iD13, iD12, iArr[2], 15, 718787259);
        int iD16 = d(iD12, iD15, iD14, iD13, iArr[9], 21, -343485551);
        int[] iArr3 = aVar.f34714b;
        iArr3[0] = iArr3[0] + iD13;
        iArr3[1] = iArr3[1] + iD16;
        iArr3[2] = iArr3[2] + iD15;
        iArr3[3] = iArr3[3] + iD14;
    }
}

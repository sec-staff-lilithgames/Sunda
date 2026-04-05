package io.ktor.util;

import com.inmobi.commons.core.configs.AdConfig;
import kotlin.jvm.internal.e0;
import uu.f0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class Sha1 implements HashFunction {
    private long messageLength;
    private int unprocessedLimit;
    private final byte[] unprocessed = new byte[64];
    private final int[] words = new int[80];

    /* renamed from: h0, reason: collision with root package name */
    private int f62175h0 = 1732584193;

    /* renamed from: h1, reason: collision with root package name */
    private int f62176h1 = -271733879;

    /* renamed from: h2, reason: collision with root package name */
    private int f62177h2 = -1732584194;

    /* renamed from: h3, reason: collision with root package name */
    private int f62178h3 = 271733878;

    /* renamed from: h4, reason: collision with root package name */
    private int f62179h4 = -1009589776;

    private final void processChunk(byte[] bArr, int i10) {
        int i11;
        int iLeftRotate;
        int i12;
        int[] iArr = this.words;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= 16) {
                break;
            }
            int i15 = i10 + 3;
            int i16 = ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) | ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) | ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8);
            i10 += 4;
            iArr[i14] = i16 | (bArr[i15] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            i14++;
        }
        for (i11 = 16; i11 < 80; i11++) {
            iArr[i11] = HashFunctionKt.leftRotate(((iArr[i11 - 3] ^ iArr[i11 - 8]) ^ iArr[i11 - 14]) ^ iArr[i11 - 16], 1);
        }
        int i17 = this.f62175h0;
        int i18 = this.f62176h1;
        int iLeftRotate2 = this.f62177h2;
        int i19 = this.f62178h3;
        int i20 = this.f62179h4;
        while (i13 < 80) {
            if (i13 < 20) {
                iLeftRotate = HashFunctionKt.leftRotate(i17, 5) + (((iLeftRotate2 ^ i19) & i18) ^ i19) + i20 + 1518500249;
                i12 = iArr[i13];
            } else if (i13 < 40) {
                iLeftRotate = HashFunctionKt.leftRotate(i17, 5) + ((i18 ^ iLeftRotate2) ^ i19) + i20 + 1859775393;
                i12 = iArr[i13];
            } else if (i13 < 60) {
                iLeftRotate = ((HashFunctionKt.leftRotate(i17, 5) + (((iLeftRotate2 | i19) & i18) | (iLeftRotate2 & i19))) + i20) - 1894007588;
                i12 = iArr[i13];
            } else {
                iLeftRotate = ((HashFunctionKt.leftRotate(i17, 5) + ((i18 ^ iLeftRotate2) ^ i19)) + i20) - 899497514;
                i12 = iArr[i13];
            }
            int i21 = iLeftRotate + i12;
            i13++;
            i20 = i19;
            i19 = iLeftRotate2;
            iLeftRotate2 = HashFunctionKt.leftRotate(i18, 30);
            i18 = i17;
            i17 = i21;
        }
        this.f62175h0 += i17;
        this.f62176h1 += i18;
        this.f62177h2 += iLeftRotate2;
        this.f62178h3 += i19;
        this.f62179h4 += i20;
    }

    private final void reset() {
        this.messageLength = 0L;
        f0.fill$default(this.unprocessed, (byte) 0, 0, 0, 6, (Object) null);
        this.unprocessedLimit = 0;
        f0.fill$default(this.words, 0, 0, 0, 6, (Object) null);
        this.f62175h0 = 1732584193;
        this.f62176h1 = -271733879;
        this.f62177h2 = -1732584194;
        this.f62178h3 = 271733878;
        this.f62179h4 = -1009589776;
    }

    @Override // io.ktor.util.HashFunction
    public byte[] digest() {
        byte[] bArr = this.unprocessed;
        int i10 = this.unprocessedLimit;
        long j10 = this.messageLength * 8;
        int i11 = i10 + 1;
        bArr[i10] = -128;
        if (i11 > 56) {
            f0.fill(bArr, (byte) 0, i11, 64);
            processChunk(bArr, 0);
            f0.fill(bArr, (byte) 0, 0, i11);
        } else {
            f0.fill(bArr, (byte) 0, i11, 56);
        }
        bArr[56] = (byte) (j10 >>> 56);
        bArr[57] = (byte) (j10 >>> 48);
        bArr[58] = (byte) (j10 >>> 40);
        bArr[59] = (byte) (j10 >>> 32);
        bArr[60] = (byte) (j10 >>> 24);
        bArr[61] = (byte) (j10 >>> 16);
        bArr[62] = (byte) (j10 >>> 8);
        bArr[63] = (byte) j10;
        processChunk(bArr, 0);
        int i12 = this.f62175h0;
        int i13 = this.f62176h1;
        int i14 = this.f62177h2;
        int i15 = this.f62178h3;
        int i16 = this.f62179h4;
        reset();
        return new byte[]{(byte) (i12 >> 24), (byte) (i12 >> 16), (byte) (i12 >> 8), (byte) i12, (byte) (i13 >> 24), (byte) (i13 >> 16), (byte) (i13 >> 8), (byte) i13, (byte) (i14 >> 24), (byte) (i14 >> 16), (byte) (i14 >> 8), (byte) i14, (byte) (i15 >> 24), (byte) (i15 >> 16), (byte) (i15 >> 8), (byte) i15, (byte) (i16 >> 24), (byte) (i16 >> 16), (byte) (i16 >> 8), (byte) i16};
    }

    @Override // io.ktor.util.HashFunction
    public void update(byte[] input, int i10, int i11) {
        e0.checkNotNullParameter(input, "input");
        this.messageLength += i11;
        int i12 = i10 + i11;
        byte[] bArr = this.unprocessed;
        int i13 = this.unprocessedLimit;
        if (i13 > 0) {
            int i14 = i11 + i13;
            if (i14 < 64) {
                f0.copyInto(input, bArr, i13, i10, i12);
                this.unprocessedLimit = i14;
                return;
            } else {
                int i15 = (64 - i13) + i10;
                f0.copyInto(input, bArr, i13, i10, i15);
                processChunk(bArr, 0);
                this.unprocessedLimit = 0;
                i10 = i15;
            }
        }
        while (i10 < i12) {
            int i16 = i10 + 64;
            if (i16 > i12) {
                f0.copyInto(input, bArr, 0, i10, i12);
                this.unprocessedLimit = i12 - i10;
                return;
            } else {
                processChunk(input, i10);
                i10 = i16;
            }
        }
    }
}

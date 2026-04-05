package com.bytedance.sdk.component.jd.jpo.jd;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p0.o2;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class jpo implements jd, wqx, Cloneable, ByteChannel {
    private static final byte[] wqx = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: jd, reason: collision with root package name */
    long f18568jd;
    my jpo;

    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public jpo clone() {
        jpo jpoVar = new jpo();
        if (this.f18568jd == 0) {
            return jpoVar;
        }
        my myVarJpo = this.jpo.jpo();
        jpoVar.jpo = myVarJpo;
        myVarJpo.f18572qk = myVarJpo;
        myVarJpo.f18571jj = myVarJpo;
        my myVar = this.jpo;
        while (true) {
            myVar = myVar.f18571jj;
            if (myVar == this.jpo) {
                jpoVar.f18568jd = this.f18568jd;
                return jpoVar;
            }
            jpoVar.jpo.f18572qk.jpo(myVar.jpo());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpo)) {
            return false;
        }
        jpo jpoVar = (jpo) obj;
        long j10 = this.f18568jd;
        if (j10 != jpoVar.f18568jd) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        my myVar = this.jpo;
        my myVar2 = jpoVar.jpo;
        int i10 = myVar.f18570jd;
        int i11 = myVar2.f18570jd;
        while (j11 < this.f18568jd) {
            long jMin = Math.min(myVar.wqx - i10, myVar2.wqx - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (myVar.jpo[i10] != myVar2.jpo[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == myVar.wqx) {
                myVar = myVar.f18571jj;
                i10 = myVar.f18570jd;
            }
            if (i11 == myVar2.wqx) {
                myVar2 = myVar2.f18571jj;
                i11 = myVar2.f18570jd;
            }
            j11 += jMin;
        }
        return true;
    }

    public int hashCode() {
        my myVar = this.jpo;
        if (myVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = myVar.wqx;
            for (int i12 = myVar.f18570jd; i12 < i11; i12++) {
                i10 = (i10 * 31) + myVar.jpo[i12];
            }
            myVar = myVar.f18571jj;
        } while (myVar != this.jpo);
        return i10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public byte jd() {
        long j10 = this.f18568jd;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        my myVar = this.jpo;
        int i10 = myVar.f18570jd;
        int i11 = myVar.wqx;
        int i12 = i10 + 1;
        byte b10 = myVar.jpo[i10];
        this.f18568jd = j10 - 1;
        if (i12 != i11) {
            myVar.f18570jd = i12;
            return b10;
        }
        this.jpo = myVar.jd();
        jj.jpo(myVar);
        return b10;
    }

    public boolean jpo() {
        return this.f18568jd == 0;
    }

    public final cm my() {
        long j10 = this.f18568jd;
        if (j10 <= 2147483647L) {
            return cm((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f18568jd);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        my myVar = this.jpo;
        if (myVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), myVar.wqx - myVar.f18570jd);
        byteBuffer.put(myVar.jpo, myVar.f18570jd, iMin);
        int i10 = myVar.f18570jd + iMin;
        myVar.f18570jd = i10;
        this.f18568jd -= iMin;
        if (i10 == myVar.wqx) {
            this.jpo = myVar.jd();
            jj.jpo(myVar);
        }
        return iMin;
    }

    public String toString() {
        return my().toString();
    }

    public String wqx() {
        try {
            return jpo(this.f18568jd, zz.jpo);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            my myVarWqx = wqx(1);
            int iMin = Math.min(i10, 8192 - myVarWqx.wqx);
            byteBuffer.get(myVarWqx.jpo, myVarWqx.wqx, iMin);
            i10 -= iMin;
            myVarWqx.wqx += iMin;
        }
        this.f18568jd += iRemaining;
        return iRemaining;
    }

    public String jpo(long j10, Charset charset) throws EOFException {
        zz.jpo(this.f18568jd, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
        }
        if (j10 == 0) {
            return "";
        }
        my myVar = this.jpo;
        int i10 = myVar.f18570jd;
        if (i10 + j10 > myVar.wqx) {
            return new String(jpo(j10), charset);
        }
        String str = new String(myVar.jpo, i10, (int) j10, charset);
        int i11 = (int) (myVar.f18570jd + j10);
        myVar.f18570jd = i11;
        this.f18568jd -= j10;
        if (i11 == myVar.wqx) {
            this.jpo = myVar.jd();
            jj.jpo(myVar);
        }
        return str;
    }

    public my wqx(int i10) {
        if (i10 > 0 && i10 <= 8192) {
            my myVar = this.jpo;
            if (myVar == null) {
                my myVarJpo = jj.jpo();
                this.jpo = myVarJpo;
                myVarJpo.f18572qk = myVarJpo;
                myVarJpo.f18571jj = myVarJpo;
                return myVarJpo;
            }
            my myVar2 = myVar.f18572qk;
            return (myVar2.wqx + i10 > 8192 || !myVar2.my) ? myVar2.jpo(jj.jpo()) : myVar2;
        }
        throw new IllegalArgumentException();
    }

    public final cm cm(int i10) {
        if (i10 == 0) {
            return cm.wqx;
        }
        return new qk(this, i10);
    }

    public jpo jd(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            zz.jpo(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                my myVarWqx = wqx(1);
                int iMin = Math.min(i12 - i10, 8192 - myVarWqx.wqx);
                System.arraycopy(bArr, i10, myVarWqx.jpo, myVarWqx.wqx, iMin);
                i10 += iMin;
                myVarWqx.wqx += iMin;
            }
            this.f18568jd += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] jpo(long j10) throws EOFException {
        zz.jpo(this.f18568jd, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            jpo(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j10)));
    }

    public jpo jd(int i10) {
        my myVarWqx = wqx(1);
        byte[] bArr = myVarWqx.jpo;
        int i11 = myVarWqx.wqx;
        myVarWqx.wqx = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f18568jd++;
        return this;
    }

    public void jpo(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int iJpo = jpo(bArr, i10, bArr.length - i10);
            if (iJpo == -1) {
                throw new EOFException();
            }
            i10 += iJpo;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public jpo jd(long j10) {
        if (j10 == 0) {
            return jd(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        my myVarWqx = wqx(iNumberOfTrailingZeros);
        byte[] bArr = myVarWqx.jpo;
        int i10 = myVarWqx.wqx;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = wqx[(int) (15 & j10)];
            j10 >>>= 4;
        }
        myVarWqx.wqx += iNumberOfTrailingZeros;
        this.f18568jd += iNumberOfTrailingZeros;
        return this;
    }

    public int jpo(byte[] bArr, int i10, int i11) {
        zz.jpo(bArr.length, i10, i11);
        my myVar = this.jpo;
        if (myVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, myVar.wqx - myVar.f18570jd);
        System.arraycopy(myVar.jpo, myVar.f18570jd, bArr, i10, iMin);
        int i12 = myVar.f18570jd + iMin;
        myVar.f18570jd = i12;
        this.f18568jd -= iMin;
        if (i12 == myVar.wqx) {
            this.jpo = myVar.jd();
            jj.jpo(myVar);
        }
        return iMin;
    }

    public jpo jpo(String str) {
        return jpo(str, 0, str.length());
    }

    public jpo jpo(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
                sbT.append(str.length());
                throw new IllegalArgumentException(sbT.toString());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    my myVarWqx = wqx(1);
                    byte[] bArr = myVarWqx.jpo;
                    int i12 = myVarWqx.wqx - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = myVarWqx.wqx;
                    int i15 = (i12 + i10) - i14;
                    myVarWqx.wqx = i14 + i15;
                    this.f18568jd += i15;
                } else {
                    if (cCharAt2 < 2048) {
                        jd((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        jd((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + C.DEFAULT_BUFFER_SEGMENT_SIZE;
                            jd((i17 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            jd(((i17 >> 12) & 63) | 128);
                            jd(((i17 >> 6) & 63) | 128);
                            jd((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            jd(63);
                            i10 = i16;
                        }
                    } else {
                        jd((cCharAt2 >> '\f') | 224);
                        jd(((cCharAt2 >> 6) & 63) | 128);
                        jd((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(i.a(i11, i10, "endIndex < beginIndex: ", " < "));
    }

    public jpo jpo(int i10) {
        if (i10 < 128) {
            jd(i10);
            return this;
        }
        if (i10 < 2048) {
            jd((i10 >> 6) | PsExtractor.AUDIO_STREAM);
            jd((i10 & 63) | 128);
            return this;
        }
        if (i10 >= 65536) {
            if (i10 <= 1114111) {
                jd((i10 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                jd(((i10 >> 12) & 63) | 128);
                jd(((i10 >> 6) & 63) | 128);
                jd((i10 & 63) | 128);
                return this;
            }
            throw new IllegalArgumentException(i.b(i10, new StringBuilder("Unexpected code point: ")));
        }
        if (i10 >= 55296 && i10 <= 57343) {
            jd(63);
            return this;
        }
        jd((i10 >> 12) | 224);
        jd(((i10 >> 6) & 63) | 128);
        jd((i10 & 63) | 128);
        return this;
    }

    public jpo jpo(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i10)));
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                StringBuilder sbT = o2.t(i11, "endIndex > string.length: ", " > ");
                sbT.append(str.length());
                throw new IllegalArgumentException(sbT.toString());
            }
            if (charset != null) {
                if (charset.equals(zz.jpo)) {
                    return jpo(str, i10, i11);
                }
                byte[] bytes = str.substring(i10, i11).getBytes(charset);
                return jd(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(i.a(i11, i10, "endIndex < beginIndex: ", " < "));
    }
}

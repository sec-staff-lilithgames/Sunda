package x8;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f91852a;

    public o(InputStream inputStream) {
        this.f91852a = inputStream;
    }

    @Override // x8.n
    public int getUInt16() throws IOException {
        return (getUInt8() << 8) | getUInt8();
    }

    @Override // x8.n
    public short getUInt8() throws IOException {
        int i10 = this.f91852a.read();
        if (i10 != -1) {
            return (short) i10;
        }
        throw new m();
    }

    @Override // x8.n
    public int read(byte[] bArr, int i10) throws IOException {
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10 && (i12 = this.f91852a.read(bArr, i11, i10 - i11)) != -1) {
            i11 += i12;
        }
        if (i11 == 0 && i12 == -1) {
            throw new m();
        }
        return i11;
    }

    @Override // x8.n
    public long skip(long j10) throws IOException {
        if (j10 < 0) {
            return 0L;
        }
        long j11 = j10;
        while (j11 > 0) {
            InputStream inputStream = this.f91852a;
            long jSkip = inputStream.skip(j11);
            if (jSkip > 0) {
                j11 -= jSkip;
            } else {
                if (inputStream.read() == -1) {
                    break;
                }
                j11--;
            }
        }
        return j10 - j11;
    }
}

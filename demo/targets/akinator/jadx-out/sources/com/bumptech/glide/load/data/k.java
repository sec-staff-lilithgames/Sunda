package com.bumptech.glide.load.data;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends FilterInputStream {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f16595e = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* renamed from: f, reason: collision with root package name */
    public static final int f16596f = 31;

    /* renamed from: b, reason: collision with root package name */
    public final byte f16597b;

    /* renamed from: c, reason: collision with root package name */
    public int f16598c;

    public k(InputStream inputStream, int i10) {
        super(inputStream);
        if (i10 < -1 || i10 > 8) {
            throw new IllegalArgumentException(a.b.e(i10, "Cannot add invalid orientation: "));
        }
        this.f16597b = (byte) i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i10;
        int i11 = this.f16598c;
        int i12 = (i11 < 2 || i11 > (i10 = f16596f)) ? super.read() : i11 == i10 ? this.f16597b : f16595e[i11 - 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i12 != -1) {
            this.f16598c++;
        }
        return i12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            this.f16598c = (int) (this.f16598c + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        int i13 = this.f16598c;
        int i14 = f16596f;
        if (i13 > i14) {
            i12 = super.read(bArr, i10, i11);
        } else if (i13 == i14) {
            bArr[i10] = this.f16597b;
            i12 = 1;
        } else if (i13 < 2) {
            i12 = super.read(bArr, i10, 2 - i13);
        } else {
            int iMin = Math.min(i14 - i13, i11);
            System.arraycopy(f16595e, this.f16598c - 2, bArr, i10, iMin);
            i12 = iMin;
        }
        if (i12 > 0) {
            this.f16598c += i12;
        }
        return i12;
    }
}

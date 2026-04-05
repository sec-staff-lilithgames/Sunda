package com.explorestack.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f21836b;

    public a(InputStream inputStream, int i10) {
        super(inputStream);
        this.f21836b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(super.available(), this.f21836b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f21836b <= 0) {
            return -1;
        }
        int i10 = super.read();
        if (i10 >= 0) {
            this.f21836b--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        long jSkip = super.skip(Math.min(j10, this.f21836b));
        if (jSkip >= 0) {
            this.f21836b = (int) (this.f21836b - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f21836b;
        if (i12 <= 0) {
            return -1;
        }
        int i13 = super.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            this.f21836b -= i13;
        }
        return i13;
    }
}

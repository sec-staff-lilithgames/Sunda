package com.fyber.inneractive.sdk.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a extends FilterInputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f26336a;

    public a(InputStream inputStream, int i10) {
        super(inputStream);
        this.f26336a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f26336a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f26336a <= 0) {
            return -1;
        }
        int i10 = super.read();
        if (i10 >= 0) {
            this.f26336a--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = super.skip(Math.min(j10, this.f26336a));
        if (jSkip >= 0) {
            this.f26336a = (int) (this.f26336a - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f26336a;
        if (i12 <= 0) {
            return -1;
        }
        int i13 = super.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            this.f26336a -= i13;
        }
        return i13;
    }
}

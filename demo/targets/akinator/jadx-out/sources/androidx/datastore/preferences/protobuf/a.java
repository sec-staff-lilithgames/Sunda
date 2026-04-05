package androidx.datastore.preferences.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public int f5787b;

    public a(InputStream inputStream, int i10) {
        super(inputStream);
        this.f5787b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(super.available(), this.f5787b);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.f5787b <= 0) {
            return -1;
        }
        int i10 = super.read();
        if (i10 >= 0) {
            this.f5787b--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        int iSkip = (int) super.skip(Math.min(j10, this.f5787b));
        if (iSkip >= 0) {
            this.f5787b -= iSkip;
        }
        return iSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f5787b;
        if (i12 <= 0) {
            return -1;
        }
        int i13 = super.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            this.f5787b -= i13;
        }
        return i13;
    }
}

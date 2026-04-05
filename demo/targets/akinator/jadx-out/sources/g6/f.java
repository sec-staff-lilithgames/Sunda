package g6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends FilterInputStream {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f57341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, InputStream inputStream) {
        super(inputStream);
        this.f57341b = hVar;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        h hVar = this.f57341b;
        int i10 = hVar.f57355l;
        if (i10 != -1 && hVar.f57353j >= i10) {
            throw new IOException();
        }
        int i11 = super.read();
        hVar.f57353j++;
        return i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        h hVar = this.f57341b;
        int i10 = hVar.f57355l;
        if (i10 != -1 && hVar.f57353j >= i10) {
            throw new IOException();
        }
        long jSkip = super.skip(j10);
        if (jSkip > 0) {
            hVar.f57353j += (int) jSkip;
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        h hVar = this.f57341b;
        int i12 = hVar.f57355l;
        if (i12 != -1 && hVar.f57353j >= i12) {
            throw new IOException();
        }
        int i13 = super.read(bArr, i10, i11);
        if (i13 > 0) {
            hVar.f57353j += i13;
        }
        return i13;
    }
}

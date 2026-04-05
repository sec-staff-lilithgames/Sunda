package zb;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import ub.k;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final InputStream f97742a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f97743b;

    /* renamed from: c, reason: collision with root package name */
    public final int f97744c;

    /* renamed from: d, reason: collision with root package name */
    public int f97745d;

    /* renamed from: e, reason: collision with root package name */
    public int f97746e;

    public b(InputStream inputStream, byte[] bArr) {
        this.f97742a = inputStream;
        this.f97743b = bArr;
        this.f97744c = 0;
        this.f97746e = 0;
        this.f97745d = 0;
    }

    public a createMatcher(k kVar, d dVar) {
        int i10 = this.f97745d;
        int i11 = this.f97744c;
        return new a(this.f97742a, this.f97743b, i11, i10 - i11, kVar, dVar);
    }

    @Override // zb.c
    public boolean hasMoreBytes() throws IOException {
        int i10;
        int i11 = this.f97746e;
        if (i11 < this.f97745d) {
            return true;
        }
        InputStream inputStream = this.f97742a;
        if (inputStream == null) {
            return false;
        }
        byte[] bArr = this.f97743b;
        int length = bArr.length - i11;
        if (length < 1 || (i10 = inputStream.read(bArr, i11, length)) <= 0) {
            return false;
        }
        this.f97745d += i10;
        return true;
    }

    @Override // zb.c
    public byte nextByte() throws IOException {
        int i10 = this.f97746e;
        int i11 = this.f97745d;
        byte[] bArr = this.f97743b;
        if (i10 < i11 || hasMoreBytes()) {
            int i12 = this.f97746e;
            this.f97746e = i12 + 1;
            return bArr[i12];
        }
        StringBuilder sb2 = new StringBuilder("Failed auto-detect: could not read more than ");
        sb2.append(this.f97746e);
        sb2.append(" bytes (max buffer size: ");
        throw new EOFException(a.b.f(bArr.length, ")", sb2));
    }

    @Override // zb.c
    public void reset() {
        this.f97746e = this.f97744c;
    }

    public b(byte[] bArr) {
        this(bArr, 0, bArr.length);
    }

    public b(byte[] bArr, int i10, int i11) {
        this.f97742a = null;
        this.f97743b = bArr;
        this.f97746e = i10;
        this.f97744c = i10;
        this.f97745d = i10 + i11;
    }
}

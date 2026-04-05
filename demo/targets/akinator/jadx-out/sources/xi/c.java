package xi;

import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public long f92002b;

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f92002b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f92002b += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f92002b += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}

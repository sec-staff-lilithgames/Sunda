package cc;

import java.io.DataOutput;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class g extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final DataOutput f12071b;

    public g(DataOutput dataOutput) {
        this.f12071b = dataOutput;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f12071b.write(i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.f12071b.write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f12071b.write(bArr, i10, i11);
    }
}

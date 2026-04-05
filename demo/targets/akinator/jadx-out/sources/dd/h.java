package dd;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f52012b;

    public h(ByteBuffer byteBuffer) {
        this.f52012b = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        this.f52012b.put((byte) i10);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        this.f52012b.put(bArr, i10, i11);
    }
}

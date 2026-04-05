package ph;

import java.io.OutputStream;
import mh.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a0 extends OutputStream {
    public String toString() {
        return "ByteStreams.nullOutputStream()";
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        p1.checkNotNull(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        p1.checkNotNull(bArr);
        p1.checkPositionIndexes(i10, i11 + i10, bArr.length);
    }
}

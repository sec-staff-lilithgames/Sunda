package androidx.datastore.preferences.protobuf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s extends r {

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f5986g;

    public s(byte[] bArr) {
        bArr.getClass();
        this.f5986g = bArr;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(this.f5986g, p(), size()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public byte byteAt(int i10) {
        return this.f5986g[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f5986g, p(), size());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public void d(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.f5986g, i10, bArr, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x) && size() == ((x) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof s)) {
                return obj.equals(this);
            }
            s sVar = (s) obj;
            int i10 = this.f6102b;
            int i11 = sVar.f6102b;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                return o(sVar, 0, size());
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final int h(int i10, int i11, int i12) {
        return t1.b(i10, this.f5986g, p() + i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final int i(int i10, int i11, int i12) {
        int iP = p() + i11;
        return m4.f5958a.I(i10, this.f5986g, iP, i12 + iP);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public byte internalByteAt(int i10) {
        return this.f5986g[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final boolean isValidUtf8() {
        int iP = p();
        return m4.f5958a.E(this.f5986g, iP, size() + iP);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final String j(Charset charset) {
        return new String(this.f5986g, p(), size(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final void n(l0 l0Var) throws IOException {
        l0Var.writeLazy(this.f5986g, p(), size());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final c0 newCodedInput() {
        return c0.a(this.f5986g, p(), size(), true);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final InputStream newInput() {
        return new ByteArrayInputStream(this.f5986g, p(), size());
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean o(r rVar, int i10, int i11) {
        if (i11 > rVar.size()) {
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }
        int i12 = i10 + i11;
        if (i12 > rVar.size()) {
            StringBuilder sbF = w0.i.f(i10, i11, "Ran off end of other: ", ", ", ", ");
            sbF.append(rVar.size());
            throw new IllegalArgumentException(sbF.toString());
        }
        if (!(rVar instanceof s)) {
            return rVar.substring(i10, i12).equals(substring(0, i11));
        }
        s sVar = (s) rVar;
        byte[] bArr = sVar.f5986g;
        int iP = p() + i11;
        int iP2 = p();
        int iP3 = sVar.p() + i10;
        while (iP2 < iP) {
            if (this.f5986g[iP2] != bArr[iP3]) {
                return false;
            }
            iP2++;
            iP3++;
        }
        return true;
    }

    public int p() {
        return 0;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public int size() {
        return this.f5986g.length;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final x substring(int i10, int i11) {
        int iC = x.c(i10, i11, size());
        if (iC == 0) {
            return x.f6099c;
        }
        return new n(this.f5986g, p() + i10, iC);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }
}

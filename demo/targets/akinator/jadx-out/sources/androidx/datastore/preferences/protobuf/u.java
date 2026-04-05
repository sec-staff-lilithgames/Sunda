package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u extends r {

    /* renamed from: g, reason: collision with root package name */
    public final ByteBuffer f6015g;

    public u(ByteBuffer byteBuffer) {
        t1.a(byteBuffer, "buffer");
        this.f6015g = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f6015g.asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public byte byteAt(int i10) {
        try {
            return this.f6015g.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f6015g.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final void d(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f6015g.slice();
        byteBufferSlice.position(i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (size() != xVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        boolean z10 = obj instanceof u;
        ByteBuffer byteBuffer = this.f6015g;
        return z10 ? byteBuffer.equals(((u) obj).f6015g) : obj instanceof l3 ? obj.equals(this) : byteBuffer.equals(xVar.asReadOnlyByteBuffer());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final int h(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f6015g.get(i13);
        }
        return i10;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final int i(int i10, int i11, int i12) {
        return m4.f5958a.H(i10, this.f6015g, i11, i12 + i11);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public byte internalByteAt(int i10) {
        return byteAt(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public boolean isValidUtf8() {
        kc.p pVar = m4.f5958a;
        ByteBuffer byteBuffer = this.f6015g;
        return pVar.H(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final String j(Charset charset) {
        byte[] byteArray;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f6015g;
        if (byteBuffer.hasArray()) {
            byteArray = byteBuffer.array();
            iPosition = byteBuffer.position() + byteBuffer.arrayOffset();
            length = byteBuffer.remaining();
        } else {
            byteArray = toByteArray();
            length = byteArray.length;
            iPosition = 0;
        }
        return new String(byteArray, iPosition, length, charset);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final void n(l0 l0Var) throws IOException {
        l0Var.writeLazy(this.f6015g.slice());
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public c0 newCodedInput() {
        return c0.c(this.f6015g, true);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public InputStream newInput() {
        return new t(this);
    }

    @Override // androidx.datastore.preferences.protobuf.r
    public final boolean o(r rVar, int i10, int i11) {
        return substring(0, i11).equals(rVar.substring(i10, i11 + i10));
    }

    public final ByteBuffer p(int i10, int i11) {
        ByteBuffer byteBuffer = this.f6015g;
        if (i10 < byteBuffer.position() || i11 > byteBuffer.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i10 - byteBuffer.position());
        byteBufferSlice.limit(i11 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public int size() {
        return this.f6015g.remaining();
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public x substring(int i10, int i11) {
        try {
            return new u(p(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }
}

package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class z9 extends ByteString.LeafByteString {

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f22977b;

    public z9(ByteBuffer byteBuffer) {
        Charset charset = x7.f22881a;
        this.f22977b = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    public final ByteBuffer a(int i10, int i11) {
        ByteBuffer byteBuffer = this.f22977b;
        if (i10 < byteBuffer.position() || i11 > byteBuffer.limit() || i10 > i11) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        ByteBuffer byteBufferSlice = byteBuffer.slice();
        byteBufferSlice.position(i10 - byteBuffer.position());
        byteBufferSlice.limit(i11 - byteBuffer.position());
        return byteBufferSlice;
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return this.f22977b.asReadOnlyBuffer();
    }

    @Override // com.explorestack.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        return Collections.singletonList(asReadOnlyByteBuffer());
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte byteAt(int i10) {
        try {
            return this.f22977b.get(i10);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        byteBuffer.put(this.f22977b.slice());
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        ByteBuffer byteBufferSlice = this.f22977b.slice();
        byteBufferSlice.position(i10);
        byteBufferSlice.get(bArr, i11, i12);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteString)) {
            return false;
        }
        ByteString byteString = (ByteString) obj;
        if (size() != byteString.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        boolean z10 = obj instanceof z9;
        ByteBuffer byteBuffer = this.f22977b;
        return z10 ? byteBuffer.equals(((z9) obj).f22977b) : obj instanceof ta ? obj.equals(this) : byteBuffer.equals(byteString.asReadOnlyByteBuffer());
    }

    @Override // com.explorestack.protobuf.ByteString.LeafByteString
    public final boolean equalsRange(ByteString byteString, int i10, int i11) {
        return substring(0, i11).equals(byteString.substring(i10, i11 + i10));
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte internalByteAt(int i10) {
        return byteAt(i10);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean isValidUtf8() {
        tc tcVar = vc.f22784a;
        ByteBuffer byteBuffer = this.f22977b;
        return tcVar.j(0, byteBuffer, byteBuffer.position(), byteBuffer.remaining()) == 0;
    }

    @Override // com.explorestack.protobuf.ByteString
    public y newCodedInput() {
        return y.c(this.f22977b, true);
    }

    @Override // com.explorestack.protobuf.ByteString
    public InputStream newInput() {
        return new y9(this);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + this.f22977b.get(i13);
        }
        return i10;
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        return vc.f22784a.j(i10, this.f22977b, i11, i12 + i11);
    }

    @Override // com.explorestack.protobuf.ByteString
    public int size() {
        return this.f22977b.remaining();
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        try {
            return new z9(a(i10, i11));
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw e10;
        } catch (IndexOutOfBoundsException e11) {
            throw new ArrayIndexOutOfBoundsException(e11.getMessage());
        }
    }

    @Override // com.explorestack.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        byte[] byteArray;
        int length;
        int iPosition;
        ByteBuffer byteBuffer = this.f22977b;
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

    @Override // com.explorestack.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(toByteArray());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:7:0x0025, B:9:0x002b, B:12:0x0044, B:14:0x004d, B:16:0x0055, B:20:0x0061, B:21:0x0065, B:26:0x0083, B:28:0x0086, B:33:0x009d, B:35:0x00a3, B:30:0x008f, B:32:0x0095, B:24:0x007a), top: B:41:0x0025 }] */
    @Override // com.explorestack.protobuf.ByteString
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void writeToInternal(java.io.OutputStream r7, int r8, int r9) throws java.io.IOException {
        /*
            r6 = this;
            java.nio.ByteBuffer r0 = r6.f22977b
            boolean r1 = r0.hasArray()
            if (r1 == 0) goto L1a
            int r1 = r0.arrayOffset()
            int r2 = r0.position()
            int r2 = r2 + r1
            int r2 = r2 + r8
            byte[] r8 = r0.array()
            r7.write(r8, r2, r9)
            return
        L1a:
            int r9 = r9 + r8
            java.nio.ByteBuffer r8 = r6.a(r8, r9)
            java.lang.ThreadLocal r9 = com.explorestack.protobuf.r.f22528a
            int r9 = r8.position()
            boolean r0 = r8.hasArray()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L44
            byte[] r0 = r8.array()     // Catch: java.lang.Throwable -> L41
            int r1 = r8.arrayOffset()     // Catch: java.lang.Throwable -> L41
            int r2 = r8.position()     // Catch: java.lang.Throwable -> L41
            int r1 = r1 + r2
            int r2 = r8.remaining()     // Catch: java.lang.Throwable -> L41
            r7.write(r0, r1, r2)     // Catch: java.lang.Throwable -> L41
            goto Lb4
        L41:
            r7 = move-exception
            goto Lb8
        L44:
            long r0 = com.explorestack.protobuf.r.f22530c     // Catch: java.lang.Throwable -> L41
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 < 0) goto L65
            java.lang.Class r2 = com.explorestack.protobuf.r.f22529b     // Catch: java.lang.Throwable -> L41
            boolean r2 = r2.isInstance(r7)     // Catch: java.lang.Throwable -> L41
            if (r2 == 0) goto L65
            com.explorestack.protobuf.rc r2 = com.explorestack.protobuf.sc.f22643c     // Catch: java.lang.Throwable -> L41 java.lang.ClassCastException -> L5e
            java.lang.Object r0 = r2.getObject(r7, r0)     // Catch: java.lang.Throwable -> L41 java.lang.ClassCastException -> L5e
            java.nio.channels.WritableByteChannel r0 = (java.nio.channels.WritableByteChannel) r0     // Catch: java.lang.Throwable -> L41 java.lang.ClassCastException -> L5e
            goto L5f
        L5e:
            r0 = r3
        L5f:
            if (r0 == 0) goto L65
            r0.write(r8)     // Catch: java.lang.Throwable -> L41
            goto Lb4
        L65:
            int r0 = r8.remaining()     // Catch: java.lang.Throwable -> L41
            r1 = 1024(0x400, float:1.435E-42)
            int r0 = java.lang.Math.max(r0, r1)     // Catch: java.lang.Throwable -> L41
            java.lang.ThreadLocal r1 = com.explorestack.protobuf.r.f22528a     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L41
            java.lang.ref.SoftReference r2 = (java.lang.ref.SoftReference) r2     // Catch: java.lang.Throwable -> L41
            if (r2 != 0) goto L7a
            goto L81
        L7a:
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L41
            r3 = r2
            byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L41
        L81:
            if (r3 == 0) goto L8f
            int r2 = r3.length     // Catch: java.lang.Throwable -> L41
            if (r2 >= r0) goto L9d
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L41
            float r4 = (float) r0     // Catch: java.lang.Throwable -> L41
            r5 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 * r5
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L9d
        L8f:
            byte[] r3 = new byte[r0]     // Catch: java.lang.Throwable -> L41
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 > r2) goto L9d
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L41
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L41
            r1.set(r0)     // Catch: java.lang.Throwable -> L41
        L9d:
            boolean r0 = r8.hasRemaining()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto Lb4
            int r0 = r8.remaining()     // Catch: java.lang.Throwable -> L41
            int r1 = r3.length     // Catch: java.lang.Throwable -> L41
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.Throwable -> L41
            r1 = 0
            r8.get(r3, r1, r0)     // Catch: java.lang.Throwable -> L41
            r7.write(r3, r1, r0)     // Catch: java.lang.Throwable -> L41
            goto L9d
        Lb4:
            r8.position(r9)
            return
        Lb8:
            r8.position(r9)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.protobuf.z9.writeToInternal(java.io.OutputStream, int, int):void");
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void writeTo(s sVar) throws IOException {
        sVar.writeLazy(this.f22977b.slice());
    }
}

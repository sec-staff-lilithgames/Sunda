package com.explorestack.protobuf;

import com.explorestack.protobuf.ByteString;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ta extends ByteString {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f22665h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: b, reason: collision with root package name */
    public final int f22666b;

    /* renamed from: c, reason: collision with root package name */
    public final ByteString f22667c;

    /* renamed from: e, reason: collision with root package name */
    public final ByteString f22668e;

    /* renamed from: f, reason: collision with root package name */
    public final int f22669f;

    /* renamed from: g, reason: collision with root package name */
    public final int f22670g;

    public ta(ByteString byteString, ByteString byteString2) {
        this.f22667c = byteString;
        this.f22668e = byteString2;
        int size = byteString.size();
        this.f22669f = size;
        this.f22666b = byteString2.size() + size;
        this.f22670g = Math.max(byteString.getTreeDepth(), byteString2.getTreeDepth()) + 1;
    }

    public static int c(int i10) {
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f22665h[i10];
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.explorestack.protobuf.ByteString
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        ra raVar = new ra(this);
        while (raVar.hasNext()) {
            arrayList.add(raVar.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.explorestack.protobuf.ByteString
    public byte byteAt(int i10) {
        ByteString.checkIndex(i10, this.f22666b);
        return internalByteAt(i10);
    }

    @Override // com.explorestack.protobuf.ByteString
    public void copyTo(ByteBuffer byteBuffer) {
        this.f22667c.copyTo(byteBuffer);
        this.f22668e.copyTo(byteBuffer);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void copyToInternal(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        ByteString byteString = this.f22667c;
        int i14 = this.f22669f;
        if (i13 <= i14) {
            byteString.copyToInternal(bArr, i10, i11, i12);
            return;
        }
        ByteString byteString2 = this.f22668e;
        if (i10 >= i14) {
            byteString2.copyToInternal(bArr, i10 - i14, i11, i12);
            return;
        }
        int i15 = i14 - i10;
        byteString.copyToInternal(bArr, i10, i11, i15);
        byteString2.copyToInternal(bArr, 0, i11 + i15, i12 - i15);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            int size = byteString.size();
            int i10 = this.f22666b;
            if (i10 == size) {
                if (i10 == 0) {
                    return true;
                }
                int iPeekCachedHashCode = peekCachedHashCode();
                int iPeekCachedHashCode2 = byteString.peekCachedHashCode();
                if (iPeekCachedHashCode == 0 || iPeekCachedHashCode2 == 0 || iPeekCachedHashCode == iPeekCachedHashCode2) {
                    ra raVar = new ra(this);
                    ByteString.LeafByteString leafByteString = (ByteString.LeafByteString) raVar.next();
                    ra raVar2 = new ra(byteString);
                    ByteString.LeafByteString leafByteString2 = (ByteString.LeafByteString) raVar2.next();
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    while (true) {
                        int size2 = leafByteString.size() - i11;
                        int size3 = leafByteString2.size() - i12;
                        int iMin = Math.min(size2, size3);
                        if (!(i11 == 0 ? leafByteString.equalsRange(leafByteString2, i12, iMin) : leafByteString2.equalsRange(leafByteString, i11, iMin))) {
                            break;
                        }
                        i13 += iMin;
                        if (i13 >= i10) {
                            if (i13 == i10) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            i11 = 0;
                            leafByteString = (ByteString.LeafByteString) raVar.next();
                        } else {
                            i11 += iMin;
                            leafByteString = leafByteString;
                        }
                        if (iMin == size3) {
                            leafByteString2 = (ByteString.LeafByteString) raVar2.next();
                            i12 = 0;
                        } else {
                            i12 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int getTreeDepth() {
        return this.f22670g;
    }

    @Override // com.explorestack.protobuf.ByteString
    public final byte internalByteAt(int i10) {
        int i11 = this.f22669f;
        return i10 < i11 ? this.f22667c.internalByteAt(i10) : this.f22668e.internalByteAt(i10 - i11);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final boolean isBalanced() {
        return this.f22666b >= c(this.f22670g);
    }

    @Override // com.explorestack.protobuf.ByteString
    public boolean isValidUtf8() {
        int iPartialIsValidUtf8 = this.f22667c.partialIsValidUtf8(0, 0, this.f22669f);
        ByteString byteString = this.f22668e;
        return byteString.partialIsValidUtf8(iPartialIsValidUtf8, 0, byteString.size()) == 0;
    }

    @Override // com.explorestack.protobuf.ByteString
    public y newCodedInput() {
        return y.b(asReadOnlyByteBufferList(), true);
    }

    @Override // com.explorestack.protobuf.ByteString
    public InputStream newInput() {
        return new sa(this);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int partialHash(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f22667c;
        int i14 = this.f22669f;
        if (i13 <= i14) {
            return byteString.partialHash(i10, i11, i12);
        }
        ByteString byteString2 = this.f22668e;
        if (i11 >= i14) {
            return byteString2.partialHash(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.partialHash(byteString.partialHash(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final int partialIsValidUtf8(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        ByteString byteString = this.f22667c;
        int i14 = this.f22669f;
        if (i13 <= i14) {
            return byteString.partialIsValidUtf8(i10, i11, i12);
        }
        ByteString byteString2 = this.f22668e;
        if (i11 >= i14) {
            return byteString2.partialIsValidUtf8(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return byteString2.partialIsValidUtf8(byteString.partialIsValidUtf8(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.explorestack.protobuf.ByteString
    public int size() {
        return this.f22666b;
    }

    @Override // com.explorestack.protobuf.ByteString
    public ByteString substring(int i10, int i11) {
        int i12 = this.f22666b;
        int iCheckRange = ByteString.checkRange(i10, i11, i12);
        if (iCheckRange == 0) {
            return ByteString.EMPTY;
        }
        if (iCheckRange == i12) {
            return this;
        }
        ByteString byteString = this.f22667c;
        int i13 = this.f22669f;
        if (i11 <= i13) {
            return byteString.substring(i10, i11);
        }
        ByteString byteString2 = this.f22668e;
        return i10 >= i13 ? byteString2.substring(i10 - i13, i11 - i13) : new ta(byteString.substring(i10), byteString2.substring(0, i11 - i13));
    }

    @Override // com.explorestack.protobuf.ByteString
    public final String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // com.explorestack.protobuf.ByteString
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f22667c.writeTo(outputStream);
        this.f22668e.writeTo(outputStream);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void writeToInternal(OutputStream outputStream, int i10, int i11) throws IOException {
        int i12 = i10 + i11;
        ByteString byteString = this.f22667c;
        int i13 = this.f22669f;
        if (i12 <= i13) {
            byteString.writeToInternal(outputStream, i10, i11);
            return;
        }
        ByteString byteString2 = this.f22668e;
        if (i10 >= i13) {
            byteString2.writeToInternal(outputStream, i10 - i13, i11);
            return;
        }
        int i14 = i13 - i10;
        byteString.writeToInternal(outputStream, i10, i14);
        byteString2.writeToInternal(outputStream, 0, i11 - i14);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void writeToReverse(s sVar) throws IOException {
        this.f22668e.writeToReverse(sVar);
        this.f22667c.writeToReverse(sVar);
    }

    @Override // com.explorestack.protobuf.ByteString, java.lang.Iterable
    /* renamed from: iterator */
    public Iterator<Byte> iterator2() {
        return new qa(this);
    }

    @Override // com.explorestack.protobuf.ByteString
    public final void writeTo(s sVar) throws IOException {
        this.f22667c.writeTo(sVar);
        this.f22668e.writeTo(sVar);
    }
}

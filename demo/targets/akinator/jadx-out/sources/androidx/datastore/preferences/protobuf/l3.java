package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l3 extends x {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f5951l = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* renamed from: g, reason: collision with root package name */
    public final int f5952g;

    /* renamed from: h, reason: collision with root package name */
    public final x f5953h;

    /* renamed from: i, reason: collision with root package name */
    public final x f5954i;

    /* renamed from: j, reason: collision with root package name */
    public final int f5955j;

    /* renamed from: k, reason: collision with root package name */
    public final int f5956k;

    public l3(x xVar, x xVar2) {
        this.f5953h = xVar;
        this.f5954i = xVar2;
        int size = xVar.size();
        this.f5955j = size;
        this.f5952g = xVar2.size() + size;
        this.f5956k = Math.max(xVar.f(), xVar2.f()) + 1;
    }

    public static int o(int i10) {
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return f5951l[i10];
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        j3 j3Var = new j3(this);
        while (j3Var.hasNext()) {
            arrayList.add(j3Var.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public byte byteAt(int i10) {
        x.b(i10, this.f5952g);
        return internalByteAt(i10);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public void copyTo(ByteBuffer byteBuffer) {
        this.f5953h.copyTo(byteBuffer);
        this.f5954i.copyTo(byteBuffer);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final void d(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        x xVar = this.f5953h;
        int i14 = this.f5955j;
        if (i13 <= i14) {
            xVar.d(bArr, i10, i11, i12);
            return;
        }
        x xVar2 = this.f5954i;
        if (i10 >= i14) {
            xVar2.d(bArr, i10 - i14, i11, i12);
            return;
        }
        int i15 = i14 - i10;
        xVar.d(bArr, i10, i11, i15);
        xVar2.d(bArr, 0, i11 + i15, i12 - i15);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            int size = xVar.size();
            int i10 = this.f5952g;
            if (i10 == size) {
                if (i10 == 0) {
                    return true;
                }
                int i11 = this.f6102b;
                int i12 = xVar.f6102b;
                if (i11 == 0 || i12 == 0 || i11 == i12) {
                    j3 j3Var = new j3(this);
                    r rVar = (r) j3Var.next();
                    j3 j3Var2 = new j3(xVar);
                    r rVar2 = (r) j3Var2.next();
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    while (true) {
                        int size2 = rVar.size() - i13;
                        int size3 = rVar2.size() - i14;
                        int iMin = Math.min(size2, size3);
                        if (!(i13 == 0 ? rVar.o(rVar2, i14, iMin) : rVar2.o(rVar, i13, iMin))) {
                            break;
                        }
                        i15 += iMin;
                        if (i15 >= i10) {
                            if (i15 == i10) {
                                return true;
                            }
                            throw new IllegalStateException();
                        }
                        if (iMin == size2) {
                            rVar = (r) j3Var.next();
                            i13 = 0;
                        } else {
                            i13 += iMin;
                        }
                        if (iMin == size3) {
                            rVar2 = (r) j3Var2.next();
                            i14 = 0;
                        } else {
                            i14 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final int f() {
        return this.f5956k;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final boolean g() {
        return this.f5952g >= o(this.f5956k);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final int h(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        x xVar = this.f5953h;
        int i14 = this.f5955j;
        if (i13 <= i14) {
            return xVar.h(i10, i11, i12);
        }
        x xVar2 = this.f5954i;
        if (i11 >= i14) {
            return xVar2.h(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return xVar2.h(xVar.h(i10, i11, i15), 0, i12 - i15);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final int i(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        x xVar = this.f5953h;
        int i14 = this.f5955j;
        if (i13 <= i14) {
            return xVar.i(i10, i11, i12);
        }
        x xVar2 = this.f5954i;
        if (i11 >= i14) {
            return xVar2.i(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return xVar2.i(xVar.i(i10, i11, i15), 0, i12 - i15);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final byte internalByteAt(int i10) {
        int i11 = this.f5955j;
        return i10 < i11 ? this.f5953h.internalByteAt(i10) : this.f5954i.internalByteAt(i10 - i11);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public boolean isValidUtf8() {
        int i10 = this.f5953h.i(0, 0, this.f5955j);
        x xVar = this.f5954i;
        return xVar.i(i10, 0, xVar.size()) == 0;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final String j(Charset charset) {
        return new String(toByteArray(), charset);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public final void n(l0 l0Var) {
        this.f5953h.n(l0Var);
        this.f5954i.n(l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public c0 newCodedInput() {
        return c0.b(asReadOnlyByteBufferList(), true);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public InputStream newInput() {
        return new k3(this);
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public int size() {
        return this.f5952g;
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public x substring(int i10, int i11) {
        int i12 = this.f5952g;
        int iC = x.c(i10, i11, i12);
        if (iC == 0) {
            return x.f6099c;
        }
        if (iC == i12) {
            return this;
        }
        x xVar = this.f5953h;
        int i13 = this.f5955j;
        if (i11 <= i13) {
            return xVar.substring(i10, i11);
        }
        x xVar2 = this.f5954i;
        return i10 >= i13 ? xVar2.substring(i10 - i13, i11 - i13) : new l3(xVar.substring(i10), xVar2.substring(0, i11 - i13));
    }

    @Override // androidx.datastore.preferences.protobuf.x
    public void writeTo(OutputStream outputStream) throws IOException {
        this.f5953h.writeTo(outputStream);
        this.f5954i.writeTo(outputStream);
    }

    @Override // androidx.datastore.preferences.protobuf.x, java.lang.Iterable
    public p iterator() {
        return new h3(this);
    }
}

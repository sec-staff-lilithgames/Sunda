package ic;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d extends OutputStream implements a {

    /* renamed from: h, reason: collision with root package name */
    public static final byte[] f59455h = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public final b f59456b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedList f59457c;

    /* renamed from: e, reason: collision with root package name */
    public int f59458e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f59459f;

    /* renamed from: g, reason: collision with root package name */
    public int f59460g;

    public d() {
        this((b) null);
    }

    public static d fromInitial(byte[] bArr, int i10) {
        return new d(bArr, i10);
    }

    public void append(int i10) {
        if (this.f59460g >= this.f59459f.length) {
            d();
        }
        byte[] bArr = this.f59459f;
        int i11 = this.f59460g;
        this.f59460g = i11 + 1;
        bArr[i11] = (byte) i10;
    }

    public void appendFourBytes(int i10) {
        int i11 = this.f59460g;
        int i12 = i11 + 3;
        byte[] bArr = this.f59459f;
        if (i12 >= bArr.length) {
            append(i10 >> 24);
            append(i10 >> 16);
            append(i10 >> 8);
            append(i10);
            return;
        }
        int i13 = i11 + 1;
        this.f59460g = i13;
        bArr[i11] = (byte) (i10 >> 24);
        int i14 = i11 + 2;
        this.f59460g = i14;
        bArr[i13] = (byte) (i10 >> 16);
        int i15 = i11 + 3;
        this.f59460g = i15;
        bArr[i14] = (byte) (i10 >> 8);
        this.f59460g = i11 + 4;
        bArr[i15] = (byte) i10;
    }

    public void appendThreeBytes(int i10) {
        int i11 = this.f59460g;
        int i12 = i11 + 2;
        byte[] bArr = this.f59459f;
        if (i12 >= bArr.length) {
            append(i10 >> 16);
            append(i10 >> 8);
            append(i10);
            return;
        }
        int i13 = i11 + 1;
        this.f59460g = i13;
        bArr[i11] = (byte) (i10 >> 16);
        int i14 = i11 + 2;
        this.f59460g = i14;
        bArr[i13] = (byte) (i10 >> 8);
        this.f59460g = i11 + 3;
        bArr[i14] = (byte) i10;
    }

    public void appendTwoBytes(int i10) {
        int i11 = this.f59460g;
        int i12 = i11 + 1;
        byte[] bArr = this.f59459f;
        if (i12 >= bArr.length) {
            append(i10 >> 8);
            append(i10);
            return;
        }
        int i13 = i11 + 1;
        this.f59460g = i13;
        bArr[i11] = (byte) (i10 >> 8);
        this.f59460g = i11 + 2;
        bArr[i13] = (byte) i10;
    }

    @Override // ic.a
    public b bufferRecycler() {
        return this.f59456b;
    }

    public byte[] completeAndCoalesce(int i10) {
        this.f59460g = i10;
        return toByteArray();
    }

    public final void d() {
        int length = this.f59458e + this.f59459f.length;
        if (length < 0) {
            throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
        }
        this.f59458e = length;
        int iMax = Math.max(length >> 1, 1000);
        if (iMax > 131072) {
            iMax = 131072;
        }
        this.f59457c.add(this.f59459f);
        this.f59459f = new byte[iMax];
        this.f59460g = 0;
    }

    public byte[] finishCurrentSegment() {
        d();
        return this.f59459f;
    }

    public byte[] getClearAndRelease() {
        byte[] byteArray = toByteArray();
        release();
        return byteArray;
    }

    public byte[] getCurrentSegment() {
        return this.f59459f;
    }

    public int getCurrentSegmentLength() {
        return this.f59460g;
    }

    public void release() {
        byte[] bArr;
        reset();
        b bVar = this.f59456b;
        if (bVar == null || (bArr = this.f59459f) == null) {
            return;
        }
        bVar.releaseByteBuffer(2, bArr);
        this.f59459f = null;
    }

    public void reset() {
        this.f59458e = 0;
        this.f59460g = 0;
        LinkedList linkedList = this.f59457c;
        if (linkedList.isEmpty()) {
            return;
        }
        linkedList.clear();
    }

    public byte[] resetAndGetFirstSegment() {
        reset();
        return this.f59459f;
    }

    public void setCurrentSegmentLength(int i10) {
        this.f59460g = i10;
    }

    public int size() {
        return this.f59458e + this.f59460g;
    }

    public byte[] toByteArray() {
        int i10 = this.f59458e + this.f59460g;
        if (i10 == 0) {
            return f59455h;
        }
        byte[] bArr = new byte[i10];
        LinkedList linkedList = this.f59457c;
        Iterator it = linkedList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            byte[] bArr2 = (byte[]) it.next();
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        System.arraycopy(this.f59459f, 0, bArr, i11, this.f59460g);
        int i12 = i11 + this.f59460g;
        if (i12 != i10) {
            throw new RuntimeException(o2.i(i10, i12, "Internal error: total len assumed to be ", ", copied ", " bytes"));
        }
        if (!linkedList.isEmpty()) {
            reset();
        }
        return bArr;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public d(b bVar) {
        this(bVar, 500);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int iMin = Math.min(this.f59459f.length - this.f59460g, i11);
            if (iMin > 0) {
                System.arraycopy(bArr, i10, this.f59459f, this.f59460g, iMin);
                i10 += iMin;
                this.f59460g += iMin;
                i11 -= iMin;
            }
            if (i11 <= 0) {
                return;
            } else {
                d();
            }
        }
    }

    public d(int i10) {
        this((b) null, i10);
    }

    public d(b bVar, int i10) {
        this.f59457c = new LinkedList();
        this.f59456b = bVar;
        this.f59459f = bVar == null ? new byte[i10 > 131072 ? 131072 : i10] : bVar.allocByteBuffer(2);
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        append(i10);
    }

    public d(byte[] bArr, int i10) {
        this.f59457c = new LinkedList();
        this.f59456b = null;
        this.f59459f = bArr;
        this.f59460g = i10;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
    }
}

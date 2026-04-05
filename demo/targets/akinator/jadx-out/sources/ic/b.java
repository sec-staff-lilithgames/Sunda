package ic;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class b implements e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f59448d = {8000, 8000, 2000, 2000};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f59449e = {4000, 4000, 200, 200};

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f59450a = new AtomicReferenceArray(4);

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReferenceArray f59451b = new AtomicReferenceArray(4);

    /* renamed from: c, reason: collision with root package name */
    public f0 f59452c;

    public final byte[] allocByteBuffer(int i10) {
        return allocByteBuffer(i10, 0);
    }

    public final char[] allocCharBuffer(int i10) {
        return allocCharBuffer(i10, 0);
    }

    public boolean isLinkedWithPool() {
        return this.f59452c != null;
    }

    public void releaseByteBuffer(int i10, byte[] bArr) {
        AtomicReferenceArray atomicReferenceArray = this.f59450a;
        byte[] bArr2 = (byte[]) atomicReferenceArray.get(i10);
        if (bArr2 == null || bArr.length > bArr2.length) {
            atomicReferenceArray.set(i10, bArr);
        }
    }

    public void releaseCharBuffer(int i10, char[] cArr) {
        AtomicReferenceArray atomicReferenceArray = this.f59451b;
        char[] cArr2 = (char[]) atomicReferenceArray.get(i10);
        if (cArr2 == null || cArr.length > cArr2.length) {
            atomicReferenceArray.set(i10, cArr);
        }
    }

    @Override // ic.e0
    public void releaseToPool() {
        f0 f0Var = this.f59452c;
        if (f0Var != null) {
            this.f59452c = null;
            f0Var.releasePooled(this);
        }
    }

    public byte[] allocByteBuffer(int i10, int i11) {
        int i12 = f59448d[i10];
        if (i11 < i12) {
            i11 = i12;
        }
        byte[] bArr = (byte[]) this.f59450a.getAndSet(i10, null);
        return (bArr == null || bArr.length < i11) ? new byte[i11] : bArr;
    }

    public char[] allocCharBuffer(int i10, int i11) {
        int i12 = f59449e[i10];
        if (i11 < i12) {
            i11 = i12;
        }
        char[] cArr = (char[]) this.f59451b.getAndSet(i10, null);
        return (cArr == null || cArr.length < i11) ? new char[i11] : cArr;
    }

    @Override // ic.e0
    public b withPool(f0 f0Var) {
        if (this.f59452c == null) {
            Objects.requireNonNull(f0Var);
            this.f59452c = f0Var;
            return this;
        }
        throw new IllegalStateException("BufferRecycler already linked to pool: " + f0Var);
    }
}

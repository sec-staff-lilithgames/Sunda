package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c extends uu.m0 {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f71817b;

    /* renamed from: c, reason: collision with root package name */
    public int f71818c;

    public c(byte[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71817b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71818c < this.f71817b.length;
    }

    @Override // uu.m0
    public byte nextByte() {
        try {
            byte[] bArr = this.f71817b;
            int i10 = this.f71818c;
            this.f71818c = i10 + 1;
            return bArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71818c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

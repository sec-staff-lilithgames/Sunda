package kotlin.jvm.internal;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends uu.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final char[] f71822b;

    /* renamed from: c, reason: collision with root package name */
    public int f71823c;

    public d(char[] array) {
        e0.checkNotNullParameter(array, "array");
        this.f71822b = array;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f71823c < this.f71822b.length;
    }

    @Override // uu.n0
    public char nextChar() {
        try {
            char[] cArr = this.f71822b;
            int i10 = this.f71823c;
            this.f71823c = i10 + 1;
            return cArr[i10];
        } catch (ArrayIndexOutOfBoundsException e10) {
            this.f71823c--;
            throw new NoSuchElementException(e10.getMessage());
        }
    }
}

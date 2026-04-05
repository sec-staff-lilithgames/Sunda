package qv;

import uu.j1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class k implements Iterable, lv.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f83529f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final int f83530b;

    /* renamed from: c, reason: collision with root package name */
    public final int f83531c;

    /* renamed from: e, reason: collision with root package name */
    public final int f83532e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final k fromClosedRange(int i10, int i11, int i12) {
            return new k(i10, i11, i12);
        }
    }

    public k(int i10, int i11, int i12) {
        if (i12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i12 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f83530b = i10;
        this.f83531c = dv.d.getProgressionLastElement(i10, i11, i12);
        this.f83532e = i12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        if (isEmpty() && ((k) obj).isEmpty()) {
            return true;
        }
        k kVar = (k) obj;
        return this.f83530b == kVar.f83530b && this.f83531c == kVar.f83531c && this.f83532e == kVar.f83532e;
    }

    public final int getFirst() {
        return this.f83530b;
    }

    public final int getLast() {
        return this.f83531c;
    }

    public final int getStep() {
        return this.f83532e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f83530b * 31) + this.f83531c) * 31) + this.f83532e;
    }

    public boolean isEmpty() {
        int i10 = this.f83532e;
        int i11 = this.f83531c;
        int i12 = this.f83530b;
        return i10 > 0 ? i12 > i11 : i12 < i11;
    }

    public String toString() {
        StringBuilder sb2;
        int i10 = this.f83531c;
        int i11 = this.f83530b;
        int i12 = this.f83532e;
        if (i12 > 0) {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append("..");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(i12);
        } else {
            sb2 = new StringBuilder();
            sb2.append(i11);
            sb2.append(" downTo ");
            sb2.append(i10);
            sb2.append(" step ");
            sb2.append(-i12);
        }
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    public j1 iterator() {
        return new l(this.f83530b, this.f83531c, this.f83532e);
    }
}

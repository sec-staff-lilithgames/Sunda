package qv;

import uu.k1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class n implements Iterable, lv.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f83539f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final long f83540b;

    /* renamed from: c, reason: collision with root package name */
    public final long f83541c;

    /* renamed from: e, reason: collision with root package name */
    public final long f83542e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final n fromClosedRange(long j10, long j11, long j12) {
            return new n(j10, j11, j12);
        }
    }

    public n(long j10, long j11, long j12) {
        if (j12 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j12 == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.f83540b = j10;
        this.f83541c = dv.d.getProgressionLastElement(j10, j11, j12);
        this.f83542e = j12;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        if (isEmpty() && ((n) obj).isEmpty()) {
            return true;
        }
        n nVar = (n) obj;
        return this.f83540b == nVar.f83540b && this.f83541c == nVar.f83541c && this.f83542e == nVar.f83542e;
    }

    public final long getFirst() {
        return this.f83540b;
    }

    public final long getLast() {
        return this.f83541c;
    }

    public final long getStep() {
        return this.f83542e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j10 = 31;
        long j11 = this.f83540b;
        long j12 = this.f83541c;
        long j13 = (((j11 ^ (j11 >>> 32)) * j10) + (j12 ^ (j12 >>> 32))) * j10;
        long j14 = this.f83542e;
        return (int) (j13 + (j14 ^ (j14 >>> 32)));
    }

    public boolean isEmpty() {
        long j10 = this.f83542e;
        long j11 = this.f83541c;
        long j12 = this.f83540b;
        return j10 > 0 ? j12 > j11 : j12 < j11;
    }

    public String toString() {
        StringBuilder sb2;
        long j10 = this.f83542e;
        long j11 = this.f83541c;
        long j12 = this.f83540b;
        if (j10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append("..");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(j10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(j12);
            sb2.append(" downTo ");
            sb2.append(j11);
            sb2.append(" step ");
            sb2.append(-j10);
        }
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    public k1 iterator() {
        return new o(this.f83540b, this.f83541c, this.f83542e);
    }
}

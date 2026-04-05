package qv;

import kotlin.jvm.internal.e0;
import uu.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a implements Iterable, lv.a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0772a f83511f = new C0772a(null);

    /* renamed from: b, reason: collision with root package name */
    public final char f83512b;

    /* renamed from: c, reason: collision with root package name */
    public final char f83513c;

    /* renamed from: e, reason: collision with root package name */
    public final int f83514e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: qv.a$a, reason: collision with other inner class name */
    public static final class C0772a {
        public C0772a(kotlin.jvm.internal.u uVar) {
        }

        public final a fromClosedRange(char c10, char c11, int i10) {
            return new a(c10, c11, i10);
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i10 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f83512b = c10;
        this.f83513c = (char) dv.d.getProgressionLastElement((int) c10, (int) c11, i10);
        this.f83514e = i10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        if (isEmpty() && ((a) obj).isEmpty()) {
            return true;
        }
        a aVar = (a) obj;
        return this.f83512b == aVar.f83512b && this.f83513c == aVar.f83513c && this.f83514e == aVar.f83514e;
    }

    public final char getFirst() {
        return this.f83512b;
    }

    public final char getLast() {
        return this.f83513c;
    }

    public final int getStep() {
        return this.f83514e;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f83512b * 31) + this.f83513c) * 31) + this.f83514e;
    }

    public boolean isEmpty() {
        int i10 = this.f83514e;
        char c10 = this.f83513c;
        char c11 = this.f83512b;
        return i10 > 0 ? e0.compare((int) c11, (int) c10) > 0 : e0.compare((int) c11, (int) c10) < 0;
    }

    public String toString() {
        StringBuilder sb2;
        char c10 = this.f83513c;
        char c11 = this.f83512b;
        int i10 = this.f83514e;
        if (i10 > 0) {
            sb2 = new StringBuilder();
            sb2.append(c11);
            sb2.append("..");
            sb2.append(c10);
            sb2.append(" step ");
            sb2.append(i10);
        } else {
            sb2 = new StringBuilder();
            sb2.append(c11);
            sb2.append(" downTo ");
            sb2.append(c10);
            sb2.append(" step ");
            sb2.append(-i10);
        }
        return sb2.toString();
    }

    @Override // java.lang.Iterable
    public n0 iterator() {
        return new b(this.f83512b, this.f83513c, this.f83514e);
    }
}

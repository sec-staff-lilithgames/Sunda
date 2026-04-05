package io.odeeo.internal.u0;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f66989a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator<? super T> f66990b;

    /* renamed from: c, reason: collision with root package name */
    public final T[] f66991c;

    /* renamed from: d, reason: collision with root package name */
    public int f66992d;

    /* renamed from: e, reason: collision with root package name */
    public T f66993e;

    public n3(Comparator<? super T> comparator, int i10) {
        this.f66990b = (Comparator) io.odeeo.internal.t0.u.checkNotNull(comparator, "comparator");
        this.f66989a = i10;
        io.odeeo.internal.t0.u.checkArgument(i10 >= 0, "k must be nonnegative, was %s", i10);
        this.f66991c = (T[]) new Object[i10 * 2];
        this.f66992d = 0;
        this.f66993e = null;
    }

    public static <T extends Comparable<? super T>> n3<T> greatest(int i10) {
        return greatest(i10, p2.natural());
    }

    public static <T extends Comparable<? super T>> n3<T> least(int i10) {
        return least(i10, p2.natural());
    }

    public final void a() {
        int i10 = (this.f66989a * 2) - 1;
        int iLog2 = io.odeeo.internal.v0.a.log2(i10, RoundingMode.CEILING) * 3;
        int iMax = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (iMax >= i10) {
                break;
            }
            int iA = a(iMax, i10, ((iMax + i10) + 1) >>> 1);
            int i13 = this.f66989a;
            if (iA <= i13) {
                if (iA >= i13) {
                    break;
                }
                iMax = Math.max(iA, iMax + 1);
                i12 = iA;
            } else {
                i10 = iA - 1;
            }
            i11++;
            if (i11 >= iLog2) {
                Arrays.sort(this.f66991c, iMax, i10, this.f66990b);
                break;
            }
        }
        this.f66992d = this.f66989a;
        this.f66993e = this.f66991c[i12];
        while (true) {
            i12++;
            if (i12 >= this.f66989a) {
                return;
            }
            if (this.f66990b.compare(this.f66991c[i12], this.f66993e) > 0) {
                this.f66993e = this.f66991c[i12];
            }
        }
    }

    public void offer(T t10) {
        int i10 = this.f66989a;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f66992d;
        if (i11 == 0) {
            this.f66991c[0] = t10;
            this.f66993e = t10;
            this.f66992d = 1;
            return;
        }
        if (i11 < i10) {
            T[] tArr = this.f66991c;
            this.f66992d = i11 + 1;
            tArr[i11] = t10;
            if (this.f66990b.compare(t10, this.f66993e) > 0) {
                this.f66993e = t10;
                return;
            }
            return;
        }
        if (this.f66990b.compare(t10, this.f66993e) < 0) {
            T[] tArr2 = this.f66991c;
            int i12 = this.f66992d;
            int i13 = i12 + 1;
            this.f66992d = i13;
            tArr2[i12] = t10;
            if (i13 == this.f66989a * 2) {
                a();
            }
        }
    }

    public void offerAll(Iterable<? extends T> iterable) {
        offerAll(iterable.iterator());
    }

    public List<T> topK() {
        Arrays.sort(this.f66991c, 0, this.f66992d, this.f66990b);
        int i10 = this.f66992d;
        int i11 = this.f66989a;
        if (i10 > i11) {
            T[] tArr = this.f66991c;
            Arrays.fill(tArr, i11, tArr.length, (Object) null);
            int i12 = this.f66989a;
            this.f66992d = i12;
            this.f66993e = this.f66991c[i12 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(this.f66991c, this.f66992d)));
    }

    public static <T> n3<T> greatest(int i10, Comparator<? super T> comparator) {
        return new n3<>(p2.from(comparator).reverse(), i10);
    }

    public static <T> n3<T> least(int i10, Comparator<? super T> comparator) {
        return new n3<>(comparator, i10);
    }

    public void offerAll(Iterator<? extends T> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }

    public final int a(int i10, int i11, int i12) {
        T[] tArr = this.f66991c;
        T t10 = tArr[i12];
        tArr[i12] = tArr[i11];
        int i13 = i10;
        while (i10 < i11) {
            if (this.f66990b.compare(this.f66991c[i10], t10) < 0) {
                a(i13, i10);
                i13++;
            }
            i10++;
        }
        T[] tArr2 = this.f66991c;
        tArr2[i11] = tArr2[i13];
        tArr2[i13] = t10;
        return i13;
    }

    public final void a(int i10, int i11) {
        T[] tArr = this.f66991c;
        T t10 = tArr[i10];
        tArr[i10] = tArr[i11];
        tArr[i11] = t10;
    }
}

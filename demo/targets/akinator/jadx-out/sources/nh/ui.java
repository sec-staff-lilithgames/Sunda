package nh;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ui {

    /* renamed from: a, reason: collision with root package name */
    public final int f76697a;

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f76698b;

    /* renamed from: c, reason: collision with root package name */
    public final Object[] f76699c;

    /* renamed from: d, reason: collision with root package name */
    public int f76700d;

    /* renamed from: e, reason: collision with root package name */
    public Object f76701e;

    public ui(Comparator comparator, int i10) {
        this.f76698b = (Comparator) mh.p1.checkNotNull(comparator, "comparator");
        this.f76697a = i10;
        mh.p1.checkArgument(i10 >= 0, "k (%s) must be >= 0", i10);
        mh.p1.checkArgument(i10 <= 1073741823, "k (%s) must be <= Integer.MAX_VALUE / 2", i10);
        this.f76699c = new Object[Math.multiplyExact(i10, 2)];
        this.f76700d = 0;
        this.f76701e = null;
    }

    public static <T extends Comparable<? super T>> ui greatest(int i10) {
        return greatest(i10, we.natural());
    }

    public static <T extends Comparable<? super T>> ui least(int i10) {
        return least(i10, we.natural());
    }

    public void offer(Object obj) {
        int i10 = this.f76697a;
        if (i10 == 0) {
            return;
        }
        int i11 = this.f76700d;
        int iMax = 0;
        Object[] objArr = this.f76699c;
        if (i11 == 0) {
            objArr[0] = obj;
            this.f76701e = obj;
            this.f76700d = 1;
            return;
        }
        Comparator comparator = this.f76698b;
        if (i11 < i10) {
            this.f76700d = i11 + 1;
            objArr[i11] = obj;
            if (comparator.compare(obj, this.f76701e) > 0) {
                this.f76701e = obj;
                return;
            }
            return;
        }
        if (comparator.compare(obj, this.f76701e) < 0) {
            int i12 = this.f76700d;
            int i13 = i12 + 1;
            this.f76700d = i13;
            objArr[i12] = obj;
            if (i13 == i10 * 2) {
                int i14 = (i10 * 2) - 1;
                int iLog2 = qh.f.log2(i14, RoundingMode.CEILING) * 3;
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    if (iMax >= i14) {
                        break;
                    }
                    int i17 = ((iMax + i14) + 1) >>> 1;
                    Object obj2 = objArr[i17];
                    objArr[i17] = objArr[i14];
                    int i18 = iMax;
                    int i19 = i18;
                    while (i18 < i14) {
                        if (comparator.compare(objArr[i18], obj2) < 0) {
                            Object obj3 = objArr[i19];
                            objArr[i19] = objArr[i18];
                            objArr[i18] = obj3;
                            i19++;
                        }
                        i18++;
                    }
                    objArr[i14] = objArr[i19];
                    objArr[i19] = obj2;
                    if (i19 <= i10) {
                        if (i19 >= i10) {
                            break;
                        }
                        iMax = Math.max(i19, iMax + 1);
                        i16 = i19;
                    } else {
                        i14 = i19 - 1;
                    }
                    i15++;
                    if (i15 >= iLog2) {
                        Arrays.sort(objArr, iMax, i14 + 1, comparator);
                        break;
                    }
                }
                this.f76700d = i10;
                this.f76701e = objArr[i16];
                for (int i20 = i16 + 1; i20 < i10; i20++) {
                    if (comparator.compare(objArr[i20], this.f76701e) > 0) {
                        this.f76701e = objArr[i20];
                    }
                }
            }
        }
    }

    public void offerAll(Iterable<Object> iterable) {
        offerAll(iterable.iterator());
    }

    public List<Object> topK() {
        int i10 = this.f76700d;
        Comparator comparator = this.f76698b;
        Object[] objArr = this.f76699c;
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = this.f76700d;
        int i12 = this.f76697a;
        if (i11 > i12) {
            Arrays.fill(objArr, i12, objArr.length, (Object) null);
            this.f76700d = i12;
            this.f76701e = objArr[i12 - 1];
        }
        return Collections.unmodifiableList(Arrays.asList(Arrays.copyOf(objArr, this.f76700d)));
    }

    public static <T> ui greatest(int i10, Comparator<? super T> comparator) {
        return new ui(we.from(comparator).reverse(), i10);
    }

    public static <T> ui least(int i10, Comparator<? super T> comparator) {
        return new ui(comparator, i10);
    }

    public void offerAll(Iterator<Object> it) {
        while (it.hasNext()) {
            offer(it.next());
        }
    }
}

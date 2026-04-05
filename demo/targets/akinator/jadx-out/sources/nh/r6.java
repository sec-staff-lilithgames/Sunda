package nh;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class r6 extends g5 {

    /* renamed from: f, reason: collision with root package name */
    public transient Object[] f76597f = new Object[4];

    /* renamed from: g, reason: collision with root package name */
    public transient Object[] f76598g = new Object[4];

    /* renamed from: h, reason: collision with root package name */
    public final Comparator f76599h;

    public r6(Comparator<Object> comparator) {
        this.f76599h = (Comparator) mh.p1.checkNotNull(comparator);
    }

    @Override // nh.g5
    @Deprecated
    public /* bridge */ /* synthetic */ g5 orderEntriesByValue(Comparator comparator) {
        return orderEntriesByValue((Comparator<Object>) comparator);
    }

    @Override // nh.g5
    public /* bridge */ /* synthetic */ g5 putAll(Iterable iterable) {
        return putAll((Iterable<? extends Map.Entry<Object, Object>>) iterable);
    }

    @Override // nh.g5
    public s6 build() {
        return buildOrThrow();
    }

    @Override // nh.g5
    @Deprecated
    public final s6 buildKeepingLast() {
        throw new UnsupportedOperationException("ImmutableSortedMap.Builder does not yet implement buildKeepingLast()");
    }

    @Override // nh.g5
    public s6 buildOrThrow() {
        int i10 = this.f76286c;
        Comparator comparator = this.f76599h;
        if (i10 == 0) {
            return s6.i(comparator);
        }
        if (i10 == 1) {
            Object obj = this.f76597f[0];
            Objects.requireNonNull(obj);
            Object obj2 = this.f76598g[0];
            Objects.requireNonNull(obj2);
            return s6.m(comparator, obj, obj2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(this.f76597f, i10);
        Arrays.sort(objArrCopyOf, comparator);
        int i11 = this.f76286c;
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < this.f76286c; i12++) {
            if (i12 > 0) {
                int i13 = i12 - 1;
                if (comparator.compare(objArrCopyOf[i13], objArrCopyOf[i12]) == 0) {
                    throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i13] + " and " + objArrCopyOf[i12]);
                }
            }
            Object obj3 = this.f76597f[i12];
            Objects.requireNonNull(obj3);
            int iBinarySearch = Arrays.binarySearch(objArrCopyOf, obj3, comparator);
            Object obj4 = this.f76598g[i12];
            Objects.requireNonNull(obj4);
            objArr[iBinarySearch] = obj4;
        }
        return new s6(new pf(b5.f(objArrCopyOf.length, objArrCopyOf), comparator), b5.f(i11, objArr), null);
    }

    @Override // nh.g5
    @Deprecated
    public final r6 orderEntriesByValue(Comparator<Object> comparator) {
        throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
    }

    @Override // nh.g5
    public /* bridge */ /* synthetic */ g5 put(Map.Entry entry) {
        return put((Map.Entry<Object, Object>) entry);
    }

    @Override // nh.g5
    public /* bridge */ /* synthetic */ g5 putAll(Map map) {
        return putAll((Map<Object, Object>) map);
    }

    @Override // nh.g5
    public r6 put(Object obj, Object obj2) {
        int i10 = this.f76286c + 1;
        Object[] objArr = this.f76597f;
        if (i10 > objArr.length) {
            int iA = t4.a(objArr.length, i10);
            this.f76597f = Arrays.copyOf(this.f76597f, iA);
            this.f76598g = Arrays.copyOf(this.f76598g, iA);
        }
        jh.i.i(obj, obj2);
        Object[] objArr2 = this.f76597f;
        int i11 = this.f76286c;
        objArr2[i11] = obj;
        this.f76598g[i11] = obj2;
        this.f76286c = i11 + 1;
        return this;
    }

    @Override // nh.g5
    public r6 putAll(Map<Object, Object> map) {
        super.putAll(map);
        return this;
    }

    @Override // nh.g5
    public r6 putAll(Iterable<? extends Map.Entry<Object, Object>> iterable) {
        super.putAll(iterable);
        return this;
    }

    @Override // nh.g5
    public r6 put(Map.Entry<Object, Object> entry) {
        super.put(entry);
        return this;
    }
}

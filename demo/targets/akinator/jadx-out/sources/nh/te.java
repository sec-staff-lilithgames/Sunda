package nh;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class te extends we {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f76667b = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentMap f76668c = new s8().weakKeys().makeMap();

    @Override // nh.we, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        int iIdentityHashCode = System.identityHashCode(obj);
        int iIdentityHashCode2 = System.identityHashCode(obj2);
        if (iIdentityHashCode != iIdentityHashCode2) {
            return iIdentityHashCode < iIdentityHashCode2 ? -1 : 1;
        }
        ConcurrentMap concurrentMap = this.f76668c;
        Integer numValueOf = (Integer) concurrentMap.get(obj);
        AtomicInteger atomicInteger = this.f76667b;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(atomicInteger.getAndIncrement());
            Integer num = (Integer) concurrentMap.putIfAbsent(obj, numValueOf);
            if (num != null) {
                numValueOf = num;
            }
        }
        Integer numValueOf2 = (Integer) concurrentMap.get(obj2);
        if (numValueOf2 == null) {
            numValueOf2 = Integer.valueOf(atomicInteger.getAndIncrement());
            Integer num2 = (Integer) concurrentMap.putIfAbsent(obj2, numValueOf2);
            if (num2 != null) {
                numValueOf2 = num2;
            }
        }
        int iCompareTo = numValueOf.compareTo(numValueOf2);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        throw new AssertionError();
    }

    public String toString() {
        return "Ordering.arbitrary()";
    }
}

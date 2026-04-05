package uu;

import be.nVUQ.UupKET;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p0.o2;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y0 extends x0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements rv.t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f88798a;

        public a(Iterable iterable) {
            this.f88798a = iterable;
        }

        @Override // rv.t
        public Iterator<T> iterator() {
            return this.f88798a.iterator();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements f1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterable f88799a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f88800b;

        public b(Iterable<? extends T> iterable, kv.l lVar) {
            this.f88799a = iterable;
            this.f88800b = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [K, java.lang.Object] */
        @Override // uu.f1
        public K keyOf(T t10) {
            return this.f88800b.invoke(t10);
        }

        @Override // uu.f1
        public Iterator<T> sourceIterator() {
            return this.f88799a.iterator();
        }
    }

    public static final <T> boolean all(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? !((Collection) iterable).isEmpty() : iterable.iterator().hasNext();
    }

    public static <T> rv.t asSequence(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return new a(iterable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(Iterable<? extends T> iterable, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(iterable, 10)), 16));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            tu.v vVar = (tu.v) transform.invoke(it.next());
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K> Map<K, T> associateBy(Iterable<? extends T> iterable, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t10 : iterable) {
            linkedHashMap.put(keySelector.invoke(t10), t10);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(Iterable<? extends T> iterable, M destination, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : iterable) {
            destination.put(keySelector.invoke(t10), t10);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(Iterable<? extends T> iterable, M destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            tu.v vVar = (tu.v) transform.invoke(it.next());
            destination.put(vVar.getFirst(), vVar.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateWith(Iterable<? extends K> iterable, kv.l valueSelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(iterable, 10)), 16));
        for (K k10 : iterable) {
            linkedHashMap.put(k10, valueSelector.invoke(k10));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(Iterable<? extends K> iterable, M destination, kv.l valueSelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueSelector, "valueSelector");
        for (K k10 : iterable) {
            destination.put(k10, valueSelector.invoke(k10));
        }
        return destination;
    }

    public static final double averageOfByte(Iterable<Byte> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        double dByteValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dByteValue += it.next().byteValue();
            i10++;
            if (i10 < 0) {
                p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / i10;
    }

    public static final double averageOfDouble(Iterable<Double> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
            i10++;
            if (i10 < 0) {
                p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / i10;
    }

    public static final double averageOfFloat(Iterable<Float> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        double dFloatValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dFloatValue += it.next().floatValue();
            i10++;
            if (i10 < 0) {
                p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / i10;
    }

    public static final double averageOfInt(Iterable<Integer> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        double dIntValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dIntValue += it.next().intValue();
            i10++;
            if (i10 < 0) {
                p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / i10;
    }

    public static final double averageOfLong(Iterable<Long> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        double dLongValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dLongValue += it.next().longValue();
            i10++;
            if (i10 < 0) {
                p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / i10;
    }

    public static final double averageOfShort(Iterable<Short> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        double dShortValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dShortValue += it.next().shortValue();
            i10++;
            if (i10 < 0) {
                p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / i10;
    }

    public static <T> List<List<T>> chunked(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return windowed(iterable, i10, i10, true);
    }

    public static <T> boolean contains(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(t10) : indexOf(iterable, t10) >= 0;
    }

    public static <T> int count(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                p0.throwCountOverflow();
            }
        }
        return i10;
    }

    public static <T> List<T> distinct(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return toList(toMutableSet(iterable));
    }

    public static final <T, K> List<T> distinctBy(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (hashSet.add(selector.invoke(t10))) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static <T> List<T> drop(Iterable<? extends T> iterable, int i10) {
        ArrayList arrayList;
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return toList(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i10;
            if (size <= 0) {
                return p0.emptyList();
            }
            if (size == 1) {
                return o0.listOf(last(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i10 < size2) {
                        arrayList.add(list.get(i10));
                        i10++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i10);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i11 = 0;
        for (T t10 : iterable) {
            if (i11 >= i10) {
                arrayList.add(t10);
            } else {
                i11++;
            }
        }
        return p0.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> dropLast(List<? extends T> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (i10 >= 0) {
            return take(list, qv.v.coerceAtLeast(list.size() - i10, 0));
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    public static final <T> List<T> dropLastWhile(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                    return take(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return p0.emptyList();
    }

    public static final <T> List<T> dropWhile(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        for (T t10 : iterable) {
            if (z10) {
                arrayList.add(t10);
            } else if (!((Boolean) predicate.invoke(t10)).booleanValue()) {
                arrayList.add(t10);
                z10 = true;
            }
        }
        return arrayList;
    }

    public static <T> T elementAt(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof List ? (T) ((List) iterable).get(i10) : (T) elementAtOrElse(iterable, i10, new rv.e0(i10, 4));
    }

    public static final <T> T elementAtOrElse(Iterable<? extends T> iterable, int i10, kv.l defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            return (i10 < 0 || i10 >= list.size()) ? (T) defaultValue.invoke(Integer.valueOf(i10)) : (T) list.get(i10);
        }
        if (i10 < 0) {
            return (T) defaultValue.invoke(Integer.valueOf(i10));
        }
        int i11 = 0;
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return (T) defaultValue.invoke(Integer.valueOf(i10));
    }

    public static final <T> T elementAtOrNull(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) getOrNull((List) iterable, i10);
        }
        if (i10 < 0) {
            return null;
        }
        int i11 = 0;
        for (T t10 : iterable) {
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return null;
    }

    public static final <T> List<T> filter(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> filterIndexed(Iterable<? extends T> iterable, kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i10), t10)).booleanValue()) {
                arrayList.add(t10);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(Iterable<? extends T> iterable, C destination, kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i10), t10)).booleanValue()) {
                destination.add(t10);
            }
            i10 = i11;
        }
        return destination;
    }

    public static final /* synthetic */ <R> List<R> filterIsInstance(Iterable<?> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            kotlin.jvm.internal.e0.reifiedOperationMarker(3, "R");
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(Iterable<?> iterable, C destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        for (Object obj : iterable) {
            kotlin.jvm.internal.e0.reifiedOperationMarker(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static <T> List<T> filterNotNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return (List) filterNotNullTo(iterable, new ArrayList());
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        for (T t10 : iterable) {
            if (t10 != null) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(Iterable<? extends T> iterable, C destination, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (T t10 : iterable) {
            if (!((Boolean) predicate.invoke(t10)).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(Iterable<? extends T> iterable, C destination, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (T t10 : iterable) {
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                destination.add(t10);
            }
        }
        return destination;
    }

    public static <T> T first(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) first((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> T firstOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T, R> List<R> flatMap(Iterable<? extends T> iterable, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, (Iterable) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> flatMapSequence(Iterable<? extends T> iterable, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, (rv.t) transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(Iterable<? extends T> iterable, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v0.addAll(destination, (Iterable) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(Iterable<? extends T> iterable, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = (R) operation.invoke(r10, it.next());
        }
        return r10;
    }

    public static final <T, R> R foldIndexed(Iterable<? extends T> iterable, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            r10 = (R) operation.invoke(Integer.valueOf(i10), r10, t10);
            i10 = i11;
        }
        return r10;
    }

    public static final <T, R> R foldRight(List<? extends T> list, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r10 = (R) operation.invoke(listIterator.previous(), r10);
            }
        }
        return r10;
    }

    public static final <T, R> R foldRightIndexed(List<? extends T> list, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                r10 = (R) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), r10);
            }
        }
        return r10;
    }

    public static final <T> void forEach(Iterable<? extends T> iterable, kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
    }

    public static final <T> void forEachIndexed(Iterable<? extends T> iterable, kv.p action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
    }

    public static <T> T getOrNull(List<? extends T> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    public static final <T, K> Map<K, List<T>> groupBy(Iterable<? extends T> iterable, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iterable) {
            Object objInvoke = keySelector.invoke(t10);
            Object objP = linkedHashMap.get(objInvoke);
            if (objP == null) {
                objP = e3.g.p(linkedHashMap, objInvoke);
            }
            ((List) objP).add(t10);
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(Iterable<? extends T> iterable, M destination, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        for (T t10 : iterable) {
            Object objInvoke = keySelector.invoke(t10);
            Object objV = destination.get(objInvoke);
            if (objV == null) {
                objV = o2.v(destination, objInvoke);
            }
            ((List) objV).add(t10);
        }
        return destination;
    }

    public static final <T, K> f1 groupingBy(Iterable<? extends T> iterable, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        return new b(iterable, keySelector);
    }

    public static final <T> int indexOf(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t10);
        }
        int i10 = 0;
        for (T t11 : iterable) {
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            if (kotlin.jvm.internal.e0.areEqual(t10, t11)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = -1;
        int i11 = 0;
        for (T t10 : iterable) {
            if (i11 < 0) {
                p0.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    public static final <T> Set<T> intersect(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        v0.retainAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T, A extends Appendable> A joinTo(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, kv.l lVar) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (T t10 : iterable) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            sv.c0.appendElement(buffer, t10, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String joinToString(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(iterable, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String joinToString$default(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, kv.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i11 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i11 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        if ((i11 & 16) != 0) {
            charSequence4 = APSSharedUtil.TRUNCATE_SEPARATOR;
        }
        if ((i11 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        kv.l lVar2 = lVar;
        return joinToString(iterable, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static <T> T last(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) last((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T> int lastIndexOf(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t10);
        }
        int i10 = -1;
        int i11 = 0;
        for (T t11 : iterable) {
            if (i11 < 0) {
                p0.throwIndexOverflow();
            }
            if (kotlin.jvm.internal.e0.areEqual(t10, t11)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) o2.g(1, list);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static final <T, R> List<R> map(Iterable<? extends T> iterable, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke(it.next()));
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexed(Iterable<? extends T> iterable, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            arrayList.add(transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return arrayList;
    }

    public static final <T, R> List<R> mapIndexedNotNull(Iterable<? extends T> iterable, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            Object objInvoke = transform.invoke(Integer.valueOf(i10), t10);
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
            i10 = i11;
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(Iterable<? extends T> iterable, C destination, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            Object objInvoke = transform.invoke(Integer.valueOf(i10), t10);
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
            i10 = i11;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(Iterable<? extends T> iterable, C destination, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (T t10 : iterable) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i10), t10));
            i10 = i11;
        }
        return destination;
    }

    public static final <T, R> List<R> mapNotNull(Iterable<? extends T> iterable, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (objInvoke != null) {
                arrayList.add(objInvoke);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(Iterable<? extends T> iterable, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(Iterable<? extends T> iterable, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrNull(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m7412maxOrNull(Iterable<Double> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double maxOrThrow(Iterable<Double> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T maxWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T maxWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) < 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrNull(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrThrow(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) selector.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) selector.invoke(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m7416minOrNull(Iterable<Double> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double minOrThrow(Iterable<Double> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, it.next().doubleValue());
        }
        return dDoubleValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T minWithOrNull(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T minWithOrThrow(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = (T) it.next();
        while (it.hasNext()) {
            Object obj2 = (T) it.next();
            if (comparator.compare(obj, obj2) > 0) {
                obj = (T) obj2;
            }
        }
        return (T) obj;
    }

    public static <T> List<T> minus(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
        boolean z10 = false;
        for (T t11 : iterable) {
            boolean z11 = true;
            if (!z10 && kotlin.jvm.internal.e0.areEqual(t11, t10)) {
                z10 = true;
                z11 = false;
            }
            if (z11) {
                arrayList.add(t11);
            }
        }
        return arrayList;
    }

    public static final <T> boolean none(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).isEmpty() : !iterable.iterator().hasNext();
    }

    public static final <T, C extends Iterable<? extends T>> C onEach(C c10, kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c10, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        Iterator<T> it = c10.iterator();
        while (it.hasNext()) {
            action.invoke(it.next());
        }
        return c10;
    }

    public static final <T, C extends Iterable<? extends T>> C onEachIndexed(C c10, kv.p action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c10, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        int i10 = 0;
        for (T t10 : c10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i10), t10);
            i10 = i11;
        }
        return c10;
    }

    public static final <T> tu.v partition(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (T t10 : iterable) {
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                arrayList.add(t10);
            } else {
                arrayList2.add(t10);
            }
        }
        return new tu.v(arrayList, arrayList2);
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object) t10);
        }
        ArrayList arrayList = new ArrayList();
        v0.addAll(arrayList, iterable);
        arrayList.add(t10);
        return arrayList;
    }

    public static <T> T random(Collection<? extends T> collection, ov.g random) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    public static final <T> T randomOrNull(Collection<? extends T> collection, ov.g random) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(random, "random");
        if (collection.isEmpty()) {
            return null;
        }
        return (T) elementAt(collection, random.nextInt(collection.size()));
    }

    public static final <S, T extends S> S reduce(Iterable<? extends T> iterable, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = (S) operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexed(Iterable<? extends T> iterable, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        T next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            next = (S) operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    public static final <S, T extends S> S reduceIndexedOrNull(Iterable<? extends T> iterable, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                p0.throwIndexOverflow();
            }
            next = (S) operation.invoke(Integer.valueOf(i10), next, it.next());
            i10 = i11;
        }
        return next;
    }

    public static final <S, T extends S> S reduceOrNull(Iterable<? extends T> iterable, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = (S) operation.invoke(next, it.next());
        }
        return next;
    }

    public static final <S, T extends S> S reduceRight(List<? extends T> list, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        T tPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            tPrevious = (S) operation.invoke(listIterator.previous(), tPrevious);
        }
        return tPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexed(List<? extends T> list, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            throw new UnsupportedOperationException("Empty list can't be reduced.");
        }
        T tPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            tPrevious = (S) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), tPrevious);
        }
        return tPrevious;
    }

    public static final <S, T extends S> S reduceRightIndexedOrNull(List<? extends T> list, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        T tPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            tPrevious = (S) operation.invoke(Integer.valueOf(listIterator.previousIndex()), listIterator.previous(), tPrevious);
        }
        return tPrevious;
    }

    public static final <S, T extends S> S reduceRightOrNull(List<? extends T> list, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        if (!listIterator.hasPrevious()) {
            return null;
        }
        T tPrevious = listIterator.previous();
        while (listIterator.hasPrevious()) {
            tPrevious = (S) operation.invoke(listIterator.previous(), tPrevious);
        }
        return tPrevious;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Iterable<T> requireNoNulls(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    public static <T> List<T> reversed(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return toList(iterable);
        }
        List<T> mutableList = toMutableList(iterable);
        x0.reverse(mutableList);
        return mutableList;
    }

    public static final <T, R> List<R> runningFold(Iterable<? extends T> iterable, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = q0.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return o0.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = (R) operation.invoke(r10, it.next());
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final <T, R> List<R> runningFoldIndexed(Iterable<? extends T> iterable, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = q0.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return o0.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            r10 = (R) operation.invoke(Integer.valueOf(i10), r10, it.next());
            arrayList.add(r10);
            i10++;
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduce(Iterable<? extends T> iterable, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return p0.emptyList();
        }
        Object next = it.next();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        while (it.hasNext()) {
            next = operation.invoke(next, it.next());
            arrayList.add(next);
        }
        return arrayList;
    }

    public static final <S, T extends S> List<S> runningReduceIndexed(Iterable<? extends T> iterable, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return p0.emptyList();
        }
        Object next = it.next();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(iterable, 10));
        arrayList.add(next);
        int i10 = 1;
        while (it.hasNext()) {
            next = operation.invoke(Integer.valueOf(i10), next, it.next());
            arrayList.add(next);
            i10++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> scan(Iterable<? extends T> iterable, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = q0.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return o0.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            r10 = (R) operation.invoke(r10, it.next());
            arrayList.add(r10);
        }
        return arrayList;
    }

    public static final <T, R> List<R> scanIndexed(Iterable<? extends T> iterable, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int iCollectionSizeOrDefault = q0.collectionSizeOrDefault(iterable, 9);
        if (iCollectionSizeOrDefault == 0) {
            return o0.listOf(r10);
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault + 1);
        arrayList.add(r10);
        Iterator<? extends T> it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            r10 = (R) operation.invoke(Integer.valueOf(i10), r10, it.next());
            arrayList.add(r10);
            i10++;
        }
        return arrayList;
    }

    public static final <T> void shuffle(List<T> list, ov.g random) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(random, "random");
        for (int lastIndex = p0.getLastIndex(list); lastIndex > 0; lastIndex--) {
            int iNextInt = random.nextInt(lastIndex + 1);
            list.set(iNextInt, list.set(lastIndex, list.get(iNextInt)));
        }
    }

    public static <T> T single(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return (T) single((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static final <T> List<T> slice(List<? extends T> list, qv.m indices) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(indices, "indices");
        return indices.isEmpty() ? p0.emptyList() : toList(list.subList(indices.getStart().intValue(), indices.getEndInclusive().intValue() + 1));
    }

    public static final <T, R extends Comparable<? super R>> void sortBy(List<T> list, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            u0.sortWith(list, new xu.b(selector));
        }
    }

    public static final <T, R extends Comparable<? super R>> void sortByDescending(List<T> list, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        if (list.size() > 1) {
            u0.sortWith(list, new xu.c(selector));
        }
    }

    public static final <T extends Comparable<? super T>> void sortDescending(List<T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        u0.sortWith(list, xu.d.reverseOrder());
    }

    public static <T extends Comparable<? super T>> List<T> sorted(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            u0.sort(mutableList);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        f0.sort((Comparable[]) array);
        return f0.asList(array);
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedBy(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        return sortedWith(iterable, new xu.b(selector));
    }

    public static final <T, R extends Comparable<? super R>> List<T> sortedByDescending(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        return sortedWith(iterable, new xu.c(selector));
    }

    public static final <T extends Comparable<? super T>> List<T> sortedDescending(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return sortedWith(iterable, xu.d.reverseOrder());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> sortedWith(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        if (!(iterable instanceof Collection)) {
            List<T> mutableList = toMutableList(iterable);
            u0.sortWith(mutableList, comparator);
            return mutableList;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return toList(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        f0.sortWith(array, comparator);
        return f0.asList(array);
    }

    public static final <T> Set<T> subtract(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        v0.removeAll(mutableSet, other);
        return mutableSet;
    }

    @tu.f
    public static final <T> int sumBy(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) selector.invoke(it.next())).intValue();
        }
        return iIntValue;
    }

    @tu.f
    public static final <T> double sumByDouble(Iterable<? extends T> iterable, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        Iterator<? extends T> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) selector.invoke(it.next())).doubleValue();
        }
        return dDoubleValue;
    }

    public static final int sumOfByte(Iterable<Byte> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Byte> it = iterable.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += it.next().byteValue();
        }
        return iByteValue;
    }

    public static final double sumOfDouble(Iterable<Double> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += it.next().doubleValue();
        }
        return dDoubleValue;
    }

    public static final float sumOfFloat(Iterable<Float> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    public static final int sumOfInt(Iterable<Integer> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static final long sumOfLong(Iterable<Long> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Long> it = iterable.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += it.next().longValue();
        }
        return jLongValue;
    }

    public static final int sumOfShort(Iterable<Short> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Short> it = iterable.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += it.next().shortValue();
        }
        return iShortValue;
    }

    public static <T> List<T> take(Iterable<? extends T> iterable, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        if (iterable instanceof Collection) {
            if (i10 >= ((Collection) iterable).size()) {
                return toList(iterable);
            }
            if (i10 == 1) {
                return o0.listOf(first(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i10);
        Iterator<? extends T> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i11++;
            if (i11 == i10) {
                break;
            }
        }
        return p0.optimizeReadOnlyList(arrayList);
    }

    public static <T> List<T> takeLast(List<? extends T> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (i10 < 0) {
            throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
        }
        if (i10 == 0) {
            return p0.emptyList();
        }
        int size = list.size();
        if (i10 >= size) {
            return toList(list);
        }
        if (i10 == 1) {
            return o0.listOf(last((List) list));
        }
        ArrayList arrayList = new ArrayList(i10);
        if (list instanceof RandomAccess) {
            for (int i11 = size - i10; i11 < size; i11++) {
                arrayList.add(list.get(i11));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i10);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final <T> List<T> takeLastWhile(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if (list.isEmpty()) {
            return p0.emptyList();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return p0.emptyList();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return toList(list);
    }

    public static boolean[] toBooleanArray(Collection<Boolean> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            zArr[i10] = it.next().booleanValue();
            i10++;
        }
        return zArr;
    }

    public static final byte[] toByteArray(Collection<Byte> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            bArr[i10] = it.next().byteValue();
            i10++;
        }
        return bArr;
    }

    public static final char[] toCharArray(Collection<Character> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        char[] cArr = new char[collection.size()];
        Iterator<Character> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            cArr[i10] = it.next().charValue();
            i10++;
        }
        return cArr;
    }

    public static final <T, C extends Collection<? super T>> C toCollection(Iterable<? extends T> iterable, C destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final double[] toDoubleArray(Collection<Double> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        double[] dArr = new double[collection.size()];
        Iterator<Double> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            dArr[i10] = it.next().doubleValue();
            i10++;
        }
        return dArr;
    }

    public static float[] toFloatArray(Collection<Float> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            fArr[i10] = it.next().floatValue();
            i10++;
        }
        return fArr;
    }

    public static <T> HashSet<T> toHashSet(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return (HashSet) toCollection(iterable, new HashSet(o1.mapCapacity(q0.collectionSizeOrDefault(iterable, 12))));
    }

    public static int[] toIntArray(Collection<Integer> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            iArr[i10] = it.next().intValue();
            i10++;
        }
        return iArr;
    }

    public static <T> List<T> toList(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return p0.optimizeReadOnlyList(toMutableList(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return p0.emptyList();
        }
        if (size != 1) {
            return toMutableList(collection);
        }
        return o0.listOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final long[] toLongArray(Collection<Long> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            jArr[i10] = it.next().longValue();
            i10++;
        }
        return jArr;
    }

    public static final <T> List<T> toMutableList(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? toMutableList((Collection) iterable) : (List) toCollection(iterable, new ArrayList());
    }

    public static <T> Set<T> toMutableSet(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) toCollection(iterable, new LinkedHashSet());
    }

    public static <T> Set<T> toSet(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return c2.optimizeReadOnlySet((Set) toCollection(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return c2.emptySet();
        }
        if (size != 1) {
            return (Set) toCollection(iterable, new LinkedHashSet(o1.mapCapacity(collection.size())));
        }
        return b2.setOf(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final short[] toShortArray(Collection<Short> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        short[] sArr = new short[collection.size()];
        Iterator<Short> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            sArr[i10] = it.next().shortValue();
            i10++;
        }
        return sArr;
    }

    public static final <T> Set<T> union(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        Set<T> mutableSet = toMutableSet(iterable);
        v0.addAll(mutableSet, other);
        return mutableSet;
    }

    public static final <T> List<List<T>> windowed(Iterable<? extends T> iterable, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        g2.checkWindowSizeStep(i10, i11);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itWindowedIterator = g2.windowedIterator(iterable.iterator(), i10, i11, z10, false);
            while (itWindowedIterator.hasNext()) {
                arrayList.add((List) itWindowedIterator.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
        int i12 = 0;
        while (i12 >= 0 && i12 < size) {
            int iCoerceAtMost = qv.v.coerceAtMost(i10, size - i12);
            if (iCoerceAtMost < i10 && !z10) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(iCoerceAtMost);
            for (int i13 = 0; i13 < iCoerceAtMost; i13++) {
                arrayList3.add(list.get(i13 + i12));
            }
            arrayList2.add(arrayList3);
            i12 += i11;
        }
        return arrayList2;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(iterable, i10, i11, z10);
    }

    public static final <T> Iterable<g1> withIndex(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        return new h1(new o6.v0(iterable, 13));
    }

    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, R[] other, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(q0.collectionSizeOrDefault(iterable, 10), length));
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(transform.invoke(t10, other[i10]));
            i10++;
        }
        return arrayList;
    }

    public static final <T, R> List<R> zipWithNext(Iterable<? extends T> iterable, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(transform.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T, R> List<R> chunked(Iterable<? extends T> iterable, int i10, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return windowed(iterable, i10, i10, true, transform);
    }

    public static final <T> List<T> filterNot(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, SUvoXnn.EylJFAVJWfrbp);
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!((Boolean) predicate.invoke(t10)).booleanValue()) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapSequenceTo(Iterable<? extends T> iterable, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, UupKET.rmWgewT);
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            v0.addAll(destination, (rv.t) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T> List<T> takeWhile(Iterable<? extends T> iterable, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, uQjDr.PogsfCjfgtYFeD);
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!((Boolean) lVar.invoke(t10)).booleanValue()) {
                break;
            }
            arrayList.add(t10);
        }
        return arrayList;
    }

    public static /* synthetic */ List windowed$default(Iterable iterable, int i10, int i11, boolean z10, kv.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(iterable, i10, i11, z10, lVar);
    }

    public static final <T> boolean any(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(Iterable<? extends T> iterable, M destination, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : iterable) {
            destination.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return destination;
    }

    public static final <T> int count(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue() && (i10 = i10 + 1) < 0) {
                p0.throwCountOverflow();
            }
        }
        return i10;
    }

    public static final <T> boolean none(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> List<T> requireNoNulls(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    public static final <T> List<T> slice(List<? extends T> list, Iterable<Integer> indices) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(indices, "indices");
        int iCollectionSizeOrDefault = q0.collectionSizeOrDefault(indices, 10);
        if (iCollectionSizeOrDefault == 0) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList(iCollectionSizeOrDefault);
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            arrayList.add(list.get(it.next().intValue()));
        }
        return arrayList;
    }

    public static final <T> int indexOfFirst(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        Iterator<? extends T> it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (((Boolean) predicate.invoke(it.next())).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (((Boolean) predicate.invoke(listIterator.previous())).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static <T> List<T> toMutableList(Collection<? extends T> collection) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associateBy(Iterable<? extends T> iterable, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(q0.collectionSizeOrDefault(iterable, 10)), 16));
        for (T t10 : iterable) {
            linkedHashMap.put(keySelector.invoke(t10), valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    public static <T> int indexOf(List<? extends T> list, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        return list.indexOf(t10);
    }

    public static final <T> int lastIndexOf(List<? extends T> list, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        return list.lastIndexOf(t10);
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements.length == 0) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!k0.contains(elements, t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t10);
        return arrayList;
    }

    public static final <T, R, V> List<V> zip(Iterable<? extends T> iterable, Iterable<? extends R> other, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q0.collectionSizeOrDefault(iterable, 10), q0.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(transform.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static <T> T first(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T singleOrNull(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> T firstOrNull(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static final <T> T singleOrNull(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        boolean z10 = false;
        T t10 = null;
        for (T t11 : iterable) {
            if (((Boolean) predicate.invoke(t11)).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    public static final <T> T firstOrNull(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (T t10 : iterable) {
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    public static <T> T last(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(p0.getLastIndex(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m7413maxOrNull(Iterable<Float> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m7414maxOrThrow(Iterable<Float> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m7417minOrNull(Iterable<Float> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m7418minOrThrow(Iterable<Float> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float fFloatValue = it.next().floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, it.next().floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Object[]) elements);
        }
        ArrayList arrayList = new ArrayList();
        v0.addAll(arrayList, iterable);
        v0.addAll(arrayList, elements);
        return arrayList;
    }

    public static <T> T single(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final <T> List<tu.v> zipWithNext(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return p0.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            arrayList.add(tu.e0.to(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static final <T> T first(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (T t10 : iterable) {
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(Iterable<? extends T> iterable, M destination, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        for (T t10 : iterable) {
            Object objInvoke = keySelector.invoke(t10);
            Object objV = destination.get(objInvoke);
            if (objV == null) {
                objV = o2.v(destination, objInvoke);
            }
            ((List) objV).add(valueTransform.invoke(t10));
        }
        return destination;
    }

    public static <T> T lastOrNull(List<? extends T> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return (T) o2.g(1, list);
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        Collection collectionConvertToListIfNotCollection = v0.convertToListIfNotCollection(elements);
        if (collectionConvertToListIfNotCollection.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!collectionConvertToListIfNotCollection.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static final <T, R> List<tu.v> zip(Iterable<? extends T> iterable, R[] other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        int length = other.length;
        ArrayList arrayList = new ArrayList(Math.min(q0.collectionSizeOrDefault(iterable, 10), length));
        int i10 = 0;
        for (T t10 : iterable) {
            if (i10 >= length) {
                break;
            }
            arrayList.add(tu.e0.to(t10, other[i10]));
            i10++;
        }
        return arrayList;
    }

    public static final <T, K, V> Map<K, List<V>> groupBy(Iterable<? extends T> iterable, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (T t10 : iterable) {
            Object objInvoke = keySelector.invoke(t10);
            Object objP = linkedHashMap.get(objInvoke);
            if (objP == null) {
                objP = e3.g.p(linkedHashMap, objInvoke);
            }
            ((List) objP).add(valueTransform.invoke(t10));
        }
        return linkedHashMap;
    }

    public static final <T> T last(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : iterable) {
            if (((Boolean) predicate.invoke(t11)).booleanValue()) {
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + elements.length);
        arrayList.addAll(collection);
        v0.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> T single(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        boolean z10 = false;
        for (T t11 : iterable) {
            if (((Boolean) predicate.invoke(t11)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z10 = true;
                t10 = t11;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public static final <T, R> List<R> windowed(Iterable<? extends T> iterable, int i10, int i11, boolean z10, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        g2.checkWindowSizeStep(i10, i11);
        if ((iterable instanceof RandomAccess) && (iterable instanceof List)) {
            List list = (List) iterable;
            int size = list.size();
            int i12 = 0;
            ArrayList arrayList = new ArrayList((size / i11) + (size % i11 == 0 ? 0 : 1));
            s1 s1Var = new s1(list);
            while (i12 >= 0 && i12 < size) {
                int iCoerceAtMost = qv.v.coerceAtMost(i10, size - i12);
                if (!z10 && iCoerceAtMost < i10) {
                    return arrayList;
                }
                s1Var.move(i12, iCoerceAtMost + i12);
                arrayList.add(transform.invoke(s1Var));
                i12 += i11;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator itWindowedIterator = g2.windowedIterator(iterable.iterator(), i10, i11, z10, true);
        while (itWindowedIterator.hasNext()) {
            arrayList2.add(transform.invoke((List) itWindowedIterator.next()));
        }
        return arrayList2;
    }

    public static final <T> T last(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (((Boolean) predicate.invoke(tPrevious)).booleanValue()) {
                return tPrevious;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public static final <T> T lastOrNull(Iterable<? extends T> iterable, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        T t10 = null;
        for (T t11 : iterable) {
            if (((Boolean) predicate.invoke(t11)).booleanValue()) {
                t10 = t11;
            }
        }
        return t10;
    }

    public static <T extends Comparable<? super T>> T maxOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m7415maxOrThrow(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static <T extends Comparable<? super T>> T minOrNull(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m7419minOrThrow(Iterable<? extends T> iterable) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    public static <T> List<T> plus(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (iterable instanceof Collection) {
            return plus((Collection) iterable, (Iterable) elements);
        }
        ArrayList arrayList = new ArrayList();
        v0.addAll(arrayList, iterable);
        v0.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> T lastOrNull(List<? extends T> list, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(list, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T tPrevious = listIterator.previous();
            if (((Boolean) predicate.invoke(tPrevious)).booleanValue()) {
                return tPrevious;
            }
        }
        return null;
    }

    public static <T, R> List<tu.v> zip(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q0.collectionSizeOrDefault(iterable, 10), q0.collectionSizeOrDefault(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(tu.e0.to(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final <T> List<T> minus(Iterable<? extends T> iterable, rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        List list = rv.f0.toList(elements);
        if (list.isEmpty()) {
            return toList(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t10 : iterable) {
            if (!list.contains(t10)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    public static <T> List<T> plus(Collection<? extends T> collection, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection2.size() + collection.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        v0.addAll(arrayList2, elements);
        return arrayList2;
    }

    public static final <T> List<T> plus(Iterable<? extends T> iterable, rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(iterable, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList();
        v0.addAll(arrayList, iterable);
        v0.addAll(arrayList, elements);
        return arrayList;
    }

    public static final <T> List<T> plus(Collection<? extends T> collection, rv.t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(collection, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        v0.addAll(arrayList, elements);
        return arrayList;
    }
}

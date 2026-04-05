package rv;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import p0.g2;
import p0.o2;
import rw.hIT.uQjDr;
import uu.b2;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class f0 extends d0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Iterable, lv.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f85009b;

        public a(t tVar) {
            this.f85009b = tVar;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return this.f85009b.iterator();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements kv.l {

        /* renamed from: b, reason: collision with root package name */
        public static final b f85010b = new b();

        @Override // kv.l
        public final Boolean invoke(Object obj) {
            kotlin.jvm.internal.e0.reifiedOperationMarker(3, "R");
            return Boolean.valueOf(Objects.nonNull(obj));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements uu.f1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ t f85011a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.l f85012b;

        public c(t tVar, kv.l lVar) {
            this.f85011a = tVar;
            this.f85012b = lVar;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [K, java.lang.Object] */
        @Override // uu.f1
        public K keyOf(T t10) {
            return this.f85012b.invoke(t10);
        }

        @Override // uu.f1
        public Iterator<T> sourceIterator() {
            return this.f85011a.iterator();
        }
    }

    public static final <T> boolean all(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        while (itW.hasNext()) {
            if (!((Boolean) lVar.invoke(itW.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean any(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        while (itW.hasNext()) {
            if (((Boolean) lVar.invoke(itW.next())).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public static <T> Iterable<T> asIterable(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return new a(tVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associate(t tVar, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            tu.v vVar = (tu.v) transform.invoke(it.next());
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K> Map<K, T> associateBy(t tVar, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tVar) {
            linkedHashMap.put(keySelector.invoke(obj), obj);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, M extends Map<? super K, ? super T>> M associateByTo(t tVar, M destination, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        for (Object obj : tVar) {
            destination.put(keySelector.invoke(obj), obj);
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateTo(t tVar, M destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            tu.v vVar = (tu.v) transform.invoke(it.next());
            destination.put(vVar.getFirst(), vVar.getSecond());
        }
        return destination;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> associateWith(t tVar, kv.l valueSelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueSelector, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tVar) {
            linkedHashMap.put(obj, valueSelector.invoke(obj));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V, M extends Map<? super K, ? super V>> M associateWithTo(t tVar, M destination, kv.l valueSelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueSelector, "valueSelector");
        for (Object obj : tVar) {
            destination.put(obj, valueSelector.invoke(obj));
        }
        return destination;
    }

    public static final double averageOfByte(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        double dByteValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dByteValue += ((Number) it.next()).byteValue();
            i10++;
            if (i10 < 0) {
                uu.p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dByteValue / i10;
    }

    public static final double averageOfDouble(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        double dDoubleValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
            i10++;
            if (i10 < 0) {
                uu.p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dDoubleValue / i10;
    }

    public static final double averageOfFloat(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        double dFloatValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dFloatValue += ((Number) it.next()).floatValue();
            i10++;
            if (i10 < 0) {
                uu.p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dFloatValue / i10;
    }

    public static final double averageOfInt(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        double dIntValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dIntValue += ((Number) it.next()).intValue();
            i10++;
            if (i10 < 0) {
                uu.p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dIntValue / i10;
    }

    public static final double averageOfLong(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        double dLongValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dLongValue += ((Number) it.next()).longValue();
            i10++;
            if (i10 < 0) {
                uu.p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dLongValue / i10;
    }

    public static final double averageOfShort(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        double dShortValue = 0.0d;
        int i10 = 0;
        while (it.hasNext()) {
            dShortValue += ((Number) it.next()).shortValue();
            i10++;
            if (i10 < 0) {
                uu.p0.throwCountOverflow();
            }
        }
        if (i10 == 0) {
            return Double.NaN;
        }
        return dShortValue / i10;
    }

    public static final <T> t chunked(t tVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return windowed(tVar, i10, i10, true);
    }

    public static <T> boolean contains(t tVar, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return indexOf(tVar, t10) >= 0;
    }

    public static final <T> int count(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        int i10 = 0;
        while (itW.hasNext()) {
            if (((Boolean) lVar.invoke(itW.next())).booleanValue() && (i10 = i10 + 1) < 0) {
                uu.p0.throwCountOverflow();
            }
        }
        return i10;
    }

    public static final <T> t distinct(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return distinctBy(tVar, new a1.o(0));
    }

    public static final <T, K> t distinctBy(t tVar, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        return new rv.c(tVar, selector);
    }

    public static <T> t drop(t tVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? tVar : tVar instanceof f ? ((f) tVar).drop(i10) : new e(tVar, i10);
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    public static final <T> t dropWhile(t tVar, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return new h(tVar, predicate);
    }

    public static final <T> T elementAt(t tVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return (T) elementAtOrElse(tVar, i10, new e0(i10, 0));
    }

    public static final <T> T elementAtOrElse(t tVar, int i10, kv.l defaultValue) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(defaultValue, "defaultValue");
        if (i10 < 0) {
            return (T) defaultValue.invoke(Integer.valueOf(i10));
        }
        Iterator<Object> it = tVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            T t10 = (T) it.next();
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return (T) defaultValue.invoke(Integer.valueOf(i10));
    }

    public static final <T> T elementAtOrNull(t tVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        if (i10 < 0) {
            return null;
        }
        Iterator<Object> it = tVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            T t10 = (T) it.next();
            int i12 = i11 + 1;
            if (i10 == i11) {
                return t10;
            }
            i11 = i12;
        }
        return null;
    }

    public static <T> t filter(t tVar, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return new k(tVar, true, predicate);
    }

    public static final <T> t filterIndexed(t tVar, kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return new f1(new k(new q(tVar), true, new g2(predicate, 9)), new f.j0(20));
    }

    public static final <T, C extends Collection<? super T>> C filterIndexedTo(t tVar, C destination, kv.p predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        int i10 = 0;
        for (Object obj : tVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            if (((Boolean) predicate.invoke(Integer.valueOf(i10), obj)).booleanValue()) {
                destination.add(obj);
            }
            i10 = i11;
        }
        return destination;
    }

    public static final /* synthetic */ <R> t filterIsInstance(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.needClassReification();
        t tVarFilter = filter(tVar, b.f85010b);
        kotlin.jvm.internal.e0.checkNotNull(tVarFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return tVarFilter;
    }

    public static final /* synthetic */ <R, C extends Collection<? super R>> C filterIsInstanceTo(t tVar, C destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        for (Object obj : tVar) {
            kotlin.jvm.internal.e0.reifiedOperationMarker(3, "R");
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static <T> t filterNot(t tVar, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return new k(tVar, false, predicate);
    }

    public static final <T> t filterNotNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        t tVarFilterNot = filterNot(tVar, new f.j0(21));
        kotlin.jvm.internal.e0.checkNotNull(tVarFilterNot, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return tVarFilterNot;
    }

    public static final <C extends Collection<? super T>, T> C filterNotNullTo(t tVar, C destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        for (Object obj : tVar) {
            if (obj != null) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterNotTo(t tVar, C destination, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (Object obj : tVar) {
            if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T, C extends Collection<? super T>> C filterTo(t tVar, C destination, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        for (Object obj : tVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                destination.add(obj);
            }
        }
        return destination;
    }

    public static final <T> T first(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        while (itW.hasNext()) {
            T t10 = (T) itW.next();
            if (((Boolean) lVar.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T firstOrNull(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        while (itW.hasNext()) {
            T t10 = (T) itW.next();
            if (((Boolean) lVar.invoke(t10)).booleanValue()) {
                return t10;
            }
        }
        return null;
    }

    public static final <T, R> t flatMap(t tVar, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return new m(tVar, transform, h0.f85022b);
    }

    public static final <T, R> t flatMapIndexedIterable(t tVar, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return y.flatMapIndexed(tVar, transform, i0.f85024b);
    }

    public static final <T, R> t flatMapIndexedSequence(t tVar, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return y.flatMapIndexed(tVar, transform, j0.f85029b);
    }

    public static final <T, R> t flatMapIterable(t tVar, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return new m(tVar, transform, g0.f85019b);
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapIterableTo(t tVar, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            uu.v0.addAll(destination, (Iterable) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C flatMapTo(t tVar, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            uu.v0.addAll(destination, (t) transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R> R fold(t tVar, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            r10 = (R) operation.invoke(r10, it.next());
        }
        return r10;
    }

    public static final <T, R> R foldIndexed(t tVar, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        int i10 = 0;
        for (Object obj : tVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            r10 = (R) operation.invoke(Integer.valueOf(i10), r10, obj);
            i10 = i11;
        }
        return r10;
    }

    public static final <T> void forEach(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "action");
        while (itW.hasNext()) {
            lVar.invoke(itW.next());
        }
    }

    public static final <T> void forEachIndexed(t tVar, kv.p action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        int i10 = 0;
        for (Object obj : tVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            action.invoke(Integer.valueOf(i10), obj);
            i10 = i11;
        }
    }

    public static final <T, K> Map<K, List<T>> groupBy(t tVar, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tVar) {
            Object objInvoke = keySelector.invoke(obj);
            Object objP = linkedHashMap.get(objInvoke);
            if (objP == null) {
                objP = e3.g.p(linkedHashMap, objInvoke);
            }
            ((List) objP).add(obj);
        }
        return linkedHashMap;
    }

    public static final <T, K, M extends Map<? super K, List<T>>> M groupByTo(t tVar, M destination, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        for (Object obj : tVar) {
            Object objInvoke = keySelector.invoke(obj);
            Object objV = destination.get(objInvoke);
            if (objV == null) {
                objV = o2.v(destination, objInvoke);
            }
            ((List) objV).add(obj);
        }
        return destination;
    }

    public static final <T, K> uu.f1 groupingBy(t tVar, kv.l keySelector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        return new c(tVar, keySelector);
    }

    public static final <T> int indexOf(t tVar, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        int i10 = 0;
        for (Object obj : tVar) {
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            if (kotlin.jvm.internal.e0.areEqual(t10, obj)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfFirst(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        int i10 = 0;
        while (itW.hasNext()) {
            Object next = itW.next();
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static final <T> int indexOfLast(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        int i10 = -1;
        int i11 = 0;
        while (itW.hasNext()) {
            Object next = itW.next();
            if (i11 < 0) {
                uu.p0.throwIndexOverflow();
            }
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    public static final <T, A extends Appendable> A joinTo(t tVar, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, kv.l lVar) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(buffer, "buffer");
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i11 = 0;
        for (Object obj : tVar) {
            i11++;
            if (i11 > 1) {
                buffer.append(separator);
            }
            if (i10 >= 0 && i11 > i10) {
                break;
            }
            sv.c0.appendElement(buffer, obj, lVar);
        }
        if (i10 >= 0 && i11 > i10) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final <T> String joinToString(t tVar, CharSequence separator, CharSequence prefix, CharSequence postfix, int i10, CharSequence truncated, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(separator, "separator");
        kotlin.jvm.internal.e0.checkNotNullParameter(prefix, "prefix");
        kotlin.jvm.internal.e0.checkNotNullParameter(postfix, "postfix");
        kotlin.jvm.internal.e0.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) joinTo(tVar, new StringBuilder(), separator, prefix, postfix, i10, truncated, lVar)).toString();
    }

    public static /* synthetic */ String joinToString$default(t tVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, kv.l lVar, int i11, Object obj) {
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
        return joinToString(tVar, charSequence, charSequence2, charSequence3, i10, charSequence5, lVar2);
    }

    public static final <T> T last(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        while (itW.hasNext()) {
            Object next = itW.next();
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                z10 = true;
                t10 = (T) next;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> int lastIndexOf(t tVar, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        int i10 = -1;
        int i11 = 0;
        for (Object obj : tVar) {
            if (i11 < 0) {
                uu.p0.throwIndexOverflow();
            }
            if (kotlin.jvm.internal.e0.areEqual(t10, obj)) {
                i10 = i11;
            }
            i11++;
        }
        return i10;
    }

    public static final <T> T lastOrNull(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        T t10 = null;
        while (itW.hasNext()) {
            Object next = itW.next();
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                t10 = (T) next;
            }
        }
        return t10;
    }

    public static <T, R> t map(t tVar, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return new f1(tVar, transform);
    }

    public static final <T, R> t mapIndexed(t tVar, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return new d1(tVar, transform);
    }

    public static final <T, R> t mapIndexedNotNull(t tVar, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return filterNotNull(new d1(tVar, transform));
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedNotNullTo(t tVar, C destination, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (Object obj : tVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            Object objInvoke = transform.invoke(Integer.valueOf(i10), obj);
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
            i10 = i11;
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapIndexedTo(t tVar, C destination, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        int i10 = 0;
        for (Object obj : tVar) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            destination.add(transform.invoke(Integer.valueOf(i10), obj));
            i10 = i11;
        }
        return destination;
    }

    public static <T, R> t mapNotNull(t tVar, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return filterNotNull(new f1(tVar, transform));
    }

    public static final <T, R, C extends Collection<? super R>> C mapNotNullTo(t tVar, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            Object objInvoke = transform.invoke(it.next());
            if (objInvoke != null) {
                destination.add(objInvoke);
            }
        }
        return destination;
    }

    public static final <T, R, C extends Collection<? super R>> C mapTo(t tVar, C destination, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            destination.add(transform.invoke(it.next()));
        }
        return destination;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrNull(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "selector");
        if (!itW.hasNext()) {
            return null;
        }
        T t10 = (T) itW.next();
        if (!itW.hasNext()) {
            return t10;
        }
        Comparable comparable = (Comparable) lVar.invoke(t10);
        do {
            Object next = itW.next();
            Comparable comparable2 = (Comparable) lVar.invoke(next);
            if (comparable.compareTo(comparable2) < 0) {
                t10 = (T) next;
                comparable = comparable2;
            }
        } while (itW.hasNext());
        return t10;
    }

    public static final <T, R extends Comparable<? super R>> T maxByOrThrow(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "selector");
        if (!itW.hasNext()) {
            throw new NoSuchElementException();
        }
        T t10 = (T) itW.next();
        if (!itW.hasNext()) {
            return t10;
        }
        Comparable comparable = (Comparable) lVar.invoke(t10);
        do {
            Object next = itW.next();
            Comparable comparable2 = (Comparable) lVar.invoke(next);
            if (comparable.compareTo(comparable2) < 0) {
                t10 = (T) next;
                comparable = comparable2;
            }
        } while (itW.hasNext());
        return t10;
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Double m6107maxOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double maxOrThrow(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.max(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    public static final <T> T maxWithOrNull(t tVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t10, next) < 0) {
                t10 = (T) next;
            }
        }
        return t10;
    }

    public static final <T> T maxWithOrThrow(t tVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t10 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t10, next) < 0) {
                t10 = (T) next;
            }
        }
        return t10;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrNull(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "selector");
        if (!itW.hasNext()) {
            return null;
        }
        T t10 = (T) itW.next();
        if (!itW.hasNext()) {
            return t10;
        }
        Comparable comparable = (Comparable) lVar.invoke(t10);
        do {
            Object next = itW.next();
            Comparable comparable2 = (Comparable) lVar.invoke(next);
            if (comparable.compareTo(comparable2) > 0) {
                t10 = (T) next;
                comparable = comparable2;
            }
        } while (itW.hasNext());
        return t10;
    }

    public static final <T, R extends Comparable<? super R>> T minByOrThrow(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "selector");
        if (!itW.hasNext()) {
            throw new NoSuchElementException();
        }
        T t10 = (T) itW.next();
        if (!itW.hasNext()) {
            return t10;
        }
        Comparable comparable = (Comparable) lVar.invoke(t10);
        do {
            Object next = itW.next();
            Comparable comparable2 = (Comparable) lVar.invoke(next);
            if (comparable.compareTo(comparable2) > 0) {
                t10 = (T) next;
                comparable = comparable2;
            }
        } while (itW.hasNext());
        return t10;
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Double m6111minOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return Double.valueOf(dDoubleValue);
    }

    public static final double minOrThrow(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        double dDoubleValue = ((Number) it.next()).doubleValue();
        while (it.hasNext()) {
            dDoubleValue = Math.min(dDoubleValue, ((Number) it.next()).doubleValue());
        }
        return dDoubleValue;
    }

    public static final <T> T minWithOrNull(t tVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t10, next) > 0) {
                t10 = (T) next;
            }
        }
        return t10;
    }

    public static final <T> T minWithOrThrow(t tVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        T t10 = (T) it.next();
        while (it.hasNext()) {
            Object next = it.next();
            if (comparator.compare(t10, next) > 0) {
                t10 = (T) next;
            }
        }
        return t10;
    }

    public static final <T> t minus(t tVar, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return new k0(tVar, t10);
    }

    public static final <T> boolean none(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        while (itW.hasNext()) {
            if (((Boolean) lVar.invoke(itW.next())).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> t onEach(t tVar, kv.l action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        return map(tVar, new b1.x(3, action));
    }

    public static final <T> t onEachIndexed(t tVar, kv.p action) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(action, "action");
        return mapIndexed(tVar, new gv.q(1, action));
    }

    public static final <T> tu.v partition(t tVar, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : tVar) {
            if (((Boolean) predicate.invoke(obj)).booleanValue()) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return new tu.v(arrayList, arrayList2);
    }

    public static final <T> t plus(t tVar, T t10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return y.flatten(y.sequenceOf((Object[]) new t[]{tVar, y.sequenceOf(t10)}));
    }

    public static final <S, T extends S> S reduce(t tVar, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S s10 = (S) it.next();
        while (it.hasNext()) {
            s10 = (S) operation.invoke(s10, it.next());
        }
        return s10;
    }

    public static final <S, T extends S> S reduceIndexed(t tVar, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            throw new UnsupportedOperationException("Empty sequence can't be reduced.");
        }
        S s10 = (S) it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            s10 = (S) operation.invoke(Integer.valueOf(i10), s10, it.next());
            i10 = i11;
        }
        return s10;
    }

    public static final <S, T extends S> S reduceOrNull(t tVar, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S s10 = (S) it.next();
        while (it.hasNext()) {
            s10 = (S) operation.invoke(s10, it.next());
        }
        return s10;
    }

    public static final <T> t requireNoNulls(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return map(tVar, new g2(tVar, 8));
    }

    public static <T, R> t runningFold(t tVar, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        return w.sequence(new p0(r10, tVar, operation, null));
    }

    public static final <T, R> t runningFoldIndexed(t tVar, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        return w.sequence(new q0(r10, tVar, operation, null));
    }

    public static final <S, T extends S> t runningReduce(t tVar, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        return w.sequence(new r0(tVar, operation, null));
    }

    public static final <S, T extends S> t runningReduceIndexed(t tVar, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        return w.sequence(new s0(tVar, operation, null));
    }

    public static final <T, R> t scan(t tVar, R r10, kv.p operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        return runningFold(tVar, r10, operation);
    }

    public static final <T, R> t scanIndexed(t tVar, R r10, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        return runningFoldIndexed(tVar, r10, operation);
    }

    public static final <T> T single(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        T t10 = null;
        boolean z10 = false;
        while (itW.hasNext()) {
            Object next = itW.next();
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                if (z10) {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
                z10 = true;
                t10 = (T) next;
            }
        }
        if (z10) {
            return t10;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    public static final <T> T singleOrNull(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "predicate");
        boolean z10 = false;
        T t10 = null;
        while (itW.hasNext()) {
            Object next = itW.next();
            if (((Boolean) lVar.invoke(next)).booleanValue()) {
                if (z10) {
                    return null;
                }
                z10 = true;
                t10 = (T) next;
            }
        }
        if (z10) {
            return t10;
        }
        return null;
    }

    public static final <T extends Comparable<? super T>> t sorted(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return new t0(tVar);
    }

    public static final <T, R extends Comparable<? super R>> t sortedBy(t tVar, kv.l selector) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(selector, "selector");
        return sortedWith(tVar, new xu.b(selector));
    }

    public static final <T extends Comparable<? super T>> t sortedDescending(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return sortedWith(tVar, xu.d.reverseOrder());
    }

    public static <T> t sortedWith(t tVar, Comparator<? super T> comparator) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(comparator, "comparator");
        return new u0(tVar, comparator);
    }

    @tu.f
    public static final <T> int sumBy(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "selector");
        int iIntValue = 0;
        while (itW.hasNext()) {
            iIntValue += ((Number) lVar.invoke(itW.next())).intValue();
        }
        return iIntValue;
    }

    @tu.f
    public static final <T> double sumByDouble(t tVar, kv.l lVar) {
        Iterator itW = o2.w(tVar, "<this>", lVar, "selector");
        double dDoubleValue = 0.0d;
        while (itW.hasNext()) {
            dDoubleValue += ((Number) lVar.invoke(itW.next())).doubleValue();
        }
        return dDoubleValue;
    }

    public static final int sumOfByte(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        int iByteValue = 0;
        while (it.hasNext()) {
            iByteValue += ((Number) it.next()).byteValue();
        }
        return iByteValue;
    }

    public static final double sumOfDouble(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        double dDoubleValue = 0.0d;
        while (it.hasNext()) {
            dDoubleValue += ((Number) it.next()).doubleValue();
        }
        return dDoubleValue;
    }

    public static final float sumOfFloat(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += ((Number) it.next()).floatValue();
        }
        return fFloatValue;
    }

    public static final int sumOfInt(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static long sumOfLong(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        long jLongValue = 0;
        while (it.hasNext()) {
            jLongValue += ((Number) it.next()).longValue();
        }
        return jLongValue;
    }

    public static final int sumOfShort(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        int iShortValue = 0;
        while (it.hasNext()) {
            iShortValue += ((Number) it.next()).shortValue();
        }
        return iShortValue;
    }

    public static <T> t take(t tVar, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        if (i10 >= 0) {
            return i10 == 0 ? y.emptySequence() : tVar instanceof f ? ((f) tVar).take(i10) : new z0(tVar, i10);
        }
        throw new IllegalArgumentException(o2.k(i10, "Requested element count ", " is less than zero.").toString());
    }

    public static <T> t takeWhile(t tVar, kv.l predicate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(predicate, "predicate");
        return new b1(tVar, predicate);
    }

    public static final <T, C extends Collection<? super T>> C toCollection(t tVar, C destination) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            destination.add(it.next());
        }
        return destination;
    }

    public static final <T> HashSet<T> toHashSet(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return (HashSet) toCollection(tVar, new HashSet());
    }

    public static <T> List<T> toList(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return uu.p0.emptyList();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return uu.o0.listOf(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static final <T> List<T> toMutableList(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return (List) toCollection(tVar, new ArrayList());
    }

    public static final <T> Set<T> toMutableSet(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Object> it = tVar.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> toSet(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return c2.emptySet();
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return b2.setOf(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static final <T> t windowed(t tVar, int i10, int i11, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return uu.g2.windowedSequence(tVar, i10, i11, z10, false);
    }

    public static /* synthetic */ t windowed$default(t tVar, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(tVar, i10, i11, z10);
    }

    public static final <T> t withIndex(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return new q(tVar);
    }

    public static final <T, R> t zip(t tVar, t other) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        return new s(tVar, other, new a1.n(11));
    }

    public static final <T> t zipWithNext(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return zipWithNext(tVar, new a1.n(12));
    }

    public static final <T, R> t chunked(t tVar, int i10, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return windowed(tVar, i10, i10, true, transform);
    }

    public static final <T> t minus(t tVar, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return elements.length == 0 ? tVar : new l0(tVar, elements);
    }

    public static final <T> t plus(t tVar, T[] elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return plus(tVar, (Iterable) uu.f0.asList(elements));
    }

    public static final <S, T extends S> S reduceIndexedOrNull(t tVar, kv.q operation) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, uQjDr.cUn);
        kotlin.jvm.internal.e0.checkNotNullParameter(operation, "operation");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        S s10 = (S) it.next();
        int i10 = 1;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            s10 = (S) operation.invoke(Integer.valueOf(i10), s10, it.next());
            i10 = i11;
        }
        return s10;
    }

    public static final <T, R extends Comparable<? super R>> t sortedByDescending(t tVar, kv.l lVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(lVar, LJjmO.xniJZpw);
        return sortedWith(tVar, new xu.c(lVar));
    }

    public static final <T, R> t windowed(t tVar, int i10, int i11, boolean z10, kv.l transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return map(uu.g2.windowedSequence(tVar, i10, i11, z10, true), transform);
    }

    public static /* synthetic */ t windowed$default(t tVar, int i10, int i11, boolean z10, kv.l lVar, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 1;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        return windowed(tVar, i10, i11, z10, lVar);
    }

    public static final <T, R, V> t zip(t tVar, t other, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return new s(tVar, other, transform);
    }

    public static final <T, R> t zipWithNext(t tVar, kv.p transform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(transform, "transform");
        return w.sequence(new v0(tVar, transform, null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M associateByTo(t tVar, M destination, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        for (Object obj : tVar) {
            destination.put(keySelector.invoke(obj), valueTransform.invoke(obj));
        }
        return destination;
    }

    public static final <T> t plus(t tVar, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return y.flatten(y.sequenceOf((Object[]) new t[]{tVar, uu.y0.asSequence(elements)}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T, K, V> Map<K, V> associateBy(t tVar, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tVar) {
            linkedHashMap.put(keySelector.invoke(obj), valueTransform.invoke(obj));
        }
        return linkedHashMap;
    }

    public static final <T> t minus(t tVar, Iterable<? extends T> elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return new m0(elements, tVar);
    }

    public static final <T> t plus(t tVar, t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return y.flatten(y.sequenceOf((Object[]) new t[]{tVar, elements}));
    }

    public static final <T> t minus(t tVar, t elements) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(elements, "elements");
        return new o0(elements, tVar);
    }

    public static final <T> boolean any(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return tVar.iterator().hasNext();
    }

    public static <T> int count(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            it.next();
            i10++;
            if (i10 < 0) {
                uu.p0.throwCountOverflow();
            }
        }
        return i10;
    }

    public static <T> T firstOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        return null;
    }

    public static final <T> boolean none(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        return !tVar.iterator().hasNext();
    }

    public static final <T> T first(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (it.hasNext()) {
            return (T) it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final <T> T lastOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (T) it.next();
        while (it.hasNext()) {
            t10 = (T) it.next();
        }
        return t10;
    }

    public static final <T> T singleOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (T) it.next();
        if (it.hasNext()) {
            return null;
        }
        return t10;
    }

    public static <T> T last(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (it.hasNext()) {
            T t10 = (T) it.next();
            while (it.hasNext()) {
                t10 = (T) it.next();
            }
            return t10;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: maxOrNull, reason: collision with other method in class */
    public static final Float m6108maxOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final float m6109maxOrThrow(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: minOrNull, reason: collision with other method in class */
    public static final Float m6112minOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final float m6113minOrThrow(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
            }
            return fFloatValue;
        }
        throw new NoSuchElementException();
    }

    public static final <T> T single(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (it.hasNext()) {
            T t10 = (T) it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Sequence has more than one element.");
            }
            return t10;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static final <T, K, V, M extends Map<? super K, List<V>>> M groupByTo(t tVar, M destination, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(destination, "destination");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        for (Object obj : tVar) {
            Object objInvoke = keySelector.invoke(obj);
            Object objV = destination.get(objInvoke);
            if (objV == null) {
                objV = o2.v(destination, objInvoke);
            }
            ((List) objV).add(valueTransform.invoke(obj));
        }
        return destination;
    }

    public static final <T, K, V> Map<K, List<V>> groupBy(t tVar, kv.l keySelector, kv.l valueTransform) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(keySelector, "keySelector");
        kotlin.jvm.internal.e0.checkNotNullParameter(valueTransform, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : tVar) {
            Object objInvoke = keySelector.invoke(obj);
            Object objP = linkedHashMap.get(objInvoke);
            if (objP == null) {
                objP = e3.g.p(linkedHashMap, objInvoke);
            }
            ((List) objP).add(valueTransform.invoke(obj));
        }
        return linkedHashMap;
    }

    public static <T extends Comparable<? super T>> T maxOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (T) it.next();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            if (t10.compareTo(comparable) < 0) {
                t10 = (T) comparable;
            }
        }
        return t10;
    }

    /* renamed from: maxOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m6110maxOrThrow(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (it.hasNext()) {
            T t10 = (T) it.next();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) it.next();
                if (t10.compareTo(comparable) < 0) {
                    t10 = (T) comparable;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }

    public static final <T extends Comparable<? super T>> T minOrNull(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t10 = (T) it.next();
        while (it.hasNext()) {
            Comparable comparable = (Comparable) it.next();
            if (t10.compareTo(comparable) > 0) {
                t10 = (T) comparable;
            }
        }
        return t10;
    }

    /* renamed from: minOrThrow, reason: collision with other method in class */
    public static final <T extends Comparable<? super T>> T m6114minOrThrow(t tVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(tVar, "<this>");
        Iterator<Object> it = tVar.iterator();
        if (it.hasNext()) {
            T t10 = (T) it.next();
            while (it.hasNext()) {
                Comparable comparable = (Comparable) it.next();
                if (t10.compareTo(comparable) > 0) {
                    t10 = (T) comparable;
                }
            }
            return t10;
        }
        throw new NoSuchElementException();
    }
}

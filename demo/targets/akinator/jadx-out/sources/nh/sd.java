package nh;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Stream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class sd {
    public static Collection a(Collection collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    public static <K, V> Map<K, List<V>> asMap(c8 c8Var) {
        return (Map<K, List<V>>) c8Var.asMap();
    }

    public static <K, V> fc filterEntries(fc fcVar, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        if (fcVar instanceof sf) {
            return filterEntries((sf) fcVar, q1Var);
        }
        if (!(fcVar instanceof w3)) {
            return new n3((fc) mh.p1.checkNotNull(fcVar), q1Var);
        }
        w3 w3Var = (w3) fcVar;
        return new n3(w3Var.unfiltered(), mh.g2.and(w3Var.entryPredicate(), q1Var));
    }

    public static <K, V> fc filterKeys(fc fcVar, mh.q1 q1Var) {
        if (fcVar instanceof sf) {
            return filterKeys((sf) fcVar, q1Var);
        }
        if (fcVar instanceof c8) {
            return filterKeys((c8) fcVar, q1Var);
        }
        if (fcVar instanceof t3) {
            t3 t3Var = (t3) fcVar;
            return new t3(t3Var.f76652h, mh.g2.and(t3Var.f76653i, q1Var));
        }
        if (!(fcVar instanceof w3)) {
            return new t3(fcVar, q1Var);
        }
        w3 w3Var = (w3) fcVar;
        return new n3(w3Var.unfiltered(), mh.g2.and(w3Var.entryPredicate(), mh.g2.compose(q1Var, wa.f76739b)));
    }

    public static <K, V> fc filterValues(fc fcVar, mh.q1 q1Var) {
        return filterEntries(fcVar, mh.g2.compose(q1Var, wa.f76740c));
    }

    public static <T, K, V, M extends fc> Collector<T, ?, M> flatteningToMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends Stream<? extends V>> function2, Supplier<M> supplier) {
        return i1.a(function, function2, supplier);
    }

    public static <K, V> sf forMap(Map<K, V> map) {
        return new kd(map);
    }

    public static <K, V> d5 index(Iterable<V> iterable, mh.v0 v0Var) {
        return index(iterable.iterator(), v0Var);
    }

    public static <K, V, M extends fc> M invertFrom(fc fcVar, M m9) {
        mh.p1.checkNotNull(m9);
        for (Map.Entry<Object, Object> entry : fcVar.entries()) {
            m9.put(entry.getValue(), entry.getKey());
        }
        return m9;
    }

    public static <K, V> c8 newListMultimap(Map<K, Collection<V>> map, mh.v2 v2Var) {
        bd bdVar = new bd(map);
        bdVar.f76131j = (mh.v2) mh.p1.checkNotNull(v2Var);
        return bdVar;
    }

    public static <K, V> fc newMultimap(Map<K, Collection<V>> map, mh.v2 v2Var) {
        cd cdVar = new cd(map);
        cdVar.f76156j = (mh.v2) mh.p1.checkNotNull(v2Var);
        return cdVar;
    }

    public static <K, V> sf newSetMultimap(Map<K, Collection<V>> map, mh.v2 v2Var) {
        dd ddVar = new dd(map);
        ddVar.f76187j = (mh.v2) mh.p1.checkNotNull(v2Var);
        return ddVar;
    }

    public static <K, V> gh newSortedSetMultimap(Map<K, Collection<V>> map, mh.v2 v2Var) {
        ed edVar = new ed(map);
        edVar.f76222j = (mh.v2) mh.p1.checkNotNull(v2Var);
        edVar.f76223k = ((SortedSet) v2Var.get()).comparator();
        return edVar;
    }

    public static <K, V> c8 synchronizedListMultimap(c8 c8Var) {
        return ((c8Var instanceof hi) || (c8Var instanceof p0)) ? c8Var : new hi(c8Var, null);
    }

    public static <K, V> fc synchronizedMultimap(fc fcVar) {
        return ((fcVar instanceof ji) || (fcVar instanceof p0)) ? fcVar : new ji(fcVar, null);
    }

    public static <K, V> sf synchronizedSetMultimap(sf sfVar) {
        return ((sfVar instanceof qi) || (sfVar instanceof p0)) ? sfVar : new qi(sfVar, null);
    }

    public static <K, V> gh synchronizedSortedSetMultimap(gh ghVar) {
        return ghVar instanceof ti ? ghVar : new ti(ghVar, null);
    }

    public static <T, K, V, M extends fc> Collector<T, ?, M> toMultimap(Function<? super T, ? extends K> function, Function<? super T, ? extends V> function2, Supplier<M> supplier) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(function2);
        mh.p1.checkNotNull(supplier);
        return Collector.of(supplier, new z0(function, function2, 7), new y0(11), new Collector.Characteristics[0]);
    }

    public static <K, V1, V2> fc transformEntries(fc fcVar, ya yaVar) {
        return new nd(fcVar, yaVar);
    }

    public static <K, V1, V2> fc transformValues(fc fcVar, mh.v0 v0Var) {
        mh.p1.checkNotNull(v0Var);
        return transformEntries(fcVar, new ga(v0Var, 4));
    }

    public static <K, V> c8 unmodifiableListMultimap(c8 c8Var) {
        return ((c8Var instanceof od) || (c8Var instanceof d5)) ? c8Var : new od(c8Var);
    }

    public static <K, V> fc unmodifiableMultimap(fc fcVar) {
        return ((fcVar instanceof pd) || (fcVar instanceof y5)) ? fcVar : new pd(fcVar);
    }

    public static <K, V> sf unmodifiableSetMultimap(sf sfVar) {
        return ((sfVar instanceof qd) || (sfVar instanceof o6)) ? sfVar : new qd(sfVar);
    }

    public static <K, V> gh unmodifiableSortedSetMultimap(gh ghVar) {
        return ghVar instanceof rd ? ghVar : new rd(ghVar);
    }

    public static <K, V> Map<K, Set<V>> asMap(sf sfVar) {
        return (Map<K, Set<V>>) sfVar.asMap();
    }

    public static <K, V> d5 index(Iterator<V> it, mh.v0 v0Var) {
        mh.p1.checkNotNull(v0Var);
        c5 c5VarBuilder = d5.builder();
        while (it.hasNext()) {
            V next = it.next();
            mh.p1.checkNotNull(next, it);
            c5VarBuilder.put(v0Var.apply(next), (Object) next);
        }
        return c5VarBuilder.build();
    }

    public static <K, V1, V2> c8 transformEntries(c8 c8Var, ya yaVar) {
        return new md(c8Var, yaVar);
    }

    public static <K, V> Map<K, SortedSet<V>> asMap(gh ghVar) {
        return (Map<K, SortedSet<V>>) ghVar.asMap();
    }

    public static <K, V> sf filterValues(sf sfVar, mh.q1 q1Var) {
        return filterEntries(sfVar, mh.g2.compose(q1Var, wa.f76740c));
    }

    @Deprecated
    public static <K, V> fc unmodifiableMultimap(y5 y5Var) {
        return (fc) mh.p1.checkNotNull(y5Var);
    }

    public static <K, V> Map<K, Collection<V>> asMap(fc fcVar) {
        return (Map<K, Collection<V>>) fcVar.asMap();
    }

    public static <K, V1, V2> c8 transformValues(c8 c8Var, mh.v0 v0Var) {
        mh.p1.checkNotNull(v0Var);
        return transformEntries(c8Var, (ya) new ga(v0Var, 3));
    }

    @Deprecated
    public static <K, V> c8 unmodifiableListMultimap(d5 d5Var) {
        return (c8) mh.p1.checkNotNull(d5Var);
    }

    @Deprecated
    public static <K, V> sf unmodifiableSetMultimap(o6 o6Var) {
        return (sf) mh.p1.checkNotNull(o6Var);
    }

    public static <K, V> sf filterEntries(sf sfVar, mh.q1 q1Var) {
        mh.p1.checkNotNull(q1Var);
        if (sfVar instanceof y3) {
            y3 y3Var = (y3) sfVar;
            return new o3(y3Var.unfiltered(), mh.g2.and(y3Var.entryPredicate(), q1Var));
        }
        return new o3((sf) mh.p1.checkNotNull(sfVar), q1Var);
    }

    public static <K, V> sf filterKeys(sf sfVar, mh.q1 q1Var) {
        if (sfVar instanceof v3) {
            v3 v3Var = (v3) sfVar;
            return new v3(v3Var.unfiltered(), mh.g2.and(v3Var.f76653i, q1Var));
        }
        if (sfVar instanceof y3) {
            y3 y3Var = (y3) sfVar;
            return new o3(y3Var.unfiltered(), mh.g2.and(y3Var.entryPredicate(), mh.g2.compose(q1Var, wa.f76739b)));
        }
        return new v3(sfVar, q1Var);
    }

    public static <K, V> c8 filterKeys(c8 c8Var, mh.q1 q1Var) {
        if (c8Var instanceof p3) {
            p3 p3Var = (p3) c8Var;
            return new p3(p3Var.unfiltered(), mh.g2.and(p3Var.f76653i, q1Var));
        }
        return new p3(c8Var, q1Var);
    }
}

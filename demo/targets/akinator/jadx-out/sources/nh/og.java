package nh;

import io.ktor.http.ContentDisposition;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class og {
    public static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static int b(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static boolean c(Set set, Collection collection) {
        mh.p1.checkNotNull(collection);
        if (collection instanceof ud) {
            collection = ((ud) collection).elementSet();
        }
        if ((collection instanceof Set) && collection.size() > set.size()) {
            return z7.removeAll(set.iterator(), collection);
        }
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, int i10) {
        m5 m5VarF = ec.f(set);
        jh.i.o(i10, ContentDisposition.Parameters.Size);
        mh.p1.checkArgument(i10 <= m5VarF.size(), "size (%s) must be <= set.size() (%s)", i10, m5VarF.size());
        return i10 == 0 ? l6.of(l6.of()) : i10 == m5VarF.size() ? l6.of(m5VarF.keySet()) : new cg(i10, m5VarF);
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        mh.p1.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        EnumSet<E> enumSetAllOf = EnumSet.allOf(collection.iterator().next().getDeclaringClass());
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <E> kg difference(Set<E> set, Set<?> set2) {
        mh.p1.checkNotNull(set, "set1");
        mh.p1.checkNotNull(set2, "set2");
        return new xf(set, set2);
    }

    public static <E> Set<E> filter(Set<E> set, mh.q1 q1Var) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, q1Var);
        }
        if (!(set instanceof gg)) {
            return new gg((Set) mh.p1.checkNotNull(set), (mh.q1) mh.p1.checkNotNull(q1Var));
        }
        gg ggVar = (gg) set;
        return new gg((Set) ggVar.f76617b, mh.g2.and(ggVar.f76618c, q1Var));
    }

    public static <E extends Enum<E>> l6 immutableEnumSet(E e10, E... eArr) {
        return w4.j(EnumSet.of((Enum) e10, (Enum[]) eArr));
    }

    public static <E> kg intersection(Set<E> set, Set<?> set2) {
        mh.p1.checkNotNull(set, "set1");
        mh.p1.checkNotNull(set2, "set2");
        return new wf(set, set2);
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        i7.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i10) {
        return new HashSet<>(ec.c(i10));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(ec.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i10) {
        return new LinkedHashSet<>(ec.c(i10));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new jg(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, ze zeVar) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != we.natural() && zeVar.hasLowerBound() && zeVar.hasUpperBound()) {
            mh.p1.checkArgument(navigableSet.comparator().compare(zeVar.lowerEndpoint(), zeVar.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        boolean zHasLowerBound = zeVar.hasLowerBound();
        r0 r0Var = r0.f76592c;
        if (zHasLowerBound && zeVar.hasUpperBound()) {
            return navigableSet.subSet(zeVar.lowerEndpoint(), zeVar.lowerBoundType() == r0Var, zeVar.upperEndpoint(), zeVar.upperBoundType() == r0Var);
        }
        if (zeVar.hasLowerBound()) {
            return navigableSet.tailSet(zeVar.lowerEndpoint(), zeVar.lowerBoundType() == r0Var);
        }
        if (zeVar.hasUpperBound()) {
            return navigableSet.headSet(zeVar.upperEndpoint(), zeVar.upperBoundType() == r0Var);
        }
        return (NavigableSet) mh.p1.checkNotNull(navigableSet);
    }

    public static <E> kg symmetricDifference(Set<? extends E> set, Set<? extends E> set2) {
        mh.p1.checkNotNull(set, "set1");
        mh.p1.checkNotNull(set2, "set2");
        return new zf(set, set2);
    }

    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return new mi(navigableSet, null);
    }

    public static <E extends Enum<E>> Collector<E, ?, l6> toImmutableEnumSet() {
        Collector collector = i1.f76343a;
        return h1.f76313b;
    }

    public static <E> kg union(Set<? extends E> set, Set<? extends E> set2) {
        mh.p1.checkNotNull(set, "set1");
        mh.p1.checkNotNull(set2, "set2");
        return new uf(set, set2);
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof u4) || (navigableSet instanceof ng)) ? navigableSet : new ng(navigableSet);
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        x4 x4Var = new x4(list.size());
        Iterator<? extends Set<? extends B>> it = list.iterator();
        while (it.hasNext()) {
            l6 l6VarCopyOf = l6.copyOf((Collection) it.next());
            if (l6VarCopyOf.isEmpty()) {
                return l6.of();
            }
            x4Var.add((Object) l6VarCopyOf);
        }
        b5 b5VarBuild = x4Var.build();
        return new eg(b5VarBuild, new u0(new dg(b5VarBuild)));
    }

    public static <E extends Enum<E>> l6 immutableEnumSet(Iterable<E> iterable) {
        if (iterable instanceof w4) {
            return (w4) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? l6.of() : w4.j(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return l6.of();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        z7.addAll(enumSetOf, it);
        return w4.j(enumSetOf);
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
        Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        i7.addAll(setNewConcurrentHashSet, iterable);
        return setNewConcurrentHashSet;
    }

    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? (Collection) iterable : p8.newArrayList(iterable));
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(hashSetNewHashSetWithExpectedSize, eArr);
        return hashSetNewHashSetWithExpectedSize;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> linkedHashSet = new LinkedHashSet<>();
        i7.addAll(linkedHashSet, iterable);
        return linkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> treeSetNewTreeSet = newTreeSet();
        i7.addAll(treeSetNewTreeSet, iterable);
        return treeSetNewTreeSet;
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        return newHashSet(iterable.iterator());
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) mh.p1.checkNotNull(comparator));
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> hashSet = new HashSet<>();
        z7.addAll(hashSet, it);
        return hashSet;
    }

    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        mh.p1.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        EnumSet<E> enumSetAllOf = EnumSet.allOf(cls);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, mh.q1 q1Var) {
        if (sortedSet instanceof gg) {
            gg ggVar = (gg) sortedSet;
            return new hg((SortedSet) ggVar.f76617b, mh.g2.and(ggVar.f76618c, q1Var));
        }
        return new hg((SortedSet) mh.p1.checkNotNull(sortedSet), (mh.q1) mh.p1.checkNotNull(q1Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, mh.q1 q1Var) {
        if (navigableSet instanceof gg) {
            gg ggVar = (gg) navigableSet;
            return new fg((NavigableSet) ggVar.f76617b, mh.g2.and(ggVar.f76618c, q1Var));
        }
        return new fg((NavigableSet) mh.p1.checkNotNull(navigableSet), (mh.q1) mh.p1.checkNotNull(q1Var));
    }
}

package nh;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class le {
    public static boolean a(ud udVar, Object obj) {
        if (obj == udVar) {
            return true;
        }
        if (!(obj instanceof ud)) {
            return false;
        }
        ud udVar2 = (ud) obj;
        if (udVar.size() != udVar2.size() || udVar.entrySet().size() != udVar2.entrySet().size()) {
            return false;
        }
        for (td tdVar : udVar2.entrySet()) {
            if (udVar.count(tdVar.getElement()) != tdVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static boolean containsOccurrences(ud udVar, ud udVar2) {
        mh.p1.checkNotNull(udVar);
        mh.p1.checkNotNull(udVar2);
        for (td tdVar : udVar2.entrySet()) {
            if (udVar.count(tdVar.getElement()) < tdVar.getCount()) {
                return false;
            }
        }
        return true;
    }

    public static <E> d6 copyHighestCountFirst(ud udVar) {
        td[] tdVarArr = (td[]) udVar.entrySet().toArray(new td[0]);
        Arrays.sort(tdVarArr, ce.f76157b);
        return d6.g(Arrays.asList(tdVarArr));
    }

    public static <E> ud difference(ud udVar, ud udVar2) {
        mh.p1.checkNotNull(udVar);
        mh.p1.checkNotNull(udVar2);
        return new ae(udVar, udVar2);
    }

    public static <E> ud filter(ud udVar, mh.q1 q1Var) {
        if (!(udVar instanceof ge)) {
            return new ge(udVar, q1Var);
        }
        ge geVar = (ge) udVar;
        return new ge(geVar.f76302e, mh.g2.and(geVar.f76303f, q1Var));
    }

    public static <E> td immutableEntry(E e10, int i10) {
        return new he(e10, i10);
    }

    public static <E> ud intersection(ud udVar, ud udVar2) {
        mh.p1.checkNotNull(udVar);
        mh.p1.checkNotNull(udVar2);
        return new yd(udVar, udVar2);
    }

    public static boolean removeOccurrences(ud udVar, Iterable<?> iterable) {
        if (iterable instanceof ud) {
            return removeOccurrences(udVar, (ud) iterable);
        }
        mh.p1.checkNotNull(udVar);
        mh.p1.checkNotNull(iterable);
        Iterator<?> it = iterable.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= udVar.remove(it.next());
        }
        return zRemove;
    }

    public static boolean retainOccurrences(ud udVar, ud udVar2) {
        mh.p1.checkNotNull(udVar);
        mh.p1.checkNotNull(udVar2);
        Iterator<td> it = udVar.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            td next = it.next();
            int iCount = udVar2.count(next.getElement());
            if (iCount == 0) {
                it.remove();
            } else if (iCount < next.getCount()) {
                udVar.setCount(next.getElement(), iCount);
            }
            z10 = true;
        }
        return z10;
    }

    public static <E> ud sum(ud udVar, ud udVar2) {
        mh.p1.checkNotNull(udVar);
        mh.p1.checkNotNull(udVar2);
        return new zd(udVar, udVar2);
    }

    public static <T, E, M extends ud> Collector<T, ?, M> toMultiset(Function<? super T, E> function, ToIntFunction<? super T> toIntFunction, Supplier<M> supplier) {
        Collector collector = i1.f76343a;
        mh.p1.checkNotNull(function);
        mh.p1.checkNotNull(toIntFunction);
        mh.p1.checkNotNull(supplier);
        return Collector.of(supplier, new c1(1, function, toIntFunction), new y0(10), new Collector.Characteristics[0]);
    }

    public static <E> ud union(ud udVar, ud udVar2) {
        mh.p1.checkNotNull(udVar);
        mh.p1.checkNotNull(udVar2);
        return new wd(udVar, udVar2);
    }

    public static <E> ud unmodifiableMultiset(ud udVar) {
        return ((udVar instanceof je) || (udVar instanceof d6)) ? udVar : new je((ud) mh.p1.checkNotNull(udVar));
    }

    public static <E> eh unmodifiableSortedMultiset(eh ehVar) {
        return new gj((eh) mh.p1.checkNotNull(ehVar));
    }

    @Deprecated
    public static <E> ud unmodifiableMultiset(d6 d6Var) {
        return (ud) mh.p1.checkNotNull(d6Var);
    }

    public static boolean removeOccurrences(ud udVar, ud udVar2) {
        mh.p1.checkNotNull(udVar);
        mh.p1.checkNotNull(udVar2);
        Iterator<td> it = udVar.entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            td next = it.next();
            int iCount = udVar2.count(next.getElement());
            if (iCount >= next.getCount()) {
                it.remove();
            } else if (iCount > 0) {
                udVar.remove(next.getElement(), iCount);
            }
            z10 = true;
        }
        return z10;
    }
}

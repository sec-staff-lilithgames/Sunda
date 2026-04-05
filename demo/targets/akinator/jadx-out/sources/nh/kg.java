package nh;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class kg extends AbstractSet {
    public static int d(Set set) {
        return set instanceof kg ? ((kg) set).c() : set.size();
    }

    public static int f(Set set) {
        return set instanceof kg ? ((kg) set).e() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    public abstract int c();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public <S extends Set<Object>> S copyInto(S s10) {
        s10.addAll(this);
        return s10;
    }

    public abstract int e();

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        Set set;
        int iD;
        int iF;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || e() > (iD = d((set = (Set) obj))) || c() < (iF = f(set))) {
            return false;
        }
        ej it = iterator();
        int i10 = 0;
        while (it.hasNext()) {
            try {
                if (!set.contains(it.next())) {
                    return false;
                }
                i10++;
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
        if (i10 == iD) {
            return true;
        }
        if (i10 < iF) {
            return false;
        }
        Iterator it2 = set.iterator();
        int i11 = 0;
        while (it2.hasNext()) {
            it2.next();
            i11++;
            if (i11 > i10) {
                return false;
            }
        }
        return true;
    }

    public l6 immutableCopy() {
        int iC = c();
        if (iC == 0) {
            return l6.of();
        }
        k6 k6VarBuilderWithExpectedSize = l6.builderWithExpectedSize(iC);
        ej it = iterator();
        while (it.hasNext()) {
            k6VarBuilderWithExpectedSize.add(mh.p1.checkNotNull(it.next()));
        }
        return k6VarBuilderWithExpectedSize.build();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public abstract ej iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }
}

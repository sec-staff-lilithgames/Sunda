package rh;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p extends AbstractList implements RandomAccess, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final s f84383b;

    public p(s sVar) {
        this.f84383b = sVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        boolean z10 = obj instanceof p;
        s sVar = this.f84383b;
        if (z10) {
            return sVar.equals(((p) obj).f84383b);
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        if (size() != list.size()) {
            return false;
        }
        int i10 = sVar.f84389c;
        for (Object obj2 : list) {
            if (obj2 instanceof Integer) {
                int i11 = i10 + 1;
                if (sVar.f84388b[i10] == ((Integer) obj2).intValue()) {
                    i10 = i11;
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.f84383b.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return this.f84383b.indexOf(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        return this.f84383b.lastIndexOf(((Integer) obj).intValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f84383b.length();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Spliterator<Integer> spliterator() {
        s sVar = this.f84383b;
        return Spliterators.spliterator(sVar.f84388b, sVar.f84389c, sVar.f84390e, IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION);
    }

    @Override // java.util.AbstractList, java.util.List
    public List<Integer> subList(int i10, int i11) {
        return this.f84383b.subArray(i10, i11).asList();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f84383b.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i10) {
        return Integer.valueOf(this.f84383b.get(i10));
    }
}

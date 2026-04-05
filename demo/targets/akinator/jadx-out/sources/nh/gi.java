package nh;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class gi extends ei implements List {
    @Override // java.util.List
    public void add(int i10, Object obj) {
        synchronized (this.f76516c) {
            c().add(i10, obj);
        }
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection<Object> collection) {
        boolean zAddAll;
        synchronized (this.f76516c) {
            zAddAll = c().addAll(i10, collection);
        }
        return zAddAll;
    }

    @Override // nh.ei
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final List c() {
        return (List) ((Collection) this.f76515b);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f76516c) {
            zEquals = c().equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.List
    public Object get(int i10) {
        Object obj;
        synchronized (this.f76516c) {
            obj = c().get(i10);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int iHashCode;
        synchronized (this.f76516c) {
            iHashCode = c().hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f76516c) {
            iIndexOf = c().indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f76516c) {
            iLastIndexOf = c().lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator() {
        return c().listIterator();
    }

    @Override // java.util.List
    public Object remove(int i10) {
        Object objRemove;
        synchronized (this.f76516c) {
            objRemove = c().remove(i10);
        }
        return objRemove;
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        Object obj2;
        synchronized (this.f76516c) {
            obj2 = c().set(i10, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public List<Object> subList(int i10, int i11) {
        gi giVarJ;
        synchronized (this.f76516c) {
            giVarJ = jh.i.J(c().subList(i10, i11), this.f76516c);
        }
        return giVarJ;
    }

    @Override // java.util.List
    public ListIterator<Object> listIterator(int i10) {
        return c().listIterator(i10);
    }
}

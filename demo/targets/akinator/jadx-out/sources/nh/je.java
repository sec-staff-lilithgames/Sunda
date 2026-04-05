package nh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class je extends j4 implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final ud f76399b;

    /* renamed from: c, reason: collision with root package name */
    public transient Set f76400c;

    /* renamed from: e, reason: collision with root package name */
    public transient Set f76401e;

    public je(ud udVar) {
        this.f76399b = udVar;
    }

    @Override // nh.e4, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e4, java.util.Collection
    public boolean addAll(Collection<Object> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e4, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // nh.j4
    /* renamed from: d */
    public ud delegate() {
        return this.f76399b;
    }

    public Set e() {
        return Collections.unmodifiableSet(this.f76399b.elementSet());
    }

    @Override // nh.j4, nh.ud
    public Set<Object> elementSet() {
        Set<Object> set = this.f76400c;
        if (set != null) {
            return set;
        }
        Set<Object> setE = e();
        this.f76400c = setE;
        return setE;
    }

    @Override // nh.j4, nh.ud
    public Set<td> entrySet() {
        Set<td> set = this.f76401e;
        if (set != null) {
            return set;
        }
        Set<td> setUnmodifiableSet = Collections.unmodifiableSet(this.f76399b.entrySet());
        this.f76401e = setUnmodifiableSet;
        return setUnmodifiableSet;
    }

    @Override // nh.e4, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return z7.unmodifiableIterator(this.f76399b.iterator());
    }

    @Override // nh.e4, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e4, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.e4, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.j4, nh.ud
    public int setCount(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.j4, nh.ud
    public int add(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.j4, nh.ud
    public int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // nh.j4, nh.ud
    public boolean setCount(Object obj, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}

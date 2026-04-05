package nh;

import java.util.Collection;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class mi extends si implements NavigableSet {

    /* renamed from: e, reason: collision with root package name */
    public transient mi f76485e;

    @Override // nh.si, nh.pi, nh.ei
    public final Collection c() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableSet
    public Object ceiling(Object obj) {
        Object objCeiling;
        synchronized (this.f76516c) {
            objCeiling = ((NavigableSet) super.c()).ceiling(obj);
        }
        return objCeiling;
    }

    @Override // nh.si, nh.pi
    /* renamed from: d */
    public final Set c() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableSet
    public Iterator<Object> descendingIterator() {
        return ((NavigableSet) super.c()).descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> descendingSet() {
        synchronized (this.f76516c) {
            try {
                mi miVar = this.f76485e;
                if (miVar != null) {
                    return miVar;
                }
                mi miVar2 = new mi(((NavigableSet) super.c()).descendingSet(), this.f76516c);
                this.f76485e = miVar2;
                return miVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nh.si
    /* renamed from: e */
    public final SortedSet c() {
        return (NavigableSet) super.c();
    }

    @Override // java.util.NavigableSet
    public Object floor(Object obj) {
        Object objFloor;
        synchronized (this.f76516c) {
            objFloor = ((NavigableSet) super.c()).floor(obj);
        }
        return objFloor;
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> headSet(Object obj, boolean z10) {
        mi miVar;
        synchronized (this.f76516c) {
            miVar = new mi(((NavigableSet) super.c()).headSet(obj, z10), this.f76516c);
        }
        return miVar;
    }

    @Override // java.util.NavigableSet
    public Object higher(Object obj) {
        Object objHigher;
        synchronized (this.f76516c) {
            objHigher = ((NavigableSet) super.c()).higher(obj);
        }
        return objHigher;
    }

    @Override // java.util.NavigableSet
    public Object lower(Object obj) {
        Object objLower;
        synchronized (this.f76516c) {
            objLower = ((NavigableSet) super.c()).lower(obj);
        }
        return objLower;
    }

    @Override // java.util.NavigableSet
    public Object pollFirst() {
        Object objPollFirst;
        synchronized (this.f76516c) {
            objPollFirst = ((NavigableSet) super.c()).pollFirst();
        }
        return objPollFirst;
    }

    @Override // java.util.NavigableSet
    public Object pollLast() {
        Object objPollLast;
        synchronized (this.f76516c) {
            objPollLast = ((NavigableSet) super.c()).pollLast();
        }
        return objPollLast;
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        mi miVar;
        synchronized (this.f76516c) {
            miVar = new mi(((NavigableSet) super.c()).subSet(obj, z10, obj2, z11), this.f76516c);
        }
        return miVar;
    }

    @Override // java.util.NavigableSet
    public NavigableSet<Object> tailSet(Object obj, boolean z10) {
        mi miVar;
        synchronized (this.f76516c) {
            miVar = new mi(((NavigableSet) super.c()).tailSet(obj, z10), this.f76516c);
        }
        return miVar;
    }

    @Override // nh.si, java.util.SortedSet, java.util.NavigableSet
    public SortedSet<Object> headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // nh.si, java.util.SortedSet, java.util.NavigableSet
    public SortedSet<Object> subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // nh.si, java.util.SortedSet, java.util.NavigableSet
    public SortedSet<Object> tailSet(Object obj) {
        return tailSet(obj, true);
    }
}

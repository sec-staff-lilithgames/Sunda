package io.odeeo.internal.q0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i<E> implements Iterable<E> {

    /* renamed from: a, reason: collision with root package name */
    public final Object f65876a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final Map<E, Integer> f65877b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public Set<E> f65878c = Collections.EMPTY_SET;

    /* renamed from: d, reason: collision with root package name */
    public List<E> f65879d = Collections.EMPTY_LIST;

    public void add(E e10) {
        synchronized (this.f65876a) {
            try {
                ArrayList arrayList = new ArrayList(this.f65879d);
                arrayList.add(e10);
                this.f65879d = Collections.unmodifiableList(arrayList);
                Integer num = this.f65877b.get(e10);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f65878c);
                    hashSet.add(e10);
                    this.f65878c = Collections.unmodifiableSet(hashSet);
                }
                this.f65877b.put(e10, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int count(E e10) {
        int iIntValue;
        synchronized (this.f65876a) {
            try {
                iIntValue = this.f65877b.containsKey(e10) ? this.f65877b.get(e10).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public Set<E> elementSet() {
        Set<E> set;
        synchronized (this.f65876a) {
            set = this.f65878c;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f65876a) {
            it = this.f65879d.iterator();
        }
        return it;
    }

    public void remove(E e10) {
        synchronized (this.f65876a) {
            try {
                Integer num = this.f65877b.get(e10);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f65879d);
                arrayList.remove(e10);
                this.f65879d = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f65877b.remove(e10);
                    HashSet hashSet = new HashSet(this.f65878c);
                    hashSet.remove(e10);
                    this.f65878c = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f65877b.put(e10, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

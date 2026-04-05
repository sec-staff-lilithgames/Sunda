package io.bidmachine.media3.common.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l implements Iterable {

    /* renamed from: b, reason: collision with root package name */
    public final Object f60737b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f60738c = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public Set f60739e = Collections.EMPTY_SET;

    /* renamed from: f, reason: collision with root package name */
    public List f60740f = Collections.EMPTY_LIST;

    public void add(Object obj) {
        synchronized (this.f60737b) {
            try {
                ArrayList arrayList = new ArrayList(this.f60740f);
                arrayList.add(obj);
                this.f60740f = Collections.unmodifiableList(arrayList);
                Integer num = (Integer) this.f60738c.get(obj);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f60739e);
                    hashSet.add(obj);
                    this.f60739e = Collections.unmodifiableSet(hashSet);
                }
                this.f60738c.put(obj, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int count(Object obj) {
        int iIntValue;
        synchronized (this.f60737b) {
            try {
                iIntValue = this.f60738c.containsKey(obj) ? ((Integer) this.f60738c.get(obj)).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public Set<Object> elementSet() {
        Set<Object> set;
        synchronized (this.f60737b) {
            set = this.f60739e;
        }
        return set;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        Iterator<Object> it;
        synchronized (this.f60737b) {
            it = this.f60740f.iterator();
        }
        return it;
    }

    public void remove(Object obj) {
        synchronized (this.f60737b) {
            try {
                Integer num = (Integer) this.f60738c.get(obj);
                if (num == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList(this.f60740f);
                arrayList.remove(obj);
                this.f60740f = Collections.unmodifiableList(arrayList);
                if (num.intValue() == 1) {
                    this.f60738c.remove(obj);
                    HashSet hashSet = new HashSet(this.f60739e);
                    hashSet.remove(obj);
                    this.f60739e = Collections.unmodifiableSet(hashSet);
                } else {
                    this.f60738c.put(obj, Integer.valueOf(num.intValue() - 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

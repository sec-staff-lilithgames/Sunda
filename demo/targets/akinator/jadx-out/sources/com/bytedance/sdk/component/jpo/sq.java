package com.bytedance.sdk.component.jpo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq<K, V> {
    private final Map<K, V> jpo = new HashMap();

    /* renamed from: jd, reason: collision with root package name */
    private final Map<V, Set<K>> f18781jd = new HashMap();

    public void jd(K k10) {
        Set<K> set;
        V vRemove = this.jpo.remove(k10);
        if (vRemove == null || (set = this.f18781jd.get(vRemove)) == null) {
            return;
        }
        set.remove(k10);
        if (set.isEmpty()) {
            this.f18781jd.remove(vRemove);
        }
    }

    public void jpo(Set<K> set, V v10) {
        for (K k10 : set) {
            if (this.jpo.containsKey(k10)) {
                jd(k10);
            }
        }
        Set<K> hashSet = this.f18781jd.get(v10);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f18781jd.put(v10, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.jpo.put(it.next(), v10);
        }
    }

    public V jpo(K k10) {
        return this.jpo.get(k10);
    }

    public void jpo() {
        this.jpo.clear();
        this.f18781jd.clear();
    }
}

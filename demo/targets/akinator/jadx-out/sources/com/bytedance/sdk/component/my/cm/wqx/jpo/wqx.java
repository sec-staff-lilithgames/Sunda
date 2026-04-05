package com.bytedance.sdk.component.my.cm.wqx.jpo;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx<K, V> {

    /* renamed from: jd, reason: collision with root package name */
    private int f18829jd;
    private final LinkedHashMap<K, SoftReference<V>> jpo = new LinkedHashMap<>(0, 0.75f, true);

    public wqx(int i10) {
        this.f18829jd = i10;
    }

    public synchronized V jpo(K k10) {
        V v10 = null;
        if (k10 == null) {
            return null;
        }
        if (this.f18829jd <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.jpo.get(k10);
        if (softReference != null) {
            v10 = softReference.get();
            if (v10 != null) {
                return v10;
            }
            this.jpo.remove(k10);
        }
        return v10;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.f18829jd), Integer.valueOf(this.jpo.size()));
    }

    public synchronized void jpo(K k10, V v10) {
        if (this.f18829jd <= 0) {
            return;
        }
        if (k10 == null || v10 == null) {
            return;
        }
        this.jpo.put(k10, new SoftReference<>(v10));
        int size = this.jpo.size();
        int i10 = this.f18829jd;
        if (size > i10) {
            jpo((int) (i10 * 0.7d));
        }
    }

    public synchronized void jpo(int i10) {
        int size = this.jpo.size() - i10;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.jpo.entrySet().iterator();
            for (int i11 = 0; i11 < size; i11++) {
                it.next();
                it.remove();
            }
        }
        if (i10 == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.jpo.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }
}

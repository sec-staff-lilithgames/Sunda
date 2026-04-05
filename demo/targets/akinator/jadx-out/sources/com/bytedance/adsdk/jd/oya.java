package com.bytedance.adsdk.jd;

import com.ironsource.C3191e4;
import java.util.LinkedHashMap;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class oya<K, V> {

    /* renamed from: cm, reason: collision with root package name */
    private int f17410cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f17411jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f17412jj;
    private final LinkedHashMap<K, V> jpo;
    private int my;

    /* renamed from: qk, reason: collision with root package name */
    private int f17413qk;
    private int wqx;
    private int xyk;

    public oya(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.wqx = i10;
        this.jpo = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int wqx(K k10, V v10) {
        int iJd = jd(k10, v10);
        if (iJd >= 0) {
            return iJd;
        }
        throw new IllegalStateException("Negative size: " + k10 + C3191e4.i.f36525b + v10);
    }

    public int jd(K k10, V v10) {
        return 1;
    }

    public final V jpo(K k10) {
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.jpo.get(k10);
                if (v10 != null) {
                    this.f17413qk++;
                    return v10;
                }
                this.xyk++;
                V vJd = jd(k10);
                if (vJd == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.my++;
                        vPut = this.jpo.put(k10, vJd);
                        if (vPut != null) {
                            this.jpo.put(k10, vPut);
                        } else {
                            this.f17411jd += wqx(k10, vJd);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (vPut != null) {
                    return vPut;
                }
                jpo(this.wqx);
                return vJd;
            } finally {
            }
        }
    }

    public final synchronized String toString() {
        int i10;
        try {
            int i11 = this.f17413qk;
            int i12 = this.xyk + i11;
            i10 = i12 != 0 ? (i11 * 100) / i12 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th2) {
            throw th2;
        }
        return "LruCache[maxSize=" + this.wqx + ",hits=" + this.f17413qk + ",misses=" + this.xyk + ",hitRate=" + i10 + "%]";
    }

    public V jd(K k10) {
        return null;
    }

    public final V jpo(K k10, V v10) {
        V vPut;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.f17410cm++;
                    this.f17411jd += wqx(k10, v10);
                    vPut = this.jpo.put(k10, v10);
                    if (vPut != null) {
                        this.f17411jd -= wqx(k10, vPut);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jpo(this.wqx);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jpo(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f17411jd     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r3.jpo     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f17411jd     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L51
            goto L14
        L12:
            r4 = move-exception
            goto L70
        L14:
            int r0 = r3.f17411jd     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r3.jpo     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4f
        L21:
            java.util.LinkedHashMap<K, V> r0 = r3.jpo     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r3.jpo     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.f17411jd     // Catch: java.lang.Throwable -> L12
            int r0 = r3.wqx(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.f17411jd = r2     // Catch: java.lang.Throwable -> L12
            int r0 = r3.f17412jj     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.f17412jj = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L51:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L70:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.jd.oya.jpo(int):void");
    }
}

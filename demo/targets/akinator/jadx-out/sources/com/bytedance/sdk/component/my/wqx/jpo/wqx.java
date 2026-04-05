package com.bytedance.sdk.component.my.wqx.jpo;

import com.ironsource.C3191e4;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx<K, V> {

    /* renamed from: cm, reason: collision with root package name */
    private int f18927cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18928jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f18929jj;
    private final LinkedHashMap<K, SoftReference<V>> jpo;
    private int my;

    /* renamed from: qk, reason: collision with root package name */
    private int f18930qk;
    private int wqx;
    private int xyk;

    public wqx(int i10) {
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
        V v10;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                SoftReference<V> softReference = this.jpo.get(k10);
                if (softReference != null) {
                    v10 = softReference.get();
                    if (v10 != null) {
                        this.f18930qk++;
                        return v10;
                    }
                    this.jpo.remove(k10);
                } else {
                    v10 = null;
                }
                this.xyk++;
                V vJd = jd(k10);
                if (vJd == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.my++;
                        SoftReference<V> softReferencePut = this.jpo.put(k10, new SoftReference<>(vJd));
                        if (softReferencePut != null) {
                            v10 = softReferencePut.get();
                        }
                        if (v10 != null) {
                            this.jpo.put(k10, softReferencePut);
                        } else {
                            this.f18928jd += wqx(k10, vJd);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (v10 != null) {
                    return v10;
                }
                jpo(this.wqx);
                return vJd;
            } finally {
            }
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        try {
            i10 = this.f18930qk;
            i11 = this.xyk + i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.wqx), Integer.valueOf(this.f18930qk), Integer.valueOf(this.xyk), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    public V jd(K k10) {
        return null;
    }

    public final V jpo(K k10, V v10) {
        V v11;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.f18927cm++;
                    this.f18928jd += wqx(k10, v10);
                    SoftReference<V> softReferencePut = this.jpo.put(k10, new SoftReference<>(v10));
                    if (softReferencePut != null) {
                        v11 = softReferencePut.get();
                        if (v11 != null) {
                            this.f18928jd -= wqx(k10, v11);
                        }
                    } else {
                        v11 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            jpo(this.wqx);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.f18928jd + ", maxSize: " + r4);
        r3.f18928jd = 0;
        r3.jpo.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return;
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
            int r0 = r3.f18928jd     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L54
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.jpo     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f18928jd     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            goto L54
        L12:
            r4 = move-exception
            goto L7b
        L14:
            int r0 = r3.f18928jd     // Catch: java.lang.Throwable -> L12
            if (r0 > r4) goto L1a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L1a:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.jpo     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L2e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L2e:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.jpo     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L12
            int r2 = r3.f18928jd     // Catch: java.lang.Throwable -> L12
            int r0 = r3.wqx(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.f18928jd = r2     // Catch: java.lang.Throwable -> L12
        L4c:
            int r0 = r3.f18929jj     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.f18929jj = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L54:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.f18928jd     // Catch: java.lang.Throwable -> L12
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            r1.append(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L12
            r4 = 0
            r3.f18928jd = r4     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.jpo     // Catch: java.lang.Throwable -> L12
            r4.clear()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L7b:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.my.wqx.jpo.wqx.jpo(int):void");
    }
}

package com.mbridge.msdk.click.retry;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f39815a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39816b;

    /* renamed from: c, reason: collision with root package name */
    private int f39817c;

    public c(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f39816b = i10;
        this.f39815a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, b bVar) {
        return 1;
    }

    public final b a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVar = this.f39815a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f39816b));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVarRemove = this.f39815a.remove(str);
                if (bVarRemove != null) {
                    this.f39817c -= b(str, bVarRemove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.f39817c += b(str, bVar);
                    b bVarPut = this.f39815a.put(str, bVar);
                    if (bVarPut != null) {
                        this.f39817c -= b(str, bVarPut);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            a(this.f39816b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f39817c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L53
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.retry.b> r0 = r3.f39815a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f39817c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L53
            goto L14
        L12:
            r4 = move-exception
            goto L72
        L14:
            int r0 = r3.f39817c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L51
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.retry.b> r0 = r3.f39815a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L51
        L21:
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.retry.b> r0 = r3.f39815a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L35
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L52
        L35:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            com.mbridge.msdk.click.retry.b r0 = (com.mbridge.msdk.click.retry.b) r0     // Catch: java.lang.Throwable -> L12
            int r0 = r3.b(r1, r0)     // Catch: java.lang.Throwable -> L4f
            java.util.LinkedHashMap<java.lang.String, com.mbridge.msdk.click.retry.b> r2 = r3.f39815a     // Catch: java.lang.Throwable -> L4f
            r2.remove(r1)     // Catch: java.lang.Throwable -> L4f
            int r1 = r3.f39817c     // Catch: java.lang.Throwable -> L4f
            int r1 = r1 - r0
            r3.f39817c = r1     // Catch: java.lang.Throwable -> L4f
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L51:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
        L52:
            return
        L53:
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
        L72:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.retry.c.a(int):void");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f39815a.keySet());
        }
        return hashSet;
    }
}

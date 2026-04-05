package k2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import o2.n;
import o2.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final o f70117a = n.createSynchronizedObject();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f70118b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f70119c;

    /* renamed from: d, reason: collision with root package name */
    public int f70120d;

    /* renamed from: e, reason: collision with root package name */
    public int f70121e;

    /* renamed from: f, reason: collision with root package name */
    public int f70122f;

    /* renamed from: g, reason: collision with root package name */
    public int f70123g;

    /* renamed from: h, reason: collision with root package name */
    public int f70124h;

    /* renamed from: i, reason: collision with root package name */
    public int f70125i;

    public b(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f70121e = i10;
        this.f70118b = new HashMap(0, 0.75f);
        this.f70119c = new LinkedHashSet();
    }

    public final int createCount() {
        synchronized (this.f70117a) {
        }
        return 0;
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i10;
        synchronized (this.f70117a) {
            i10 = this.f70123g;
        }
        return i10;
    }

    public final Object get(Object obj) {
        synchronized (this.f70117a) {
            Object obj2 = this.f70118b.get(obj);
            if (obj2 == null) {
                this.f70125i++;
                return null;
            }
            this.f70119c.remove(obj);
            this.f70119c.add(obj);
            this.f70124h++;
            return obj2;
        }
    }

    public final int hitCount() {
        int i10;
        synchronized (this.f70117a) {
            i10 = this.f70124h;
        }
        return i10;
    }

    public final int maxSize() {
        int i10;
        synchronized (this.f70117a) {
            i10 = this.f70121e;
        }
        return i10;
    }

    public final int missCount() {
        int i10;
        synchronized (this.f70117a) {
            i10 = this.f70125i;
        }
        return i10;
    }

    public final Object put(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f70117a) {
            try {
                this.f70122f++;
                this.f70120d = size() + 1;
                objPut = this.f70118b.put(obj, obj2);
                if (objPut != null) {
                    this.f70120d = size() - 1;
                }
                if (this.f70119c.contains(obj)) {
                    this.f70119c.remove(obj);
                }
                this.f70119c.add(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        trimToSize(this.f70121e);
        return objPut;
    }

    public final int putCount() {
        int i10;
        synchronized (this.f70117a) {
            i10 = this.f70122f;
        }
        return i10;
    }

    public final Object remove(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.f70117a) {
            objRemove = this.f70118b.remove(obj);
            this.f70119c.remove(obj);
            if (objRemove != null) {
                this.f70120d = size() - 1;
            }
        }
        return objRemove;
    }

    public void resize(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this.f70117a) {
            this.f70121e = i10;
        }
        trimToSize(i10);
    }

    public final int size() {
        int i10;
        synchronized (this.f70117a) {
            i10 = this.f70120d;
        }
        return i10;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f70117a) {
            linkedHashMap = new LinkedHashMap();
            Iterator it = this.f70119c.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object obj = this.f70118b.get(next);
                e0.checkNotNull(obj);
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }

    public final <R> R synchronizedValue$ui_text_release(kv.a block) {
        R r10;
        e0.checkNotNullParameter(block, "block");
        synchronized (this.f70117a) {
            try {
                r10 = (R) block.invoke();
                b0.finallyStart(1);
            } catch (Throwable th2) {
                b0.finallyStart(1);
                b0.finallyEnd(1);
                throw th2;
            }
        }
        b0.finallyEnd(1);
        return r10;
    }

    public String toString() {
        String str;
        synchronized (this.f70117a) {
            try {
                int i10 = this.f70124h;
                int i11 = this.f70125i + i10;
                str = "LruCache[maxSize=" + this.f70121e + ",hits=" + this.f70124h + ",misses=" + this.f70125i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void trimToSize(int r5) {
        /*
            r4 = this;
        L0:
            o2.o r0 = r4.f70117a
            monitor-enter(r0)
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L83
            java.util.HashMap r1 = r4.f70118b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1a
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L83
            goto L1a
        L18:
            r5 = move-exception
            goto L8b
        L1a:
            java.util.HashMap r1 = r4.f70118b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r2 = r4.f70119c     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L83
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L18
            if (r1 <= r5) goto L73
            java.util.HashMap r1 = r4.f70118b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L73
            java.util.LinkedHashSet r1 = r4.f70119c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = uu.y0.first(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap r2 = r4.f70118b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r2 == 0) goto L6b
            java.util.HashMap r3 = r4.f70118b     // Catch: java.lang.Throwable -> L18
            java.util.Map r3 = kotlin.jvm.internal.h1.asMutableMap(r3)     // Catch: java.lang.Throwable -> L18
            r3.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r3 = r4.f70119c     // Catch: java.lang.Throwable -> L18
            java.util.Collection r3 = kotlin.jvm.internal.h1.asMutableCollection(r3)     // Catch: java.lang.Throwable -> L18
            r3.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r3 = r4.size()     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.e0.checkNotNull(r1)     // Catch: java.lang.Throwable -> L18
            kotlin.jvm.internal.e0.checkNotNull(r2)     // Catch: java.lang.Throwable -> L18
            int r3 = r3 + (-1)
            r4.f70120d = r3     // Catch: java.lang.Throwable -> L18
            int r3 = r4.f70123g     // Catch: java.lang.Throwable -> L18
            int r3 = r3 + 1
            r4.f70123g = r3     // Catch: java.lang.Throwable -> L18
            goto L75
        L6b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r5     // Catch: java.lang.Throwable -> L18
        L73:
            r1 = 0
            r2 = r1
        L75:
            monitor-exit(r0)
            if (r1 != 0) goto L7b
            if (r2 != 0) goto L7b
            return
        L7b:
            kotlin.jvm.internal.e0.checkNotNull(r1)
            kotlin.jvm.internal.e0.checkNotNull(r2)
            goto L0
        L83:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r5     // Catch: java.lang.Throwable -> L18
        L8b:
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.b.trimToSize(int):void");
    }
}

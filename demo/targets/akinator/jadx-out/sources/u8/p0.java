package u8;

import com.bumptech.glide.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import u8.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f88101a;

    /* renamed from: b, reason: collision with root package name */
    public final o0 f88102b;

    public p0(w3.f fVar) {
        t0 t0Var = new t0(fVar);
        this.f88102b = new o0();
        this.f88101a = t0Var;
    }

    public synchronized <Model, Data> void append(Class<Model> cls, Class<Data> cls2, m0 m0Var) {
        t0 t0Var = this.f88101a;
        synchronized (t0Var) {
            try {
                t0.a aVar = new t0.a(cls, cls2, m0Var);
                ArrayList arrayList = t0Var.f88122a;
                arrayList.add(arrayList.size(), aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f88102b.clear();
    }

    public synchronized <Model, Data> l0 build(Class<Model> cls, Class<Data> cls2) {
        return this.f88101a.build(cls, cls2);
    }

    public synchronized List<Class<?>> getDataClasses(Class<?> cls) {
        return this.f88101a.b(cls);
    }

    public <A> List<l0> getModelLoaders(A a10) {
        List<l0> listUnmodifiableList;
        Class<?> cls = a10.getClass();
        synchronized (this) {
            listUnmodifiableList = this.f88102b.get(cls);
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(this.f88101a.a(cls));
                this.f88102b.put(cls, listUnmodifiableList);
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new m.c(a10);
        }
        int size = listUnmodifiableList.size();
        List<l0> arrayList = Collections.EMPTY_LIST;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            l0 l0Var = listUnmodifiableList.get(i10);
            if (l0Var.handles(a10)) {
                if (z10) {
                    arrayList = new ArrayList<>(size - i10);
                    z10 = false;
                }
                arrayList.add(l0Var);
            }
        }
        if (arrayList.isEmpty()) {
            throw new m.c(a10, listUnmodifiableList);
        }
        return arrayList;
    }

    public synchronized <Model, Data> void prepend(Class<Model> cls, Class<Data> cls2, m0 m0Var) {
        t0 t0Var = this.f88101a;
        synchronized (t0Var) {
            try {
                t0Var.f88122a.add(0, new t0.a(cls, cls2, m0Var));
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f88102b.clear();
    }

    public synchronized <Model, Data> void remove(Class<Model> cls, Class<Data> cls2) {
        Iterator it = this.f88101a.c(cls, cls2).iterator();
        while (it.hasNext()) {
            ((m0) it.next()).teardown();
        }
        this.f88102b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023 A[Catch: all -> 0x0034, LOOP:0: B:11:0x001d->B:13:0x0023, LOOP_END, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x0003, B:9:0x0018, B:10:0x0019, B:11:0x001d, B:13:0x0023, B:14:0x002d, B:25:0x003c, B:5:0x0004, B:6:0x0008, B:8:0x0017, B:20:0x0037), top: B:28:0x0001, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <Model, Data> void replace(java.lang.Class<Model> r4, java.lang.Class<Data> r5, u8.m0 r6) {
        /*
            r3 = this;
            monitor-enter(r3)
            u8.t0 r0 = r3.f88101a     // Catch: java.lang.Throwable -> L34
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L34
            java.util.ArrayList r1 = r0.c(r4, r5)     // Catch: java.lang.Throwable -> L3a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L3a
            u8.t0$a r2 = new u8.t0$a     // Catch: java.lang.Throwable -> L38
            r2.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L38
            java.util.ArrayList r4 = r0.f88122a     // Catch: java.lang.Throwable -> L38
            int r5 = r4.size()     // Catch: java.lang.Throwable -> L38
            r4.add(r5, r2)     // Catch: java.lang.Throwable -> L38
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> L34
        L1d:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L2d
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L34
            u8.m0 r5 = (u8.m0) r5     // Catch: java.lang.Throwable -> L34
            r5.teardown()     // Catch: java.lang.Throwable -> L34
            goto L1d
        L2d:
            u8.o0 r4 = r3.f88102b     // Catch: java.lang.Throwable -> L34
            r4.clear()     // Catch: java.lang.Throwable -> L34
            monitor-exit(r3)
            return
        L34:
            r4 = move-exception
            goto L3d
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r4     // Catch: java.lang.Throwable -> L3a
        L38:
            r4 = move-exception
            goto L36
        L3a:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r4     // Catch: java.lang.Throwable -> L34
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L34
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: u8.p0.replace(java.lang.Class, java.lang.Class, u8.m0):void");
    }
}

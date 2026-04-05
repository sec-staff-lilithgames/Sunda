package u8;

import com.bumptech.glide.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class t0 {

    /* renamed from: e, reason: collision with root package name */
    public static final u0 f88120e = new u0();

    /* renamed from: f, reason: collision with root package name */
    public static final s0 f88121f = new s0();

    /* renamed from: d, reason: collision with root package name */
    public final w3.f f88125d;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f88122a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f88124c = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final u0 f88123b = f88120e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f88126a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f88127b;

        /* renamed from: c, reason: collision with root package name */
        public final m0 f88128c;

        public a(Class<Object> cls, Class<Object> cls2, m0 m0Var) {
            this.f88126a = cls;
            this.f88127b = cls2;
            this.f88128c = m0Var;
        }

        public boolean handles(Class<?> cls, Class<?> cls2) {
            return handles(cls) && this.f88127b.isAssignableFrom(cls2);
        }

        public boolean handles(Class<?> cls) {
            return this.f88126a.isAssignableFrom(cls);
        }
    }

    public t0(w3.f fVar) {
        this.f88125d = fVar;
    }

    public final synchronized ArrayList a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f88122a.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (!this.f88124c.contains(aVar) && aVar.handles(cls)) {
                    this.f88124c.add(aVar);
                    arrayList.add((l0) j9.q.checkNotNull(aVar.f88128c.build(this)));
                    this.f88124c.remove(aVar);
                }
            }
        } finally {
        }
        return arrayList;
    }

    public final synchronized ArrayList b(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f88122a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (!arrayList.contains(aVar.f88127b) && aVar.handles(cls)) {
                arrayList.add(aVar.f88127b);
            }
        }
        return arrayList;
    }

    public synchronized <Model, Data> l0 build(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f88122a.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (this.f88124c.contains(aVar)) {
                    z10 = true;
                } else if (aVar.handles(cls, cls2)) {
                    this.f88124c.add(aVar);
                    arrayList.add((l0) j9.q.checkNotNull(aVar.f88128c.build(this)));
                    this.f88124c.remove(aVar);
                }
            }
            if (arrayList.size() > 1) {
                return this.f88123b.build(arrayList, this.f88125d);
            }
            if (arrayList.size() == 1) {
                return (l0) arrayList.get(0);
            }
            if (!z10) {
                throw new m.c((Class<?>) cls, (Class<?>) cls2);
            }
            return f88121f;
        } catch (Throwable th2) {
            this.f88124c.clear();
            throw th2;
        }
    }

    public final synchronized ArrayList c(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f88122a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.handles(cls, cls2)) {
                it.remove();
                arrayList.add(aVar.f88128c);
            }
        }
        return arrayList;
    }
}

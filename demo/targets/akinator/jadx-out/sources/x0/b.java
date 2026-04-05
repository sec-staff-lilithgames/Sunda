package x0;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kv.l;
import s0.h;
import s0.m;
import s0.n;
import uu.s;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends s implements n {

    /* renamed from: g, reason: collision with root package name */
    public static final a f91311g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final b f91312h;

    /* renamed from: c, reason: collision with root package name */
    public final Object f91313c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f91314e;

    /* renamed from: f, reason: collision with root package name */
    public final u0.d f91315f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final <E> n emptyOf$runtime() {
            return b.f91312h;
        }
    }

    static {
        u0.d dVarEmptyOf$runtime = u0.d.f87478g.emptyOf$runtime();
        y0.c cVar = y0.c.f93944a;
        f91312h = new b(cVar, cVar, dVarEmptyOf$runtime);
    }

    public b(Object obj, Object obj2, u0.d dVar) {
        this.f91313c = obj;
        this.f91314e = obj2;
        this.f91315f = dVar;
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public /* bridge */ /* synthetic */ h addAll(Collection collection) {
        return addAll((Collection<Object>) collection);
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f91315f.containsKey(obj);
    }

    public final Object getFirstElement$runtime() {
        return this.f91313c;
    }

    public final u0.d getHashMap$runtime() {
        return this.f91315f;
    }

    public final Object getLastElement$runtime() {
        return this.f91314e;
    }

    @Override // uu.a
    public int getSize() {
        return this.f91315f.size();
    }

    @Override // uu.s, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new d(this.f91313c, this.f91315f);
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public /* bridge */ /* synthetic */ h removeAll(Collection collection) {
        return removeAll((Collection<Object>) collection);
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public /* bridge */ /* synthetic */ h retainAll(Collection collection) {
        return retainAll((Collection<Object>) collection);
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n add(Object obj) {
        u0.d dVar = this.f91315f;
        if (dVar.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, dVar.put(obj, (Object) new x0.a()));
        }
        Object obj2 = this.f91314e;
        Object obj3 = dVar.get(obj2);
        e0.checkNotNull(obj3);
        return new b(this.f91313c, obj, dVar.put(obj2, (Object) ((x0.a) obj3).withNext(obj)).put(obj, (Object) new x0.a(obj2)));
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n addAll(Collection<Object> collection) {
        m mVarBuilder = builder();
        mVarBuilder.addAll(collection);
        return mVarBuilder.build();
    }

    @Override // s0.n, s0.h
    public m builder() {
        return new c(this);
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n clear() {
        return f91311g.emptyOf$runtime();
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n remove(Object obj) {
        u0.d dVar = this.f91315f;
        x0.a aVar = (x0.a) dVar.get(obj);
        if (aVar == null) {
            return this;
        }
        u0.d dVarRemove = dVar.remove(obj);
        if (aVar.getHasPrevious()) {
            Object obj2 = dVarRemove.get(aVar.getPrevious());
            e0.checkNotNull(obj2);
            dVarRemove = dVarRemove.put(aVar.getPrevious(), (Object) ((x0.a) obj2).withNext(aVar.getNext()));
        }
        if (aVar.getHasNext()) {
            Object obj3 = dVarRemove.get(aVar.getNext());
            e0.checkNotNull(obj3);
            dVarRemove = dVarRemove.put(aVar.getNext(), (Object) ((x0.a) obj3).withPrevious(aVar.getPrevious()));
        }
        return new b(!aVar.getHasPrevious() ? aVar.getNext() : this.f91313c, !aVar.getHasNext() ? aVar.getPrevious() : this.f91314e, dVarRemove);
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n retainAll(Collection<Object> collection) {
        m mVarBuilder = builder();
        mVarBuilder.retainAll(collection);
        return mVarBuilder.build();
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n removeAll(Collection<Object> collection) {
        m mVarBuilder = builder();
        mVarBuilder.removeAll(collection);
        return mVarBuilder.build();
    }

    @Override // s0.n, s0.h
    public n removeAll(l lVar) {
        m mVarBuilder = builder();
        v0.removeAll(mVarBuilder, lVar);
        return mVarBuilder.build();
    }
}

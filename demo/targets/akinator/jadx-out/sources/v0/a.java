package v0;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.u;
import kv.l;
import s0.h;
import s0.m;
import s0.n;
import uu.s;
import uu.v0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends s implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final C0795a f88821f = new C0795a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final a f88822g = new a(e.f88837d.getEMPTY$runtime(), 0);

    /* renamed from: c, reason: collision with root package name */
    public final e f88823c;

    /* renamed from: e, reason: collision with root package name */
    public final int f88824e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: v0.a$a, reason: collision with other inner class name */
    public static final class C0795a {
        public C0795a(u uVar) {
        }

        public final <E> n emptyOf$runtime() {
            return a.f88822g;
        }
    }

    public a(e eVar, int i10) {
        this.f88823c = eVar;
        this.f88824e = i10;
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public /* bridge */ /* synthetic */ h addAll(Collection collection) {
        return addAll((Collection<Object>) collection);
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f88823c.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // uu.a, java.util.Collection, java.util.List
    public boolean containsAll(Collection<?> collection) {
        boolean z10 = collection instanceof a;
        e eVar = this.f88823c;
        return z10 ? eVar.containsAll(((a) collection).f88823c, 0) : collection instanceof b ? eVar.containsAll(((b) collection).getNode$runtime(), 0) : super.containsAll(collection);
    }

    public final e getNode$runtime() {
        return this.f88823c;
    }

    @Override // uu.a
    public int getSize() {
        return this.f88824e;
    }

    @Override // uu.s, uu.a, java.util.Collection, java.lang.Iterable
    public Iterator<Object> iterator() {
        return new c(this.f88823c);
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
        int iHashCode = obj != null ? obj.hashCode() : 0;
        e eVar = this.f88823c;
        e eVarAdd = eVar.add(iHashCode, obj, 0);
        return eVar == eVarAdd ? this : new a(eVarAdd, size() + 1);
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n addAll(Collection<Object> collection) {
        m mVarBuilder = builder();
        mVarBuilder.addAll(collection);
        return mVarBuilder.build();
    }

    @Override // s0.n, s0.h
    public m builder() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n clear() {
        return f88821f.emptyOf$runtime();
    }

    @Override // java.util.Collection, java.util.Set, s0.n, s0.h
    public n remove(Object obj) {
        int iHashCode = obj != null ? obj.hashCode() : 0;
        e eVar = this.f88823c;
        e eVarRemove = eVar.remove(iHashCode, obj, 0);
        return eVar == eVarRemove ? this : new a(eVarRemove, size() - 1);
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

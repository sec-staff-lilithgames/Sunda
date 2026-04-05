package v0;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import s0.m;
import uu.q;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends q implements m {

    /* renamed from: b, reason: collision with root package name */
    public a f88825b;

    /* renamed from: c, reason: collision with root package name */
    public y0.e f88826c = new y0.e();

    /* renamed from: e, reason: collision with root package name */
    public e f88827e;

    /* renamed from: f, reason: collision with root package name */
    public int f88828f;

    /* renamed from: g, reason: collision with root package name */
    public int f88829g;

    public b(a aVar) {
        this.f88825b = aVar;
        this.f88827e = this.f88825b.getNode$runtime();
        this.f88829g = this.f88825b.size();
    }

    @Override // uu.q, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int size = size();
        this.f88827e = this.f88827e.mutableAdd(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<Object> collection) {
        u uVar = null;
        a aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.addAll(collection);
        }
        y0.b bVar2 = new y0.b(0, 1, uVar);
        int size = size();
        e eVarMutableAddAll = this.f88827e.mutableAddAll(aVarBuild.getNode$runtime(), 0, bVar2, this);
        int size2 = (collection.size() + size) - bVar2.getCount();
        if (size != size2) {
            this.f88827e = eVarMutableAddAll;
            setSize(size2);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        e eMPTY$runtime = e.f88837d.getEMPTY$runtime();
        e0.checkNotNull(eMPTY$runtime, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
        this.f88827e = eMPTY$runtime;
        setSize(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f88827e.contains(obj != null ? obj.hashCode() : 0, obj, 0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return collection instanceof a ? this.f88827e.containsAll(((a) collection).getNode$runtime(), 0) : collection instanceof b ? this.f88827e.containsAll(((b) collection).f88827e, 0) : super.containsAll(collection);
    }

    public final int getModCount$runtime() {
        return this.f88828f;
    }

    public final e getNode$runtime() {
        return this.f88827e;
    }

    public final y0.e getOwnership$runtime() {
        return this.f88826c;
    }

    @Override // uu.q
    public int getSize() {
        return this.f88829g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Object> iterator() {
        return new d(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int size = size();
        this.f88827e = this.f88827e.mutableRemove(obj != null ? obj.hashCode() : 0, obj, 0, this);
        return size != size();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        u uVar = null;
        a aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.removeAll(collection);
        }
        y0.b bVar2 = new y0.b(0, 1, uVar);
        int size = size();
        Object objMutableRemoveAll = this.f88827e.mutableRemoveAll(aVarBuild.getNode$runtime(), 0, bVar2, this);
        int count = size - bVar2.getCount();
        if (count == 0) {
            clear();
        } else if (count != size) {
            e0.checkNotNull(objMutableRemoveAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f88827e = (e) objMutableRemoveAll;
            setSize(count);
        }
        return size != size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        u uVar = null;
        a aVarBuild = collection instanceof a ? (a) collection : null;
        if (aVarBuild == null) {
            b bVar = collection instanceof b ? (b) collection : null;
            aVarBuild = bVar != null ? bVar.build() : null;
        }
        if (aVarBuild == null) {
            return super.retainAll(collection);
        }
        y0.b bVar2 = new y0.b(0, 1, uVar);
        int size = size();
        Object objMutableRetainAll = this.f88827e.mutableRetainAll(aVarBuild.getNode$runtime(), 0, bVar2, this);
        int count = bVar2.getCount();
        if (count == 0) {
            clear();
        } else if (count != size) {
            e0.checkNotNull(objMutableRetainAll, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.TrieNode<E of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableSet.PersistentHashSetBuilder>");
            this.f88827e = (e) objMutableRetainAll;
            setSize(count);
        }
        return size != size();
    }

    public void setSize(int i10) {
        this.f88829g = i10;
        this.f88828f++;
    }

    @Override // s0.m, s0.g
    public a build() {
        a aVar;
        if (this.f88827e == this.f88825b.getNode$runtime()) {
            aVar = this.f88825b;
        } else {
            this.f88826c = new y0.e();
            aVar = new a(this.f88827e, size());
        }
        this.f88825b = aVar;
        return aVar;
    }
}

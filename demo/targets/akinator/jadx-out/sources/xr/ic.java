package xr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ic {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f92640a;

    /* renamed from: b, reason: collision with root package name */
    public final List f92641b;

    /* renamed from: c, reason: collision with root package name */
    public final Collection f92642c;

    /* renamed from: d, reason: collision with root package name */
    public final Collection f92643d;

    /* renamed from: e, reason: collision with root package name */
    public final int f92644e;

    /* renamed from: f, reason: collision with root package name */
    public final rc f92645f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f92646g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f92647h;

    public ic(List list, Collection collection, Collection collection2, rc rcVar, boolean z10, boolean z11, boolean z12, int i10) {
        this.f92641b = list;
        this.f92642c = (Collection) mh.p1.checkNotNull(collection, "drainedSubstreams");
        this.f92645f = rcVar;
        this.f92643d = collection2;
        this.f92646g = z10;
        this.f92640a = z11;
        this.f92647h = z12;
        this.f92644e = i10;
        mh.p1.checkState(!z11 || list == null, "passThrough should imply buffer is null");
        mh.p1.checkState((z11 && rcVar == null) ? false : true, "passThrough should imply winningSubstream != null");
        mh.p1.checkState(!z11 || (collection.size() == 1 && collection.contains(rcVar)) || (collection.size() == 0 && rcVar.f92967b), "passThrough should imply winningSubstream is drained");
        mh.p1.checkState((z10 && rcVar == null) ? false : true, "cancelled should imply committed");
    }

    public final ic a(rc rcVar) {
        Collection collectionUnmodifiableCollection;
        mh.p1.checkState(!this.f92647h, "hedging frozen");
        mh.p1.checkState(this.f92645f == null, "already committed");
        Collection collection = this.f92643d;
        if (collection == null) {
            collectionUnmodifiableCollection = Collections.singleton(rcVar);
        } else {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.add(rcVar);
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
        }
        return new ic(this.f92641b, this.f92642c, collectionUnmodifiableCollection, this.f92645f, this.f92646g, this.f92640a, this.f92647h, this.f92644e + 1);
    }

    public final ic b(rc rcVar) {
        ArrayList arrayList = new ArrayList(this.f92643d);
        arrayList.remove(rcVar);
        return new ic(this.f92641b, this.f92642c, Collections.unmodifiableCollection(arrayList), this.f92645f, this.f92646g, this.f92640a, this.f92647h, this.f92644e);
    }

    public final ic c(rc rcVar, rc rcVar2) {
        ArrayList arrayList = new ArrayList(this.f92643d);
        arrayList.remove(rcVar);
        arrayList.add(rcVar2);
        return new ic(this.f92641b, this.f92642c, Collections.unmodifiableCollection(arrayList), this.f92645f, this.f92646g, this.f92640a, this.f92647h, this.f92644e);
    }

    public final ic d(rc rcVar) {
        rcVar.f92967b = true;
        Collection collection = this.f92642c;
        if (!collection.contains(rcVar)) {
            return this;
        }
        ArrayList arrayList = new ArrayList(collection);
        arrayList.remove(rcVar);
        return new ic(this.f92641b, Collections.unmodifiableCollection(arrayList), this.f92643d, this.f92645f, this.f92646g, this.f92640a, this.f92647h, this.f92644e);
    }

    public final ic e(rc rcVar) {
        List list;
        mh.p1.checkState(!this.f92640a, "Already passThrough");
        boolean z10 = rcVar.f92967b;
        Collection collectionUnmodifiableCollection = this.f92642c;
        if (!z10) {
            if (collectionUnmodifiableCollection.isEmpty()) {
                collectionUnmodifiableCollection = Collections.singletonList(rcVar);
            } else {
                ArrayList arrayList = new ArrayList(collectionUnmodifiableCollection);
                arrayList.add(rcVar);
                collectionUnmodifiableCollection = Collections.unmodifiableCollection(arrayList);
            }
        }
        Collection collection = collectionUnmodifiableCollection;
        rc rcVar2 = this.f92645f;
        boolean z11 = rcVar2 != null;
        if (z11) {
            mh.p1.checkState(rcVar2 == rcVar, "Another RPC attempt has already committed");
            list = null;
        } else {
            list = this.f92641b;
        }
        return new ic(list, collection, this.f92643d, this.f92645f, this.f92646g, z11, this.f92647h, this.f92644e);
    }
}

package nh;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class db extends nb {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eb f76183c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(eb ebVar) {
        super(ebVar);
        this.f76183c = ebVar;
    }

    @Override // nh.nb, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        eb ebVar = this.f76183c;
        if (!ebVar.containsKey(obj)) {
            return false;
        }
        ebVar.f76530f.remove(obj);
        return true;
    }

    @Override // nh.ig, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        eb ebVar = this.f76183c;
        return eb.d(ebVar.f76530f, ebVar.f76531g, collection);
    }

    @Override // nh.ig, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        eb ebVar = this.f76183c;
        return eb.e(ebVar.f76530f, ebVar.f76531g, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return p8.newArrayList(iterator()).toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) p8.newArrayList(iterator()).toArray(tArr);
    }
}

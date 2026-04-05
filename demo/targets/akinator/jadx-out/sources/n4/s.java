package n4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o4.j;
import tu.a0;
import tu.x0;
import uu.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f75631i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Set f75632j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Set set, zu.d dVar) {
        super(2, dVar);
        this.f75632j = set;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        s sVar = new s(this.f75632j, dVar);
        sVar.f75631i = obj;
        return sVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        Set<j.a> setKeySet = ((o4.j) this.f75631i).asMap().keySet();
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((j.a) it.next()).getName());
        }
        Set<String> migrate_all_keys = t.getMIGRATE_ALL_KEYS();
        boolean z10 = true;
        Set<String> set = this.f75632j;
        if (set != migrate_all_keys) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z10 = false;
            } else {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                        break;
                    }
                }
                z10 = false;
            }
        }
        return bv.b.boxBoolean(z10);
    }

    @Override // kv.p
    public final Object invoke(o4.j jVar, zu.d<? super Boolean> dVar) {
        return ((s) create(jVar, dVar)).invokeSuspend(x0.f87415a);
    }
}

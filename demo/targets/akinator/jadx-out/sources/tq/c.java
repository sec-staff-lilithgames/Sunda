package tq;

import br.j0;
import br.n0;
import bv.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;
import uu.k0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ d f87336i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object[] f87337j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ n0 f87338k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Object[] objArr, n0 n0Var, zu.d dVar2) {
        super(2, dVar2);
        this.f87336i = dVar;
        this.f87337j = objArr;
        this.f87338k = n0Var;
    }

    @Override // kv.p
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((c) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new c(this.f87336i, this.f87337j, this.f87338k, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        List list;
        av.e.getCOROUTINE_SUSPENDED();
        a0.throwOnFailure(obj);
        d dVar = this.f87336i;
        f fVar = dVar.f87341c;
        Object[] objArr = this.f87337j;
        List<? extends Object> mutableList = y0.toMutableList((Collection) k0.filterNotNull(objArr));
        n0 n0Var = this.f87338k;
        mutableList.add(0, n0Var);
        boolean zA = fVar.a(mutableList);
        x0 x0Var = x0.f87415a;
        if (!zA && (list = (List) dVar.f87345g.get(n0Var)) != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!dVar.f87340b.a(((j0) obj2).getStateGroups())) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dVar.f87342d.a(n0Var, (j0) it.next(), Arrays.copyOf(objArr, objArr.length));
                }
            }
        }
        return x0Var;
    }
}

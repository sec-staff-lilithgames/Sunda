package l2;

import java.util.ArrayList;
import java.util.HashSet;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f72363i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f72364j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ ArrayList f72365k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ m0 f72366l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h1 f72367m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(ArrayList arrayList, m0 m0Var, h1 h1Var, zu.d dVar) {
        super(2, dVar);
        this.f72365k = arrayList;
        this.f72366l = m0Var;
        this.f72367m = h1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        r0 r0Var = new r0(this.f72365k, this.f72366l, this.f72367m, dVar);
        r0Var.f72364j = obj;
        return r0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f72363i;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f72364j;
            ArrayList arrayList = this.f72365k;
            HashSet hashSet = new HashSet(arrayList.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj2 = arrayList.get(i11);
                if (hashSet.add((w) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                arrayList3.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new q0(this.f72366l, (w) arrayList2.get(i12), this.f72367m, null), 3, null));
            }
            this.f72363i = 1;
            if (AwaitKt.joinAll(arrayList3, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tu.a0.throwOnFailure(obj);
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((r0) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

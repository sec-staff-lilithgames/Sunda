package d0;

import android.view.View;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import p0.v5;
import p0.z4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c3 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f51334i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f51335j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ y3 f51336k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ k3 f51337l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ View f51338m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s2.e f51339n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f51340o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ MutableSharedFlow f51341p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v5 f51342q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v5 f51343r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v5 f51344s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v5 f51345t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51346u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ v5 f51347v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(y3 y3Var, k3 k3Var, View view, s2.e eVar, float f10, MutableSharedFlow mutableSharedFlow, v5 v5Var, v5 v5Var2, v5 v5Var3, v5 v5Var4, p0.j2 j2Var, v5 v5Var5, zu.d dVar) {
        super(2, dVar);
        this.f51336k = y3Var;
        this.f51337l = k3Var;
        this.f51338m = view;
        this.f51339n = eVar;
        this.f51340o = f10;
        this.f51341p = mutableSharedFlow;
        this.f51342q = v5Var;
        this.f51343r = v5Var2;
        this.f51344s = v5Var3;
        this.f51345t = v5Var4;
        this.f51346u = j2Var;
        this.f51347v = v5Var5;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        c3 c3Var = new c3(this.f51336k, this.f51337l, this.f51338m, this.f51339n, this.f51340o, this.f51341p, this.f51342q, this.f51343r, this.f51344s, this.f51345t, this.f51346u, this.f51347v, dVar);
        c3Var.f51335j = obj;
        return c3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        w3 w3Var;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f51334i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w3Var = (w3) this.f51335j;
            try {
                tu.a0.throwOnFailure(obj);
                w3Var.dismiss();
                return tu.x0.f87415a;
            } catch (Throwable th2) {
                th = th2;
                w3Var.dismiss();
                throw th;
            }
        }
        tu.a0.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f51335j;
        View view = this.f51338m;
        float f10 = this.f51340o;
        y3 y3Var = this.f51336k;
        k3 k3Var = this.f51337l;
        s2.e eVar = this.f51339n;
        w3 w3VarCreate = y3Var.create(k3Var, view, eVar, f10);
        kotlin.jvm.internal.a1 a1Var = new kotlin.jvm.internal.a1();
        long jMo3735getSizeYbymL2g = w3VarCreate.mo3735getSizeYbymL2g();
        kv.l lVarM3701access$invoke$lambda6 = j3.m3701access$invoke$lambda6(this.f51342q);
        if (lVarM3701access$invoke$lambda6 != null) {
            lVarM3701access$invoke$lambda6.invoke(s2.o.m6899boximpl(eVar.mo3423toDpSizekrfVVM(s2.w.m6981toSizeozmzZPI(jMo3735getSizeYbymL2g))));
        }
        a1Var.f71813b = jMo3735getSizeYbymL2g;
        FlowKt.launchIn(FlowKt.onEach(this.f51341p, new a3(w3VarCreate, null)), coroutineScope);
        try {
            Flow flowSnapshotFlow = z4.snapshotFlow(new b3(w3VarCreate, this.f51339n, this.f51343r, this.f51344s, this.f51345t, this.f51346u, this.f51347v, a1Var, this.f51342q));
            this.f51335j = w3VarCreate;
            this.f51334i = 1;
            if (FlowKt.collect(flowSnapshotFlow, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            w3Var = w3VarCreate;
            w3Var.dismiss();
            return tu.x0.f87415a;
        } catch (Throwable th3) {
            th = th3;
            w3Var = w3VarCreate;
            w3Var.dismiss();
            throw th;
        }
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((c3) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

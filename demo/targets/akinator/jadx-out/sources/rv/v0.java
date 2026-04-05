package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f85101i;

    /* renamed from: j, reason: collision with root package name */
    public Object f85102j;

    /* renamed from: k, reason: collision with root package name */
    public Object f85103k;

    /* renamed from: l, reason: collision with root package name */
    public int f85104l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f85105m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f85106n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kv.p f85107o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(t tVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f85106n = tVar;
        this.f85107o = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        v0 v0Var = new v0(this.f85106n, this.f85107o, dVar);
        v0Var.f85105m = obj;
        return v0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        Iterator<Object> it;
        v vVar = (v) this.f85105m;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f85104l;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            Iterator<Object> it2 = this.f85106n.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                it = it2;
            }
            return tu.x0.f87415a;
        }
        if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        next = this.f85103k;
        it = this.f85101i;
        tu.a0.throwOnFailure(obj);
        while (it.hasNext()) {
            Object next2 = it.next();
            Object objInvoke = this.f85107o.invoke(next, next2);
            this.f85105m = vVar;
            this.f85101i = it;
            this.f85102j = bv.m.nullOutSpilledVariable(next);
            this.f85103k = next2;
            this.f85104l = 1;
            if (vVar.yield(objInvoke, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            next = next2;
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(v vVar, zu.d<? super tu.x0> dVar) {
        return ((v0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class z extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f85119i;

    /* renamed from: j, reason: collision with root package name */
    public Object f85120j;

    /* renamed from: k, reason: collision with root package name */
    public Object f85121k;

    /* renamed from: l, reason: collision with root package name */
    public int f85122l;

    /* renamed from: m, reason: collision with root package name */
    public int f85123m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f85124n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t f85125o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kv.p f85126p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ kv.l f85127q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(t tVar, kv.p pVar, kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f85125o = tVar;
        this.f85126p = pVar;
        this.f85127q = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        z zVar = new z(this.f85125o, this.f85126p, this.f85127q, dVar);
        zVar.f85124n = obj;
        return zVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        Iterator<Object> it;
        v vVar = (v) this.f85124n;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i11 = this.f85123m;
        if (i11 == 0) {
            tu.a0.throwOnFailure(obj);
            i10 = 0;
            it = this.f85125o.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f85122l;
            it = this.f85119i;
            tu.a0.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            int i12 = i10 + 1;
            if (i10 < 0) {
                uu.p0.throwIndexOverflow();
            }
            Object objInvoke = this.f85126p.invoke(bv.b.boxInt(i10), next);
            Iterator<Object> it2 = (Iterator) this.f85127q.invoke(objInvoke);
            this.f85124n = vVar;
            this.f85119i = it;
            this.f85120j = bv.m.nullOutSpilledVariable(next);
            this.f85121k = bv.m.nullOutSpilledVariable(objInvoke);
            this.f85122l = i12;
            this.f85123m = 1;
            if (vVar.yieldAll(it2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i10 = i12;
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(v vVar, zu.d<? super tu.x0> dVar) {
        return ((z) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

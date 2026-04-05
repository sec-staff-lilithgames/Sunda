package g7;

import bv.n;
import f7.o;
import g7.a;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import tu.a0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public int f57386i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a f57387j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f57388k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b1 f57389l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l7.i f57390m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f57391n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b1 f57392o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ a7.g f57393p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, b1 b1Var, b1 b1Var2, l7.i iVar, Object obj, b1 b1Var3, a7.g gVar, zu.d dVar) {
        super(2, dVar);
        this.f57387j = aVar;
        this.f57388k = b1Var;
        this.f57389l = b1Var2;
        this.f57390m = iVar;
        this.f57391n = obj;
        this.f57392o = b1Var3;
        this.f57393p = gVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        return new d(this.f57387j, this.f57388k, this.f57389l, this.f57390m, this.f57391n, this.f57392o, this.f57393p, dVar);
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f57386i;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a0.throwOnFailure(obj);
            return obj;
        }
        a0.throwOnFailure(obj);
        o oVar = (o) this.f57388k.f71816b;
        a7.b bVar = (a7.b) this.f57389l.f71816b;
        l7.o oVar2 = (l7.o) this.f57392o.f71816b;
        this.f57386i = 1;
        Object objAccess$decode = a.access$decode(this.f57387j, oVar, bVar, this.f57390m, this.f57391n, oVar2, this.f57393p, this);
        return objAccess$decode == coroutine_suspended ? coroutine_suspended : objAccess$decode;
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super a.b> dVar) {
        return ((d) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

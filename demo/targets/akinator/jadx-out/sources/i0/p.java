package i0;

import kotlinx.coroutines.CoroutineScope;
import tu.v;
import tu.x0;
import x1.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public v f59318i;

    /* renamed from: j, reason: collision with root package name */
    public v f59319j;

    /* renamed from: k, reason: collision with root package name */
    public int f59320k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f59321l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s f59322m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d0 f59323n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ i1.j f59324o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(s sVar, d0 d0Var, i1.j jVar, zu.d dVar) {
        super(2, dVar);
        this.f59322m = sVar;
        this.f59323n = d0Var;
        this.f59324o = jVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        p pVar = new p(this.f59322m, this.f59323n, this.f59324o, dVar);
        pVar.f59321l = obj;
        return pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {all -> 0x0037, blocks: (B:15:0x0032, B:42:0x00a6, B:44:0x00ac), top: B:79:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010d  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((p) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

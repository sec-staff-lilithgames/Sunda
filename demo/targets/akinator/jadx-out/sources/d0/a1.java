package d0;

import kotlinx.coroutines.CoroutineScope;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public boolean f51284i;

    /* renamed from: j, reason: collision with root package name */
    public int f51285j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f51286k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e0.p2 f51287l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f51288m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ f0.q f51289n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p0.j2 f51290o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v5 f51291p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(e0.p2 p2Var, long j10, f0.q qVar, p0.j2 j2Var, v5 v5Var, zu.d dVar) {
        super(2, dVar);
        this.f51287l = p2Var;
        this.f51288m = j10;
        this.f51289n = qVar;
        this.f51290o = j2Var;
        this.f51291p = v5Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        a1 a1Var = new a1(this.f51287l, this.f51288m, this.f51289n, this.f51290o, this.f51291p, dVar);
        a1Var.f51286k = obj;
        return a1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b4, code lost:
    
        if (r9.emit(r2, r19) != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d5, code lost:
    
        if (r9.emit(r4, r19) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.a1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}

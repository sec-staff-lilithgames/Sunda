package p0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z3 extends bv.n implements kv.q {

    /* renamed from: i, reason: collision with root package name */
    public Job f80656i;

    /* renamed from: j, reason: collision with root package name */
    public int f80657j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f80658k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f80659l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zu.m f80660m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n3 f80661n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(zu.m mVar, n3 n3Var, zu.d dVar) {
        super(3, dVar);
        this.f80660m = mVar;
        this.f80661n = n3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b6, code lost:
    
        if (p0.n3.access$awaitWorkAvailable(r10, r18) == r0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a7, code lost:
    
        if (kotlinx.coroutines.JobKt.cancelAndJoin(r2, r18) != r0) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0188  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b6 -> B:25:0x00ba). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.z3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.q
    public final Object invoke(CoroutineScope coroutineScope, d2 d2Var, zu.d<? super tu.x0> dVar) {
        z3 z3Var = new z3(this.f80660m, this.f80661n, dVar);
        z3Var.f80658k = coroutineScope;
        z3Var.f80659l = d2Var;
        return z3Var.invokeSuspend(tu.x0.f87415a);
    }
}

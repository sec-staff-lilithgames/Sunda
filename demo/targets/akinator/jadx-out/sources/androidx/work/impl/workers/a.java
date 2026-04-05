package androidx.work.impl.workers;

import bv.n;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kv.p;
import n6.a0;
import n6.b0;
import r6.l;
import sh.n1;
import tu.x0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a extends n implements p {

    /* renamed from: i, reason: collision with root package name */
    public n1 f7524i;

    /* renamed from: j, reason: collision with root package name */
    public Job f7525j;

    /* renamed from: k, reason: collision with root package name */
    public int f7526k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7527l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ b0 f7528m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f7529n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v6.b0 f7530o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b0 b0Var, l lVar, v6.b0 b0Var2, d dVar) {
        super(2, dVar);
        this.f7528m = b0Var;
        this.f7529n = lVar;
        this.f7530o = b0Var2;
    }

    @Override // bv.a
    public final d<x0> create(Object obj, d<?> dVar) {
        a aVar = new a(this.f7528m, this.f7529n, this.f7530o, dVar);
        aVar.f7527l = obj;
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d1 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, kotlinx.coroutines.Job] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.workers.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super a0> dVar) {
        return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}

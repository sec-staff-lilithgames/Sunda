package androidx.lifecycle;

import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m extends r1 {

    /* renamed from: m, reason: collision with root package name */
    public f f6661m;

    /* renamed from: n, reason: collision with root package name */
    public x f6662n;

    public /* synthetic */ m(zu.m mVar, long j10, kv.p pVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? zu.n.f98854b : mVar, (i10 & 2) != 0 ? 5000L : j10, pVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object clearSource$lifecycle_livedata_release(zu.d<? super tu.x0> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.lifecycle.k
            if (r0 == 0) goto L13
            r0 = r5
            androidx.lifecycle.k r0 = (androidx.lifecycle.k) r0
            int r1 = r0.f6634k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6634k = r1
            goto L18
        L13:
            androidx.lifecycle.k r0 = new androidx.lifecycle.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f6632i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6634k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r5)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            tu.a0.throwOnFailure(r5)
            androidx.lifecycle.x r5 = r4.f6662n
            if (r5 == 0) goto L41
            r0.f6634k = r3
            java.lang.Object r5 = r5.disposeNow(r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            r5 = 0
            r4.f6662n = r5
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m.clearSource$lifecycle_livedata_release(zu.d):java.lang.Object");
    }

    @Override // androidx.lifecycle.r1, androidx.lifecycle.l1
    public final void d() {
        super.d();
        f fVar = this.f6661m;
        if (fVar != null) {
            fVar.maybeRun();
        }
    }

    @Override // androidx.lifecycle.r1, androidx.lifecycle.l1
    public final void e() {
        super.e();
        f fVar = this.f6661m;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r7 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emitSource$lifecycle_livedata_release(androidx.lifecycle.l1 r6, zu.d<? super kotlinx.coroutines.DisposableHandle> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof androidx.lifecycle.l
            if (r0 == 0) goto L13
            r0 = r7
            androidx.lifecycle.l r0 = (androidx.lifecycle.l) r0
            int r1 = r0.f6644l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6644l = r1
            goto L18
        L13:
            androidx.lifecycle.l r0 = new androidx.lifecycle.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f6642j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f6644l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r7)
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            androidx.lifecycle.l1 r6 = r0.f6641i
            tu.a0.throwOnFailure(r7)
            goto L48
        L3a:
            tu.a0.throwOnFailure(r7)
            r0.f6641i = r6
            r0.f6644l = r4
            java.lang.Object r7 = r5.clearSource$lifecycle_livedata_release(r0)
            if (r7 != r1) goto L48
            goto L53
        L48:
            r7 = 0
            r0.f6641i = r7
            r0.f6644l = r3
            java.lang.Object r7 = androidx.lifecycle.q.addDisposableSource(r5, r6, r0)
            if (r7 != r1) goto L54
        L53:
            return r1
        L54:
            androidx.lifecycle.x r7 = (androidx.lifecycle.x) r7
            r5.f6662n = r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.m.emitSource$lifecycle_livedata_release(androidx.lifecycle.l1, zu.d):java.lang.Object");
    }

    public m(zu.m context, long j10, kv.p block) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(block, "block");
        this.f6661m = new f(this, block, j10, CoroutineScopeKt.CoroutineScope(Dispatchers.getMain().getImmediate().plus(context).plus(SupervisorKt.SupervisorJob((Job) context.get(Job.Key)))), new a1.e(this, 1));
    }
}

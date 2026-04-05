package k4;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 implements l1 {

    /* renamed from: a, reason: collision with root package name */
    public final Mutex f70460a;

    /* renamed from: b, reason: collision with root package name */
    public final c f70461b;

    /* renamed from: c, reason: collision with root package name */
    public final Flow f70462c;

    public p2(String filePath) {
        kotlin.jvm.internal.e0.checkNotNullParameter(filePath, "filePath");
        this.f70460a = MutexKt.Mutex$default(false, 1, null);
        this.f70461b = new c(0);
        this.f70462c = FlowKt.flow(new o2(2, null));
    }

    @Override // k4.l1
    public Flow<tu.x0> getUpdateNotifications() {
        return this.f70462c;
    }

    @Override // k4.l1
    public Object getVersion(zu.d<? super Integer> dVar) {
        return bv.b.boxInt(this.f70461b.get());
    }

    @Override // k4.l1
    public Object incrementAndGetVersion(zu.d<? super Integer> dVar) {
        return bv.b.boxInt(this.f70461b.incrementAndGet());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object lock(kv.l r8, zu.d<? super T> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof k4.m2
            if (r0 == 0) goto L13
            r0 = r9
            k4.m2 r0 = (k4.m2) r0
            int r1 = r0.f70423m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70423m = r1
            goto L18
        L13:
            k4.m2 r0 = new k4.m2
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f70421k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70423m
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L47
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r8 = r0.f70419i
            kotlinx.coroutines.sync.Mutex r8 = (kotlinx.coroutines.sync.Mutex) r8
            tu.a0.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L31
            goto L69
        L31:
            r9 = move-exception
            goto L71
        L33:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3b:
            kotlinx.coroutines.sync.Mutex r8 = r0.f70420j
            java.lang.Object r2 = r0.f70419i
            kv.l r2 = (kv.l) r2
            tu.a0.throwOnFailure(r9)
            r9 = r8
            r8 = r2
            goto L59
        L47:
            tu.a0.throwOnFailure(r9)
            r0.f70419i = r8
            kotlinx.coroutines.sync.Mutex r9 = r7.f70460a
            r0.f70420j = r9
            r0.f70423m = r4
            java.lang.Object r2 = r9.lock(r5, r0)
            if (r2 != r1) goto L59
            goto L65
        L59:
            r0.f70419i = r9     // Catch: java.lang.Throwable -> L6d
            r0.f70420j = r5     // Catch: java.lang.Throwable -> L6d
            r0.f70423m = r3     // Catch: java.lang.Throwable -> L6d
            java.lang.Object r8 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L6d
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            r6 = r9
            r9 = r8
            r8 = r6
        L69:
            r8.unlock(r5)
            return r9
        L6d:
            r8 = move-exception
            r6 = r9
            r9 = r8
            r8 = r6
        L71:
            r8.unlock(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p2.lock(kv.l, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public <T> java.lang.Object tryLock(kv.p r7, zu.d<? super T> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof k4.n2
            if (r0 == 0) goto L13
            r0 = r8
            k4.n2 r0 = (k4.n2) r0
            int r1 = r0.f70431m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70431m = r1
            goto L18
        L13:
            k4.n2 r0 = new k4.n2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f70429k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f70431m
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            boolean r7 = r0.f70428j
            kotlinx.coroutines.sync.Mutex r0 = r0.f70427i
            tu.a0.throwOnFailure(r8)     // Catch: java.lang.Throwable -> L2e
            goto L55
        L2e:
            r8 = move-exception
            goto L5f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            tu.a0.throwOnFailure(r8)
            kotlinx.coroutines.sync.Mutex r8 = r6.f70460a
            boolean r2 = r8.tryLock(r4)
            java.lang.Boolean r5 = bv.b.boxBoolean(r2)     // Catch: java.lang.Throwable -> L5b
            r0.f70427i = r8     // Catch: java.lang.Throwable -> L5b
            r0.f70428j = r2     // Catch: java.lang.Throwable -> L5b
            r0.f70431m = r3     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r7 = r7.invoke(r5, r0)     // Catch: java.lang.Throwable -> L5b
            if (r7 != r1) goto L52
            return r1
        L52:
            r0 = r8
            r8 = r7
            r7 = r2
        L55:
            if (r7 == 0) goto L5a
            r0.unlock(r4)
        L5a:
            return r8
        L5b:
            r7 = move-exception
            r0 = r8
            r8 = r7
            r7 = r2
        L5f:
            if (r7 == 0) goto L64
            r0.unlock(r4)
        L64:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.p2.tryLock(kv.p, zu.d):java.lang.Object");
    }
}

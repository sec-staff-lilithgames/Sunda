package t1;

import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public kv.a f86255a = new b(this);

    /* renamed from: b, reason: collision with root package name */
    public CoroutineScope f86256b;

    /* renamed from: c, reason: collision with root package name */
    public a f86257c;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /* renamed from: dispatchPostFling-RZ2iAVY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7015dispatchPostFlingRZ2iAVY(long r8, long r10, zu.d<? super s2.e0> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof t1.c
            if (r0 == 0) goto L14
            r0 = r12
            t1.c r0 = (t1.c) r0
            int r1 = r0.f86251k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f86251k = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            t1.c r0 = new t1.c
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f86249i
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f86251k
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            tu.a0.throwOnFailure(r12)
            goto L45
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            tu.a0.throwOnFailure(r12)
            t1.a r1 = r7.f86257c
            if (r1 == 0) goto L4c
            r6.f86251k = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.mo24onPostFlingRZ2iAVY(r2, r4, r6)
            if (r12 != r0) goto L45
            return r0
        L45:
            s2.e0 r12 = (s2.e0) r12
            long r8 = r12.m6808unboximpl()
            goto L52
        L4c:
            s2.d0 r8 = s2.e0.f85330b
            long r8 = r8.m6777getZero9UxMQ8M()
        L52:
            s2.e0 r8 = s2.e0.m6790boximpl(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.e.m7015dispatchPostFlingRZ2iAVY(long, long, zu.d):java.lang.Object");
    }

    /* renamed from: dispatchPostScroll-DzOQY0M, reason: not valid java name */
    public final long m7016dispatchPostScrollDzOQY0M(long j10, long j11, int i10) {
        a aVar = this.f86257c;
        return aVar != null ? aVar.mo25onPostScrollDzOQY0M(j10, j11, i10) : i1.h.f59344b.m4173getZeroF1C5BW0();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: dispatchPreFling-QWom1Mo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m7017dispatchPreFlingQWom1Mo(long r5, zu.d<? super s2.e0> r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t1.d
            if (r0 == 0) goto L13
            r0 = r7
            t1.d r0 = (t1.d) r0
            int r1 = r0.f86254k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f86254k = r1
            goto L18
        L13:
            t1.d r0 = new t1.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f86252i
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f86254k
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            tu.a0.throwOnFailure(r7)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            tu.a0.throwOnFailure(r7)
            t1.a r7 = r4.f86257c
            if (r7 == 0) goto L48
            r0.f86254k = r3
            java.lang.Object r7 = r7.mo26onPreFlingQWom1Mo(r5, r0)
            if (r7 != r1) goto L41
            return r1
        L41:
            s2.e0 r7 = (s2.e0) r7
            long r5 = r7.m6808unboximpl()
            goto L4e
        L48:
            s2.d0 r5 = s2.e0.f85330b
            long r5 = r5.m6777getZero9UxMQ8M()
        L4e:
            s2.e0 r5 = s2.e0.m6790boximpl(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.e.m7017dispatchPreFlingQWom1Mo(long, zu.d):java.lang.Object");
    }

    /* renamed from: dispatchPreScroll-OzD1aCk, reason: not valid java name */
    public final long m7018dispatchPreScrollOzD1aCk(long j10, int i10) {
        a aVar = this.f86257c;
        return aVar != null ? aVar.mo27onPreScrollOzD1aCk(j10, i10) : i1.h.f59344b.m4173getZeroF1C5BW0();
    }

    public final kv.a getCalculateNestedScrollScope$ui_release() {
        return this.f86255a;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = (CoroutineScope) this.f86255a.invoke();
        if (coroutineScope != null) {
            return coroutineScope;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    public final CoroutineScope getOriginNestedScrollScope$ui_release() {
        return this.f86256b;
    }

    public final a getParent$ui_release() {
        return this.f86257c;
    }

    public final void setCalculateNestedScrollScope$ui_release(kv.a aVar) {
        e0.checkNotNullParameter(aVar, "<set-?>");
        this.f86255a = aVar;
    }

    public final void setOriginNestedScrollScope$ui_release(CoroutineScope coroutineScope) {
        this.f86256b = coroutineScope;
    }

    public final void setParent$ui_release(a aVar) {
        this.f86257c = aVar;
    }
}

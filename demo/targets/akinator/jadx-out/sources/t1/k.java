package t1;

import e1.v;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CoroutineScope;
import kv.p;
import p0.j2;
import p0.o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k implements y1.b, y1.d, a {

    /* renamed from: b, reason: collision with root package name */
    public final e f86274b;

    /* renamed from: c, reason: collision with root package name */
    public final a f86275c;

    /* renamed from: e, reason: collision with root package name */
    public final j2 f86276e;

    public k(e dispatcher, a connection) {
        e0.checkNotNullParameter(dispatcher, "dispatcher");
        e0.checkNotNullParameter(connection, "connection");
        this.f86274b = dispatcher;
        this.f86275c = connection;
        dispatcher.setCalculateNestedScrollScope$ui_release(new h(this));
        this.f86276e = o5.mutableStateOf$default(null, null, 2, null);
    }

    public final CoroutineScope a() {
        CoroutineScope coroutineScopeA;
        k kVarB = b();
        if (kVarB != null && (coroutineScopeA = kVarB.a()) != null) {
            return coroutineScopeA;
        }
        CoroutineScope originNestedScrollScope$ui_release = this.f86274b.getOriginNestedScrollScope$ui_release();
        if (originNestedScrollScope$ui_release != null) {
            return originNestedScrollScope$ui_release;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    public final k b() {
        return (k) this.f86276e.getValue();
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final a getConnection() {
        return this.f86275c;
    }

    public final e getDispatcher() {
        return this.f86274b;
    }

    @Override // y1.d
    public y1.f getKey() {
        return m.getModifierLocalNestedScroll();
    }

    @Override // y1.b
    public void onModifierLocalsUpdated(y1.e scope) {
        e0.checkNotNullParameter(scope, "scope");
        this.f86276e.setValue((k) scope.getCurrent(m.getModifierLocalNestedScroll()));
        this.f86274b.setParent$ui_release(b());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // t1.a
    /* renamed from: onPostFling-RZ2iAVY */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo24onPostFlingRZ2iAVY(long r11, long r13, zu.d<? super s2.e0> r15) {
        /*
            r10 = this;
            boolean r0 = r15 instanceof t1.i
            if (r0 == 0) goto L14
            r0 = r15
            t1.i r0 = (t1.i) r0
            int r1 = r0.f86268n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f86268n = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            t1.i r0 = new t1.i
            r0.<init>(r10, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.f86266l
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r6.f86268n
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 == r2) goto L38
            if (r1 != r7) goto L30
            long r11 = r6.f86264j
            tu.a0.throwOnFailure(r15)
            goto L7e
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            long r13 = r6.f86265k
            long r11 = r6.f86264j
            t1.k r1 = r6.f86263i
            tu.a0.throwOnFailure(r15)
            goto L5b
        L42:
            tu.a0.throwOnFailure(r15)
            r6.f86263i = r10
            r6.f86264j = r11
            r6.f86265k = r13
            r6.f86268n = r2
            t1.a r1 = r10.f86275c
            r2 = r11
            r4 = r13
            java.lang.Object r15 = r1.mo24onPostFlingRZ2iAVY(r2, r4, r6)
            if (r15 != r0) goto L58
            goto L7c
        L58:
            r1 = r10
            r11 = r2
            r13 = r4
        L5b:
            s2.e0 r15 = (s2.e0) r15
            long r8 = r15.m6808unboximpl()
            t1.k r1 = r1.b()
            if (r1 == 0) goto L86
            long r2 = s2.e0.m6803plusAH228Gc(r11, r8)
            long r4 = s2.e0.m6802minusAH228Gc(r13, r8)
            r11 = 0
            r6.f86263i = r11
            r6.f86264j = r8
            r6.f86268n = r7
            java.lang.Object r15 = r1.mo24onPostFlingRZ2iAVY(r2, r4, r6)
            if (r15 != r0) goto L7d
        L7c:
            return r0
        L7d:
            r11 = r8
        L7e:
            s2.e0 r15 = (s2.e0) r15
            long r13 = r15.m6808unboximpl()
            r8 = r11
            goto L8c
        L86:
            s2.d0 r11 = s2.e0.f85330b
            long r13 = r11.m6777getZero9UxMQ8M()
        L8c:
            long r11 = s2.e0.m6803plusAH228Gc(r8, r13)
            s2.e0 r11 = s2.e0.m6790boximpl(r11)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.k.mo24onPostFlingRZ2iAVY(long, long, zu.d):java.lang.Object");
    }

    @Override // t1.a
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo25onPostScrollDzOQY0M(long j10, long j11, int i10) {
        long jMo25onPostScrollDzOQY0M = this.f86275c.mo25onPostScrollDzOQY0M(j10, j11, i10);
        k kVarB = b();
        return i1.h.m4190plusMKHz9U(jMo25onPostScrollDzOQY0M, kVarB != null ? kVarB.mo25onPostScrollDzOQY0M(i1.h.m4190plusMKHz9U(j10, jMo25onPostScrollDzOQY0M), i1.h.m4189minusMKHz9U(j11, jMo25onPostScrollDzOQY0M), i10) : i1.h.f59344b.m4173getZeroF1C5BW0());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0078, code lost:
    
        if (r11 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // t1.a
    /* renamed from: onPreFling-QWom1Mo */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo26onPreFlingQWom1Mo(long r9, zu.d<? super s2.e0> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof t1.j
            if (r0 == 0) goto L13
            r0 = r11
            t1.j r0 = (t1.j) r0
            int r1 = r0.f86273m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f86273m = r1
            goto L18
        L13:
            t1.j r0 = new t1.j
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f86271k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f86273m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            long r9 = r0.f86270j
            tu.a0.throwOnFailure(r11)
            goto L7b
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            long r9 = r0.f86270j
            t1.k r2 = r0.f86269i
            tu.a0.throwOnFailure(r11)
            goto L55
        L3e:
            tu.a0.throwOnFailure(r11)
            t1.k r11 = r8.b()
            if (r11 == 0) goto L5f
            r0.f86269i = r8
            r0.f86270j = r9
            r0.f86273m = r4
            java.lang.Object r11 = r11.mo26onPreFlingQWom1Mo(r9, r0)
            if (r11 != r1) goto L54
            goto L7a
        L54:
            r2 = r8
        L55:
            s2.e0 r11 = (s2.e0) r11
            long r4 = r11.m6808unboximpl()
        L5b:
            r6 = r4
            r4 = r9
            r9 = r6
            goto L67
        L5f:
            s2.d0 r11 = s2.e0.f85330b
            long r4 = r11.m6777getZero9UxMQ8M()
            r2 = r8
            goto L5b
        L67:
            t1.a r11 = r2.f86275c
            long r4 = s2.e0.m6802minusAH228Gc(r4, r9)
            r2 = 0
            r0.f86269i = r2
            r0.f86270j = r9
            r0.f86273m = r3
            java.lang.Object r11 = r11.mo26onPreFlingQWom1Mo(r4, r0)
            if (r11 != r1) goto L7b
        L7a:
            return r1
        L7b:
            s2.e0 r11 = (s2.e0) r11
            long r0 = r11.m6808unboximpl()
            long r9 = s2.e0.m6803plusAH228Gc(r9, r0)
            s2.e0 r9 = s2.e0.m6790boximpl(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.k.mo26onPreFlingQWom1Mo(long, zu.d):java.lang.Object");
    }

    @Override // t1.a
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo27onPreScrollOzD1aCk(long j10, int i10) {
        k kVarB = b();
        long jMo27onPreScrollOzD1aCk = kVarB != null ? kVarB.mo27onPreScrollOzD1aCk(j10, i10) : i1.h.f59344b.m4173getZeroF1C5BW0();
        return i1.h.m4190plusMKHz9U(jMo27onPreScrollOzD1aCk, this.f86275c.mo27onPreScrollOzD1aCk(i1.h.m4189minusMKHz9U(j10, jMo27onPreScrollOzD1aCk), i10));
    }

    @Override // y1.b, e1.u, e1.v
    public /* bridge */ /* synthetic */ v then(v vVar) {
        return super.then(vVar);
    }

    @Override // y1.d
    public k getValue() {
        return this;
    }
}

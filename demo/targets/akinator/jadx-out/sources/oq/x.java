package oq;

import android.view.View;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x implements b {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f79811a;

    /* renamed from: b, reason: collision with root package name */
    public final dq.q f79812b;

    /* renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f79813c;

    public x(CoroutineScope coroutineScope, dq.q coroutineDispatchers) {
        e0.checkNotNullParameter(coroutineScope, "coroutineScope");
        e0.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f79811a = coroutineScope;
        this.f79812b = coroutineDispatchers;
        this.f79813c = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(android.view.View r9, br.i r10, boolean r11, boolean r12, java.lang.Runnable r13, java.lang.Runnable r14, zu.d<? super tu.x0> r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof oq.t
            if (r0 == 0) goto L13
            r0 = r15
            oq.t r0 = (oq.t) r0
            int r1 = r0.f79803q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79803q = r1
            goto L18
        L13:
            oq.t r0 = new oq.t
            r0.<init>(r8, r15)
        L18:
            java.lang.Object r15 = r0.f79801o
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f79803q
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            boolean r11 = r0.f79800n
            oq.a r9 = r0.f79799m
            java.lang.Runnable r14 = r0.f79798l
            java.lang.Runnable r13 = r0.f79797k
            br.i r10 = r0.f79796j
            android.view.View r12 = r0.f79795i
            tu.a0.throwOnFailure(r15)
            r2 = r9
            r3 = r12
        L36:
            r4 = r10
            r7 = r11
            r5 = r13
            r6 = r14
            goto L89
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            tu.a0.throwOnFailure(r15)
            int r15 = r9.getId()
            java.lang.Integer r15 = bv.b.boxInt(r15)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f79813c
            java.lang.Object r15 = r2.get(r15)
            oq.a r15 = (oq.a) r15
            if (r15 != 0) goto L63
            if (r13 == 0) goto L5d
            r13.run()
        L5d:
            if (r14 == 0) goto L8f
            r14.run()
            goto L8f
        L63:
            if (r12 == 0) goto L86
            r0.f79795i = r9
            r0.f79796j = r10
            r0.f79797k = r13
            r0.f79798l = r14
            r0.f79799m = r15
            r0.f79800n = r11
            r0.f79803q = r3
            dq.q r12 = r8.f79812b
            kotlinx.coroutines.CoroutineDispatcher r12 = r12.e()
            oq.p r2 = new oq.p
            r3 = 0
            r2.<init>(r9, r3)
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r2, r0)
            if (r12 != r1) goto L86
            return r1
        L86:
            r3 = r9
            r2 = r15
            goto L36
        L89:
            r2.a(r3, r4)
            r2.a(r3, r4, r5, r6, r7)
        L8f:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.x.b(android.view.View, br.i, boolean, boolean, java.lang.Runnable, java.lang.Runnable, zu.d):java.lang.Object");
    }

    @Override // oq.b
    public boolean a(int i10) {
        a aVar = (a) this.f79813c.get(Integer.valueOf(i10));
        return aVar != null && aVar.b();
    }

    @Override // oq.b
    public void a(dq.h adElement, boolean z10, br.i eventType) {
        e0.checkNotNullParameter(adElement, "adElement");
        e0.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.f79811a, this.f79812b.d(), null, new j(this, adElement, z10, eventType, null), 2, null);
    }

    @Override // oq.b
    public void a(dq.i adPhase, br.i eventType) {
        e0.checkNotNullParameter(adPhase, "adPhase");
        e0.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.f79811a, this.f79812b.d(), null, new k(this, adPhase, eventType, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.view.View r5, oq.a r6, br.i r7, boolean r8, zu.d<? super tu.x0> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof oq.l
            if (r0 == 0) goto L13
            r0 = r9
            oq.l r0 = (oq.l) r0
            int r1 = r0.f79760n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79760n = r1
            goto L18
        L13:
            oq.l r0 = new oq.l
            r0.<init>(r4, r9)
        L18:
            java.lang.Object r9 = r0.f79758l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f79760n
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            br.i r7 = r0.f79757k
            oq.a r6 = r0.f79756j
            android.view.View r5 = r0.f79755i
            tu.a0.throwOnFailure(r9)
            goto L64
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            tu.a0.throwOnFailure(r9)
            int r9 = r5.getId()
            java.lang.Integer r9 = bv.b.boxInt(r9)
            java.util.concurrent.ConcurrentHashMap r2 = r4.f79813c
            r2.put(r9, r6)
            if (r8 == 0) goto L64
            r0.f79755i = r5
            r0.f79756j = r6
            r0.f79757k = r7
            r0.f79760n = r3
            dq.q r8 = r4.f79812b
            kotlinx.coroutines.CoroutineDispatcher r8 = r8.e()
            oq.p r9 = new oq.p
            r2 = 0
            r9.<init>(r5, r2)
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r8, r9, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            r6.a(r5, r7)
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.x.a(android.view.View, oq.a, br.i, boolean, zu.d):java.lang.Object");
    }

    @Override // oq.b
    public void b(dq.h adElement, br.i eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        e0.checkNotNullParameter(adElement, "adElement");
        e0.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.f79811a, this.f79812b.d(), null, new m(this, adElement, eventType, z10, runnable, runnable2, null), 2, null);
    }

    @Override // oq.b
    public void a(dq.h adElement, br.i eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        e0.checkNotNullParameter(adElement, "adElement");
        e0.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.f79811a, this.f79812b.d(), null, new s(this, adElement, eventType, z10, runnable, runnable2, null), 2, null);
    }

    public Object b(View view, zu.d<? super x0> dVar) {
        a aVar = (a) this.f79813c.remove(bv.b.boxInt(view.getId()));
        if (aVar != null) {
            aVar.a();
        }
        return x0.f87415a;
    }

    @Override // oq.b
    public void a(dq.i adPhase, br.i eventType, boolean z10, Runnable runnable, Runnable runnable2) {
        e0.checkNotNullParameter(adPhase, "adPhase");
        e0.checkNotNullParameter(eventType, "eventType");
        BuildersKt__Builders_commonKt.launch$default(this.f79811a, this.f79812b.d(), null, new n(this, adPhase, eventType, z10, runnable, runnable2, null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(android.view.View r9, br.i r10, boolean r11, boolean r12, java.lang.Runnable r13, java.lang.Runnable r14, zu.d<? super tu.x0> r15) {
        /*
            r8 = this;
            boolean r0 = r15 instanceof oq.o
            if (r0 == 0) goto L13
            r0 = r15
            oq.o r0 = (oq.o) r0
            int r1 = r0.f79783q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79783q = r1
            goto L18
        L13:
            oq.o r0 = new oq.o
            r0.<init>(r8, r15)
        L18:
            java.lang.Object r15 = r0.f79781o
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f79783q
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 != r3) goto L3b
            boolean r11 = r0.f79780n
            oq.a r9 = r0.f79779m
            java.lang.Runnable r14 = r0.f79778l
            java.lang.Runnable r13 = r0.f79777k
            br.i r10 = r0.f79776j
            android.view.View r12 = r0.f79775i
            tu.a0.throwOnFailure(r15)
            r2 = r9
            r3 = r12
        L36:
            r4 = r10
            r7 = r11
            r5 = r13
            r6 = r14
            goto L89
        L3b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L43:
            tu.a0.throwOnFailure(r15)
            int r15 = r9.getId()
            java.lang.Integer r15 = bv.b.boxInt(r15)
            java.util.concurrent.ConcurrentHashMap r2 = r8.f79813c
            java.lang.Object r15 = r2.get(r15)
            oq.a r15 = (oq.a) r15
            if (r15 != 0) goto L63
            if (r13 == 0) goto L5d
            r13.run()
        L5d:
            if (r14 == 0) goto L8c
            r14.run()
            goto L8c
        L63:
            if (r12 == 0) goto L86
            r0.f79775i = r9
            r0.f79776j = r10
            r0.f79777k = r13
            r0.f79778l = r14
            r0.f79779m = r15
            r0.f79780n = r11
            r0.f79783q = r3
            dq.q r12 = r8.f79812b
            kotlinx.coroutines.CoroutineDispatcher r12 = r12.e()
            oq.p r2 = new oq.p
            r3 = 0
            r2.<init>(r9, r3)
            java.lang.Object r12 = kotlinx.coroutines.BuildersKt.withContext(r12, r2, r0)
            if (r12 != r1) goto L86
            return r1
        L86:
            r3 = r9
            r2 = r15
            goto L36
        L89:
            r2.a(r3, r4, r5, r6, r7)
        L8c:
            tu.x0 r9 = tu.x0.f87415a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: oq.x.a(android.view.View, br.i, boolean, boolean, java.lang.Runnable, java.lang.Runnable, zu.d):java.lang.Object");
    }

    @Override // oq.b
    public void a(dq.h adElement) {
        e0.checkNotNullParameter(adElement, "adElement");
        BuildersKt__Builders_commonKt.launch$default(this.f79811a, this.f79812b.d(), null, new u(this, adElement, null), 2, null);
    }

    @Override // oq.b
    public void a(dq.i adPhase) {
        e0.checkNotNullParameter(adPhase, "adPhase");
        BuildersKt__Builders_commonKt.launch$default(this.f79811a, this.f79812b.d(), null, new v(this, adPhase, null), 2, null);
    }

    @Override // oq.b
    public void a() {
        BuildersKt__Builders_commonKt.launch$default(this.f79811a, this.f79812b.d(), null, new w(this, null), 2, null);
    }

    public static final Object a(x xVar, dq.h hVar, zu.d dVar) {
        return BuildersKt.withContext(xVar.f79812b.e(), new q(hVar, null), dVar);
    }

    public static final Object a(x xVar, dq.i iVar, zu.d dVar) {
        return BuildersKt.withContext(xVar.f79812b.e(), new r(iVar, null), dVar);
    }
}

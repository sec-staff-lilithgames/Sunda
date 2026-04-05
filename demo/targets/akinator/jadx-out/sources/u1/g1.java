package u1;

import a2.g5;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g1 extends i0 implements j0, k0, s2.e {

    /* renamed from: e, reason: collision with root package name */
    public final g5 f87575e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s2.e f87576f;

    /* renamed from: g, reason: collision with root package name */
    public m f87577g;

    /* renamed from: h, reason: collision with root package name */
    public final r0.c f87578h;

    /* renamed from: i, reason: collision with root package name */
    public final r0.c f87579i;

    /* renamed from: j, reason: collision with root package name */
    public m f87580j;

    /* renamed from: k, reason: collision with root package name */
    public long f87581k;

    /* renamed from: l, reason: collision with root package name */
    public CoroutineScope f87582l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f87583m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a implements c, s2.e, zu.d {

        /* renamed from: b, reason: collision with root package name */
        public final zu.d f87584b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g1 f87585c;

        /* renamed from: e, reason: collision with root package name */
        public CancellableContinuation f87586e;

        /* renamed from: f, reason: collision with root package name */
        public o f87587f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g1 f87588g;

        public a(g1 g1Var, zu.d<Object> completion) {
            kotlin.jvm.internal.e0.checkNotNullParameter(completion, "completion");
            this.f87588g = g1Var;
            this.f87584b = completion;
            this.f87585c = g1Var;
            this.f87587f = o.f87647c;
        }

        @Override // u1.c
        public Object awaitPointerEvent(o oVar, zu.d<? super m> dVar) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
            cancellableContinuationImpl.initCancellability();
            this.f87587f = oVar;
            this.f87586e = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == av.e.getCOROUTINE_SUSPENDED()) {
                bv.h.probeCoroutineSuspended(dVar);
            }
            return result;
        }

        public final void cancel(Throwable th2) {
            CancellableContinuation cancellableContinuation = this.f87586e;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(th2);
            }
            this.f87586e = null;
        }

        @Override // zu.d
        public zu.m getContext() {
            return zu.n.f98854b;
        }

        @Override // u1.c
        public m getCurrentEvent() {
            return this.f87588g.f87577g;
        }

        @Override // u1.c, s2.e
        public float getDensity() {
            return this.f87585c.getDensity();
        }

        @Override // u1.c
        /* renamed from: getExtendedTouchPadding-NH-jbRc */
        public long mo7284getExtendedTouchPaddingNHjbRc() {
            return this.f87588g.mo7318getExtendedTouchPaddingNHjbRc();
        }

        @Override // u1.c, s2.e
        public float getFontScale() {
            return this.f87585c.getFontScale();
        }

        @Override // u1.c
        /* renamed from: getSize-YbymL2g */
        public long mo7285getSizeYbymL2g() {
            return this.f87588g.f87581k;
        }

        @Override // u1.c
        public g5 getViewConfiguration() {
            return this.f87588g.getViewConfiguration();
        }

        public final void offerPointerEvent(m event, o pass) {
            CancellableContinuation cancellableContinuation;
            kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
            kotlin.jvm.internal.e0.checkNotNullParameter(pass, "pass");
            if (pass != this.f87587f || (cancellableContinuation = this.f87586e) == null) {
                return;
            }
            this.f87586e = null;
            cancellableContinuation.resumeWith(tu.z.m7131constructorimpl(event));
        }

        @Override // zu.d
        public void resumeWith(Object obj) {
            r0.c cVar = this.f87588g.f87578h;
            g1 g1Var = this.f87588g;
            synchronized (cVar) {
                g1Var.f87578h.remove(this);
            }
            this.f87584b.resumeWith(obj);
        }

        @Override // u1.c, s2.e
        /* renamed from: roundToPx--R2X_6o */
        public int mo3418roundToPxR2X_6o(long j10) {
            return this.f87585c.mo3418roundToPxR2X_6o(j10);
        }

        @Override // u1.c, s2.e
        /* renamed from: roundToPx-0680j_4 */
        public int mo3419roundToPx0680j_4(float f10) {
            return this.f87585c.mo3419roundToPx0680j_4(f10);
        }

        @Override // u1.c, s2.e
        /* renamed from: toDp-GaN1DYA */
        public float mo3420toDpGaN1DYA(long j10) {
            return this.f87585c.mo3420toDpGaN1DYA(j10);
        }

        @Override // u1.c, s2.e
        /* renamed from: toDp-u2uoSUM */
        public float mo3421toDpu2uoSUM(float f10) {
            return this.f87585c.mo3421toDpu2uoSUM(f10);
        }

        @Override // u1.c, s2.e
        /* renamed from: toDpSize-k-rfVVM */
        public long mo3423toDpSizekrfVVM(long j10) {
            return this.f87585c.mo3423toDpSizekrfVVM(j10);
        }

        @Override // u1.c, s2.e
        /* renamed from: toPx--R2X_6o */
        public float mo3424toPxR2X_6o(long j10) {
            return this.f87585c.mo3424toPxR2X_6o(j10);
        }

        @Override // u1.c, s2.e
        /* renamed from: toPx-0680j_4 */
        public float mo3425toPx0680j_4(float f10) {
            return this.f87585c.mo3425toPx0680j_4(f10);
        }

        @Override // u1.c, s2.e
        public i1.j toRect(s2.m mVar) {
            kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
            return this.f87585c.toRect(mVar);
        }

        @Override // u1.c, s2.e
        /* renamed from: toSize-XkaWNTQ */
        public long mo3426toSizeXkaWNTQ(long j10) {
            return this.f87585c.mo3426toSizeXkaWNTQ(j10);
        }

        @Override // u1.c, s2.e
        /* renamed from: toSp-0xMU5do */
        public long mo3427toSp0xMU5do(float f10) {
            return this.f87585c.mo3427toSp0xMU5do(f10);
        }

        @Override // u1.c, s2.e
        /* renamed from: toSp-kPz2Gy4 */
        public long mo3428toSpkPz2Gy4(float f10) {
            return this.f87585c.mo3428toSpkPz2Gy4(f10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r12v6 */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r14v0, types: [kv.p] */
        @Override // u1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeout(long r12, kv.p r14, zu.d<? super T> r15) {
            /*
                r11 = this;
                boolean r0 = r15 instanceof u1.d1
                if (r0 == 0) goto L13
                r0 = r15
                u1.d1 r0 = (u1.d1) r0
                int r1 = r0.f87544l
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f87544l = r1
                goto L18
            L13:
                u1.d1 r0 = new u1.d1
                r0.<init>(r11, r15)
            L18:
                java.lang.Object r15 = r0.f87542j
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.f87544l
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlinx.coroutines.Job r12 = r0.f87541i
                tu.a0.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L2c
                goto L74
            L2c:
                r0 = move-exception
                r13 = r0
                goto L78
            L2f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L37:
                tu.a0.throwOnFailure(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L56
                kotlinx.coroutines.CancellableContinuation r15 = r11.f87586e
                if (r15 == 0) goto L56
                int r2 = tu.z.f87419c
                u1.p r2 = new u1.p
                r2.<init>(r12)
                java.lang.Object r2 = tu.a0.createFailure(r2)
                java.lang.Object r2 = tu.z.m7131constructorimpl(r2)
                r15.resumeWith(r2)
            L56:
                u1.g1 r15 = r11.f87588g
                kotlinx.coroutines.CoroutineScope r5 = r15.getCoroutineScope()
                u1.e1 r8 = new u1.e1
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                kotlinx.coroutines.Job r12 = kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
                r0.f87541i = r12     // Catch: java.lang.Throwable -> L2c
                r0.f87544l = r3     // Catch: java.lang.Throwable -> L2c
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch: java.lang.Throwable -> L2c
                if (r15 != r1) goto L74
                return r1
            L74:
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(r12, r4, r3, r4)
                return r15
            L78:
                kotlinx.coroutines.Job.DefaultImpls.cancel$default(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.g1.a.withTimeout(long, kv.p, zu.d):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // u1.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public <T> java.lang.Object withTimeoutOrNull(long r5, kv.p r7, zu.d<? super T> r8) {
            /*
                r4 = this;
                boolean r0 = r8 instanceof u1.f1
                if (r0 == 0) goto L13
                r0 = r8
                u1.f1 r0 = (u1.f1) r0
                int r1 = r0.f87566k
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f87566k = r1
                goto L18
            L13:
                u1.f1 r0 = new u1.f1
                r0.<init>(r4, r8)
            L18:
                java.lang.Object r8 = r0.f87564i
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.f87566k
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r8)     // Catch: u1.p -> L3e
                return r8
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                tu.a0.throwOnFailure(r8)
                r0.f87566k = r3     // Catch: u1.p -> L3e
                java.lang.Object r5 = r4.withTimeout(r5, r7, r0)     // Catch: u1.p -> L3e
                if (r5 != r1) goto L3d
                return r1
            L3d:
                return r5
            L3e:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: u1.g1.a.withTimeoutOrNull(long, kv.p, zu.d):java.lang.Object");
        }

        @Override // u1.c, s2.e
        /* renamed from: toDp-u2uoSUM */
        public float mo3422toDpu2uoSUM(int i10) {
            return this.f87585c.mo3422toDpu2uoSUM(i10);
        }

        @Override // u1.c, s2.e
        /* renamed from: toSp-kPz2Gy4 */
        public long mo3429toSpkPz2Gy4(int i10) {
            return this.f87585c.mo3429toSpkPz2Gy4(i10);
        }
    }

    public /* synthetic */ g1(g5 g5Var, s2.e eVar, int i10, kotlin.jvm.internal.u uVar) {
        this(g5Var, (i10 & 2) != 0 ? s2.g.Density$default(1.0f, 0.0f, 2, null) : eVar);
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // u1.k0
    public <R> Object awaitPointerEventScope(kv.p pVar, zu.d<? super R> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(av.b.intercepted(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        a aVar = new a(this, cancellableContinuationImpl);
        synchronized (this.f87578h) {
            this.f87578h.add(aVar);
            zu.d<tu.x0> dVarCreateCoroutine = zu.h.createCoroutine(pVar, aVar, aVar);
            int i10 = tu.z.f87419c;
            dVarCreateCoroutine.resumeWith(tu.z.m7131constructorimpl(tu.x0.f87415a));
        }
        cancellableContinuationImpl.invokeOnCancellation(new h1(aVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == av.e.getCOROUTINE_SUSPENDED()) {
            bv.h.probeCoroutineSuspended(dVar);
        }
        return result;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:6:0x000f, B:13:0x001c, B:15:0x0024, B:16:0x0029, B:21:0x0037, B:23:0x003f, B:24:0x0044), top: B:34:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(u1.m r5, u1.o r6) {
        /*
            r4 = this;
            r0.c r0 = r4.f87578h
            monitor-enter(r0)
            r0.c r1 = r4.f87579i     // Catch: java.lang.Throwable -> L5b
            r0.c r2 = r4.f87578h     // Catch: java.lang.Throwable -> L5b
            int r3 = r1.getSize()     // Catch: java.lang.Throwable -> L5b
            r1.addAll(r3, r2)     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)
            int r0 = r6.ordinal()     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L37
            r1 = 1
            if (r0 == r1) goto L1c
            r1 = 2
            if (r0 == r1) goto L37
            goto L4f
        L1c:
            r0.c r0 = r4.f87579i     // Catch: java.lang.Throwable -> L35
            int r2 = r0.getSize()     // Catch: java.lang.Throwable -> L35
            if (r2 <= 0) goto L4f
            int r2 = r2 - r1
            java.lang.Object[] r0 = r0.getContent()     // Catch: java.lang.Throwable -> L35
        L29:
            r1 = r0[r2]     // Catch: java.lang.Throwable -> L35
            u1.g1$a r1 = (u1.g1.a) r1     // Catch: java.lang.Throwable -> L35
            r1.offerPointerEvent(r5, r6)     // Catch: java.lang.Throwable -> L35
            int r2 = r2 + (-1)
            if (r2 >= 0) goto L29
            goto L4f
        L35:
            r5 = move-exception
            goto L55
        L37:
            r0.c r0 = r4.f87579i     // Catch: java.lang.Throwable -> L35
            int r1 = r0.getSize()     // Catch: java.lang.Throwable -> L35
            if (r1 <= 0) goto L4f
            java.lang.Object[] r0 = r0.getContent()     // Catch: java.lang.Throwable -> L35
            r2 = 0
        L44:
            r3 = r0[r2]     // Catch: java.lang.Throwable -> L35
            u1.g1$a r3 = (u1.g1.a) r3     // Catch: java.lang.Throwable -> L35
            r3.offerPointerEvent(r5, r6)     // Catch: java.lang.Throwable -> L35
            int r2 = r2 + 1
            if (r2 < r1) goto L44
        L4f:
            r0.c r5 = r4.f87579i
            r5.clear()
            return
        L55:
            r0.c r6 = r4.f87579i
            r6.clear()
            throw r5
        L5b:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.g1.b(u1.m, u1.o):void");
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    public final CoroutineScope getCoroutineScope() {
        return this.f87582l;
    }

    @Override // u1.k0, s2.e
    public float getDensity() {
        return this.f87576f.getDensity();
    }

    @Override // u1.k0
    /* renamed from: getExtendedTouchPadding-NH-jbRc, reason: not valid java name */
    public long mo7318getExtendedTouchPaddingNHjbRc() {
        long jMo3426toSizeXkaWNTQ = mo3426toSizeXkaWNTQ(getViewConfiguration().mo36getMinimumTouchTargetSizeMYxV2XQ());
        long jM7321getSizeYbymL2g = m7321getSizeYbymL2g();
        return i1.p.Size(Math.max(0.0f, i1.o.m4252getWidthimpl(jMo3426toSizeXkaWNTQ) - s2.v.m6972getWidthimpl(jM7321getSizeYbymL2g)) / 2.0f, Math.max(0.0f, i1.o.m4249getHeightimpl(jMo3426toSizeXkaWNTQ) - s2.v.m6971getHeightimpl(jM7321getSizeYbymL2g)) / 2.0f);
    }

    @Override // u1.k0, s2.e
    public float getFontScale() {
        return this.f87576f.getFontScale();
    }

    @Override // u1.i0, u1.k0
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.f87583m;
    }

    @Override // u1.k0
    public g5 getViewConfiguration() {
        return this.f87575e;
    }

    @Override // u1.i0
    public void onCancel() {
        m mVar = this.f87580j;
        if (mVar == null) {
            return;
        }
        List<c0> changes = mVar.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (changes.get(i10).getPressed()) {
                List<c0> changes2 = mVar.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    c0 c0Var = changes2.get(i11);
                    arrayList.add(new c0(c0Var.m7294getIdJ3iCeTQ(), c0Var.getUptimeMillis(), c0Var.m7295getPositionF1C5BW0(), false, c0Var.getUptimeMillis(), c0Var.m7295getPositionF1C5BW0(), c0Var.getPressed(), c0Var.getPressed(), 0, 0L, 768, (kotlin.jvm.internal.u) null));
                }
                m mVar2 = new m(arrayList);
                this.f87577g = mVar2;
                b(mVar2, o.f87646b);
                b(mVar2, o.f87647c);
                b(mVar2, o.f87648e);
                this.f87580j = null;
                return;
            }
        }
    }

    @Override // u1.i0
    /* renamed from: onPointerEvent-H0pRuoY, reason: not valid java name */
    public void mo7319onPointerEventH0pRuoY(m pointerEvent, o pass, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(pointerEvent, "pointerEvent");
        kotlin.jvm.internal.e0.checkNotNullParameter(pass, "pass");
        this.f87581k = j10;
        if (pass == o.f87646b) {
            this.f87577g = pointerEvent;
        }
        b(pointerEvent, pass);
        List<c0> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!n.changedToUpIgnoreConsumed(changes.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (z10) {
            pointerEvent = null;
        }
        this.f87580j = pointerEvent;
    }

    @Override // u1.k0, s2.e
    /* renamed from: roundToPx--R2X_6o */
    public int mo3418roundToPxR2X_6o(long j10) {
        return this.f87576f.mo3418roundToPxR2X_6o(j10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: roundToPx-0680j_4 */
    public int mo3419roundToPx0680j_4(float f10) {
        return this.f87576f.mo3419roundToPx0680j_4(f10);
    }

    public final void setCoroutineScope(CoroutineScope coroutineScope) {
        kotlin.jvm.internal.e0.checkNotNullParameter(coroutineScope, "<set-?>");
        this.f87582l = coroutineScope;
    }

    @Override // u1.k0
    public void setInterceptOutOfBoundsChildEvents(boolean z10) {
        this.f87583m = z10;
    }

    @Override // u1.j0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toDp-GaN1DYA */
    public float mo3420toDpGaN1DYA(long j10) {
        return this.f87576f.mo3420toDpGaN1DYA(j10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3421toDpu2uoSUM(float f10) {
        return this.f87576f.mo3421toDpu2uoSUM(f10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toDpSize-k-rfVVM */
    public long mo3423toDpSizekrfVVM(long j10) {
        return this.f87576f.mo3423toDpSizekrfVVM(j10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toPx--R2X_6o */
    public float mo3424toPxR2X_6o(long j10) {
        return this.f87576f.mo3424toPxR2X_6o(j10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toPx-0680j_4 */
    public float mo3425toPx0680j_4(float f10) {
        return this.f87576f.mo3425toPx0680j_4(f10);
    }

    @Override // u1.k0, s2.e
    public i1.j toRect(s2.m mVar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mVar, "<this>");
        return this.f87576f.toRect(mVar);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toSize-XkaWNTQ */
    public long mo3426toSizeXkaWNTQ(long j10) {
        return this.f87576f.mo3426toSizeXkaWNTQ(j10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toSp-0xMU5do */
    public long mo3427toSp0xMU5do(float f10) {
        return this.f87576f.mo3427toSp0xMU5do(f10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3428toSpkPz2Gy4(float f10) {
        return this.f87576f.mo3428toSpkPz2Gy4(f10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toDp-u2uoSUM */
    public float mo3422toDpu2uoSUM(int i10) {
        return this.f87576f.mo3422toDpu2uoSUM(i10);
    }

    @Override // u1.k0, s2.e
    /* renamed from: toSp-kPz2Gy4 */
    public long mo3429toSpkPz2Gy4(int i10) {
        return this.f87576f.mo3429toSpkPz2Gy4(i10);
    }

    public g1(g5 viewConfiguration, s2.e density) {
        kotlin.jvm.internal.e0.checkNotNullParameter(viewConfiguration, "viewConfiguration");
        kotlin.jvm.internal.e0.checkNotNullParameter(density, "density");
        this.f87575e = viewConfiguration;
        this.f87576f = density;
        this.f87577g = i1.f87599a;
        this.f87578h = new r0.c(new a[16], 0);
        this.f87579i = new r0.c(new a[16], 0);
        this.f87581k = s2.v.f85360b.m6963getZeroYbymL2g();
        this.f87582l = GlobalScope.INSTANCE;
    }

    public static /* synthetic */ void getCoroutineScope$annotations() {
    }

    @Override // u1.j0
    public i0 getPointerInputFilter() {
        return this;
    }
}

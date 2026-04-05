package e0;

import kotlinx.coroutines.CoroutineScopeKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q4 {

    /* renamed from: a, reason: collision with root package name */
    public static final a4 f53270a = new a4(3, null);

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[LOOP:0: B:19:0x004e->B:20:0x0050, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object access$consumeUntilUp(u1.c r8, zu.d r9) {
        /*
            boolean r0 = r9 instanceof e0.d4
            if (r0 == 0) goto L13
            r0 = r9
            e0.d4 r0 = (e0.d4) r0
            int r1 = r0.f53014k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53014k = r1
            goto L18
        L13:
            e0.d4 r0 = new e0.d4
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f53013j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53014k
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            u1.c r8 = r0.f53012i
            tu.a0.throwOnFailure(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            tu.a0.throwOnFailure(r9)
        L36:
            r0.f53012i = r8
            r0.f53014k = r3
            r9 = 0
            java.lang.Object r9 = u1.c.awaitPointerEvent$default(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            return r1
        L42:
            u1.m r9 = (u1.m) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4e:
            if (r6 >= r4) goto L5c
            java.lang.Object r7 = r2.get(r6)
            u1.c0 r7 = (u1.c0) r7
            r7.consume()
            int r6 = r6 + 1
            goto L4e
        L5c:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
        L64:
            if (r5 >= r2) goto L76
            java.lang.Object r4 = r9.get(r5)
            u1.c0 r4 = (u1.c0) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L73
            goto L36
        L73:
            int r5 = r5 + 1
            goto L64
        L76:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.q4.access$consumeUntilUp(u1.c, zu.d):java.lang.Object");
    }

    public static final Object awaitFirstDown(u1.c cVar, boolean z10, zu.d<? super u1.c0> dVar) {
        return awaitFirstDownOnPass(cVar, u1.o.f87647c, z10, dVar);
    }

    public static /* synthetic */ Object awaitFirstDown$default(u1.c cVar, boolean z10, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return awaitFirstDown(cVar, z10, dVar);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0049 -> B:18:0x004c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitFirstDownOnPass(u1.c r9, u1.o r10, boolean r11, zu.d<? super u1.c0> r12) {
        /*
            boolean r0 = r12 instanceof e0.b4
            if (r0 == 0) goto L13
            r0 = r12
            e0.b4 r0 = (e0.b4) r0
            int r1 = r0.f52986m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f52986m = r1
            goto L18
        L13:
            e0.b4 r0 = new e0.b4
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f52985l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f52986m
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            boolean r9 = r0.f52984k
            u1.o r10 = r0.f52983j
            u1.c r11 = r0.f52982i
            tu.a0.throwOnFailure(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L4c
        L32:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3a:
            tu.a0.throwOnFailure(r12)
        L3d:
            r0.f52982i = r9
            r0.f52983j = r10
            r0.f52984k = r11
            r0.f52986m = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r10, r0)
            if (r12 != r1) goto L4c
            return r1
        L4c:
            u1.m r12 = (u1.m) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L58:
            if (r6 >= r4) goto L72
            java.lang.Object r7 = r2.get(r6)
            u1.c0 r7 = (u1.c0) r7
            if (r11 == 0) goto L67
            boolean r7 = u1.n.changedToDown(r7)
            goto L6b
        L67:
            boolean r7 = u1.n.changedToDownIgnoreConsumed(r7)
        L6b:
            if (r7 != 0) goto L6f
            r2 = r5
            goto L73
        L6f:
            int r6 = r6 + 1
            goto L58
        L72:
            r2 = r3
        L73:
            if (r2 == 0) goto L3d
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.q4.awaitFirstDownOnPass(u1.c, u1.o, boolean, zu.d):java.lang.Object");
    }

    public static final Object detectTapAndPress(u1.k0 k0Var, kv.q qVar, kv.l lVar, zu.d<? super tu.x0> dVar) {
        Object objForEachGesture = h2.forEachGesture(k0Var, new h4(new s2(k0Var), qVar, lVar, null), dVar);
        return objForEachGesture == av.e.getCOROUTINE_SUSPENDED() ? objForEachGesture : tu.x0.f87415a;
    }

    public static /* synthetic */ Object detectTapAndPress$default(u1.k0 k0Var, kv.q qVar, kv.l lVar, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qVar = f53270a;
        }
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        return detectTapAndPress(k0Var, qVar, lVar, dVar);
    }

    public static final Object detectTapGestures(u1.k0 k0Var, kv.l lVar, kv.l lVar2, kv.q qVar, kv.l lVar3, zu.d<? super tu.x0> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new o4(k0Var, lVar2, lVar, qVar, lVar3, null), dVar);
        return objCoroutineScope == av.e.getCOROUTINE_SUSPENDED() ? objCoroutineScope : tu.x0.f87415a;
    }

    public static /* synthetic */ Object detectTapGestures$default(u1.k0 k0Var, kv.l lVar, kv.l lVar2, kv.q qVar, kv.l lVar3, zu.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = null;
        }
        if ((i10 & 2) != 0) {
            lVar2 = null;
        }
        if ((i10 & 4) != 0) {
            qVar = f53270a;
        }
        if ((i10 & 8) != 0) {
            lVar3 = null;
        }
        return detectTapGestures(k0Var, lVar, lVar2, qVar, lVar3, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        if (r13 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004e A[PHI: r12 r13
      0x004e: PHI (r12v1 u1.c) = (r12v6 u1.c), (r12v9 u1.c) binds: [B:18:0x004b, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x004e: PHI (r13v2 java.lang.Object) = (r13v8 java.lang.Object), (r13v1 java.lang.Object) binds: [B:18:0x004b, B:15:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x009a -> B:35:0x009d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object waitForUpOrCancellation(u1.c r12, zu.d<? super u1.c0> r13) {
        /*
            boolean r0 = r13 instanceof e0.p4
            if (r0 == 0) goto L13
            r0 = r13
            e0.p4 r0 = (e0.p4) r0
            int r1 = r0.f53250k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53250k = r1
            goto L18
        L13:
            e0.p4 r0 = new e0.p4
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f53249j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f53250k
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r3) goto L30
            u1.c r12 = r0.f53248i
            tu.a0.throwOnFailure(r13)
            goto L9d
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            u1.c r12 = r0.f53248i
            tu.a0.throwOnFailure(r13)
            goto L4e
        L3e:
            tu.a0.throwOnFailure(r13)
        L41:
            r0.f53248i = r12
            r0.f53250k = r5
            u1.o r13 = u1.o.f87647c
            java.lang.Object r13 = r12.awaitPointerEvent(r13, r0)
            if (r13 != r1) goto L4e
            goto L9c
        L4e:
            u1.m r13 = (u1.m) r13
            java.util.List r2 = r13.getChanges()
            int r6 = r2.size()
            r7 = r4
        L59:
            if (r7 >= r6) goto Lbe
            java.lang.Object r8 = r2.get(r7)
            u1.c0 r8 = (u1.c0) r8
            boolean r8 = u1.n.changedToUp(r8)
            if (r8 != 0) goto Lbb
            java.util.List r13 = r13.getChanges()
            int r2 = r13.size()
            r6 = r4
        L70:
            if (r6 >= r2) goto L90
            java.lang.Object r7 = r13.get(r6)
            u1.c0 r7 = (u1.c0) r7
            boolean r8 = r7.isConsumed()
            if (r8 != 0) goto Lb6
            long r8 = r12.mo7285getSizeYbymL2g()
            long r10 = r12.mo7284getExtendedTouchPaddingNHjbRc()
            boolean r7 = u1.n.m7348isOutOfBoundsjwHxaWs(r7, r8, r10)
            if (r7 == 0) goto L8d
            goto Lb6
        L8d:
            int r6 = r6 + 1
            goto L70
        L90:
            r0.f53248i = r12
            r0.f53250k = r3
            u1.o r13 = u1.o.f87648e
            java.lang.Object r13 = r12.awaitPointerEvent(r13, r0)
            if (r13 != r1) goto L9d
        L9c:
            return r1
        L9d:
            u1.m r13 = (u1.m) r13
            java.util.List r13 = r13.getChanges()
            int r2 = r13.size()
            r6 = r4
        La8:
            if (r6 >= r2) goto L41
            java.lang.Object r7 = r13.get(r6)
            u1.c0 r7 = (u1.c0) r7
            boolean r7 = r7.isConsumed()
            if (r7 == 0) goto Lb8
        Lb6:
            r12 = 0
            return r12
        Lb8:
            int r6 = r6 + 1
            goto La8
        Lbb:
            int r7 = r7 + 1
            goto L59
        Lbe:
            java.util.List r12 = r13.getChanges()
            java.lang.Object r12 = r12.get(r4)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.q4.waitForUpOrCancellation(u1.c, zu.d):java.lang.Object");
    }
}

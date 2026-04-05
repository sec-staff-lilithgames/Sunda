package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import av.e;
import bv.l;
import bv.n;
import e0.h2;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kv.p;
import tu.a0;
import tu.x0;
import u1.c;
import u1.k0;
import zu.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends n implements p {

        /* renamed from: i, reason: collision with root package name */
        public int f49757i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49758j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f49759k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f49760l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a, reason: collision with other inner class name */
        public static final class C0476a extends n implements p {

            /* renamed from: i, reason: collision with root package name */
            public int f49761i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f49762j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ k0 f49763k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ p f49764l;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$a$a$a, reason: collision with other inner class name */
            public static final class C0477a extends l implements p {

                /* renamed from: i, reason: collision with root package name */
                public int f49765i;

                /* renamed from: j, reason: collision with root package name */
                public /* synthetic */ Object f49766j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a f49767k;

                /* renamed from: l, reason: collision with root package name */
                public final /* synthetic */ p f49768l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0477a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, p pVar, d<? super C0477a> dVar) {
                    super(2, dVar);
                    this.f49767k = aVar;
                    this.f49768l = pVar;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(c cVar, d<? super x0> dVar) {
                    return ((C0477a) create(cVar, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final d<x0> create(Object obj, d<?> dVar) {
                    C0477a c0477a = new C0477a(this.f49767k, this.f49768l, dVar);
                    c0477a.f49766j = obj;
                    return c0477a;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
                @Override // bv.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                        int r1 = r5.f49765i
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L26
                        if (r1 == r3) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r0 = r5.f49766j
                        u1.c0 r0 = (u1.c0) r0
                        tu.a0.throwOnFailure(r6)
                        goto L56
                    L16:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1e:
                        java.lang.Object r1 = r5.f49766j
                        u1.c r1 = (u1.c) r1
                        tu.a0.throwOnFailure(r6)
                        goto L3a
                    L26:
                        tu.a0.throwOnFailure(r6)
                        java.lang.Object r6 = r5.f49766j
                        r1 = r6
                        u1.c r1 = (u1.c) r1
                        r5.f49766j = r1
                        r5.f49765i = r3
                        r6 = 0
                        java.lang.Object r6 = e0.q4.awaitFirstDown(r1, r6, r5)
                        if (r6 != r0) goto L3a
                        goto L53
                    L3a:
                        u1.c0 r6 = (u1.c0) r6
                        boolean r3 = r6.getPressed()
                        boolean r4 = r6.getPreviousPressed()
                        if (r3 == r4) goto L49
                        r6.consume()
                    L49:
                        r5.f49766j = r6
                        r5.f49765i = r2
                        java.lang.Object r1 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(r1, r5)
                        if (r1 != r0) goto L54
                    L53:
                        return r0
                    L54:
                        r0 = r6
                        r6 = r1
                    L56:
                        u1.c0 r6 = (u1.c0) r6
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a r1 = r5.f49767k
                        if (r6 != 0) goto L60
                        r1.a()
                        goto L78
                    L60:
                        r1.b()
                        long r0 = r0.m7295getPositionF1C5BW0()
                        i1.h r0 = i1.h.m4174boximpl(r0)
                        long r1 = r6.m7295getPositionF1C5BW0()
                        i1.h r6 = i1.h.m4174boximpl(r1)
                        kv.p r1 = r5.f49768l
                        r1.invoke(r0, r6)
                    L78:
                        tu.x0 r6 = tu.x0.f87415a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a.C0476a.C0477a.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0476a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, k0 k0Var, p pVar, d<? super C0476a> dVar) {
                super(2, dVar);
                this.f49762j = aVar;
                this.f49763k = k0Var;
                this.f49764l = pVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, d<? super x0> dVar) {
                return ((C0476a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final d<x0> create(Object obj, d<?> dVar) {
                return new C0476a(this.f49762j, this.f49763k, this.f49764l, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
                int i10 = this.f49761i;
                if (i10 == 0) {
                    a0.throwOnFailure(obj);
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar = this.f49762j;
                    aVar.c();
                    C0477a c0477a = new C0477a(aVar, this.f49764l, null);
                    this.f49761i = 1;
                    if (this.f49763k.awaitPointerEventScope(c0477a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a0.throwOnFailure(obj);
                }
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a aVar, p pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f49759k = aVar;
            this.f49760l = pVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k0 k0Var, d<? super x0> dVar) {
            return ((a) create(k0Var, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final d<x0> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f49759k, this.f49760l, dVar);
            aVar.f49758j = obj;
            return aVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49757i;
            if (i10 == 0) {
                a0.throwOnFailure(obj);
                C0476a c0476a = new C0476a(this.f49759k, (k0) this.f49758j, this.f49760l, null);
                this.f49757i = 1;
                if (CoroutineScopeKt.coroutineScope(c0476a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b, reason: collision with other inner class name */
    public static final class C0478b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public c f49769i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49770j;

        /* renamed from: k, reason: collision with root package name */
        public int f49771k;

        public C0478b(d<? super C0478b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f49770j = obj;
            this.f49771k |= Integer.MIN_VALUE;
            return b.b((c) null, this);
        }
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
    public static final java.lang.Object b(u1.c r12, zu.d<? super u1.c0> r13) {
        /*
            boolean r0 = r13 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.C0478b
            if (r0 == 0) goto L13
            r0 = r13
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.C0478b) r0
            int r1 = r0.f49771k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f49771k = r1
            goto L18
        L13:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b$b
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f49770j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f49771k
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r3) goto L30
            u1.c r12 = r0.f49769i
            tu.a0.throwOnFailure(r13)
            goto L9d
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            u1.c r12 = r0.f49769i
            tu.a0.throwOnFailure(r13)
            goto L4e
        L3e:
            tu.a0.throwOnFailure(r13)
        L41:
            r0.f49769i = r12
            r0.f49771k = r5
            u1.o r13 = u1.o.f87646b
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
            r0.f49769i = r12
            r0.f49771k = r3
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
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.b(u1.c, zu.d):java.lang.Object");
    }

    public static final <T> void c(List<? extends T> list, kv.l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            lVar.invoke(list.get(i10));
        }
    }

    public static final Object a(k0 k0Var, p pVar, d<? super x0> dVar) {
        Object objForEachGesture = h2.forEachGesture(k0Var, new a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.a(k0Var), pVar, null), dVar);
        return objForEachGesture == e.getCOROUTINE_SUSPENDED() ? objForEachGesture : x0.f87415a;
    }

    public static final <T> boolean a(List<? extends T> list, kv.l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!((Boolean) lVar.invoke(list.get(i10))).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final <T> boolean b(List<? extends T> list, kv.l lVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((Boolean) lVar.invoke(list.get(i10))).booleanValue()) {
                return true;
            }
        }
        return false;
    }
}

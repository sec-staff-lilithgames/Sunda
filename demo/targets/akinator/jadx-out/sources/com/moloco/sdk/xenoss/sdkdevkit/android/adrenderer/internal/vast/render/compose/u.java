package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import kotlinx.coroutines.CoroutineScope;
import n0.m0;
import p0.j2;
import p0.o4;
import p0.o5;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class u {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49772i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ c0.e f49773j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ float f49774k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f49775l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j f49776m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c0.e eVar, float f10, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49773j = eVar;
            this.f49774k = f10;
            this.f49775l = z10;
            this.f49776m = jVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f49773j, this.f49774k, this.f49775l, this.f49776m, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
        
            if (c0.e.animateTo$default(r14.f49773j, r7, r8, null, null, r14, 12, null) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
        
            if (r2.stop(r14) == r0) goto L24;
         */
        @Override // bv.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
                int r1 = r14.f49772i
                c0.e r2 = r14.f49773j
                r3 = 3
                r4 = 1
                r5 = 2
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r5) goto L1c
                if (r1 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L1c:
                tu.a0.throwOnFailure(r15)
                r11 = r14
                goto L71
            L21:
                tu.a0.throwOnFailure(r15)
                goto L38
            L25:
                tu.a0.throwOnFailure(r15)
                float r15 = r14.f49774k
                java.lang.Float r15 = bv.b.boxFloat(r15)
                r14.f49772i = r4
                java.lang.Object r15 = r2.snapTo(r15, r14)
                if (r15 != r0) goto L38
                r11 = r14
                goto L70
            L38:
                boolean r15 = r14.f49775l
                if (r15 == 0) goto L67
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j r15 = r14.f49776m
                boolean r1 = r15 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j.c
                if (r1 == 0) goto L67
                r1 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r7 = bv.b.boxFloat(r1)
                int r15 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u.a(r15)
                c0.g0 r1 = c0.i0.getLinearEasing()
                r2 = 0
                r3 = 0
                c0.m2 r8 = c0.o.tween$default(r15, r2, r1, r5, r3)
                r14.f49772i = r5
                r12 = 12
                r13 = 0
                c0.e r6 = r14.f49773j
                r9 = 0
                r10 = 0
                r11 = r14
                java.lang.Object r15 = c0.e.animateTo$default(r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 != r0) goto L71
                goto L70
            L67:
                r11 = r14
                r11.f49772i = r3
                java.lang.Object r15 = r2.stop(r14)
                if (r15 != r0) goto L71
            L70:
                return r0
            L71:
                tu.x0 r15 = tu.x0.f87415a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final x0 a(int i10, p0.w wVar, int i11) {
        a(wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final float b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar) {
        if (jVar instanceof j.a) {
            return 100.0f;
        }
        if (jVar instanceof j.c) {
            if (((j.c) jVar).d() == 0) {
                return 0.0f;
            }
            return (float) (r4.c() / r4.d());
        }
        if ((jVar instanceof j.d) || kotlin.jvm.internal.e0.areEqual(jVar, j.b.f49959a)) {
            return 0.0f;
        }
        throw new tu.t();
    }

    public static final int c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar) {
        if (!(jVar instanceof j.a)) {
            if (jVar instanceof j.c) {
                j.c cVar = (j.c) jVar;
                if (cVar.d() != 0) {
                    return qv.v.coerceAtLeast((int) (cVar.d() - cVar.c()), 0);
                }
            } else if (!(jVar instanceof j.d) && !kotlin.jvm.internal.e0.areEqual(jVar, j.b.f49959a)) {
                throw new tu.t();
            }
        }
        return 0;
    }

    public static final x0 a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, e1.v vVar, long j10, int i10, int i11, p0.w wVar, int i12) {
        a(z10, jVar, vVar, j10, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r22, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j r23, e1.v r24, long r25, p0.w r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.u.a(boolean, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j, e1.v, long, p0.w, int, int):void");
    }

    public static final void a(j2 j2Var, float f10) {
        j2Var.setValue(Float.valueOf(f10));
    }

    public static final j2 a() {
        return o5.mutableStateOf$default(Float.valueOf(0.0f), null, 2, null);
    }

    public static final x0 a(c0.e eVar, float f10, long j10, l1.i drawBehind) {
        kotlin.jvm.internal.e0.checkNotNullParameter(drawBehind, "$this$drawBehind");
        l1.i.m5413drawRoundRectuAw5IA$default(drawBehind, j10, 0L, i1.p.Size(i1.o.m4252getWidthimpl(drawBehind.mo5314getSizeNHjbRc()) * ((Number) eVar.getValue()).floatValue(), i1.o.m4249getHeightimpl(drawBehind.mo5314getSizeNHjbRc())), i1.c.CornerRadius(f10, f10), null, 0.0f, null, 0, 242, null);
        return x0.f87415a;
    }

    public static final void a(p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(1397199635);
        if (i10 == 0 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1397199635, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Preview (VastProgressBar.kt:98)");
            }
            m0.MaterialTheme(null, null, null, g.f49676a.a(), wVarStartRestartGroup, 3072, 7);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a(i10, 5));
        }
    }

    public static final float a(j2 j2Var) {
        return ((Number) j2Var.getValue()).floatValue();
    }
}

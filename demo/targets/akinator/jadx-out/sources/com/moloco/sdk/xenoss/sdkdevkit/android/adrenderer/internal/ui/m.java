package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p0.j2;
import p0.k1;
import p0.o4;
import p0.o5;
import p0.v5;
import p0.z4;
import tu.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class m {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g0.e0 f48652b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l f48653c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.b f48654e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ boolean f48655f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0447a extends kotlin.jvm.internal.a0 implements kv.a {
            public C0447a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l.class, "goNextAdPartOrDismissAd", "goNextAdPartOrDismissAd()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l) this.receiver).y();
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public /* synthetic */ class b extends kotlin.jvm.internal.a0 implements kv.l {
            public b(Object obj) {
                super(1, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l.class, "onButtonRendered", "onButtonRendered(Lcom/moloco/sdk/xenoss/sdkdevkit/android/core/services/CustomUserEventBuilderService$UserInteraction$Button;)V", 0);
            }

            public final void a(a.c p02) {
                kotlin.jvm.internal.e0.checkNotNullParameter(p02, "p0");
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l) this.receiver).a(p02);
            }

            @Override // kv.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((a.c) obj);
                return x0.f87415a;
            }
        }

        public a(g0.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar, kv.b bVar, boolean z10) {
            this.f48652b = e0Var;
            this.f48653c = lVar;
            this.f48654e = bVar;
            this.f48655f = z10;
        }

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(504986716, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton.<anonymous>.<anonymous> (AdGoNextButton.kt:47)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar = this.f48653c;
            StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> stateFlowM = lVar.m();
            wVar.startReplaceableGroup(328179957);
            boolean zChanged = wVar.changed(lVar);
            Object objRememberedValue = wVar.rememberedValue();
            p0.v vVar = p0.v.f80515a;
            if (zChanged || objRememberedValue == vVar.getEmpty()) {
                objRememberedValue = new C0447a(lVar);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            kv.a aVar = (kv.a) ((KFunction) objRememberedValue);
            wVar.startReplaceableGroup(328181678);
            boolean zChanged2 = wVar.changed(lVar);
            Object objRememberedValue2 = wVar.rememberedValue();
            if (zChanged2 || objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = new b(lVar);
                wVar.updateRememberedValue(objRememberedValue2);
            }
            wVar.endReplaceableGroup();
            boolean z10 = this.f48655f;
            m.a(this.f48652b, stateFlowM, aVar, (kv.l) ((KFunction) objRememberedValue2), this.f48654e, z10, wVar, 0);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((p0.w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48656i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ v5 f48657j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ j2 f48658k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j2 f48659b;

            public a(j2 j2Var) {
                this.f48659b = j2Var;
            }

            public final Object a(int i10, zu.d<? super x0> dVar) {
                m.a(this.f48659b, i10);
                return x0.f87415a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return a(((Number) obj).intValue(), dVar);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$b$b, reason: collision with other inner class name */
        public static final class C0448b implements Flow {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Flow f48660b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$b$b$a */
            public static final class a implements FlowCollector {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f48661b;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$b$b$a$a, reason: collision with other inner class name */
                public static final class C0449a extends bv.d {

                    /* renamed from: i, reason: collision with root package name */
                    public /* synthetic */ Object f48662i;

                    /* renamed from: j, reason: collision with root package name */
                    public int f48663j;

                    public C0449a(zu.d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.f48662i = obj;
                        this.f48663j |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(FlowCollector flowCollector) {
                    this.f48661b = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m.b.C0448b.a.C0449a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$b$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m.b.C0448b.a.C0449a) r0
                        int r1 = r0.f48663j
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f48663j = r1
                        goto L18
                    L13:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$b$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m$b$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f48662i
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f48663j
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        tu.a0.throwOnFailure(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        tu.a0.throwOnFailure(r6)
                        r6 = r5
                        java.lang.Number r6 = (java.lang.Number) r6
                        int r6 = r6.intValue()
                        if (r6 <= 0) goto L48
                        r0.f48663j = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f48661b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m.b.C0448b.a.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            public C0448b(Flow flow) {
                this.f48660b = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, zu.d dVar) {
                Object objCollect = this.f48660b.collect(new a(flowCollector), dVar);
                return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v5 v5Var, j2 j2Var, zu.d<? super b> dVar) {
            super(2, dVar);
            this.f48657j = v5Var;
            this.f48658k = j2Var;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new b(this.f48657j, this.f48658k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48656i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                Flow flowTake = FlowKt.take(new C0448b(z4.snapshotFlow(new n(this.f48657j, 0))), 1);
                a aVar = new a(this.f48658k);
                this.f48656i = 1;
                if (flowTake.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                tu.a0.throwOnFailure(obj);
            }
            return x0.f87415a;
        }

        public static final int a(v5 v5Var) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d dVarA = m.a(v5Var);
            d.b bVar = dVarA instanceof d.b ? (d.b) dVarA : null;
            if (bVar != null) {
                return bVar.b();
            }
            return 0;
        }
    }

    public static final x0 a(g0.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVar, kv.b bVar, kv.b bVar2, int i10, p0.w wVar, int i11) {
        a(e0Var, lVar, kVar, bVar, bVar2, wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final x0 a(g0.e0 e0Var, StateFlow stateFlow, kv.a aVar, kv.l lVar, kv.b bVar, boolean z10, int i10, p0.w wVar, int i11) {
        a(e0Var, (StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d>) stateFlow, aVar, lVar, bVar, z10, wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final void a(g0.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l adViewModel, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVar, kv.b bVar, kv.b bVar2, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(adViewModel, "adViewModel");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(1217166503);
        if ((i10 & 6) == 0) {
            i11 = (wVarStartRestartGroup.changed(e0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= wVarStartRestartGroup.changed(adViewModel) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= wVarStartRestartGroup.changed(kVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= wVarStartRestartGroup.changed(bVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= wVarStartRestartGroup.changed(bVar2) ? 16384 : Segment.SIZE;
        }
        if ((i11 & 9363) == 9362 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1217166503, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdGoNextButton (AdGoNextButton.kt:27)");
            }
            kv.b bVar3 = null;
            Boolean boolValueOf = kVar != null ? Boolean.valueOf(kVar.a()) : null;
            if (kotlin.jvm.internal.e0.areEqual(boolValueOf, Boolean.TRUE)) {
                bVar3 = bVar2;
            } else if (kotlin.jvm.internal.e0.areEqual(boolValueOf, Boolean.FALSE)) {
                bVar3 = bVar;
            } else if (boolValueOf != null) {
                throw new tu.t();
            }
            boolean z10 = kVar instanceof k.a;
            boolean z11 = (z10 || (kVar instanceof k.b) || !(kVar instanceof k.c)) ? false : true;
            if (bVar3 != null) {
                z0.b bVarComposableLambda = z0.u.composableLambda(wVarStartRestartGroup, 504986716, true, new a(e0Var, adViewModel, bVar3, z11));
                if (z10) {
                    wVarStartRestartGroup.startReplaceableGroup(-1024214432);
                    bVarComposableLambda.invoke(wVarStartRestartGroup, 6);
                    wVarStartRestartGroup.endReplaceableGroup();
                } else if (kVar instanceof k.b) {
                    wVarStartRestartGroup.startReplaceableGroup(-1024212640);
                    bVarComposableLambda.invoke(wVarStartRestartGroup, 6);
                    wVarStartRestartGroup.endReplaceableGroup();
                } else if (kVar instanceof k.c) {
                    wVarStartRestartGroup.startReplaceableGroup(-1024210752);
                    bVarComposableLambda.invoke(wVarStartRestartGroup, 6);
                    wVarStartRestartGroup.endReplaceableGroup();
                } else {
                    wVarStartRestartGroup.startReplaceableGroup(-1685727487);
                    wVarStartRestartGroup.endReplaceableGroup();
                }
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new k(e0Var, adViewModel, kVar, bVar, bVar2, i10, 0));
        }
    }

    public static final void a(final g0.e0 e0Var, final StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d> stateFlow, final kv.a aVar, final kv.l lVar, final kv.b bVar, final boolean z10, p0.w wVar, final int i10) {
        g0.e0 e0Var2;
        int i11;
        kv.a aVar2;
        kv.l lVar2;
        kv.b bVar2;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(12332512);
        if ((i10 & 6) == 0) {
            e0Var2 = e0Var;
            i11 = (wVarStartRestartGroup.changed(e0Var2) ? 4 : 2) | i10;
        } else {
            e0Var2 = e0Var;
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= wVarStartRestartGroup.changed(stateFlow) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            aVar2 = aVar;
            i11 |= wVarStartRestartGroup.changed(aVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 3072) == 0) {
            lVar2 = lVar;
            i11 |= wVarStartRestartGroup.changed(lVar2) ? 2048 : 1024;
        } else {
            lVar2 = lVar;
        }
        if ((i10 & 24576) == 0) {
            bVar2 = bVar;
            i11 |= wVarStartRestartGroup.changed(bVar2) ? 16384 : Segment.SIZE;
        } else {
            bVar2 = bVar;
        }
        if ((196608 & i10) == 0) {
            i11 |= wVarStartRestartGroup.changed(z10) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((74899 & i11) == 74898 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(12332512, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.GoNextButton (AdGoNextButton.kt:76)");
            }
            v5 v5VarCollectAsStateWithLifecycle = z4.f.collectAsStateWithLifecycle(stateFlow, (b1) null, (j0) null, (zu.m) null, wVarStartRestartGroup, (i11 >> 3) & 14, 7);
            wVarStartRestartGroup.startReplaceableGroup(-2101091474);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            p0.v vVar = p0.v.f80515a;
            if (objRememberedValue == vVar.getEmpty()) {
                objRememberedValue = o5.mutableStateOf$default(0, null, 2, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            j2 j2Var = (j2) objRememberedValue;
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.startReplaceableGroup(-2101089382);
            boolean zChanged = wVarStartRestartGroup.changed(v5VarCollectAsStateWithLifecycle) | wVarStartRestartGroup.changed(j2Var);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = new b(v5VarCollectAsStateWithLifecycle, j2Var, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.LaunchedEffect(x0.f87415a, (kv.p) objRememberedValue2, wVarStartRestartGroup, 6);
            int iM7056constructorimpl = k0.m7056constructorimpl(a(j2Var));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d dVarA = a(v5VarCollectAsStateWithLifecycle);
            d.b bVar3 = dVarA instanceof d.b ? (d.b) dVarA : null;
            int iM7056constructorimpl2 = k0.m7056constructorimpl(bVar3 != null ? bVar3.b() : 0);
            Boolean boolValueOf = Boolean.valueOf(a(v5VarCollectAsStateWithLifecycle) instanceof d.a);
            Boolean boolValueOf2 = Boolean.valueOf(!(a(v5VarCollectAsStateWithLifecycle) instanceof d.c));
            Boolean boolValueOf3 = Boolean.valueOf(z10);
            k0 k0VarM7055boximpl = k0.m7055boximpl(iM7056constructorimpl);
            k0 k0VarM7055boximpl2 = k0.m7055boximpl(iM7056constructorimpl2);
            int i12 = i11 << 3;
            bVar2.invoke(e0Var2, boolValueOf, boolValueOf2, aVar2, lVar2, boolValueOf3, k0VarM7055boximpl, k0VarM7055boximpl2, wVarStartRestartGroup, Integer.valueOf((i11 & 14) | (i12 & 7168) | (i12 & 57344) | (458752 & i11) | ((i11 << 12) & 234881024)));
            wVarStartRestartGroup = wVarStartRestartGroup;
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.l
                @Override // kv.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return m.a(e0Var, stateFlow, aVar, lVar, bVar, z10, i10, (p0.w) obj, iIntValue);
                }
            });
        }
    }

    public static final void a(j2 j2Var, int i10) {
        j2Var.setValue(Integer.valueOf(i10));
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d a(v5 v5Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d) v5Var.getValue();
    }

    public static final int a(j2 j2Var) {
        return ((Number) j2Var.getValue()).intValue();
    }
}

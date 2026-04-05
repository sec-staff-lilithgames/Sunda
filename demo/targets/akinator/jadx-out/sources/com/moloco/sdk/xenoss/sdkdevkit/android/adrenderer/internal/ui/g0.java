package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import p0.k1;
import p0.o4;
import p0.s0;
import p0.v5;
import p0.z4;
import tu.k0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class g0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f48593i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ v5 f48594j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ v5 f48595k;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0$a$a, reason: collision with other inner class name */
        public static final class C0442a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ v5 f48596b;

            public C0442a(v5 v5Var) {
                this.f48596b = v5Var;
            }

            public final Object a(int i10, zu.d<? super x0> dVar) {
                g0.b(this.f48596b).invoke();
                return x0.f87415a;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                return a(((k0) obj).m7061unboximpl(), dVar);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b implements Flow {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Flow f48597b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0$a$b$a, reason: collision with other inner class name */
            public static final class C0443a implements FlowCollector {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f48598b;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0$a$b$a$a, reason: collision with other inner class name */
                public static final class C0444a extends bv.d {

                    /* renamed from: i, reason: collision with root package name */
                    public /* synthetic */ Object f48599i;

                    /* renamed from: j, reason: collision with root package name */
                    public int f48600j;

                    public C0444a(zu.d dVar) {
                        super(dVar);
                    }

                    @Override // bv.a
                    public final Object invokeSuspend(Object obj) {
                        this.f48599i = obj;
                        this.f48600j |= Integer.MIN_VALUE;
                        return C0443a.this.emit(null, this);
                    }
                }

                public C0443a(FlowCollector flowCollector) {
                    this.f48598b = flowCollector;
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
                        boolean r0 = r6 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0.a.b.C0443a.C0444a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0$a$b$a$a r0 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0.a.b.C0443a.C0444a) r0
                        int r1 = r0.f48600j
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f48600j = r1
                        goto L18
                    L13:
                        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0$a$b$a$a r0 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0$a$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f48599i
                        java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f48600j
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
                        tu.k0 r6 = (tu.k0) r6
                        int r6 = r6.m7061unboximpl()
                        if (r6 != 0) goto L48
                        r0.f48600j = r3
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.f48598b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        tu.x0 r5 = tu.x0.f87415a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.g0.a.b.C0443a.emit(java.lang.Object, zu.d):java.lang.Object");
                }
            }

            public b(Flow flow) {
                this.f48597b = flow;
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, zu.d dVar) {
                Object objCollect = this.f48597b.collect(new C0443a(flowCollector), dVar);
                return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v5 v5Var, v5 v5Var2, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48594j = v5Var;
            this.f48595k = v5Var2;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f48594j, this.f48595k, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f48593i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                b bVar = new b(z4.snapshotFlow(new n(this.f48594j, 1)));
                C0442a c0442a = new C0442a(this.f48595k);
                this.f48593i = 1;
                if (bVar.collect(c0442a, this) == coroutine_suspended) {
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

        public static final k0 a(v5 v5Var) {
            return k0.m7055boximpl(g0.a(v5Var));
        }
    }

    public static final x0 a(g0.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n nVar, boolean z10, boolean z11, kv.a aVar, kv.a aVar2, kv.l lVar, kv.b bVar, boolean z12, int i10, p0.w wVar, int i11) {
        a(e0Var, nVar, z10, z11, aVar, aVar2, lVar, bVar, z12, wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final kv.a b(v5 v5Var) {
        return (kv.a) v5Var.getValue();
    }

    public static final void a(final g0.e0 e0Var, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n initialSecondsLeft, final boolean z10, final boolean z11, final kv.a onCountdownFinished, final kv.a onClick, final kv.l onButtonRendered, final kv.b basedOnAdCountdownButton, final boolean z12, p0.w wVar, final int i10) {
        int i11;
        boolean z13;
        boolean z14;
        kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(initialSecondsLeft, "initialSecondsLeft");
        kotlin.jvm.internal.e0.checkNotNullParameter(onCountdownFinished, "onCountdownFinished");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        kotlin.jvm.internal.e0.checkNotNullParameter(basedOnAdCountdownButton, "basedOnAdCountdownButton");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(686000336);
        if ((i10 & 6) == 0) {
            i11 = (wVarStartRestartGroup.changed(e0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= wVarStartRestartGroup.changed(initialSecondsLeft) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= wVarStartRestartGroup.changed(z10) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i10 & 3072) == 0) {
            z13 = z11;
            i11 |= wVarStartRestartGroup.changed(z13) ? 2048 : 1024;
        } else {
            z13 = z11;
        }
        if ((i10 & 24576) == 0) {
            i11 |= wVarStartRestartGroup.changed(onCountdownFinished) ? 16384 : Segment.SIZE;
        }
        if ((196608 & i10) == 0) {
            i11 |= wVarStartRestartGroup.changed(onClick) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i10) == 0) {
            i11 |= wVarStartRestartGroup.changed(onButtonRendered) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= wVarStartRestartGroup.changed(basedOnAdCountdownButton) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            z14 = z12;
            i11 |= wVarStartRestartGroup.changed(z14) ? 67108864 : 33554432;
        } else {
            z14 = z12;
        }
        if ((38347923 & i11) == 38347922 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(686000336, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.LifecycleAwareAdCountdownButton (LifecycleAwareAdCountdownButton.kt:33)");
            }
            wVarStartRestartGroup.startReplaceableGroup(773894976);
            wVarStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            p0.v vVar = p0.v.f80515a;
            if (objRememberedValue == vVar.getEmpty()) {
                s0 s0Var = new s0(k1.createCompositionCoroutineScope(zu.n.f98854b, wVarStartRestartGroup));
                wVarStartRestartGroup.updateRememberedValue(s0Var);
                objRememberedValue = s0Var;
            }
            wVarStartRestartGroup.endReplaceableGroup();
            CoroutineScope coroutineScope = ((s0) objRememberedValue).getCoroutineScope();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.startReplaceableGroup(1117955184);
            boolean zChanged = wVarStartRestartGroup.changed(initialSecondsLeft);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.y.a(((k0) initialSecondsLeft.a()).m7061unboximpl(), coroutineScope);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            v5 v5VarCollectAsStateWithLifecycle = z4.f.collectAsStateWithLifecycle((StateFlow) objRememberedValue2, (b1) null, (j0) null, (zu.m) null, wVarStartRestartGroup, 0, 7);
            v5 v5VarRememberUpdatedState = z4.rememberUpdatedState(onCountdownFinished, wVarStartRestartGroup, (i11 >> 12) & 14);
            wVarStartRestartGroup.startReplaceableGroup(1117962924);
            boolean zChanged2 = wVarStartRestartGroup.changed(v5VarCollectAsStateWithLifecycle) | wVarStartRestartGroup.changed(v5VarRememberUpdatedState);
            Object objRememberedValue3 = wVarStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue3 == vVar.getEmpty()) {
                objRememberedValue3 = new a(v5VarCollectAsStateWithLifecycle, v5VarRememberUpdatedState, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.LaunchedEffect(x0.f87415a, (kv.p) objRememberedValue3, wVarStartRestartGroup, 6);
            int i12 = i11 >> 6;
            basedOnAdCountdownButton.invoke(e0Var, Boolean.valueOf(z13), Boolean.valueOf(z10), onClick, onButtonRendered, Boolean.valueOf(z14), initialSecondsLeft.a(), k0.m7055boximpl(a(v5VarCollectAsStateWithLifecycle)), wVarStartRestartGroup, Integer.valueOf(((i11 << 3) & 234881024) | (i11 & 14) | (i12 & 112) | (i11 & 896) | (i12 & 7168) | (i12 & 57344) | ((i11 >> 9) & 458752)));
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.f0
                @Override // kv.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return g0.a(e0Var, initialSecondsLeft, z10, z11, onCountdownFinished, onClick, onButtonRendered, basedOnAdCountdownButton, z12, i10, (p0.w) obj, iIntValue);
                }
            });
        }
    }

    public static final int a(v5 v5Var) {
        return ((k0) v5Var.getValue()).m7061unboximpl();
    }
}

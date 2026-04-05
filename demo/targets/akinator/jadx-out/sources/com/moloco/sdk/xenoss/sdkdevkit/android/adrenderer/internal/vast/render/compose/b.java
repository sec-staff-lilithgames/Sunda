package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import a2.a3;
import a2.g5;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import p0.a6;
import p0.g1;
import p0.h1;
import p0.k1;
import p0.o4;
import p0.v5;
import p0.z4;
import tu.x0;
import u1.i1;
import u1.k0;
import x1.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49593i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h f49594j;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b$a$a, reason: collision with other inner class name */
        public static final class C0468a extends bv.n implements kv.p {

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h f49595i;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0468a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, zu.d<? super C0468a> dVar) {
                super(2, dVar);
                this.f49595i = hVar;
            }

            @Override // kv.p
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                return ((C0468a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
            }

            @Override // bv.a
            public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                return new C0468a(this.f49595i, dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                av.e.getCOROUTINE_SUSPENDED();
                tu.a0.throwOnFailure(obj);
                this.f49595i.b();
                return x0.f87415a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f49594j = hVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f49594j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49593i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                zu.m main = com.moloco.sdk.internal.scheduling.c.a().getMain();
                C0468a c0468a = new C0468a(this.f49594j, null);
                this.f49593i = 1;
                if (BuildersKt.withContext(main, c0468a, this) == coroutine_suspended) {
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
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b$b, reason: collision with other inner class name */
    public static final class C0469b extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49596i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49597j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h f49598k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0469b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, zu.d<? super C0469b> dVar) {
            super(2, dVar);
            this.f49598k = hVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k0 k0Var, zu.d<? super x0> dVar) {
            return ((C0469b) create(k0Var, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            C0469b c0469b = new C0469b(this.f49598k, dVar);
            c0469b.f49597j = obj;
            return c0469b;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49596i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                k0 k0Var = (k0) this.f49597j;
                a1.a aVar = new a1.a(this.f49598k, 5);
                this.f49596i = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(k0Var, aVar, this) == coroutine_suspended) {
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

        public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, i1.h hVar2, i1.h hVar3) {
            hVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f48771a.a(hVar2.m4195unboximpl()));
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public int f49599i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f49600j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h f49601k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kv.a f49602l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, kv.a aVar, zu.d<? super c> dVar) {
            super(2, dVar);
            this.f49601k = hVar;
            this.f49602l = aVar;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(k0 k0Var, zu.d<? super x0> dVar) {
            return ((c) create(k0Var, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            c cVar = new c(this.f49601k, this.f49602l, dVar);
            cVar.f49600j = obj;
            return cVar;
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
            int i10 = this.f49599i;
            if (i10 == 0) {
                tu.a0.throwOnFailure(obj);
                k0 k0Var = (k0) this.f49600j;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.c(0, this.f49601k, this.f49602l);
                this.f49599i = 1;
                if (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch.b.a(k0Var, cVar, this) == coroutine_suspended) {
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

        public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, kv.a aVar, i1.h hVar2, i1.h hVar3) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c cVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f48771a;
            hVar.a(cVar.a(hVar2.m4195unboximpl()));
            if (aVar != null) {
                aVar.invoke();
            } else {
                hVar.b(cVar.a(hVar2.m4195unboximpl()));
            }
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h f49603a;

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar) {
            this.f49603a = hVar;
        }

        @Override // p0.g1
        public void dispose() {
            this.f49603a.A();
        }
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, kv.a aVar, e1.v vVar, int i10, int i11, p0.w wVar, int i12) {
        a(hVar, aVar, vVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final x0 a(k.b bVar, e1.v vVar, int i10, int i11, p0.w wVar, int i12) {
        a(bVar, vVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final x0 a(int i10, p0.w wVar, int i11) {
        a(wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h viewModel, kv.a aVar, e1.v vVar, p0.w wVar, int i10, int i11) {
        int i12;
        kotlin.jvm.internal.e0.checkNotNullParameter(viewModel, "viewModel");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1013674470);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (wVarStartRestartGroup.changed(viewModel) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(aVar) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= wVarStartRestartGroup.changed(vVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i12 & 147) == 146 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                vVar = e1.t.f53496b;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1013674470, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.Companion (Companion.kt:30)");
            }
            wVarStartRestartGroup.startReplaceableGroup(-1879742322);
            boolean zChanged = wVarStartRestartGroup.changed(viewModel);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            p0.v vVar2 = p0.v.f80515a;
            if (zChanged || objRememberedValue == vVar2.getEmpty()) {
                objRememberedValue = new a(viewModel, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            x0 x0Var = x0.f87415a;
            k1.LaunchedEffect(x0Var, (kv.p) objRememberedValue, wVarStartRestartGroup, 6);
            wVarStartRestartGroup.startReplaceableGroup(-1879738001);
            boolean zChanged2 = wVarStartRestartGroup.changed(viewModel);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == vVar2.getEmpty()) {
                objRememberedValue2 = new aw.f(viewModel, 12);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.DisposableEffect(x0Var, (kv.l) objRememberedValue2, wVarStartRestartGroup, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k kVarA = a(z4.collectAsState(viewModel.L(), null, wVarStartRestartGroup, 0, 1));
            if (kVarA instanceof k.a) {
                wVarStartRestartGroup.startReplaceableGroup(1857903466);
                wVarStartRestartGroup.startReplaceableGroup(-1879727652);
                boolean zChanged3 = wVarStartRestartGroup.changed(viewModel);
                Object objRememberedValue3 = wVarStartRestartGroup.rememberedValue();
                if (zChanged3 || objRememberedValue3 == vVar2.getEmpty()) {
                    objRememberedValue3 = new C0469b(viewModel, null);
                    wVarStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                wVarStartRestartGroup.endReplaceableGroup();
                b0.a((k.a) kVarA, i1.pointerInput(vVar, x0Var, (kv.p) objRememberedValue3), wVarStartRestartGroup, 0, 0);
                wVarStartRestartGroup.endReplaceableGroup();
            } else if (kVarA instanceof k.b) {
                wVarStartRestartGroup.startReplaceableGroup(1858286099);
                wVarStartRestartGroup.startReplaceableGroup(-1879715540);
                boolean zChanged4 = wVarStartRestartGroup.changed(viewModel) | wVarStartRestartGroup.changed(aVar);
                Object objRememberedValue4 = wVarStartRestartGroup.rememberedValue();
                if (zChanged4 || objRememberedValue4 == vVar2.getEmpty()) {
                    objRememberedValue4 = new c(viewModel, aVar, null);
                    wVarStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                wVarStartRestartGroup.endReplaceableGroup();
                a((k.b) kVarA, i1.pointerInput(vVar, x0Var, (kv.p) objRememberedValue4), wVarStartRestartGroup, 0, 0);
                wVarStartRestartGroup.endReplaceableGroup();
            } else if (kVarA == null) {
                wVarStartRestartGroup.startReplaceableGroup(1858714333);
                wVarStartRestartGroup.endReplaceableGroup();
            } else {
                wVarStartRestartGroup.startReplaceableGroup(-1879731707);
                wVarStartRestartGroup.endReplaceableGroup();
                throw new tu.t();
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        e1.v vVar3 = vVar;
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(viewModel, aVar, vVar3, i10, i11));
        }
    }

    public static final void a(k.b bVar, e1.v vVar, p0.w wVar, int i10, int i11) {
        int i12;
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(2103037730);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (wVarStartRestartGroup.changed(bVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(vVar) ? 32 : 16;
        }
        if ((i12 & 19) == 18 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                vVar = e1.t.f53496b;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(2103037730, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionVastResourceImage (Companion.kt:74)");
            }
            e1.d center = e1.d.f53469a.getCenter();
            wVarStartRestartGroup.startReplaceableGroup(733328855);
            x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(center, false, wVarStartRestartGroup, 6);
            s2.e eVar = (s2.e) a.b.d(wVarStartRestartGroup, -1323940314);
            s2.x xVar = (s2.x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = g0.materializerOf(vVar);
            if (wVarStartRestartGroup.getApplier() == null) {
                p0.p.invalidApplier();
            }
            wVarStartRestartGroup.startReusableNode();
            if (wVarStartRestartGroup.getInserting()) {
                wVarStartRestartGroup.createNode(constructor);
            } else {
                wVarStartRestartGroup.useNode();
            }
            wVarStartRestartGroup.disableReusing();
            p0.w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarRememberBoxMeasurePolicy, wVarM5780constructorimpl, eVar));
            a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVarStartRestartGroup, wVarStartRestartGroup), wVarStartRestartGroup, 2058660585);
            wVarStartRestartGroup.startReplaceableGroup(-2137368960);
            c0.a(bVar, null, wVarStartRestartGroup, i12 & 14, 2);
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endNode();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        e1.v vVar2 = vVar;
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.a(bVar, vVar2, i10, i11, 0));
        }
    }

    public static final void a(p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-882012692);
        if (i10 == 0 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-882012692, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.CompanionVastResourceImagePreview (Companion.kt:85)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.d.f49607a.a(), wVarStartRestartGroup, 48, 1);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a(i10, 3));
        }
    }

    public static final g1 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h hVar, h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new d(hVar);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k a(v5 v5Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k) v5Var.getValue();
    }
}

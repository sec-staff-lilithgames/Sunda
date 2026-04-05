package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import a2.h2;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import b0.t1;
import b0.v1;
import com.applovin.shadow.okio.Segment;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import e2.r0;
import e2.u0;
import g0.b4;
import g0.f2;
import g0.h3;
import g0.i2;
import j1.m0;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.StateFlow;
import p0.j2;
import p0.o5;
import p0.v5;
import p0.z4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class x {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m f49802b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kv.u f49803c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.s f49804e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.t f49805f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kv.u f49806g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j f49807h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l f49808i;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0479a extends kotlin.jvm.internal.a0 implements kv.a {
            public C0479a(Object obj) {
                super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l.class, "onReplay", "onReplay()V", 0);
            }

            public final void a() {
                ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l) this.receiver).B();
            }

            @Override // kv.a
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return x0.f87415a;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar, kv.u uVar, kv.s sVar, kv.t tVar, kv.u uVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar) {
            this.f49802b = mVar;
            this.f49803c = uVar;
            this.f49804e = sVar;
            this.f49805f = tVar;
            this.f49806g = uVar2;
            this.f49807h = jVar;
            this.f49808i = lVar;
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVar, p0.w wVar, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = (wVar.changed(kVar) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1837331254, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.VastRenderer.<anonymous>.<anonymous> (VastRenderer.kt:88)");
            }
            boolean z10 = kVar instanceof k.a;
            e1.t tVar = e1.t.f53496b;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar = this.f49802b;
            if (z10) {
                wVar.startReplaceableGroup(1864270639);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.b.a(((k.a) kVar).d(), mVar != null ? mVar.a() : null, h3.fillMaxSize$default(tVar, 0.0f, 1, null), wVar, 384, 0);
                wVar.endReplaceableGroup();
            } else if (kVar instanceof k.c) {
                wVar.startReplaceableGroup(1864278356);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.l lVarD = ((k.c) kVar).d();
                kv.a aVarC = mVar != null ? mVar.c() : null;
                e1.v vVarFillMaxSize$default = h3.fillMaxSize$default(tVar, 0.0f, 1, null);
                wVar.startReplaceableGroup(1864289963);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar = this.f49808i;
                boolean zChanged = wVar.changed(lVar);
                Object objRememberedValue = wVar.rememberedValue();
                if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                    objRememberedValue = new C0479a(lVar);
                    wVar.updateRememberedValue(objRememberedValue);
                }
                wVar.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a(lVarD, aVarC, vVarFillMaxSize$default, this.f49803c, this.f49804e, this.f49805f, this.f49806g, this.f49807h, (kv.a) ((KFunction) objRememberedValue), wVar, 384, 0);
                wVar.endReplaceableGroup();
            } else if (kVar instanceof k.b) {
                wVar.startReplaceableGroup(1864292898);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(((k.b) kVar).d(), mVar != null ? mVar.b() : null, this.f49805f, h3.fillMaxSize$default(tVar, 0.0f, 1, null), wVar, 3072, 0);
                wVar.endReplaceableGroup();
            } else if (kVar instanceof k.d) {
                wVar.startReplaceableGroup(1958779838);
                wVar.endReplaceableGroup();
            } else {
                if (kVar != null) {
                    wVar.startReplaceableGroup(1864269410);
                    wVar.endReplaceableGroup();
                    throw new tu.t();
                }
                wVar.startReplaceableGroup(1958818154);
                wVar.endReplaceableGroup();
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) obj, (p0.w) obj2, ((Number) obj3).intValue());
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

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class c extends kotlin.jvm.internal.a0 implements kv.a {
        public c(Object obj) {
            super(0, obj, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l.class, "onCTA", "onCTA()V", 0);
        }

        public final void a() {
            ((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l) this.receiver).C();
        }

        @Override // kv.a
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class d extends kotlin.jvm.internal.a0 implements kv.l {
        public d(Object obj) {
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

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e implements kv.u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1.d f49809b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2 f49810c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f49811e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f49812f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ long f49813g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f49814h;

        public e(e1.d dVar, i2 i2Var, String str, String str2, long j10, kv.a aVar) {
            this.f49809b = dVar;
            this.f49810c = i2Var;
            this.f49811e = str;
            this.f49812f = str2;
            this.f49813g = j10;
            this.f49814h = aVar;
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k b(v5 v5Var) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) v5Var.getValue();
        }

        @Override // kv.u
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            a((g0.e0) obj, ((Boolean) obj2).booleanValue(), (StateFlow) obj3, (kv.l) obj4, (kv.a) obj5, (p0.w) obj6, ((Number) obj7).intValue());
            return x0.f87415a;
        }

        public final void a(g0.e0 e0Var, boolean z10, StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k> currentAdPartFlow, kv.l onButtonRendered, kv.a onCTA, p0.w wVar, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(currentAdPartFlow, "currentAdPartFlow");
            kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            kotlin.jvm.internal.e0.checkNotNullParameter(onCTA, "onCTA");
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(432764356, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous> (VastRenderer.kt:295)");
            }
            v5 v5VarCollectAsState = z4.collectAsState(currentAdPartFlow, null, wVar, (i10 >> 6) & 14, 1);
            b0.b0.AnimatedVisibility(z10, f2.padding(b4.displayCutoutPadding(((g0.f0) e0Var).align(e1.t.f53496b, this.f49809b)), this.f49810c), (t1) null, (v1) null, (String) null, z0.u.composableLambda(wVar, 1004334236, true, new a(onButtonRendered, v5VarCollectAsState, this.f49811e, this.f49812f, this.f49813g, onCTA, this.f49814h)), wVar, ((i10 >> 3) & 14) | 196608, 28);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ kv.l f49815b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ v5 f49816c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f49817e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ String f49818f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ long f49819g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ kv.a f49820h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ kv.a f49821i;

            public a(kv.l lVar, v5 v5Var, String str, String str2, long j10, kv.a aVar, kv.a aVar2) {
                this.f49815b = lVar;
                this.f49816c = v5Var;
                this.f49817e = str;
                this.f49818f = str2;
                this.f49819g = j10;
                this.f49820h = aVar;
                this.f49821i = aVar2;
            }

            public final void a(b0.c0 AnimatedVisibility, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(1004334236, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous> (VastRenderer.kt:314)");
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVarB = e.b(this.f49816c);
                if (kVarB instanceof k.a) {
                    wVar.startReplaceableGroup(1203578611);
                    i0.a(null, a.c.EnumC0490a.f50252i, this.f49815b, z0.u.composableLambda(wVar, -832302220, true, new C0480a(this.f49817e, this.f49818f, this.f49819g, this.f49820h, this.f49821i)), wVar, 3120, 1);
                    wVar.endReplaceableGroup();
                } else if (kVarB instanceof k.c) {
                    wVar.startReplaceableGroup(1204169843);
                    i0.a(null, a.c.EnumC0490a.f50252i, this.f49815b, z0.u.composableLambda(wVar, 1517460509, true, new b(this.f49817e, this.f49818f, this.f49819g, this.f49820h, this.f49821i)), wVar, 3120, 1);
                    wVar.endReplaceableGroup();
                } else if (kVarB instanceof k.b) {
                    wVar.startReplaceableGroup(1204743343);
                    wVar.endReplaceableGroup();
                } else if (kVarB instanceof k.d) {
                    wVar.startReplaceableGroup(1204828748);
                    wVar.endReplaceableGroup();
                } else {
                    if (kVarB != null) {
                        wVar.startReplaceableGroup(-1485196921);
                        wVar.endReplaceableGroup();
                        throw new tu.t();
                    }
                    wVar.startReplaceableGroup(1204863499);
                    wVar.endReplaceableGroup();
                }
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((b0.c0) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x$e$a$a, reason: collision with other inner class name */
            public static final class C0480a implements kv.q {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f49822b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f49823c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f49824e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ kv.a f49825f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ kv.a f49826g;

                public C0480a(String str, String str2, long j10, kv.a aVar, kv.a aVar2) {
                    this.f49822b = str;
                    this.f49823c = str2;
                    this.f49824e = j10;
                    this.f49825f = aVar;
                    this.f49826g = aVar2;
                }

                public final void a(e1.v it, p0.w wVar, int i10) {
                    int i11;
                    kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                    if ((i10 & 6) == 0) {
                        i11 = (wVar.changed(it) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && wVar.getSkipping()) {
                        wVar.skipToGroupEnd();
                        return;
                    }
                    if (p0.d0.isTraceInProgress()) {
                        p0.d0.traceEventStart(-832302220, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:320)");
                    }
                    wVar.startReplaceableGroup(-1483998215);
                    kv.a aVar = this.f49825f;
                    boolean zChanged = wVar.changed(aVar);
                    kv.a aVar2 = this.f49826g;
                    boolean zChanged2 = zChanged | wVar.changed(aVar2);
                    Object objRememberedValue = wVar.rememberedValue();
                    if (zChanged2 || objRememberedValue == p0.v.f80515a.getEmpty()) {
                        objRememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i(aVar, aVar2, 1);
                        wVar.updateRememberedValue(objRememberedValue);
                    }
                    wVar.endReplaceableGroup();
                    q.a(it, this.f49822b, this.f49823c, this.f49824e, (kv.a) objRememberedValue, wVar, i11 & 14, 0);
                    if (p0.d0.isTraceInProgress()) {
                        p0.d0.traceEventEnd();
                    }
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
                    return x0.f87415a;
                }

                public static final x0 a(kv.a aVar, kv.a aVar2) {
                    aVar.invoke();
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return x0.f87415a;
                }
            }

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            public static final class b implements kv.q {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ String f49827b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ String f49828c;

                /* renamed from: e, reason: collision with root package name */
                public final /* synthetic */ long f49829e;

                /* renamed from: f, reason: collision with root package name */
                public final /* synthetic */ kv.a f49830f;

                /* renamed from: g, reason: collision with root package name */
                public final /* synthetic */ kv.a f49831g;

                public b(String str, String str2, long j10, kv.a aVar, kv.a aVar2) {
                    this.f49827b = str;
                    this.f49828c = str2;
                    this.f49829e = j10;
                    this.f49830f = aVar;
                    this.f49831g = aVar2;
                }

                public final void a(e1.v it, p0.w wVar, int i10) {
                    int i11;
                    kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                    if ((i10 & 6) == 0) {
                        i11 = (wVar.changed(it) ? 4 : 2) | i10;
                    } else {
                        i11 = i10;
                    }
                    if ((i11 & 19) == 18 && wVar.getSkipping()) {
                        wVar.skipToGroupEnd();
                        return;
                    }
                    if (p0.d0.isTraceInProgress()) {
                        p0.d0.traceEventStart(1517460509, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:337)");
                    }
                    wVar.startReplaceableGroup(-1483979143);
                    kv.a aVar = this.f49830f;
                    boolean zChanged = wVar.changed(aVar);
                    kv.a aVar2 = this.f49831g;
                    boolean zChanged2 = zChanged | wVar.changed(aVar2);
                    Object objRememberedValue = wVar.rememberedValue();
                    if (zChanged2 || objRememberedValue == p0.v.f80515a.getEmpty()) {
                        objRememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.i(aVar, aVar2, 2);
                        wVar.updateRememberedValue(objRememberedValue);
                    }
                    wVar.endReplaceableGroup();
                    q.a(it, this.f49827b, this.f49828c, this.f49829e, (kv.a) objRememberedValue, wVar, i11 & 14, 0);
                    if (p0.d0.isTraceInProgress()) {
                        p0.d0.traceEventEnd();
                    }
                }

                @Override // kv.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    a((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
                    return x0.f87415a;
                }

                public static final x0 a(kv.a aVar, kv.a aVar2) {
                    aVar.invoke();
                    if (aVar2 != null) {
                        aVar2.invoke();
                    }
                    return x0.f87415a;
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f implements kv.u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1.d f49832b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2 f49833c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ m1.e f49834e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ m1.e f49835f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kv.a f49836g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f49837h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ long f49838i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f49839j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ j1.f2 f49840k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f49841l;

        public f(e1.d dVar, i2 i2Var, m1.e eVar, m1.e eVar2, kv.a aVar, long j10, long j11, long j12, j1.f2 f2Var, long j13) {
            this.f49832b = dVar;
            this.f49833c = i2Var;
            this.f49834e = eVar;
            this.f49835f = eVar2;
            this.f49836g = aVar;
            this.f49837h = j10;
            this.f49838i = j11;
            this.f49839j = j12;
            this.f49840k = f2Var;
            this.f49841l = j13;
        }

        public static final a.c b(j2 j2Var) {
            return (a.c) j2Var.getValue();
        }

        @Override // kv.u
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
            a((g0.e0) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (kv.p) obj4, (kv.l) obj5, (p0.w) obj6, ((Number) obj7).intValue());
            return x0.f87415a;
        }

        public static final void b(j2 j2Var, a.c cVar) {
            j2Var.setValue(cVar);
        }

        public final void a(g0.e0 e0Var, boolean z10, boolean z11, kv.p onButtonReplaced, kv.l onMuteChange, p0.w wVar, int i10) {
            int i11;
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(onButtonReplaced, "onButtonReplaced");
            kotlin.jvm.internal.e0.checkNotNullParameter(onMuteChange, "onMuteChange");
            if ((i10 & 6) == 0) {
                i11 = (wVar.changed(e0Var) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= wVar.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= wVar.changed(z11) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i10 & 3072) == 0) {
                i11 |= wVar.changed(onButtonReplaced) ? 2048 : 1024;
            }
            if ((i10 & 24576) == 0) {
                i11 |= wVar.changed(onMuteChange) ? 16384 : Segment.SIZE;
            }
            int i12 = i11;
            if ((74899 & i12) == 74898 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-545982054, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous> (VastRenderer.kt:231)");
            }
            wVar.startReplaceableGroup(-1304253431);
            Object objRememberedValue = wVar.rememberedValue();
            if (objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = o5.mutableStateOf$default(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.b.a(a.c.EnumC0490a.f50250g), null, 2, null);
                wVar.updateRememberedValue(objRememberedValue);
            }
            wVar.endReplaceableGroup();
            b0.b0.AnimatedVisibility(z10, f2.padding(b4.displayCutoutPadding(((g0.f0) e0Var).align(e1.t.f53496b, this.f49832b)), this.f49833c), (t1) null, (v1) null, (String) null, z0.u.composableLambda(wVar, -2071462974, true, new a(z11, this.f49834e, this.f49835f, (j2) objRememberedValue, onButtonReplaced, onMuteChange, this.f49836g, z10, this.f49837h, this.f49838i, this.f49839j, this.f49840k, this.f49841l)), wVar, ((i12 >> 3) & 14) | 196608, 28);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f49842b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m1.e f49843c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ m1.e f49844e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ j2 f49845f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ kv.p f49846g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ kv.l f49847h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ kv.a f49848i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ boolean f49849j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ long f49850k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ long f49851l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ long f49852m;

            /* renamed from: n, reason: collision with root package name */
            public final /* synthetic */ j1.f2 f49853n;

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ long f49854o;

            public a(boolean z10, m1.e eVar, m1.e eVar2, j2 j2Var, kv.p pVar, kv.l lVar, kv.a aVar, boolean z11, long j10, long j11, long j12, j1.f2 f2Var, long j13) {
                this.f49842b = z10;
                this.f49843c = eVar;
                this.f49844e = eVar2;
                this.f49845f = j2Var;
                this.f49846g = pVar;
                this.f49847h = lVar;
                this.f49848i = aVar;
                this.f49849j = z11;
                this.f49850k = j10;
                this.f49851l = j11;
                this.f49852m = j12;
                this.f49853n = f2Var;
                this.f49854o = j13;
            }

            public final void a(b0.c0 AnimatedVisibility, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(-2071462974, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton.<anonymous>.<anonymous> (VastRenderer.kt:242)");
                }
                final boolean z10 = this.f49842b;
                m1.e eVar = z10 ? this.f49843c : this.f49844e;
                final j2 j2Var = this.f49845f;
                a.c cVarB = f.b(j2Var);
                wVar.startReplaceableGroup(-133207083);
                boolean zChanged = wVar.changed(j2Var);
                final kv.p pVar = this.f49846g;
                boolean zChanged2 = zChanged | wVar.changed(pVar) | wVar.changed(z10);
                Object objRememberedValue = wVar.rememberedValue();
                p0.v vVar = p0.v.f80515a;
                if (zChanged2 || objRememberedValue == vVar.getEmpty()) {
                    objRememberedValue = new kv.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.y
                        @Override // kv.l
                        public final Object invoke(Object obj) {
                            return x.f.a.a(pVar, z10, j2Var, (a.c) obj);
                        }
                    };
                    wVar.updateRememberedValue(objRememberedValue);
                }
                wVar.endReplaceableGroup();
                e1.v vVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a.a(e1.t.f53496b, cVarB, (kv.l) objRememberedValue);
                wVar.startReplaceableGroup(-133199999);
                boolean zChanged3 = wVar.changed("mute_button");
                Object objRememberedValue2 = wVar.rememberedValue();
                if (zChanged3 || objRememberedValue2 == vVar.getEmpty()) {
                    objRememberedValue2 = new a1.o(25);
                    wVar.updateRememberedValue(objRememberedValue2);
                }
                wVar.endReplaceableGroup();
                e1.v vVarSemantics$default = e2.v.semantics$default(vVarA, false, (kv.l) objRememberedValue2, 1, null);
                wVar.startReplaceableGroup(-133193669);
                boolean zChanged4 = wVar.changed(z10) | wVar.changed(this.f49847h) | wVar.changed(j2Var) | wVar.changed(pVar) | wVar.changed(this.f49848i);
                Object objRememberedValue3 = wVar.rememberedValue();
                if (zChanged4 || objRememberedValue3 == vVar.getEmpty()) {
                    final kv.l lVar = this.f49847h;
                    final boolean z11 = this.f49842b;
                    final kv.p pVar2 = this.f49846g;
                    final kv.a aVar = this.f49848i;
                    final j2 j2Var2 = this.f49845f;
                    Object obj = new kv.a() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.z
                        @Override // kv.a
                        public final Object invoke() {
                            return x.f.a.a(lVar, z11, pVar2, aVar, j2Var2);
                        }
                    };
                    wVar.updateRememberedValue(obj);
                    objRememberedValue3 = obj;
                }
                wVar.endReplaceableGroup();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.c0.a(eVar, (kv.a) objRememberedValue3, vVarSemantics$default, this.f49849j, "mute/unmute", this.f49850k, this.f49851l, this.f49852m, this.f49853n, this.f49854o, wVar, 24576, 0);
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((b0.c0) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }

            public static final x0 a(kv.p pVar, boolean z10, j2 j2Var, a.c it) {
                kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
                f.b(j2Var, it);
                pVar.invoke(f.b(j2Var), z10 ? a.c.EnumC0490a.f50250g : a.c.EnumC0490a.f50251h);
                return x0.f87415a;
            }

            public static final x0 a(String str, u0 semantics) {
                kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
                r0.setContentDescription(semantics, str);
                r0.setTestTag(semantics, str);
                return x0.f87415a;
            }

            public static final x0 a(kv.l lVar, boolean z10, kv.p pVar, kv.a aVar, j2 j2Var) {
                lVar.invoke(Boolean.valueOf(!z10));
                f.b(j2Var, new a.c(z10 ? a.c.EnumC0490a.f50250g : a.c.EnumC0490a.f50251h, f.b(j2Var).e(), f.b(j2Var).f()));
                pVar.invoke(f.b(j2Var), z10 ? a.c.EnumC0490a.f50251h : a.c.EnumC0490a.f50250g);
                if (aVar != null) {
                    aVar.invoke();
                }
                return x0.f87415a;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class g implements kv.s {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1.d f49855b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i2 f49856c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f49857e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f49858b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j f49859c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ long f49860e;

            public a(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, long j10) {
                this.f49858b = z10;
                this.f49859c = jVar;
                this.f49860e = j10;
            }

            public final void a(b0.c0 AnimatedVisibility, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(-1435522410, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous>.<anonymous> (VastRenderer.kt:378)");
                }
                u.a(this.f49858b, this.f49859c, null, this.f49860e, wVar, 0, 4);
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((b0.c0) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }
        }

        public g(e1.d dVar, i2 i2Var, long j10) {
            this.f49855b = dVar;
            this.f49856c = i2Var;
            this.f49857e = j10;
        }

        public final void a(g0.e0 e0Var, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j progress, p0.w wVar, int i10) {
            int i11;
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(progress, "progress");
            if ((i10 & 6) == 0) {
                i11 = (wVar.changed(e0Var) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if ((i10 & 48) == 0) {
                i11 |= wVar.changed(z10) ? 32 : 16;
            }
            if ((i10 & 384) == 0) {
                i11 |= wVar.changed(progress) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            }
            if ((i11 & 1171) == 1170 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1967084142, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar.<anonymous> (VastRenderer.kt:370)");
            }
            b0.b0.AnimatedVisibility(z10 || ((progress instanceof j.c) && ((j.c) progress).c() > 0), f2.padding(((g0.f0) e0Var).align(h3.fillMaxWidth$default(e1.t.f53496b, 0.0f, 1, null), this.f49855b), this.f49856c), (t1) null, (v1) null, (String) null, z0.u.composableLambda(wVar, -1435522410, true, new a(z10, progress, this.f49857e)), wVar, 196608, 28);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((g0.e0) obj, ((Boolean) obj2).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) obj3, (p0.w) obj4, ((Number) obj5).intValue());
            return x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class h implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final h f49861b = new h();

        public final kv.u a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(838284708);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(838284708, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:174)");
            }
            kv.u uVarA = x.a(0L, 0L, null, 0L, null, null, 0L, null, null, null, wVar, 0, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return uVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final i f49862b = new i();

        public final kv.b a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(-562763068);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-562763068, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:175)");
            }
            kv.b bVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0.a(null, null, 0L, 0L, 0L, null, null, null, wVar, 0, 255);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return bVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final j f49863b = new j();

        public final kv.b a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(-450891997);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-450891997, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:176)");
            }
            kv.b bVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.i.a(null, null, 0L, 0L, 0L, null, null, null, wVar, 0, 255);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return bVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final k f49864b = new k();

        public final kv.u a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(-832109727);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-832109727, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:177)");
            }
            kv.u uVarA = x.a(null, null, 0L, null, null, null, wVar, 0, 63);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return uVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final l f49865b = new l();

        public final kv.s a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(976926819);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(976926819, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:179)");
            }
            kv.s sVarA = x.a(null, null, 0L, wVar, 0, 7);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return sVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final m f49866b = new m();

        public final kv.t a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(658271039);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(658271039, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:180)");
            }
            kv.t tVarA = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.l.a(null, null, wVar, 0, 3);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return tVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class n implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final n f49867b = new n();

        public final Void a(p0.w wVar, int i10) {
            wVar.startReplaceableGroup(-1106742594);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1106742594, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous> (VastRenderer.kt:181)");
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return null;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((p0.w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class o implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l f49868b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f49869c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.p f49870e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.p f49871f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kv.p f49872g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.p f49873h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m f49874i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ kv.p f49875j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ kv.p f49876k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kv.p f49877l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j f49878m;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements kv.p {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l f49879b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f49880c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kv.p f49881e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ kv.p f49882f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ kv.p f49883g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ kv.p f49884h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m f49885i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ kv.p f49886j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ kv.p f49887k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ kv.p f49888l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j f49889m;

            public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar, long j10, kv.p pVar, kv.p pVar2, kv.p pVar3, kv.p pVar4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar, kv.p pVar5, kv.p pVar6, kv.p pVar7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar) {
                this.f49879b = lVar;
                this.f49880c = j10;
                this.f49881e = pVar;
                this.f49882f = pVar2;
                this.f49883g = pVar3;
                this.f49884h = pVar4;
                this.f49885i = mVar;
                this.f49886j = pVar5;
                this.f49887k = pVar6;
                this.f49888l = pVar7;
                this.f49889m = jVar;
            }

            public final void a(p0.w wVar, int i10) {
                if ((i10 & 3) == 2 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(831245532, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:189)");
                }
                x.a(this.f49879b, null, this.f49880c, (kv.u) this.f49881e.invoke(wVar, 0), (kv.b) this.f49882f.invoke(wVar, 0), (kv.b) this.f49883g.invoke(wVar, 0), (kv.u) this.f49884h.invoke(wVar, 0), this.f49885i, (kv.s) this.f49886j.invoke(wVar, 0), (kv.t) this.f49887k.invoke(wVar, 0), (kv.u) this.f49888l.invoke(wVar, 0), this.f49889m, wVar, 0, 0, 2);
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

        public o(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar, long j10, kv.p pVar, kv.p pVar2, kv.p pVar3, kv.p pVar4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar, kv.p pVar5, kv.p pVar6, kv.p pVar7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar) {
            this.f49868b = lVar;
            this.f49869c = j10;
            this.f49870e = pVar;
            this.f49871f = pVar2;
            this.f49872g = pVar3;
            this.f49873h = pVar4;
            this.f49874i = mVar;
            this.f49875j = pVar5;
            this.f49876k = pVar6;
            this.f49877l = pVar7;
            this.f49878m = jVar;
        }

        public final void a(p0.w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(876197241, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultVastRenderer.<anonymous>.<anonymous>.<anonymous> (VastRenderer.kt:188)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, z0.u.composableLambda(wVar, 831245532, true, new a(this.f49868b, this.f49869c, this.f49870e, this.f49871f, this.f49872g, this.f49873h, this.f49874i, this.f49875j, this.f49876k, this.f49877l, this.f49878m)), wVar, 48, 1);
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

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar, e1.v vVar, long j10, kv.u uVar, kv.b bVar, kv.b bVar2, kv.u uVar2, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar, kv.s sVar, kv.t tVar, kv.u uVar3, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, int i10, int i11, int i12, p0.w wVar, int i13) {
        a(lVar, vVar, j10, uVar, bVar, bVar2, uVar2, mVar, sVar, tVar, uVar3, jVar, wVar, i10 | 1, i11, i12);
        return x0.f87415a;
    }

    public static final boolean b(v5 v5Var) {
        return ((Boolean) v5Var.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:233:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l r40, e1.v r41, long r42, kv.u r44, kv.b r45, kv.b r46, kv.u r47, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m r48, kv.s r49, kv.t r50, kv.u r51, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j r52, p0.w r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.x.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l, e1.v, long, kv.u, kv.b, kv.b, kv.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m, kv.s, kv.t, kv.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j, p0.w, int, int, int):void");
    }

    public static /* synthetic */ kv.p a(long j10, kv.p pVar, kv.p pVar2, kv.p pVar3, kv.p pVar4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar, kv.p pVar5, kv.p pVar6, kv.p pVar7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = m0.f68918b.m4825getBlack0d7_KjU();
        }
        if ((i10 & 2) != 0) {
            pVar = h.f49861b;
        }
        if ((i10 & 4) != 0) {
            pVar2 = i.f49862b;
        }
        if ((i10 & 8) != 0) {
            pVar3 = j.f49863b;
        }
        if ((i10 & 16) != 0) {
            pVar4 = k.f49864b;
        }
        if ((i10 & 32) != 0) {
            mVar = null;
        }
        if ((i10 & 64) != 0) {
            pVar5 = l.f49865b;
        }
        if ((i10 & 128) != 0) {
            pVar6 = m.f49866b;
        }
        if ((i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            pVar7 = n.f49867b;
        }
        if ((i10 & 512) != 0) {
            jVar = a.h.f47463a.j();
        }
        kv.p pVar8 = pVar7;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar2 = jVar;
        kv.p pVar9 = pVar5;
        kv.p pVar10 = pVar6;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar2 = mVar;
        kv.p pVar11 = pVar3;
        kv.p pVar12 = pVar;
        return a(j10, pVar12, pVar2, pVar11, pVar4, mVar2, pVar9, pVar10, pVar8, jVar2);
    }

    public static final kv.p a(final long j10, final kv.p muteButton, final kv.p adCloseCountdownButton, final kv.p adSkipCountdownButton, final kv.p ctaButton, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar, final kv.p progressBar, final kv.p vastIcon, final kv.p playbackControl, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j viewVisibilityTracker) {
        kotlin.jvm.internal.e0.checkNotNullParameter(muteButton, "muteButton");
        kotlin.jvm.internal.e0.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        kotlin.jvm.internal.e0.checkNotNullParameter(adSkipCountdownButton, "adSkipCountdownButton");
        kotlin.jvm.internal.e0.checkNotNullParameter(ctaButton, "ctaButton");
        kotlin.jvm.internal.e0.checkNotNullParameter(progressBar, "progressBar");
        kotlin.jvm.internal.e0.checkNotNullParameter(vastIcon, "vastIcon");
        kotlin.jvm.internal.e0.checkNotNullParameter(playbackControl, "playbackControl");
        kotlin.jvm.internal.e0.checkNotNullParameter(viewVisibilityTracker, "viewVisibilityTracker");
        return new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.v
            @Override // kv.p
            public final Object invoke(Object obj, Object obj2) {
                return x.a(j10, muteButton, adCloseCountdownButton, adSkipCountdownButton, ctaButton, mVar, progressBar, vastIcon, playbackControl, viewVisibilityTracker, (Context) obj, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l) obj2);
            }
        };
    }

    public static final h2 a(long j10, kv.p pVar, kv.p pVar2, kv.p pVar3, kv.p pVar4, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.m mVar, kv.p pVar5, kv.p pVar6, kv.p pVar7, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.j jVar, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l adViewModel) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(adViewModel, "adViewModel");
        h2 h2Var = new h2(context, null, 0, 6, null);
        h2Var.setId(R.id.moloco_fullscreen_ad_view_id);
        h2Var.setContent(z0.u.composableLambdaInstance(876197241, true, new o(adViewModel, j10, pVar, pVar2, pVar3, pVar4, mVar, pVar5, pVar6, pVar7, jVar)));
        return h2Var;
    }

    public static final kv.u a(long j10, long j11, j1.f2 f2Var, long j12, e1.d dVar, i2 i2Var, long j13, m1.e eVar, m1.e eVar2, kv.a aVar, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(447650301);
        long jB = (i11 & 1) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.b() : j10;
        long j14 = (i11 & 2) != 0 ? jB : j11;
        j1.f2 f2VarF = (i11 & 4) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.f() : f2Var;
        long jE = (i11 & 8) != 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.e() : j12;
        e1.d topStart = (i11 & 16) != 0 ? e1.d.f53469a.getTopStart() : dVar;
        i2 i2VarM3870PaddingValues0680j_4 = (i11 & 32) != 0 ? f2.m3870PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a()) : i2Var;
        long jM5677getPrimary0d7_KjU = (i11 & 64) != 0 ? n0.i0.f75090a.getColors(wVar, 0).m5677getPrimary0d7_KjU() : j13;
        m1.e eVarPainterResource = (i11 & 128) != 0 ? d2.c.painterResource(R.drawable.ic_round_volume_off_24, wVar, 0) : eVar;
        m1.e eVarPainterResource2 = (i11 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? d2.c.painterResource(R.drawable.ic_round_volume_up_24, wVar, 0) : eVar2;
        kv.a aVar2 = (i11 & 512) != 0 ? null : aVar;
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(447650301, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultMuteButton (VastRenderer.kt:226)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, -545982054, true, new f(topStart, i2VarM3870PaddingValues0680j_4, eVarPainterResource, eVarPainterResource2, aVar2, jM5677getPrimary0d7_KjU, jB, j14, f2VarF, jE));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    public static final kv.u a(e1.d dVar, i2 i2Var, long j10, String str, String str2, kv.a aVar, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(-926425258);
        if ((i11 & 1) != 0) {
            dVar = e1.d.f53469a.getBottomEnd();
        }
        e1.d dVar2 = dVar;
        if ((i11 & 2) != 0) {
            i2Var = f2.m3870PaddingValues0680j_4(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.a.a());
        }
        i2 i2Var2 = i2Var;
        if ((i11 & 4) != 0) {
            j10 = n0.i0.f75090a.getColors(wVar, 0).m5677getPrimary0d7_KjU();
        }
        long j11 = j10;
        String strStringResource = (i11 & 8) != 0 ? d2.d.stringResource(R.string.com_moloco_sdk_xenoss_player_learn_more, wVar, 0) : str;
        String str3 = (i11 & 16) != 0 ? null : str2;
        kv.a aVar2 = (i11 & 32) != 0 ? null : aVar;
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-926425258, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultCTAButton (VastRenderer.kt:294)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, 432764356, true, new e(dVar2, i2Var2, str3, strStringResource, j11, aVar2));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    public static final kv.s a(e1.d dVar, i2 i2Var, long j10, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(716005120);
        if ((i11 & 1) != 0) {
            dVar = e1.d.f53469a.getBottomCenter();
        }
        if ((i11 & 2) != 0) {
            i2Var = f2.m3870PaddingValues0680j_4(s2.i.m6817constructorimpl(0));
        }
        if ((i11 & 4) != 0) {
            j10 = n0.i0.f75090a.getColors(wVar, 0).m5677getPrimary0d7_KjU();
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(716005120, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.defaultProgressBar (VastRenderer.kt:369)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, 1967084142, true, new g(dVar, i2Var, j10));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k a(v5 v5Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) v5Var.getValue();
    }
}

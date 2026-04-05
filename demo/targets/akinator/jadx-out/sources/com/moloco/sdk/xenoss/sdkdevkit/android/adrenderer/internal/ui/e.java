package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import androidx.core.app.NotificationCompat;
import com.digidust.elokence.akinator.freemium.R;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import d0.k0;
import e2.r0;
import e2.u0;
import g0.h3;
import j1.m0;
import kotlinx.coroutines.flow.StateFlow;
import p0.o4;
import p0.v5;
import p0.z4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class e {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements kv.r {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1.v f48569b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48570c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f48571e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1.v f48572b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f48573c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kv.l f48574e;

            public a(e1.v vVar, String str, kv.l lVar) {
                this.f48572b = vVar;
                this.f48573c = str;
                this.f48574e = lVar;
            }

            public final void a(e1.v trackableModifier, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(trackableModifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= wVar.changed(trackableModifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(592042825, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous>.<anonymous> (AdBadge.kt:136)");
                }
                e.a(this.f48572b.then(trackableModifier), this.f48573c, this.f48574e, wVar, 0, 0);
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }
        }

        public b(e1.v vVar, String str, kv.l lVar) {
            this.f48569b = vVar;
            this.f48570c = str;
            this.f48571e = lVar;
        }

        public final void a(g0.e0 e0Var, kv.l onButtonRendered, p0.w wVar, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if ((i10 & 48) == 0) {
                i10 |= wVar.changed(onButtonRendered) ? 32 : 16;
            }
            if ((i10 & 145) == 144 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-652534615, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge.<anonymous> (AdBadge.kt:132)");
            }
            i0.a(null, a.c.EnumC0490a.f50254k, onButtonRendered, z0.u.composableLambda(wVar, 592042825, true, new a(this.f48569b, this.f48570c, this.f48571e)), wVar, ((i10 << 3) & 896) | 3120, 1);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.r
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            a((g0.e0) obj, (kv.l) obj2, (p0.w) obj3, ((Number) obj4).intValue());
            return x0.f87415a;
        }
    }

    public static final x0 a(e1.v vVar, String str, kv.l lVar, int i10, int i11, p0.w wVar, int i12) {
        a(vVar, str, lVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final kv.s b(e1.v vVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, kv.l lVar, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(-1665380566);
        if ((i11 & 1) != 0) {
            vVar = e1.t.f53496b;
        }
        if ((i11 & 2) != 0) {
            str = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";
        }
        if ((i11 & 4) != 0) {
            e0Var = a.h.f47463a.f();
        }
        if ((i11 & 8) != 0) {
            wVar.startReplaceableGroup(-819746825);
            boolean zChanged = wVar.changed(e0Var) | wVar.changed(str);
            Object objRememberedValue = wVar.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b(e0Var, str, 0);
                wVar.updateRememberedValue(objRememberedValue);
            }
            lVar = (kv.l) objRememberedValue;
            wVar.endReplaceableGroup();
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-1665380566, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge (AdBadge.kt:80)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, 781429248, true, new a(vVar, str, lVar));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    public static final kv.r c(e1.v vVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, kv.l lVar, p0.w wVar, int i10, int i11) {
        wVar.startReplaceableGroup(-1806921710);
        if ((i11 & 1) != 0) {
            vVar = e1.t.f53496b;
        }
        if ((i11 & 2) != 0) {
            str = "https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html";
        }
        if ((i11 & 4) != 0) {
            e0Var = a.h.f47463a.f();
        }
        if ((i11 & 8) != 0) {
            wVar.startReplaceableGroup(-763782490);
            boolean zChanged = wVar.changed(e0Var) | wVar.changed(str);
            Object objRememberedValue = wVar.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.b(e0Var, str, 1);
                wVar.updateRememberedValue(objRememberedValue);
            }
            lVar = (kv.l) objRememberedValue;
            wVar.endReplaceableGroup();
        }
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventStart(-1806921710, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultWebViewAdBadge (AdBadge.kt:131)");
        }
        z0.b bVarComposableLambda = z0.u.composableLambda(wVar, -652534615, true, new b(vVar, str, lVar));
        if (p0.d0.isTraceInProgress()) {
            p0.d0.traceEventEnd();
        }
        wVar.endReplaceableGroup();
        return bVarComposableLambda;
    }

    public static final x0 a(int i10, p0.w wVar, int i11) {
        a(wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final x0 a(e1.v vVar, String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, kv.l lVar, int i10, int i11, p0.w wVar, int i12) {
        a(vVar, str, e0Var, lVar, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final void a(e1.v vVar, String clickUrl, kv.l onClick, p0.w wVar, int i10, int i11) {
        e1.v vVar2;
        int i12;
        e1.v vVar3;
        kotlin.jvm.internal.e0.checkNotNullParameter(clickUrl, "clickUrl");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClick, "onClick");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(1037954372);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            vVar2 = vVar;
        } else if ((i10 & 6) == 0) {
            vVar2 = vVar;
            i12 = (wVarStartRestartGroup.changed(vVar2) ? 4 : 2) | i10;
        } else {
            vVar2 = vVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(clickUrl) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= wVarStartRestartGroup.changed(onClick) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i12 & 147) == 146 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            vVar3 = vVar2;
        } else {
            vVar3 = i13 != 0 ? e1.t.f53496b : vVar2;
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(1037954372, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadge (AdBadge.kt:43)");
            }
            wVarStartRestartGroup.startReplaceableGroup(-363689698);
            boolean zChanged = wVarStartRestartGroup.changed("Ad Badge");
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            p0.v vVar4 = p0.v.f80515a;
            if (zChanged || objRememberedValue == vVar4.getEmpty()) {
                objRememberedValue = new a1.o(16);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            e1.v vVarM3897requiredSize3ABfNKs = h3.m3897requiredSize3ABfNKs(e2.v.semantics$default(vVar3, false, (kv.l) objRememberedValue, 1, null), s2.i.m6817constructorimpl(12));
            wVarStartRestartGroup.startReplaceableGroup(-363682862);
            boolean zChanged2 = wVarStartRestartGroup.changed(onClick) | wVarStartRestartGroup.changed(clickUrl);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == vVar4.getEmpty()) {
                objRememberedValue2 = new androidx.lifecycle.x0(6, onClick, clickUrl);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            n0.f0.m5655Iconww6aTOc(d2.c.painterResource(R.drawable.info_badge, wVarStartRestartGroup, 0), "Ad Badge", k0.m3708clickableXHw0xAI$default(vVarM3897requiredSize3ABfNKs, false, null, null, (kv.a) objRememberedValue2, 7, null), m0.f68918b.m4835getUnspecified0d7_KjU(), wVarStartRestartGroup, 3120, 0);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new d(vVar3, clickUrl, onClick, i10, i11));
        }
    }

    public static final x0 b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, String str, String it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        e0Var.a(str);
        return x0.f87415a;
    }

    public static final x0 c(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, String str, String it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        e0Var.a(str);
        return x0.f87415a;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.s {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e1.v f48560b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f48561c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ kv.l f48562e;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e$a$a, reason: collision with other inner class name */
        public static final class C0441a implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1.v f48563b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f48564c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kv.l f48565e;

            public C0441a(e1.v vVar, String str, kv.l lVar) {
                this.f48563b = vVar;
                this.f48564c = str;
                this.f48565e = lVar;
            }

            public final void a(e1.v trackableModifier, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(trackableModifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= wVar.changed(trackableModifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(1901554514, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous>.<anonymous>.<anonymous> (AdBadge.kt:89)");
                }
                e.a(this.f48563b.then(trackableModifier), this.f48564c, this.f48565e, wVar, 0, 0);
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class b implements kv.q {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e1.v f48566b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f48567c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kv.l f48568e;

            public b(e1.v vVar, String str, kv.l lVar) {
                this.f48566b = vVar;
                this.f48567c = str;
                this.f48568e = lVar;
            }

            public final void a(e1.v trackableModifier, p0.w wVar, int i10) {
                kotlin.jvm.internal.e0.checkNotNullParameter(trackableModifier, "trackableModifier");
                if ((i10 & 6) == 0) {
                    i10 |= wVar.changed(trackableModifier) ? 4 : 2;
                }
                if ((i10 & 19) == 18 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventStart(1149096507, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous>.<anonymous>.<anonymous> (AdBadge.kt:101)");
                }
                e.a(this.f48566b.then(trackableModifier), this.f48567c, this.f48568e, wVar, 0, 0);
                if (p0.d0.isTraceInProgress()) {
                    p0.d0.traceEventEnd();
                }
            }

            @Override // kv.q
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                a((e1.v) obj, (p0.w) obj2, ((Number) obj3).intValue());
                return x0.f87415a;
            }
        }

        public a(e1.v vVar, String str, kv.l lVar) {
            this.f48560b = vVar;
            this.f48561c = str;
            this.f48562e = lVar;
        }

        public final void a(g0.e0 e0Var, kv.l onButtonRendered, StateFlow<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k> stateFlow, p0.w wVar, int i10) {
            kotlin.jvm.internal.e0.checkNotNullParameter(e0Var, "<this>");
            kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(781429248, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.defaultVastAdBadge.<anonymous> (AdBadge.kt:81)");
            }
            if (stateFlow != null) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVarA = a(z4.collectAsState(stateFlow, null, wVar, 0, 1));
                boolean z10 = kVarA instanceof k.c;
                e1.v vVar = this.f48560b;
                String str = this.f48561c;
                kv.l lVar = this.f48562e;
                if (z10) {
                    wVar.startReplaceableGroup(-784877573);
                    i0.a(null, a.c.EnumC0490a.f50254k, onButtonRendered, z0.u.composableLambda(wVar, 1901554514, true, new C0441a(vVar, str, lVar)), wVar, ((i10 << 3) & 896) | 3120, 1);
                    wVar.endReplaceableGroup();
                } else if (kVarA instanceof k.a) {
                    wVar.startReplaceableGroup(-784430181);
                    i0.a(null, a.c.EnumC0490a.f50254k, onButtonRendered, z0.u.composableLambda(wVar, 1149096507, true, new b(vVar, str, lVar)), wVar, ((i10 << 3) & 896) | 3120, 1);
                    wVar.endReplaceableGroup();
                } else if (kVarA instanceof k.b) {
                    wVar.startReplaceableGroup(-784000800);
                    wVar.endReplaceableGroup();
                } else if (kVarA instanceof k.d) {
                    wVar.startReplaceableGroup(-783943264);
                    wVar.endReplaceableGroup();
                } else {
                    if (kVarA != null) {
                        wVar.startReplaceableGroup(-1687888084);
                        wVar.endReplaceableGroup();
                        throw new tu.t();
                    }
                    wVar.startReplaceableGroup(-783908544);
                    wVar.endReplaceableGroup();
                }
            }
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }

        @Override // kv.s
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            a((g0.e0) obj, (kv.l) obj2, (StateFlow) obj3, (p0.w) obj4, ((Number) obj5).intValue());
            return x0.f87415a;
        }

        public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k a(v5 v5Var) {
            return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) v5Var.getValue();
        }
    }

    public static final x0 a(String str, u0 semantics) {
        kotlin.jvm.internal.e0.checkNotNullParameter(semantics, "$this$semantics");
        r0.setContentDescription(semantics, str);
        r0.setTestTag(semantics, str);
        return x0.f87415a;
    }

    public static final x0 a(kv.l lVar, String str) {
        lVar.invoke(str);
        return x0.f87415a;
    }

    public static final x0 a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, String str, String it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        e0Var.a(str);
        return x0.f87415a;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(e1.v r12, java.lang.String r13, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 r14, kv.l r15, p0.w r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e.a(e1.v, java.lang.String, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0, kv.l, p0.w, int, int):void");
    }

    public static final void a(p0.w wVar, int i10) {
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-1309369895);
        if (i10 == 0 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-1309369895, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.AdBadgePreview (AdBadge.kt:165)");
            }
            n0.m0.MaterialTheme(null, null, null, s.f48741a.a(), wVarStartRestartGroup, 3072, 7);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a(i10, 0));
        }
    }
}

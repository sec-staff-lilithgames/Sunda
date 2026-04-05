package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import a2.a3;
import a2.g5;
import a2.h2;
import a2.t4;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import b0.q0;
import com.applovin.shadow.okio.Segment;
import com.digidust.elokence.akinator.freemium.R;
import com.ironsource.Y2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k;
import e1.t;
import g0.f0;
import g0.h3;
import j1.m0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import p0.a6;
import p0.d0;
import p0.j2;
import p0.k1;
import p0.o4;
import p0.o5;
import p0.v;
import p0.v5;
import p0.w;
import p0.z4;
import s2.x;
import tu.x0;
import x1.g0;
import z0.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final float f50177a = s2.i.m6817constructorimpl(12);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public static final b f50185b = new b();

        public final kv.b a(w wVar, int i10) {
            wVar.startReplaceableGroup(-1994751775);
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-1994751775, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous> (AdWebViewRenderer.kt:141)");
            }
            kv.b bVarA = a0.a(null, null, 0L, 0L, 0L, null, null, null, wVar, 0, 255);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            wVar.endReplaceableGroup();
            return bVarA;
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((w) obj, ((Number) obj2).intValue());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements kv.p {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow f50186b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WebView f50187c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f50188e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.l f50189f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kv.a f50190g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f50191h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ kv.p f50192i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ e0 f50193j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ s2.i f50194k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f50195l;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements kv.p {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MutableStateFlow f50196b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ WebView f50197c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ int f50198e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ kv.l f50199f;

            /* renamed from: g, reason: collision with root package name */
            public final /* synthetic */ kv.a f50200g;

            /* renamed from: h, reason: collision with root package name */
            public final /* synthetic */ long f50201h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ kv.p f50202i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ e0 f50203j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ s2.i f50204k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ boolean f50205l;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i$c$a$a, reason: collision with other inner class name */
            public static final class C0487a extends bv.n implements kv.p {

                /* renamed from: i, reason: collision with root package name */
                public int f50206i;

                /* renamed from: j, reason: collision with root package name */
                public final /* synthetic */ j2 f50207j;

                /* renamed from: k, reason: collision with root package name */
                public final /* synthetic */ MutableStateFlow f50208k;

                /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
                /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i$c$a$a$a, reason: collision with other inner class name */
                public static final class C0488a implements FlowCollector {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MutableStateFlow f50209b;

                    public C0488a(MutableStateFlow<Boolean> mutableStateFlow) {
                        this.f50209b = mutableStateFlow;
                    }

                    public final Object a(boolean z10, zu.d<? super x0> dVar) {
                        this.f50209b.setValue(bv.b.boxBoolean(z10));
                        return x0.f87415a;
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj, zu.d dVar) {
                        return a(((Boolean) obj).booleanValue(), dVar);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0487a(j2 j2Var, MutableStateFlow<Boolean> mutableStateFlow, zu.d<? super C0487a> dVar) {
                    super(2, dVar);
                    this.f50207j = j2Var;
                    this.f50208k = mutableStateFlow;
                }

                @Override // kv.p
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
                    return ((C0487a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
                }

                @Override // bv.a
                public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
                    return new C0487a(this.f50207j, this.f50208k, dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
                    int i10 = this.f50206i;
                    if (i10 == 0) {
                        tu.a0.throwOnFailure(obj);
                        Flow flowSnapshotFlow = z4.snapshotFlow(new g(this.f50207j, 1));
                        C0488a c0488a = new C0488a(this.f50208k);
                        this.f50206i = 1;
                        if (flowSnapshotFlow.collect(c0488a, this) == coroutine_suspended) {
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

                public static final boolean a(j2 j2Var) {
                    return ((Boolean) j2Var.getValue()).booleanValue();
                }
            }

            public a(MutableStateFlow<Boolean> mutableStateFlow, WebView webView, int i10, kv.l lVar, kv.a aVar, long j10, kv.p pVar, e0 e0Var, s2.i iVar, boolean z10) {
                this.f50196b = mutableStateFlow;
                this.f50197c = webView;
                this.f50198e = i10;
                this.f50199f = lVar;
                this.f50200g = aVar;
                this.f50201h = j10;
                this.f50202i = pVar;
                this.f50203j = e0Var;
                this.f50204k = iVar;
                this.f50205l = z10;
            }

            public final void a(w wVar, int i10) {
                if ((i10 & 3) == 2 && wVar.getSkipping()) {
                    wVar.skipToGroupEnd();
                    return;
                }
                if (d0.isTraceInProgress()) {
                    d0.traceEventStart(-126697744, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:148)");
                }
                wVar.startReplaceableGroup(1335678415);
                Object objRememberedValue = wVar.rememberedValue();
                v vVar = v.f80515a;
                Object empty = vVar.getEmpty();
                MutableStateFlow mutableStateFlow = this.f50196b;
                if (objRememberedValue == empty) {
                    objRememberedValue = o5.mutableStateOf$default(mutableStateFlow.getValue(), null, 2, null);
                    wVar.updateRememberedValue(objRememberedValue);
                }
                j2 j2Var = (j2) objRememberedValue;
                wVar.endReplaceableGroup();
                wVar.startReplaceableGroup(1335682252);
                boolean zChanged = wVar.changed(j2Var) | wVar.changed(mutableStateFlow);
                Object objRememberedValue2 = wVar.rememberedValue();
                if (zChanged || objRememberedValue2 == vVar.getEmpty()) {
                    objRememberedValue2 = new C0487a(j2Var, mutableStateFlow, null);
                    wVar.updateRememberedValue(objRememberedValue2);
                }
                wVar.endReplaceableGroup();
                k1.LaunchedEffect(x0.f87415a, (kv.p) objRememberedValue2, wVar, 6);
                i.a(this.f50197c, this.f50198e, j2Var, this.f50199f, this.f50200g, null, this.f50201h, (kv.b) this.f50202i.invoke(wVar, 0), this.f50203j, this.f50204k.m6831unboximpl(), this.f50205l, wVar, 384, 0, 32);
                if (d0.isTraceInProgress()) {
                    d0.traceEventEnd();
                }
            }

            @Override // kv.p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((w) obj, ((Number) obj2).intValue());
                return x0.f87415a;
            }
        }

        public c(MutableStateFlow<Boolean> mutableStateFlow, WebView webView, int i10, kv.l lVar, kv.a aVar, long j10, kv.p pVar, e0 e0Var, s2.i iVar, boolean z10) {
            this.f50186b = mutableStateFlow;
            this.f50187c = webView;
            this.f50188e = i10;
            this.f50189f = lVar;
            this.f50190g = aVar;
            this.f50191h = j10;
            this.f50192i = pVar;
            this.f50193j = e0Var;
            this.f50194k = iVar;
            this.f50195l = z10;
        }

        public final void a(w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-1932677773, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.defaultAdWebViewRenderer.<anonymous>.<anonymous>.<anonymous> (AdWebViewRenderer.kt:147)");
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.theme.d.a(false, u.composableLambda(wVar, -126697744, true, new a(this.f50186b, this.f50187c, this.f50188e, this.f50189f, this.f50190g, this.f50191h, this.f50192i, this.f50193j, this.f50194k, this.f50195l)), wVar, 48, 1);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }

        @Override // kv.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((w) obj, ((Number) obj2).intValue());
            return x0.f87415a;
        }
    }

    public static final x0 a(WebView webView, int i10, j2 j2Var, kv.l lVar, kv.a aVar, e1.v vVar, long j10, kv.b bVar, e0 e0Var, float f10, boolean z10, int i11, int i12, int i13, w wVar, int i14) {
        a(webView, i10, j2Var, lVar, aVar, vVar, j10, bVar, e0Var, f10, z10, wVar, i11 | 1, i12, i13);
        return x0.f87415a;
    }

    public static final void c(MutableStateFlow<Boolean> mutableStateFlow, kv.a aVar) {
        if (mutableStateFlow.getValue().booleanValue()) {
            aVar.invoke();
        }
    }

    public static final x0 d(MutableStateFlow mutableStateFlow, kv.a aVar) {
        c(mutableStateFlow, aVar);
        return x0.f87415a;
    }

    public static final x0 e(MutableStateFlow mutableStateFlow, kv.a aVar) {
        c(mutableStateFlow, aVar);
        return x0.f87415a;
    }

    public static final x0 a(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l lVar, WebView webView, int i10, kv.l lVar2, kv.a aVar, kv.w wVar, e0 e0Var, kv.b bVar, kv.b bVar2, int i11, w wVar2, int i12) {
        a(activity, lVar, webView, i10, lVar2, aVar, wVar, e0Var, bVar, bVar2, wVar2, i11 | 1);
        return x0.f87415a;
    }

    public static final x0 b(MutableStateFlow mutableStateFlow, kv.a aVar) {
        a((MutableStateFlow<Boolean>) mutableStateFlow, aVar);
        return x0.f87415a;
    }

    public static final x0 a(Activity activity, WebView webView, int i10, kv.l lVar, kv.a aVar, kv.w wVar, e0 e0Var, int i11, w wVar2, int i12) {
        a(activity, webView, i10, lVar, aVar, wVar, e0Var, wVar2, i11 | 1);
        return x0.f87415a;
    }

    public static final float a() {
        return f50177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final android.webkit.WebView r32, final int r33, final p0.j2 r34, kv.l r35, final kv.a r36, e1.v r37, long r38, kv.b r40, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 r41, final float r42, final boolean r43, p0.w r44, final int r45, final int r46, final int r47) {
        /*
            Method dump skipped, instructions count: 889
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.i.a(android.webkit.WebView, int, p0.j2, kv.l, kv.a, e1.v, long, kv.b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0, float, boolean, p0.w, int, int, int):void");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.q {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.w f50178b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ WebView f50179c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f50180e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ MutableStateFlow f50181f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kv.l f50182g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ kv.a f50183h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ e0 f50184i;

        public a(kv.w wVar, WebView webView, int i10, MutableStateFlow<Boolean> mutableStateFlow, kv.l lVar, kv.a aVar, e0 e0Var) {
            this.f50178b = wVar;
            this.f50179c = webView;
            this.f50180e = i10;
            this.f50181f = mutableStateFlow;
            this.f50182g = lVar;
            this.f50183h = aVar;
            this.f50184i = e0Var;
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVar, w wVar, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (wVar.changed(kVar) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(1684775380, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen.<anonymous>.<anonymous> (AdWebViewRenderer.kt:218)");
            }
            if (kVar instanceof k.a) {
                wVar.startReplaceableGroup(1825931895);
                wVar.endReplaceableGroup();
            } else if (kVar instanceof k.c) {
                wVar.startReplaceableGroup(1825994391);
                wVar.endReplaceableGroup();
            } else if (kVar instanceof k.b) {
                wVar.startReplaceableGroup(-1880756851);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.h.a(((k.b) kVar).d(), null, null, h3.fillMaxSize$default(t.f53496b, 0.0f, 1, null), wVar, Y2.b.f35735f, 0);
                wVar.endReplaceableGroup();
            } else if (kVar instanceof k.d) {
                wVar.startReplaceableGroup(-1880747644);
                wVar.startReplaceableGroup(-1880746209);
                boolean zChanged = wVar.changed(this.f50178b) | wVar.changed(this.f50179c) | wVar.changed(this.f50180e) | wVar.changed(this.f50181f) | wVar.changed(this.f50182g) | wVar.changed(this.f50183h) | wVar.changed(this.f50184i);
                Object objRememberedValue = wVar.rememberedValue();
                if (zChanged || objRememberedValue == v.f80515a.getEmpty()) {
                    d dVar = new d(this.f50178b, this.f50179c, this.f50180e, this.f50181f, this.f50182g, this.f50184i, this.f50183h, 1);
                    wVar.updateRememberedValue(dVar);
                    objRememberedValue = dVar;
                }
                wVar.endReplaceableGroup();
                u2.q.AndroidView((kv.l) objRememberedValue, null, null, wVar, 0, 6);
                wVar.endReplaceableGroup();
            } else {
                if (kVar != null) {
                    wVar.startReplaceableGroup(-1880762669);
                    wVar.endReplaceableGroup();
                    throw new tu.t();
                }
                wVar.startReplaceableGroup(1826950307);
                wVar.endReplaceableGroup();
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }

        @Override // kv.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) obj, (w) obj2, ((Number) obj3).intValue());
            return x0.f87415a;
        }

        public static final View a(kv.w wVar, WebView webView, int i10, MutableStateFlow mutableStateFlow, kv.l lVar, e0 e0Var, kv.a aVar, Context it) {
            kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
            return (View) wVar.invoke(it, webView, Integer.valueOf(i10), mutableStateFlow, lVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c(mutableStateFlow, aVar, 3), e0Var, s2.i.m6815boximpl(i.a()), Boolean.TRUE);
        }

        public static final x0 a(MutableStateFlow mutableStateFlow, kv.a aVar) {
            i.a((MutableStateFlow<Boolean>) mutableStateFlow, aVar);
            return x0.f87415a;
        }
    }

    public static final x0 a(j2 j2Var) {
        j2Var.setValue(Boolean.TRUE);
        return x0.f87415a;
    }

    public static /* synthetic */ kv.w a(long j10, kv.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = m0.f68918b.m4825getBlack0d7_KjU();
        }
        if ((i10 & 2) != 0) {
            pVar = b.f50185b;
        }
        return a(j10, pVar);
    }

    public static final kv.w a(final long j10, final kv.p adCloseCountdownButton) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adCloseCountdownButton, "adCloseCountdownButton");
        return new kv.w() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f
            @Override // kv.w
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                boolean zBooleanValue = ((Boolean) obj9).booleanValue();
                return i.a(j10, adCloseCountdownButton, (Context) obj, (WebView) obj2, ((Integer) obj3).intValue(), (MutableStateFlow) obj4, (kv.l) obj5, (kv.a) obj6, (e0) obj7, (s2.i) obj8, zBooleanValue);
            }
        };
    }

    public static final h2 a(long j10, kv.p pVar, Context context, WebView webView, int i10, MutableStateFlow canClose, kv.l onButtonRendered, kv.a onClose, e0 e0Var, s2.i iVar, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(webView, "webView");
        kotlin.jvm.internal.e0.checkNotNullParameter(canClose, "canClose");
        kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClose, "onClose");
        h2 h2Var = new h2(context, null, 0, 6, null);
        h2Var.setId(R.id.moloco_fullscreen_ad_view_id);
        h2Var.setContent(u.composableLambdaInstance(-1932677773, true, new c(canClose, webView, i10, onButtonRendered, onClose, j10, pVar, e0Var, iVar, z10)));
        return h2Var;
    }

    public static final void a(Activity activity, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.l adViewModel, WebView webView, int i10, kv.l onButtonRendered, kv.a onClose, kv.w adWebViewRenderer, e0 e0Var, kv.b bVar, kv.b bVar2, w wVar, int i11) {
        int i12;
        kv.a aVar;
        w wVar2;
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(adViewModel, "adViewModel");
        kotlin.jvm.internal.e0.checkNotNullParameter(webView, "webView");
        kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClose, "onClose");
        kotlin.jvm.internal.e0.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        w wVarStartRestartGroup = wVar.startRestartGroup(-476084514);
        if ((i11 & 6) == 0) {
            i12 = (wVarStartRestartGroup.changed(activity) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(adViewModel) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= wVarStartRestartGroup.changed(webView) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= wVarStartRestartGroup.changed(i10) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= wVarStartRestartGroup.changed(onButtonRendered) ? 16384 : Segment.SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= wVarStartRestartGroup.changed(onClose) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i11) == 0) {
            i12 |= wVarStartRestartGroup.changed(adWebViewRenderer) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= wVarStartRestartGroup.changed(e0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i11) == 0) {
            i12 |= wVarStartRestartGroup.changed(bVar) ? 67108864 : 33554432;
        }
        if ((805306368 & i11) == 0) {
            i12 |= wVarStartRestartGroup.changed(bVar2) ? 536870912 : 268435456;
        }
        int i13 = i12;
        if ((306783379 & i13) == 306783378 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            aVar = onClose;
            wVar2 = wVarStartRestartGroup;
        } else {
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-476084514, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.MraidAdContainerScreen (AdWebViewRenderer.kt:200)");
            }
            e1.v vVarTestTag = t4.testTag(d0.k.m3704backgroundbw27NRU$default(h3.fillMaxSize$default(t.f53496b, 0.0f, 1, null), m0.f68918b.m4825getBlack0d7_KjU(), null, 2, null), "MraidAdContainerScreen");
            wVarStartRestartGroup.startReplaceableGroup(733328855);
            x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(e1.d.f53469a.getTopStart(), false, wVarStartRestartGroup, 0);
            wVarStartRestartGroup.startReplaceableGroup(-1323940314);
            s2.e eVar = (s2.e) wVarStartRestartGroup.consume(a3.getLocalDensity());
            x xVar = (x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = g0.materializerOf(vVarTestTag);
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
            w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarRememberBoxMeasurePolicy, wVarM5780constructorimpl, eVar));
            a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVarStartRestartGroup, wVarStartRestartGroup), wVarStartRestartGroup, 2058660585);
            wVarStartRestartGroup.startReplaceableGroup(-2137368960);
            wVarStartRestartGroup.startReplaceableGroup(1204536538);
            boolean zChanged = wVarStartRestartGroup.changed(i10);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            v vVar = v.f80515a;
            if (zChanged || objRememberedValue == vVar.getEmpty()) {
                objRememberedValue = StateFlowKt.MutableStateFlow(Boolean.valueOf(i10 == 0));
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableStateFlow mutableStateFlow = (MutableStateFlow) objRememberedValue;
            wVarStartRestartGroup.endReplaceableGroup();
            v5 v5VarCollectAsState = z4.collectAsState(adViewModel.k(), null, wVarStartRestartGroup, 0, 1);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k kVarA = a(v5VarCollectAsState);
            aVar = onClose;
            z0.b bVarComposableLambda = u.composableLambda(wVarStartRestartGroup, 1684775380, true, new a(adWebViewRenderer, webView, i10, mutableStateFlow, onButtonRendered, onClose, e0Var));
            wVar2 = wVarStartRestartGroup;
            q0.Crossfade(kVarA, null, null, bVarComposableLambda, wVar2, 3072, 6);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.m.a(f0.f56407a, adViewModel, a(v5VarCollectAsState), bVar2, bVar, wVar2, (i13 & 112) | 6 | ((i13 >> 18) & 7168) | ((i13 >> 12) & 57344));
            wVar2.startReplaceableGroup(1204592495);
            boolean zChanged2 = wVar2.changed(mutableStateFlow) | wVar2.changed(aVar);
            Object objRememberedValue2 = wVar2.rememberedValue();
            if (zChanged2 || objRememberedValue2 == vVar.getEmpty()) {
                objRememberedValue2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c(mutableStateFlow, aVar, 1);
                wVar2.updateRememberedValue(objRememberedValue2);
            }
            wVar2.endReplaceableGroup();
            g.c.BackHandler(false, (kv.a) objRememberedValue2, wVar2, 0, 1);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e0.a(activity, wVar2, i13 & 14);
            wVar2.endReplaceableGroup();
            wVar2.endReplaceableGroup();
            wVar2.endNode();
            wVar2.endReplaceableGroup();
            wVar2.endReplaceableGroup();
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVar2.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.k(activity, adViewModel, webView, i10, onButtonRendered, aVar, adWebViewRenderer, e0Var, bVar, bVar2, i11));
        }
    }

    public static final void a(MutableStateFlow<Boolean> mutableStateFlow, kv.a aVar) {
        if (mutableStateFlow.getValue().booleanValue()) {
            aVar.invoke();
        }
    }

    public static final void a(final Activity activity, final WebView webView, final int i10, final kv.l onButtonRendered, final kv.a onClose, final kv.w adWebViewRenderer, final e0 e0Var, w wVar, final int i11) {
        int i12;
        kv.a aVar;
        w wVar2;
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(webView, "webView");
        kotlin.jvm.internal.e0.checkNotNullParameter(onButtonRendered, "onButtonRendered");
        kotlin.jvm.internal.e0.checkNotNullParameter(onClose, "onClose");
        kotlin.jvm.internal.e0.checkNotNullParameter(adWebViewRenderer, "adWebViewRenderer");
        w wVarStartRestartGroup = wVar.startRestartGroup(-1336318846);
        if ((i11 & 6) == 0) {
            i12 = (wVarStartRestartGroup.changed(activity) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(webView) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= wVarStartRestartGroup.changed(i10) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= wVarStartRestartGroup.changed(onButtonRendered) ? 2048 : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= wVarStartRestartGroup.changed(onClose) ? 16384 : Segment.SIZE;
        }
        if ((196608 & i11) == 0) {
            i12 |= wVarStartRestartGroup.changed(adWebViewRenderer) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i11) == 0) {
            i12 |= wVarStartRestartGroup.changed(e0Var) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        int i13 = i12;
        if ((599187 & i13) == 599186 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            wVar2 = wVarStartRestartGroup;
        } else {
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-1336318846, i13, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.StaticAdWebViewScreen (AdWebViewRenderer.kt:270)");
            }
            e1.v vVarM3704backgroundbw27NRU$default = d0.k.m3704backgroundbw27NRU$default(h3.fillMaxSize$default(t.f53496b, 0.0f, 1, null), m0.f68918b.m4825getBlack0d7_KjU(), null, 2, null);
            wVarStartRestartGroup.startReplaceableGroup(733328855);
            x1.x0 x0VarRememberBoxMeasurePolicy = g0.d0.rememberBoxMeasurePolicy(e1.d.f53469a.getTopStart(), false, wVarStartRestartGroup, 0);
            wVarStartRestartGroup.startReplaceableGroup(-1323940314);
            s2.e eVar = (s2.e) wVarStartRestartGroup.consume(a3.getLocalDensity());
            x xVar = (x) wVarStartRestartGroup.consume(a3.getLocalLayoutDirection());
            g5 g5Var = (g5) wVarStartRestartGroup.consume(a3.getLocalViewConfiguration());
            z1.f fVar = z1.g.Z8;
            kv.a constructor = fVar.getConstructor();
            kv.q qVarMaterializerOf = g0.materializerOf(vVarM3704backgroundbw27NRU$default);
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
            w wVarM5780constructorimpl = a6.m5780constructorimpl(wVarStartRestartGroup);
            a6.m5787setimpl(wVarM5780constructorimpl, xVar, a.b.v(fVar, wVarM5780constructorimpl, x0VarRememberBoxMeasurePolicy, wVarM5780constructorimpl, eVar));
            a.b.y(0, qVarMaterializerOf, a.b.w(fVar, wVarM5780constructorimpl, g5Var, wVarStartRestartGroup, wVarStartRestartGroup), wVarStartRestartGroup, 2058660585);
            wVarStartRestartGroup.startReplaceableGroup(-2137368960);
            wVarStartRestartGroup.startReplaceableGroup(1609892771);
            boolean zChanged = wVarStartRestartGroup.changed(i10);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            v vVar = v.f80515a;
            if (zChanged || objRememberedValue == vVar.getEmpty()) {
                objRememberedValue = StateFlowKt.MutableStateFlow(Boolean.valueOf(i10 == 0));
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            MutableStateFlow mutableStateFlow = (MutableStateFlow) objRememberedValue;
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.startReplaceableGroup(1609900314);
            boolean zChanged2 = wVarStartRestartGroup.changed(adWebViewRenderer) | wVarStartRestartGroup.changed(webView) | wVarStartRestartGroup.changed(i10) | wVarStartRestartGroup.changed(mutableStateFlow) | wVarStartRestartGroup.changed(onButtonRendered) | wVarStartRestartGroup.changed(onClose) | wVarStartRestartGroup.changed(e0Var);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == vVar.getEmpty()) {
                d dVar = new d(adWebViewRenderer, webView, i10, mutableStateFlow, onButtonRendered, e0Var, onClose, 0);
                mutableStateFlow = mutableStateFlow;
                aVar = onClose;
                wVarStartRestartGroup.updateRememberedValue(dVar);
                objRememberedValue2 = dVar;
            } else {
                aVar = onClose;
            }
            wVarStartRestartGroup.endReplaceableGroup();
            wVar2 = wVarStartRestartGroup;
            u2.q.AndroidView((kv.l) objRememberedValue2, null, null, wVar2, 0, 6);
            wVar2.startReplaceableGroup(1609912856);
            boolean zChanged3 = wVar2.changed(mutableStateFlow) | wVar2.changed(aVar);
            Object objRememberedValue3 = wVar2.rememberedValue();
            if (zChanged3 || objRememberedValue3 == vVar.getEmpty()) {
                objRememberedValue3 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c(mutableStateFlow, aVar, 2);
                wVar2.updateRememberedValue(objRememberedValue3);
            }
            wVar2.endReplaceableGroup();
            g.c.BackHandler(false, (kv.a) objRememberedValue3, wVar2, 0, 1);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.e0.a(activity, wVar2, i13 & 14);
            wVar2.endReplaceableGroup();
            wVar2.endReplaceableGroup();
            wVar2.endNode();
            wVar2.endReplaceableGroup();
            wVar2.endReplaceableGroup();
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVar2.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new kv.p() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.e
                @Override // kv.p
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return i.a(activity, webView, i10, onButtonRendered, onClose, adWebViewRenderer, e0Var, i11, (w) obj, iIntValue);
                }
            });
        }
    }

    public static final View a(kv.w wVar, WebView webView, int i10, MutableStateFlow mutableStateFlow, kv.l lVar, e0 e0Var, kv.a aVar, Context it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        return (View) wVar.invoke(it, webView, Integer.valueOf(i10), mutableStateFlow, lVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.c(mutableStateFlow, aVar, 0), e0Var, s2.i.m6815boximpl(f50177a), Boolean.FALSE);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k a(v5 v5Var) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.k) v5Var.getValue();
    }
}

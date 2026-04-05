package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0;
import e1.t;
import e1.v;
import p0.d0;
import p0.g1;
import p0.h1;
import p0.k1;
import p0.o4;
import p0.w;
import tu.x0;
import z0.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class b {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements kv.p {
        public a(x0 x0Var) {
        }

        public final void a(w wVar, int i10) {
            if ((i10 & 3) == 2 && wVar.getSkipping()) {
                wVar.skipToGroupEnd();
                return;
            }
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(1018657295, i10, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebView.<anonymous>.<anonymous> (AdWebView.kt:40)");
            }
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

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.b$b, reason: collision with other inner class name */
    public static final class C0486b implements g1 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WebView f50139a;

        public C0486b(WebView webView) {
            this.f50139a = webView;
        }

        @Override // p0.g1
        public void dispose() {
            WebView webView = this.f50139a;
            ViewParent parent = webView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(webView);
            }
        }
    }

    public static final x0 a(WebView webView, v vVar, e0 e0Var, int i10, int i11, w wVar, int i12) {
        a(webView, vVar, e0Var, wVar, i10 | 1, i11);
        return x0.f87415a;
    }

    public static final void a(final WebView webView, v vVar, e0 e0Var, w wVar, int i10, int i11) {
        int i12;
        v vVar2;
        kotlin.jvm.internal.e0.checkNotNullParameter(webView, "webView");
        w wVarStartRestartGroup = wVar.startRestartGroup(-1111633024);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (wVarStartRestartGroup.changed(webView) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= wVarStartRestartGroup.changed(vVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= wVarStartRestartGroup.changed(e0Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i12 & 147) == 146 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
            vVar2 = vVar;
        } else {
            if (i13 != 0) {
                vVar = t.f53496b;
            }
            v vVar3 = vVar;
            if (d0.isTraceInProgress()) {
                d0.traceEventStart(-1111633024, i12, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.AdWebView (AdWebView.kt:13)");
            }
            wVarStartRestartGroup.startReplaceableGroup(1539490980);
            wVarStartRestartGroup.startReplaceableGroup(1539458953);
            boolean zChanged = wVarStartRestartGroup.changed(webView);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            p0.v vVar4 = p0.v.f80515a;
            if (zChanged || objRememberedValue == vVar4.getEmpty()) {
                final int i14 = 0;
                objRememberedValue = new kv.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a
                    @Override // kv.l
                    public final Object invoke(Object obj) {
                        switch (i14) {
                            case 0:
                                return b.a(webView, (Context) obj);
                            default:
                                return b.a(webView, (h1) obj);
                        }
                    }
                };
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            u2.q.AndroidView((kv.l) objRememberedValue, vVar3, null, wVarStartRestartGroup, i12 & 112, 4);
            wVarStartRestartGroup.startReplaceableGroup(1539491745);
            if (e0Var != null) {
                e0Var.a(u.composableLambda(wVarStartRestartGroup, 1018657295, true, new a(x0.f87415a)), wVarStartRestartGroup, ((i12 >> 3) & 112) | 6);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.endReplaceableGroup();
            wVarStartRestartGroup.startReplaceableGroup(1539498319);
            boolean zChanged2 = wVarStartRestartGroup.changed(webView);
            Object objRememberedValue2 = wVarStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == vVar4.getEmpty()) {
                final int i15 = 1;
                objRememberedValue2 = new kv.l() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.a
                    @Override // kv.l
                    public final Object invoke(Object obj) {
                        switch (i15) {
                            case 0:
                                return b.a(webView, (Context) obj);
                            default:
                                return b.a(webView, (h1) obj);
                        }
                    }
                };
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.DisposableEffect(webView, (kv.l) objRememberedValue2, wVarStartRestartGroup, i12 & 14);
            if (d0.isTraceInProgress()) {
                d0.traceEventEnd();
            }
            vVar2 = vVar3;
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.d(webView, vVar2, e0Var, i10, i11));
        }
    }

    public static final FrameLayout a(WebView webView, Context it) {
        kotlin.jvm.internal.e0.checkNotNullParameter(it, "it");
        FrameLayout frameLayout = new FrameLayout(it);
        webView.setBackgroundColor(0);
        webView.setVisibility(0);
        frameLayout.addView(webView, new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    public static final g1 a(WebView webView, h1 DisposableEffect) {
        kotlin.jvm.internal.e0.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new C0486b(webView);
    }
}

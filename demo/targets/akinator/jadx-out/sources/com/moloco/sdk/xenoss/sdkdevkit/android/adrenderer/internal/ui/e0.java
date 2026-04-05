package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import a2.a3;
import a2.s5;
import android.app.Activity;
import kotlinx.coroutines.CoroutineScope;
import p0.k1;
import p0.o4;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class e0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.n implements kv.p {

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f48575i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Activity f48576j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z10, Activity activity, zu.d<? super a> dVar) {
            super(2, dVar);
            this.f48575i = z10;
            this.f48576j = activity;
        }

        @Override // kv.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
        }

        @Override // bv.a
        public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
            return new a(this.f48575i, this.f48576j, dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            av.e.getCOROUTINE_SUSPENDED();
            tu.a0.throwOnFailure(obj);
            if (this.f48575i) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.o.a(this.f48576j);
            }
            return x0.f87415a;
        }
    }

    public static final x0 a(Activity activity, int i10, p0.w wVar, int i11) {
        a(activity, wVar, i10 | 1);
        return x0.f87415a;
    }

    public static final void a(Activity activity, p0.w wVar, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(activity, "<this>");
        p0.w wVarStartRestartGroup = wVar.startRestartGroup(-726701488);
        if ((i10 & 6) == 0) {
            i11 = (wVarStartRestartGroup.changed(activity) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) == 2 && wVarStartRestartGroup.getSkipping()) {
            wVarStartRestartGroup.skipToGroupEnd();
        } else {
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventStart(-726701488, i11, -1, "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.HideSystemUI (HideSystemUI.kt:9)");
            }
            boolean zIsWindowFocused = ((s5) wVarStartRestartGroup.consume(a3.getLocalWindowInfo())).isWindowFocused();
            Boolean boolValueOf = Boolean.valueOf(zIsWindowFocused);
            wVarStartRestartGroup.startReplaceableGroup(-1598618285);
            boolean zChanged = wVarStartRestartGroup.changed(zIsWindowFocused) | wVarStartRestartGroup.changed(activity);
            Object objRememberedValue = wVarStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == p0.v.f80515a.getEmpty()) {
                objRememberedValue = new a(zIsWindowFocused, activity, null);
                wVarStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            wVarStartRestartGroup.endReplaceableGroup();
            k1.LaunchedEffect(boolValueOf, (kv.p) objRememberedValue, wVarStartRestartGroup, 0);
            if (p0.d0.isTraceInProgress()) {
                p0.d0.traceEventEnd();
            }
        }
        o4 o4VarEndRestartGroup = wVarStartRestartGroup.endRestartGroup();
        if (o4VarEndRestartGroup != null) {
            o4VarEndRestartGroup.updateScope(new d0(activity, i10, 0));
        }
    }
}

package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import kotlinx.coroutines.flow.MutableSharedFlow;
import tu.x0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class h0 extends View {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
    }

    public final Object a(MotionEvent motionEvent, com.moloco.sdk.internal.services.c0 c0Var, String str, String str2, p pVar, MutableSharedFlow<x0> mutableSharedFlow, com.moloco.sdk.internal.y yVar, zu.d<? super x0> dVar) {
        Object objA;
        if (motionEvent.getAction() == 0) {
            int[] iArr = new int[2];
            getLocationOnScreen(iArr);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.model.a(k0.first(iArr), k0.last(iArr), getHeight(), getWidth(), (int) (motionEvent.getX() + k0.first(iArr)), (int) (motionEvent.getY() + k0.last(iArr)));
            if (str != null) {
                bv.b.boxBoolean(com.moloco.sdk.internal.x.a(yVar, str, System.currentTimeMillis(), null, 4, null));
            }
            if (str2 != null && (objA = c0Var.a(str2, aVar, pVar, mutableSharedFlow, dVar)) == av.e.getCOROUTINE_SUSPENDED()) {
                return objA;
            }
        }
        return x0.f87415a;
    }
}

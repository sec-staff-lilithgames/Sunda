package com.moloco.sdk.internal.services;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public final Context f47044a;

    public g(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f47044a = context;
    }

    @Override // com.moloco.sdk.internal.services.f
    public e a() {
        Context context = this.f47044a;
        com.moloco.sdk.common_adapter_internal.d dVarInvoke = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x.a(context).invoke();
        float widthDp = dVarInvoke.getWidthDp();
        return new e(dVarInvoke.getWidthPx(), widthDp, dVarInvoke.getHeightPx(), dVarInvoke.getHeightDp(), dVarInvoke.getPxRatio(), dVarInvoke.getDpi(), context.getResources().getDisplayMetrics().xdpi, context.getResources().getDisplayMetrics().ydpi);
    }

    @Override // com.moloco.sdk.internal.services.f
    public h b() {
        int i10 = this.f47044a.getResources().getConfiguration().orientation;
        return i10 != 1 ? i10 != 2 ? h.f47045b : h.f47047e : h.f47046c;
    }

    public final Context c() {
        return this.f47044a;
    }

    @Override // com.moloco.sdk.internal.services.f
    @tu.f
    public e invoke() {
        return a();
    }
}

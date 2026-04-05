package com.fyber.inneractive.sdk.web;

import android.window.OnBackInvokedCallback;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class t implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f26954a;

    public t(i0 i0Var) {
        this.f26954a = i0Var;
    }

    public final void onBackInvoked() {
        i0 i0Var = this.f26954a;
        if (i0Var.p()) {
            IAlog.e("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            i0Var.o();
        }
    }
}

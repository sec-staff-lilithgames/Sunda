package com.fyber.inneractive.sdk.activities;

import android.window.OnBackInvokedCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b implements OnBackInvokedCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveBaseActivity f23052a;

    public b(InneractiveBaseActivity inneractiveBaseActivity) {
        this.f23052a = inneractiveBaseActivity;
    }

    public final void onBackInvoked() {
        this.f23052a.onBackPressed();
    }
}

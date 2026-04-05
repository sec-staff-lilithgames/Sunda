package com.fyber.inneractive.sdk.ui;

import android.view.View;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveFullscreenAdActivity f26735a;

    public a(InneractiveFullscreenAdActivity inneractiveFullscreenAdActivity) {
        this.f26735a = inneractiveFullscreenAdActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f26735a.dismissAd(true);
    }
}

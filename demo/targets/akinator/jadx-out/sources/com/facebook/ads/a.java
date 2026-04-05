package com.facebook.ads;

import android.content.res.Configuration;
import com.facebook.ads.internal.api.AdViewParentApi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements AdViewParentApi {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdView f22983b;

    public a(AdView adView) {
        this.f22983b = adView;
    }

    @Override // com.facebook.ads.internal.api.AdViewParentApi
    public void onConfigurationChanged(Configuration configuration) {
        super/*android.view.View*/.onConfigurationChanged(configuration);
    }
}

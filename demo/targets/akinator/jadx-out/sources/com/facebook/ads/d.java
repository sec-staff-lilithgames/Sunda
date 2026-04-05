package com.facebook.ads;

import com.facebook.ads.internal.api.AdNativeComponentView;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MediaView f22985b;

    public d(MediaView mediaView) {
        this.f22985b = mediaView;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaView mediaView = this.f22985b;
        mediaView.removeAllViews();
        ((AdNativeComponentView) mediaView).mAdComponentViewApi = null;
        mediaView.mMediaViewApi = DynamicLoaderFactory.makeLoader(mediaView.mConstructorParams.getContext()).createMediaViewApi();
        mediaView.attachAdComponentViewApi(mediaView.mMediaViewApi);
        mediaView.mMediaViewApi.initialize(mediaView.mConstructorParams, mediaView);
    }
}

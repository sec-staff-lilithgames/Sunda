package com.facebook.ads;

import android.content.Context;
import com.facebook.ads.internal.api.AdComponentFrameLayout;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class AdOptionsView extends AdComponentFrameLayout {
    private final AdOptionsViewApi mAdOptionsViewApi;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum Orientation {
        HORIZONTAL,
        VERTICAL
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout) {
        super(context);
        AdOptionsViewApi adOptionsViewApiCreateAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, this);
        this.mAdOptionsViewApi = adOptionsViewApiCreateAdOptionsView;
        attachAdComponentViewApi(adOptionsViewApiCreateAdOptionsView);
    }

    public void setIconColor(int i10) {
        this.mAdOptionsViewApi.setIconColor(i10);
    }

    public void setIconSizeDp(int i10) {
        this.mAdOptionsViewApi.setIconSizeDp(i10);
    }

    public void setSingleIcon(boolean z10) {
        this.mAdOptionsViewApi.setSingleIcon(z10);
    }

    public AdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, Orientation orientation, int i10) {
        super(context);
        AdOptionsViewApi adOptionsViewApiCreateAdOptionsView = DynamicLoaderFactory.makeLoader(context).createAdOptionsView(context, nativeAdBase, nativeAdLayout, orientation, i10, this);
        this.mAdOptionsViewApi = adOptionsViewApiCreateAdOptionsView;
        attachAdComponentViewApi(adOptionsViewApiCreateAdOptionsView);
    }
}

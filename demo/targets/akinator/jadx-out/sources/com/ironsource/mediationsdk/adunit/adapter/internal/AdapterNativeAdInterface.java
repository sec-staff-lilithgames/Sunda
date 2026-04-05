package com.ironsource.mediationsdk.adunit.adapter.internal;

import android.content.Context;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface AdapterNativeAdInterface<Listener extends AdapterAdListener> {
    void destroyAd(AdData adData);

    void loadAd(AdData adData, Context context, Listener listener);
}

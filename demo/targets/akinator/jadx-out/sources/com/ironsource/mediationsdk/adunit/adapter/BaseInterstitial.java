package com.ironsource.mediationsdk.adunit.adapter;

import com.ironsource.mediationsdk.adunit.adapter.BaseAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.LevelPlay;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class BaseInterstitial<NetworkAdapter extends BaseAdapter> extends BaseAdInteractionAdapter<NetworkAdapter, InterstitialAdListener> {
    public BaseInterstitial(NetworkSettings networkSettings) {
        super(LevelPlay.AdFormat.INTERSTITIAL, networkSettings);
    }
}

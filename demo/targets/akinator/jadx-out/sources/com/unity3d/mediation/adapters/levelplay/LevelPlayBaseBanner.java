package com.unity3d.mediation.adapters.levelplay;

import android.content.Context;
import com.ironsource.B3;
import com.ironsource.mediationsdk.adunit.adapter.BaseBanner;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class LevelPlayBaseBanner<NetworkAdapter extends LevelPlayBaseAdapter> extends BaseBanner<NetworkAdapter> implements B3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LevelPlayBaseBanner(NetworkSettings networkSettings) {
        super(networkSettings);
        e0.checkNotNullParameter(networkSettings, "networkSettings");
    }

    @Override // com.ironsource.B3
    public void collectBiddingData(AdData adData, Context context, BiddingDataCallback biddingDataCallback) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
    }
}

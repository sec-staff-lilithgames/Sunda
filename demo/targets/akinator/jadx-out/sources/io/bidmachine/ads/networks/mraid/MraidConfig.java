package io.bidmachine.ads.networks.mraid;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class MraidConfig extends NetworkConfig {
    public MraidConfig() {
        super(CampaignEx.JSON_KEY_MRAID, null);
    }

    @Override // io.bidmachine.NetworkConfig
    public final NetworkAdapter createNetworkAdapter() {
        return new MraidAdapter();
    }
}

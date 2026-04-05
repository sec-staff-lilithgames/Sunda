package io.bidmachine.ads.networks.vast;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class VastConfig extends NetworkConfig {
    public VastConfig() {
        super("vast", null);
    }

    @Override // io.bidmachine.NetworkConfig
    public final NetworkAdapter createNetworkAdapter() {
        return new VastAdapter();
    }
}

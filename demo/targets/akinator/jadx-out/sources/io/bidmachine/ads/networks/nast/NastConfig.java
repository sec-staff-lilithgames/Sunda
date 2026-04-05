package io.bidmachine.ads.networks.nast;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class NastConfig extends NetworkConfig {
    public NastConfig() {
        super("nast", null);
    }

    @Override // io.bidmachine.NetworkConfig
    public final NetworkAdapter createNetworkAdapter() {
        return new NastAdapter();
    }
}

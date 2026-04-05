package io.bidmachine.ads.networks.gam;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class GAMConfig extends NetworkConfig {
    public GAMConfig(Map<String, String> map) {
        super("gam", map);
    }

    @Override // io.bidmachine.NetworkConfig
    public final NetworkAdapter createNetworkAdapter() {
        return new GAMAdapter();
    }

    public GAMConfig(String str, Map<String, String> map) {
        super(str, map);
    }
}

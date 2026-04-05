package io.bidmachine.ads.networks.adaptiverendering;

import io.bidmachine.NetworkAdapter;
import io.bidmachine.NetworkConfig;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AdaptiveRenderingConfig extends NetworkConfig {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public AdaptiveRenderingConfig() {
        super("adaptive_rendering", null);
    }

    @Override // io.bidmachine.NetworkConfig
    public final NetworkAdapter createNetworkAdapter() {
        return new AdaptiveRenderingAdapter();
    }
}

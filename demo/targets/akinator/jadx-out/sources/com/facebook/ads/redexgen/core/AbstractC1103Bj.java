package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1103Bj implements InterfaceC2058fK {
    public final EnumC2050fC A00;
    public final AbstractC08751z A01;

    public AbstractC1103Bj(AbstractC08751z abstractC08751z, EnumC2050fC enumC2050fC) {
        this.A01 = abstractC08751z;
        this.A00 = enumC2050fC;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2058fK
    public void A45(Map<InterfaceC2041f2, EnumC2063fP> map, Map<SyncModifiableBundle, EnumC2050fC> map2) {
        map2.put(null, this.A00);
    }
}

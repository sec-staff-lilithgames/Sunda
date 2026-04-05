package com.facebook.ads.redexgen.core;

import com.facebook.ads.sync.SyncModifiableBundle;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1102Bi implements InterfaceC2058fK {
    public final By A00;
    public final EnumC2063fP A01;

    public AbstractC1102Bi(By by, EnumC2063fP enumC2063fP) {
        this.A00 = by;
        this.A01 = enumC2063fP;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2058fK
    public void A45(Map<InterfaceC2041f2, EnumC2063fP> map, Map<SyncModifiableBundle, EnumC2050fC> map2) {
        map.put(this.A00, this.A01);
    }
}

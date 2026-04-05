package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1N {
    public final AudioAttributes A00;

    public C1N(C2620oy c2620oy) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c2620oy.A02).setFlags(c2620oy.A03).setUsage(c2620oy.A05);
        if (AbstractC09264a.A02 >= 29) {
            C1L.A00(usage, c2620oy.A01);
        }
        if (AbstractC09264a.A02 >= 32) {
            C1M.A00(usage, c2620oy.A04);
        }
        this.A00 = usage.build();
    }
}

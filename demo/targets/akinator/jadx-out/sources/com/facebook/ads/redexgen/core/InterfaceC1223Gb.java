package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public interface InterfaceC1223Gb {
    public static final InterfaceC1223Gb A00 = new InterfaceC1223Gb() { // from class: com.facebook.ads.redexgen.X.lL
        @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
        public final GX[] A5F() {
            return AbstractC1222Ga.A00();
        }

        @Override // com.facebook.ads.redexgen.core.InterfaceC1223Gb
        public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
            return AbstractC1222Ga.A01(this, uri, map);
        }
    };

    GX[] A5F();

    GX[] A5G(Uri uri, Map<String, List<String>> map);
}

package com.facebook.ads.redexgen.core;

import java.io.File;

/* renamed from: com.facebook.ads.redexgen.X.jQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2294jQ implements InterfaceC1343Ks<File> {
    @Override // com.facebook.ads.redexgen.core.InterfaceC1343Ks
    public final C1342Kr<File> A3p(File file, LA la2) {
        if (file.exists()) {
            return new C1342Kr<>(true, file);
        }
        return new C1342Kr<>(false, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1343Ks
    public final void A55(File file, LA la2) {
    }
}

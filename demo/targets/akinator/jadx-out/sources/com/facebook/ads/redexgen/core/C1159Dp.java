package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import javax.annotation.Nullable;

@MetaExoPlayerCustomization(type = {"NEW_CLASS"}, value = "Encapsulate error info from subtitle decoder")
/* renamed from: com.facebook.ads.redexgen.X.Dp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1159Dp {

    @Nullable
    public final C2614or A00;
    public final Throwable A01;

    public C1159Dp(@Nullable C2614or c2614or, Throwable th2) {
        this.A00 = c2614or;
        this.A01 = th2;
    }
}

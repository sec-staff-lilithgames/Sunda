package io.bidmachine.iab.vast;

import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class r implements x {
    @Override // io.bidmachine.iab.vast.x
    public void onUrlReady(String str) {
        e.d("VastRequest", "Fire url: %s", str);
        h0.simpleTrackUrl(str);
    }
}

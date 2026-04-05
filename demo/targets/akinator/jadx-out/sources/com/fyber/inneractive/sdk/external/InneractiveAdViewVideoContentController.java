package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.flow.u0;
import com.fyber.inneractive.sdk.renderers.v;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveAdViewVideoContentController extends u0 {
    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof t0;
    }

    public void setControlledRenderer(v vVar) {
        new WeakReference(vVar);
    }

    public void pauseVideo() {
    }

    public void playVideo() {
    }
}

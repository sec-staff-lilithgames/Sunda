package io.bidmachine.media3.exoplayer;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class x extends MediaRouter2$ControllerCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f61598a;

    public x(y yVar) {
        this.f61598a = yVar;
    }

    public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        y yVar = this.f61598a;
        yVar.f61603d.setStateInBackground(Boolean.valueOf(y.c(yVar.f61600a)));
    }
}

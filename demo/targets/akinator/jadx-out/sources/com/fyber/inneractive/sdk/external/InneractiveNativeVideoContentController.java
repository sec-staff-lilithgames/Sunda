package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.u0;
import com.fyber.inneractive.sdk.util.v;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveNativeVideoContentController extends u0 {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f23503a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface Renderer {
        void pauseVideo();

        void playVideo();
    }

    @Override // com.fyber.inneractive.sdk.flow.j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent().isVideoAd();
    }

    public void pauseVideo() {
        if (((Renderer) v.a(this.f23503a)) != null) {
            ((Renderer) this.f23503a.get()).pauseVideo();
        }
    }

    public void playVideo() {
        Renderer renderer = (Renderer) v.a(this.f23503a);
        if (renderer != null) {
            renderer.playVideo();
        }
    }

    public void setControlledRenderer(Renderer renderer) {
        this.f23503a = new WeakReference(renderer);
    }
}

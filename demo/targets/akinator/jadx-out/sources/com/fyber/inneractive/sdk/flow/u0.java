package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class u0 extends j0 implements VideoContentListener {
    protected boolean isOverlayOutside = true;

    public boolean isOverlayOutside() {
        return this.isOverlayOutside;
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onCompleted() {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onCompleted();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onPlayerError() {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onPlayerError();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.VideoContentListener
    public void onProgress(int i10, int i11) {
        InneractiveContentController.EventsListener eventsListener = this.mEventsListener;
        if (eventsListener != null) {
            ((VideoContentListener) eventsListener).onProgress(i10, i11);
        }
    }

    public u0 setOverlayOutside(boolean z10) {
        this.isOverlayOutside = z10;
        return this;
    }
}

package io.bidmachine;

import io.bidmachine.AdRequest;
import io.bidmachine.IAd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface IAd<SelfType extends IAd, AdRequestType extends AdRequest> {
    boolean canShow();

    void destroy();

    up.c getAuctionResult();

    boolean isDestroyed();

    boolean isExpired();

    boolean isLoaded();

    boolean isLoading();

    SelfType load(AdRequestType adrequesttype);

    SelfType setRendererConfiguration(RendererConfiguration rendererConfiguration);
}

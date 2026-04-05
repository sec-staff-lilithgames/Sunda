package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.external.InneractiveUnitController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface InneractiveNativeAdEventsListener extends InneractiveUnitController.EventsListener {
    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdClicked(InneractiveAdSpot inneractiveAdSpot);

    void onAdCollapsed(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, InneractiveUnitController.AdDisplayError adDisplayError);

    void onAdExpanded(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdImpression(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot);

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
    void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot);
}

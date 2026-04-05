package io.bidmachine;

import android.content.Context;
import io.bidmachine.protobuf.ResponsePayload;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f60348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdRequest f60349c;

    public f(AdRequest adRequest, Context context) {
        this.f60349c = adRequest;
        this.f60348b = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        AdRequest<?, ?, ?> adRequest = this.f60349c;
        try {
            adRequest.cancel();
            adRequest.unsubscribeTimeOut();
            n nVar = adRequest.adResponse;
            if (nVar != null) {
                nVar.detachAdRequest(adRequest);
                adRequest.adResponse = null;
            }
            ((AdRequest) adRequest).isApiRequestCanceled.set(false);
            ((AdRequest) adRequest).isApiRequestCompleted.set(false);
            adRequest.subscribeTimeOut();
            adRequest.log(new hv.t(8));
            ((AdRequest) adRequest).trackingObject.eventStart(TrackEventType.AuctionRequest);
            ResponsePayload bidPayload = ((AdRequest) adRequest).adRequestParameters.getBidPayload();
            if (bidPayload != null) {
                adRequest.processBidPayload(bidPayload);
            } else {
                adRequest.processRequestObject(this.f60348b);
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
            adRequest.processRequestFail(pr.a.throwable("Exception loading ad request", th2));
        }
    }
}

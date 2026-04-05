package io.bidmachine;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.openrtb.Response;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class t3 {
    public static void a(AdRequestParameters adRequestParameters, NetworkAdUnitManager networkAdUnitManager, Response response, s3 s3Var) {
        if (response == null || response.getSeatbidCount() == 0) {
            s3Var.onFail(pr.a.notFound("Response"));
            return;
        }
        Response.Seatbid seatbid = response.getSeatbid(0);
        if (seatbid == null || seatbid.getBidCount() == 0) {
            s3Var.onFail(pr.a.notFound("Seatbid"));
            return;
        }
        Response.Seatbid.Bid bid = seatbid.getBid(0);
        if (bid == null) {
            s3Var.onFail(pr.a.notFound("Bid"));
            return;
        }
        Any media = bid.getMedia();
        if (media == null) {
            s3Var.onFail(pr.a.notFound("Media"));
            return;
        }
        if (!media.is(Ad.class)) {
            s3Var.onFail(pr.a.incorrectContent("Media not valid"));
            return;
        }
        try {
            Ad ad2 = (Ad) media.unpack(Ad.class);
            if (ad2 == null) {
                s3Var.onFail(pr.a.notFound("Ad"));
                return;
            }
            NetworkAdapter networkAdapterFindNetworkAdapter = adRequestParameters.getAdsType().findNetworkAdapter(ad2);
            if (networkAdapterFindNetworkAdapter == null) {
                s3Var.onFail(pr.a.notFound("NetworkAdapter"));
            } else {
                s3Var.onSuccess(new n(adRequestParameters, networkAdUnitManager, response, seatbid, bid, ad2, networkAdapterFindNetworkAdapter));
            }
        } catch (Throwable th2) {
            nm.a.w(th2);
            s3Var.onFail(pr.a.throwable("Failed to process response", th2));
        }
    }
}

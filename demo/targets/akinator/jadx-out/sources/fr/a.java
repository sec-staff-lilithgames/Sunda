package fr;

import android.content.Context;
import hr.h;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdRequest;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.FullScreenAd;
import io.bidmachine.FullScreenAdObject;
import io.bidmachine.NetworkAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends FullScreenAd {
    public a(Context context) {
        super(context, AdsType.Rewarded);
    }

    @Override // io.bidmachine.BidMachineAd
    public final up.a createAdObject(ContextProvider contextProvider, AdRequest adRequest, NetworkAdapter networkAdapter, up.b bVar, AdProcessCallback adProcessCallback) {
        f fVar = (f) adRequest;
        h hVarCreateRewarded = networkAdapter.createRewarded();
        if (hVarCreateRewarded == null) {
            return null;
        }
        return new FullScreenAdObject(contextProvider, adProcessCallback, fVar, bVar, hVarCreateRewarded);
    }
}

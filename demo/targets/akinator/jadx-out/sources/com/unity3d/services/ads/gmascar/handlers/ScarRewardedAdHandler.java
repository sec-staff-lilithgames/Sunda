package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.i;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import kl.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class ScarRewardedAdHandler extends ScarAdHandlerBase implements i {
    private boolean _hasEarnedReward;

    public ScarRewardedAdHandler(d dVar, EventSubject<c> eventSubject, GMAEventSender gMAEventSender) {
        super(dVar, eventSubject, gMAEventSender);
        this._hasEarnedReward = false;
    }

    @Override // com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase, com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        if (!this._hasEarnedReward) {
            onAdSkipped();
        }
        super.onAdClosed();
    }

    @Override // com.unity3d.scar.adapter.common.i
    public void onAdFailedToShow(int i10, String str) {
        this._gmaEventSender.send(c.f50725w, this._scarAdMetadata.getPlacementId(), this._scarAdMetadata.getQueryId(), str, Integer.valueOf(i10));
    }

    @Override // com.unity3d.scar.adapter.common.i
    public void onAdImpression() {
        this._gmaEventSender.send(c.f50717o, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.i
    public void onAdSkipped() {
        this._gmaEventSender.send(c.E, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.i
    public void onUserEarnedReward() {
        this._hasEarnedReward = true;
        this._gmaEventSender.send(c.C, new Object[0]);
    }
}

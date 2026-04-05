package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import ll.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class SignalsHandler implements b {
    private GMAEventSender _gmaEventSender;

    public SignalsHandler(GMAEventSender gMAEventSender) {
        this._gmaEventSender = gMAEventSender;
    }

    @Override // ll.b
    public void onSignalsCollected(String str) {
        this._gmaEventSender.send(c.f50712j, str);
    }

    @Override // ll.b
    public void onSignalsCollectionFailed(String str) {
        this._gmaEventSender.send(c.f50713k, str);
    }
}

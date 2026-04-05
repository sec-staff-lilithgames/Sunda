package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.c;
import com.unity3d.scar.adapter.common.e;
import com.unity3d.services.ads.gmascar.utils.GMAEventSender;
import com.unity3d.services.core.misc.EventSubject;
import com.unity3d.services.core.misc.IEventListener;
import kl.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class ScarAdHandlerBase implements e {
    protected final EventSubject<c> _eventSubject;
    protected final GMAEventSender _gmaEventSender;
    protected final d _scarAdMetadata;

    public ScarAdHandlerBase(d dVar, EventSubject<c> eventSubject, GMAEventSender gMAEventSender) {
        this._scarAdMetadata = dVar;
        this._eventSubject = eventSubject;
        this._gmaEventSender = gMAEventSender;
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void onAdClicked() {
        this._gmaEventSender.send(c.D, new Object[0]);
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void onAdClosed() {
        this._gmaEventSender.send(c.G, new Object[0]);
        this._eventSubject.unsubscribe();
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void onAdFailedToLoad(int i10, String str) {
        this._gmaEventSender.send(c.f50720r, this._scarAdMetadata.getPlacementId(), this._scarAdMetadata.getQueryId(), str, Integer.valueOf(i10));
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void onAdLoaded() {
        this._gmaEventSender.send(c.f50715m, this._scarAdMetadata.getPlacementId(), this._scarAdMetadata.getQueryId());
    }

    @Override // com.unity3d.scar.adapter.common.e
    public void onAdOpened() {
        this._gmaEventSender.send(c.f50722t, new Object[0]);
        this._eventSubject.subscribe(new IEventListener<c>() { // from class: com.unity3d.services.ads.gmascar.handlers.ScarAdHandlerBase.1
            @Override // com.unity3d.services.core.misc.IEventListener
            public void onNextEvent(c cVar) {
                ScarAdHandlerBase.this._gmaEventSender.send(cVar, new Object[0]);
            }
        });
    }
}

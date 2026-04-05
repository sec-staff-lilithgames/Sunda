package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.external.InneractiveContentController;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface VideoContentListener extends InneractiveContentController.EventsListener {
    void onCompleted();

    @Deprecated
    void onPlayerError();

    void onProgress(int i10, int i11);
}

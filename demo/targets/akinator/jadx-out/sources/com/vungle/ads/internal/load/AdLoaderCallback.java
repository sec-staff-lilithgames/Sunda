package com.vungle.ads.internal.load;

import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface AdLoaderCallback {
    void onFailure(VungleError vungleError);

    void onSuccess(AdPayload adPayload);
}

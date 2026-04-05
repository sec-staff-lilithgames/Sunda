package com.mbridge.msdk.out;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface AdapterListener {
    void onAdClicked(Campaign campaign);

    void onAdLoaded(List<Campaign> list);

    void onError(String str);

    void onFrameAdLoaded(List<Frame> list);
}

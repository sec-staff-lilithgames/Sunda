package io.bidmachine.iab.vast;

import io.bidmachine.iab.vast.activity.VastActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface b {
    void onVastClick(VastActivity vastActivity, t tVar, um.k kVar, String str);

    void onVastComplete(VastActivity vastActivity, t tVar);

    void onVastDismiss(VastActivity vastActivity, t tVar, boolean z10);

    void onVastShowFailed(t tVar, qm.b bVar);

    void onVastShown(VastActivity vastActivity, t tVar);
}

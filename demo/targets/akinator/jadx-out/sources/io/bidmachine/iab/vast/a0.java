package io.bidmachine.iab.vast;

import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface a0 {
    void onClick(VastView vastView, t tVar, um.k kVar, String str);

    void onComplete(VastView vastView, t tVar);

    void onFinish(VastView vastView, t tVar, boolean z10);

    void onOrientationRequested(VastView vastView, t tVar, int i10);

    void onShowFailed(VastView vastView, t tVar, qm.b bVar);

    void onShown(VastView vastView, t tVar);
}

package io.bidmachine.iab.vast.activity;

import android.view.View;
import io.bidmachine.iab.vast.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f60478b;

    public f(VastView vastView) {
        this.f60478b = vastView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws IllegalStateException {
        VastView vastView = this.f60478b;
        t tVar = vastView.f60452v;
        if (tVar == null || !tVar.isR1() || vastView.f60453w.f60468n || !vastView.x()) {
            if (vastView.K) {
                vastView.t();
            } else {
                vastView.handleBackPress();
            }
        }
    }
}

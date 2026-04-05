package io.bidmachine.iab.vast.activity;

import android.view.View;
import io.bidmachine.iab.vast.activity.VastView;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f60479b;

    public g(VastView vastView) {
        this.f60479b = vastView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
        int i10 = VastView.f60422k0;
        VastView vastView = this.f60479b;
        if (vastView.isLoaded()) {
            VastView.B b10 = vastView.f60453w;
            b10.f60466l = false;
            b10.f60460f = 0;
            vastView.z();
            vastView.w(vastView.f60452v.getVastAd().getAppodealExtension());
            vastView.startPlayback("restartPlayback");
        }
    }
}

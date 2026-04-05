package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.C3191e4;
import com.ironsource.sdk.utils.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class InterstitialActivity extends ControllerActivity {

    /* renamed from: r, reason: collision with root package name */
    private static final String f38413r = "InterstitialActivity";

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i(f38413r, "onCreate");
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.i(f38413r, C3191e4.h.f36510t0);
    }

    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.i(f38413r, C3191e4.h.f36512u0);
    }
}

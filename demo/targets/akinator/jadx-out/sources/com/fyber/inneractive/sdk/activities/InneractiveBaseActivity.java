package com.fyber.inneractive.sdk.activities;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.util.IAlog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class InneractiveBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    public b f23026a;

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        if (frameLayout != null && Build.VERSION.SDK_INT >= 35) {
            frameLayout.setOnApplyWindowInsetsListener(new com.fyber.inneractive.sdk.util.m());
        }
        if (Build.VERSION.SDK_INT >= 33) {
            this.f23026a = new b(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f23026a);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                if (this.f23026a != null) {
                    getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f23026a);
                    this.f23026a = null;
                }
            } catch (Exception e10) {
                IAlog.f("failed to unregisterOnBackInvokedCallback with error: %s", e10.getMessage());
            }
        }
    }
}

package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Window;
import com.facebook.ads.AudienceNetworkActivity;

/* loaded from: assets/audience_network.dex */
public final class RJ {
    public final AudienceNetworkActivity A00;
    public final C1937dL A01;

    public RJ(C1937dL c1937dL, AudienceNetworkActivity audienceNetworkActivity) {
        this.A01 = c1937dL;
        this.A00 = audienceNetworkActivity;
    }

    private int A00() {
        Rect rect = new Rect();
        Window window = this.A00.getWindow();
        if (window == null) {
            return 2;
        }
        window.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (rect.top < 200 && rect.left < 200) {
            return 1;
        }
        return 0;
    }

    public final void A01() {
        if ((this.A01.A0H().A01() || U7.A1z(this.A01)) && Build.VERSION.SDK_INT >= 24) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.RI
                @Override // java.lang.Runnable
                public final void run() {
                    this.A00.A02();
                }
            }, 1000L);
        }
    }

    public final /* synthetic */ void A02() {
        if (this.A00.isInMultiWindowMode()) {
            this.A01.A0F().ABU(A00());
        }
    }
}

package com.amazon.aps.ads.util;

import com.amazon.aps.ads.ApsAdView;
import com.amazon.device.ads.DTBAdMRAIDController;
import ha.a;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class ApsMraidHandler extends DTBAdMRAIDController {
    public static final Companion Companion = new Companion(null);
    private static final String MRAID_CLOSE = DTBAdMRAIDController.MRAID_CLOSE;
    private ApsMraidCloseButtonListener mraidListener;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        public final String getMRAID_CLOSE() {
            return ApsMraidHandler.MRAID_CLOSE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApsMraidHandler(ApsAdView apsAdView) {
        super(apsAdView);
        e0.checkNotNullParameter(apsAdView, "apsAdView");
        super.setCustomButtonListener(new a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(ApsMraidHandler apsMraidHandler) {
        ApsMraidCloseButtonListener apsMraidCloseButtonListener = apsMraidHandler.mraidListener;
        if (apsMraidCloseButtonListener != null) {
            apsMraidCloseButtonListener.useCustomButtonUpdated();
        }
    }

    public final void setCloseButtonListener(ApsMraidCloseButtonListener apsMraidListener) {
        e0.checkNotNullParameter(apsMraidListener, "apsMraidListener");
        this.mraidListener = apsMraidListener;
    }
}

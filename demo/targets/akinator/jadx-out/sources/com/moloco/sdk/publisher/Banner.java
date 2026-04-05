package com.moloco.sdk.publisher;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class Banner extends FrameLayout implements AdLoad, Destroyable {
    public static final int $stable = 8;
    private final MutableStateFlow<Boolean> _isViewShown;
    private BannerAdShowListener adShowListener;
    private final StateFlow<Boolean> isViewShown;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Banner(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        setTag("MolocoBannerView");
        MutableStateFlow<Boolean> MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this._isViewShown = MutableStateFlow;
        this.isViewShown = FlowKt.asStateFlow(MutableStateFlow);
    }

    public BannerAdShowListener getAdShowListener() {
        return this.adShowListener;
    }

    public StateFlow<Boolean> isViewShown() {
        return this.isViewShown;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        e0.checkNotNullParameter(changedView, "changedView");
        this._isViewShown.setValue(Boolean.valueOf(changedView.isShown()));
    }

    public void setAdShowListener(BannerAdShowListener bannerAdShowListener) {
        this.adShowListener = bannerAdShowListener;
    }
}

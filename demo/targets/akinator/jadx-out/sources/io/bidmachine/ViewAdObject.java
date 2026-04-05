package io.bidmachine;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import hr.d;
import hr.p;
import io.bidmachine.AdRequest;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ViewAdObject<AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdType extends hr.p, UnifiedAdRequestParamsType extends hr.d> extends AdObjectImpl<AdRequestType, up.b, UnifiedAdType, hr.f, UnifiedAdRequestParamsType> {
    private View adView;
    private int height;
    private MeasureMode heightMeasureMode;
    private final dn.b visibilityTrackerHolder;
    private int width;
    private MeasureMode widthMeasureMode;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum MeasureMode {
        Match,
        Wrap,
        Direct;

        public int getSize(Context context, int i10) {
            int i11 = h4.f60376a[ordinal()];
            if (i11 != 1) {
                return i11 != 2 ? -1 : -2;
            }
            return Math.round(nm.j.getScreenDensity(context) * i10);
        }
    }

    public ViewAdObject(ContextProvider contextProvider, AdProcessCallback adProcessCallback, AdRequestType adrequesttype, up.b bVar, UnifiedAdType unifiedadtype) {
        super(contextProvider, adProcessCallback, adrequesttype, bVar, unifiedadtype);
        MeasureMode measureMode = MeasureMode.Direct;
        this.widthMeasureMode = measureMode;
        this.heightMeasureMode = measureMode;
        this.visibilityTrackerHolder = new dn.b();
    }

    private int getHeight() {
        return this.height;
    }

    private int getScaledHeight(Context context) {
        return this.heightMeasureMode.getSize(context, getHeight());
    }

    private int getScaledWidth(Context context) {
        return this.widthMeasureMode.getSize(context, getWidth());
    }

    private int getWidth() {
        return this.width;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdView(View view) {
        hide();
        this.adView = view;
    }

    public MeasureMode getHeightMeasureMode() {
        return this.heightMeasureMode;
    }

    public MeasureMode getWidthMeasureMode() {
        return this.widthMeasureMode;
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void hide() {
        super.hide();
        this.visibilityTrackerHolder.stopTracking();
        View view = this.adView;
        if (view != null) {
            pr.p.removeViewFromParent(view);
        }
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onDestroy() {
        hide();
        super.onDestroy();
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public void onImpression() {
        super.onImpression();
        this.visibilityTrackerHolder.stopTracking();
    }

    public void setHeight(int i10) {
        this.height = i10;
    }

    public void setHeightMeasureMode(MeasureMode measureMode) {
        this.heightMeasureMode = measureMode;
    }

    public void setWidth(int i10) {
        this.width = i10;
    }

    public void setWidthMeasureMode(MeasureMode measureMode) {
        this.widthMeasureMode = measureMode;
    }

    public void show(ViewGroup viewGroup, RendererConfiguration rendererConfiguration) {
        if (viewGroup == null) {
            getUnifiedAdCallback().onAdShowFailed(pr.a.notFound("Target container"));
            return;
        }
        View view = this.adView;
        if (view == null) {
            getUnifiedAdCallback().onAdShowFailed(pr.a.internal("Ad view is null"));
            return;
        }
        MeasureMode widthMeasureMode = getWidthMeasureMode();
        MeasureMode measureMode = MeasureMode.Direct;
        if ((widthMeasureMode == measureMode && getWidth() == 0) || (getHeightMeasureMode() == measureMode && getHeight() == 0)) {
            getUnifiedAdCallback().onAdShowFailed(pr.a.incorrectContent("Width or height are not provided"));
            return;
        }
        Context context = viewGroup.getContext();
        ViewGroup.LayoutParams layoutParams = viewGroup instanceof FrameLayout ? new FrameLayout.LayoutParams(getScaledWidth(context), getScaledHeight(context), 17) : new ViewGroup.LayoutParams(getScaledWidth(context), getScaledHeight(context));
        getProcessCallback().processStartVisibilityTracker();
        this.visibilityTrackerHolder.startTracking(view, getParams().getVisibilityParams(), new g4(this));
        pr.p.safeAddSingleView(viewGroup, view, layoutParams);
        getProcessCallback().processFillAd();
        try {
            getUnifiedAd().prepareToShow(rendererConfiguration);
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }

    @Override // io.bidmachine.AdObjectImpl, up.a
    public hr.f createUnifiedCallback(AdProcessCallback adProcessCallback) {
        return new i4(this, adProcessCallback);
    }
}

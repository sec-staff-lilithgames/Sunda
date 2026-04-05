package com.amazon.device.ads;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.ironsource.C3191e4;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class DTBAdMRAIDBannerController extends DTBAdMRAIDController implements DTBMRAIDCloseButtonListener {
    public static final int ANIMATION_DURATION = 500;
    public static List<WeakReference<DTBAdMRAIDBannerController>> bannerControllers = new ArrayList();
    public static AtomicInteger indexDispencer = new AtomicInteger(100);
    public ObjectAnimator animater;
    public float animationProgress;
    public DTBAdBannerListener bannerListener;
    public ViewGroup defaultParent;
    public AnimationPoint endAnimation;
    public ViewGroup expandedBackground;
    public int index;
    public int originalHeight;
    public ViewGroup.LayoutParams originalParams;
    public int originalWidth;
    public float originalX;
    public int originalXPos;
    public float originalY;
    public int originalYPos;
    public AnimationPoint startAnimation;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class AnimationPoint {
        public int height;
        public int width;
        public int xPos;
        public int yPos;

        public AnimationPoint(int i10, int i11, int i12, int i13) {
            this.xPos = i10;
            this.yPos = i11;
            this.width = i12;
            this.height = i13;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class BackgroundView extends LinearLayout {
        public BackgroundView(Context context) {
            super(context);
            setOrientation(1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class ExpandedBannerListener implements DTBAdExpandedListener {
        public ExpandedBannerListener() {
        }

        @Override // com.amazon.device.ads.DTBAdExpandedListener
        public void onAdLoaded(DTBAdView dTBAdView) {
        }

        @Override // com.amazon.device.ads.DTBAdExpandedListener
        public void onCreateExpandedController(DTBAdMRAIDExpandedController dTBAdMRAIDExpandedController) {
            dTBAdMRAIDExpandedController.setMasterController(DTBAdMRAIDBannerController.this);
        }
    }

    public DTBAdMRAIDBannerController(DTBAdView dTBAdView, DTBAdBannerListener dTBAdBannerListener) {
        super(dTBAdView);
        this.index = indexDispencer.incrementAndGet();
        this.bannerListener = dTBAdBannerListener;
        this.customButtonListener = this;
    }

    private void executeOnePartExpand(Map<String, Object> map) {
        int i10;
        int i11;
        final boolean zBooleanValue;
        int iIntValue;
        int iIntValue2;
        this.originalX = getAdView().getX();
        this.originalY = getAdView().getY();
        ViewGroup rootView = DTBAdUtil.getRootView(getAdView());
        if (rootView == null) {
            fireErrorEvent(MraidExpandCommand.NAME, "rootview doesn't exist in one part expand");
            commandCompleted(MraidExpandCommand.NAME);
            return;
        }
        int[] iArr = new int[2];
        getAdView().getLocationInWindow(iArr);
        this.defaultParent = (ViewGroup) getAdView().getParent();
        this.originalParams = getAdView().getLayoutParams();
        getAdView().setIgnoreDetachment();
        this.defaultParent.removeView(getAdView());
        int[] iArr2 = new int[2];
        rootView.getLocationInWindow(iArr2);
        int height = rootView.getHeight();
        final int width = rootView.getWidth();
        this.startAnimation = new AnimationPoint(iArr[0] - iArr2[0], iArr[1] - iArr2[1], getAdView().getWidth(), getAdView().getHeight());
        if (map.containsKey(C3191e4.h.L) && (map.get(C3191e4.h.L) instanceof Map)) {
            Map map2 = (Map) map.get(C3191e4.h.L);
            int iSizeToDevicePixels = (!map2.containsKey("width") || (iIntValue2 = ((Integer) map2.get("width")).intValue()) <= 0) ? width : DTBAdUtil.sizeToDevicePixels(iIntValue2);
            if (map2.containsKey("height") && (iIntValue = ((Integer) map2.get("height")).intValue()) > 0) {
                height = DTBAdUtil.sizeToDevicePixels(iIntValue);
            }
            if (map2.containsKey(MraidUseCustomCloseCommand.NAME)) {
                zBooleanValue = ((Boolean) map2.get(MraidUseCustomCloseCommand.NAME)).booleanValue();
                i11 = iSizeToDevicePixels;
                i10 = height;
                BackgroundView backgroundView = new BackgroundView(getAdView().getContext());
                this.expandedBackground = backgroundView;
                backgroundView.setBackgroundColor(0);
                rootView.addView(backgroundView, -1, -1);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(getAdView().getWidth(), getAdView().getHeight());
                AnimationPoint animationPoint = this.startAnimation;
                marginLayoutParams.leftMargin = animationPoint.xPos;
                marginLayoutParams.topMargin = animationPoint.yPos;
                rootView.bringChildToFront(backgroundView);
                backgroundView.addView(getAdView(), marginLayoutParams);
                getAdView().setX(this.startAnimation.xPos);
                getAdView().setY(this.startAnimation.yPos);
                this.endAnimation = new AnimationPoint(0, 0, i11, i10);
                setCurrentPositionProperty(DTBAdUtil.pixelsToDeviceIndependenPixels(i11), DTBAdUtil.pixelsToDeviceIndependenPixels(i10));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
                this.animater = objectAnimatorOfFloat;
                objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.f
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        this.f12534a.lambda$executeOnePartExpand$8(width, zBooleanValue, valueAnimator);
                    }
                });
                this.animater.setDuration(500L);
                this.animater.start();
            }
            i11 = iSizeToDevicePixels;
            i10 = height;
        } else {
            i10 = height;
            i11 = width;
        }
        zBooleanValue = false;
        BackgroundView backgroundView2 = new BackgroundView(getAdView().getContext());
        this.expandedBackground = backgroundView2;
        backgroundView2.setBackgroundColor(0);
        rootView.addView(backgroundView2, -1, -1);
        ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(getAdView().getWidth(), getAdView().getHeight());
        AnimationPoint animationPoint2 = this.startAnimation;
        marginLayoutParams2.leftMargin = animationPoint2.xPos;
        marginLayoutParams2.topMargin = animationPoint2.yPos;
        rootView.bringChildToFront(backgroundView2);
        backgroundView2.addView(getAdView(), marginLayoutParams2);
        getAdView().setX(this.startAnimation.xPos);
        getAdView().setY(this.startAnimation.yPos);
        this.endAnimation = new AnimationPoint(0, 0, i11, i10);
        setCurrentPositionProperty(DTBAdUtil.pixelsToDeviceIndependenPixels(i11), DTBAdUtil.pixelsToDeviceIndependenPixels(i10));
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = objectAnimatorOfFloat2;
        objectAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.amazon.device.ads.f
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f12534a.lambda$executeOnePartExpand$8(width, zBooleanValue, valueAnimator);
            }
        });
        this.animater.setDuration(500L);
        this.animater.start();
    }

    private void executeTwoPartsExpand(Map<String, Object> map) {
        String str = (String) map.get("url");
        Activity activity = DTBAdUtil.getActivity(getAdView());
        Intent intent = new Intent(activity, (Class<?>) DTBAdActivity.class);
        if (str != null) {
            intent.putExtra("url", str);
        }
        intent.putExtra(DTBAdActivity.ADTYPE_ATTR, DTBAdActivity.EXPANDED);
        intent.putExtra(DTBAdActivity.INDEX_ATTR, this.index);
        intent.putExtra(DTBAdActivity.TWO_PART_EXPAND, true);
        if (map.get("orientation") != null) {
            intent.putExtra("orientation", (Serializable) map.get("orientation"));
        }
        activity.startActivity(intent);
        commandCompleted(MraidExpandCommand.NAME);
        setState(MraidStateType.EXPANDED);
        bannerControllers.add(new WeakReference<>(this));
    }

    public static DTBAdMRAIDBannerController findControllerByIndex(int i10) {
        Iterator<WeakReference<DTBAdMRAIDBannerController>> it = bannerControllers.iterator();
        while (it.hasNext()) {
            DTBAdMRAIDBannerController dTBAdMRAIDBannerController = it.next().get();
            if (dTBAdMRAIDBannerController != null && dTBAdMRAIDBannerController.index == i10) {
                return dTBAdMRAIDBannerController;
            }
        }
        return null;
    }

    private boolean isVisibleRecyclerOrListView(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        if (viewParent.toString().toLowerCase().contains("recyclerview") || viewParent.toString().toLowerCase().contains("listview")) {
            return true;
        }
        return isVisibleRecyclerOrListView(viewParent.getParent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$executeOnePartExpand$8(int i10, boolean z10, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            addCloseIndicator(i10, 0, z10);
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.height));
            setState(MraidStateType.EXPANDED);
            commandCompleted(MraidExpandCommand.NAME);
            this.animater = null;
            getAdView().computeExposure(true);
            getAdView().setScrollEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$expand$7(Map map) {
        if (((String) map.get("url")) != null) {
            executeTwoPartsExpand(map);
        } else {
            executeOnePartExpand(map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$impressionFired$19() {
        this.bannerListener.onImpressionFired(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveExpandedToDefaultImpl$3(ViewGroup viewGroup, boolean z10, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            updateExpandedToDefaultListener(viewGroup, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$moveResizedToDefaultImpl$1(ViewGroup viewGroup, boolean z10, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            updateResizedToDefaultListener(viewGroup, z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdClicked$14(View view) {
        this.bannerListener.onAdClicked(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdFailedToLoad$17() {
        this.bannerListener.onAdFailed(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdLeftApplication$15() {
        this.bannerListener.onAdOpen(this.adView);
        this.bannerListener.onAdLeftApplication(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onAdLoaded$16() {
        this.bannerListener.onAdLoaded(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMRAIDUnload$4() {
        getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
        commandCompleted(MraidUnloadCommand.NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onResizeImpl$6(int i10, int i11, int i12, int i13, ValueAnimator valueAnimator) {
        if (updateAdViewLayout(valueAnimator).floatValue() == 1.0f) {
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(i10), DTBAdUtil.pixelsToDeviceIndependenPixels(i11));
            addCloseIndicator(i12 + i10, i13);
            commandCompleted(MraidResizeCommand.NAME);
            setState(MraidStateType.RESIZED);
            this.animater = null;
            getAdView().computeExposure(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$passLoadError$18() {
        this.bannerListener.onAdError(this.adView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateExpandedToDefaultListener$11() {
        getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
        commandCompleted(MraidUnloadCommand.NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateExpandedToDefaultListener$12() {
        getAdView().computeExposure(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateResizedToDefaultListener$10() {
        getAdView().computeExposure(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateResizedToDefaultListener$9() {
        getAdView().loadUrl(AndroidWebViewClient.BLANK_PAGE);
        commandCompleted(MraidUnloadCommand.NAME);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$useCustomButtonUpdated$13() {
        this.closeIndicatorRegion.setVisibility(this.useCustomClose ? 4 : 0);
    }

    private void moveExpandedToDefault() {
        moveExpandedToDefault(500, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveExpandedToDefaultImpl, reason: merged with bridge method [inline-methods] */
    public void lambda$moveExpandedToDefault$2(int i10, boolean z10) {
        ViewGroup viewGroup;
        AnimationPoint animationPoint = this.startAnimation;
        this.startAnimation = this.endAnimation;
        this.endAnimation = animationPoint;
        ViewGroup viewGroup2 = (ViewGroup) getAdView().getParent();
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout != null && (viewGroup = (ViewGroup) linearLayout.getParent()) != null) {
            viewGroup.removeView(this.closeIndicatorRegion);
            this.closeIndicatorRegion = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addUpdateListener(new d(this, viewGroup2, z10, 0));
        this.animater.setDuration(i10);
        this.animater.start();
    }

    private void moveResizedToDefault() {
        moveResizedToDefault(500, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: moveResizedToDefaultImpl, reason: merged with bridge method [inline-methods] */
    public void lambda$moveResizedToDefault$0(int i10, boolean z10) {
        AnimationPoint animationPoint = this.startAnimation;
        this.startAnimation = this.endAnimation;
        this.endAnimation = animationPoint;
        animationPoint.height = this.originalHeight;
        animationPoint.width = this.originalWidth;
        animationPoint.xPos = this.originalXPos;
        animationPoint.yPos = this.originalYPos;
        ViewGroup viewGroup = (ViewGroup) getAdView().getParent();
        LinearLayout linearLayout = this.closeIndicatorRegion;
        if (linearLayout != null) {
            viewGroup.removeView(linearLayout);
            this.closeIndicatorRegion = null;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "animationProgress", 0.0f, 1.0f);
        this.animater = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addUpdateListener(new d(this, viewGroup, z10, 1));
        this.animater.setDuration(i10);
        this.animater.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b4 A[PHI: r5 r11
      0x00b4: PHI (r5v2 int) = (r5v1 int), (r5v12 int) binds: [B:10:0x009f, B:19:0x00ae] A[DONT_GENERATE, DONT_INLINE]
      0x00b4: PHI (r11v2 int) = (r11v1 int), (r11v5 int) binds: [B:10:0x009f, B:19:0x00ae] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc A[PHI: r0 r2
      0x00fc: PHI (r0v4 int) = (r0v3 int), (r0v16 int) binds: [B:23:0x00e4, B:34:0x00f7] A[DONT_GENERATE, DONT_INLINE]
      0x00fc: PHI (r2v8 int) = (r2v7 int), (r2v14 int) binds: [B:23:0x00e4, B:34:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: onResizeImpl, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lambda$onResize$5(int r15, int r16, int r17, int r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.ads.DTBAdMRAIDBannerController.lambda$onResize$5(int, int, int, int, boolean):void");
    }

    private Float updateAdViewLayout(ValueAnimator valueAnimator) {
        Float f10 = (Float) valueAnimator.getAnimatedValue();
        ViewGroup.LayoutParams layoutParams = getAdView().getLayoutParams();
        getAdView().setX((f10.floatValue() * (this.endAnimation.xPos - r2)) + this.startAnimation.xPos);
        getAdView().setY((f10.floatValue() * (this.endAnimation.yPos - r2)) + this.startAnimation.yPos);
        layoutParams.width = (int) ((f10.floatValue() * (this.endAnimation.width - r1)) + this.startAnimation.width);
        layoutParams.height = (int) ((f10.floatValue() * (this.endAnimation.height - r1)) + this.startAnimation.height);
        getAdView().setLayoutParams(layoutParams);
        getAdView().invalidate();
        return f10;
    }

    private void updateExpandedToDefaultListener(ViewGroup viewGroup, boolean z10) {
        getAdView().setIgnoreDetachment();
        viewGroup.removeView(getAdView());
        this.startAnimation = this.endAnimation;
        ViewGroup viewGroup2 = this.expandedBackground;
        if (viewGroup2 != null) {
            ((ViewGroup) viewGroup2.getParent()).removeView(this.expandedBackground);
            this.expandedBackground = null;
            fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.startAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.startAnimation.height));
        }
        if (this.originalParams != null) {
            this.defaultParent.addView(getAdView(), this.originalParams);
            this.defaultParent.requestLayout();
        }
        setCurrentPositionProperty();
        setState(MraidStateType.DEFAULT);
        getAdView().setScrollEnabled(false);
        commandCompleted("close");
        this.defaultParent = null;
        this.animater = null;
        if (z10) {
            new Handler().postDelayed(new b(this, 5), 500L);
        }
        new Handler().postDelayed(new b(this, 6), 100L);
    }

    private void updateResizedToDefaultListener(ViewGroup viewGroup, boolean z10) {
        getAdView().setIgnoreDetachment();
        viewGroup.removeView(getAdView());
        this.startAnimation = this.endAnimation;
        if (this.originalParams != null) {
            this.defaultParent.addView(getAdView(), this.originalParams);
            this.defaultParent.requestLayout();
        }
        getAdView().invalidate();
        setCurrentPositionProperty();
        this.defaultParent = null;
        fireSizeChange(DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.width), DTBAdUtil.pixelsToDeviceIndependenPixels(this.endAnimation.height));
        setState(MraidStateType.DEFAULT);
        this.animater = null;
        commandCompleted("close");
        if (z10) {
            new Handler().postDelayed(new b(this, 7), 500L);
        }
        new Handler().postDelayed(new b(this, 8), 100L);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void closeExpandedPartTwo() {
        setState(MraidStateType.DEFAULT);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void expand(Map<String, Object> map) {
        if (this.state.equals(MraidStateType.DEFAULT)) {
            new Handler(Looper.getMainLooper()).post(new k(1, this, map));
        } else {
            fireErrorEvent(MraidExpandCommand.NAME, "current state does not allow transition to expand");
            commandCompleted(MraidExpandCommand.NAME);
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public String getPlacementType() {
        return "inline";
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void impressionFired() {
        DtbThreadService.executeOnMainThread(new b(this, 10));
        super.impressionFired();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityDestroyed(Activity activity) {
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        ActivityMonitor.getInstance().setActivityListener(null);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController, com.amazon.device.ads.DTBActivityListener
    public void onActivityResumed(Activity activity) {
        this.bannerListener.onAdClosed(this.adView);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdClicked() {
        DTBAdView dTBAdView = this.adView;
        if (this.bannerListener != null) {
            new Handler(Looper.getMainLooper()).post(new k(2, this, dTBAdView));
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdFailedToLoad() {
        if (this.bannerListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to get bannerListener on onAdFailedToLoad");
            return;
        }
        if (getDtbOmSdkSessionManager() != null) {
            getDtbOmSdkSessionManager().stopOmAdSession();
        }
        DtbThreadService.executeOnMainThread(new b(this, 4));
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLeftApplication() {
        new Handler(Looper.getMainLooper()).post(new b(this, 3));
        ActivityMonitor.getInstance().setActivityListener(this);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdLoaded() {
        if (this.bannerListener == null) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Failed to get bannerListener on OnAdLoaded");
        } else {
            DtbThreadService.executeOnMainThread(new b(this, 1));
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onAdRemoved() {
        ViewGroup viewGroup;
        if (this.adView == null) {
            return;
        }
        super.onAdRemoved();
        removeCloseIndicator();
        ObjectAnimator objectAnimator = this.animater;
        if (objectAnimator != null) {
            objectAnimator.end();
        }
        if (!isVisibleRecyclerOrListView(this.adView.getParent())) {
            this.adView.setVisibility(8);
        }
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            ViewParent parent = this.adView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.adView);
                return;
            }
            return;
        }
        if (mraidStateType == MraidStateType.EXPANDED && (viewGroup = this.expandedBackground) != null && (viewGroup.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.expandedBackground.getParent()).removeView(this.expandedBackground);
        }
    }

    public boolean onBackPressed() {
        return false;
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDClose() {
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            moveResizedToDefault();
            return;
        }
        if (mraidStateType == MraidStateType.EXPANDED) {
            moveExpandedToDefault();
            return;
        }
        if (mraidStateType == MraidStateType.DEFAULT) {
            setState(MraidStateType.HIDDEN);
            commandCompleted("close");
        } else {
            fireErrorEvent("close", "Command is not allowed in a given ad state:" + this.state.toString());
            commandCompleted("close");
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onMRAIDUnload() {
        MraidStateType mraidStateType = this.state;
        if (mraidStateType == MraidStateType.RESIZED) {
            moveResizedToDefault(10, true);
        } else if (mraidStateType == MraidStateType.EXPANDED) {
            moveExpandedToDefault(10, true);
        } else {
            new Handler(Looper.getMainLooper()).post(new b(this, 2));
        }
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onPageLoad() {
        try {
            if (!this.pageLoaded) {
                prepareMraid();
                if (DTBMetricsConfiguration.getInstance().isFeatureEnabled("additional_webview_metric", false)) {
                    ApsMetrics.customEvent("bannerCreativeFinished", getAdView().getBidId(), null);
                }
            }
        } catch (Exception e10) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute onPageLoad for Banner", e10);
        }
        this.originalParams = getAdView().getLayoutParams();
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void onResize(Map<String, Object> map) {
        final int iIntValue;
        final int iIntValue2;
        final int iIntValue3;
        final int iIntValue4;
        final boolean zBooleanValue;
        MraidStateType mraidStateType = this.state;
        if (mraidStateType != MraidStateType.DEFAULT && mraidStateType != MraidStateType.RESIZED) {
            fireErrorEvent(MraidResizeCommand.NAME, "invalid current state");
            commandCompleted(MraidResizeCommand.NAME);
            return;
        }
        try {
            iIntValue = map.containsKey("offsetX") ? ((Integer) map.get("offsetX")).intValue() : 0;
            iIntValue2 = map.containsKey("offsetY") ? ((Integer) map.get("offsetY")).intValue() : 0;
            iIntValue3 = ((Integer) map.get("width")).intValue();
            iIntValue4 = ((Integer) map.get("height")).intValue();
            zBooleanValue = ((Boolean) map.get("allowOffscreen")).booleanValue();
        } catch (Exception unused) {
        }
        try {
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.ads.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12513b.lambda$onResize$5(iIntValue, iIntValue2, iIntValue3, iIntValue4, zBooleanValue);
                }
            });
        } catch (Exception unused2) {
            fireErrorEvent(MraidResizeCommand.NAME, "invalid input parameters");
            commandCompleted(MraidResizeCommand.NAME);
        }
    }

    public void openExpanded() {
        setState(MraidStateType.EXPANDED);
    }

    @Override // com.amazon.device.ads.DTBAdMRAIDController
    public void passLoadError() {
        DtbThreadService.executeOnMainThread(new b(this, 0));
    }

    public void setAnimationProgress(float f10) {
        this.animationProgress = f10;
    }

    @Override // com.amazon.device.ads.DTBMRAIDCloseButtonListener
    public void useCustomButtonUpdated() {
        if (this.state != MraidStateType.EXPANDED || this.closeIndicatorRegion == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new b(this, 9));
    }

    private void moveExpandedToDefault(int i10, boolean z10) {
        new Handler(Looper.getMainLooper()).post(new e(z10, this, i10, 1));
    }

    private void moveResizedToDefault(int i10, boolean z10) {
        new Handler(Looper.getMainLooper()).post(new e(z10, this, i10, 0));
    }
}

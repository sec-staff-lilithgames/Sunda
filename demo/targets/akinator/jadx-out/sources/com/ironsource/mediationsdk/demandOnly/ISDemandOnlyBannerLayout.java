package com.ironsource.mediationsdk.demandOnly;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ironsource.C3454t2;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class ISDemandOnlyBannerLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private View f37357a;

    /* renamed from: b, reason: collision with root package name */
    private ISBannerSize f37358b;

    /* renamed from: c, reason: collision with root package name */
    private String f37359c;

    /* renamed from: d, reason: collision with root package name */
    private Activity f37360d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f37361e;

    /* renamed from: f, reason: collision with root package name */
    private C3454t2 f37362f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f37363a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ FrameLayout.LayoutParams f37364b;

        public a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f37363a = view;
            this.f37364b = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            ISDemandOnlyBannerLayout.this.removeAllViews();
            ViewParent parent = this.f37363a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f37363a);
            }
            ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout = ISDemandOnlyBannerLayout.this;
            View view = this.f37363a;
            iSDemandOnlyBannerLayout.f37357a = view;
            iSDemandOnlyBannerLayout.addView(view, 0, this.f37364b);
        }
    }

    public ISDemandOnlyBannerLayout(Activity activity, ISBannerSize iSBannerSize) {
        super(activity);
        this.f37361e = false;
        this.f37360d = activity;
        this.f37358b = iSBannerSize == null ? ISBannerSize.BANNER : iSBannerSize;
        this.f37362f = new C3454t2();
    }

    public Activity getActivity() {
        return this.f37360d;
    }

    public ISDemandOnlyBannerListener getBannerDemandOnlyListener() {
        return this.f37362f.a();
    }

    public View getBannerView() {
        return this.f37357a;
    }

    public C3454t2 getListener() {
        return this.f37362f;
    }

    public String getPlacementName() {
        return this.f37359c;
    }

    public ISBannerSize getSize() {
        return this.f37358b;
    }

    public boolean isDestroyed() {
        return this.f37361e;
    }

    public void removeBannerListener() {
        IronLog.API.info();
        this.f37362f.b((C3454t2) null);
    }

    public void setBannerDemandOnlyListener(ISDemandOnlyBannerListener iSDemandOnlyBannerListener) {
        IronLog.API.info();
        this.f37362f.b((C3454t2) iSDemandOnlyBannerListener);
    }

    public void setPlacementName(String str) {
        this.f37359c = str;
    }

    public void a() {
        this.f37361e = true;
        this.f37360d = null;
        this.f37358b = null;
        this.f37359c = null;
        this.f37357a = null;
        removeBannerListener();
    }

    private ISDemandOnlyBannerLayout(Context context) {
        super(context);
        this.f37361e = false;
    }

    public void a(View view, FrameLayout.LayoutParams layoutParams) {
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(view, layoutParams));
    }
}

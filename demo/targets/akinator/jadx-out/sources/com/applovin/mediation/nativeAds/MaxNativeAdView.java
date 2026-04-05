package com.applovin.mediation.nativeAds;

import a2.s;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.a3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class MaxNativeAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f16445a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f16446b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f16447c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f16448d;

    /* renamed from: e, reason: collision with root package name */
    private final Button f16449e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f16450f;

    /* renamed from: g, reason: collision with root package name */
    private final FrameLayout f16451g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f16452h;

    /* renamed from: i, reason: collision with root package name */
    private final FrameLayout f16453i;

    /* renamed from: j, reason: collision with root package name */
    private final ViewGroup f16454j;

    /* renamed from: k, reason: collision with root package name */
    private final ViewGroup f16455k;

    /* renamed from: l, reason: collision with root package name */
    private final FrameLayout f16456l;

    /* renamed from: m, reason: collision with root package name */
    private b f16457m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f16458a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f16459b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f16458a = weakReference;
            this.f16459b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f16458a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                k.D0.O();
                if (o.a()) {
                    k.D0.O().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f16458a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f16459b.getLayoutParams();
            layoutParams.height = ((View) this.f16459b.getParent()).getWidth();
            this.f16459b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public b getAdViewTracker() {
        return this.f16457m;
    }

    public TextView getAdvertiserTextView() {
        return this.f16447c;
    }

    public TextView getBodyTextView() {
        return this.f16448d;
    }

    public Button getCallToActionButton() {
        return this.f16449e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f16446b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f16447c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f16448d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f16449e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f16450f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f16451g;
    }

    public ImageView getIconImageView() {
        return this.f16450f;
    }

    public View getMainView() {
        return this.f16445a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f16456l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f16455k;
        return viewGroup != null ? viewGroup : this.f16456l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f16453i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f16452h;
        return viewGroup != null ? viewGroup : this.f16453i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f16454j;
    }

    public TextView getTitleTextView() {
        return this.f16446b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f16457m;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        o.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f16457m;
        if (bVar != null) {
            bVar.a();
            this.f16457m = null;
        }
        View view = this.f16445a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f16445a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f16445a);
    }

    public void render(a3 a3Var, a.InterfaceC0034a interfaceC0034a, k kVar) {
        recycle();
        if (!a3Var.p0().get() || !a3Var.o0().get()) {
            this.f16457m = new b(a3Var, this, interfaceC0034a, kVar);
        }
        MaxNativeAd nativeAd = a3Var.getNativeAd();
        if (a3Var.q0() && nativeAd.isContainerClickable()) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new com.applovin.mediation.nativeAds.a(nativeAd, 0));
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException(a.b.k("Attempting to render MAX native ad with invalid template: ", str));
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f16446b.setText(maxNativeAd.getTitle());
        } else {
            this.f16446b.setVisibility(8);
        }
        if (this.f16447c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f16447c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f16447c.setVisibility(8);
            }
        }
        if (this.f16448d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f16448d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f16448d.setVisibility(8);
            } else {
                this.f16448d.setVisibility(4);
            }
        }
        if (this.f16449e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f16449e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f16449e.setVisibility(8);
            } else {
                this.f16449e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f16451g;
        if (frameLayout != null) {
            if (icon == null || this.f16450f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f16451g.removeAllViews();
                    this.f16451g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f16450f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f16451g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f16450f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f16453i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f16453i.addView(optionsView);
            this.f16453i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f16456l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f16456l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f16456l.setVisibility(8);
            }
        }
        if (this.f16454j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f16454j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f16454j.addView(appLovinStarRatingView);
            } else {
                this.f16454j.setVisibility(8);
            }
        }
        b();
        postDelayed(new s(this, 17), 2000L);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        this(maxNativeAd, new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(R.id.applovin_native_media_content_view).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iA;
        super(context);
        boolean z10 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f16445a = view;
        } else {
            if (z10) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f16445a = LayoutInflater.from(context).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f16445a);
        this.f16446b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f16447c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f16448d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f16449e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f16450f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f16451g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f16452h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f16453i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f16454j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f16455k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f16456l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            b(maxNativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f16446b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f16448d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f16447c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f16449e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f16450f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f16450f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f16450f, icon.getUri());
                } else {
                    this.f16450f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f16455k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f16455k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f16452h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f16452h.addView(optionsView);
                this.f16452h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f16454j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f16454j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}

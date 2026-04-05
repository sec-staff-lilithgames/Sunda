package com.vungle.ads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.NativeAd;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.ViewUtility;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class NativeAdOptionsView extends FrameLayout {
    private static final int AD_OPTIONS_VIEW_SIZE = 20;
    public static final Companion Companion = new Companion(null);
    private ImageView icon;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Companion {
        public /* synthetic */ Companion(u uVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.icon = new ImageView(context);
        int iDpToPixels = ViewUtility.INSTANCE.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        ImageView imageView = this.icon;
        ImageView imageView2 = null;
        if (imageView == null) {
            e0.throwUninitializedPropertyAccessException("icon");
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView3 = this.icon;
        if (imageView3 == null) {
            e0.throwUninitializedPropertyAccessException("icon");
        } else {
            imageView2 = imageView3;
        }
        addView(imageView2);
    }

    public final void destroy() {
        try {
            ImageView imageView = this.icon;
            if (imageView == null) {
                e0.throwUninitializedPropertyAccessException("icon");
                imageView = null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            Logger.Companion.w("NativeAd", "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView2 = this.icon;
        if (imageView2 == null) {
            e0.throwUninitializedPropertyAccessException("icon");
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        removeAllViews();
        if (getParent() != null) {
            ViewParent parent = getParent();
            e0.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.icon;
        if (imageView != null) {
            return imageView;
        }
        e0.throwUninitializedPropertyAccessException("icon");
        return null;
    }

    public final void renderTo(FrameLayout rootView, @NativeAd.AdOptionsPosition int i10) {
        e0.checkNotNullParameter(rootView, "rootView");
        if (getParent() != null) {
            ViewParent parent = getParent();
            e0.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(this);
        }
        rootView.addView(this);
        ViewUtility viewUtility = ViewUtility.INSTANCE;
        Context context = getContext();
        e0.checkNotNullExpressionValue(context, "context");
        int iDpToPixels = viewUtility.dpToPixels(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels);
        if (i10 == 0) {
            layoutParams.gravity = 8388659;
        } else if (i10 == 1) {
            layoutParams.gravity = 8388661;
        } else if (i10 == 2) {
            layoutParams.gravity = 8388691;
        } else if (i10 != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        rootView.requestLayout();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdOptionsView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
        initView(context);
    }
}

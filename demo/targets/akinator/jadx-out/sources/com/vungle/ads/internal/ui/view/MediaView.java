package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import b0.e2;
import com.bytedance.sdk.openadsdk.component.zz.Qnp.PtLatqAYjEFT;
import com.vungle.ads.internal.util.Logger;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class MediaView extends RelativeLayout {
    private ImageView imageView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context) {
        super(context);
        e0.checkNotNullParameter(context, "context");
        initView(context);
    }

    private final void initView(Context context) {
        this.imageView = new ImageView(context);
        RelativeLayout.LayoutParams layoutParamsE = e2.e(-1, -1, 13);
        ImageView imageView = this.imageView;
        ImageView imageView2 = null;
        if (imageView == null) {
            e0.throwUninitializedPropertyAccessException("imageView");
            imageView = null;
        }
        imageView.setLayoutParams(layoutParamsE);
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            e0.throwUninitializedPropertyAccessException("imageView");
            imageView3 = null;
        }
        imageView3.setAdjustViewBounds(true);
        ImageView imageView4 = this.imageView;
        if (imageView4 == null) {
            e0.throwUninitializedPropertyAccessException("imageView");
        } else {
            imageView2 = imageView4;
        }
        addView(imageView2);
        requestLayout();
    }

    public final void destroy() {
        ImageView imageView = null;
        try {
            ImageView imageView2 = this.imageView;
            if (imageView2 == null) {
                e0.throwUninitializedPropertyAccessException("imageView");
                imageView2 = null;
            }
            Drawable drawable = imageView2.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e10) {
            Logger.Companion.w("NativeAd", "error msg: " + e10.getLocalizedMessage());
        }
        ImageView imageView3 = this.imageView;
        if (imageView3 == null) {
            e0.throwUninitializedPropertyAccessException("imageView");
            imageView3 = null;
        }
        imageView3.setImageDrawable(null);
        ImageView imageView4 = this.imageView;
        if (imageView4 == null) {
            e0.throwUninitializedPropertyAccessException("imageView");
            imageView4 = null;
        }
        if (imageView4.getParent() != null) {
            ImageView imageView5 = this.imageView;
            if (imageView5 == null) {
                e0.throwUninitializedPropertyAccessException("imageView");
                imageView5 = null;
            }
            ViewParent parent = imageView5.getParent();
            e0.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            ImageView imageView6 = this.imageView;
            if (imageView6 == null) {
                e0.throwUninitializedPropertyAccessException("imageView");
            } else {
                imageView = imageView6;
            }
            viewGroup.removeView(imageView);
        }
    }

    public final ImageView getMainImage$vungle_ads_release() {
        ImageView imageView = this.imageView;
        if (imageView != null) {
            return imageView;
        }
        e0.throwUninitializedPropertyAccessException(PtLatqAYjEFT.BkdrZ);
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e0.checkNotNullParameter(context, "context");
        initView(context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        e0.checkNotNullParameter(context, "context");
        initView(context);
    }
}

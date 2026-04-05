package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.w9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3056w9 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    public final String f33536a;

    /* renamed from: b, reason: collision with root package name */
    public C3039v9 f33537b;

    /* renamed from: c, reason: collision with root package name */
    public ImageView f33538c;

    /* renamed from: d, reason: collision with root package name */
    public ProgressBar f33539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3056w9(Context context) {
        super(context);
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f33536a = "w9";
        Context context2 = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context2, "getContext(...)");
        setVideoView(new C3039v9(context2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(getVideoView(), layoutParams);
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.setVisibility(8);
        setPosterImage(imageView);
        addView(getPosterImage(), layoutParams);
        ProgressBar progressBar = new ProgressBar(getContext());
        progressBar.setVisibility(8);
        setProgressBar(progressBar);
        addView(getProgressBar(), b0.e2.e(-2, -2, 13));
        Context context3 = getContext();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(context3, "getContext(...)");
        C2921o9 c2921o9 = new C2921o9(context3, null, 0);
        ViewGroup.LayoutParams layoutParamsE = b0.e2.e(-1, -1, 13);
        getVideoView().setMediaController(c2921o9);
        addView(c2921o9, layoutParamsE);
    }

    public final ImageView getPosterImage() {
        ImageView imageView = this.f33538c;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("posterImage");
        return null;
    }

    public final ProgressBar getProgressBar() {
        ProgressBar progressBar = this.f33539d;
        if (progressBar != null) {
            return progressBar;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("progressBar");
        return null;
    }

    public final C3039v9 getVideoView() {
        C3039v9 c3039v9 = this.f33537b;
        if (c3039v9 != null) {
            return c3039v9;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("videoView");
        return null;
    }

    public final void setPosterImage(ImageView imageView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(imageView, "<set-?>");
        this.f33538c = imageView;
    }

    public final void setProgressBar(ProgressBar progressBar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(progressBar, "<set-?>");
        this.f33539d = progressBar;
    }

    public final void setVideoView(C3039v9 c3039v9) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c3039v9, "<set-?>");
        this.f33537b = c3039v9;
    }

    public final void setPosterImage(Bitmap bitmap) {
        getPosterImage().setImageBitmap(bitmap);
    }
}

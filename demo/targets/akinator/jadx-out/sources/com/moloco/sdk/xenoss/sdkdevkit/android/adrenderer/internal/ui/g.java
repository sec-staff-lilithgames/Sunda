package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.digidust.elokence.akinator.freemium.R;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class g extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 f48590b;

    /* renamed from: c, reason: collision with root package name */
    public final ImageButton f48591c;

    /* renamed from: e, reason: collision with root package name */
    public kv.l f48592e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, Context context) {
        this(externalLinkHandler, context, null, 0, 12, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    public static final void a(g gVar, View view) {
        gVar.f48590b.a("https://cdn-f.adsmoloco.com/moloco-cdn/privacy.html");
    }

    public final ImageButton getAdButton() {
        return this.f48591c;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            float f10 = getResources().getDisplayMetrics().density;
            ImageButton imageButton = this.f48591c;
            imageButton.getLocationOnScreen(new int[2]);
            a.c cVar = new a.c(a.c.EnumC0490a.f50254k, new a.f(r6[0] / f10, r6[1] / f10), new a.g(imageButton.getWidth() / f10, imageButton.getHeight() / f10));
            kv.l lVar = this.f48592e;
            if (lVar != null) {
                lVar.invoke(cVar);
            }
        }
    }

    public final void setOnButtonRenderedListener(kv.l listener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(listener, "listener");
        this.f48592e = listener;
    }

    public final void setPrivacyUrl(String url) {
        kotlin.jvm.internal.e0.checkNotNullParameter(url, "url");
        this.f48591c.setOnClickListener(new f(0, this, url));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, Context context, AttributeSet attributeSet) {
        this(externalLinkHandler, context, attributeSet, 0, 8, null);
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
    }

    public static final void a(g gVar, String str, View view) {
        gVar.f48590b.a(str);
    }

    public /* synthetic */ g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 e0Var, Context context, AttributeSet attributeSet, int i10, int i11, kotlin.jvm.internal.u uVar) {
        this(e0Var, context, (i11 & 4) != 0 ? null : attributeSet, (i11 & 8) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.e0 externalLinkHandler, Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        kotlin.jvm.internal.e0.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f48590b = externalLinkHandler;
        ImageButton imageButton = new ImageButton(context);
        imageButton.setLayoutParams(new FrameLayout.LayoutParams(h.a(12, context), h.a(12, context)));
        imageButton.setImageResource(R.drawable.info_badge);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setClipToOutline(true);
        imageButton.setBackground(null);
        imageButton.setOnClickListener(new com.applovin.mediation.nativeAds.a(this, 7));
        this.f48591c = imageButton;
        addView(imageButton);
        imageButton.setContentDescription("Ad Badge");
        imageButton.setTag("Ad Badge");
    }
}

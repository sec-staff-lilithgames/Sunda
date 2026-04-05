package com.applovin.impl.sdk.nativeAd;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.applovin.impl.h7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class AppLovinOptionsView extends FrameLayout implements View.OnClickListener {
    private final Uri privacyDestinationUri;
    private final k sdk;

    public AppLovinOptionsView(AppLovinNativeAdImpl appLovinNativeAdImpl, k kVar, Context context) {
        super(context);
        this.sdk = kVar;
        this.privacyDestinationUri = appLovinNativeAdImpl.getPrivacyDestinationUri();
        ImageView imageView = new ImageView(getContext());
        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        Uri privacyIconUri = appLovinNativeAdImpl.getPrivacyIconUri();
        if (privacyIconUri != null) {
            ImageViewUtils.setImageUri(imageView, privacyIconUri, kVar);
        } else {
            imageView.setImageResource(R.drawable.applovin_ic_privacy_icon_layered_list);
        }
        addView(imageView);
        setOnClickListener(this);
    }

    public void destroy() {
        setOnClickListener(null);
        removeAllViews();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        h7.a(this.privacyDestinationUri, k.o(), this.sdk);
    }
}

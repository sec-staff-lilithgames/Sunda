package com.facebook.ads.internal.api;

import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.MediaView;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface NativeBannerAdApi {
    void registerViewForInteraction(View view, ImageView imageView);

    void registerViewForInteraction(View view, ImageView imageView, List<View> list);

    void registerViewForInteraction(View view, MediaView mediaView);

    void registerViewForInteraction(View view, MediaView mediaView, List<View> list);
}

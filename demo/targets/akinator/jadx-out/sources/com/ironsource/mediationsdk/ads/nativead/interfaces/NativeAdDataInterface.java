package com.ironsource.mediationsdk.ads.nativead.interfaces;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface NativeAdDataInterface {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class Image {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable f37284a;

        /* renamed from: b, reason: collision with root package name */
        private final Uri f37285b;

        public Image(Drawable drawable, Uri uri) {
            this.f37284a = drawable;
            this.f37285b = uri;
        }

        public final Drawable getDrawable() {
            return this.f37284a;
        }

        public final Uri getUri() {
            return this.f37285b;
        }
    }

    String getAdvertiser();

    String getBody();

    String getCallToAction();

    Image getIcon();

    String getTitle();
}

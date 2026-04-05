package com.applovin.impl.sdk.utils;

import android.net.Uri;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f15698b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Uri f15699c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ImageView f15700e;

    public /* synthetic */ a(Uri uri, ImageView imageView) {
        this.f15698b = 1;
        this.f15699c = uri;
        this.f15700e = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15698b) {
            case 0:
                ImageViewUtils.b(this.f15700e, this.f15699c);
                break;
            case 1:
                ImageViewUtils.a(this.f15699c, this.f15700e);
                break;
            default:
                ImageViewUtils.setAndDownscaleBitmap(this.f15700e, this.f15699c);
                break;
        }
    }

    public /* synthetic */ a(ImageView imageView, Uri uri, int i10) {
        this.f15698b = i10;
        this.f15700e = imageView;
        this.f15699c = uri;
    }
}

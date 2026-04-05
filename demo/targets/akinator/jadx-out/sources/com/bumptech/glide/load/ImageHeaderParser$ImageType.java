package com.bumptech.glide.load;

import n8.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public enum ImageHeaderParser$ImageType {
    GIF(true),
    JPEG(false),
    RAW(false),
    PNG_A(true),
    PNG(false),
    WEBP_A(true),
    WEBP(false),
    ANIMATED_WEBP(true),
    AVIF(true),
    ANIMATED_AVIF(true),
    UNKNOWN(false);


    /* renamed from: b, reason: collision with root package name */
    public final boolean f16582b;

    ImageHeaderParser$ImageType(boolean z10) {
        this.f16582b = z10;
    }

    public boolean hasAlpha() {
        return this.f16582b;
    }

    public boolean isWebp() {
        int i10 = f.f75838a[ordinal()];
        return i10 == 1 || i10 == 2 || i10 == 3;
    }
}

package io.bidmachine.media3.exoplayer.image;

import android.graphics.Bitmap;
import wn.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public interface ImageOutput {

    /* renamed from: a, reason: collision with root package name */
    public static final h f61275a = new h();

    void onDisabled();

    void onImageAvailable(long j10, Bitmap bitmap);
}

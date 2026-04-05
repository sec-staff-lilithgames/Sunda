package com.inmobi.media;

import android.content.Context;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.y9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC3090y9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f33605a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f33606b;

    public RunnableC3090y9(Context context, ImageView imageView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.e0.checkNotNullParameter(imageView, "imageView");
        this.f33605a = new WeakReference(context);
        this.f33606b = new WeakReference(imageView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = (Context) this.f33605a.get();
        ImageView imageView = (ImageView) this.f33606b.get();
        if (context == null || imageView == null) {
            return;
        }
        HashMap map = N9.f32067c;
        C3073x9.a(context, imageView);
    }
}

package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Z0 implements O4 {

    /* renamed from: a, reason: collision with root package name */
    public final AnimatedImageDrawable f32588a;

    public Z0(String filePath) throws IOException {
        kotlin.jvm.internal.e0.checkNotNullParameter(filePath, "filePath");
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(new File(filePath)));
        kotlin.jvm.internal.e0.checkNotNull(drawableDecodeDrawable, "null cannot be cast to non-null type android.graphics.drawable.AnimatedImageDrawable");
        this.f32588a = com.bytedance.adsdk.ugeno.zz.cm.a.b(drawableDecodeDrawable);
    }

    @Override // com.inmobi.media.O4
    public final void a(Q4 q42) {
    }

    @Override // com.inmobi.media.O4
    public final boolean b() {
        return this.f32588a.isRunning();
    }

    @Override // com.inmobi.media.O4
    public final int c() {
        return this.f32588a.getIntrinsicWidth();
    }

    public final void e() {
        this.f32588a.start();
    }

    @Override // com.inmobi.media.O4
    public final void start() {
        this.f32588a.registerAnimationCallback(new Y0(this));
        this.f32588a.start();
    }

    @Override // com.inmobi.media.O4
    public final void a(boolean z10) {
    }

    @Override // com.inmobi.media.O4
    public final int a() {
        return this.f32588a.getIntrinsicHeight();
    }

    @Override // com.inmobi.media.O4
    public final void a(Canvas canvas, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNull(canvas);
        canvas.translate(f10, f11);
        this.f32588a.draw(canvas);
    }

    @Override // com.inmobi.media.O4
    public final void d() {
    }
}

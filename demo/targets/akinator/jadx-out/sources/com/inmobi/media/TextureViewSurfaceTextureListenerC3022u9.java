package com.inmobi.media;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.u9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class TextureViewSurfaceTextureListenerC3022u9 implements TextureView.SurfaceTextureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3039v9 f33448a;

    public TextureViewSurfaceTextureListenerC3022u9(C3039v9 c3039v9) {
        this.f33448a = c3039v9;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture texture, int i10, int i11) throws IllegalStateException, IllegalArgumentException {
        kotlin.jvm.internal.e0.checkNotNullParameter(texture, "texture");
        this.f33448a.f33486b = new Surface(texture);
        this.f33448a.e();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture texture) {
        kotlin.jvm.internal.e0.checkNotNullParameter(texture, "texture");
        Surface surface = this.f33448a.f33486b;
        if (surface != null) {
            surface.release();
        }
        C3039v9 c3039v9 = this.f33448a;
        c3039v9.f33486b = null;
        C2921o9 c2921o9 = c3039v9.f33498n;
        if (c2921o9 != null) {
            c2921o9.c();
        }
        this.f33448a.g();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surface, int i10, int i11) throws IllegalStateException {
        Q8 q82;
        kotlin.jvm.internal.e0.checkNotNullParameter(surface, "surface");
        Q8 mediaPlayer = this.f33448a.getMediaPlayer();
        boolean z10 = false;
        boolean z11 = mediaPlayer != null && mediaPlayer.f32169b == 3;
        if (i10 > 0 && i11 > 0) {
            z10 = true;
        }
        if (z11 && z10) {
            Object tag = this.f33448a.getTag();
            if (tag instanceof C2887m9) {
                Object obj = ((C2887m9) tag).f33155t.get("seekPosition");
                kotlin.jvm.internal.e0.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue != 0) {
                    C3039v9 c3039v9 = this.f33448a;
                    if (c3039v9.a() && (q82 = c3039v9.f33487c) != null) {
                        q82.seekTo(iIntValue);
                    }
                }
            }
            this.f33448a.start();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture texture) {
        kotlin.jvm.internal.e0.checkNotNullParameter(texture, "texture");
    }
}

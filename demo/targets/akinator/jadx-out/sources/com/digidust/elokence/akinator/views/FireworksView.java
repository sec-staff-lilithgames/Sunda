package com.digidust.elokence.akinator.views;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import ka.e;
import pa.a;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class FireworksView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: b, reason: collision with root package name */
    public e f21819b;

    /* renamed from: c, reason: collision with root package name */
    public a f21820c;

    /* renamed from: e, reason: collision with root package name */
    public Context f21821e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21822f;

    public FireworksView(Context context) {
        super(context);
        this.f21822f = false;
        a(context);
    }

    public final void a(Context context) {
        this.f21819b = new e();
        this.f21820c = new a(this, this.f21819b);
        setSurfaceTextureListener(this);
        this.f21821e = context;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f21820c.setSurfaceSize(i10, i11);
        if (this.f21822f) {
            return;
        }
        this.f21819b.setRatioYX(i11 / i10);
        this.f21820c.setRunning(true);
        this.f21820c.start();
        this.f21822f = true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) throws InterruptedException {
        this.f21820c.setRunning(false);
        try {
            this.f21820c.join();
            return true;
        } catch (InterruptedException e10) {
            Timber.tag("FireworksView").e(e10, "Error stopping fireworks thread", new Object[0]);
            return true;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f21820c.setSurfaceSize(i10, i11);
    }

    public void stopAnimation() {
        this.f21820c.setRunning(false);
    }

    public FireworksView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21822f = false;
        a(context);
    }

    public FireworksView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f21822f = false;
        a(context);
    }

    public FireworksView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f21822f = false;
        a(context);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

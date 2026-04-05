package com.bykv.vk.openvk.jpo.jpo.jpo.jj;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends TextureView implements TextureView.SurfaceTextureListener, jd {

    /* renamed from: jd, reason: collision with root package name */
    private jd.jpo f16737jd;
    private jpo jpo;

    public cm(Context context) {
        this(context, null);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd
    public void jpo(jpo jpoVar) {
        this.jpo = jpoVar;
        setSurfaceTextureListener(this);
    }

    @Override // android.view.TextureView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            jpoVar.jpo(surfaceTexture, i10, i11);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        jpo jpoVar = this.jpo;
        if (jpoVar != null) {
            return jpoVar.jpo(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
    }

    public void setWindowVisibilityChangedListener(jd.jpo jpoVar) {
        this.f16737jd = jpoVar;
    }

    public cm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd
    public void jpo(int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i11;
        layoutParams.width = i10;
        setLayoutParams(layoutParams);
    }

    @Override // com.bykv.vk.openvk.jpo.jpo.jpo.jj.jd
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
    }
}

package com.digidust.elokence.akinator.paid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.graphic.camera.AutoFitTextureView;
import h6.a;
import h6.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class LayoutCameraBinding implements a {
    public final AutoFitTextureView frontCamTexture;
    public final RelativeLayout rootContainer;
    private final FrameLayout rootView;

    private LayoutCameraBinding(FrameLayout frameLayout, AutoFitTextureView autoFitTextureView, RelativeLayout relativeLayout) {
        this.rootView = frameLayout;
        this.frontCamTexture = autoFitTextureView;
        this.rootContainer = relativeLayout;
    }

    public static LayoutCameraBinding bind(View view) {
        int i10 = R.id.frontCamTexture;
        AutoFitTextureView autoFitTextureView = (AutoFitTextureView) b.findChildViewById(view, R.id.frontCamTexture);
        if (autoFitTextureView != null) {
            i10 = R.id.root_container;
            RelativeLayout relativeLayout = (RelativeLayout) b.findChildViewById(view, R.id.root_container);
            if (relativeLayout != null) {
                return new LayoutCameraBinding((FrameLayout) view, autoFitTextureView, relativeLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static LayoutCameraBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static LayoutCameraBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.layout_camera, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // h6.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}

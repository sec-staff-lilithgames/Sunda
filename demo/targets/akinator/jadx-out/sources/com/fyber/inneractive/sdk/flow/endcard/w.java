package com.fyber.inneractive.sdk.flow.endcard;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w extends a {

    /* renamed from: c, reason: collision with root package name */
    public Bitmap f23633c;

    /* renamed from: d, reason: collision with root package name */
    public final ImageView f23634d;

    /* renamed from: e, reason: collision with root package name */
    public final ViewGroup f23635e;

    public w(v vVar) {
        super(vVar);
        ImageView imageView = new ImageView(IAConfigManager.O.f23227v.a());
        imageView.setId(R.id.ia_inneractive_vast_endcard_static);
        this.f23634d = imageView;
        this.f23635e = a.a(imageView);
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.n
    public final View b() {
        return this.f23635e;
    }

    @Override // com.fyber.inneractive.sdk.flow.endcard.a, com.fyber.inneractive.sdk.flow.endcard.n
    public final void destroy() {
        com.fyber.inneractive.sdk.util.v.a(b());
        Bitmap bitmap = this.f23633c;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.f23633c = null;
        this.f23634d.setImageBitmap(null);
    }
}

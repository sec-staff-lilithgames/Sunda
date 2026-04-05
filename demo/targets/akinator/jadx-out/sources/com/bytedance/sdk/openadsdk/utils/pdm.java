package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zz.cm.a;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class pdm implements com.bytedance.sdk.component.my.hna {
    private final WeakReference<ImageView> jpo;

    public pdm(ImageView imageView) {
        this.jpo = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.my.hna
    public void jpo(com.bytedance.sdk.component.my.ju juVar) {
        ImageView imageView = this.jpo.get();
        if (imageView == null) {
            return;
        }
        try {
            Object objJd = juVar.jd();
            if (objJd instanceof Bitmap) {
                imageView.setImageBitmap((Bitmap) objJd);
                return;
            }
            if (!(objJd instanceof Drawable)) {
                imageView.setVisibility(8);
                return;
            }
            if (Build.VERSION.SDK_INT >= 28 && a.d(objJd)) {
                a.b(objJd).start();
            }
            imageView.setImageDrawable((Drawable) objJd);
        } catch (Throwable unused) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.component.my.hna
    public void jpo(int i10, String str, Throwable th2) {
        ImageView imageView = this.jpo.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}

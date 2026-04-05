package com.bytedance.sdk.openadsdk.zz;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.zz.cm.a;
import com.bytedance.sdk.component.my.hna;
import com.bytedance.sdk.component.my.ju;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.utils.duq;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx implements hna {

    /* renamed from: jd, reason: collision with root package name */
    private final String f21676jd = "ImageLoaderToViewWrapper";
    private final WeakReference<ImageView> jpo;
    private hna wqx;

    private wqx(ImageView imageView, hna hnaVar) {
        this.jpo = new WeakReference<>(imageView);
        this.wqx = hnaVar;
    }

    public static hna jpo(dt dtVar, String str, ImageView imageView) {
        return new jd(dtVar, str, new wqx(imageView));
    }

    public static hna jpo(dt dtVar, String str, ImageView imageView, hna hnaVar) {
        return new jd(dtVar, str, new wqx(imageView, hnaVar));
    }

    private wqx(ImageView imageView) {
        this.jpo = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.my.hna
    public void jpo(ju juVar) {
        final ImageView imageView = this.jpo.get();
        if (imageView != null) {
            final Object objJd = juVar.jd();
            if (objJd instanceof Bitmap) {
                if (duq.jj()) {
                    imageView.setImageBitmap((Bitmap) objJd);
                } else {
                    oya.wqx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zz.wqx.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap((Bitmap) objJd);
                        }
                    });
                }
                hna hnaVar = this.wqx;
                if (hnaVar != null) {
                    hnaVar.jpo(juVar);
                    return;
                }
                return;
            }
            if (objJd instanceof Drawable) {
                if (duq.jj()) {
                    jpo(objJd, imageView);
                } else {
                    oya.wqx().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zz.wqx.2
                        @Override // java.lang.Runnable
                        public void run() {
                            wqx.this.jpo(objJd, imageView);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(Object obj, ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 28 && a.d(obj)) {
            a.b(obj).start();
        }
        imageView.setImageDrawable((Drawable) obj);
    }

    @Override // com.bytedance.sdk.component.my.hna
    public void jpo(int i10, String str, Throwable th2) {
        hna hnaVar = this.wqx;
        if (hnaVar != null) {
            hnaVar.jpo(i10, str, th2);
        }
    }
}

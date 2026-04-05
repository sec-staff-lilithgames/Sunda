package com.bytedance.adsdk.jd.jd;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.jd.cm;
import com.bytedance.adsdk.jd.jj.jj;
import com.bytedance.adsdk.jd.yd;
import java.io.IOException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static final Object jpo = new Object();

    /* renamed from: cm, reason: collision with root package name */
    private cm f17234cm;

    /* renamed from: jd, reason: collision with root package name */
    private final Context f17235jd;
    private final Map<String, yd> my;
    private final String wqx;

    public jd(Drawable.Callback callback, String str, cm cmVar, Map<String, yd> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.wqx = str;
        } else {
            this.wqx = str.concat("/");
        }
        this.my = map;
        jpo(cmVar);
        if (callback instanceof View) {
            this.f17235jd = ((View) callback).getContext().getApplicationContext();
        } else {
            this.f17235jd = null;
        }
    }

    private Bitmap jd(String str, Bitmap bitmap) {
        synchronized (jpo) {
            this.my.get(str).jpo(bitmap);
        }
        return bitmap;
    }

    public void jpo(cm cmVar) {
        this.f17234cm = cmVar;
    }

    public Bitmap jpo(String str, Bitmap bitmap) {
        if (bitmap != null) {
            Bitmap bitmapJu = this.my.get(str).ju();
            jd(str, bitmap);
            return bitmapJu;
        }
        yd ydVar = this.my.get(str);
        Bitmap bitmapJu2 = ydVar.ju();
        ydVar.jpo(null);
        return bitmapJu2;
    }

    public Bitmap jpo(String str) {
        yd ydVar = this.my.get(str);
        if (ydVar == null) {
            return null;
        }
        Bitmap bitmapJu = ydVar.ju();
        if (bitmapJu != null) {
            return bitmapJu;
        }
        cm cmVar = this.f17234cm;
        if (cmVar != null) {
            return cmVar.jpo(ydVar);
        }
        Context context = this.f17235jd;
        if (context == null) {
            return null;
        }
        String strZz = ydVar.zz();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (strZz.startsWith("data:") && strZz.indexOf("base64,") > 0) {
            try {
                byte[] bArrDecode = Base64.decode(strZz.substring(strZz.indexOf(44) + 1), 0);
                return jd(str, BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (!TextUtils.isEmpty(this.wqx)) {
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.wqx + strZz), null, options);
                    if (bitmapDecodeStream == null) {
                        return null;
                    }
                    return jd(str, jj.jpo(bitmapDecodeStream, ydVar.jpo(), ydVar.jd()));
                } catch (IllegalArgumentException unused2) {
                    return null;
                }
            }
            throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean jpo(Context context) {
        return (context == null && this.f17235jd == null) || this.f17235jd.equals(context);
    }
}

package com.bytedance.sdk.component.adexpress.jj;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import j1.o2;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class yd extends com.bytedance.adsdk.jd.jj {

    /* renamed from: jd, reason: collision with root package name */
    private String f18502jd;
    private Map<String, Bitmap> jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements com.bytedance.sdk.component.my.hna {

        /* renamed from: cm, reason: collision with root package name */
        private final Map<String, Bitmap> f18504cm;

        /* renamed from: jd, reason: collision with root package name */
        private final com.bytedance.adsdk.jd.yd f18505jd;
        private final WeakReference<yd> jpo;
        private final String wqx;

        public jpo(yd ydVar, com.bytedance.adsdk.jd.yd ydVar2, String str, Map<String, Bitmap> map) {
            this.jpo = new WeakReference<>(ydVar);
            this.f18505jd = ydVar2;
            this.wqx = str;
            this.f18504cm = map;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(com.bytedance.sdk.component.my.ju juVar) {
            Object objJd = juVar.jd();
            if (objJd instanceof Bitmap) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap((Bitmap) objJd, this.f18505jd.jpo(), this.f18505jd.jd(), false);
                this.f18504cm.put(this.wqx, bitmapCreateScaledBitmap);
                yd ydVar = this.jpo.get();
                if (ydVar != null) {
                    ydVar.jpo(this.f18505jd.xyk(), bitmapCreateScaledBitmap);
                }
            }
        }
    }

    public yd(Context context) {
        super(context);
        this.jpo = new HashMap();
    }

    public void setImageLottieTosPath(String str) {
        this.f18502jd = str;
    }

    public void xyk() {
        if (TextUtils.isEmpty(this.f18502jd)) {
            return;
        }
        setProgress(0.0f);
        jpo(true);
        setAnimationFromUrl(this.f18502jd);
        setImageAssetDelegate(new com.bytedance.adsdk.jd.cm() { // from class: com.bytedance.sdk.component.adexpress.jj.yd.1
            @Override // com.bytedance.adsdk.jd.cm
            public Bitmap jpo(final com.bytedance.adsdk.jd.yd ydVar) {
                final String strXyk = ydVar.xyk();
                String strYd = ydVar.yd();
                String strZz = ydVar.zz();
                if (TextUtils.equals(strXyk, "image_0") && TextUtils.equals(strZz, "Lark20201123-180048_2.png")) {
                    strZz = "hand.png";
                }
                Bitmap bitmap = (Bitmap) yd.this.jpo.get(strXyk);
                if (bitmap != null) {
                    return bitmap;
                }
                if (TextUtils.isEmpty(strYd) || !TextUtils.isEmpty(strZz)) {
                    strYd = (TextUtils.isEmpty(strZz) || !TextUtils.isEmpty(strYd)) ? (TextUtils.isEmpty(strZz) || TextUtils.isEmpty(strYd)) ? "" : o2.l(strYd, strZz) : strZz;
                }
                if (TextUtils.isEmpty(strYd)) {
                    return null;
                }
                com.bytedance.sdk.component.my.yd ydVarJpo = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().my().jpo(strYd).wqx(2).jpo(new com.bytedance.sdk.component.my.xyk() { // from class: com.bytedance.sdk.component.adexpress.jj.yd.1.1
                    @Override // com.bytedance.sdk.component.my.xyk
                    public Bitmap jpo(Bitmap bitmap2) {
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ydVar.jpo(), ydVar.jd(), false);
                        yd.this.jpo.put(strXyk, bitmapCreateScaledBitmap);
                        return bitmapCreateScaledBitmap;
                    }
                });
                yd ydVar2 = yd.this;
                ydVarJpo.jpo(new jpo(ydVar2, ydVar, strXyk, ydVar2.jpo));
                return (Bitmap) yd.this.jpo.get(strXyk);
            }
        });
        jpo();
    }

    public void setAnimationsLoop(boolean z10) {
    }

    public void setData(Map<String, String> map) {
    }

    public void setLottieAdDescMaxLength(int i10) {
    }

    public void setLottieAdTitleMaxLength(int i10) {
    }

    public void setLottieAppNameMaxLength(int i10) {
    }
}

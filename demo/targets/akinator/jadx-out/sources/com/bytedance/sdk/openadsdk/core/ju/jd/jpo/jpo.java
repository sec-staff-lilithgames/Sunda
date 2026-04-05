package com.bytedance.sdk.openadsdk.core.ju.jd.jpo;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.jd.cm;
import com.bytedance.adsdk.jd.yd;
import com.bytedance.adsdk.ugeno.jd.wqx;
import com.bytedance.adsdk.ugeno.jpo;
import com.bytedance.adsdk.ugeno.my;
import com.bytedance.adsdk.ugeno.qk.xyk;
import java.util.HashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends wqx<jd> {

    /* renamed from: as, reason: collision with root package name */
    private boolean f20481as;
    private boolean czp;
    protected ImageView.ScaleType ez;

    /* renamed from: gf, reason: collision with root package name */
    protected HashMap<String, Bitmap> f20482gf;
    protected String jpo;
    private String jrx;
    protected ImageView.ScaleType kgu;

    /* renamed from: lq, reason: collision with root package name */
    private boolean f20483lq;
    private float pzk;

    /* renamed from: sn, reason: collision with root package name */
    private float f20484sn;
    private boolean uhu;

    /* renamed from: ww, reason: collision with root package name */
    private int f20485ww;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.ju.jd.jpo.jpo$1, reason: invalid class name */
    public class AnonymousClass1 implements cm {
        public AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.jd.cm
        public Bitmap jpo(final yd ydVar) {
            final String strJpo;
            if (ydVar == null) {
                return null;
            }
            String strYd = ydVar.yd();
            String strZz = ydVar.zz();
            if (!TextUtils.isEmpty(strYd) && TextUtils.isEmpty(strZz)) {
                strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(strYd, ((wqx) jpo.this).f17797cm);
            } else if (!TextUtils.isEmpty(strZz) && TextUtils.isEmpty(strYd)) {
                strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(strZz, ((wqx) jpo.this).f17797cm);
            } else if (TextUtils.isEmpty(strZz) || TextUtils.isEmpty(strYd)) {
                strJpo = null;
            } else {
                strJpo = com.bytedance.adsdk.ugeno.wqx.jd.jpo(strYd, ((wqx) jpo.this).f17797cm) + com.bytedance.adsdk.ugeno.wqx.jd.jpo(strZz, ((wqx) jpo.this).f17797cm);
            }
            if (TextUtils.isEmpty(strJpo)) {
                return null;
            }
            Bitmap bitmap = jpo.this.f20482gf.get(strJpo);
            if (bitmap != null) {
                return bitmap;
            }
            my.jpo().jd().jpo(((wqx) jpo.this).zz, strJpo, new jpo.InterfaceC0064jpo() { // from class: com.bytedance.sdk.openadsdk.core.ju.jd.jpo.jpo.1.1
                @Override // com.bytedance.adsdk.ugeno.jpo.InterfaceC0064jpo
                public void jpo(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap2, ydVar.jpo(), ydVar.jd(), false);
                        jpo.this.f20482gf.put(strJpo, bitmapCreateScaledBitmap);
                        xyk.jpo(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ju.jd.jpo.jpo.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((jd) ((wqx) jpo.this).my).jpo(ydVar.xyk(), bitmapCreateScaledBitmap);
                            }
                        });
                    }
                }
            });
            return jpo.this.f20482gf.get(strJpo);
        }
    }

    public jpo(Context context) {
        super(context);
        this.jrx = "images";
        this.czp = true;
        this.f20484sn = 1.0f;
        this.ez = ImageView.ScaleType.FIT_CENTER;
        this.kgu = ImageView.ScaleType.FIT_XY;
        this.f20482gf = new HashMap<>();
    }

    private ImageView.ScaleType au(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    /* renamed from: if, reason: not valid java name */
    private ImageView.ScaleType m462if(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.getClass();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private String ju(String str) {
        return (!TextUtils.isEmpty(str) && str.contains("local")) ? str.contains("shake_phone") ? "lottie_json/shake_phone.json" : str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "" : "";
    }

    public void cm() {
        T t10 = this.my;
        if (t10 != 0) {
            ((jd) t10).jpo();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException {
        super.jd();
        ((jd) this.my).setProgress(this.pzk);
        if (this.f20484sn <= 0.0f) {
            this.f20484sn = 1.0f;
        }
        ((jd) this.my).setSpeed(this.f20484sn);
        if (this.jpo.startsWith("local")) {
            ((jd) this.my).setAnimation(ju(this.jpo));
            ((jd) this.my).setImageAssetsFolder(this.jrx);
        } else {
            ((jd) this.my).setAnimationFromUrl(this.jpo);
        }
        ((jd) this.my).setImageAssetDelegate(new AnonymousClass1());
        if (sz()) {
            ((jd) this.my).setScaleType(this.kgu);
        } else {
            ((jd) this.my).setScaleType(this.ez);
        }
        if (sz()) {
            ((jd) this.my).setRepeatCount(this.f20485ww);
        } else {
            ((jd) this.my).jpo(this.uhu);
        }
        if (!sz()) {
            T t10 = this.my;
            if (t10 != 0) {
                ((jd) t10).jpo();
                return;
            }
            return;
        }
        T t11 = this.my;
        if (t11 == 0 || !this.czp) {
            return;
        }
        ((jd) t11).jpo();
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: wqx, reason: merged with bridge method [inline-methods] */
    public jd jpo() {
        jd jdVar = new jd(this.f17811jd);
        jdVar.jpo(this);
        return jdVar;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jpo(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        super.jpo(str, str2);
        str.getClass();
        switch (str) {
            case "scaleMode":
                this.kgu = au(str2);
                break;
            case "scaleType":
                this.ez = m462if(str2);
                break;
            case "progress":
                this.pzk = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0.0f);
                break;
            case "imagePath":
                this.jrx = str2;
                break;
            case "autoReverse":
                this.f20483lq = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, false);
                break;
            case "src":
                this.jpo = com.bytedance.sdk.openadsdk.core.ju.wqx.jpo(str2);
                break;
            case "loop":
                if (sz()) {
                    this.f20485ww = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 0);
                    break;
                } else {
                    this.uhu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, false);
                    break;
                }
            case "speed":
                this.f20484sn = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, 1.0f);
                break;
            case "autoPlay":
                this.f20481as = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, false);
                break;
            case "autoplay":
                this.czp = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, true);
                break;
        }
    }

    public void jpo(AnimatorListenerAdapter animatorListenerAdapter) {
        ((jd) this.my).jpo(animatorListenerAdapter);
    }
}

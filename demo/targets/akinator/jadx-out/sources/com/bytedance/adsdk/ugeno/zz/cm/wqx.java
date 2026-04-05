package com.bytedance.adsdk.ugeno.zz.cm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.jj;
import com.bytedance.adsdk.ugeno.core.ju;
import com.bytedance.adsdk.ugeno.jpo;
import com.bytedance.adsdk.ugeno.my;
import com.bytedance.adsdk.ugeno.qk.cm;
import com.bytedance.adsdk.ugeno.qk.xyk;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends com.bytedance.adsdk.ugeno.jd.wqx<jpo> {
    protected boolean ez;

    /* renamed from: gf, reason: collision with root package name */
    protected ImageView.ScaleType f18079gf;
    protected String jpo;
    private int jrx;
    protected String kgu;

    /* renamed from: lq, reason: collision with root package name */
    private float f18080lq;
    private float uhu;

    public wqx(Context context) {
        super(context);
        this.f18079gf = ImageView.ScaleType.FIT_XY;
        this.jrx = -1;
        this.f18080lq = -1.0f;
        this.uhu = -1.0f;
    }

    private ImageView.ScaleType ju(String str) {
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
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private void yd() {
        if (this.f18080lq > 0.0f) {
            my.jpo().jd().jpo(this.zz, this.jpo, new jpo.InterfaceC0064jpo() { // from class: com.bytedance.adsdk.ugeno.zz.cm.wqx.1
                @Override // com.bytedance.adsdk.ugeno.jpo.InterfaceC0064jpo
                public void jpo(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).rzi != null) {
                            jj unused = ((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).rzi;
                            return;
                        }
                        return;
                    }
                    if (((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).rzi != null) {
                        jj unused2 = ((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).rzi;
                    }
                    final Bitmap bitmapJpo = xyk.jpo(((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).f17811jd, bitmap, (int) wqx.this.f18080lq);
                    if (bitmapJpo != null) {
                        xyk.jpo(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.cm.wqx.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((jpo) ((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).my).setImageBitmap(bitmapJpo);
                            }
                        });
                    }
                    wqx wqxVar = wqx.this;
                    if (wqxVar.ez || wqxVar.uhu > 0.0f) {
                        Bitmap bitmapJpo2 = xyk.jpo(((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).f17811jd, bitmap, wqx.this.uhu > 0.0f ? (int) wqx.this.uhu : 10);
                        if (bitmapJpo2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).f17811jd.getResources(), bitmapJpo2);
                            xyk.jpo(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.cm.wqx.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((jpo) ((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).my).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.jpo jpoVarJd = my.jpo().jd();
        ju juVar = this.zz;
        String str = this.jpo;
        T t10 = this.my;
        jpoVarJd.jpo(juVar, str, (ImageView) t10, ((jpo) t10).getWidth(), ((jpo) this.my).getHeight(), new jpo.InterfaceC0064jpo() { // from class: com.bytedance.adsdk.ugeno.zz.cm.wqx.2
            @Override // com.bytedance.adsdk.ugeno.jpo.InterfaceC0064jpo
            public void jpo(Bitmap bitmap) {
                if (bitmap == null) {
                    if (((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).rzi != null) {
                        jj unused = ((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).rzi;
                    }
                } else if (((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).rzi != null) {
                    jj unused2 = ((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).rzi;
                }
            }
        });
        if (this.ez || this.uhu > 0.0f) {
            my.jpo().jd().jpo(this.zz, this.jpo, new jpo.InterfaceC0064jpo() { // from class: com.bytedance.adsdk.ugeno.zz.cm.wqx.3
                @Override // com.bytedance.adsdk.ugeno.jpo.InterfaceC0064jpo
                public void jpo(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap bitmapJpo = xyk.jpo(((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).f17811jd, bitmap, wqx.this.uhu > 0.0f ? (int) wqx.this.uhu : 10);
                    xyk.jpo(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.cm.wqx.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (bitmapJpo != null) {
                                ((jpo) ((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).my).setBackground(new BitmapDrawable(((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).f17811jd.getResources(), bitmapJpo));
                            }
                        }
                    });
                }
            });
        }
    }

    private void zz() throws NumberFormatException {
        if (TextUtils.isEmpty(this.jpo)) {
            return;
        }
        ((jpo) this.my).setImageDrawable(null);
        if (!this.jpo.startsWith("local://")) {
            if (!this.jpo.startsWith("@")) {
                yd();
                return;
            } else {
                ((jpo) this.my).setImageResource(Integer.parseInt(this.jpo.substring(1)));
                return;
            }
        }
        try {
            String strReplace = this.jpo.replace("local://", "");
            if (TextUtils.equals(wqx(), "raw")) {
                ((jpo) this.my).setImageResource(cm.jpo(this.f17811jd, strReplace));
            } else {
                ((jpo) this.my).setImageResource(cm.jd(this.f17811jd, strReplace));
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    /* renamed from: cm, reason: merged with bridge method [inline-methods] */
    public jpo jpo() {
        jpo jpoVar = new jpo(this.f17811jd);
        jpoVar.jpo(this);
        return jpoVar;
    }

    /* renamed from: if, reason: not valid java name */
    public void m398if(String str) {
        this.jpo = str;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx
    public void jd() throws JSONException, NumberFormatException {
        super.jd();
        zz();
        ((jpo) this.my).setScaleType(this.f18079gf);
        ((jpo) this.my).setBorderColor(this.hks);
        ((jpo) this.my).setCornerRadius(this.xk);
        ((jpo) this.my).setBorderWidth(this.cgn);
        int i10 = this.jrx;
        if (i10 != -1) {
            ((jpo) this.my).setColorFilter(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx, com.bytedance.adsdk.ugeno.cm
    public void qk() {
        super.qk();
        ((jpo) this.my).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.zz.cm.wqx.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((jpo) ((com.bytedance.adsdk.ugeno.jd.wqx) wqx.this).my).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !a.d(drawable)) {
                    return;
                }
                a.b(drawable).start();
            }
        });
    }

    public String wqx() {
        return this.kgu;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.wqx, com.bytedance.adsdk.ugeno.cm
    public void xyk() {
        super.xyk();
        Drawable drawable = ((jpo) this.my).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !a.d(drawable)) {
            return;
        }
        a.b(drawable).stop();
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
            case "scaleType":
                this.f18079gf = ju(str2);
                break;
            case "imageBlur":
                this.f18080lq = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, -1.0f);
                break;
            case "isBgGaussianBlur":
                this.ez = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, false);
                break;
            case "src":
                this.jpo = str2;
                break;
            case "tintColor":
                this.jrx = com.bytedance.adsdk.ugeno.qk.jpo.jpo(str2);
                break;
            case "imageBgBlur":
                this.uhu = com.bytedance.adsdk.ugeno.qk.wqx.jpo(str2, -1.0f);
                break;
        }
    }
}

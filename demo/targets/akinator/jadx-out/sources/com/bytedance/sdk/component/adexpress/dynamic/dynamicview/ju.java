package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends jj {
    private String jpo;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements com.bytedance.sdk.component.my.hna {

        /* renamed from: jd, reason: collision with root package name */
        private Resources f18232jd;
        private WeakReference<View> jpo;

        public jd(View view, Resources resources) {
            this.jpo = new WeakReference<>(view);
            this.f18232jd = resources;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(com.bytedance.sdk.component.my.ju juVar) {
            Object objJd;
            View view = this.jpo.get();
            if (view == null || (objJd = juVar.jd()) == null || juVar.wqx() == null) {
                return;
            }
            if (objJd instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.f18232jd, (Bitmap) objJd));
            } else if (objJd instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && com.bytedance.adsdk.ugeno.zz.cm.a.d(objJd)) {
                    com.bytedance.adsdk.ugeno.zz.cm.a.b(objJd).start();
                }
                view.setBackground((Drawable) objJd);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements com.bytedance.sdk.component.my.xyk {
        private final WeakReference<Context> jpo;

        public jpo(Context context) {
            this.jpo = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.my.xyk
        public Bitmap jpo(Bitmap bitmap) {
            Context context = this.jpo.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.cm.jpo.jpo(context, bitmap, 25);
            }
            return null;
        }
    }

    public ju(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        if (!TextUtils.isEmpty(this.f51if.voc()) && xykVar.jr()) {
            com.bytedance.sdk.component.adexpress.jj.yd ydVar = new com.bytedance.sdk.component.adexpress.jj.yd(context);
            ydVar.setAnimationsLoop(this.f51if.aix());
            ydVar.setImageLottieTosPath(this.f51if.voc());
            ydVar.setLottieAppNameMaxLength(this.f51if.vk());
            ydVar.setLottieAdTitleMaxLength(this.f51if.erj());
            ydVar.setLottieAdDescMaxLength(this.f51if.tl());
            ydVar.setData(xykVar.nmd());
            this.prr = ydVar;
        } else if (this.f51if.prr() > 0.0f) {
            com.bytedance.sdk.component.adexpress.jj.nq nqVar = new com.bytedance.sdk.component.adexpress.jj.nq(context);
            this.prr = nqVar;
            nqVar.setXRound((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, this.f51if.prr()));
            ((com.bytedance.sdk.component.adexpress.jj.nq) this.prr).setYRound((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, this.f51if.prr()));
        } else if (!xyk() && "arrowButton".equals(xykVar.yd().jd())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.jd jdVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.jd(context);
            jdVar.setBrickNativeValue(this.f51if);
            this.prr = jdVar;
        } else if (com.bytedance.sdk.component.adexpress.cm.zz.jd(this.f51if.ju())) {
            this.prr = new com.bytedance.sdk.component.adexpress.jj.au(context);
        } else {
            this.prr = new ImageView(context);
        }
        this.jpo = getImageKey();
        this.prr.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(xykVar.yd().jd())) {
            if (this.f51if.jd() > 0 || this.f51if.jpo() > 0) {
                int iMin = Math.min(this.f18242qk, this.xyk);
                this.f18242qk = iMin;
                this.xyk = Math.min(iMin, this.xyk);
                this.zz = (int) (com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, (this.f51if.jpo() / 2) + this.f51if.jd() + 0.5f) + this.zz);
            } else {
                int iMax = Math.max(this.f18242qk, this.xyk);
                this.f18242qk = iMax;
                this.xyk = Math.max(iMax, this.xyk);
            }
            this.f51if.jpo(this.f18242qk / 2);
        }
        addView(this.prr, new FrameLayout.LayoutParams(this.f18242qk, this.xyk));
    }

    private String getImageKey() {
        Map<String, String> mapJu = this.oya.getRenderRequest().ju();
        if (mapJu == null || mapJu.size() <= 0) {
            return null;
        }
        return mapJu.get(this.f51if.ju());
    }

    private boolean jpo() {
        String strM405if = this.f51if.m405if();
        if (this.f51if.nmd()) {
            return true;
        }
        if (TextUtils.isEmpty(strM405if)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM405if);
            return Math.abs((((float) this.f18242qk) / (((float) this.xyk) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.prr).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !com.bytedance.adsdk.ugeno.zz.cm.a.d(drawable)) {
            return;
        }
        com.bytedance.adsdk.ugeno.zz.cm.a.b(drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.prr).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !com.bytedance.adsdk.ugeno.zz.cm.a.d(drawable)) {
            return;
        }
        com.bytedance.adsdk.ugeno.zz.cm.a.b(drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.ef
    public boolean zz() {
        int iHna;
        super.zz();
        if (!TextUtils.isEmpty(this.f51if.voc())) {
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int iPrr = 0;
        if ("arrowButton".equals(this.f18236au.yd().jd())) {
            ((ImageView) this.prr).setImageResource(com.bytedance.sdk.component.utils.dt.cm(this.f18241ju, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.prr).getDrawable() != null) {
                ((ImageView) this.prr).getDrawable().setAutoMirrored(true);
            }
            this.prr.setPadding(0, 0, 0, 0);
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.prr.setBackgroundColor(this.f51if.pdm());
        String strWqx = this.f18236au.yd().wqx();
        if ("user".equals(strWqx)) {
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.prr).setColorFilter(this.f51if.qk());
            ((ImageView) this.prr).setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(getContext(), "tt_user"));
            ImageView imageView = (ImageView) this.prr;
            int i10 = this.f18242qk;
            imageView.setPadding(i10 / 10, this.xyk / 5, i10 / 10, 0);
        } else if (strWqx != null && strWqx.startsWith("@")) {
            try {
                ((ImageView) this.prr).setImageResource(Integer.parseInt(strWqx.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.my.prr prrVarMy = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().my();
        String strJu = this.f51if.ju();
        if (!TextUtils.isEmpty(strJu) && !strJu.startsWith("http:") && !strJu.startsWith("https:")) {
            DynamicRootView dynamicRootView = this.oya;
            strJu = com.bytedance.sdk.component.adexpress.dynamic.my.zz.jd(strJu, (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) ? null : this.oya.getRenderRequest().hmu());
        }
        com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
        if (wqxVarWqx != null) {
            iPrr = wqxVarWqx.prr();
            iHna = wqxVarWqx.hna();
        } else {
            iHna = 0;
        }
        com.bytedance.sdk.component.my.yd ydVarMy = prrVarMy.jpo(strJu).jpo(this.jpo).jpo(this.f18242qk).jd(this.xyk).cm(iPrr).my(iHna);
        String strOya = this.oya.getRenderRequest().oya();
        if (!TextUtils.isEmpty(strOya)) {
            ydVarMy.jd(strOya);
        }
        if (jpo()) {
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.FIT_CENTER);
            ydVarMy.jpo(Bitmap.Config.ARGB_4444).wqx(2).jpo(new jpo(this.f18241ju)).jpo(new jd(this.prr, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                ydVarMy.wqx(1).jpo((ImageView) this.prr);
            }
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.prr instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.prr).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }
}

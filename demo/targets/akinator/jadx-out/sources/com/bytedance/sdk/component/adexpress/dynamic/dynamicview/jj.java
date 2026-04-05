package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.amazon.device.ads.DTBMetricsConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jj extends my {
    private static String nmd = "";

    /* renamed from: jd, reason: collision with root package name */
    private Runnable f18220jd;
    private Runnable jpo;

    /* renamed from: jr, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.wqx.zz f18221jr;

    /* renamed from: rq, reason: collision with root package name */
    private volatile boolean f18222rq;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements com.bytedance.sdk.component.my.hna {

        /* renamed from: jd, reason: collision with root package name */
        private final WeakReference<my> f18225jd;
        private final WeakReference<View> jpo;

        public jd(View view, my myVar) {
            this.jpo = new WeakReference<>(view);
            this.f18225jd = new WeakReference<>(myVar);
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(com.bytedance.sdk.component.my.ju juVar) {
            Object objJd;
            my myVar;
            View view = this.jpo.get();
            if (view == null || (objJd = juVar.jd()) == null || juVar.wqx() == null || (myVar = this.f18225jd.get()) == null || !(objJd instanceof Bitmap)) {
                return;
            }
            view.setBackground(myVar.jpo((Bitmap) objJd));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements com.bytedance.sdk.component.my.hna {

        /* renamed from: jd, reason: collision with root package name */
        private final WeakReference<DynamicRootView> f18226jd;
        private final WeakReference<View> jpo;
        private final com.bytedance.sdk.component.adexpress.dynamic.cm.xyk wqx;

        public jpo(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
            this.jpo = new WeakReference<>(view);
            this.f18226jd = new WeakReference<>(dynamicRootView);
            this.wqx = xykVar;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(int i10, String str, Throwable th2) {
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(com.bytedance.sdk.component.my.ju juVar) {
            Drawable bitmapDrawable;
            View view = this.jpo.get();
            Object objJd = juVar.jd();
            if (objJd instanceof Bitmap) {
                bitmapDrawable = new BitmapDrawable((Bitmap) objJd);
            } else if (objJd instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && com.bytedance.adsdk.ugeno.zz.cm.a.d(objJd)) {
                    com.bytedance.adsdk.ugeno.zz.cm.a.b(objJd).start();
                }
                bitmapDrawable = (Drawable) objJd;
            } else {
                bitmapDrawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.cm.jd()) {
                DynamicRootView dynamicRootView = this.f18226jd.get();
                if (dynamicRootView == null) {
                    return;
                }
                if ("open_ad".equals(dynamicRootView.getRenderRequest().cm()) || "splash_ad".equals(dynamicRootView.getRenderRequest().cm())) {
                    view.setBackground(bitmapDrawable);
                    return;
                } else {
                    view.setBackground(bitmapDrawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(bitmapDrawable);
            com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar = this.wqx;
            if (xykVar == null || xykVar.yd() == null || 6 != this.wqx.yd().jpo() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class wqx implements com.bytedance.sdk.component.my.xyk {

        /* renamed from: jd, reason: collision with root package name */
        private final int f18227jd;
        private final WeakReference<Context> jpo;

        public wqx(Context context, int i10) {
            this.jpo = new WeakReference<>(context);
            this.f18227jd = i10;
        }

        @Override // com.bytedance.sdk.component.my.xyk
        public Bitmap jpo(Bitmap bitmap) {
            Context context = this.jpo.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.cm.jpo.jpo(context, bitmap, this.f18227jd);
            }
            return null;
        }
    }

    public jj(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context, dynamicRootView, xykVar);
        this.f18222rq = true;
        setTag(Integer.valueOf(getClickArea()));
        String strJd = xykVar.yd().jd();
        if ("logo-union".equals(strJd)) {
            dynamicRootView.setLogoUnionHeight(this.xyk - ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, this.f51if.jpo() + this.f51if.jd())));
        } else if ("scoreCountWithIcon".equals(strJd)) {
            dynamicRootView.setScoreCountWithIcon(this.xyk - ((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(context, this.f51if.jpo() + this.f51if.jd())));
        }
    }

    private static String getBuildModel() {
        try {
            nmd = com.bytedance.sdk.component.utils.nq.jpo();
        } catch (Throwable unused) {
            nmd = Build.MODEL;
        }
        if (TextUtils.isEmpty(nmd)) {
            nmd = Build.MODEL;
        }
        return nmd;
    }

    private String jd(String str) {
        try {
            Map<String, String> mapJu = this.oya.getRenderRequest().ju();
            if (mapJu != null && mapJu.size() > 0) {
                return mapJu.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable wqx(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String string = "";
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                if (jSONArray.getString(i10).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i10));
                } else if (jSONArray.getString(i10).endsWith("deg")) {
                    string = jSONArray.getString(i10);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.cm.qk.jpo(((String) arrayList.get(i11)).substring(0, 7));
            }
            GradientDrawable gradientDrawableJpo = jpo(jpo(string), iArr);
            gradientDrawableJpo.setShape(0);
            gradientDrawableJpo.setCornerRadius(com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.prr()));
            return gradientDrawableJpo;
        } catch (Throwable unused) {
            return null;
        }
    }

    public FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.f18242qk, this.xyk);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        View view = this.prr;
        if (view == null) {
            view = this;
        }
        double dNmd = this.f18236au.yd().my().nmd();
        if (dNmd < 90.0d && dNmd > 0.0d) {
            com.bytedance.sdk.component.utils.zz.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj.2
                @Override // java.lang.Runnable
                public void run() {
                    jj.this.setVisibility(8);
                }
            }, (long) (dNmd * 1000.0d));
        }
        jpo(this.f18236au.yd().my().jr(), view);
        if (!TextUtils.isEmpty(this.f51if.roc())) {
            jpo();
        }
        super.onAttachedToWindow();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.jpo);
            removeCallbacks(this.f18220jd);
        } catch (Exception unused) {
        }
    }

    public boolean zz() {
        int iPrr;
        int iHna;
        Drawable backgroundDrawable;
        DynamicRootView dynamicRootView;
        JSONObject jSONObjectOptJSONObject;
        final View view = this.prr;
        if (view == null) {
            view = this;
        }
        setContentDescription(this.f18236au.jpo(this.f51if.hx()));
        String strUx = this.f51if.ux();
        String strHmu = null;
        String strJpo = (TextUtils.isEmpty(strUx) || (dynamicRootView = this.oya) == null || dynamicRootView.getRenderRequest() == null || this.oya.getRenderRequest().wqx() == null || (jSONObjectOptJSONObject = this.oya.getRenderRequest().wqx().optJSONObject(DTBMetricsConfiguration.CREATIVE_TEMPLATES_KEY_NAME)) == null) ? null : jpo(jSONObjectOptJSONObject.opt(strUx));
        if (TextUtils.isEmpty(strJpo)) {
            strJpo = this.f51if.rq();
        }
        com.bytedance.sdk.component.adexpress.jpo.jpo.wqx wqxVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().wqx();
        if (wqxVarWqx != null) {
            iPrr = wqxVarWqx.prr();
            iHna = wqxVarWqx.hna();
        } else {
            iPrr = 0;
            iHna = 0;
        }
        if (this.f51if.nmd()) {
            int iJr = this.f51if.jr();
            String str = this.f51if.f18197jd;
            com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().my().jpo(str).jpo(this.f18242qk).jd(this.xyk).cm(iPrr).my(iHna).jpo(jd(str)).wqx(2).jpo(new wqx(this.f18241ju, iJr)).jpo(new jd(view, this));
        } else if (!TextUtils.isEmpty(strJpo)) {
            if (!strJpo.startsWith("http:") && !strJpo.startsWith("https:")) {
                DynamicRootView dynamicRootView2 = this.oya;
                if (dynamicRootView2 != null && dynamicRootView2.getRenderRequest() != null) {
                    strHmu = this.oya.getRenderRequest().hmu();
                }
                strJpo = com.bytedance.sdk.component.adexpress.dynamic.my.zz.jd(strJpo, strHmu);
            }
            com.bytedance.sdk.component.my.yd ydVarWqx = com.bytedance.sdk.component.adexpress.jpo.jpo.jpo.jpo().my().jpo(strJpo).jpo(this.f18242qk).jd(this.xyk).cm(iPrr).my(iHna).jpo(jd(strJpo)).wqx(1);
            jpo(ydVarWqx);
            ydVarWqx.jpo(new jpo(view, this.oya, this.f18236au));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.f51if.rv() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (jj.this.f51if.nzb() > 0) {
                            jj jjVar = jj.this;
                            Drawable drawableWqx = jjVar.wqx(jjVar.oya.getBgMaterialCenterCalcColor().get(Integer.valueOf(jj.this.f51if.nzb())));
                            if (drawableWqx == null) {
                                jj jjVar2 = jj.this;
                                drawableWqx = jjVar2.jpo(true, jjVar2.oya.getBgMaterialCenterCalcColor().get(Integer.valueOf(jj.this.f51if.nzb())));
                            }
                            if (drawableWqx != null) {
                                view.setBackground(drawableWqx);
                                return;
                            }
                            View view2 = view;
                            jj jjVar3 = jj.this;
                            view2.setBackground(jjVar3.jpo(true, jjVar3.oya.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.f51if.rv() * 1000.0d));
        }
        View view2 = this.prr;
        if (view2 != null) {
            view2.setPadding((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.wqx()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.jd()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.cm()), (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.jpo()));
        }
        if (this.hna || this.f51if.oya() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    private String jpo(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return jpo(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return jpo((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    private static void jpo(com.bytedance.sdk.component.my.yd ydVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            ydVar.jpo(Bitmap.Config.ARGB_8888);
        }
    }

    private void jpo(double d10, final View view) {
        if (d10 > 0.0d) {
            com.bytedance.sdk.component.utils.zz.jd().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj.3
                @Override // java.lang.Runnable
                public void run() {
                    if (jj.this.f18236au.yd().my().jrx() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    jj.this.setVisibility(0);
                }
            }, (long) (d10 * 1000.0d));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            if (viewGroup.getChildAt(i10) instanceof com.bytedance.sdk.component.adexpress.dynamic.wqx.zz) {
                viewGroup.removeViewAt(i10);
            }
        }
    }

    private void jpo() {
        if (this.f18222rq) {
            int iHuv = this.f51if.huv();
            int iYa = this.f51if.ya();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj.4
                @Override // java.lang.Runnable
                public void run() {
                    DynamicRootView dynamicRootView = jj.this.oya;
                    if (dynamicRootView == null || dynamicRootView.getRenderRequest() == null) {
                        jj jjVar = jj.this;
                        jj jjVar2 = jj.this;
                        jjVar.f18221jr = new com.bytedance.sdk.component.adexpress.dynamic.wqx.zz(jjVar2.f18241ju, jjVar2, jjVar2.f51if);
                    } else {
                        com.bytedance.sdk.component.adexpress.jd.au renderRequest = jj.this.oya.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.cm.yd ydVar = new com.bytedance.sdk.component.adexpress.dynamic.cm.yd();
                        ydVar.jpo(renderRequest.prr());
                        ydVar.jd(renderRequest.hna());
                        ydVar.wqx(renderRequest.sq());
                        ydVar.jpo(renderRequest.opi());
                        ydVar.jd(renderRequest.jr());
                        ydVar.wqx(renderRequest.nmd());
                        ydVar.cm(renderRequest.rq());
                        ydVar.my(renderRequest.tu());
                        jj jjVar3 = jj.this;
                        jj jjVar4 = jj.this;
                        jjVar3.f18221jr = new com.bytedance.sdk.component.adexpress.dynamic.wqx.zz(jjVar4.f18241ju, jjVar4, jjVar4.f51if, ydVar, renderRequest);
                    }
                    jj jjVar5 = jj.this;
                    jjVar5.jd(jjVar5.f18221jr);
                    if (jj.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jj.this.getParent()).setClipChildren(false);
                    }
                    jj.this.setClipChildren(false);
                    jj.this.f18221jr.setTag(2);
                    jj jjVar6 = jj.this;
                    jjVar6.jpo((ViewGroup) jjVar6);
                    jj jjVar7 = jj.this;
                    jjVar7.addView(jjVar7.f18221jr, new FrameLayout.LayoutParams(-1, -1));
                    jj.this.f18221jr.wqx();
                }
            };
            this.jpo = runnable;
            postDelayed(runnable, iHuv * 1000);
            if (this.f51if.wcn() || iYa >= Integer.MAX_VALUE || iHuv >= iYa) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.jj.5
                @Override // java.lang.Runnable
                public void run() {
                    jj jjVar = jj.this;
                    if (jjVar.f18221jr != null) {
                        jjVar.f18222rq = false;
                        jj.this.f18221jr.cm();
                        jj.this.f18221jr.setVisibility(4);
                        jj jjVar2 = jj.this;
                        jjVar2.removeView(jjVar2.f18221jr);
                    }
                }
            };
            this.f18220jd = runnable2;
            postDelayed(runnable2, iYa * 1000);
        }
    }
}

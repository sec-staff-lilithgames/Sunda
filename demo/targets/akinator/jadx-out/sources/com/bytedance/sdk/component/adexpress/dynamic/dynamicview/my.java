package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class my extends FrameLayout implements IAnimation, ef, nzb {

    /* renamed from: au, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.cm.xyk f18236au;

    /* renamed from: cm, reason: collision with root package name */
    protected float f18237cm;
    protected boolean hna;

    /* renamed from: if, reason: not valid java name */
    protected com.bytedance.sdk.component.adexpress.dynamic.cm.qk f51if;

    /* renamed from: jd, reason: collision with root package name */
    private float f18238jd;

    /* renamed from: jj, reason: collision with root package name */
    protected float f18239jj;
    private float jpo;

    /* renamed from: jr, reason: collision with root package name */
    private float f18240jr;

    /* renamed from: ju, reason: collision with root package name */
    protected Context f18241ju;
    protected float my;
    private float nmd;
    com.bytedance.sdk.component.adexpress.dynamic.animation.view.wqx opi;
    protected DynamicRootView oya;
    protected View prr;

    /* renamed from: qk, reason: collision with root package name */
    protected int f18242qk;

    /* renamed from: rq, reason: collision with root package name */
    private com.bytedance.sdk.component.utils.hmu f18243rq;

    /* renamed from: sq, reason: collision with root package name */
    protected com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.jd f18244sq;
    protected float wqx;
    protected int xyk;

    /* renamed from: yd, reason: collision with root package name */
    protected int f18245yd;
    protected int zz;

    /* renamed from: tu, reason: collision with root package name */
    private static final View.OnTouchListener f18235tu = new View.OnTouchListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my.2
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    };

    /* renamed from: dt, reason: collision with root package name */
    private static final View.OnClickListener f18234dt = new View.OnClickListener() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my.3
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    };

    public my(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar) {
        super(context);
        this.f18241ju = context;
        this.oya = dynamicRootView;
        this.f18236au = xykVar;
        this.wqx = xykVar.jj();
        this.f18237cm = xykVar.qk();
        this.my = xykVar.xyk();
        this.f18239jj = xykVar.zz();
        this.zz = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.wqx);
        this.f18245yd = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f18237cm);
        this.f18242qk = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.my);
        this.xyk = (int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f18239jj);
        com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar = new com.bytedance.sdk.component.adexpress.dynamic.cm.qk(xykVar.yd());
        this.f51if = qkVar;
        if (qkVar.opi() > 0) {
            this.f18242qk = (this.f51if.opi() * 2) + this.f18242qk;
            this.xyk = (this.f51if.opi() * 2) + this.xyk;
            this.zz -= this.f51if.opi();
            this.f18245yd -= this.f51if.opi();
            List<com.bytedance.sdk.component.adexpress.dynamic.cm.xyk> listJu = xykVar.ju();
            if (listJu != null) {
                for (com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar2 : listJu) {
                    xykVar2.wqx(xykVar2.jj() + com.bytedance.sdk.component.adexpress.cm.qk.jd(this.f18241ju, this.f51if.opi()));
                    xykVar2.cm(xykVar2.qk() + com.bytedance.sdk.component.adexpress.cm.qk.jd(this.f18241ju, this.f51if.opi()));
                    xykVar2.jpo(com.bytedance.sdk.component.adexpress.cm.qk.jd(this.f18241ju, this.f51if.opi()));
                    xykVar2.jd(com.bytedance.sdk.component.adexpress.cm.qk.jd(this.f18241ju, this.f51if.opi()));
                }
            }
        }
        this.hna = this.f51if.oya() > 0.0d;
        this.opi = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.wqx();
    }

    public boolean cm() throws JSONException {
        View.OnTouchListener onTouchListener;
        View.OnClickListener onClickListener;
        View view = this.prr;
        if (view == null) {
            view = this;
        }
        if (my()) {
            onTouchListener = (View.OnTouchListener) getDynamicClickListener();
            onClickListener = (View.OnClickListener) getDynamicClickListener();
        } else {
            onTouchListener = f18235tu;
            onClickListener = f18234dt;
        }
        if (onTouchListener != null && onClickListener != null) {
            view.setOnTouchListener(onTouchListener);
            view.setOnClickListener(onClickListener);
            int iJpo = com.bytedance.sdk.component.adexpress.dynamic.jd.jpo.jpo(this.f51if);
            if (iJpo == 2 || iJpo == 3) {
                view.setOnClickListener(f18234dt);
            } else {
                view.setOnClickListener(onClickListener);
            }
        }
        jpo(view);
        jd(view);
        return true;
    }

    public Drawable getBackgroundDrawable() {
        return jpo(false, "");
    }

    public boolean getBeginInvisibleAndShow() {
        return this.hna;
    }

    public int getClickArea() {
        return this.f51if.hx();
    }

    public GradientDrawable getDrawable() {
        return new GradientDrawable();
    }

    public com.bytedance.sdk.component.adexpress.dynamic.jj.jpo getDynamicClickListener() {
        return this.oya.getDynamicClickListener();
    }

    public int getDynamicHeight() {
        return this.xyk;
    }

    public com.bytedance.sdk.component.adexpress.dynamic.cm.jj getDynamicLayoutBrickValue() {
        com.bytedance.sdk.component.adexpress.dynamic.cm.my myVarYd;
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar = this.f18236au;
        if (xykVar == null || (myVarYd = xykVar.yd()) == null) {
            return null;
        }
        return myVarYd.my();
    }

    public int getDynamicWidth() {
        return this.f18242qk;
    }

    public String getImageObjectFit() {
        return this.f51if.sbx();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getMarqueeValue() {
        return this.f18240jr;
    }

    public Drawable getMutilBackgroundDrawable() {
        try {
            return new LayerDrawable(jpo(jd(this.f51if.duq().replaceAll("/\\*.*\\*/", ""))));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getRippleValue() {
        return this.jpo;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getShineValue() {
        return this.f18238jd;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public float getStretchValue() {
        return this.nmd;
    }

    public void jd(View view) {
        com.bytedance.sdk.component.adexpress.dynamic.cm.jj jjVarMy;
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar = this.f18236au;
        if (xykVar == null || (jjVarMy = xykVar.yd().my()) == null) {
            return;
        }
        view.setTag(2097610716, Boolean.valueOf(jjVarMy.zmh()));
    }

    public void jj() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f18242qk, this.xyk);
        layoutParams.topMargin = this.f18245yd;
        int i10 = this.zz;
        layoutParams.leftMargin = i10;
        layoutParams.setMarginStart(i10);
        layoutParams.setMarginEnd(layoutParams.rightMargin);
        setLayoutParams(layoutParams);
    }

    public void jpo(int i10) {
        com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar = this.f51if;
        if (qkVar != null && qkVar.jpo(i10)) {
            zz();
            int childCount = getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt != null && (getChildAt(i11) instanceof my)) {
                    ((my) childAt).jpo(i10);
                }
            }
        }
    }

    public boolean my() {
        com.bytedance.sdk.component.adexpress.dynamic.cm.qk qkVar = this.f51if;
        return (qkVar == null || qkVar.hx() == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        qk();
        jpo();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        jd();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.opi.jpo(canvas, this, this);
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.sdk.component.adexpress.dynamic.animation.view.wqx wqxVar = this.opi;
        View view = this.prr;
        if (view == null) {
            view = this;
        }
        wqxVar.jpo(view, i10, i11);
    }

    public void qk() {
        if (xyk()) {
            return;
        }
        View view = this.prr;
        if (view == null) {
            view = this;
        }
        this.f18244sq = new com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.jd(view, this.f18236au.yd().my().jrx());
        post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.jd jdVar = my.this.f18244sq;
                if (jdVar != null) {
                    jdVar.jpo();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setMarqueeValue(float f10) {
        this.f18240jr = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setRippleValue(float f10) {
        this.jpo = f10;
        postInvalidate();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setShineValue(float f10) {
        this.f18238jd = f10;
        postInvalidate();
    }

    public void setShouldInvisible(boolean z10) {
        this.hna = z10;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.animation.view.IAnimation
    public void setStretchValue(float f10) {
        this.nmd = f10;
        this.opi.jpo(this, f10);
    }

    public boolean wqx() {
        zz();
        jj();
        cm();
        return true;
    }

    public boolean xyk() {
        com.bytedance.sdk.component.adexpress.dynamic.cm.xyk xykVar = this.f18236au;
        return xykVar == null || xykVar.yd() == null || this.f18236au.yd().my() == null || this.f18236au.yd().my().jrx() == null;
    }

    private List<String> jd(String str) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            if (str.charAt(i12) == '(') {
                i10++;
                z10 = true;
            } else if (str.charAt(i12) == ')' && i10 - 1 == 0 && z10) {
                int i13 = i12 + 1;
                arrayList.add(str.substring(i11, i13));
                i11 = i13;
                z10 = false;
            }
        }
        return arrayList;
    }

    public void jpo(View view) throws JSONException {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f18236au.xyk());
            jSONObject.put("height", this.f18236au.zz());
            if (com.bytedance.sdk.component.adexpress.cm.jd()) {
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.jpo.nmd, this.f51if.dm());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.jpo.f18273rq, this.f18236au.yd().jd());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.jpo.f18275tu, this.f18236au.wqx());
                view.setTag(com.bytedance.sdk.component.adexpress.dynamic.jpo.f18267dt, jSONObject.toString());
                return;
            }
            view.setTag(2097610717, this.f51if.dm());
            view.setTag(2097610715, this.f18236au.yd().jd());
            view.setTag(2097610714, this.f18236au.wqx());
            view.setTag(2097610713, jSONObject.toString());
            int iJpo = com.bytedance.sdk.component.adexpress.dynamic.jd.jpo.jpo(this.f51if);
            if (iJpo == 1) {
                view.setTag(2097610707, new Pair(this.f51if.nq(), Long.valueOf(this.f51if.se())));
                view.setTag(2097610708, Integer.valueOf(iJpo));
            }
        } catch (JSONException unused) {
        }
    }

    public void jd() {
        com.bytedance.sdk.component.adexpress.dynamic.animation.jpo.jd jdVar = this.f18244sq;
        if (jdVar != null) {
            jdVar.jd();
        }
    }

    public Drawable jpo(boolean z10, String str) {
        String[] strArrSplit;
        int[] iArr;
        int iPdm;
        if (!TextUtils.isEmpty(this.f51if.duq())) {
            try {
                String strDuq = this.f51if.duq();
                String strSubstring = strDuq.substring(strDuq.indexOf("(") + 1, strDuq.length() - 1);
                if (strSubstring.contains("rgba") && strSubstring.contains("%")) {
                    strArrSplit = new String[]{strSubstring.substring(0, strSubstring.indexOf(",")).trim(), strSubstring.substring(strSubstring.indexOf(",") + 1, strSubstring.indexOf("%") + 1).trim(), strSubstring.substring(strSubstring.indexOf("%") + 2).trim()};
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.cm.qk.jpo(strArrSplit[1]), com.bytedance.sdk.component.adexpress.dynamic.cm.qk.jpo(strArrSplit[2])};
                } else {
                    strArrSplit = strSubstring.split(", ");
                    iArr = new int[]{com.bytedance.sdk.component.adexpress.dynamic.cm.qk.jpo(strArrSplit[1].substring(0, 7)), com.bytedance.sdk.component.adexpress.dynamic.cm.qk.jpo(strArrSplit[2].substring(0, 7))};
                }
                try {
                    double d10 = Double.parseDouble(strSubstring.substring(strSubstring.indexOf("linear-gradient(") + 1, strSubstring.indexOf("deg")));
                    if (d10 > 225.0d && d10 < 315.0d) {
                        int i10 = iArr[1];
                        iArr[1] = iArr[0];
                        iArr[0] = i10;
                    }
                } catch (Exception unused) {
                }
                GradientDrawable gradientDrawableJpo = jpo(jpo(strArrSplit[0]), iArr);
                gradientDrawableJpo.setShape(0);
                gradientDrawableJpo.setCornerRadius(com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.prr()));
                return gradientDrawableJpo;
            } catch (Exception unused2) {
                Drawable mutilBackgroundDrawable = getMutilBackgroundDrawable();
                if (mutilBackgroundDrawable != null) {
                    return mutilBackgroundDrawable;
                }
            }
        }
        GradientDrawable drawable = getDrawable();
        drawable.setShape(0);
        float fJpo = com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.prr());
        drawable.setCornerRadius(fJpo);
        if (fJpo < 1.0f) {
            float fJpo2 = com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.uu());
            float fJpo3 = com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.sz());
            float fJpo4 = com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.kln());
            float fJpo5 = com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.ef());
            float[] fArr = new float[8];
            if (fJpo2 > 0.0f) {
                fArr[0] = fJpo2;
                fArr[1] = fJpo2;
            }
            if (fJpo3 > 0.0f) {
                fArr[2] = fJpo3;
                fArr[3] = fJpo3;
            }
            if (fJpo4 > 0.0f) {
                fArr[4] = fJpo4;
                fArr[5] = fJpo4;
            }
            if (fJpo5 > 0.0f) {
                fArr[6] = fJpo5;
                fArr[7] = fJpo5;
            }
            drawable.setCornerRadii(fArr);
        }
        if (z10) {
            iPdm = Color.parseColor(str);
        } else {
            iPdm = this.f51if.pdm();
        }
        drawable.setColor(iPdm);
        if (this.f51if.sq() > 0.0f) {
            drawable.setStroke((int) com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.sq()), this.f51if.hna());
        } else if (this.f51if.opi() > 0) {
            drawable.setStroke(this.f51if.opi(), this.f51if.hna());
            drawable.setAlpha(50);
            if (a.v(this.f18236au, "video-vd")) {
                setLayerType(1, null);
                return new jr((int) fJpo, this.f51if.opi());
            }
        }
        return drawable;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
    }

    public jd jpo(Bitmap bitmap) {
        return new jpo(bitmap, null);
    }

    private Drawable[] jpo(List<String> list) {
        Drawable[] drawableArr = new Drawable[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = list.get(i10);
            if (str.contains("linear-gradient")) {
                String[] strArrSplit = str.substring(str.indexOf("(") + 1, str.length() - 1).split(", ");
                int length = strArrSplit.length - 1;
                int[] iArr = new int[length];
                int i11 = 0;
                while (i11 < length) {
                    int i12 = i11 + 1;
                    iArr[i11] = com.bytedance.sdk.component.adexpress.dynamic.cm.qk.jpo(strArrSplit[i12].substring(0, 7));
                    i11 = i12;
                }
                GradientDrawable gradientDrawableJpo = jpo(jpo(strArrSplit[0]), iArr);
                gradientDrawableJpo.setShape(0);
                gradientDrawableJpo.setCornerRadius(com.bytedance.sdk.component.adexpress.cm.qk.jpo(this.f18241ju, this.f51if.prr()));
                drawableArr[(list.size() - 1) - i10] = gradientDrawableJpo;
            }
        }
        return drawableArr;
    }

    public GradientDrawable jpo(GradientDrawable.Orientation orientation, int[] iArr) {
        if (iArr != null && iArr.length != 0) {
            if (iArr.length == 1) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setColor(iArr[0]);
                return gradientDrawable;
            }
            return new GradientDrawable(orientation, iArr);
        }
        return new GradientDrawable();
    }

    public GradientDrawable.Orientation jpo(String str) {
        try {
            int i10 = (int) Float.parseFloat(str.substring(0, str.length() - 3));
            if (i10 <= 90) {
                return GradientDrawable.Orientation.LEFT_RIGHT;
            }
            if (i10 <= 180) {
                return GradientDrawable.Orientation.TOP_BOTTOM;
            }
            if (i10 <= 270) {
                return GradientDrawable.Orientation.RIGHT_LEFT;
            }
            return GradientDrawable.Orientation.BOTTOM_TOP;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.LEFT_RIGHT;
        }
    }

    private void jpo() {
        if (isShown()) {
            int iJpo = com.bytedance.sdk.component.adexpress.dynamic.jd.jpo.jpo(this.f51if);
            if (iJpo == 2) {
                if (this.f18243rq == null) {
                    this.f18243rq = new com.bytedance.sdk.component.utils.hmu(getContext().getApplicationContext(), 1);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my.4
                };
                com.bytedance.sdk.component.adexpress.jd.au renderRequest = this.oya.getRenderRequest();
                if (renderRequest != null) {
                    renderRequest.prr();
                    renderRequest.rq();
                    renderRequest.jr();
                    return;
                }
                return;
            }
            if (iJpo == 3) {
                if (this.f18243rq == null) {
                    this.f18243rq = new com.bytedance.sdk.component.utils.hmu(getContext().getApplicationContext(), 2);
                }
                new Object() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.my.5
                };
                com.bytedance.sdk.component.adexpress.jd.au renderRequest2 = this.oya.getRenderRequest();
                if (renderRequest2 != null) {
                    renderRequest2.sq();
                    renderRequest2.tu();
                    renderRequest2.opi();
                    renderRequest2.nmd();
                }
            }
        }
    }
}

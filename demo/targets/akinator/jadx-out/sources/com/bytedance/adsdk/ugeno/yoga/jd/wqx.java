package com.bytedance.adsdk.ugeno.yoga.jd;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.cm;
import com.bytedance.adsdk.ugeno.jpo.qk;
import com.bytedance.adsdk.ugeno.jpo.xyk;
import com.bytedance.adsdk.ugeno.yoga.au;
import com.bytedance.adsdk.ugeno.yoga.jj;
import com.bytedance.adsdk.ugeno.yoga.ju;
import com.bytedance.adsdk.ugeno.yoga.my;
import com.bytedance.adsdk.ugeno.yoga.oya;
import com.bytedance.adsdk.ugeno.yoga.yd;
import com.bytedance.adsdk.ugeno.yoga.zz;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx extends ViewGroup implements com.bytedance.adsdk.ugeno.jd.jd, qk {

    /* renamed from: cm, reason: collision with root package name */
    private xyk f18029cm;

    /* renamed from: jd, reason: collision with root package name */
    private final yd f18030jd;
    private final Map<View, yd> jpo;
    private cm wqx;

    public wqx(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        yd ydVarJpo;
        this.f18030jd.jpo((com.bytedance.adsdk.ugeno.yoga.qk) null);
        if (view instanceof com.bytedance.adsdk.ugeno.yoga.jd.jd) {
            throw null;
        }
        super.addView(view, i10, layoutParams);
        if (this.jpo.containsKey(view)) {
            return;
        }
        if (view instanceof wqx) {
            ydVarJpo = ((wqx) view).getYogaNode();
        } else {
            ydVarJpo = this.jpo.containsKey(view) ? this.jpo.get(view) : ju.jpo();
            ydVarJpo.jpo(view);
            ydVarJpo.jpo((com.bytedance.adsdk.ugeno.yoga.qk) new jd());
        }
        jpo((jpo) view.getLayoutParams(), ydVarJpo, view);
        this.jpo.put(view, ydVarJpo);
        if (view.getVisibility() == 8) {
            view.setTag(151060224, Integer.valueOf(this.f18030jd.jpo()));
        } else {
            yd ydVar = this.f18030jd;
            ydVar.jpo(ydVarJpo, ydVar.jpo());
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jpo;
    }

    public void cm(View view, int i10) {
        int iJpo;
        view.setVisibility(i10);
        try {
            yd ydVar = this.jpo.get(view);
            Object tag = view.getTag(151060224);
            if (i10 != 0) {
                if (i10 != 8 || (iJpo = this.f18030jd.jpo(ydVar)) == -1) {
                    return;
                }
                this.f18030jd.jd(iJpo);
                view.setTag(151060224, Integer.valueOf(iJpo));
                jpo(this.f18030jd);
                return;
            }
            if (tag == null || this.f18030jd.jpo(ydVar) != -1) {
                return;
            }
            int iIntValue = ((Integer) tag).intValue();
            if (iIntValue < this.f18030jd.jpo()) {
                this.f18030jd.jpo(this.jpo.get(view), iIntValue);
            } else {
                this.f18030jd.jpo(this.jpo.get(view), this.f18030jd.jpo());
            }
            jpo(this.f18030jd);
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.jd(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new jpo(-1, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new jpo(layoutParams);
    }

    public float getBorderRadius() {
        return this.f18029cm.jpo();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getRipple() {
        return this.f18029cm.getRipple();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getRubIn() {
        return this.f18029cm.getRubIn();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getShine() {
        return this.f18029cm.getShine();
    }

    @Override // com.bytedance.adsdk.ugeno.jpo.qk
    public float getStretch() {
        return this.f18029cm.getStretch();
    }

    public yd getYogaNode() {
        return this.f18030jd;
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jd
    public void jd(int i10) {
        yd ydVar = this.f18030jd;
        if (ydVar != null) {
            jd(ydVar, i10);
            requestLayout();
        }
    }

    public yd jpo(View view) {
        return this.jpo.get(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.jpo(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.jj();
        }
        if (!(getParent() instanceof wqx)) {
            jpo(View.MeasureSpec.makeMeasureSpec(i12 - i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i13 - i11, 1073741824));
        }
        jpo(this.f18030jd, 0.0f, 0.0f);
        cm cmVar2 = this.wqx;
        if (cmVar2 != null) {
            cmVar2.jpo(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (!(getParent() instanceof wqx)) {
            jpo(i10, i11);
        }
        cm cmVar = this.wqx;
        if (cmVar != null) {
            int[] iArrJpo = cmVar.jpo(i10, i11);
            setMeasuredDimension(iArrJpo[0], iArrJpo[1]);
        } else {
            setMeasuredDimension(Math.round(this.f18030jd.xyk()), Math.round(this.f18030jd.zz()));
        }
        cm cmVar2 = this.wqx;
        if (cmVar2 != null) {
            cmVar2.my();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        cm cmVar = this.wqx;
        if (cmVar != null) {
            cmVar.jd(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jpo(getChildAt(i10), false);
        }
        super.removeAllViews();
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            jpo(getChildAt(i10), true);
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        jpo(view, false);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i10) {
        jpo(getChildAt(i10), false);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        jpo(view, true);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            jpo(getChildAt(i12), false);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i10, int i11) {
        for (int i12 = i10; i12 < i10 + i11; i12++) {
            jpo(getChildAt(i12), true);
        }
        super.removeViewsInLayout(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        this.f18029cm.jpo(i10);
    }

    public void setBorderRadius(float f10) {
        this.f18029cm.jpo(f10);
    }

    public void setRipple(float f10) {
        xyk xykVar = this.f18029cm;
        if (xykVar != null) {
            xykVar.jd(f10);
        }
    }

    public void setRubIn(float f10) {
        xyk xykVar = this.f18029cm;
        if (xykVar != null) {
            xykVar.my(f10);
        }
    }

    public void setShine(float f10) {
        xyk xykVar = this.f18029cm;
        if (xykVar != null) {
            xykVar.wqx(f10);
        }
    }

    public void setStretch(float f10) {
        xyk xykVar = this.f18029cm;
        if (xykVar != null) {
            xykVar.cm(f10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jd
    public void wqx(View view, int i10) {
        cm(view, i10);
    }

    public wqx(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f18029cm = new xyk(this);
        yd ydVarJpo = ju.jpo();
        this.f18030jd = ydVarJpo;
        this.jpo = new HashMap();
        ydVarJpo.jpo(this);
        ydVarJpo.jpo((com.bytedance.adsdk.ugeno.yoga.qk) new jd());
        jpo((jpo) generateDefaultLayoutParams(), ydVarJpo, this);
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jd
    public void jpo(int i10) {
        yd ydVar = this.f18030jd;
        if (ydVar != null) {
            jpo(ydVar, i10);
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jd
    public void jd(View view, int i10) {
        yd ydVarJpo;
        if (view == null || (ydVarJpo = jpo(view)) == null) {
            return;
        }
        jd(ydVarJpo, i10);
        view.requestLayout();
    }

    @Override // com.bytedance.adsdk.ugeno.jd.jd
    public void jpo(View view, int i10) {
        yd ydVarJpo;
        if (view == null || (ydVarJpo = jpo(view)) == null) {
            return;
        }
        jpo(ydVarJpo, i10);
        view.requestLayout();
    }

    private void jd(yd ydVar, int i10) {
        if (i10 == -1) {
            ydVar.qk(100.0f);
        } else if (i10 == -2) {
            ydVar.my();
        } else {
            ydVar.jj(i10);
        }
    }

    private void jpo(yd ydVar, int i10) {
        if (i10 == -1) {
            ydVar.my(100.0f);
        } else if (i10 == -2) {
            ydVar.cm();
        } else {
            ydVar.cm(i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jd implements com.bytedance.adsdk.ugeno.yoga.qk {
        @Override // com.bytedance.adsdk.ugeno.yoga.qk
        public long jpo(yd ydVar, float f10, com.bytedance.adsdk.ugeno.yoga.xyk xykVar, float f11, com.bytedance.adsdk.ugeno.yoga.xyk xykVar2) {
            View view = (View) ydVar.yd();
            if (view == null || (view instanceof wqx)) {
                return zz.jpo(0, 0);
            }
            view.measure(View.MeasureSpec.makeMeasureSpec((int) f10, jpo(xykVar)), View.MeasureSpec.makeMeasureSpec((int) f11, jpo(xykVar2)));
            return zz.jpo(view.getMeasuredWidth(), view.getMeasuredHeight());
        }

        private int jpo(com.bytedance.adsdk.ugeno.yoga.xyk xykVar) {
            if (xykVar == com.bytedance.adsdk.ugeno.yoga.xyk.AT_MOST) {
                return Integer.MIN_VALUE;
            }
            return xykVar == com.bytedance.adsdk.ugeno.yoga.xyk.EXACTLY ? 1073741824 : 0;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends ViewGroup.LayoutParams {

        /* renamed from: au, reason: collision with root package name */
        private float f18031au;

        /* renamed from: cm, reason: collision with root package name */
        private float f18032cm;
        private float hna;

        /* renamed from: if, reason: not valid java name */
        private float f45if;

        /* renamed from: jd, reason: collision with root package name */
        SparseArray<String> f18033jd;

        /* renamed from: jj, reason: collision with root package name */
        private float f18034jj;
        SparseArray<Float> jpo;

        /* renamed from: jr, reason: collision with root package name */
        private float f18035jr;

        /* renamed from: ju, reason: collision with root package name */
        private float f18036ju;
        private float my;
        private float opi;
        private float oya;
        private float prr;

        /* renamed from: qk, reason: collision with root package name */
        private float f18037qk;

        /* renamed from: sq, reason: collision with root package name */
        private float f18038sq;
        private float wqx;
        private float xyk;

        /* renamed from: yd, reason: collision with root package name */
        private float f18039yd;
        private float zz;

        public jpo(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            if (layoutParams instanceof jpo) {
                jpo jpoVar = (jpo) layoutParams;
                this.jpo = jpoVar.jpo.clone();
                this.f18033jd = jpoVar.f18033jd.clone();
                return;
            }
            this.jpo = new SparseArray<>();
            this.f18033jd = new SparseArray<>();
            if (layoutParams.width >= 0) {
                this.jpo.put(15, Float.valueOf(((ViewGroup.LayoutParams) this).width));
            }
            if (layoutParams.height >= 0) {
                this.jpo.put(16, Float.valueOf(((ViewGroup.LayoutParams) this).height));
            }
        }

        public void au(float f10) {
            this.my = f10;
            this.jpo.put(19, Float.valueOf(f10));
        }

        public void cm(float f10) {
            this.f18039yd = f10;
            this.jpo.put(8, Float.valueOf(f10));
        }

        public void hna(float f10) {
            this.opi = f10;
            this.jpo.put(27, Float.valueOf(f10));
        }

        /* renamed from: if, reason: not valid java name */
        public void m396if(float f10) {
            this.f18032cm = f10;
            this.jpo.put(18, Float.valueOf(f10));
        }

        public void jd(float f10) {
            this.xyk = f10;
            this.jpo.put(6, Float.valueOf(f10));
        }

        public void jj(float f10) {
            this.f45if = f10;
            this.jpo.put(14, Float.valueOf(f10));
        }

        public void jpo(float f10) {
            this.f18037qk = f10;
            this.jpo.put(5, Float.valueOf(f10));
        }

        public void ju(float f10) {
            this.wqx = f10;
            this.jpo.put(17, Float.valueOf(f10));
        }

        public void my(float f10) {
            this.f18036ju = f10;
            this.jpo.put(9, Float.valueOf(f10));
        }

        public void oya(float f10) {
            this.f18034jj = f10;
            this.jpo.put(20, Float.valueOf(f10));
        }

        public void prr(float f10) {
            this.f18038sq = f10;
            this.jpo.put(25, Float.valueOf(f10));
        }

        public void qk(float f10) {
            this.f18031au = f10;
            this.jpo.put(10, Float.valueOf(f10));
        }

        public void sq(float f10) {
            this.f18035jr = f10;
            this.jpo.put(28, Float.valueOf(f10));
        }

        public void wqx(float f10) {
            this.zz = f10;
            this.jpo.put(7, Float.valueOf(f10));
        }

        public void xyk(float f10) {
            this.oya = f10;
            this.jpo.put(11, Float.valueOf(f10));
        }

        public void yd(float f10) {
            this.hna = f10;
            this.jpo.put(13, Float.valueOf(f10));
        }

        public void zz(float f10) {
            this.prr = f10;
            this.jpo.put(12, Float.valueOf(f10));
        }

        public jpo(int i10, int i11) {
            super(i10, i11);
            this.jpo = new SparseArray<>();
            this.f18033jd = new SparseArray<>();
            if (i10 == -2 || i10 == -1 || i10 >= 0) {
                this.jpo.put(15, Float.valueOf(i10));
            }
            if (i11 == -2 || i11 == -1 || i11 >= 0) {
                this.jpo.put(16, Float.valueOf(i11));
            }
        }
    }

    private void jpo(yd ydVar) {
        if (ydVar.jd() != null) {
            jpo(ydVar.jd());
        } else {
            ydVar.jpo(Float.NaN, Float.NaN);
        }
    }

    private void jpo(View view, boolean z10) {
        yd ydVar = this.jpo.get(view);
        if (ydVar == null) {
            return;
        }
        yd ydVarJd = ydVar.jd();
        int i10 = 0;
        while (true) {
            if (i10 >= ydVarJd.jpo()) {
                break;
            }
            if (ydVarJd.jpo(i10).equals(ydVar)) {
                ydVarJd.jd(i10);
                break;
            }
            i10++;
        }
        ydVar.jpo((Object) null);
        this.jpo.remove(view);
        if (z10) {
            this.f18030jd.jpo(Float.NaN, Float.NaN);
        }
    }

    private void jpo(yd ydVar, float f10, float f11) {
        View view = (View) ydVar.yd();
        if (view != null && view != this) {
            if (view.getVisibility() == 8) {
                return;
            }
            int iRound = Math.round(ydVar.jj() + f10);
            int iRound2 = Math.round(ydVar.qk() + f11);
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.round(ydVar.xyk()), 1073741824), View.MeasureSpec.makeMeasureSpec(Math.round(ydVar.zz()), 1073741824));
            view.layout(iRound, iRound2, view.getMeasuredWidth() + iRound, view.getMeasuredHeight() + iRound2);
        }
        int iJpo = ydVar.jpo();
        for (int i10 = 0; i10 < iJpo; i10++) {
            if (equals(view)) {
                jpo(ydVar.jpo(i10), f10, f11);
            } else if (!(view instanceof wqx)) {
                jpo(ydVar.jpo(i10), ydVar.jj() + f10, ydVar.qk() + f11);
            }
        }
    }

    private void jpo(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode2 == 1073741824) {
            this.f18030jd.jj(size2);
        }
        if (mode == 1073741824) {
            this.f18030jd.cm(size);
        }
        if (mode2 == Integer.MIN_VALUE) {
            this.f18030jd.ju(size2);
        }
        if (mode == Integer.MIN_VALUE) {
            this.f18030jd.yd(size);
        }
        this.f18030jd.jpo(Float.NaN, Float.NaN);
    }

    public static void jpo(jpo jpoVar, yd ydVar, View view) {
        if (view.getResources().getConfiguration().getLayoutDirection() == 1) {
            ydVar.jpo(com.bytedance.adsdk.ugeno.yoga.wqx.RTL);
        }
        Drawable background = view.getBackground();
        if (background != null) {
            if (background.getPadding(new Rect())) {
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.cm.LEFT, r0.left);
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.cm.TOP, r0.top);
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.cm.RIGHT, r0.right);
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.cm.BOTTOM, r0.bottom);
            }
        }
        for (int i10 = 0; i10 < jpoVar.jpo.size(); i10++) {
            int iKeyAt = jpoVar.jpo.keyAt(i10);
            float fFloatValue = jpoVar.jpo.valueAt(i10).floatValue();
            if (iKeyAt == 4) {
                ydVar.wqx(com.bytedance.adsdk.ugeno.yoga.jpo.jpo(Math.round(fFloatValue)));
            } else if (iKeyAt == 0) {
                ydVar.jpo(com.bytedance.adsdk.ugeno.yoga.jpo.jpo(Math.round(fFloatValue)));
            } else if (iKeyAt == 9) {
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.jpo.jpo(Math.round(fFloatValue)));
            } else if (iKeyAt == 25) {
                ydVar.mo393if(fFloatValue);
            } else if (iKeyAt == 8) {
                if (fFloatValue < 0.0f) {
                    ydVar.wqx();
                } else {
                    ydVar.wqx(fFloatValue);
                }
            } else if (iKeyAt == 1) {
                ydVar.jpo(my.jpo(Math.round(fFloatValue)));
            } else if (iKeyAt == 6) {
                ydVar.jpo(fFloatValue);
            } else if (iKeyAt == 7) {
                ydVar.jd(fFloatValue);
            } else if (iKeyAt == 16) {
                if (fFloatValue == -1.0f) {
                    ydVar.qk(100.0f);
                } else if (fFloatValue == -2.0f) {
                    ydVar.my();
                } else {
                    ydVar.jj(fFloatValue);
                }
            } else if (iKeyAt == 18) {
                ydVar.jpo(com.bytedance.adsdk.ugeno.yoga.cm.LEFT, fFloatValue);
            } else if (iKeyAt == 3) {
                ydVar.jpo(jj.jpo(Math.round(fFloatValue)));
            } else if (iKeyAt == 17) {
                ydVar.jpo(com.bytedance.adsdk.ugeno.yoga.cm.TOP, fFloatValue);
            } else if (iKeyAt == 20) {
                ydVar.jpo(com.bytedance.adsdk.ugeno.yoga.cm.RIGHT, fFloatValue);
            } else if (iKeyAt == 19) {
                ydVar.jpo(com.bytedance.adsdk.ugeno.yoga.cm.BOTTOM, fFloatValue);
            } else if (iKeyAt == 28) {
                ydVar.zz(fFloatValue);
            } else if (iKeyAt == 27) {
                ydVar.xyk(fFloatValue);
            } else if (iKeyAt == 22) {
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.cm.LEFT, fFloatValue);
            } else if (iKeyAt == 21) {
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.cm.TOP, fFloatValue);
            } else if (iKeyAt == 24) {
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.cm.RIGHT, fFloatValue);
            } else if (iKeyAt == 23) {
                ydVar.jd(com.bytedance.adsdk.ugeno.yoga.cm.BOTTOM, fFloatValue);
            } else if (iKeyAt == 11) {
                ydVar.wqx(com.bytedance.adsdk.ugeno.yoga.cm.LEFT, fFloatValue);
            } else if (iKeyAt == 10) {
                ydVar.wqx(com.bytedance.adsdk.ugeno.yoga.cm.TOP, fFloatValue);
            } else if (iKeyAt == 13) {
                ydVar.wqx(com.bytedance.adsdk.ugeno.yoga.cm.RIGHT, fFloatValue);
            } else if (iKeyAt == 12) {
                ydVar.wqx(com.bytedance.adsdk.ugeno.yoga.cm.BOTTOM, fFloatValue);
            } else if (iKeyAt == 14) {
                ydVar.jpo(au.jpo(Math.round(fFloatValue)));
            } else if (iKeyAt == 15) {
                if (fFloatValue == -1.0f) {
                    ydVar.my(100.0f);
                } else if (fFloatValue == -2.0f) {
                    ydVar.cm();
                } else {
                    ydVar.cm(fFloatValue);
                }
            } else if (iKeyAt == 2) {
                ydVar.jpo(oya.jpo(Math.round(fFloatValue)));
            }
        }
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        this.wqx = wqxVar;
    }
}

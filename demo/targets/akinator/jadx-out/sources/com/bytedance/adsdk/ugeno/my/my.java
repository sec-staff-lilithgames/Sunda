package com.bytedance.adsdk.ugeno.my;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.app.NotificationCompat;
import com.bytedance.adsdk.ugeno.my.cm;
import com.bytedance.adsdk.ugeno.qk.qk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends ViewGroup implements com.bytedance.adsdk.ugeno.my.jpo {

    /* renamed from: au, reason: collision with root package name */
    private int[] f17935au;

    /* renamed from: cm, reason: collision with root package name */
    private int f17936cm;
    private List<wqx> hna;

    /* renamed from: if, reason: not valid java name */
    private int f42if;

    /* renamed from: jd, reason: collision with root package name */
    private int f17937jd;

    /* renamed from: jj, reason: collision with root package name */
    private int f17938jj;
    private int jpo;

    /* renamed from: ju, reason: collision with root package name */
    private int f17939ju;
    private int my;
    private cm.jpo opi;
    private SparseIntArray oya;
    private cm prr;

    /* renamed from: qk, reason: collision with root package name */
    private Drawable f17940qk;

    /* renamed from: sq, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.cm f17941sq;
    private int wqx;
    private Drawable xyk;

    /* renamed from: yd, reason: collision with root package name */
    private int f17942yd;
    private int zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo extends ViewGroup.MarginLayoutParams implements jd {
        public static final Parcelable.Creator<jpo> CREATOR = new Parcelable.Creator<jpo>() { // from class: com.bytedance.adsdk.ugeno.my.my.jpo.1
            @Override // android.os.Parcelable.Creator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public jpo createFromParcel(Parcel parcel) {
                return new jpo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public jpo[] newArray(int i10) {
                return new jpo[i10];
            }
        };

        /* renamed from: cm, reason: collision with root package name */
        private int f17943cm;

        /* renamed from: jd, reason: collision with root package name */
        private float f17944jd;

        /* renamed from: jj, reason: collision with root package name */
        private int f17945jj;
        private int jpo;
        private float my;

        /* renamed from: qk, reason: collision with root package name */
        private int f17946qk;
        private float wqx;
        private int xyk;

        /* renamed from: yd, reason: collision with root package name */
        private boolean f17947yd;
        private int zz;

        public jpo(jpo jpoVar) {
            super((ViewGroup.MarginLayoutParams) jpoVar);
            this.jpo = 1;
            this.f17944jd = 0.0f;
            this.wqx = 0.0f;
            this.f17943cm = -1;
            this.my = -1.0f;
            this.f17945jj = -1;
            this.f17946qk = -1;
            this.xyk = 16777215;
            this.zz = 16777215;
            this.jpo = jpoVar.jpo;
            this.f17944jd = jpoVar.f17944jd;
            this.wqx = jpoVar.wqx;
            this.f17943cm = jpoVar.f17943cm;
            this.my = jpoVar.my;
            this.f17945jj = jpoVar.f17945jj;
            this.f17946qk = jpoVar.f17946qk;
            this.xyk = jpoVar.xyk;
            this.zz = jpoVar.zz;
            this.f17947yd = jpoVar.f17947yd;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int au() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public float cm() {
            return this.f17944jd;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int hna() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        /* renamed from: if */
        public float mo391if() {
            return this.my;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int jd() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int jj() {
            return this.f17943cm;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int jpo() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public boolean ju() {
            return this.f17947yd;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public float my() {
            return this.wqx;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int oya() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int prr() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int qk() {
            return this.f17945jj;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int wqx() {
            return this.jpo;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.jpo);
            parcel.writeFloat(this.f17944jd);
            parcel.writeFloat(this.wqx);
            parcel.writeInt(this.f17943cm);
            parcel.writeFloat(this.my);
            parcel.writeInt(this.f17945jj);
            parcel.writeInt(this.f17946qk);
            parcel.writeInt(this.xyk);
            parcel.writeInt(this.zz);
            parcel.writeByte(this.f17947yd ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int xyk() {
            return this.f17946qk;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int yd() {
            return this.zz;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public int zz() {
            return this.xyk;
        }

        public void cm(int i10) {
            this.f17943cm = i10;
        }

        public void jd(float f10) {
            this.wqx = f10;
        }

        public void jpo(float f10) {
            this.f17944jd = f10;
        }

        public void wqx(int i10) {
            this.jpo = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public void jd(int i10) {
            this.f17946qk = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.my.jd
        public void jpo(int i10) {
            this.f17945jj = i10;
        }

        public void wqx(float f10) {
            this.my = f10;
        }

        public jpo(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.jpo = 1;
            this.f17944jd = 0.0f;
            this.wqx = 0.0f;
            this.f17943cm = -1;
            this.my = -1.0f;
            this.f17945jj = -1;
            this.f17946qk = -1;
            this.xyk = 16777215;
            this.zz = 16777215;
        }

        public jpo(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.jpo = 1;
            this.f17944jd = 0.0f;
            this.wqx = 0.0f;
            this.f17943cm = -1;
            this.my = -1.0f;
            this.f17945jj = -1;
            this.f17946qk = -1;
            this.xyk = 16777215;
            this.zz = 16777215;
        }

        public jpo(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.jpo = 1;
            this.f17944jd = 0.0f;
            this.wqx = 0.0f;
            this.f17943cm = -1;
            this.my = -1.0f;
            this.f17945jj = -1;
            this.f17946qk = -1;
            this.xyk = 16777215;
            this.zz = 16777215;
        }

        public jpo(Parcel parcel) {
            super(0, 0);
            this.jpo = 1;
            this.f17944jd = 0.0f;
            this.wqx = 0.0f;
            this.f17943cm = -1;
            this.my = -1.0f;
            this.f17945jj = -1;
            this.f17946qk = -1;
            this.xyk = 16777215;
            this.zz = 16777215;
            this.jpo = parcel.readInt();
            this.f17944jd = parcel.readFloat();
            this.wqx = parcel.readFloat();
            this.f17943cm = parcel.readInt();
            this.my = parcel.readFloat();
            this.f17945jj = parcel.readInt();
            this.f17946qk = parcel.readInt();
            this.xyk = parcel.readInt();
            this.zz = parcel.readInt();
            this.f17947yd = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public my(Context context) {
        super(context, null);
        this.f17938jj = -1;
        this.prr = new cm(this);
        this.hna = new ArrayList();
        this.opi = new cm.jpo();
    }

    private boolean cm(int i10, int i11) {
        return my(i10, i11) ? jpo() ? (this.f17942yd & 1) != 0 : (this.zz & 1) != 0 : jpo() ? (this.f17942yd & 2) != 0 : (this.zz & 2) != 0;
    }

    private boolean jj(int i10) {
        if (i10 >= 0 && i10 < this.hna.size()) {
            for (int i11 = i10 + 1; i11 < this.hna.size(); i11++) {
                if (this.hna.get(i11).jd() > 0) {
                    return false;
                }
            }
            if (jpo()) {
                return (this.zz & 4) != 0;
            }
            if ((this.f17942yd & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean my(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewWqx = wqx(i10 - i12);
            if (viewWqx != null && viewWqx.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.oya == null) {
            this.oya = new SparseIntArray(getChildCount());
        }
        this.f17935au = this.prr.jpo(view, i10, layoutParams, this.oya);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jpo;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof jpo ? new jpo((jpo) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new jpo((ViewGroup.MarginLayoutParams) layoutParams) : new jpo(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int getAlignContent() {
        return this.my;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int getAlignItems() {
        return this.f17936cm;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f17940qk;
    }

    public Drawable getDividerDrawableVertical() {
        return this.xyk;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int getFlexDirection() {
        return this.jpo;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<wqx> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.hna.size());
        for (wqx wqxVar : this.hna) {
            if (wqxVar.jd() != 0) {
                arrayList.add(wqxVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public List<wqx> getFlexLinesInternal() {
        return this.hna;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int getFlexWrap() {
        return this.f17937jd;
    }

    public int getJustifyContent() {
        return this.wqx;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int getLargestMainSize() {
        Iterator<wqx> it = this.hna.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().my);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int getMaxLine() {
        return this.f17938jj;
    }

    public int getShowDividerHorizontal() {
        return this.zz;
    }

    public int getShowDividerVertical() {
        return this.f17942yd;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int getSumOfCrossSize() {
        int size = this.hna.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            wqx wqxVar = this.hna.get(i11);
            if (cm(i11)) {
                i10 += jpo() ? this.f17939ju : this.f42if;
            }
            if (jj(i11)) {
                i10 += jpo() ? this.f17939ju : this.f42if;
            }
            i10 += wqxVar.f17953qk;
        }
        return i10;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public View jd(int i10) {
        return wqx(i10);
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int jpo(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17941sq;
        if (cmVar != null) {
            cmVar.qk();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17941sq;
        if (cmVar != null) {
            cmVar.xyk();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.xyk == null && this.f17940qk == null) {
            return;
        }
        if (this.zz == 0 && this.f17942yd == 0) {
            return;
        }
        int iJpo = qk.jpo(this);
        int i10 = this.jpo;
        if (i10 == 0) {
            jpo(canvas, iJpo == 1, this.f17937jd == 2);
            return;
        }
        if (i10 == 1) {
            jpo(canvas, iJpo != 1, this.f17937jd == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iJpo == 1;
            if (this.f17937jd == 2) {
                z10 = !z10;
            }
            jd(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iJpo == 1;
        if (this.f17937jd == 2) {
            z11 = !z11;
        }
        jd(canvas, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        my myVar;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        my myVar2;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z13;
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17941sq;
        if (cmVar != null) {
            cmVar.jj();
        }
        int iJpo = qk.jpo(this);
        int i22 = this.jpo;
        if (i22 == 0) {
            if (iJpo == 1) {
                z11 = true;
                myVar = this;
                i14 = i10;
                i17 = i11;
                i16 = i13;
                i15 = i12;
            } else {
                z11 = false;
                myVar = this;
                i14 = i10;
                i15 = i12;
                i16 = i13;
                i17 = i11;
            }
            myVar.jpo(z11, i14, i17, i15, i16);
        } else if (i22 == 1) {
            if (iJpo != 1) {
                z12 = true;
                myVar2 = this;
                i18 = i10;
                i21 = i11;
                i20 = i13;
                i19 = i12;
            } else {
                z12 = false;
                myVar2 = this;
                i18 = i10;
                i19 = i12;
                i20 = i13;
                i21 = i11;
            }
            myVar2.jpo(z12, i18, i21, i19, i20);
        } else if (i22 == 2) {
            z13 = iJpo == 1;
            if (this.f17937jd == 2) {
                z13 = !z13;
            }
            jpo(z13, false, i10, i11, i12, i13);
        } else {
            if (i22 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.jpo);
            }
            z13 = iJpo == 1;
            if (this.f17937jd == 2) {
                z13 = !z13;
            }
            jpo(z13, true, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.cm cmVar2 = this.f17941sq;
        if (cmVar2 != null) {
            cmVar2.jpo(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17941sq;
        if (cmVar != null) {
            int[] iArrJpo = cmVar.jpo(i10, i11);
            jpo(iArrJpo[0], iArrJpo[1]);
        } else {
            jpo(i10, i11);
        }
        com.bytedance.adsdk.ugeno.cm cmVar2 = this.f17941sq;
        if (cmVar2 != null) {
            cmVar2.my();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.cm cmVar = this.f17941sq;
        if (cmVar != null) {
            cmVar.jd(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public void setAlignContent(int i10) {
        if (this.my != i10) {
            this.my = i10;
            requestLayout();
        }
    }

    public void setAlignItems(int i10) {
        if (this.f17936cm != i10) {
            this.f17936cm = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.f17940qk) {
            return;
        }
        this.f17940qk = drawable;
        if (drawable != null) {
            this.f17939ju = drawable.getIntrinsicHeight();
        } else {
            this.f17939ju = 0;
        }
        jd();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.xyk) {
            return;
        }
        this.xyk = drawable;
        if (drawable != null) {
            this.f42if = drawable.getIntrinsicWidth();
        } else {
            this.f42if = 0;
        }
        jd();
        requestLayout();
    }

    public void setFlexDirection(int i10) {
        if (this.jpo != i10) {
            this.jpo = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public void setFlexLines(List<wqx> list) {
        this.hna = list;
    }

    public void setFlexWrap(int i10) {
        if (this.f17937jd != i10) {
            this.f17937jd = i10;
            requestLayout();
        }
    }

    public void setJustifyContent(int i10) {
        if (this.wqx != i10) {
            this.wqx = i10;
            requestLayout();
        }
    }

    public void setMaxLine(int i10) {
        if (this.f17938jj != i10) {
            this.f17938jj = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.zz) {
            this.zz = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f17942yd) {
            this.f17942yd = i10;
            requestLayout();
        }
    }

    public View wqx(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.f17935au;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    private void jd(int i10, int i11) {
        this.hna.clear();
        this.opi.jpo();
        this.prr.jpo(this.opi, i10, i11);
        this.hna = this.opi.jpo;
        this.prr.jpo(i10, i11);
        if (this.f17936cm == 3) {
            for (wqx wqxVar : this.hna) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < wqxVar.xyk; i12++) {
                    View viewWqx = wqx(wqxVar.prr + i12);
                    if (viewWqx != null && viewWqx.getVisibility() != 8) {
                        jpo jpoVar = (jpo) viewWqx.getLayoutParams();
                        iMax = this.f17937jd != 2 ? Math.max(iMax, viewWqx.getMeasuredHeight() + Math.max(wqxVar.f43if - viewWqx.getBaseline(), ((ViewGroup.MarginLayoutParams) jpoVar).topMargin) + ((ViewGroup.MarginLayoutParams) jpoVar).bottomMargin) : Math.max(iMax, viewWqx.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) jpoVar).topMargin + Math.max(viewWqx.getBaseline() + (wqxVar.f43if - viewWqx.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) jpoVar).bottomMargin));
                    }
                }
                wqxVar.f17953qk = iMax;
            }
        }
        this.prr.jd(i10, i11, getPaddingBottom() + getPaddingTop());
        this.prr.jpo();
        jpo(this.jpo, i10, i11, this.opi.f17927jd);
    }

    private void jpo(int i10, int i11) {
        if (this.oya == null) {
            this.oya = new SparseIntArray(getChildCount());
        }
        if (this.prr.jd(this.oya)) {
            this.f17935au = this.prr.jpo(this.oya);
        }
        int i12 = this.jpo;
        if (i12 == 0 || i12 == 1) {
            jd(i10, i11);
        } else if (i12 == 2 || i12 == 3) {
            wqx(i10, i11);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.jpo);
        }
    }

    private boolean my(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.hna.get(i11).jd() > 0) {
                return false;
            }
        }
        return true;
    }

    private void wqx(int i10, int i11) {
        this.hna.clear();
        this.opi.jpo();
        this.prr.jd(this.opi, i10, i11);
        this.hna = this.opi.jpo;
        this.prr.jpo(i10, i11);
        this.prr.jd(i10, i11, getPaddingRight() + getPaddingLeft());
        this.prr.jpo();
        jpo(this.jpo, i10, i11, this.opi.f17927jd);
    }

    private boolean cm(int i10) {
        if (i10 >= 0 && i10 < this.hna.size()) {
            if (my(i10)) {
                return jpo() ? (this.zz & 1) != 0 : (this.f17942yd & 1) != 0;
            }
            if (jpo()) {
                return (this.zz & 2) != 0;
            }
            if ((this.f17942yd & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public View jpo(int i10) {
        return getChildAt(i10);
    }

    private void jpo(int i10, int i11, int i12, int i13) {
        int paddingBottom;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else if (mode == 1073741824) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else {
            throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, NotificationCompat.FLAG_LOCAL_ONLY);
            } else {
                size2 = paddingBottom;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i12, i13);
        } else if (mode2 == 1073741824) {
            if (size2 < paddingBottom) {
                i13 = View.combineMeasuredStates(i13, NotificationCompat.FLAG_LOCAL_ONLY);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else {
            throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    private void jd(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.hna.size();
        for (int i12 = 0; i12 < size; i12++) {
            wqx wqxVar = this.hna.get(i12);
            for (int i13 = 0; i13 < wqxVar.xyk; i13++) {
                int i14 = wqxVar.prr + i13;
                View viewWqx = wqx(i14);
                if (viewWqx != null && viewWqx.getVisibility() != 8) {
                    jpo jpoVar = (jpo) viewWqx.getLayoutParams();
                    if (cm(i14, i13)) {
                        if (z11) {
                            top = viewWqx.getBottom() + ((ViewGroup.MarginLayoutParams) jpoVar).bottomMargin;
                        } else {
                            top = (viewWqx.getTop() - ((ViewGroup.MarginLayoutParams) jpoVar).topMargin) - this.f17939ju;
                        }
                        jd(canvas, wqxVar.jpo, top, wqxVar.f17953qk);
                    }
                    if (i13 == wqxVar.xyk - 1 && (this.zz & 4) > 0) {
                        if (z11) {
                            bottom = (viewWqx.getTop() - ((ViewGroup.MarginLayoutParams) jpoVar).topMargin) - this.f17939ju;
                        } else {
                            bottom = viewWqx.getBottom() + ((ViewGroup.MarginLayoutParams) jpoVar).bottomMargin;
                        }
                        jd(canvas, wqxVar.jpo, bottom, wqxVar.f17953qk);
                    }
                }
            }
            if (cm(i12)) {
                if (z10) {
                    i11 = wqxVar.wqx;
                } else {
                    i11 = wqxVar.jpo - this.f42if;
                }
                jpo(canvas, i11, paddingTop, iMax);
            }
            if (jj(i12) && (this.f17942yd & 4) > 0) {
                if (z10) {
                    i10 = wqxVar.jpo - this.f42if;
                } else {
                    i10 = wqxVar.wqx;
                }
                jpo(canvas, i10, paddingTop, iMax);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public boolean jpo() {
        int i10 = this.jpo;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(boolean r25, int r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.my.my.jpo(boolean, int, int, int, int):void");
    }

    private void jd(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f17940qk;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f17939ju + i11);
        this.f17940qk.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int jd(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void jd() {
        if (this.f17940qk == null && this.xyk == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void jpo(boolean r25, boolean r26, int r27, int r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ugeno.my.my.jpo(boolean, boolean, int, int, int, int):void");
    }

    private void jpo(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.hna.size();
        for (int i12 = 0; i12 < size; i12++) {
            wqx wqxVar = this.hna.get(i12);
            for (int i13 = 0; i13 < wqxVar.xyk; i13++) {
                int i14 = wqxVar.prr + i13;
                View viewWqx = wqx(i14);
                if (viewWqx != null && viewWqx.getVisibility() != 8) {
                    jpo jpoVar = (jpo) viewWqx.getLayoutParams();
                    if (cm(i14, i13)) {
                        if (z10) {
                            left = viewWqx.getRight() + ((ViewGroup.MarginLayoutParams) jpoVar).rightMargin;
                        } else {
                            left = (viewWqx.getLeft() - ((ViewGroup.MarginLayoutParams) jpoVar).leftMargin) - this.f42if;
                        }
                        jpo(canvas, left, wqxVar.f17950jd, wqxVar.f17953qk);
                    }
                    if (i13 == wqxVar.xyk - 1 && (this.f17942yd & 4) > 0) {
                        if (z10) {
                            right = (viewWqx.getLeft() - ((ViewGroup.MarginLayoutParams) jpoVar).leftMargin) - this.f42if;
                        } else {
                            right = viewWqx.getRight() + ((ViewGroup.MarginLayoutParams) jpoVar).rightMargin;
                        }
                        jpo(canvas, right, wqxVar.f17950jd, wqxVar.f17953qk);
                    }
                }
            }
            if (cm(i12)) {
                if (z11) {
                    i11 = wqxVar.f17949cm;
                } else {
                    i11 = wqxVar.f17950jd - this.f17939ju;
                }
                jd(canvas, paddingLeft, i11, iMax);
            }
            if (jj(i12) && (this.zz & 4) > 0) {
                if (z11) {
                    i10 = wqxVar.f17950jd - this.f17939ju;
                } else {
                    i10 = wqxVar.f17949cm;
                }
                jd(canvas, paddingLeft, i10, iMax);
            }
        }
    }

    private void jpo(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.xyk;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f42if + i10, i12 + i11);
        this.xyk.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int jpo(View view, int i10, int i11) {
        int i12;
        int i13;
        if (jpo()) {
            i12 = cm(i10, i11) ? this.f42if : 0;
            if ((this.f17942yd & 4) <= 0) {
                return i12;
            }
            i13 = this.f42if;
        } else {
            i12 = cm(i10, i11) ? this.f17939ju : 0;
            if ((this.zz & 4) <= 0) {
                return i12;
            }
            i13 = this.f17939ju;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public void jpo(wqx wqxVar) {
        if (jpo()) {
            if ((this.f17942yd & 4) > 0) {
                int i10 = wqxVar.my;
                int i11 = this.f42if;
                wqxVar.my = i10 + i11;
                wqxVar.f17951jj += i11;
                return;
            }
            return;
        }
        if ((this.zz & 4) > 0) {
            int i12 = wqxVar.my;
            int i13 = this.f17939ju;
            wqxVar.my = i12 + i13;
            wqxVar.f17951jj += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public int jpo(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.my.jpo
    public void jpo(View view, int i10, int i11, wqx wqxVar) {
        if (cm(i10, i11)) {
            if (jpo()) {
                int i12 = wqxVar.my;
                int i13 = this.f42if;
                wqxVar.my = i12 + i13;
                wqxVar.f17951jj += i13;
                return;
            }
            int i14 = wqxVar.my;
            int i15 = this.f17939ju;
            wqxVar.my = i14 + i15;
            wqxVar.f17951jj += i15;
        }
    }

    public void jpo(com.bytedance.adsdk.ugeno.jd.wqx wqxVar) {
        this.f17941sq = wqxVar;
    }
}

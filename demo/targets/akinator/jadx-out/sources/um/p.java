package um;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class p implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public Integer f88616b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f88617c;

    /* renamed from: e, reason: collision with root package name */
    public Boolean f88618e;

    /* renamed from: f, reason: collision with root package name */
    public Boolean f88619f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f88620g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f88621h;

    /* renamed from: i, reason: collision with root package name */
    public String f88622i;

    /* renamed from: j, reason: collision with root package name */
    public Float f88623j;

    /* renamed from: k, reason: collision with root package name */
    public Float f88624k;

    /* renamed from: l, reason: collision with root package name */
    public Integer f88625l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f88626m;

    /* renamed from: n, reason: collision with root package name */
    public Integer f88627n;

    /* renamed from: o, reason: collision with root package name */
    public Integer f88628o;

    /* renamed from: p, reason: collision with root package name */
    public Integer f88629p;

    /* renamed from: q, reason: collision with root package name */
    public Integer f88630q;

    /* renamed from: r, reason: collision with root package name */
    public Integer f88631r;

    /* renamed from: s, reason: collision with root package name */
    public Integer f88632s;

    /* renamed from: t, reason: collision with root package name */
    public String f88633t;

    /* renamed from: u, reason: collision with root package name */
    public Float f88634u;

    /* renamed from: v, reason: collision with root package name */
    public Float f88635v;

    /* renamed from: w, reason: collision with root package name */
    public Float f88636w;

    /* renamed from: x, reason: collision with root package name */
    public Integer f88637x;

    /* renamed from: y, reason: collision with root package name */
    public Float f88638y;

    public p() {
    }

    public void applyAlignment(FrameLayout.LayoutParams layoutParams) {
        layoutParams.gravity = positionAsGravity();
    }

    public void applyMargin(Context context, ViewGroup.MarginLayoutParams marginLayoutParams) {
        marginLayoutParams.leftMargin = getMarginLeft(context).intValue();
        marginLayoutParams.topMargin = getMarginTop(context).intValue();
        marginLayoutParams.rightMargin = getMarginRight(context).intValue();
        marginLayoutParams.bottomMargin = getMarginBottom(context).intValue();
    }

    public void applyPadding(Context context, View view) {
        view.setPadding(getPaddingLeft(context).intValue(), getPaddingTop(context).intValue(), getPaddingRight(context).intValue(), getPaddingBottom(context).intValue());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void applyRelativeAlignment(android.widget.RelativeLayout.LayoutParams r4) {
        /*
            r3 = this;
            java.lang.Integer r0 = r3.getHorizontalPosition()
            int r0 = r0.intValue()
            r1 = 1
            r2 = 17
            if (r0 == r1) goto L22
            r1 = 3
            if (r0 == r1) goto L1c
            r1 = 5
            if (r0 == r1) goto L16
            if (r0 == r2) goto L22
            goto L27
        L16:
            r0 = 11
            r4.addRule(r0)
            goto L27
        L1c:
            r0 = 9
            r4.addRule(r0)
            goto L27
        L22:
            r0 = 14
            r4.addRule(r0)
        L27:
            java.lang.Integer r0 = r3.getVerticalPosition()
            int r0 = r0.intValue()
            r1 = 16
            if (r0 == r1) goto L4a
            if (r0 == r2) goto L4a
            r1 = 48
            if (r0 == r1) goto L44
            r1 = 80
            if (r0 == r1) goto L3e
            return
        L3e:
            r0 = 12
            r4.addRule(r0)
            return
        L44:
            r0 = 10
            r4.addRule(r0)
            return
        L4a:
            r0 = 15
            r4.addRule(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um.p.applyRelativeAlignment(android.widget.RelativeLayout$LayoutParams):void");
    }

    public p copyWith(p pVar) {
        p pVar2 = new p();
        pVar2.merge(this);
        pVar2.merge(pVar);
        return pVar2;
    }

    public String getContent() {
        return this.f88633t;
    }

    public Integer getFillColor() {
        Integer num = this.f88617c;
        return num != null ? num : Integer.valueOf(a.f88523b);
    }

    public Float getFontSize(Context context) {
        return this.f88638y != null ? Float.valueOf(h0.dpToPx(context, r0.floatValue())) : Float.valueOf(h0.dpToPx(context, 16.0f));
    }

    public Integer getFontStyle() {
        Integer num = this.f88637x;
        if (num != null) {
            return num;
        }
        return 0;
    }

    public Integer getHeight(Context context) {
        Float f10 = this.f88636w;
        if (f10 != null) {
            return f10.floatValue() == -1.0f ? Integer.valueOf(this.f88636w.intValue()) : this.f88636w.floatValue() == -2.0f ? Integer.valueOf(this.f88636w.intValue()) : Integer.valueOf(h0.dpToPx(context, this.f88636w.floatValue()));
        }
        return -2;
    }

    public Float getHideAfter() {
        return this.f88624k;
    }

    public Integer getHorizontalPosition() {
        Integer num = this.f88620g;
        if (num != null) {
            return num;
        }
        return 3;
    }

    public Integer getMarginBottom(Context context) {
        if (this.f88632s != null) {
            return Integer.valueOf(h0.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    public Integer getMarginLeft(Context context) {
        if (this.f88629p != null) {
            return Integer.valueOf(h0.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    public Integer getMarginRight(Context context) {
        if (this.f88631r != null) {
            return Integer.valueOf(h0.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    public Integer getMarginTop(Context context) {
        if (this.f88630q != null) {
            return Integer.valueOf(h0.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    public Float getOpacity() {
        Float f10 = this.f88623j;
        return f10 != null ? f10 : Float.valueOf(1.0f);
    }

    public Integer getPaddingBottom(Context context) {
        if (this.f88628o != null) {
            return Integer.valueOf(h0.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    public Integer getPaddingLeft(Context context) {
        if (this.f88625l != null) {
            return Integer.valueOf(h0.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    public Integer getPaddingRight(Context context) {
        if (this.f88626m != null) {
            return Integer.valueOf(h0.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    public Integer getPaddingTop(Context context) {
        if (this.f88627n != null) {
            return Integer.valueOf(h0.dpToPx(context, r0.intValue()));
        }
        return 0;
    }

    public Integer getStrokeColor() {
        Integer num = this.f88616b;
        return num != null ? num : Integer.valueOf(a.f88522a);
    }

    public Float getStrokeWidth(Context context) {
        return this.f88634u != null ? Float.valueOf(h0.dpToPx(context, r0.floatValue())) : Float.valueOf(0.0f);
    }

    public String getStyle() {
        return this.f88622i;
    }

    public Integer getVerticalPosition() {
        Integer num = this.f88621h;
        if (num != null) {
            return num;
        }
        return 48;
    }

    public Integer getWidth(Context context) {
        Float f10 = this.f88635v;
        if (f10 != null) {
            return f10.floatValue() == -1.0f ? Integer.valueOf(this.f88635v.intValue()) : this.f88635v.floatValue() == -2.0f ? Integer.valueOf(this.f88635v.intValue()) : Integer.valueOf(h0.dpToPx(context, this.f88635v.floatValue()));
        }
        return -2;
    }

    public boolean hasFillColor() {
        return this.f88617c != null;
    }

    public boolean hasStrokeColor() {
        return this.f88616b != null;
    }

    public Boolean isOutlined() {
        Boolean bool = this.f88618e;
        return bool != null ? bool : Boolean.FALSE;
    }

    public Boolean isVisible() {
        Boolean bool = this.f88619f;
        return bool != null ? bool : Boolean.TRUE;
    }

    public void merge(p pVar) {
        if (pVar == null) {
            return;
        }
        Integer num = pVar.f88616b;
        if (num != null) {
            this.f88616b = num;
        }
        Integer num2 = pVar.f88617c;
        if (num2 != null) {
            this.f88617c = num2;
        }
        Boolean bool = pVar.f88618e;
        if (bool != null) {
            this.f88618e = bool;
        }
        Boolean bool2 = pVar.f88619f;
        if (bool2 != null) {
            this.f88619f = bool2;
        }
        Integer num3 = pVar.f88620g;
        if (num3 != null) {
            this.f88620g = num3;
        }
        Integer num4 = pVar.f88621h;
        if (num4 != null) {
            this.f88621h = num4;
        }
        String str = pVar.f88622i;
        if (str != null) {
            this.f88622i = str;
        }
        Float f10 = pVar.f88623j;
        if (f10 != null) {
            this.f88623j = f10;
        }
        Float f11 = pVar.f88624k;
        if (f11 != null) {
            this.f88624k = f11;
        }
        Integer num5 = pVar.f88625l;
        if (num5 != null) {
            this.f88625l = num5;
        }
        Integer num6 = pVar.f88626m;
        if (num6 != null) {
            this.f88626m = num6;
        }
        Integer num7 = pVar.f88627n;
        if (num7 != null) {
            this.f88627n = num7;
        }
        Integer num8 = pVar.f88628o;
        if (num8 != null) {
            this.f88628o = num8;
        }
        Integer num9 = pVar.f88629p;
        if (num9 != null) {
            this.f88629p = num9;
        }
        Integer num10 = pVar.f88631r;
        if (num10 != null) {
            this.f88631r = num10;
        }
        Integer num11 = pVar.f88630q;
        if (num11 != null) {
            this.f88630q = num11;
        }
        Integer num12 = pVar.f88632s;
        if (num12 != null) {
            this.f88632s = num12;
        }
        String str2 = pVar.f88633t;
        if (str2 != null) {
            this.f88633t = str2;
        }
        Float f12 = pVar.f88634u;
        if (f12 != null) {
            this.f88634u = f12;
        }
        Float f13 = pVar.f88635v;
        if (f13 != null) {
            this.f88635v = f13;
        }
        Float f14 = pVar.f88636w;
        if (f14 != null) {
            this.f88636w = f14;
        }
        Integer num13 = pVar.f88637x;
        if (num13 != null) {
            this.f88637x = num13;
        }
        Float f15 = pVar.f88638y;
        if (f15 != null) {
            this.f88638y = f15;
        }
    }

    public int positionAsGravity() {
        return getVerticalPosition().intValue() | getHorizontalPosition().intValue();
    }

    public void setContent(String str) {
        this.f88633t = str;
    }

    public void setFillColor(Integer num) {
        this.f88617c = num;
    }

    public void setFontSize(Float f10) {
        this.f88638y = f10;
    }

    public void setFontStyle(Integer num) {
        this.f88637x = num;
    }

    public void setHeight(Number number) {
        this.f88636w = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public void setHideAfter(Float f10) {
        this.f88624k = f10;
    }

    public void setHorizontalPosition(Integer num) {
        this.f88620g = num;
    }

    public void setMargin(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f88629p = num;
        this.f88630q = num2;
        this.f88631r = num3;
        this.f88632s = num4;
    }

    public void setMarginBottom(Integer num) {
        this.f88632s = num;
    }

    public void setMarginLeft(Integer num) {
        this.f88629p = num;
    }

    public void setMarginRight(Integer num) {
        this.f88631r = num;
    }

    public void setMarginTop(Integer num) {
        this.f88630q = num;
    }

    public void setOpacity(Float f10) {
        this.f88623j = f10;
    }

    public void setOutlined(Boolean bool) {
        this.f88618e = bool;
    }

    public void setPadding(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f88625l = num;
        this.f88627n = num2;
        this.f88626m = num3;
        this.f88628o = num4;
    }

    public void setPaddingBottom(Integer num) {
        this.f88628o = num;
    }

    public void setPaddingLeft(Integer num) {
        this.f88625l = num;
    }

    public void setPaddingRight(Integer num) {
        this.f88626m = num;
    }

    public void setPaddingTop(Integer num) {
        this.f88627n = num;
    }

    public void setStrokeColor(Integer num) {
        this.f88616b = num;
    }

    public void setStrokeWidth(Float f10) {
        this.f88634u = f10;
    }

    public void setStyle(String str) {
        this.f88622i = str;
    }

    public void setVerticalPosition(Integer num) {
        this.f88621h = num;
    }

    public void setVisible(Boolean bool) {
        this.f88619f = bool;
    }

    public void setWidth(Number number) {
        this.f88635v = number != null ? Float.valueOf(number.floatValue()) : null;
    }

    public p(p pVar) {
        merge(pVar);
    }

    public void setMargin(String str) {
        if (TextUtils.isEmpty(str)) {
            setMargin(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = h0.convertCssSizeToPx(strArrSplit[0]).intValue();
            setMargin(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = h0.convertCssSizeToPx(strArrSplit[0]).intValue();
            int iIntValue3 = h0.convertCssSizeToPx(strArrSplit[1]).intValue();
            setMargin(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = h0.convertCssSizeToPx(strArrSplit[0]).intValue();
                int iIntValue5 = h0.convertCssSizeToPx(strArrSplit[1]).intValue();
                setMargin(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                setMargin(Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[3]).intValue()), Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[0]).intValue()), Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[1]).intValue()), Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[2]).intValue()));
            }
        }
    }

    public void setPadding(String str) {
        if (TextUtils.isEmpty(str)) {
            setPadding(null, null, null, null);
            return;
        }
        String[] strArrSplit = str.split(" ");
        if (strArrSplit.length == 1) {
            int iIntValue = h0.convertCssSizeToPx(strArrSplit[0]).intValue();
            setPadding(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue), Integer.valueOf(iIntValue));
            return;
        }
        if (strArrSplit.length == 2) {
            int iIntValue2 = h0.convertCssSizeToPx(strArrSplit[0]).intValue();
            int iIntValue3 = h0.convertCssSizeToPx(strArrSplit[1]).intValue();
            setPadding(Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(iIntValue2));
        } else {
            if (strArrSplit.length == 3) {
                int iIntValue4 = h0.convertCssSizeToPx(strArrSplit[0]).intValue();
                int iIntValue5 = h0.convertCssSizeToPx(strArrSplit[1]).intValue();
                setPadding(Integer.valueOf(iIntValue5), Integer.valueOf(iIntValue4), Integer.valueOf(iIntValue5), Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[2]).intValue()));
                return;
            }
            if (strArrSplit.length == 4) {
                setPadding(Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[3]).intValue()), Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[0]).intValue()), Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[1]).intValue()), Integer.valueOf(h0.convertCssSizeToPx(strArrSplit[2]).intValue()));
            }
        }
    }
}

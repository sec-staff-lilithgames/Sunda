package ug;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.Xml;
import n3.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f88488a;

    /* renamed from: b, reason: collision with root package name */
    public final String f88489b;

    /* renamed from: c, reason: collision with root package name */
    public String f88490c;

    /* renamed from: d, reason: collision with root package name */
    public final int f88491d;

    /* renamed from: e, reason: collision with root package name */
    public final int f88492e;

    /* renamed from: f, reason: collision with root package name */
    public final float f88493f;

    /* renamed from: g, reason: collision with root package name */
    public final float f88494g;

    /* renamed from: h, reason: collision with root package name */
    public final float f88495h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f88496i;

    /* renamed from: j, reason: collision with root package name */
    public final float f88497j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f88498k;

    /* renamed from: l, reason: collision with root package name */
    public float f88499l;

    /* renamed from: m, reason: collision with root package name */
    public final int f88500m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f88501n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f88502o = false;

    /* renamed from: p, reason: collision with root package name */
    public Typeface f88503p;

    public g(Context context, int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, k.a.f70001y);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        setTextColor(d.getColorStateList(context, typedArrayObtainStyledAttributes, 3));
        d.getColorStateList(context, typedArrayObtainStyledAttributes, 4);
        d.getColorStateList(context, typedArrayObtainStyledAttributes, 5);
        this.f88491d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f88492e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i11 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f88500m = typedArrayObtainStyledAttributes.getResourceId(i11, 0);
        this.f88489b = typedArrayObtainStyledAttributes.getString(i11);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f88488a = d.getColorStateList(context, typedArrayObtainStyledAttributes, 6);
        this.f88493f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f88494g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f88495h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i10, uf.a.D);
        this.f88496i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f88497j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f88490c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f88503p;
        int i10 = this.f88491d;
        if (typeface == null && (str = this.f88489b) != null) {
            this.f88503p = Typeface.create(str, i10);
        }
        if (this.f88503p == null) {
            int i11 = this.f88492e;
            if (i11 == 1) {
                this.f88503p = Typeface.SANS_SERIF;
            } else if (i11 == 2) {
                this.f88503p = Typeface.SERIF;
            } else if (i11 != 3) {
                this.f88503p = Typeface.DEFAULT;
            } else {
                this.f88503p = Typeface.MONOSPACE;
            }
            this.f88503p = Typeface.create(this.f88503p, i10);
        }
    }

    public final boolean b(Context context) throws Resources.NotFoundException {
        String string;
        Typeface typefaceCreate;
        if (h.shouldLoadFontSynchronously()) {
            getFont(context);
            return true;
        }
        if (this.f88501n) {
            return true;
        }
        int i10 = this.f88500m;
        if (i10 != 0) {
            Typeface cachedFont = p.getCachedFont(context, i10);
            if (cachedFont != null) {
                this.f88503p = cachedFont;
                this.f88501n = true;
                return true;
            }
            Typeface typefaceCreate2 = null;
            if (!this.f88502o) {
                this.f88502o = true;
                Resources resources = context.getResources();
                if (i10 == 0 || !resources.getResourceTypeName(i10).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f88491d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i10);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), j3.a.f69099b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f88491d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f88503p = typefaceCreate2;
                this.f88501n = true;
                return true;
            }
        }
        return false;
    }

    public Typeface getFallbackFont() {
        a();
        return this.f88503p;
    }

    public Typeface getFont(Context context) {
        if (this.f88501n) {
            return this.f88503p;
        }
        if (!context.isRestricted()) {
            try {
                Typeface font = p.getFont(context, this.f88500m);
                this.f88503p = font;
                if (font != null) {
                    this.f88503p = Typeface.create(font, this.f88491d);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f88489b, e10);
            }
        }
        a();
        this.f88501n = true;
        return this.f88503p;
    }

    public void getFontAsync(Context context, i iVar) {
        if (!b(context)) {
            a();
        }
        int i10 = this.f88500m;
        if (i10 == 0) {
            this.f88501n = true;
        }
        if (this.f88501n) {
            iVar.onFontRetrieved(this.f88503p, true);
            return;
        }
        try {
            p.getFont(context, i10, new e(this, iVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f88501n = true;
            iVar.onFontRetrievalFailed(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f88489b, e10);
            this.f88501n = true;
            iVar.onFontRetrievalFailed(-3);
        }
    }

    public String getFontVariationSettings() {
        return this.f88490c;
    }

    public ColorStateList getTextColor() {
        return this.f88498k;
    }

    public float getTextSize() {
        return this.f88499l;
    }

    public void setFontVariationSettings(String str) {
        this.f88490c = str;
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f88498k = colorStateList;
    }

    public void setTextSize(float f10) {
        this.f88499l = f10;
    }

    public void updateDrawState(Context context, TextPaint textPaint, i iVar) {
        updateMeasureState(context, textPaint, iVar);
        ColorStateList colorStateList = this.f88498k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f88488a;
        textPaint.setShadowLayer(this.f88495h, this.f88493f, this.f88494g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void updateMeasureState(Context context, TextPaint textPaint, i iVar) {
        Typeface typeface;
        if (b(context) && this.f88501n && (typeface = this.f88503p) != null) {
            updateTextPaintMeasureState(context, textPaint, typeface);
        } else {
            getFontAsync(context, textPaint, iVar);
        }
    }

    public void updateTextPaintMeasureState(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceMaybeCopyWithFontWeightAdjustment = j.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f88491d;
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f88499l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(this.f88490c);
        }
        if (this.f88496i) {
            textPaint.setLetterSpacing(this.f88497j);
        }
    }

    public void getFontAsync(Context context, TextPaint textPaint, i iVar) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new f(this, context, textPaint, iVar));
    }
}

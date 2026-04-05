package y;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class b extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f93922j = {R.attr.colorBackground};

    /* renamed from: k, reason: collision with root package name */
    public static final c f93923k;

    /* renamed from: b, reason: collision with root package name */
    public boolean f93924b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f93925c;

    /* renamed from: e, reason: collision with root package name */
    public int f93926e;

    /* renamed from: f, reason: collision with root package name */
    public int f93927f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f93928g;

    /* renamed from: h, reason: collision with root package name */
    public final Rect f93929h;

    /* renamed from: i, reason: collision with root package name */
    public final a f93930i;

    static {
        c cVar = new c();
        f93923k = cVar;
        cVar.initStatic();
    }

    public b(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return f93923k.getBackgroundColor(this.f93930i);
    }

    public float getCardElevation() {
        return f93923k.getElevation(this.f93930i);
    }

    public int getContentPaddingBottom() {
        return this.f93928g.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f93928g.left;
    }

    public int getContentPaddingRight() {
        return this.f93928g.right;
    }

    public int getContentPaddingTop() {
        return this.f93928g.top;
    }

    public float getMaxCardElevation() {
        return f93923k.getMaxElevation(this.f93930i);
    }

    public boolean getPreventCornerOverlap() {
        return this.f93925c;
    }

    public float getRadius() {
        return f93923k.getRadius(this.f93930i);
    }

    public boolean getUseCompatPadding() {
        return this.f93924b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        f93923k.setBackgroundColor(this.f93930i, ColorStateList.valueOf(i10));
    }

    public void setCardElevation(float f10) {
        f93923k.setElevation(this.f93930i, f10);
    }

    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.f93928g.set(i10, i11, i12, i13);
        f93923k.updatePadding(this.f93930i);
    }

    public void setMaxCardElevation(float f10) {
        f93923k.setMaxElevation(this.f93930i, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        this.f93927f = i10;
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        this.f93926e = i10;
        super.setMinimumWidth(i10);
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f93925c) {
            this.f93925c = z10;
            f93923k.onPreventCornerOverlapChanged(this.f93930i);
        }
    }

    public void setRadius(float f10) {
        f93923k.setRadius(this.f93930i, f10);
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f93924b != z10) {
            this.f93924b = z10;
            f93923k.onCompatPaddingChanged(this.f93930i);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.digidust.elokence.akinator.freemium.R.attr.cardViewStyle);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f93923k.setBackgroundColor(this.f93930i, colorStateList);
    }

    public b(Context context, AttributeSet attributeSet, int i10) throws Resources.NotFoundException {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i10);
        Rect rect = new Rect();
        this.f93928g = rect;
        this.f93929h = new Rect();
        a aVar = new a(this);
        this.f93930i = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, x.a.f91308a, i10, com.digidust.elokence.akinator.freemium.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f93922j);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.digidust.elokence.akinator.freemium.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.digidust.elokence.akinator.freemium.R.color.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f93924b = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f93925c = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        float f10 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f93926e = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f93927f = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        f93923k.initialize(aVar, context, colorStateList, dimension, dimension2, f10);
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }
}

package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f82187a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f82188b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f82189c;

    public n3(Context context, TypedArray typedArray) {
        this.f82187a = context;
        this.f82188b = typedArray;
    }

    public static n3 obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr) {
        return new n3(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public boolean getBoolean(int i10, boolean z10) {
        return this.f82188b.getBoolean(i10, z10);
    }

    public int getChangingConfigurations() {
        return m3.a(this.f82188b);
    }

    public int getColor(int i10, int i11) {
        return this.f82188b.getColor(i10, i11);
    }

    public ColorStateList getColorStateList(int i10) {
        int resourceId;
        ColorStateList colorStateList;
        TypedArray typedArray = this.f82188b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0 || (colorStateList = l.a.getColorStateList(this.f82187a, resourceId)) == null) ? typedArray.getColorStateList(i10) : colorStateList;
    }

    public float getDimension(int i10, float f10) {
        return this.f82188b.getDimension(i10, f10);
    }

    public int getDimensionPixelOffset(int i10, int i11) {
        return this.f82188b.getDimensionPixelOffset(i10, i11);
    }

    public int getDimensionPixelSize(int i10, int i11) {
        return this.f82188b.getDimensionPixelSize(i10, i11);
    }

    public Drawable getDrawable(int i10) {
        int resourceId;
        TypedArray typedArray = this.f82188b;
        return (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) ? typedArray.getDrawable(i10) : l.a.getDrawable(this.f82187a, resourceId);
    }

    public Drawable getDrawableIfKnown(int i10) {
        int resourceId;
        Drawable drawableB;
        if (!this.f82188b.hasValue(i10) || (resourceId = this.f82188b.getResourceId(i10, 0)) == 0) {
            return null;
        }
        w wVar = w.get();
        Context context = this.f82187a;
        synchronized (wVar) {
            drawableB = wVar.f82288a.b(context, resourceId, true);
        }
        return drawableB;
    }

    public float getFloat(int i10, float f10) {
        return this.f82188b.getFloat(i10, f10);
    }

    public Typeface getFont(int i10, int i11, n3.n nVar) {
        int resourceId = this.f82188b.getResourceId(i10, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f82189c == null) {
            this.f82189c = new TypedValue();
        }
        return n3.p.getFont(this.f82187a, resourceId, this.f82189c, i11, nVar);
    }

    public float getFraction(int i10, int i11, int i12, float f10) {
        return this.f82188b.getFraction(i10, i11, i12, f10);
    }

    public int getIndex(int i10) {
        return this.f82188b.getIndex(i10);
    }

    public int getIndexCount() {
        return this.f82188b.getIndexCount();
    }

    public int getInt(int i10, int i11) {
        return this.f82188b.getInt(i10, i11);
    }

    public int getInteger(int i10, int i11) {
        return this.f82188b.getInteger(i10, i11);
    }

    public int getLayoutDimension(int i10, String str) {
        return this.f82188b.getLayoutDimension(i10, str);
    }

    public String getNonResourceString(int i10) {
        return this.f82188b.getNonResourceString(i10);
    }

    public String getPositionDescription() {
        return this.f82188b.getPositionDescription();
    }

    public int getResourceId(int i10, int i11) {
        return this.f82188b.getResourceId(i10, i11);
    }

    public Resources getResources() {
        return this.f82188b.getResources();
    }

    public String getString(int i10) {
        return this.f82188b.getString(i10);
    }

    public CharSequence getText(int i10) {
        return this.f82188b.getText(i10);
    }

    public CharSequence[] getTextArray(int i10) {
        return this.f82188b.getTextArray(i10);
    }

    public int getType(int i10) {
        return m3.b(this.f82188b, i10);
    }

    public boolean getValue(int i10, TypedValue typedValue) {
        return this.f82188b.getValue(i10, typedValue);
    }

    public TypedArray getWrappedTypeArray() {
        return this.f82188b;
    }

    public boolean hasValue(int i10) {
        return this.f82188b.hasValue(i10);
    }

    public int length() {
        return this.f82188b.length();
    }

    public TypedValue peekValue(int i10) {
        return this.f82188b.peekValue(i10);
    }

    public void recycle() {
        this.f82188b.recycle();
    }

    public static n3 obtainStyledAttributes(Context context, AttributeSet attributeSet, int[] iArr, int i10, int i11) {
        return new n3(context, context.obtainStyledAttributes(attributeSet, iArr, i10, i11));
    }

    public int getLayoutDimension(int i10, int i11) {
        return this.f82188b.getLayoutDimension(i10, i11);
    }

    public static n3 obtainStyledAttributes(Context context, int i10, int[] iArr) {
        return new n3(context, context.obtainStyledAttributes(i10, iArr));
    }
}

package n3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static int getAttr(Context context, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId != 0 ? i10 : i11;
    }

    public static boolean getBoolean(TypedArray typedArray, int i10, int i11, boolean z10) {
        return typedArray.getBoolean(i10, typedArray.getBoolean(i11, z10));
    }

    public static Drawable getDrawable(TypedArray typedArray, int i10, int i11) {
        Drawable drawable = typedArray.getDrawable(i10);
        return drawable == null ? typedArray.getDrawable(i11) : drawable;
    }

    public static int getInt(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getInt(i10, typedArray.getInt(i11, i12));
    }

    public static boolean getNamedBoolean(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, boolean z10) {
        return !hasAttribute(xmlPullParser, str) ? z10 : typedArray.getBoolean(i10, z10);
    }

    public static int getNamedColor(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !hasAttribute(xmlPullParser, str) ? i11 : typedArray.getColor(i10, i11);
    }

    public static ColorStateList getNamedColorStateList(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10) {
        if (!hasAttribute(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i10, typedValue);
        int i11 = typedValue.type;
        if (i11 != 2) {
            return (i11 < 28 || i11 > 31) ? c.inflate(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme) : ColorStateList.valueOf(typedValue.data);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i10 + ": " + typedValue);
    }

    public static d getNamedComplexColor(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i10, int i11) {
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i10, typedValue);
            int i12 = typedValue.type;
            if (i12 >= 28 && i12 <= 31) {
                return new d(null, null, typedValue.data);
            }
            d dVarInflate = d.inflate(typedArray.getResources(), typedArray.getResourceId(i10, 0), theme);
            if (dVarInflate != null) {
                return dVarInflate;
            }
        }
        return new d(null, null, i11);
    }

    public static float getNamedFloat(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, float f10) {
        return !hasAttribute(xmlPullParser, str) ? f10 : typedArray.getFloat(i10, f10);
    }

    public static int getNamedInt(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !hasAttribute(xmlPullParser, str) ? i11 : typedArray.getInt(i10, i11);
    }

    public static int getNamedResourceId(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10, int i11) {
        return !hasAttribute(xmlPullParser, str) ? i11 : typedArray.getResourceId(i10, i11);
    }

    public static String getNamedString(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.getString(i10);
        }
        return null;
    }

    public static int getResourceId(TypedArray typedArray, int i10, int i11, int i12) {
        return typedArray.getResourceId(i10, typedArray.getResourceId(i11, i12));
    }

    public static String getString(TypedArray typedArray, int i10, int i11) {
        String string = typedArray.getString(i10);
        return string == null ? typedArray.getString(i11) : string;
    }

    public static CharSequence getText(TypedArray typedArray, int i10, int i11) {
        CharSequence text = typedArray.getText(i10);
        return text == null ? typedArray.getText(i11) : text;
    }

    public static CharSequence[] getTextArray(TypedArray typedArray, int i10, int i11) {
        CharSequence[] textArray = typedArray.getTextArray(i10);
        return textArray == null ? typedArray.getTextArray(i11) : textArray;
    }

    public static boolean hasAttribute(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static TypedValue peekNamedValue(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i10) {
        if (hasAttribute(xmlPullParser, str)) {
            return typedArray.peekValue(i10);
        }
        return null;
    }
}

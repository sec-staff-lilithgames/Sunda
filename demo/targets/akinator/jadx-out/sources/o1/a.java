package o1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import e3.g;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import n3.d;
import n3.q;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParser f77388a;

    /* renamed from: b, reason: collision with root package name */
    public int f77389b;

    public a(XmlPullParser xmlParser, int i10) {
        e0.checkNotNullParameter(xmlParser, "xmlParser");
        this.f77388a = xmlParser;
        this.f77389b = i10;
    }

    public static /* synthetic */ a copy$default(a aVar, XmlPullParser xmlPullParser, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            xmlPullParser = aVar.f77388a;
        }
        if ((i11 & 2) != 0) {
            i10 = aVar.f77389b;
        }
        return aVar.copy(xmlPullParser, i10);
    }

    public final void a(int i10) {
        this.f77389b = i10 | this.f77389b;
    }

    public final XmlPullParser component1() {
        return this.f77388a;
    }

    public final int component2() {
        return this.f77389b;
    }

    public final a copy(XmlPullParser xmlParser, int i10) {
        e0.checkNotNullParameter(xmlParser, "xmlParser");
        return new a(xmlParser, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e0.areEqual(this.f77388a, aVar.f77388a) && this.f77389b == aVar.f77389b;
    }

    public final int getConfig() {
        return this.f77389b;
    }

    public final float getDimension(TypedArray typedArray, int i10, float f10) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        float dimension = typedArray.getDimension(i10, f10);
        a(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(TypedArray typedArray, int i10, float f10) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        float f11 = typedArray.getFloat(i10, f10);
        a(typedArray.getChangingConfigurations());
        return f11;
    }

    public final int getInt(TypedArray typedArray, int i10, int i11) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        int i12 = typedArray.getInt(i10, i11);
        a(typedArray.getChangingConfigurations());
        return i12;
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String attrName, int i10, boolean z10) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        e0.checkNotNullParameter(attrName, "attrName");
        boolean namedBoolean = q.getNamedBoolean(typedArray, this.f77388a, attrName, i10, z10);
        a(typedArray.getChangingConfigurations());
        return namedBoolean;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String attrName, int i10) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        e0.checkNotNullParameter(attrName, "attrName");
        ColorStateList namedColorStateList = q.getNamedColorStateList(typedArray, this.f77388a, theme, attrName, i10);
        a(typedArray.getChangingConfigurations());
        return namedColorStateList;
    }

    public final d getNamedComplexColor(TypedArray typedArray, Resources.Theme theme, String attrName, int i10, int i11) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        e0.checkNotNullParameter(attrName, "attrName");
        d result = q.getNamedComplexColor(typedArray, this.f77388a, theme, attrName, i10, i11);
        a(typedArray.getChangingConfigurations());
        e0.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public final float getNamedFloat(TypedArray typedArray, String attrName, int i10, float f10) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        e0.checkNotNullParameter(attrName, "attrName");
        float namedFloat = q.getNamedFloat(typedArray, this.f77388a, attrName, i10, f10);
        a(typedArray.getChangingConfigurations());
        return namedFloat;
    }

    public final int getNamedInt(TypedArray typedArray, String attrName, int i10, int i11) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        e0.checkNotNullParameter(attrName, "attrName");
        int namedInt = q.getNamedInt(typedArray, this.f77388a, attrName, i10, i11);
        a(typedArray.getChangingConfigurations());
        return namedInt;
    }

    public final String getString(TypedArray typedArray, int i10) {
        e0.checkNotNullParameter(typedArray, "typedArray");
        String string = typedArray.getString(i10);
        a(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser getXmlParser() {
        return this.f77388a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f77389b) + (this.f77388a.hashCode() * 31);
    }

    public final TypedArray obtainAttributes(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        e0.checkNotNullParameter(res, "res");
        e0.checkNotNullParameter(set, "set");
        e0.checkNotNullParameter(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = q.obtainAttributes(res, theme, set, attrs);
        e0.checkNotNullExpressionValue(typedArrayObtainAttributes, "obtainAttributes(\n      …          attrs\n        )");
        a(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final void setConfig(int i10) {
        this.f77389b = i10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb2.append(this.f77388a);
        sb2.append(", config=");
        return g.m(sb2, this.f77389b, ')');
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i10, int i11, u uVar) {
        this(xmlPullParser, (i11 & 2) != 0 ? 0 : i10);
    }
}

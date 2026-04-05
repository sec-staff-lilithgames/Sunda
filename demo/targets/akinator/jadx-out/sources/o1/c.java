package o1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import j1.b0;
import j1.b2;
import j1.d0;
import j1.j2;
import j1.k2;
import j1.l2;
import j1.m0;
import j1.m2;
import j1.n2;
import j1.o0;
import j1.o1;
import j1.x;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.e0;
import n1.c;
import n1.g;
import n1.w0;
import n3.d;
import n3.q;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s2.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class c {
    public static final c.a createVectorImageBuilder(a aVar, Resources res, Resources.Theme theme, AttributeSet attrs) throws XmlPullParserException {
        long jM4835getUnspecified0d7_KjU;
        int iM5060getSrcIn0nO6VwU;
        ColorStateList namedColorStateList;
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(res, "res");
        e0.checkNotNullParameter(attrs, "attrs");
        b bVar = b.f77390a;
        TypedArray typedArrayObtainAttributes = aVar.obtainAttributes(res, theme, attrs, bVar.getSTYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY());
        boolean namedBoolean = aVar.getNamedBoolean(typedArrayObtainAttributes, "autoMirrored", bVar.getSTYLEABLE_VECTOR_DRAWABLE_AUTO_MIRRORED(), false);
        float namedFloat = aVar.getNamedFloat(typedArrayObtainAttributes, "viewportWidth", bVar.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_WIDTH(), 0.0f);
        float namedFloat2 = aVar.getNamedFloat(typedArrayObtainAttributes, "viewportHeight", bVar.getSTYLEABLE_VECTOR_DRAWABLE_VIEWPORT_HEIGHT(), 0.0f);
        if (namedFloat <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (namedFloat2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float dimension = aVar.getDimension(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_WIDTH(), 0.0f);
        float dimension2 = aVar.getDimension(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_HEIGHT(), 0.0f);
        if (typedArrayObtainAttributes.hasValue(bVar.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainAttributes.getValue(bVar.getSTYLEABLE_VECTOR_DRAWABLE_TINT(), typedValue);
            jM4835getUnspecified0d7_KjU = (typedValue.type == 2 || (namedColorStateList = aVar.getNamedColorStateList(typedArrayObtainAttributes, theme, "tint", bVar.getSTYLEABLE_VECTOR_DRAWABLE_TINT())) == null) ? m0.f68918b.m4835getUnspecified0d7_KjU() : o0.Color(namedColorStateList.getDefaultColor());
        } else {
            jM4835getUnspecified0d7_KjU = m0.f68918b.m4835getUnspecified0d7_KjU();
        }
        long j10 = jM4835getUnspecified0d7_KjU;
        int i10 = aVar.getInt(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_TINT_MODE(), -1);
        if (i10 == -1) {
            iM5060getSrcIn0nO6VwU = x.f69020b.m5060getSrcIn0nO6VwU();
        } else if (i10 == 3) {
            iM5060getSrcIn0nO6VwU = x.f69020b.m5062getSrcOver0nO6VwU();
        } else if (i10 == 5) {
            iM5060getSrcIn0nO6VwU = x.f69020b.m5060getSrcIn0nO6VwU();
        } else if (i10 != 9) {
            switch (i10) {
                case 14:
                    iM5060getSrcIn0nO6VwU = x.f69020b.m5051getModulate0nO6VwU();
                    break;
                case 15:
                    iM5060getSrcIn0nO6VwU = x.f69020b.m5056getScreen0nO6VwU();
                    break;
                case 16:
                    iM5060getSrcIn0nO6VwU = x.f69020b.m5054getPlus0nO6VwU();
                    break;
                default:
                    iM5060getSrcIn0nO6VwU = x.f69020b.m5060getSrcIn0nO6VwU();
                    break;
            }
        } else {
            iM5060getSrcIn0nO6VwU = x.f69020b.m5059getSrcAtop0nO6VwU();
        }
        int i11 = iM5060getSrcIn0nO6VwU;
        float fM6817constructorimpl = i.m6817constructorimpl(dimension / res.getDisplayMetrics().density);
        float fM6817constructorimpl2 = i.m6817constructorimpl(dimension2 / res.getDisplayMetrics().density);
        typedArrayObtainAttributes.recycle();
        return new c.a(null, fM6817constructorimpl, fM6817constructorimpl2, namedFloat, namedFloat2, j10, i11, namedBoolean, 1, null);
    }

    public static final boolean isAtEnd(XmlPullParser xmlPullParser) {
        e0.checkNotNullParameter(xmlPullParser, "<this>");
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    public static final void parseClipPath(a aVar, Resources res, Resources.Theme theme, AttributeSet attrs, c.a builder) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(res, "res");
        e0.checkNotNullParameter(attrs, "attrs");
        e0.checkNotNullParameter(builder, "builder");
        b bVar = b.f77390a;
        TypedArray typedArrayObtainAttributes = aVar.obtainAttributes(res, theme, attrs, bVar.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH());
        String string = aVar.getString(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_NAME());
        if (string == null) {
            string = "";
        }
        List<g> listAddPathNodes = w0.addPathNodes(aVar.getString(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_CLIP_PATH_PATH_DATA()));
        typedArrayObtainAttributes.recycle();
        c.a.addGroup$default(builder, string, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listAddPathNodes, 254, null);
    }

    public static final int parseCurrentVectorNode(a aVar, Resources res, AttributeSet attrs, Resources.Theme theme, c.a builder, int i10) throws XmlPullParserException, IllegalArgumentException {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(res, "res");
        e0.checkNotNullParameter(attrs, "attrs");
        e0.checkNotNullParameter(builder, "builder");
        int eventType = aVar.getXmlParser().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !e0.areEqual("group", aVar.getXmlParser().getName())) {
                return i10;
            }
            int i11 = i10 + 1;
            for (int i12 = 0; i12 < i11; i12++) {
                builder.clearGroup();
            }
            return 0;
        }
        String name = aVar.getXmlParser().getName();
        if (name == null) {
            return i10;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i10;
            }
            parseClipPath(aVar, res, theme, attrs, builder);
            return i10 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i10;
            }
            parsePath(aVar, res, theme, attrs, builder);
            return i10;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i10;
        }
        parseGroup(aVar, res, theme, attrs, builder);
        return i10;
    }

    public static /* synthetic */ int parseCurrentVectorNode$default(a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, c.a aVar2, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            theme = null;
        }
        return parseCurrentVectorNode(aVar, resources, attributeSet, theme, aVar2, i10);
    }

    public static final void parseGroup(a aVar, Resources res, Resources.Theme theme, AttributeSet attrs, c.a builder) {
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(res, "res");
        e0.checkNotNullParameter(attrs, "attrs");
        e0.checkNotNullParameter(builder, "builder");
        b bVar = b.f77390a;
        TypedArray typedArrayObtainAttributes = aVar.obtainAttributes(res, theme, attrs, bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP());
        float namedFloat = aVar.getNamedFloat(typedArrayObtainAttributes, "rotation", bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_ROTATION(), 0.0f);
        float f10 = aVar.getFloat(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_X(), 0.0f);
        float f11 = aVar.getFloat(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_PIVOT_Y(), 0.0f);
        float namedFloat2 = aVar.getNamedFloat(typedArrayObtainAttributes, "scaleX", bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_X(), 1.0f);
        float namedFloat3 = aVar.getNamedFloat(typedArrayObtainAttributes, "scaleY", bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_SCALE_Y(), 1.0f);
        float namedFloat4 = aVar.getNamedFloat(typedArrayObtainAttributes, "translateX", bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_X(), 0.0f);
        float namedFloat5 = aVar.getNamedFloat(typedArrayObtainAttributes, "translateY", bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_TRANSLATE_Y(), 0.0f);
        String string = aVar.getString(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_GROUP_NAME());
        if (string == null) {
            string = "";
        }
        typedArrayObtainAttributes.recycle();
        builder.addGroup(string, namedFloat, f10, f11, namedFloat2, namedFloat3, namedFloat4, namedFloat5, w0.getEmptyPath());
    }

    public static final void parsePath(a aVar, Resources res, Resources.Theme theme, AttributeSet attrs, c.a builder) throws IllegalArgumentException {
        b0 b0VarShaderBrush;
        b0 j2Var;
        e0.checkNotNullParameter(aVar, "<this>");
        e0.checkNotNullParameter(res, "res");
        e0.checkNotNullParameter(attrs, "attrs");
        e0.checkNotNullParameter(builder, "builder");
        b bVar = b.f77390a;
        TypedArray typedArrayObtainAttributes = aVar.obtainAttributes(res, theme, attrs, bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH());
        if (!q.hasAttribute(aVar.getXmlParser(), "pathData")) {
            throw new IllegalArgumentException("No path data available");
        }
        String string = aVar.getString(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_NAME());
        if (string == null) {
            string = "";
        }
        String str = string;
        List<g> listAddPathNodes = w0.addPathNodes(aVar.getString(typedArrayObtainAttributes, bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_PATH_DATA()));
        d namedComplexColor = aVar.getNamedComplexColor(typedArrayObtainAttributes, theme, "fillColor", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_COLOR(), 0);
        float namedFloat = aVar.getNamedFloat(typedArrayObtainAttributes, "fillAlpha", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_FILL_ALPHA(), 1.0f);
        int namedInt = aVar.getNamedInt(typedArrayObtainAttributes, "strokeLineCap", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_CAP(), -1);
        k2 k2Var = l2.f68912b;
        int iM4802getButtKaPHkGw = k2Var.m4802getButtKaPHkGw();
        if (namedInt == 0) {
            iM4802getButtKaPHkGw = k2Var.m4802getButtKaPHkGw();
        } else if (namedInt == 1) {
            iM4802getButtKaPHkGw = k2Var.m4803getRoundKaPHkGw();
        } else if (namedInt == 2) {
            iM4802getButtKaPHkGw = k2Var.m4804getSquareKaPHkGw();
        }
        int i10 = iM4802getButtKaPHkGw;
        int namedInt2 = aVar.getNamedInt(typedArrayObtainAttributes, "strokeLineJoin", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_LINE_JOIN(), -1);
        m2 m2Var = n2.f68936b;
        int iM4869getBevelLxFBmk8 = m2Var.m4869getBevelLxFBmk8();
        if (namedInt2 == 0) {
            iM4869getBevelLxFBmk8 = m2Var.m4870getMiterLxFBmk8();
        } else if (namedInt2 == 1) {
            iM4869getBevelLxFBmk8 = m2Var.m4871getRoundLxFBmk8();
        } else if (namedInt2 == 2) {
            iM4869getBevelLxFBmk8 = m2Var.m4869getBevelLxFBmk8();
        }
        int i11 = iM4869getBevelLxFBmk8;
        float namedFloat2 = aVar.getNamedFloat(typedArrayObtainAttributes, "strokeMiterLimit", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_MITER_LIMIT(), 1.0f);
        d namedComplexColor2 = aVar.getNamedComplexColor(typedArrayObtainAttributes, theme, "strokeColor", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_COLOR(), 0);
        float namedFloat3 = aVar.getNamedFloat(typedArrayObtainAttributes, "strokeAlpha", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_ALPHA(), 1.0f);
        float namedFloat4 = aVar.getNamedFloat(typedArrayObtainAttributes, "strokeWidth", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_STROKE_WIDTH(), 1.0f);
        float namedFloat5 = aVar.getNamedFloat(typedArrayObtainAttributes, "trimPathEnd", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_END(), 1.0f);
        float namedFloat6 = aVar.getNamedFloat(typedArrayObtainAttributes, "trimPathOffset", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_OFFSET(), 0.0f);
        float namedFloat7 = aVar.getNamedFloat(typedArrayObtainAttributes, "trimPathStart", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_START(), 0.0f);
        int namedInt3 = aVar.getNamedInt(typedArrayObtainAttributes, "fillType", bVar.getSTYLEABLE_VECTOR_DRAWABLE_PATH_TRIM_PATH_FILLTYPE(), 0);
        typedArrayObtainAttributes.recycle();
        b2 b2VarShaderBrush = null;
        if (namedComplexColor.willDraw()) {
            Shader shader = namedComplexColor.getShader();
            b0VarShaderBrush = shader != null ? d0.ShaderBrush(shader) : new j2(o0.Color(namedComplexColor.getColor()), null);
        } else {
            b0VarShaderBrush = null;
        }
        if (namedComplexColor2.willDraw()) {
            Shader shader2 = namedComplexColor2.getShader();
            if (shader2 != null) {
                b2VarShaderBrush = d0.ShaderBrush(shader2);
                j2Var = b2VarShaderBrush;
            } else {
                j2Var = new j2(o0.Color(namedComplexColor2.getColor()), null);
            }
        } else {
            j2Var = b2VarShaderBrush;
        }
        builder.m5714addPathoIyEayM(listAddPathNodes, namedInt3 == 0 ? o1.f68941b.m4877getNonZeroRgk1Os() : o1.f68941b.m4876getEvenOddRgk1Os(), str, b0VarShaderBrush, namedFloat, j2Var, namedFloat3, namedFloat4, i10, i11, namedFloat2, namedFloat7, namedFloat5, namedFloat6);
    }

    public static final XmlPullParser seekToStartTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        e0.checkNotNullParameter(xmlPullParser, "<this>");
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }
}

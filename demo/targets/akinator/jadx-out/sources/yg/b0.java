package yg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import com.digidust.elokence.akinator.freemium.R;
import java.io.IOException;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;
import yg.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f94409a;

    /* renamed from: b, reason: collision with root package name */
    public final p f94410b;

    /* renamed from: c, reason: collision with root package name */
    public final int[][] f94411c;

    /* renamed from: d, reason: collision with root package name */
    public final p[] f94412d;

    /* renamed from: e, reason: collision with root package name */
    public final z f94413e;

    /* renamed from: f, reason: collision with root package name */
    public final z f94414f;

    /* renamed from: g, reason: collision with root package name */
    public final z f94415g;

    /* renamed from: h, reason: collision with root package name */
    public final z f94416h;

    public b0(a0 a0Var) {
        this.f94409a = a0Var.f94399a;
        this.f94410b = a0Var.f94400b;
        this.f94411c = a0Var.f94401c;
        this.f94412d = a0Var.f94402d;
        this.f94413e = a0Var.f94403e;
        this.f94414f = a0Var.f94404f;
        this.f94415g = a0Var.f94405g;
        this.f94416h = a0Var.f94406h;
    }

    public static void a(a0 a0Var, Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlResourceParser.getName().equals("item")) {
                Resources resources = context.getResources();
                int[] iArr = uf.a.B;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                p pVarBuild = p.builder(context, typedArrayObtainAttributes.getResourceId(0, 0), typedArrayObtainAttributes.getResourceId(1, 0)).build();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != R.attr.shapeAppearance && attributeNameResource != R.attr.shapeAppearanceOverlay) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a0Var.addStateShapeAppearanceModel(StateSet.trimStateSet(iArr2, i10), pVarBuild);
            }
        }
    }

    public static b0 create(Context context, TypedArray typedArray, int i10) {
        XmlResourceParser xml;
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return null;
        }
        a0 a0Var = new a0();
        a0Var.a();
        try {
            xml = context.getResources().getXml(resourceId);
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            a0Var.a();
        }
        try {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (xml.getName().equals("selector")) {
                a(a0Var, context, xml, attributeSetAsAttributeSet, context.getTheme());
            }
            xml.close();
            return a0Var.build();
        } catch (Throwable th2) {
            if (xml != null) {
                try {
                    xml.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static int swapCornerPositionRtl(int i10) {
        int i11 = i10 & 5;
        return ((i10 & 10) >> 1) | (i11 << 1);
    }

    public p getDefaultShape(boolean z10) {
        p pVar = this.f94410b;
        if (z10) {
            z zVar = this.f94416h;
            z zVar2 = this.f94415g;
            z zVar3 = this.f94414f;
            z zVar4 = this.f94413e;
            if (zVar4 != null || zVar3 != null || zVar2 != null || zVar != null) {
                p.a builder = pVar.toBuilder();
                if (zVar4 != null) {
                    builder.setTopLeftCornerSize(zVar4.getDefaultCornerSize());
                }
                if (zVar3 != null) {
                    builder.setTopRightCornerSize(zVar3.getDefaultCornerSize());
                }
                if (zVar2 != null) {
                    builder.setBottomLeftCornerSize(zVar2.getDefaultCornerSize());
                }
                if (zVar != null) {
                    builder.setBottomRightCornerSize(zVar.getDefaultCornerSize());
                }
                return builder.build();
            }
        }
        return pVar;
    }

    public int getStateCount() {
        return this.f94409a;
    }

    public boolean isStateful() {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        return this.f94409a > 1 || ((zVar = this.f94413e) != null && zVar.isStateful()) || (((zVar2 = this.f94414f) != null && zVar2.isStateful()) || (((zVar3 = this.f94415g) != null && zVar3.isStateful()) || ((zVar4 = this.f94416h) != null && zVar4.isStateful())));
    }

    public a0 toBuilder() {
        return new a0(this);
    }

    public b0 withTransformedCornerSizes(q qVar) {
        return toBuilder().withTransformedCornerSizes(qVar).build();
    }
}

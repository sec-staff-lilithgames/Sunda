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
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class z {

    /* renamed from: a, reason: collision with root package name */
    public int f94556a;

    /* renamed from: b, reason: collision with root package name */
    public d f94557b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f94558c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public d[] f94559d = new d[10];

    public static z create(Context context, TypedArray typedArray, int i10, d dVar) throws Resources.NotFoundException {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return create(p.getCornerSize(typedArray, i10, dVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return create(p.getCornerSize(typedArray, i10, dVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                z zVar = new z();
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
                    zVar.b(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return zVar;
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
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return create(dVar);
        }
    }

    public final void a(int[] iArr, d dVar) {
        int i10 = this.f94556a;
        if (i10 == 0 || iArr.length == 0) {
            this.f94557b = dVar;
        }
        int[][] iArr2 = this.f94558c;
        if (i10 >= iArr2.length) {
            int i11 = i10 + 10;
            int[][] iArr3 = new int[i11][];
            System.arraycopy(iArr2, 0, iArr3, 0, i10);
            this.f94558c = iArr3;
            d[] dVarArr = new d[i11];
            System.arraycopy(this.f94559d, 0, dVarArr, 0, i10);
            this.f94559d = dVarArr;
        }
        int[][] iArr4 = this.f94558c;
        int i12 = this.f94556a;
        iArr4[i12] = iArr;
        this.f94559d[i12] = dVar;
        this.f94556a = i12 + 1;
    }

    public final void b(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                int[] iArr = uf.a.K;
                TypedArray typedArrayObtainAttributes = theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                d cornerSize = p.getCornerSize(typedArrayObtainAttributes, 5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != R.attr.cornerSize) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr2, i10), cornerSize);
            }
        }
    }

    public d getCornerSizeForState(int[] iArr) {
        int i10;
        int[][] iArr2 = this.f94558c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= this.f94556a) {
                i12 = -1;
                break;
            }
            if (StateSet.stateSetMatches(iArr2[i12], iArr)) {
                break;
            }
            i12++;
        }
        if (i12 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int[][] iArr4 = this.f94558c;
            while (true) {
                if (i11 >= this.f94556a) {
                    break;
                }
                if (StateSet.stateSetMatches(iArr4[i11], iArr3)) {
                    i10 = i11;
                    break;
                }
                i11++;
            }
            i12 = i10;
        }
        return i12 < 0 ? this.f94557b : this.f94559d[i12];
    }

    public d getDefaultCornerSize() {
        return this.f94557b;
    }

    public boolean isStateful() {
        return this.f94556a > 1;
    }

    public z withTransformedCornerSizes(q qVar) {
        z zVar = new z();
        zVar.f94556a = this.f94556a;
        int[][] iArr = new int[this.f94558c.length][];
        zVar.f94558c = iArr;
        int[][] iArr2 = this.f94558c;
        System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
        zVar.f94559d = new d[this.f94559d.length];
        for (int i10 = 0; i10 < this.f94556a; i10++) {
            zVar.f94559d[i10] = ((h) qVar).apply(this.f94559d[i10]);
        }
        return zVar;
    }

    public static z create(d dVar) {
        z zVar = new z();
        zVar.a(StateSet.WILD_CARD, dVar);
        return zVar;
    }
}

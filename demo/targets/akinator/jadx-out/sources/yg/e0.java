package yg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public int f94421a;

    /* renamed from: b, reason: collision with root package name */
    public c0 f94422b;

    /* renamed from: c, reason: collision with root package name */
    public int[][] f94423c = new int[10][];

    /* renamed from: d, reason: collision with root package name */
    public c0[] f94424d = new c0[10];

    public static e0 create(Context context, TypedArray typedArray, int i10) throws Resources.NotFoundException {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0 || !context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return null;
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                e0 e0Var = new e0();
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
                    e0Var.a(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return e0Var;
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
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r12, android.content.res.XmlResourceParser r13, android.util.AttributeSet r14, android.content.res.Resources.Theme r15) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r11 = this;
            int r0 = r13.getDepth()
            r1 = 1
            int r0 = r0 + r1
        L6:
            int r2 = r13.next()
            if (r2 == r1) goto Lca
            int r3 = r13.getDepth()
            if (r3 >= r0) goto L15
            r4 = 3
            if (r2 == r4) goto Lca
        L15:
            r4 = 2
            if (r2 != r4) goto L6
            if (r3 > r0) goto L6
            java.lang.String r2 = r13.getName()
            java.lang.String r3 = "item"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            goto L6
        L27:
            android.content.res.Resources r2 = r12.getResources()
            int[] r3 = uf.a.N
            r5 = 0
            if (r15 != 0) goto L35
            android.content.res.TypedArray r2 = r2.obtainAttributes(r14, r3)
            goto L39
        L35:
            android.content.res.TypedArray r2 = r15.obtainStyledAttributes(r14, r3, r5, r5)
        L39:
            android.util.TypedValue r3 = r2.peekValue(r5)
            if (r3 != 0) goto L40
            goto L69
        L40:
            int r6 = r3.type
            r7 = 5
            if (r6 != r7) goto L5a
            yg.d0 r6 = new yg.d0
            int r3 = r3.data
            android.content.res.Resources r7 = r2.getResources()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            int r3 = android.util.TypedValue.complexToDimensionPixelSize(r3, r7)
            float r3 = (float) r3
            r6.<init>(r4, r3)
            goto L6a
        L5a:
            r4 = 6
            if (r6 != r4) goto L69
            yg.d0 r6 = new yg.d0
            r4 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3.getFraction(r4, r4)
            r6.<init>(r1, r3)
            goto L6a
        L69:
            r6 = 0
        L6a:
            r2.recycle()
            int r2 = r14.getAttributeCount()
            int[] r3 = new int[r2]
            r4 = r5
            r7 = r4
        L75:
            if (r4 >= r2) goto L90
            int r8 = r14.getAttributeNameResource(r4)
            r9 = 2130970159(0x7f04062f, float:1.754902E38)
            if (r8 == r9) goto L8d
            int r9 = r7 + 1
            boolean r10 = r14.getAttributeBooleanValue(r4, r5)
            if (r10 == 0) goto L89
            goto L8a
        L89:
            int r8 = -r8
        L8a:
            r3[r7] = r8
            r7 = r9
        L8d:
            int r4 = r4 + 1
            goto L75
        L90:
            int[] r2 = android.util.StateSet.trimStateSet(r3, r7)
            yg.c0 r3 = new yg.c0
            r3.<init>()
            r3.f94418a = r6
            int r4 = r11.f94421a
            if (r4 == 0) goto La2
            int r6 = r2.length
            if (r6 != 0) goto La4
        La2:
            r11.f94422b = r3
        La4:
            int[][] r6 = r11.f94423c
            int r7 = r6.length
            if (r4 < r7) goto Lbb
            int r7 = r4 + 10
            int[][] r8 = new int[r7][]
            java.lang.System.arraycopy(r6, r5, r8, r5, r4)
            r11.f94423c = r8
            yg.c0[] r6 = new yg.c0[r7]
            yg.c0[] r7 = r11.f94424d
            java.lang.System.arraycopy(r7, r5, r6, r5, r4)
            r11.f94424d = r6
        Lbb:
            int[][] r4 = r11.f94423c
            int r5 = r11.f94421a
            r4[r5] = r2
            yg.c0[] r2 = r11.f94424d
            r2[r5] = r3
            int r5 = r5 + r1
            r11.f94421a = r5
            goto L6
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.e0.a(android.content.Context, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public c0 getDefaultSizeChange() {
        return this.f94422b;
    }

    public int getMaxWidthChange(int i10) {
        float fMax;
        int i11 = -i10;
        for (int i12 = 0; i12 < this.f94421a; i12++) {
            d0 d0Var = this.f94424d[i12].f94418a;
            int i13 = d0Var.f94419a;
            float f10 = d0Var.f94420b;
            if (i13 == 2) {
                fMax = Math.max(i11, f10);
            } else if (i13 == 1) {
                fMax = Math.max(i11, i10 * f10);
            }
            i11 = (int) fMax;
        }
        return i11;
    }

    public c0 getSizeChangeForState(int[] iArr) {
        int i10;
        int[][] iArr2 = this.f94423c;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            i10 = -1;
            if (i12 >= this.f94421a) {
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
            int[][] iArr4 = this.f94423c;
            while (true) {
                if (i11 >= this.f94421a) {
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
        return i12 < 0 ? this.f94422b : this.f94424d[i12];
    }

    public boolean isStateful() {
        return this.f94421a > 1;
    }
}

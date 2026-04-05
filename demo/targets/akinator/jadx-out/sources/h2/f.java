package h2;

import android.text.Layout;
import java.text.Bidi;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import sv.n0;
import uu.k0;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Layout f58636a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f58637b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f58638c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean[] f58639d;

    /* renamed from: e, reason: collision with root package name */
    public char[] f58640e;

    /* renamed from: f, reason: collision with root package name */
    public final int f58641f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f58642a;

        /* renamed from: b, reason: collision with root package name */
        public final int f58643b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f58644c;

        public a(int i10, int i11, boolean z10) {
            this.f58642a = i10;
            this.f58643b = i11;
            this.f58644c = z10;
        }

        public static /* synthetic */ a copy$default(a aVar, int i10, int i11, boolean z10, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = aVar.f58642a;
            }
            if ((i12 & 2) != 0) {
                i11 = aVar.f58643b;
            }
            if ((i12 & 4) != 0) {
                z10 = aVar.f58644c;
            }
            return aVar.copy(i10, i11, z10);
        }

        public final int component1() {
            return this.f58642a;
        }

        public final int component2() {
            return this.f58643b;
        }

        public final boolean component3() {
            return this.f58644c;
        }

        public final a copy(int i10, int i11, boolean z10) {
            return new a(i10, i11, z10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f58642a == aVar.f58642a && this.f58643b == aVar.f58643b && this.f58644c == aVar.f58644c;
        }

        public final int getEnd() {
            return this.f58643b;
        }

        public final int getStart() {
            return this.f58642a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int iD = e3.g.d(this.f58643b, Integer.hashCode(this.f58642a) * 31, 31);
            boolean z10 = this.f58644c;
            int i10 = z10;
            if (z10 != 0) {
                i10 = 1;
            }
            return iD + i10;
        }

        public final boolean isRtl() {
            return this.f58644c;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("BidiRun(start=");
            sb2.append(this.f58642a);
            sb2.append(", end=");
            sb2.append(this.f58643b);
            sb2.append(", isRtl=");
            return a.b.p(sb2, this.f58644c, ')');
        }
    }

    public f(Layout layout) {
        e0.checkNotNullParameter(layout, "layout");
        this.f58636a = layout;
        ArrayList arrayList = new ArrayList();
        int length = 0;
        do {
            CharSequence text = this.f58636a.getText();
            e0.checkNotNullExpressionValue(text, "layout.text");
            int iIndexOf$default = n0.indexOf$default(text, '\n', length, false, 4, (Object) null);
            length = iIndexOf$default < 0 ? this.f58636a.getText().length() : iIndexOf$default + 1;
            arrayList.add(Integer.valueOf(length));
        } while (length < this.f58636a.getText().length());
        this.f58637b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.f58638c = arrayList2;
        this.f58639d = new boolean[this.f58637b.size()];
        this.f58641f = this.f58637b.size();
    }

    public static /* synthetic */ int getParagraphForOffset$default(f fVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return fVar.getParagraphForOffset(i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.text.Bidi analyzeBidi(int r13) {
        /*
            r12 = this;
            boolean[] r0 = r12.f58639d
            boolean r1 = r0[r13]
            java.util.ArrayList r2 = r12.f58638c
            if (r1 == 0) goto Lf
            java.lang.Object r13 = r2.get(r13)
            java.text.Bidi r13 = (java.text.Bidi) r13
            return r13
        Lf:
            java.util.ArrayList r1 = r12.f58637b
            r3 = 0
            if (r13 != 0) goto L16
            r4 = r3
            goto L22
        L16:
            int r4 = r13 + (-1)
            java.lang.Object r4 = r1.get(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
        L22:
            java.lang.Object r1 = r1.get(r13)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r10 = r1 - r4
            char[] r5 = r12.f58640e
            if (r5 == 0) goto L38
            int r6 = r5.length
            if (r6 >= r10) goto L36
            goto L38
        L36:
            r6 = r5
            goto L3b
        L38:
            char[] r5 = new char[r10]
            goto L36
        L3b:
            android.text.Layout r5 = r12.f58636a
            java.lang.CharSequence r5 = r5.getText()
            android.text.TextUtils.getChars(r5, r4, r1, r6, r3)
            boolean r1 = java.text.Bidi.requiresBidi(r6, r3, r10)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L5e
            boolean r11 = r12.isRtlParagraph(r13)
            java.text.Bidi r5 = new java.text.Bidi
            r8 = 0
            r9 = 0
            r7 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            int r1 = r5.getRunCount()
            if (r1 != r4) goto L5f
        L5e:
            r5 = r3
        L5f:
            r2.set(r13, r5)
            r0[r13] = r4
            if (r5 == 0) goto L6d
            char[] r13 = r12.f58640e
            if (r6 != r13) goto L6c
            r6 = r3
            goto L6d
        L6c:
            r6 = r13
        L6d:
            r12.f58640e = r6
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h2.f.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i10, boolean z10, boolean z11) {
        Layout layout = this.f58636a;
        if (!z11) {
            return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
        }
        int lineForOffset = e.getLineForOffset(layout, i10, z11);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (i10 != lineStart && i10 != lineEnd) {
            return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
        }
        if (i10 == 0 || i10 == layout.getText().length()) {
            return z10 ? layout.getPrimaryHorizontal(i10) : layout.getSecondaryHorizontal(i10);
        }
        int paragraphForOffset = getParagraphForOffset(i10, z11);
        boolean zIsRtlParagraph = isRtlParagraph(paragraphForOffset);
        while (lineEnd > 0 && isLineEndSpace(layout.getText().charAt(lineEnd - 1))) {
            lineEnd--;
        }
        int paragraphStart = getParagraphStart(paragraphForOffset);
        int i11 = lineStart - paragraphStart;
        int i12 = lineEnd - paragraphStart;
        Bidi bidiAnalyzeBidi = analyzeBidi(paragraphForOffset);
        Bidi bidiCreateLineBidi = bidiAnalyzeBidi != null ? bidiAnalyzeBidi.createLineBidi(i11, i12) : null;
        boolean z12 = false;
        if (bidiCreateLineBidi == null || bidiCreateLineBidi.getRunCount() == 1) {
            boolean zIsRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z10 || zIsRtlParagraph == zIsRtlCharAt) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            if (i10 == lineStart) {
                z12 = zIsRtlParagraph;
            } else if (!zIsRtlParagraph) {
                z12 = true;
            }
            return z12 ? layout.getLineLeft(lineForOffset) : layout.getLineRight(lineForOffset);
        }
        int runCount = bidiCreateLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i13 = 0; i13 < runCount; i13++) {
            aVarArr[i13] = new a(bidiCreateLineBidi.getRunStart(i13) + lineStart, bidiCreateLineBidi.getRunLimit(i13) + lineStart, bidiCreateLineBidi.getRunLevel(i13) % 2 == 1);
        }
        int runCount2 = bidiCreateLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i14 = 0; i14 < runCount2; i14++) {
            bArr[i14] = (byte) bidiCreateLineBidi.getRunLevel(i14);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        int i15 = -1;
        if (i10 == lineStart) {
            int i16 = 0;
            while (true) {
                if (i16 >= runCount) {
                    break;
                }
                if (aVarArr[i16].getStart() == i10) {
                    i15 = i16;
                    break;
                }
                i16++;
            }
            a aVar = aVarArr[i15];
            if (z10 || zIsRtlParagraph == aVar.isRtl()) {
                zIsRtlParagraph = !zIsRtlParagraph;
            }
            return (i15 == 0 && zIsRtlParagraph) ? layout.getLineLeft(lineForOffset) : (i15 != k0.getLastIndex(aVarArr) || zIsRtlParagraph) ? zIsRtlParagraph ? layout.getPrimaryHorizontal(aVarArr[i15 - 1].getStart()) : layout.getPrimaryHorizontal(aVarArr[i15 + 1].getStart()) : layout.getLineRight(lineForOffset);
        }
        int i17 = 0;
        while (true) {
            if (i17 >= runCount) {
                break;
            }
            if (aVarArr[i17].getEnd() == i10) {
                i15 = i17;
                break;
            }
            i17++;
        }
        a aVar2 = aVarArr[i15];
        if (!z10 && zIsRtlParagraph != aVar2.isRtl()) {
            zIsRtlParagraph = !zIsRtlParagraph;
        }
        return (i15 == 0 && zIsRtlParagraph) ? layout.getLineLeft(lineForOffset) : (i15 != k0.getLastIndex(aVarArr) || zIsRtlParagraph) ? zIsRtlParagraph ? layout.getPrimaryHorizontal(aVarArr[i15 - 1].getEnd()) : layout.getPrimaryHorizontal(aVarArr[i15 + 1].getEnd()) : layout.getLineRight(lineForOffset);
    }

    public final Layout getLayout() {
        return this.f58636a;
    }

    public final int getParagraphCount() {
        return this.f58641f;
    }

    public final int getParagraphEnd(int i10) {
        return ((Number) this.f58637b.get(i10)).intValue();
    }

    public final int getParagraphForOffset(int i10, boolean z10) {
        Integer numValueOf = Integer.valueOf(i10);
        ArrayList arrayList = this.f58637b;
        int iBinarySearch$default = p0.binarySearch$default(arrayList, numValueOf, 0, 0, 6, (Object) null);
        int i11 = iBinarySearch$default < 0 ? -(iBinarySearch$default + 1) : iBinarySearch$default + 1;
        if (z10 && i11 > 0) {
            int i12 = i11 - 1;
            if (i10 == ((Number) arrayList.get(i12)).intValue()) {
                return i12;
            }
        }
        return i11;
    }

    public final int getParagraphStart(int i10) {
        if (i10 == 0) {
            return 0;
        }
        return ((Number) this.f58637b.get(i10 - 1)).intValue();
    }

    public final boolean isLineEndSpace(char c10) {
        if (c10 == ' ' || c10 == '\n' || c10 == 5760) {
            return true;
        }
        return (8192 <= c10 && c10 < 8203 && c10 != 8199) || c10 == 8287 || c10 == 12288;
    }

    public final boolean isRtlParagraph(int i10) {
        int paragraphStart = getParagraphStart(i10);
        Layout layout = this.f58636a;
        return layout.getParagraphDirection(layout.getLineForOffset(paragraphStart)) == -1;
    }
}

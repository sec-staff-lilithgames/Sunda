package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: a, reason: collision with root package name */
    public final float f56510a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f56511b;

    /* renamed from: c, reason: collision with root package name */
    public final kv.p f56512c;

    /* renamed from: d, reason: collision with root package name */
    public final float f56513d;

    public l(float f10, boolean z10, kv.p pVar, kotlin.jvm.internal.u uVar) {
        this.f56510a = f10;
        this.f56511b = z10;
        this.f56512c = pVar;
        this.f56513d = f10;
    }

    /* renamed from: copy-8Feqmps$default, reason: not valid java name */
    public static /* synthetic */ l m3921copy8Feqmps$default(l lVar, float f10, boolean z10, kv.p pVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = lVar.f56510a;
        }
        if ((i10 & 2) != 0) {
            z10 = lVar.f56511b;
        }
        if ((i10 & 4) != 0) {
            pVar = lVar.f56512c;
        }
        return lVar.m3923copy8Feqmps(f10, z10, pVar);
    }

    @Override // g0.h, g0.g
    public void arrange(s2.e eVar, int i10, int[] sizes, s2.x layoutDirection, int[] outPositions) {
        int i11;
        int iMin;
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(sizes, "sizes");
        kotlin.jvm.internal.e0.checkNotNullParameter(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPositions, "outPositions");
        if (sizes.length == 0) {
            return;
        }
        int iMo3419roundToPx0680j_4 = eVar.mo3419roundToPx0680j_4(this.f56510a);
        boolean z10 = this.f56511b && layoutDirection == s2.x.f85364c;
        u uVar = u.f56588a;
        if (z10) {
            i11 = 0;
            iMin = 0;
            for (int length = sizes.length - 1; -1 < length; length--) {
                int i12 = sizes[length];
                int iMin2 = Math.min(i11, i10 - i12);
                outPositions[length] = iMin2;
                iMin = Math.min(iMo3419roundToPx0680j_4, (i10 - iMin2) - i12);
                i11 = outPositions[length] + i12 + iMin;
            }
        } else {
            int length2 = sizes.length;
            int i13 = 0;
            i11 = 0;
            iMin = 0;
            int i14 = 0;
            while (i13 < length2) {
                int i15 = sizes[i13];
                int iMin3 = Math.min(i11, i10 - i15);
                outPositions[i14] = iMin3;
                int iMin4 = Math.min(iMo3419roundToPx0680j_4, (i10 - iMin3) - i15);
                int i16 = outPositions[i14] + i15 + iMin4;
                i13++;
                iMin = iMin4;
                i11 = i16;
                i14++;
            }
        }
        int i17 = i11 - iMin;
        kv.p pVar = this.f56512c;
        if (pVar == null || i17 >= i10) {
            return;
        }
        int iIntValue = ((Number) pVar.invoke(Integer.valueOf(i10 - i17), layoutDirection)).intValue();
        int length3 = outPositions.length;
        for (int i18 = 0; i18 < length3; i18++) {
            outPositions[i18] = outPositions[i18] + iIntValue;
        }
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name */
    public final float m3922component1D9Ej5fM() {
        return this.f56510a;
    }

    public final boolean component2() {
        return this.f56511b;
    }

    public final kv.p component3() {
        return this.f56512c;
    }

    /* renamed from: copy-8Feqmps, reason: not valid java name */
    public final l m3923copy8Feqmps(float f10, boolean z10, kv.p pVar) {
        return new l(f10, z10, pVar, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return s2.i.m6822equalsimpl0(this.f56510a, lVar.f56510a) && this.f56511b == lVar.f56511b && kotlin.jvm.internal.e0.areEqual(this.f56512c, lVar.f56512c);
    }

    public final kv.p getAlignment() {
        return this.f56512c;
    }

    public final boolean getRtlMirror() {
        return this.f56511b;
    }

    /* renamed from: getSpace-D9Ej5fM, reason: not valid java name */
    public final float m3924getSpaceD9Ej5fM() {
        return this.f56510a;
    }

    @Override // g0.h, g0.g, g0.o
    /* renamed from: getSpacing-D9Ej5fM */
    public float mo3858getSpacingD9Ej5fM() {
        return this.f56513d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iM6823hashCodeimpl = s2.i.m6823hashCodeimpl(this.f56510a) * 31;
        boolean z10 = this.f56511b;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (iM6823hashCodeimpl + i10) * 31;
        kv.p pVar = this.f56512c;
        return i11 + (pVar == null ? 0 : pVar.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f56511b ? "" : "Absolute");
        sb2.append("Arrangement#spacedAligned(");
        sb2.append((Object) s2.i.m6828toStringimpl(this.f56510a));
        sb2.append(", ");
        sb2.append(this.f56512c);
        sb2.append(')');
        return sb2.toString();
    }

    @Override // g0.h, g0.o
    public void arrange(s2.e eVar, int i10, int[] sizes, int[] outPositions) {
        kotlin.jvm.internal.e0.checkNotNullParameter(eVar, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(sizes, "sizes");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPositions, "outPositions");
        arrange(eVar, i10, sizes, s2.x.f85363b, outPositions);
    }
}

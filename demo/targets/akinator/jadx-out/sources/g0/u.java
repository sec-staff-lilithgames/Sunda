package g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u f56588a = new u();

    /* renamed from: b, reason: collision with root package name */
    public static final m f56589b = new m();

    /* renamed from: c, reason: collision with root package name */
    public static final f f56590c = new f();

    /* renamed from: d, reason: collision with root package name */
    public static final n f56591d = new n();

    /* renamed from: e, reason: collision with root package name */
    public static final d f56592e = new d();

    /* renamed from: f, reason: collision with root package name */
    public static final e f56593f = new e();

    /* renamed from: g, reason: collision with root package name */
    public static final k f56594g = new k();

    /* renamed from: h, reason: collision with root package name */
    public static final j f56595h = new j();

    /* renamed from: i, reason: collision with root package name */
    public static final i f56596i = new i();

    public final g aligned(e1.b alignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        return new l(s2.i.m6817constructorimpl(0), true, new p(alignment), null);
    }

    public final o getBottom() {
        return f56592e;
    }

    public final h getCenter() {
        return f56593f;
    }

    public final g getEnd() {
        return f56590c;
    }

    public final h getSpaceAround() {
        return f56596i;
    }

    public final h getSpaceBetween() {
        return f56595h;
    }

    public final h getSpaceEvenly() {
        return f56594g;
    }

    public final g getStart() {
        return f56589b;
    }

    public final o getTop() {
        return f56591d;
    }

    public final void placeCenter$foundation_layout_release(int i10, int[] size, int[] outPosition, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPosition, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        float f10 = (i10 - i12) / 2;
        if (!z10) {
            int length = size.length;
            int i14 = 0;
            while (i11 < length) {
                int i15 = size[i11];
                outPosition[i14] = mv.d.roundToInt(f10);
                f10 += i15;
                i11++;
                i14++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i16 = size[length2];
            outPosition[length2] = mv.d.roundToInt(f10);
            f10 += i16;
        }
    }

    public final void placeLeftOrTop$foundation_layout_release(int[] size, int[] outPosition, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPosition, "outPosition");
        int i10 = 0;
        if (!z10) {
            int length = size.length;
            int i11 = 0;
            int i12 = 0;
            while (i10 < length) {
                int i13 = size[i10];
                outPosition[i11] = i12;
                i12 += i13;
                i10++;
                i11++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i14 = size[length2];
            outPosition[length2] = i10;
            i10 += i14;
        }
    }

    public final void placeRightOrBottom$foundation_layout_release(int i10, int[] size, int[] outPosition, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPosition, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        int i14 = i10 - i12;
        if (!z10) {
            int length = size.length;
            int i15 = 0;
            while (i11 < length) {
                int i16 = size[i11];
                outPosition[i15] = i14;
                i14 += i16;
                i11++;
                i15++;
            }
            return;
        }
        int length2 = size.length;
        while (true) {
            length2--;
            if (-1 >= length2) {
                return;
            }
            int i17 = size[length2];
            outPosition[length2] = i14;
            i14 += i17;
        }
    }

    public final void placeSpaceAround$foundation_layout_release(int i10, int[] size, int[] outPosition, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPosition, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        float length = !(size.length == 0) ? (i10 - i12) / size.length : 0.0f;
        float f10 = length / 2;
        if (z10) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i14 = size[length2];
                outPosition[length2] = mv.d.roundToInt(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = size.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = size[i11];
            outPosition[i15] = mv.d.roundToInt(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final void placeSpaceBetween$foundation_layout_release(int i10, int[] size, int[] outPosition, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPosition, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        float f10 = 0.0f;
        float length = size.length > 1 ? (i10 - i12) / (size.length - 1) : 0.0f;
        if (z10) {
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i14 = size[length2];
                outPosition[length2] = mv.d.roundToInt(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = size.length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = size[i11];
            outPosition[i15] = mv.d.roundToInt(f10);
            f10 += i16 + length;
            i11++;
            i15++;
        }
    }

    public final void placeSpaceEvenly$foundation_layout_release(int i10, int[] size, int[] outPosition, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(size, "size");
        kotlin.jvm.internal.e0.checkNotNullParameter(outPosition, "outPosition");
        int i11 = 0;
        int i12 = 0;
        for (int i13 : size) {
            i12 += i13;
        }
        float length = (i10 - i12) / (size.length + 1);
        if (z10) {
            float f10 = length;
            for (int length2 = size.length - 1; -1 < length2; length2--) {
                int i14 = size[length2];
                outPosition[length2] = mv.d.roundToInt(f10);
                f10 += i14 + length;
            }
            return;
        }
        int length3 = size.length;
        float f11 = length;
        int i15 = 0;
        while (i11 < length3) {
            int i16 = size[i11];
            outPosition[i15] = mv.d.roundToInt(f11);
            f11 += i16 + length;
            i11++;
            i15++;
        }
    }

    /* renamed from: spacedBy-0680j_4, reason: not valid java name */
    public final h m3929spacedBy0680j_4(float f10) {
        return new l(f10, true, r.f56565e, null);
    }

    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final g m3930spacedByD5KLDUw(float f10, e1.b alignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        return new l(f10, true, new s(alignment), null);
    }

    /* renamed from: spacedBy-D5KLDUw, reason: not valid java name */
    public final o m3931spacedByD5KLDUw(float f10, e1.c alignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        return new l(f10, false, new t(alignment), null);
    }

    public final o aligned(e1.c alignment) {
        kotlin.jvm.internal.e0.checkNotNullParameter(alignment, "alignment");
        return new l(s2.i.m6817constructorimpl(0), false, new q(alignment), null);
    }

    public static /* synthetic */ void getBottom$annotations() {
    }

    public static /* synthetic */ void getCenter$annotations() {
    }

    public static /* synthetic */ void getEnd$annotations() {
    }

    public static /* synthetic */ void getSpaceAround$annotations() {
    }

    public static /* synthetic */ void getSpaceBetween$annotations() {
    }

    public static /* synthetic */ void getSpaceEvenly$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    public static /* synthetic */ void getTop$annotations() {
    }
}

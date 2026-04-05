package j1;

import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final l0 f68918b = new l0(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f68919c = o0.Color(4278190080L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f68920d = o0.Color(4282664004L);

    /* renamed from: e, reason: collision with root package name */
    public static final long f68921e = o0.Color(4287137928L);

    /* renamed from: f, reason: collision with root package name */
    public static final long f68922f = o0.Color(4291611852L);

    /* renamed from: g, reason: collision with root package name */
    public static final long f68923g = o0.Color(4294967295L);

    /* renamed from: h, reason: collision with root package name */
    public static final long f68924h = o0.Color(4294901760L);

    /* renamed from: i, reason: collision with root package name */
    public static final long f68925i = o0.Color(4278255360L);

    /* renamed from: j, reason: collision with root package name */
    public static final long f68926j = o0.Color(4278190335L);

    /* renamed from: k, reason: collision with root package name */
    public static final long f68927k = o0.Color(4294967040L);

    /* renamed from: l, reason: collision with root package name */
    public static final long f68928l = o0.Color(4278255615L);

    /* renamed from: m, reason: collision with root package name */
    public static final long f68929m = o0.Color(4294902015L);

    /* renamed from: n, reason: collision with root package name */
    public static final long f68930n = o0.Color(0);

    /* renamed from: o, reason: collision with root package name */
    public static final long f68931o = o0.Color(0.0f, 0.0f, 0.0f, 0.0f, k1.k.f70039a.getUnspecified$ui_graphics_release());

    /* renamed from: a, reason: collision with root package name */
    public final long f68932a;

    public /* synthetic */ m0(long j10) {
        this.f68932a = j10;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ m0 m4848boximpl(long j10) {
        return new m0(j10);
    }

    /* renamed from: component1-impl, reason: not valid java name */
    public static final float m4849component1impl(long j10) {
        return m4864getRedimpl(j10);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final float m4850component2impl(long j10) {
        return m4863getGreenimpl(j10);
    }

    /* renamed from: component3-impl, reason: not valid java name */
    public static final float m4851component3impl(long j10) {
        return m4861getBlueimpl(j10);
    }

    /* renamed from: component4-impl, reason: not valid java name */
    public static final float m4852component4impl(long j10) {
        return m4860getAlphaimpl(j10);
    }

    /* renamed from: component5-impl, reason: not valid java name */
    public static final k1.g m4853component5impl(long j10) {
        return m4862getColorSpaceimpl(j10);
    }

    /* renamed from: convert-vNxB06k, reason: not valid java name */
    public static final long m4855convertvNxB06k(long j10, k1.g colorSpace) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colorSpace, "colorSpace");
        if (kotlin.jvm.internal.e0.areEqual(colorSpace, m4862getColorSpaceimpl(j10))) {
            return j10;
        }
        k1.m mVarM5111connectYBCOT_4$default = k1.h.m5111connectYBCOT_4$default(m4862getColorSpaceimpl(j10), colorSpace, 0, 2, null);
        float[] fArrM4885access$getComponents8_81llA = o0.m4885access$getComponents8_81llA(j10);
        mVarM5111connectYBCOT_4$default.transform(fArrM4885access$getComponents8_81llA);
        return o0.Color(fArrM4885access$getComponents8_81llA[0], fArrM4885access$getComponents8_81llA[1], fArrM4885access$getComponents8_81llA[2], fArrM4885access$getComponents8_81llA[3], colorSpace);
    }

    /* renamed from: copy-wmQWz5c, reason: not valid java name */
    public static final long m4856copywmQWz5c(long j10, float f10, float f11, float f12, float f13) {
        return o0.Color(f11, f12, f13, f10, m4862getColorSpaceimpl(j10));
    }

    /* renamed from: copy-wmQWz5c$default, reason: not valid java name */
    public static /* synthetic */ long m4857copywmQWz5c$default(long j10, float f10, float f11, float f12, float f13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = m4860getAlphaimpl(j10);
        }
        float f14 = f10;
        if ((i10 & 2) != 0) {
            f11 = m4864getRedimpl(j10);
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = m4863getGreenimpl(j10);
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = m4861getBlueimpl(j10);
        }
        return m4856copywmQWz5c(j10, f14, f15, f16, f13);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4858equalsimpl(long j10, Object obj) {
        return (obj instanceof m0) && j10 == ((m0) obj).m4868unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4859equalsimpl0(long j10, long j11) {
        return j10 == j11;
    }

    /* renamed from: getAlpha-impl, reason: not valid java name */
    public static final float m4860getAlphaimpl(long j10) {
        float fUlongToDouble;
        float f10;
        if (tu.o0.m7081constructorimpl(63 & j10) == 0) {
            fUlongToDouble = (float) tu.z0.ulongToDouble(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10 >>> 56) & 255));
            f10 = 255.0f;
        } else {
            fUlongToDouble = (float) tu.z0.ulongToDouble(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10 >>> 6) & 1023));
            f10 = 1023.0f;
        }
        return fUlongToDouble / f10;
    }

    /* renamed from: getBlue-impl, reason: not valid java name */
    public static final float m4861getBlueimpl(long j10) {
        return tu.o0.m7081constructorimpl(63 & j10) == 0 ? ((float) tu.z0.ulongToDouble(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10 >>> 32) & 255))) / 255.0f : t0.m4977toFloatimpl(t0.m4961constructorimpl((short) tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10 >>> 16) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: getColorSpace-impl, reason: not valid java name */
    public static final k1.g m4862getColorSpaceimpl(long j10) {
        k1.k kVar = k1.k.f70039a;
        return kVar.getColorSpacesArray$ui_graphics_release()[(int) tu.o0.m7081constructorimpl(j10 & 63)];
    }

    /* renamed from: getGreen-impl, reason: not valid java name */
    public static final float m4863getGreenimpl(long j10) {
        return tu.o0.m7081constructorimpl(63 & j10) == 0 ? ((float) tu.z0.ulongToDouble(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10 >>> 40) & 255))) / 255.0f : t0.m4977toFloatimpl(t0.m4961constructorimpl((short) tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10 >>> 32) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: getRed-impl, reason: not valid java name */
    public static final float m4864getRedimpl(long j10) {
        return tu.o0.m7081constructorimpl(63 & j10) == 0 ? ((float) tu.z0.ulongToDouble(tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10 >>> 48) & 255))) / 255.0f : t0.m4977toFloatimpl(t0.m4961constructorimpl((short) tu.o0.m7081constructorimpl(tu.o0.m7081constructorimpl(j10 >>> 48) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4865hashCodeimpl(long j10) {
        return tu.o0.m7084hashCodeimpl(j10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4866toStringimpl(long j10) {
        return "Color(" + m4864getRedimpl(j10) + ", " + m4863getGreenimpl(j10) + ", " + m4861getBlueimpl(j10) + ", " + m4860getAlphaimpl(j10) + ", " + m4862getColorSpaceimpl(j10).getName() + ')';
    }

    public boolean equals(Object obj) {
        return m4858equalsimpl(this.f68932a, obj);
    }

    /* renamed from: getValue-s-VKNKU, reason: not valid java name */
    public final long m4867getValuesVKNKU() {
        return this.f68932a;
    }

    public int hashCode() {
        return m4865hashCodeimpl(this.f68932a);
    }

    public String toString() {
        return m4866toStringimpl(this.f68932a);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m4868unboximpl() {
        return this.f68932a;
    }

    public static /* synthetic */ void getAlpha$annotations() {
    }

    public static /* synthetic */ void getBlue$annotations() {
    }

    public static /* synthetic */ void getColorSpace$annotations() {
    }

    public static /* synthetic */ void getGreen$annotations() {
    }

    public static /* synthetic */ void getRed$annotations() {
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4854constructorimpl(long j10) {
        return j10;
    }
}

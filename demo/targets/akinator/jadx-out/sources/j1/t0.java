package j1;

import com.applovin.shadow.okhttp3.internal.http2.Settings;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 implements Comparable {

    /* renamed from: c, reason: collision with root package name */
    public static final s0 f68973c = new s0(null);

    /* renamed from: e, reason: collision with root package name */
    public static final short f68974e = m4961constructorimpl((short) 5120);

    /* renamed from: f, reason: collision with root package name */
    public static final short f68975f = m4961constructorimpl((short) -1025);

    /* renamed from: g, reason: collision with root package name */
    public static final short f68976g = m4961constructorimpl((short) 31743);

    /* renamed from: h, reason: collision with root package name */
    public static final short f68977h = m4961constructorimpl((short) 1024);

    /* renamed from: i, reason: collision with root package name */
    public static final short f68978i = m4961constructorimpl((short) 1);

    /* renamed from: j, reason: collision with root package name */
    public static final short f68979j = m4961constructorimpl((short) 32256);

    /* renamed from: k, reason: collision with root package name */
    public static final short f68980k = m4961constructorimpl((short) -1024);

    /* renamed from: l, reason: collision with root package name */
    public static final short f68981l = m4961constructorimpl(Short.MIN_VALUE);

    /* renamed from: m, reason: collision with root package name */
    public static final short f68982m = m4961constructorimpl((short) 31744);

    /* renamed from: n, reason: collision with root package name */
    public static final short f68983n = m4961constructorimpl((short) 0);

    /* renamed from: o, reason: collision with root package name */
    public static final short f68984o = m4960constructorimpl(1.0f);

    /* renamed from: p, reason: collision with root package name */
    public static final short f68985p = m4960constructorimpl(-1.0f);

    /* renamed from: q, reason: collision with root package name */
    public static final float f68986q = Float.intBitsToFloat(1056964608);

    /* renamed from: b, reason: collision with root package name */
    public final short f68987b;

    public /* synthetic */ t0(short s10) {
        this.f68987b = s10;
    }

    /* renamed from: absoluteValue-slo4al4, reason: not valid java name */
    public static final short m4955absoluteValueslo4al4(short s10) {
        return m4961constructorimpl((short) (s10 & Short.MAX_VALUE));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ t0 m4956boximpl(short s10) {
        return new t0(s10);
    }

    /* renamed from: ceil-slo4al4, reason: not valid java name */
    public static final short m4957ceilslo4al4(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = ((-((~(i10 >> 15)) & (i11 == 0 ? 0 : 1))) & 15360) | (s10 & Short.MIN_VALUE);
        } else if (i11 < 25600) {
            int i12 = (1 << (25 - (i11 >> 10))) - 1;
            i10 = (i10 + (((i10 >> 15) - 1) & i12)) & (~i12);
        }
        return m4961constructorimpl((short) i10);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m4961constructorimpl(short s10) {
        return s10;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4962equalsimpl(short s10, Object obj) {
        return (obj instanceof t0) && s10 == ((t0) obj).m4987unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4963equalsimpl0(short s10, short s11) {
        return s10 == s11;
    }

    /* renamed from: floor-slo4al4, reason: not valid java name */
    public static final short m4964floorslo4al4(short s10) {
        int i10 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        int i11 = s10 & 65535;
        int i12 = s10 & Short.MAX_VALUE;
        if (i12 < 15360) {
            int i13 = s10 & Short.MIN_VALUE;
            if (i11 <= 32768) {
                i10 = 0;
            }
            i11 = i13 | (i10 & 15360);
        } else if (i12 < 25600) {
            int i14 = (1 << (25 - (i12 >> 10))) - 1;
            i11 = (i11 + ((-(i11 >> 15)) & i14)) & (~i14);
        }
        return m4961constructorimpl((short) i11);
    }

    /* renamed from: getExponent-impl, reason: not valid java name */
    public static final int m4965getExponentimpl(short s10) {
        return ((s10 >>> 10) & 31) - 15;
    }

    /* renamed from: getSign-slo4al4, reason: not valid java name */
    public static final short m4966getSignslo4al4(short s10) {
        return m4971isNaNimpl(s10) ? f68979j : m4958compareTo41bOqos(s10, f68981l) < 0 ? f68985p : m4958compareTo41bOqos(s10, f68983n) > 0 ? f68984o : s10;
    }

    /* renamed from: getSignificand-impl, reason: not valid java name */
    public static final int m4967getSignificandimpl(short s10) {
        return s10 & 1023;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4968hashCodeimpl(short s10) {
        return Short.hashCode(s10);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m4969isFiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) != 31744;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m4970isInfiniteimpl(short s10) {
        return (s10 & Short.MAX_VALUE) == 31744;
    }

    /* renamed from: isNaN-impl, reason: not valid java name */
    public static final boolean m4971isNaNimpl(short s10) {
        return (s10 & Short.MAX_VALUE) > 31744;
    }

    /* renamed from: isNormalized-impl, reason: not valid java name */
    public static final boolean m4972isNormalizedimpl(short s10) {
        int i10 = s10 & 31744;
        return (i10 == 0 || i10 == 31744) ? false : true;
    }

    /* renamed from: round-slo4al4, reason: not valid java name */
    public static final short m4973roundslo4al4(short s10) {
        int i10 = Settings.DEFAULT_INITIAL_WINDOW_SIZE;
        int i11 = s10 & 65535;
        int i12 = s10 & Short.MAX_VALUE;
        if (i12 < 15360) {
            int i13 = s10 & Short.MIN_VALUE;
            if (i12 < 14336) {
                i10 = 0;
            }
            i11 = i13 | (i10 & 15360);
        } else if (i12 < 25600) {
            int i14 = i12 >> 10;
            i11 = (i11 + (1 << (24 - i14))) & (~((1 << (25 - i14)) - 1));
        }
        return m4961constructorimpl((short) i11);
    }

    /* renamed from: toBits-impl, reason: not valid java name */
    public static final int m4974toBitsimpl(short s10) {
        return m4971isNaNimpl(s10) ? f68979j : s10 & 65535;
    }

    /* renamed from: toByte-impl, reason: not valid java name */
    public static final byte m4975toByteimpl(short s10) {
        return (byte) m4977toFloatimpl(s10);
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m4976toDoubleimpl(short s10) {
        return m4977toFloatimpl(s10);
    }

    /* renamed from: toFloat-impl, reason: not valid java name */
    public static final float m4977toFloatimpl(short s10) {
        int i10;
        int i11;
        int i12;
        int i13 = Short.MIN_VALUE & s10;
        int i14 = ((65535 & s10) >>> 10) & 31;
        int i15 = s10 & 1023;
        if (i14 != 0) {
            int i16 = i15 << 13;
            if (i14 == 31) {
                i10 = 255;
                if (i16 != 0) {
                    i16 |= 4194304;
                }
            } else {
                i10 = i14 + 112;
            }
            int i17 = i10;
            i11 = i16;
            i12 = i17;
        } else {
            if (i15 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i15 + 1056964608) - f68986q;
                return i13 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i12 = 0;
            i11 = 0;
        }
        return Float.intBitsToFloat((i12 << 23) | (i13 << 16) | i11);
    }

    /* renamed from: toHexString-impl, reason: not valid java name */
    public static final String m4978toHexStringimpl(short s10) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 65535 & s10;
        int i11 = i10 >>> 15;
        int i12 = (i10 >>> 10) & 31;
        int i13 = s10 & 1023;
        if (i12 != 31) {
            if (i11 == 1) {
                sb2.append('-');
            }
            if (i12 != 0) {
                sb2.append("0x1.");
                String string = Integer.toString(i13, sv.e.checkRadix(16));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(new sv.x("0{2,}$").replaceFirst(string, ""));
                sb2.append('p');
                sb2.append(String.valueOf(i12 - 15));
            } else if (i13 == 0) {
                sb2.append("0x0.0p0");
            } else {
                sb2.append("0x0.");
                String string2 = Integer.toString(i13, sv.e.checkRadix(16));
                kotlin.jvm.internal.e0.checkNotNullExpressionValue(string2, "toString(this, checkRadix(radix))");
                sb2.append(new sv.x("0{2,}$").replaceFirst(string2, ""));
                sb2.append("p-14");
            }
        } else if (i13 == 0) {
            if (i11 != 0) {
                sb2.append('-');
            }
            sb2.append("Infinity");
        } else {
            sb2.append("NaN");
        }
        String string3 = sb2.toString();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(string3, "o.toString()");
        return string3;
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m4979toIntimpl(short s10) {
        return (int) m4977toFloatimpl(s10);
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m4980toLongimpl(short s10) {
        return (long) m4977toFloatimpl(s10);
    }

    /* renamed from: toRawBits-impl, reason: not valid java name */
    public static final int m4981toRawBitsimpl(short s10) {
        return s10 & 65535;
    }

    /* renamed from: toShort-impl, reason: not valid java name */
    public static final short m4982toShortimpl(short s10) {
        return (short) m4977toFloatimpl(s10);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4983toStringimpl(short s10) {
        return String.valueOf(m4977toFloatimpl(s10));
    }

    /* renamed from: trunc-slo4al4, reason: not valid java name */
    public static final short m4984truncslo4al4(short s10) {
        int i10 = 65535 & s10;
        int i11 = s10 & Short.MAX_VALUE;
        if (i11 < 15360) {
            i10 = Short.MIN_VALUE & s10;
        } else if (i11 < 25600) {
            i10 &= ~((1 << (25 - (i11 >> 10))) - 1);
        }
        return m4961constructorimpl((short) i10);
    }

    /* renamed from: withSign-qCeQghg, reason: not valid java name */
    public static final short m4985withSignqCeQghg(short s10, short s11) {
        return m4961constructorimpl((short) ((s10 & Short.MAX_VALUE) | (s11 & Short.MIN_VALUE)));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return m4986compareTo41bOqos(((t0) obj).m4987unboximpl());
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public int m4986compareTo41bOqos(short s10) {
        return m4958compareTo41bOqos(this.f68987b, s10);
    }

    public boolean equals(Object obj) {
        return m4962equalsimpl(this.f68987b, obj);
    }

    public final short getHalfValue() {
        return this.f68987b;
    }

    public int hashCode() {
        return m4968hashCodeimpl(this.f68987b);
    }

    public String toString() {
        return m4983toStringimpl(this.f68987b);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m4987unboximpl() {
        return this.f68987b;
    }

    /* renamed from: compareTo-41bOqos, reason: not valid java name */
    public static int m4958compareTo41bOqos(short s10, short s11) {
        if (m4971isNaNimpl(s10)) {
            return !m4971isNaNimpl(s11) ? 1 : 0;
        }
        if (m4971isNaNimpl(s11)) {
            return -1;
        }
        s0 s0Var = f68973c;
        return kotlin.jvm.internal.e0.compare(s0.access$toCompareValue(s0Var, s10), s0.access$toCompareValue(s0Var, s11));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m4960constructorimpl(float f10) {
        return m4961constructorimpl(s0.access$floatToHalf(f68973c, f10));
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m4959constructorimpl(double d10) {
        return m4960constructorimpl((float) d10);
    }
}

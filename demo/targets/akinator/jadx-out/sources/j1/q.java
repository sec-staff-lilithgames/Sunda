package j1;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    /* renamed from: ActualImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4902ActualImageShaderF49vj9s(y0 image, int i10, int i11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(image, "image");
        return new BitmapShader(g.asAndroidBitmap(image), s.m4941toAndroidTileMode0vamqd0(i10), s.m4941toAndroidTileMode0vamqd0(i11));
    }

    /* renamed from: ActualLinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4903ActualLinearGradientShaderVjE6UOU(long j10, long j11, List<m0> colors, List<Float> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        a(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new LinearGradient(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), i1.h.m4185getXimpl(j11), i1.h.m4186getYimpl(j11), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), s.m4941toAndroidTileMode0vamqd0(i10));
    }

    /* renamed from: ActualRadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4904ActualRadialGradientShader8uybcMk(long j10, float f10, List<m0> colors, List<Float> list, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        a(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new RadialGradient(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), f10, makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors), s.m4941toAndroidTileMode0vamqd0(i10));
    }

    /* renamed from: ActualSweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4905ActualSweepGradientShader9KIMszo(long j10, List<m0> colors, List<Float> list) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        a(colors, list);
        int iCountTransparentColors = countTransparentColors(colors);
        return new SweepGradient(i1.h.m4185getXimpl(j10), i1.h.m4186getYimpl(j10), makeTransparentColors(colors, iCountTransparentColors), makeTransparentStops(list, colors, iCountTransparentColors));
    }

    public static final void a(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    public static final int countTransparentColors(List<m0> colors) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        int i10 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = uu.p0.getLastIndex(colors);
        for (int i11 = 1; i11 < lastIndex; i11++) {
            if (m0.m4860getAlphaimpl(colors.get(i11).m4868unboximpl()) == 0.0f) {
                i10++;
            }
        }
        return i10;
    }

    public static final int[] makeTransparentColors(List<m0> colors, int i10) {
        int i11;
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            while (i12 < size) {
                iArr[i12] = o0.m4894toArgb8_81llA(colors.get(i12).m4868unboximpl());
                i12++;
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i10];
        int lastIndex = uu.p0.getLastIndex(colors);
        int size2 = colors.size();
        int i13 = 0;
        while (i12 < size2) {
            long jM4868unboximpl = colors.get(i12).m4868unboximpl();
            if (m0.m4860getAlphaimpl(jM4868unboximpl) == 0.0f) {
                if (i12 == 0) {
                    i11 = i13 + 1;
                    iArr2[i13] = o0.m4894toArgb8_81llA(m0.m4857copywmQWz5c$default(colors.get(1).m4868unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i12 == lastIndex) {
                    i11 = i13 + 1;
                    iArr2[i13] = o0.m4894toArgb8_81llA(m0.m4857copywmQWz5c$default(colors.get(i12 - 1).m4868unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i14 = i13 + 1;
                    iArr2[i13] = o0.m4894toArgb8_81llA(m0.m4857copywmQWz5c$default(colors.get(i12 - 1).m4868unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i13 += 2;
                    iArr2[i14] = o0.m4894toArgb8_81llA(m0.m4857copywmQWz5c$default(colors.get(i12 + 1).m4868unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i13 = i11;
            } else {
                iArr2[i13] = o0.m4894toArgb8_81llA(jM4868unboximpl);
                i13++;
            }
            i12++;
        }
        return iArr2;
    }

    public static final float[] makeTransparentStops(List<Float> list, List<m0> colors, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(colors, "colors");
        if (i10 == 0) {
            if (list != null) {
                return uu.y0.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i10];
        fArr[0] = list != null ? list.get(0).floatValue() : 0.0f;
        int lastIndex = uu.p0.getLastIndex(colors);
        int i11 = 1;
        for (int i12 = 1; i12 < lastIndex; i12++) {
            long jM4868unboximpl = colors.get(i12).m4868unboximpl();
            float fFloatValue = list != null ? list.get(i12).floatValue() : i12 / uu.p0.getLastIndex(colors);
            int i13 = i11 + 1;
            fArr[i11] = fFloatValue;
            if (m0.m4860getAlphaimpl(jM4868unboximpl) == 0.0f) {
                i11 += 2;
                fArr[i13] = fFloatValue;
            } else {
                i11 = i13;
            }
        }
        fArr[i11] = list != null ? list.get(uu.p0.getLastIndex(colors)).floatValue() : 1.0f;
        return fArr;
    }
}

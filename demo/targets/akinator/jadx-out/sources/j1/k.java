package j1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class k {
    public static final i1 Paint() {
        return new i();
    }

    public static final float getNativeAlpha(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        return paint.getAlpha() / 255.0f;
    }

    public static final boolean getNativeAntiAlias(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        return paint.isAntiAlias();
    }

    public static final long getNativeColor(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        return o0.Color(paint.getColor());
    }

    public static final int getNativeFilterQuality(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        return !paint.isFilterBitmap() ? r0.f68948b.m4909getNonefv9h1I() : r0.f68948b.m4907getLowfv9h1I();
    }

    public static final int getNativeStrokeCap(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i10 = strokeCap == null ? -1 : j.$EnumSwitchMapping$1[strokeCap.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? l2.f68912b.m4802getButtKaPHkGw() : l2.f68912b.m4804getSquareKaPHkGw() : l2.f68912b.m4803getRoundKaPHkGw() : l2.f68912b.m4802getButtKaPHkGw();
    }

    public static final int getNativeStrokeJoin(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : j.$EnumSwitchMapping$2[strokeJoin.ordinal()];
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? n2.f68936b.m4870getMiterLxFBmk8() : n2.f68936b.m4871getRoundLxFBmk8() : n2.f68936b.m4869getBevelLxFBmk8() : n2.f68936b.m4870getMiterLxFBmk8();
    }

    public static final float getNativeStrokeMiterLimit(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public static final float getNativeStrokeWidth(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public static final int getNativeStyle(Paint paint) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        Paint.Style style = paint.getStyle();
        return (style == null ? -1 : j.$EnumSwitchMapping$0[style.ordinal()]) == 1 ? k1.f68904b.m4780getStrokeTiuSbCo() : k1.f68904b.m4779getFillTiuSbCo();
    }

    public static final Paint makeNativePaint() {
        return new Paint(7);
    }

    public static final void setNativeAlpha(Paint paint, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        paint.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public static final void setNativeAntiAlias(Paint paint, boolean z10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        paint.setAntiAlias(z10);
    }

    /* renamed from: setNativeBlendMode-GB0RdKg, reason: not valid java name */
    public static final void m4782setNativeBlendModeGB0RdKg(Paint setNativeBlendMode, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            a3.f68843a.m4667setBlendModeGB0RdKg(setNativeBlendMode, i10);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(b.m4670toPorterDuffModes9anfk8(i10)));
        }
    }

    /* renamed from: setNativeColor-4WTKRHQ, reason: not valid java name */
    public static final void m4783setNativeColor4WTKRHQ(Paint setNativeColor, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(o0.m4894toArgb8_81llA(j10));
    }

    public static final void setNativeColorFilter(Paint paint, n0 n0Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        paint.setColorFilter(n0Var != null ? e.asAndroidColorFilter(n0Var) : null);
    }

    /* renamed from: setNativeFilterQuality-50PEsBU, reason: not valid java name */
    public static final void m4784setNativeFilterQuality50PEsBU(Paint setNativeFilterQuality, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!r0.m4922equalsimpl0(i10, r0.f68948b.m4909getNonefv9h1I()));
    }

    public static final void setNativePathEffect(Paint paint, m1 m1Var) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        m mVar = (m) m1Var;
        paint.setPathEffect(mVar != null ? mVar.getNativePathEffect() : null);
    }

    public static final void setNativeShader(Paint paint, Shader shader) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: setNativeStrokeCap-CSYIeUk, reason: not valid java name */
    public static final void m4785setNativeStrokeCapCSYIeUk(Paint setNativeStrokeCap, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(setNativeStrokeCap, "$this$setNativeStrokeCap");
        k2 k2Var = l2.f68912b;
        setNativeStrokeCap.setStrokeCap(l2.m4844equalsimpl0(i10, k2Var.m4804getSquareKaPHkGw()) ? Paint.Cap.SQUARE : l2.m4844equalsimpl0(i10, k2Var.m4803getRoundKaPHkGw()) ? Paint.Cap.ROUND : l2.m4844equalsimpl0(i10, k2Var.m4802getButtKaPHkGw()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    /* renamed from: setNativeStrokeJoin-kLtJ_vA, reason: not valid java name */
    public static final void m4786setNativeStrokeJoinkLtJ_vA(Paint setNativeStrokeJoin, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        m2 m2Var = n2.f68936b;
        setNativeStrokeJoin.setStrokeJoin(n2.m4881equalsimpl0(i10, m2Var.m4870getMiterLxFBmk8()) ? Paint.Join.MITER : n2.m4881equalsimpl0(i10, m2Var.m4869getBevelLxFBmk8()) ? Paint.Join.BEVEL : n2.m4881equalsimpl0(i10, m2Var.m4871getRoundLxFBmk8()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void setNativeStrokeMiterLimit(Paint paint, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        paint.setStrokeMiter(f10);
    }

    public static final void setNativeStrokeWidth(Paint paint, float f10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(paint, "<this>");
        paint.setStrokeWidth(f10);
    }

    /* renamed from: setNativeStyle--5YerkU, reason: not valid java name */
    public static final void m4787setNativeStyle5YerkU(Paint setNativeStyle, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(k1.m4798equalsimpl0(i10, k1.f68904b.m4780getStrokeTiuSbCo()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}

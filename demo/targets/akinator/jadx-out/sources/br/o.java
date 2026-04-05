package br;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o {

    /* renamed from: r, reason: collision with root package name */
    public static final y0 f9949r;

    /* renamed from: a, reason: collision with root package name */
    public final p f9950a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f9951b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f9952c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f9953d;

    /* renamed from: e, reason: collision with root package name */
    public final Float f9954e;

    /* renamed from: f, reason: collision with root package name */
    public final Float f9955f;

    /* renamed from: g, reason: collision with root package name */
    public final p0 f9956g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f9957h;

    /* renamed from: i, reason: collision with root package name */
    public final Float f9958i;

    /* renamed from: j, reason: collision with root package name */
    public final Integer f9959j;

    /* renamed from: k, reason: collision with root package name */
    public final Integer f9960k;

    /* renamed from: l, reason: collision with root package name */
    public final l1 f9961l;

    /* renamed from: m, reason: collision with root package name */
    public final Float f9962m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f9963n;

    /* renamed from: o, reason: collision with root package name */
    public final Float f9964o;

    /* renamed from: p, reason: collision with root package name */
    public final y0 f9965p;

    /* renamed from: q, reason: collision with root package name */
    public final Integer f9966q;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
        f9949r = y0.Center;
    }

    public o() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ int getBackgroundOrDefault$default(o oVar, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return oVar.getBackgroundOrDefault(i10);
    }

    public static /* synthetic */ int getCornerRadiusPxOrDefault$default(o oVar, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return oVar.getCornerRadiusPxOrDefault(context, i10);
    }

    public final p getBackground() {
        return this.f9950a;
    }

    public final Integer getBackgroundColor() {
        return this.f9951b;
    }

    public final int getBackgroundOrDefault(int i10) {
        Integer num = this.f9951b;
        return num != null ? num.intValue() : i10;
    }

    public final t getBorder(Context context) {
        Integer num;
        Integer strokeWidthPx;
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        if (!kotlin.jvm.internal.e0.areEqual(this.f9957h, Boolean.TRUE) || (num = this.f9959j) == null || (strokeWidthPx = getStrokeWidthPx(context)) == null || strokeWidthPx.intValue() <= 0) {
            return null;
        }
        return new t(strokeWidthPx.intValue(), num.intValue());
    }

    public final Boolean getClickable() {
        return this.f9953d;
    }

    public final Float getCornerRadius() {
        return this.f9962m;
    }

    public final Integer getCornerRadiusPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Float f10 = this.f9962m;
        if (f10 != null) {
            return Integer.valueOf(ir.s.dpToPx(context, f10.floatValue()));
        }
        return null;
    }

    public final int getCornerRadiusPxOrDefault(Context context, int i10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Float f10 = this.f9962m;
        return f10 != null ? ir.s.dpToPx(context, f10.floatValue()) : i10;
    }

    public final Integer getFillColor() {
        return this.f9966q;
    }

    public final Float getFontSize() {
        return this.f9955f;
    }

    public final p0 getFontStyleType() {
        return this.f9956g;
    }

    public final Float getOpacity() {
        return this.f9954e;
    }

    public final l1 getPadding() {
        return this.f9961l;
    }

    public final Integer getShadowColor() {
        return this.f9960k;
    }

    public final Integer getStrokeColor() {
        return this.f9959j;
    }

    public final Float getStrokeWidth() {
        return this.f9958i;
    }

    public final Integer getStrokeWidthPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Float f10 = this.f9958i;
        if (f10 != null) {
            return Integer.valueOf(ir.s.dpToPx(context, f10.floatValue()));
        }
        return null;
    }

    public final y0 getTextHorizontalGravity() {
        return this.f9965p;
    }

    public final Float getTextLineSpacing() {
        return this.f9964o;
    }

    public final Integer getTextLineSpacingPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Float f10 = this.f9964o;
        if (f10 != null) {
            return Integer.valueOf(ir.s.dpToPx(context, f10.floatValue()));
        }
        return null;
    }

    public final Integer getTextMaxLines() {
        return this.f9963n;
    }

    public final Boolean getVisible() {
        return this.f9952c;
    }

    public final Boolean isOutlined() {
        return this.f9957h;
    }

    public o(p pVar, Integer num, Boolean bool, Boolean bool2, Float f10, Float f11, p0 p0Var, Boolean bool3, Float f12, Integer num2, Integer num3, Integer num4, l1 l1Var, Float f13, Integer num5, Float f14, y0 textHorizontalGravity) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textHorizontalGravity, "textHorizontalGravity");
        this.f9950a = pVar;
        this.f9951b = num;
        this.f9952c = bool;
        this.f9953d = bool2;
        this.f9954e = f10;
        this.f9955f = f11;
        this.f9956g = p0Var;
        this.f9957h = bool3;
        this.f9958i = f12;
        this.f9959j = num2;
        this.f9960k = num4;
        this.f9961l = l1Var;
        this.f9962m = f13;
        this.f9963n = num5;
        this.f9964o = f14;
        this.f9965p = textHorizontalGravity;
        this.f9966q = num3 != null ? num3 : num;
    }

    @tu.f
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    public /* synthetic */ o(p pVar, Integer num, Boolean bool, Boolean bool2, Float f10, Float f11, p0 p0Var, Boolean bool3, Float f12, Integer num2, Integer num3, Integer num4, l1 l1Var, Float f13, Integer num5, Float f14, y0 y0Var, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? null : pVar, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? null : bool, (i10 & 8) != 0 ? null : bool2, (i10 & 16) != 0 ? null : f10, (i10 & 32) != 0 ? null : f11, (i10 & 64) != 0 ? null : p0Var, (i10 & 128) != 0 ? null : bool3, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : f12, (i10 & 512) != 0 ? null : num2, (i10 & 1024) != 0 ? null : num3, (i10 & 2048) != 0 ? null : num4, (i10 & 4096) != 0 ? null : l1Var, (i10 & Segment.SIZE) != 0 ? null : f13, (i10 & 16384) != 0 ? null : num5, (i10 & 32768) != 0 ? null : f14, (i10 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? f9949r : y0Var);
    }
}

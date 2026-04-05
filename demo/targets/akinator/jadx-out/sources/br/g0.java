package br;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.applovin.shadow.okio.Segment;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f9838a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9839b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9840c;

    /* renamed from: d, reason: collision with root package name */
    public final float f9841d;

    /* renamed from: e, reason: collision with root package name */
    public final x1 f9842e;

    /* renamed from: f, reason: collision with root package name */
    public final x1 f9843f;

    /* renamed from: g, reason: collision with root package name */
    public final x1 f9844g;

    /* renamed from: h, reason: collision with root package name */
    public final x1 f9845h;

    /* renamed from: i, reason: collision with root package name */
    public final float f9846i;

    /* renamed from: j, reason: collision with root package name */
    public final float f9847j;

    /* renamed from: k, reason: collision with root package name */
    public final float f9848k;

    /* renamed from: l, reason: collision with root package name */
    public final float f9849l;

    /* renamed from: m, reason: collision with root package name */
    public final float f9850m;

    /* renamed from: n, reason: collision with root package name */
    public final float f9851n;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public float f9852a;

        /* renamed from: b, reason: collision with root package name */
        public float f9853b;

        /* renamed from: c, reason: collision with root package name */
        public float f9854c;

        /* renamed from: d, reason: collision with root package name */
        public float f9855d;

        /* renamed from: e, reason: collision with root package name */
        public x1 f9856e;

        /* renamed from: f, reason: collision with root package name */
        public x1 f9857f;

        /* renamed from: g, reason: collision with root package name */
        public x1 f9858g;

        /* renamed from: h, reason: collision with root package name */
        public x1 f9859h;

        /* renamed from: i, reason: collision with root package name */
        public float f9860i;

        /* renamed from: j, reason: collision with root package name */
        public float f9861j;

        /* renamed from: k, reason: collision with root package name */
        public float f9862k;

        /* renamed from: l, reason: collision with root package name */
        public float f9863l;

        /* renamed from: m, reason: collision with root package name */
        public float f9864m;

        /* renamed from: n, reason: collision with root package name */
        public float f9865n;

        public final g0 build() {
            return new g0(this.f9852a, this.f9853b, this.f9854c, this.f9855d, this.f9856e, this.f9857f, this.f9858g, this.f9859h, this.f9860i, this.f9861j, this.f9862k, this.f9863l, this.f9864m, this.f9865n);
        }

        public final a setBottomSideBindParams(x1 x1Var) {
            this.f9859h = x1Var;
            return this;
        }

        public final a setHeight(float f10) {
            this.f9853b = f10;
            return this;
        }

        public final a setHeightPercent(float f10) {
            this.f9855d = f10;
            return this;
        }

        public final a setLeftSideBindParams(x1 x1Var) {
            this.f9856e = x1Var;
            return this;
        }

        public final a setMarginBottom(float f10) {
            this.f9863l = f10;
            return this;
        }

        public final a setMarginLeft(float f10) {
            this.f9860i = f10;
            return this;
        }

        public final a setMarginRight(float f10) {
            this.f9862k = f10;
            return this;
        }

        public final a setMarginTop(float f10) {
            this.f9861j = f10;
            return this;
        }

        public final a setRightSideBindParams(x1 x1Var) {
            this.f9858g = x1Var;
            return this;
        }

        public final a setTopSideBindParams(x1 x1Var) {
            this.f9857f = x1Var;
            return this;
        }

        public final a setTranslationX(float f10) {
            this.f9864m = f10;
            return this;
        }

        public final a setTranslationY(float f10) {
            this.f9865n = f10;
            return this;
        }

        public final a setWidth(float f10) {
            this.f9852a = f10;
            return this;
        }

        public final a setWidthPercent(float f10) {
            this.f9854c = f10;
            return this;
        }
    }

    public g0() {
        this(0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 16383, null);
    }

    public final x1 getBottomSideBindParams() {
        return this.f9845h;
    }

    public final float getHeight() {
        return this.f9839b;
    }

    public final float getHeightPercent() {
        return this.f9841d;
    }

    public final int getHeightPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return ir.s.dpToPx(context, this.f9839b);
    }

    public final x1 getLeftSideBindParams() {
        return this.f9842e;
    }

    public final float getMarginBottom() {
        return this.f9849l;
    }

    public final int getMarginBottomPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return ir.s.dpToPx(context, this.f9849l);
    }

    public final float getMarginLeft() {
        return this.f9846i;
    }

    public final int getMarginLeftPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return ir.s.dpToPx(context, this.f9846i);
    }

    public final float getMarginRight() {
        return this.f9848k;
    }

    public final int getMarginRightPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return ir.s.dpToPx(context, this.f9848k);
    }

    public final float getMarginTop() {
        return this.f9847j;
    }

    public final int getMarginTopPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return ir.s.dpToPx(context, this.f9847j);
    }

    public final x1 getRightSideBindParams() {
        return this.f9844g;
    }

    public final x1 getTopSideBindParams() {
        return this.f9843f;
    }

    public final float getTranslationX() {
        return this.f9850m;
    }

    public final int getTranslationXPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return ir.s.dpToPx(context, this.f9850m);
    }

    public final float getTranslationY() {
        return this.f9851n;
    }

    public final int getTranslationYPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return ir.s.dpToPx(context, this.f9851n);
    }

    public final float getWidth() {
        return this.f9838a;
    }

    public final float getWidthPercent() {
        return this.f9840c;
    }

    public final int getWidthPx(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        return ir.s.dpToPx(context, this.f9838a);
    }

    public g0(float f10, float f11, float f12, float f13, x1 x1Var, x1 x1Var2, x1 x1Var3, x1 x1Var4, float f14, float f15, float f16, float f17, float f18, float f19) {
        this.f9838a = f10;
        this.f9839b = f11;
        this.f9840c = f12;
        this.f9841d = f13;
        this.f9842e = x1Var;
        this.f9843f = x1Var2;
        this.f9844g = x1Var3;
        this.f9845h = x1Var4;
        this.f9846i = f14;
        this.f9847j = f15;
        this.f9848k = f16;
        this.f9849l = f17;
        this.f9850m = f18;
        this.f9851n = f19;
    }

    public /* synthetic */ g0(float f10, float f11, float f12, float f13, x1 x1Var, x1 x1Var2, x1 x1Var3, x1 x1Var4, float f14, float f15, float f16, float f17, float f18, float f19, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? 0.0f : f10, (i10 & 2) != 0 ? 0.0f : f11, (i10 & 4) != 0 ? 0.0f : f12, (i10 & 8) != 0 ? 0.0f : f13, (i10 & 16) != 0 ? null : x1Var, (i10 & 32) != 0 ? null : x1Var2, (i10 & 64) != 0 ? null : x1Var3, (i10 & 128) == 0 ? x1Var4 : null, (i10 & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? 0.0f : f14, (i10 & 512) != 0 ? 0.0f : f15, (i10 & 1024) != 0 ? 0.0f : f16, (i10 & 2048) != 0 ? 0.0f : f17, (i10 & 4096) != 0 ? 0.0f : f18, (i10 & Segment.SIZE) != 0 ? 0.0f : f19);
    }
}

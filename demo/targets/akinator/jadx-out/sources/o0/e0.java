package o0;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import j1.m0;
import j1.o0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e0 extends RippleDrawable {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f77323b;

    /* renamed from: c, reason: collision with root package name */
    public m0 f77324c;

    /* renamed from: e, reason: collision with root package name */
    public Integer f77325e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f77326f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public e0(boolean z10) {
        super(ColorStateList.valueOf(-16777216), null, z10 ? new ColorDrawable(-1) : null);
        this.f77323b = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public Rect getDirtyBounds() {
        if (!this.f77323b) {
            this.f77326f = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(dirtyBounds, "super.getDirtyBounds()");
        this.f77326f = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public boolean isProjected() {
        return this.f77326f;
    }

    /* renamed from: setColor-DxMtmZc, reason: not valid java name */
    public final void m5754setColorDxMtmZc(long j10, float f10) {
        if (Build.VERSION.SDK_INT < 28) {
            f10 *= 2;
        }
        long jM4857copywmQWz5c$default = m0.m4857copywmQWz5c$default(j10, qv.v.coerceAtMost(f10, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
        m0 m0Var = this.f77324c;
        if (m0Var == null ? false : m0.m4859equalsimpl0(m0Var.m4868unboximpl(), jM4857copywmQWz5c$default)) {
            return;
        }
        this.f77324c = m0.m4848boximpl(jM4857copywmQWz5c$default);
        setColor(ColorStateList.valueOf(o0.m4894toArgb8_81llA(jM4857copywmQWz5c$default)));
    }

    public final void trySetRadius(int i10) {
        Integer num = this.f77325e;
        if (num != null && num.intValue() == i10) {
            return;
        }
        this.f77325e = Integer.valueOf(i10);
        f0.f77327a.setRadius(this, i10);
    }
}

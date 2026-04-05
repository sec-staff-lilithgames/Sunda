package e4;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final EdgeEffect f53735a;

    @Deprecated
    public i(Context context) {
        this.f53735a = new EdgeEffect(context);
    }

    public static EdgeEffect create(Context context, AttributeSet attributeSet) {
        return Build.VERSION.SDK_INT >= 31 ? h.create(context, attributeSet) : new EdgeEffect(context);
    }

    public static float getDistance(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return h.getDistance(edgeEffect);
        }
        return 0.0f;
    }

    public static float onPullDistance(EdgeEffect edgeEffect, float f10, float f11) {
        if (Build.VERSION.SDK_INT >= 31) {
            return h.onPullDistance(edgeEffect, f10, f11);
        }
        onPull(edgeEffect, f10, f11);
        return f10;
    }

    @Deprecated
    public boolean draw(Canvas canvas) {
        return this.f53735a.draw(canvas);
    }

    @Deprecated
    public void finish() {
        this.f53735a.finish();
    }

    @Deprecated
    public boolean isFinished() {
        return this.f53735a.isFinished();
    }

    @Deprecated
    public boolean onAbsorb(int i10) {
        this.f53735a.onAbsorb(i10);
        return true;
    }

    @Deprecated
    public boolean onPull(float f10) {
        this.f53735a.onPull(f10);
        return true;
    }

    @Deprecated
    public boolean onRelease() {
        EdgeEffect edgeEffect = this.f53735a;
        edgeEffect.onRelease();
        return edgeEffect.isFinished();
    }

    @Deprecated
    public void setSize(int i10, int i11) {
        this.f53735a.setSize(i10, i11);
    }

    @Deprecated
    public boolean onPull(float f10, float f11) {
        onPull(this.f53735a, f10, f11);
        return true;
    }

    public static void onPull(EdgeEffect edgeEffect, float f10, float f11) {
        g.a(edgeEffect, f10, f11);
    }
}

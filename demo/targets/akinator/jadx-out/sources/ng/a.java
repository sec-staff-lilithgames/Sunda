package ng;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.digidust.elokence.akinator.freemium.R;
import jg.b;
import qg.t0;
import ug.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f76072f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f76073a;

    /* renamed from: b, reason: collision with root package name */
    public final int f76074b;

    /* renamed from: c, reason: collision with root package name */
    public final int f76075c;

    /* renamed from: d, reason: collision with root package name */
    public final int f76076d;

    /* renamed from: e, reason: collision with root package name */
    public final float f76077e;

    public a(Context context) {
        this(c.resolveBoolean(context, R.attr.elevationOverlayEnabled, false), b.getColor(context, R.attr.elevationOverlayColor, 0), b.getColor(context, R.attr.elevationOverlayAccentColor, 0), b.getColor(context, R.attr.colorSurface, 0), context.getResources().getDisplayMetrics().density);
    }

    public int calculateOverlayAlpha(float f10) {
        return Math.round(calculateOverlayAlphaFraction(f10) * 255.0f);
    }

    public float calculateOverlayAlphaFraction(float f10) {
        if (this.f76077e <= 0.0f || f10 <= 0.0f) {
            return 0.0f;
        }
        return Math.min(((((float) Math.log1p(f10 / r0)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
    }

    public int compositeOverlay(int i10, float f10, View view) {
        return compositeOverlay(i10, getParentAbsoluteElevation(view) + f10);
    }

    public int compositeOverlayIfNeeded(int i10, float f10, View view) {
        return compositeOverlayIfNeeded(i10, getParentAbsoluteElevation(view) + f10);
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10, View view) {
        return compositeOverlayWithThemeSurfaceColorIfNeeded(getParentAbsoluteElevation(view) + f10);
    }

    public float getParentAbsoluteElevation(View view) {
        return t0.getParentAbsoluteElevation(view);
    }

    public int getThemeElevationOverlayColor() {
        return this.f76074b;
    }

    public int getThemeSurfaceColor() {
        return this.f76076d;
    }

    public boolean isThemeElevationOverlayEnabled() {
        return this.f76073a;
    }

    public int compositeOverlay(int i10, float f10) {
        int i11;
        float fCalculateOverlayAlphaFraction = calculateOverlayAlphaFraction(f10);
        int iAlpha = Color.alpha(i10);
        int iLayer = b.layer(o3.b.setAlphaComponent(i10, 255), this.f76074b, fCalculateOverlayAlphaFraction);
        if (fCalculateOverlayAlphaFraction > 0.0f && (i11 = this.f76075c) != 0) {
            iLayer = b.layer(iLayer, o3.b.setAlphaComponent(i11, f76072f));
        }
        return o3.b.setAlphaComponent(iLayer, iAlpha);
    }

    public int compositeOverlayIfNeeded(int i10, float f10) {
        return (this.f76073a && o3.b.setAlphaComponent(i10, 255) == this.f76076d) ? compositeOverlay(i10, f10) : i10;
    }

    public int compositeOverlayWithThemeSurfaceColorIfNeeded(float f10) {
        return compositeOverlayIfNeeded(this.f76076d, f10);
    }

    public a(boolean z10, int i10, int i11, int i12, float f10) {
        this.f76073a = z10;
        this.f76074b = i10;
        this.f76075c = i11;
        this.f76076d = i12;
        this.f76077e = f10;
    }
}

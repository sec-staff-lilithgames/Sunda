package com.inmobi.media;

import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Jc {

    /* renamed from: a, reason: collision with root package name */
    public static final tu.o f31925a = tu.q.lazy(Ic.f31880a);

    public static final JSONObject a(String str, int i10) throws JSONException {
        JSONObject jSONObjectA = AbstractC3026ud.a(str, "targetViewId", "id", str);
        jSONObjectA.put(IronSourceConstants.EVENTS_ERROR_CODE, i10);
        return jSONObjectA;
    }

    public static final ag b(WindowInsets windowInsets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "<this>");
        ag agVarE = e(windowInsets);
        ag agVarC = c(windowInsets);
        ag agVarD = d(windowInsets);
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "<this>");
        Insets insets = windowInsets.getInsets(x3.t3.navigationBars());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(insets, "getInsets(...)");
        return a(agVarE, agVarC, agVarD, new ag(insets.left, insets.top, insets.right, insets.bottom));
    }

    public static final ag c(WindowInsets windowInsets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "<this>");
        R3 r32 = R3.f32183a;
        if (r32.J()) {
            Insets insets = windowInsets.getInsets(x3.t3.displayCutout());
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(insets, "getInsets(...)");
            return new ag(insets.left, insets.top, insets.right, insets.bottom);
        }
        if (!r32.H()) {
            return (ag) f31925a.getValue();
        }
        DisplayCutout displayCutout = windowInsets.getDisplayCutout();
        int safeInsetLeft = displayCutout != null ? displayCutout.getSafeInsetLeft() : 0;
        DisplayCutout displayCutout2 = windowInsets.getDisplayCutout();
        int safeInsetTop = displayCutout2 != null ? displayCutout2.getSafeInsetTop() : 0;
        DisplayCutout displayCutout3 = windowInsets.getDisplayCutout();
        int safeInsetRight = displayCutout3 != null ? displayCutout3.getSafeInsetRight() : 0;
        DisplayCutout displayCutout4 = windowInsets.getDisplayCutout();
        return new ag(safeInsetLeft, safeInsetTop, safeInsetRight, displayCutout4 != null ? displayCutout4.getSafeInsetBottom() : 0);
    }

    public static final ag d(WindowInsets windowInsets) {
        int iSin;
        int iSin2;
        int iSin3;
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "<this>");
        if (!R3.f32183a.K()) {
            return (ag) f31925a.getValue();
        }
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(3);
        int iSin4 = 0;
        RoundedCorner roundedCorner2 = windowInsets.getRoundedCorner(0);
        RoundedCorner roundedCorner3 = windowInsets.getRoundedCorner(1);
        RoundedCorner roundedCorner4 = windowInsets.getRoundedCorner(2);
        if (roundedCorner != null) {
            iSin = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner.getRadius());
        } else {
            iSin = 0;
        }
        if (roundedCorner2 != null) {
            iSin2 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner2.getRadius());
        } else {
            iSin2 = 0;
        }
        if (roundedCorner3 != null) {
            iSin3 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner3.getRadius());
        } else {
            iSin3 = 0;
        }
        if (roundedCorner4 != null) {
            iSin4 = (int) (Math.sin(Math.toRadians(45.0d)) * roundedCorner4.getRadius());
        }
        return new ag(Math.max(iSin, iSin2), Math.max(iSin2, iSin3), Math.max(iSin4, iSin3), Math.max(iSin, iSin4));
    }

    public static final ag e(WindowInsets windowInsets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "<this>");
        R3 r32 = R3.f32183a;
        if (!r32.J()) {
            return r32.I() ? new ag(windowInsets.getSystemGestureInsets().left, windowInsets.getSystemGestureInsets().top, windowInsets.getSystemGestureInsets().right, windowInsets.getSystemGestureInsets().bottom) : (ag) f31925a.getValue();
        }
        Insets insets = windowInsets.getInsets(x3.t3.systemGestures());
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(insets, "getInsets(...)");
        return new ag(insets.left, insets.top, insets.right, insets.bottom);
    }

    public static final ag a(WindowInsets windowInsets) {
        kotlin.jvm.internal.e0.checkNotNullParameter(windowInsets, "<this>");
        return a(e(windowInsets), c(windowInsets), d(windowInsets), (ag) f31925a.getValue());
    }

    public static final ag a(ag area, ag display, ag roundedCorner, ag navigationBar) {
        kotlin.jvm.internal.e0.checkNotNullParameter(area, "area");
        kotlin.jvm.internal.e0.checkNotNullParameter(display, "display");
        kotlin.jvm.internal.e0.checkNotNullParameter(roundedCorner, "roundedCorner");
        kotlin.jvm.internal.e0.checkNotNullParameter(navigationBar, "navigationBar");
        return new ag(xu.e.maxOf(area.f32659a, display.f32659a, roundedCorner.f32659a, navigationBar.f32659a), xu.e.maxOf(area.f32660b, display.f32660b, roundedCorner.f32660b, navigationBar.f32660b), xu.e.maxOf(area.f32661c, display.f32661c, roundedCorner.f32661c, navigationBar.f32661c), xu.e.maxOf(area.f32662d, display.f32662d, roundedCorner.f32662d, navigationBar.f32662d));
    }
}

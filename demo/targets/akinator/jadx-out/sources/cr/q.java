package cr;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import br.k1;
import um.h0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public static final dr.e f50924a = new dr.e();

    public static void applyInsets(Activity activity, View view) {
        applyInsets(activity, view, true);
    }

    public static void cancelOnUiThread(Runnable runnable) {
        f50924a.cancel(runnable);
    }

    public static int dpToPx(Context context, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return h0.dpToPx(context, f10);
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static Rect getLocationInWindow(View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]);
    }

    public static float getNotOverlappedAreaPercent(Rect rect, Rect rect2) {
        int iHeight = rect.height() * rect.width();
        if (iHeight == 0) {
            return 0.0f;
        }
        int iMin = Math.min(rect.right, rect2.right);
        int iMax = Math.max(rect.left, rect2.left);
        int iMin2 = Math.min(rect.bottom, rect2.bottom);
        int iMax2 = Math.max(rect.top, rect2.top);
        return (iHeight - (Math.max(0, iMin2 - iMax2) * Math.max(0, iMin - iMax))) / iHeight;
    }

    public static boolean isViewTransparent(View view) {
        return view.getAlpha() == 0.0f;
    }

    public static boolean isViewVisible(int i10) {
        return i10 == 0;
    }

    public static void onUiThread(Runnable runnable) {
        f50924a.execute(runnable);
    }

    public static <I> void onUiThreadWithArgSafely(I i10, ir.d dVar) {
        if (dVar == null) {
            return;
        }
        ir.n.onUiThread(new bq.c(3, dVar, i10));
    }

    public static void setupActivityOrientation(Activity activity, k1 k1Var) {
        activity.setRequestedOrientation(k1Var != null ? k1Var.getActivityOrientation() : 4);
    }

    public static String toString(int i10) {
        return i10 != 0 ? i10 != 4 ? i10 != 8 ? "unknown" : "GONE" : "INVISIBLE" : "VISIBLE";
    }

    public static void applyInsets(Activity activity, View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : view;
            view.setPadding(0, 0, 0, 0);
            ir.t.setInsetsChanger(decorView);
            if (z10) {
                decorView.requestApplyInsets();
            }
        }
    }

    public static void onUiThread(Runnable runnable, long j10) {
        f50924a.schedule(runnable, j10);
    }
}

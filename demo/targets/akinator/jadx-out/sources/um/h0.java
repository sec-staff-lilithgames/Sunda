package um;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import com.mbridge.msdk.scheme.request.VDe.SUvoXnn;
import java.io.Closeable;
import java.io.Flushable;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f88588a = new Handler(Looper.getMainLooper());

    public static double a(Random random, float f10) {
        double dSin = Math.sin(Math.abs(((random.nextLong() % 100000) + 1) / 100000.0d) * 6.283185307179586d) * Math.sqrt(Math.log(Math.abs(((random.nextLong() % 100000) + 1) / 100000.0d)) * (-2.0d));
        double d10 = f10;
        return Math.min(1.0d, Math.max(0.0d, (d10 < 0.4d || d10 > 0.6d) ? d10 < 0.4d ? (0.1f / (dSin * dSin)) + d10 : d10 - (0.1f / (dSin * dSin)) : (dSin * 0.1f) + d10));
    }

    public static void applyFullscreenActivityFlags(Activity activity) {
        applyFullscreenActivityFlags(activity, true);
    }

    public static void applyWindowInsets(Activity activity) {
        if (Build.VERSION.SDK_INT >= 34) {
            Window window = activity.getWindow();
            if (window != null) {
                applyWindowInsets(window.getDecorView());
            } else {
                applyWindowInsets(activity.findViewById(R.id.content));
            }
        }
    }

    public static void cancelOnUiThread(Runnable runnable) {
        f88588a.removeCallbacks(runnable);
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable th2) {
                j.e("Utils", th2);
            }
        }
    }

    public static Float convertCssSizeToPx(String str) {
        return Float.valueOf(str.replace("px", ""));
    }

    public static int dpToPx(Context context, float f10) {
        return (int) TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static Point getClickPoint(Rect rect, int i10, int i11) {
        return getClickPoint(rect.width(), rect.height(), i10, i11);
    }

    public static Point getDefaultClickPoint(Rect rect) {
        return getDefaultClickPoint(rect.width(), rect.height());
    }

    public static int getScreenOrientation(Context context) {
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i10 = context.getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return (rotation == 2 || rotation == 3) ? 9 : 1;
        }
        if (i10 == 2) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        return 9;
    }

    public static boolean isLandscapeOrientation(Context context) {
        int screenOrientation = getScreenOrientation(context);
        return screenOrientation == 0 || screenOrientation == 8 || screenOrientation == 6 || screenOrientation == 11;
    }

    public static boolean isNetworkAvailable(Context context) {
        NetworkInfo activeNetworkInfo;
        j.d("Utils", "Testing connectivity:", new Object[0]);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            j.d("Utils", "No Internet connection", new Object[0]);
            return false;
        }
        j.d("Utils", "Connected to Internet", new Object[0]);
        return true;
    }

    public static boolean isTablet(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        double d10 = displayMetrics.widthPixels / displayMetrics.xdpi;
        double d11 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return Math.sqrt((d11 * d11) + (d10 * d10)) >= 6.6d;
    }

    public static boolean isViewTransparent(View view) {
        return view.getAlpha() == 0.0f;
    }

    public static Float max(Float f10, Float f11) {
        return f10 == null ? f11 : f11 == null ? f10 : Float.valueOf(Math.max(f10.floatValue(), f11.floatValue()));
    }

    public static Float min(Float f10, Float f11) {
        return f10 == null ? f11 : f11 == null ? f10 : Float.valueOf(Math.min(f10.floatValue(), f11.floatValue()));
    }

    public static MotionEvent obtainMotionEvent(int i10, int i11, int i12) {
        return MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), i10, i11, i12, 0);
    }

    public static void onUiThread(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            f88588a.post(runnable);
        }
    }

    public static int orientationBySize(int i10, int i11) {
        return i10 > i11 ? 2 : 1;
    }

    public static String orientationToString(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "UNKNOWN" : "LANDSCAPE" : "PORTRAIT" : "UNDEFINED";
    }

    public static int pixelsToIntDips(float f10, float f11) {
        return (int) ((f10 / f11) + 0.5f);
    }

    public static void postOnUiThread(Runnable runnable) {
        f88588a.post(runnable);
    }

    public static void removeFromParent(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }

    public static void simpleTrackUrl(String str) {
        simpleTrackUrl(str, Executors.newSingleThreadExecutor());
    }

    public static String stringifyRect(Rect rect) {
        return rect.left + "," + rect.top + "," + rect.width() + "," + rect.height();
    }

    public static String stringifySize(Rect rect) {
        return rect.width() + "," + rect.height();
    }

    public static void applyFullscreenActivityFlags(Activity activity, boolean z10) {
        int i10;
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            if (Build.VERSION.SDK_INT >= 30) {
                WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
                if (windowInsetsController != null) {
                    windowInsetsController.setSystemBarsBehavior(2);
                    if (z10) {
                        windowInsetsController.hide(WindowInsets.Type.statusBars());
                    }
                }
            } else {
                if (z10) {
                    window.setFlags(1024, 1024);
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    window.getDecorView().setSystemUiVisibility(i10);
                }
            }
        }
        InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static void flush(Flushable flushable) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (Throwable th2) {
                j.e(SUvoXnn.MkncsGRTXBuZ, th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Point getClickPoint(int r8, int r9, int r10, int r11) {
        /*
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 1
            r2 = 1056964608(0x3f000000, float:0.5)
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 17
            if (r10 == r1) goto L18
            r1 = 3
            if (r10 == r1) goto L16
            if (r10 == r5) goto L18
            r10 = r4
            goto L19
        L16:
            r10 = r3
            goto L19
        L18:
            r10 = r2
        L19:
            double r6 = a(r0, r10)
            r10 = 16
            if (r11 == r10) goto L2a
            if (r11 == r5) goto L2a
            r10 = 80
            if (r11 == r10) goto L29
            r2 = r3
            goto L2a
        L29:
            r2 = r4
        L2a:
            double r10 = a(r0, r2)
            android.graphics.Point r0 = new android.graphics.Point
            double r1 = (double) r8
            double r1 = r1 * r6
            int r8 = (int) r1
            double r1 = (double) r9
            double r1 = r1 * r10
            int r9 = (int) r1
            r0.<init>(r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: um.h0.getClickPoint(int, int, int, int):android.graphics.Point");
    }

    public static Point getDefaultClickPoint(int i10, int i11) {
        return new Point(Math.round(i10 * 0.5f), Math.round(i11 * 0.7f));
    }

    public static void simpleTrackUrl(String str, Executor executor) {
        if (TextUtils.isEmpty(str)) {
            j.d("Utils", "url is null or empty", new Object[0]);
            return;
        }
        try {
            executor.execute(new nm.i(str, 3));
        } catch (Exception e10) {
            j.e("Utils", e10);
        }
    }

    public static void onUiThread(Runnable runnable, long j10) {
        f88588a.postDelayed(runnable, j10);
    }

    public static void applyWindowInsets(View view) {
        applyWindowInsets(view, WindowInsets.Type.systemBars() | WindowInsets.Type.displayCutout());
    }

    public static void applyWindowInsets(View view, int i10) {
        view.setOnApplyWindowInsetsListener(new g0(i10));
        view.requestApplyInsets();
    }
}

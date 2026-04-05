package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class va {

    /* renamed from: au, reason: collision with root package name */
    private static boolean f21609au = true;

    /* renamed from: cm, reason: collision with root package name */
    private static int f21610cm = -1;

    /* renamed from: if, reason: not valid java name */
    private static final Object f168if = new Object();

    /* renamed from: jd, reason: collision with root package name */
    private static int f21611jd = -1;

    /* renamed from: jj, reason: collision with root package name */
    private static int f21612jj = -1;
    private static float jpo = -1.0f;

    /* renamed from: ju, reason: collision with root package name */
    private static Boolean f21613ju = null;
    private static int my = -1;

    /* renamed from: qk, reason: collision with root package name */
    private static WindowManager f21614qk = null;
    private static float wqx = -1.0f;
    private static ViewConfiguration xyk = null;

    /* renamed from: yd, reason: collision with root package name */
    private static float f21615yd = -1.0f;
    private static int zz = -1;

    public static int au(Context context) {
        return ((Integer) ju(context).first).intValue();
    }

    public static int cm(Context context) {
        jpo(context);
        return wqx(context, f21610cm);
    }

    public static boolean hna(Context context) {
        String str = Build.MODEL;
        return str.equals("IN2010") || str.equals("IN2020") || str.equals("KB2000") || str.startsWith("ONEPLUS");
    }

    /* renamed from: if, reason: not valid java name */
    public static int m499if(Context context) {
        return ((Integer) ju(context).second).intValue();
    }

    public static int jj(Context context) {
        if (context == null) {
            com.bytedance.sdk.openadsdk.core.sq.jpo();
        }
        if (context == null) {
            return f21612jj;
        }
        if (context.getResources() != null && context.getResources().getConfiguration() != null) {
            f21612jj = context.getResources().getConfiguration().smallestScreenWidthDp;
        }
        return f21612jj;
    }

    private static boolean jpo(int i10) {
        return i10 == 0 || i10 == 8 || i10 == 4;
    }

    public static Pair<Integer, Integer> ju(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.openadsdk.core.sq.jpo();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    public static int my(Context context) {
        jpo(context);
        return my;
    }

    public static boolean opi(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    public static boolean oya(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) clsLoadClass.getMethod("hasNotchInScreen", null).invoke(clsLoadClass, null)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static boolean prr(Context context) throws ClassNotFoundException {
        try {
            Class<?> clsLoadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) clsLoadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(clsLoadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    public static int qk(Context context) {
        jpo(context);
        return wqx(context, my);
    }

    public static boolean sq(Context context) {
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            String string = identifier > 0 ? resources.getString(identifier) : null;
            if (string != null) {
                if (!TextUtils.isEmpty(string)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    private static boolean wqx() {
        return jpo < 0.0f || f21611jd < 0 || wqx < 0.0f || f21610cm < 0 || my < 0;
    }

    public static float xyk(Context context) {
        jpo(context, true);
        return jpo;
    }

    public static int yd(Context context) {
        jpo(context);
        return f21611jd;
    }

    public static float zz(Context context) {
        jpo(context);
        return wqx;
    }

    public static int jd(Context context, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return Float.valueOf(jpo(context, f10, true)).intValue();
    }

    public static void jpo(Context context) {
        jpo(context, false);
    }

    public static int wqx(Context context, float f10) {
        jpo(context, true);
        float fXyk = xyk(context);
        if (fXyk <= 0.0f) {
            fXyk = 1.0f;
        }
        return (int) ((f10 / fXyk) + 0.5f);
    }

    public static boolean cm(View view) {
        return view != null && view.getVisibility() == 0;
    }

    public static int[] jd(Context context) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (context == null) {
            return null;
        }
        if (f21614qk == null) {
            f21614qk = (WindowManager) com.bytedance.sdk.openadsdk.core.sq.jpo().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = f21614qk;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i10 = displayMetrics.widthPixels;
            int i11 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i10 = point.x;
                i11 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i10;
            iArr[1] = i11;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static void jpo(Context context, boolean z10) {
        Context contextJpo = context == null ? com.bytedance.sdk.openadsdk.core.sq.jpo() : context;
        if (contextJpo == null) {
            return;
        }
        f21614qk = (WindowManager) contextJpo.getSystemService("window");
        if (wqx() || z10) {
            DisplayMetrics displayMetrics = contextJpo.getResources().getDisplayMetrics();
            jpo = displayMetrics.density;
            f21611jd = displayMetrics.densityDpi;
            wqx = displayMetrics.scaledDensity;
            f21610cm = displayMetrics.widthPixels;
            my = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        Configuration configuration = context.getResources().getConfiguration();
        if (configuration.orientation == 1) {
            int i10 = f21610cm;
            int i11 = my;
            if (i10 > i11) {
                f21610cm = i11;
                my = i10;
            }
        } else {
            int i12 = f21610cm;
            int i13 = my;
            if (i12 < i13) {
                f21610cm = i13;
                my = i12;
            }
        }
        f21612jj = configuration.smallestScreenWidthDp;
    }

    public static void my(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.va.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    va.jpo(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        objectAnimatorOfFloat.setDuration(800L);
        objectAnimatorOfFloat.start();
    }

    public static void qk(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static boolean cm(Activity activity) {
        DisplayCutout displayCutout;
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                if (rootWindowInsets != null) {
                    displayCutout = rootWindowInsets.getDisplayCutout();
                    f21609au = false;
                } else {
                    displayCutout = null;
                }
                if (displayCutout != null) {
                    return true;
                }
            } catch (Exception e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", e10.getMessage());
            }
        }
        return false;
    }

    public static int wqx(Context context) {
        jpo(context);
        return f21610cm;
    }

    public static int[] wqx(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    public static void jj(View view) {
        if (view == null) {
            return;
        }
        jpo(view, 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.va.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                onAnimationEnd(animator);
            }
        });
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.start();
    }

    public static boolean wqx(Activity activity) {
        if (f21613ju == null) {
            synchronized (f168if) {
                try {
                    if (f21613ju == null) {
                        String strJpo = com.bytedance.sdk.openadsdk.rq.jpo.jpo("cutout_devices", "");
                        String str = Build.MODEL;
                        if (!TextUtils.isEmpty(strJpo) && !TextUtils.isEmpty(str)) {
                            try {
                                JSONArray jSONArray = new JSONArray(strJpo);
                                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                                    if (str.equals(jSONArray.getString(i10))) {
                                        f21613ju = Boolean.TRUE;
                                        return true;
                                    }
                                }
                            } catch (Exception e10) {
                                com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", e10.getMessage());
                            }
                        }
                        f21613ju = Boolean.valueOf(cm(activity) || jpo("ro.miui.notch", activity) == 1 || oya(activity) || opi(activity) || prr(activity) || hna(activity) || sq(activity));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f21613ju.booleanValue();
    }

    public static int[] jd(View view) {
        if (view == null) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static float jpo(Context context, float f10) {
        jpo(context);
        return zz(context) * f10;
    }

    public static void jd(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    public static float jpo(Context context, float f10, boolean z10) {
        jpo(context);
        return (xyk(context) * f10) + (z10 ? 0.5f : 0.0f);
    }

    public static int[] jpo(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    public static boolean jd() {
        return f21609au && Build.VERSION.SDK_INT >= 28;
    }

    private static Bitmap jd(com.bytedance.sdk.component.zz.jj jjVar) {
        if (jjVar == null) {
            return null;
        }
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(jjVar.getWidth(), jjVar.getHeight(), Bitmap.Config.RGB_565);
            jjVar.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void jpo(View view, int i10) {
        if (view == null || view.getVisibility() == i10 || !jpo(i10)) {
            return;
        }
        view.setVisibility(i10);
    }

    public static void jpo(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void wqx(final com.bytedance.sdk.openadsdk.core.model.dt dtVar, String str, String str2, final Bitmap bitmap, final String str3, final long j10) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(System.currentTimeMillis(), dtVar, str, str2, new com.bytedance.sdk.openadsdk.prr.wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.utils.va.4
                        @Override // com.bytedance.sdk.openadsdk.prr.wqx.jpo, com.bytedance.sdk.openadsdk.prr.wqx.jd
                        public JSONObject wqx() throws JSONException {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                int iJpo = va.jpo(bitmap);
                                jSONObject.put("url", str3);
                                long j11 = j10;
                                if (j11 != -1) {
                                    jSONObject.put("page_id", j11);
                                }
                                jSONObject.put("render_type", "h5");
                                jSONObject.put("render_type_2", 0);
                                jSONObject.put("is_blank", iJpo == 100 ? 1 : 0);
                                jSONObject.put("is_playable", com.bytedance.sdk.openadsdk.core.model.rv.jd(dtVar) ? 1 : 0);
                                jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.au.wqx.jpo.jpo().jpo(dtVar) ? 1 : 0);
                            } catch (JSONException unused) {
                            }
                            return jSONObject;
                        }
                    });
                }
            } catch (Throwable th2) {
                com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th2)));
            }
        }
    }

    private static ArrayList<Integer> jd(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i10 = width * height;
            int[] iArr = new int[i10];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i12) >> 16, (65280 & i12) >> 8, i12 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void jpo(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        jpo(view, (ViewGroup.MarginLayoutParams) layoutParams, i10, i11, i12, i13);
    }

    private static void jpo(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11, int i12, int i13) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i10 && marginLayoutParams.topMargin == i11 && marginLayoutParams.rightMargin == i12 && marginLayoutParams.bottomMargin == i13) {
            return;
        }
        if (i10 != -3) {
            marginLayoutParams.leftMargin = i10;
        }
        if (i11 != -3) {
            marginLayoutParams.topMargin = i11;
        }
        if (i12 != -3) {
            marginLayoutParams.rightMargin = i12;
        }
        if (i13 != -3) {
            marginLayoutParams.bottomMargin = i13;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    public static void jd(View view, final float f10) {
        if (view != null && f10 > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.va.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f10);
                }
            });
            view.setClipToOutline(true);
        }
    }

    private static Bitmap jpo(WebView webView) {
        Bitmap bitmapCreateBitmap = null;
        try {
            Picture pictureCapturePicture = webView.capturePicture();
            bitmapCreateBitmap = Bitmap.createBitmap(pictureCapturePicture.getWidth(), pictureCapturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            pictureCapturePicture.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", th2.getMessage());
            return bitmapCreateBitmap;
        }
    }

    public static float jpo() {
        float f10 = f21615yd;
        if (f10 > 0.0f) {
            return f10;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.sq.jpo().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier <= 0) {
            return 0.0f;
        }
        float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
        f21615yd = dimensionPixelSize;
        return dimensionPixelSize;
    }

    public static void jpo(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", e10.getMessage());
        }
    }

    public static int jpo(String str, Activity activity) throws ClassNotFoundException {
        if (hx.my()) {
            try {
                Class<?> clsLoadClass = activity.getClassLoader().loadClass("android.os.SystemProperties");
                return ((Integer) clsLoadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(clsLoadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e10) {
                com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", e10.getMessage());
            } catch (IllegalAccessException e11) {
                com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", e11.getMessage());
            } catch (IllegalArgumentException e12) {
                com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", e12.getMessage());
            } catch (NoSuchMethodException e13) {
                com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", e13.getMessage());
            } catch (InvocationTargetException e14) {
                com.bytedance.sdk.component.utils.nmd.wqx("UIUtils", e14.getMessage());
            }
        }
        return 0;
    }

    public static void jpo(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.nmd.wqx("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public static void jpo(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            com.bytedance.sdk.component.utils.nmd.wqx("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    public static void jpo(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setAlpha(f10);
    }

    public static void jpo(TextView textView, com.bytedance.sdk.openadsdk.core.widget.hna hnaVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        jpo(textView, hnaVar, dtVar, 14);
    }

    public static void jpo(TextView textView, com.bytedance.sdk.openadsdk.core.widget.hna hnaVar, com.bytedance.sdk.openadsdk.core.model.dt dtVar, int i10) {
        jpo(textView, hnaVar, (dtVar == null || dtVar.xur() == null) ? -1.0d : dtVar.xur().cm(), i10);
    }

    public static void jpo(TextView textView, com.bytedance.sdk.openadsdk.core.widget.hna hnaVar, double d10, int i10) {
        if (d10 == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            hnaVar.setVisibility(8);
        } else {
            if (textView != null) {
                textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d10)));
            }
            jpo(hnaVar, d10, i10);
        }
    }

    public static void jpo(com.bytedance.sdk.openadsdk.core.widget.hna hnaVar, double d10, int i10) {
        if (d10 < 0.0d) {
            hnaVar.setVisibility(8);
        } else {
            hnaVar.setVisibility(0);
            hnaVar.jpo(d10, i10);
        }
    }

    public static Bitmap jpo(com.bytedance.sdk.component.zz.jj jjVar) {
        WebView webView = jjVar.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap bitmapJd = jd(jjVar);
        if (bitmapJd == null) {
            bitmapJd = jpo(webView);
        }
        webView.setLayerType(layerType, null);
        if (bitmapJd == null) {
            return null;
        }
        return com.bytedance.sdk.component.utils.cm.jpo(bitmapJd, bitmapJd.getWidth() / 6, bitmapJd.getHeight() / 6);
    }

    public static void jpo(final com.bytedance.sdk.openadsdk.core.model.dt dtVar, final String str, final String str2, final Bitmap bitmap, final String str3, final long j10) {
        duq.jd(new com.bytedance.sdk.component.xyk.xyk("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.va.3
            @Override // java.lang.Runnable
            public void run() {
                va.wqx(dtVar, str, str2, bitmap, str3, j10);
            }
        }, 10);
    }

    public static int jpo(Bitmap bitmap) {
        try {
            ArrayList<Integer> arrayListJd = jd(bitmap);
            if (arrayListJd == null) {
                return -1;
            }
            HashMap map = new HashMap();
            Iterator<Integer> it = arrayListJd.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (map.containsKey(next)) {
                    Integer numValueOf = Integer.valueOf(((Integer) map.get(next)).intValue() + 1);
                    map.remove(next);
                    map.put(next, numValueOf);
                } else {
                    map.put(next, 1);
                }
            }
            int iIntValue = 0;
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (i10 < iIntValue2) {
                    iIntValue = ((Integer) entry.getKey()).intValue();
                    i10 = iIntValue2;
                }
            }
            if (iIntValue == 0) {
                return -1;
            }
            return (int) ((i10 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }

    public static boolean jpo(float f10, float f11, Context context) {
        if (f10 != -1.0f && f11 != -1.0f) {
            if (xyk == null) {
                xyk = ViewConfiguration.get(context);
            }
            if (zz == -1) {
                zz = xyk.getScaledTouchSlop();
            }
            if (f10 - f11 > zz) {
                return true;
            }
        }
        return false;
    }

    public static void jpo(boolean z10) {
        f21613ju = Boolean.valueOf(z10);
    }
}

package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.ironsource.C3191e4;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.inmobi.media.a4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC2679a4 {

    /* renamed from: c, reason: collision with root package name */
    public static String f32635c;

    /* renamed from: f, reason: collision with root package name */
    public static JSONObject f32638f;

    /* renamed from: g, reason: collision with root package name */
    public static Integer f32639g;

    /* renamed from: h, reason: collision with root package name */
    public static Float f32640h;

    /* renamed from: a, reason: collision with root package name */
    public static final C2696b4 f32633a = new C2696b4(0, 2.0f, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Z3 f32634b = new Z3(0, 0);

    /* renamed from: d, reason: collision with root package name */
    public static float f32636d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f32637e = true;

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f32641i = R3.f32183a.P();

    public static String a() {
        Display displayA;
        Context contextD = C2925od.d();
        if (contextD == null || (displayA = a(contextD)) == null) {
            return "0x0";
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        int i10 = displayMetrics.widthPixels;
        int i11 = displayMetrics.heightPixels;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10);
        sb2.append('x');
        sb2.append(i11);
        return sb2.toString();
    }

    public static float b() {
        Display displayA;
        if (f32636d == -1.0f) {
            Context contextD = C2925od.d();
            if (contextD == null || (displayA = a(contextD)) == null) {
                return 2.0f;
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            displayA.getMetrics(displayMetrics);
            float f10 = displayMetrics.density;
            if (f10 == 0.0f) {
                return 2.0f;
            }
            f32636d = f10;
        }
        return f32636d;
    }

    public static HashMap c() {
        HashMap map = new HashMap();
        try {
            map.put("d-device-screen-density", String.valueOf(b()));
            C2696b4 c2696b4D = d();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c2696b4D.f32674a);
            sb2.append('X');
            sb2.append(c2696b4D.f32675b);
            map.put("d-device-screen-size", sb2.toString());
            map.put("d-density-dependent-screen-size", a());
            map.put("d-orientation", String.valueOf((int) g()));
            Float f10 = f32640h;
            map.put("d-textsize", String.valueOf(f10 != null ? f10.floatValue() : 37.0f));
            return map;
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
            return map;
        }
    }

    public static C2696b4 d() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return f32633a;
        }
        Display displayA = a(contextD);
        if (displayA == null) {
            return f32633a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new C2696b4((int) (displayMetrics.widthPixels / f10), f10, (int) (displayMetrics.heightPixels / f10));
    }

    public static String e() {
        String string = null;
        if (f32637e) {
            return null;
        }
        String str = f32635c;
        if (str != null) {
            return str;
        }
        Context contextD = C2925od.d();
        if (contextD != null) {
            ConcurrentHashMap concurrentHashMap = I6.f31865b;
            I6 i6A = H6.a(contextD, "display_info_store");
            kotlin.jvm.internal.e0.checkNotNullParameter("gesture_margin", C3191e4.h.W);
            string = i6A.f31866a.getString("gesture_margin", null);
        }
        f32635c = string;
        return string;
    }

    public static Integer f() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return null;
        }
        int i10 = Settings.Secure.getInt(contextD.getContentResolver(), "navigation_mode", -1);
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        return i10 != 2 ? null : 1;
    }

    public static byte g() {
        Display displayA;
        int rotation;
        Context contextD = C2925od.d();
        if (contextD == null || (displayA = a(contextD)) == null || (rotation = displayA.getRotation()) == 0) {
            return (byte) 1;
        }
        if (rotation == 1) {
            return (byte) 3;
        }
        if (rotation == 2) {
            return (byte) 2;
        }
        if (rotation == 3) {
            return (byte) 4;
        }
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
        return (byte) 1;
    }

    public static C2696b4 h() {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return f32633a;
        }
        Display displayA = a(contextD);
        if (displayA == null) {
            return f32633a;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayA.getRealMetrics(displayMetrics);
        float f10 = displayMetrics.density;
        return new C2696b4((int) (displayMetrics.widthPixels / f10), f10, (int) (displayMetrics.heightPixels / f10));
    }

    public static final void b(Context context) {
        Window window;
        WindowInsets rootWindowInsets;
        if (f32637e || !(context instanceof Activity) || (window = ((Activity) context).getWindow()) == null || (rootWindowInsets = window.getDecorView().getRootWindowInsets()) == null) {
            return;
        }
        a(rootWindowInsets, context);
    }

    public static void a(WindowInsets insets, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "insets");
        if (f32637e) {
            return;
        }
        C2925od.a(new zk.n(20, insets, context));
    }

    public static Display a(Context context) {
        if (R3.f32183a.O()) {
            Object systemService = context.getSystemService("display");
            DisplayManager displayManager = systemService instanceof DisplayManager ? (DisplayManager) systemService : null;
            if (displayManager != null) {
                return displayManager.getDisplay(0);
            }
        } else {
            Object systemService2 = context.getSystemService("window");
            WindowManager windowManager = systemService2 instanceof WindowManager ? (WindowManager) systemService2 : null;
            if (windowManager != null) {
                return windowManager.getDefaultDisplay();
            }
        }
        return null;
    }

    public static final void b(WindowInsets insets, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(insets, "$insets");
        try {
            String string = insets.getSystemGestureInsets().toString();
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(string, "toString(...)");
            String[] strArr = (String[]) new sv.x("Insets").split(string, 0).toArray(new String[0]);
            StringBuffer stringBuffer = new StringBuffer();
            if (strArr.length > 1) {
                String[] strArr2 = (String[]) new sv.x(",").split(new sv.x("[^0-9,=a-zA-Z]*").replace(strArr[1], ""), 0).toArray(new String[0]);
                stringBuffer.append("{");
                int length = strArr2.length;
                for (int i10 = 0; i10 < length; i10++) {
                    String[] strArr3 = (String[]) new sv.x(C3191e4.i.f36525b).split(strArr2[i10], 0).toArray(new String[0]);
                    if (strArr3.length == 2) {
                        stringBuffer.append(AbstractJsonLexerKt.STRING + strArr3[0] + AbstractJsonLexerKt.STRING);
                        stringBuffer.append(":");
                        stringBuffer.append(D2.b(((float) Integer.parseInt(strArr3[1])) / b()));
                        if (i10 < strArr2.length - 1) {
                            stringBuffer.append(", ");
                        }
                    }
                }
                stringBuffer.append("}");
            }
            if (stringBuffer.length() > 0) {
                f32635c = stringBuffer.toString();
                ConcurrentHashMap concurrentHashMap = I6.f31865b;
                kotlin.jvm.internal.e0.checkNotNull(context);
                I6.a(H6.a(context, "display_info_store"), "gesture_margin", stringBuffer.toString(), false, 4, (Object) null);
            }
        } catch (Exception unused) {
            kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(android.view.WindowInsets r3) {
        /*
            java.lang.String r0 = "insets"
            kotlin.jvm.internal.e0.checkNotNullParameter(r3, r0)
            com.inmobi.media.R3 r0 = com.inmobi.media.R3.f32183a
            boolean r0 = r0.J()
            if (r0 == 0) goto L5d
            byte r0 = g()
            com.inmobi.media.za r0 = com.inmobi.media.Aa.a(r0)
            int r1 = x3.t3.systemGestures()
            android.graphics.Insets r3 = r3.getInsets(r1)
            java.lang.String r1 = "getInsets(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r1)
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == 0) goto L51
            if (r0 == r1) goto L44
            r2 = 2
            if (r0 == r2) goto L51
            r2 = 3
            if (r0 != r2) goto L3e
            int r0 = pe.a.e(r3)
            if (r0 != 0) goto L5e
            int r3 = pe.a.f(r3)
            if (r3 != 0) goto L5e
            goto L5d
        L3e:
            tu.t r3 = new tu.t
            r3.<init>()
            throw r3
        L44:
            int r0 = pe.a.a(r3)
            if (r0 != 0) goto L5e
            int r3 = pe.a.f(r3)
            if (r3 != 0) goto L5e
            goto L5d
        L51:
            int r0 = pe.a.a(r3)
            if (r0 != 0) goto L5e
            int r3 = pe.a.e(r3)
            if (r3 != 0) goto L5e
        L5d:
            r1 = 0
        L5e:
            java.lang.String r3 = "a4"
            java.lang.String r0 = "TAG"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC2679a4.a(android.view.WindowInsets):int");
    }

    public static void a(LinkedHashMap value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        C2925od.a(new zk.n(21, value, contextD));
    }

    public static final void a(Map value, Context context) throws JSONException {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "$value");
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
        Objects.toString(value);
        if (f32638f == null) {
            f32638f = new JSONObject();
        }
        Iterator it = value.keySet().iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            JSONObject jSONObject = f32638f;
            if (jSONObject != null) {
                jSONObject.put(String.valueOf(iIntValue), value.get(Integer.valueOf(iIntValue)));
            }
        }
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6 i6A = H6.a(context, "display_info_store");
        JSONObject jSONObject2 = f32638f;
        I6.a(i6A, "safe_area", jSONObject2 != null ? jSONObject2.toString() : null, false, 4, (Object) null);
    }

    public static void a(Integer num) {
        Context contextD = C2925od.d();
        if (contextD == null) {
            return;
        }
        C2925od.a(new zk.n(22, num, contextD));
    }

    public static final void a(Integer num, Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "$context");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue("a4", "TAG");
        f32639g = num;
        ConcurrentHashMap concurrentHashMap = I6.f31865b;
        I6.a(H6.a(context, "display_info_store"), "nav_bar_type", num != null ? num.intValue() : -1, false, 4, (Object) null);
    }
}

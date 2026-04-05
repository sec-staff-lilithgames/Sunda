package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static int f50501a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f50502b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f50503c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f50504d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f50505e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f50506f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static volatile boolean f50507g = false;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f50508h = false;

    /* renamed from: i, reason: collision with root package name */
    private static InputManager f50509i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f50510a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f50511b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f50512c;

        public a(String str, Context context, int i10) {
            this.f50510a = str;
            this.f50511b = context;
            this.f50512c = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.f50507g) {
                com.pgl.ssdk.ces.a.meta(171, null, this.f50510a);
            }
            InputManager inputManagerB = y.b(this.f50511b);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.f50512c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    public static /* synthetic */ int b() {
        int i10 = f50503c;
        f50503c = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int c() {
        int i10 = f50506f;
        f50506f = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int d() {
        int i10 = f50501a;
        f50501a = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int e() {
        int i10 = f50504d;
        f50504d = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f() {
        int i10 = f50502b;
        f50502b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int g() {
        int i10 = f50505e;
        f50505e = i10 + 1;
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (f50508h) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.b());
            if (sharedPreferencesA != null) {
                f50506f = sharedPreferencesA.getInt("nihc", 0);
                f50505e = sharedPreferencesA.getInt("eihc", 0);
                f50504d = sharedPreferencesA.getInt("vihc", 0);
                f50508h = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.String r2) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = -1
            if (r0 == 0) goto L8
            return r1
        L8:
            h()
            r2.getClass()
            int r0 = r2.hashCode()
            switch(r0) {
                case 100415: goto L4e;
                case 109064: goto L43;
                case 116752: goto L38;
                case 3113119: goto L2d;
                case 3381238: goto L22;
                case 3619566: goto L17;
                default: goto L15;
            }
        L15:
            r2 = r1
            goto L58
        L17:
            java.lang.String r0 = "vihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L20
            goto L15
        L20:
            r2 = 5
            goto L58
        L22:
            java.lang.String r0 = "nihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2b
            goto L15
        L2b:
            r2 = 4
            goto L58
        L2d:
            java.lang.String r0 = "eihc"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L36
            goto L15
        L36:
            r2 = 3
            goto L58
        L38:
            java.lang.String r0 = "vic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L41
            goto L15
        L41:
            r2 = 2
            goto L58
        L43:
            java.lang.String r0 = "nic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4c
            goto L15
        L4c:
            r2 = 1
            goto L58
        L4e:
            java.lang.String r0 = "eic"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L57
            goto L15
        L57:
            r2 = 0
        L58:
            switch(r2) {
                case 0: goto L6b;
                case 1: goto L68;
                case 2: goto L65;
                case 3: goto L62;
                case 4: goto L5f;
                case 5: goto L5c;
                default: goto L5b;
            }
        L5b:
            return r1
        L5c:
            int r2 = com.pgl.ssdk.y.f50504d
            return r2
        L5f:
            int r2 = com.pgl.ssdk.y.f50506f
            return r2
        L62:
            int r2 = com.pgl.ssdk.y.f50505e
            return r2
        L65:
            int r2 = com.pgl.ssdk.y.f50501a
            return r2
        L68:
            int r2 = com.pgl.ssdk.y.f50503c
            return r2
        L6b:
            int r2 = com.pgl.ssdk.y.f50502b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.y.b(java.lang.String):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = ax.a(z.b());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.MotionEvent r2, android.content.Context r3) {
        /*
            if (r2 == 0) goto L4f
            if (r3 == 0) goto L4f
            boolean r0 = com.pgl.ssdk.y.f50507g
            if (r0 == 0) goto L42
            r0 = 0
            int r0 = r2.getToolType(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            r1 = 2
            if (r0 != r1) goto L42
        L1c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "android.view.InputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$WindowInputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$InputStage"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            goto L43
        L42:
            r0 = 0
        L43:
            int r2 = r2.getDeviceId()
            com.pgl.ssdk.y$a r1 = new com.pgl.ssdk.y$a
            r1.<init>(r0, r3, r2)
            com.pgl.ssdk.ar.b(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.y.a(android.view.MotionEvent, android.content.Context):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (f50509i == null) {
            f50509i = (InputManager) context.getSystemService("input");
        }
        return f50509i;
    }

    public static void a(JSONObject jSONObject) throws JSONException {
        h();
        try {
            jSONObject.put("vihc", f50504d);
            jSONObject.put("eihc", f50505e);
            jSONObject.put("nihc", f50506f);
            jSONObject.put("vic", f50501a);
            jSONObject.put("nic", f50503c);
            jSONObject.put("eic", f50502b);
        } catch (JSONException unused) {
        }
    }
}

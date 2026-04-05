package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Insets;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.amazon.device.ads.DtbConstants;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class o0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f14886a = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: b, reason: collision with root package name */
    private static final Map f14887b = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: c, reason: collision with root package name */
    private static final Map f14888c = Collections.synchronizedMap(new HashMap(4));

    /* renamed from: d, reason: collision with root package name */
    private static final Map f14889d = new HashMap(2);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f14890a;

        /* renamed from: b, reason: collision with root package name */
        private int f14891b;

        /* renamed from: c, reason: collision with root package name */
        private int f14892c;

        /* renamed from: d, reason: collision with root package name */
        private int f14893d;

        public a(int i10, int i11, int i12, int i13) {
            this.f14890a = i10;
            this.f14891b = i11;
            this.f14892c = i12;
            this.f14893d = i13;
        }

        public boolean a(Object obj) {
            return obj instanceof a;
        }

        public int b() {
            return this.f14890a;
        }

        public int c() {
            return this.f14892c;
        }

        public int d() {
            return this.f14891b;
        }

        public Map e() {
            HashMap map = new HashMap();
            map.put(TtmlNode.LEFT, Integer.valueOf(this.f14890a));
            map.put("top", Integer.valueOf(this.f14891b));
            map.put(TtmlNode.RIGHT, Integer.valueOf(this.f14892c));
            map.put("bottom", Integer.valueOf(this.f14893d));
            return map;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return aVar.a(this) && b() == aVar.b() && d() == aVar.d() && c() == aVar.c() && a() == aVar.a();
        }

        public int hashCode() {
            return a() + ((c() + ((d() + ((b() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.Insets(left=" + b() + ", top=" + d() + ", right=" + c() + ", bottom=" + a() + ")";
        }

        public int a() {
            return this.f14893d;
        }

        public static a a(Insets insets) {
            return new a(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f14894a;

        /* renamed from: b, reason: collision with root package name */
        private int f14895b;

        /* renamed from: c, reason: collision with root package name */
        private int f14896c;

        /* renamed from: d, reason: collision with root package name */
        private int f14897d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f14898a;

            /* renamed from: b, reason: collision with root package name */
            private int f14899b;

            /* renamed from: c, reason: collision with root package name */
            private int f14900c;

            /* renamed from: d, reason: collision with root package name */
            private int f14901d;

            public a a(int i10) {
                this.f14900c = i10;
                return this;
            }

            public a b(int i10) {
                this.f14901d = i10;
                return this;
            }

            public a c(int i10) {
                this.f14898a = i10;
                return this;
            }

            public a d(int i10) {
                this.f14899b = i10;
                return this;
            }

            public String toString() {
                StringBuilder sb2 = new StringBuilder("CompatibilityUtils.ScreenCornerRadii.ScreenCornerRadiiBuilder(topLeft=");
                sb2.append(this.f14898a);
                sb2.append(", topRight=");
                sb2.append(this.f14899b);
                sb2.append(", bottomLeft=");
                sb2.append(this.f14900c);
                sb2.append(", bottomRight=");
                return a.b.f(this.f14901d, ")", sb2);
            }

            public b a() {
                return new b(this.f14898a, this.f14899b, this.f14900c, this.f14901d);
            }
        }

        public b(int i10, int i11, int i12, int i13) {
            this.f14894a = i10;
            this.f14895b = i11;
            this.f14896c = i12;
            this.f14897d = i13;
        }

        public boolean a(Object obj) {
            return obj instanceof b;
        }

        public int b() {
            return this.f14897d;
        }

        public int c() {
            return this.f14894a;
        }

        public int d() {
            return this.f14895b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.a(this) && c() == bVar.c() && d() == bVar.d() && a() == bVar.a() && b() == bVar.b();
        }

        public int hashCode() {
            return b() + ((a() + ((d() + ((c() + 59) * 59)) * 59)) * 59);
        }

        public String toString() {
            return "CompatibilityUtils.ScreenCornerRadii(topLeft=" + c() + ", topRight=" + d() + ", bottomLeft=" + a() + ", bottomRight=" + b() + ")";
        }

        public int a() {
            return this.f14896c;
        }
    }

    public static void a() {
        try {
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().permitAll().build());
        } catch (Throwable unused) {
        }
    }

    public static Point b(Context context) {
        int orientation = AppLovinSdkUtils.getOrientation(context);
        com.applovin.impl.sdk.k kVar = com.applovin.impl.sdk.k.D0;
        boolean z10 = kVar == null || ((Boolean) kVar.a(v4.f16030s6)).booleanValue();
        if (!c(context) || z10) {
            Map map = f14889d;
            if (map.containsKey(Integer.valueOf(orientation))) {
                return (Point) map.get(Integer.valueOf(orientation));
            }
        }
        Point point = new Point();
        point.x = DtbConstants.DEFAULT_PLAYER_HEIGHT;
        point.y = 320;
        WindowManager windowManagerF = k7.f(context);
        if (windowManagerF != null) {
            Display defaultDisplay = windowManagerF.getDefaultDisplay();
            if (b()) {
                Rect bounds = windowManagerF.getMaximumWindowMetrics().getBounds();
                point = new Point(bounds.width(), bounds.height());
            } else {
                defaultDisplay.getRealSize(point);
            }
        }
        f14889d.put(Integer.valueOf(orientation), point);
        return point;
    }

    public static boolean c(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.type.foldable") || packageManager.hasSystemFeature("android.hardware.sensor.hinge_angle");
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 34;
    }

    public static boolean e() {
        return true;
    }

    public static boolean f() {
        return true;
    }

    public static boolean g() {
        return true;
    }

    public static boolean h() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public static boolean k() {
        return Build.VERSION.SDK_INT >= 33;
    }

    public static boolean l() {
        return Build.VERSION.SDK_INT >= 31;
    }

    public static a c(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(v4.B4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.statusBars()));
    }

    public static Point a(Context context) {
        Display defaultDisplay = k7.f(context).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f14887b.get(str);
    }

    public static a a(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(v4.B4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
        return new a(insetsIgnoringVisibility.left, insetsIgnoringVisibility.top, insetsIgnoringVisibility.right, insetsIgnoringVisibility.bottom);
    }

    public static void c(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f14887b.put(str, aVar.e());
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 35;
    }

    public static Map a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f14886a.get(str);
    }

    public static void a(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f14886a.put(str, aVar.e());
    }

    public static a b(WindowInsets windowInsets, com.applovin.impl.sdk.k kVar) {
        if (kVar == null || !((Boolean) kVar.a(v4.B4)).booleanValue() || windowInsets == null || !b()) {
            return null;
        }
        return a.a(windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.navigationBars()));
    }

    public static b a(Context context, com.applovin.impl.sdk.k kVar) {
        WindowManager windowManagerF;
        if (((Boolean) kVar.a(v4.V3)).booleanValue() && l() && (windowManagerF = k7.f(context)) != null) {
            try {
                Display defaultDisplay = windowManagerF.getDefaultDisplay();
                return new b.a().c(a(0, defaultDisplay)).d(a(1, defaultDisplay)).a(a(3, defaultDisplay)).b(a(2, defaultDisplay)).a();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static Map b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (Map) f14888c.get(str);
    }

    public static void b(a aVar, String str) {
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        f14888c.put(str, aVar.e());
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    private static int a(int i10, Display display) {
        RoundedCorner roundedCorner = display.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return -1;
    }

    public static boolean a(String str, Context context) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) == 0;
    }
}

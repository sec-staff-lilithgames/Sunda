package com.fyber.inneractive.sdk.util;

import android.app.Application;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.amazon.device.ads.DtbConstants;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static Application f26796a;

    public static void a() {
    }

    public static String b(String str) throws IOException {
        String string = (String) n.f26791a.get(str);
        if (!TextUtils.isEmpty(string)) {
            IAlog.a("Assets cache: returning cached assets for %s", str);
            return string;
        }
        IAlog.a("Assets cache: reading file: %s", str);
        try {
            InputStream inputStreamOpen = f26796a.getAssets().open(str, 3);
            StringBuffer stringBuffer = new StringBuffer();
            byte[] bArr = new byte[4096];
            for (int i10 = 0; i10 != -1; i10 = inputStreamOpen.read(bArr)) {
                stringBuffer.append(new String(bArr, 0, i10));
            }
            inputStreamOpen.close();
            string = stringBuffer.toString();
            IAlog.a("Assets cache: success - %s", str);
        } catch (IOException e10) {
            IAlog.a("Assets cache: Could not read response from file", new Object[0]);
            IAlog.e(v.b(e10), new Object[0]);
        }
        if (!TextUtils.isEmpty(string)) {
            n.f26791a.put(str, string);
        }
        return string;
    }

    public static int c() {
        Application application = f26796a;
        int i10 = (application == null || application.getResources() == null || application.getResources().getConfiguration() == null) ? 1 : application.getResources().getConfiguration().orientation;
        try {
            if (Settings.System.getInt(application.getContentResolver(), "accelerometer_rotation", 0) != 1) {
                i10 = 1;
            }
        } catch (Throwable th2) {
            IAlog.a("failed getOrientation. returning portrait orientation", th2, new Object[0]);
        }
        IAlog.a("The device orientation: %s", i10 == 1 ? "portrait" : "landscape");
        return i10;
    }

    public static int d() {
        int i10;
        WindowManager windowManager;
        Display defaultDisplay;
        if (f26796a == null || (windowManager = (WindowManager) IAConfigManager.O.f23227v.a().getSystemService("window")) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i10 = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i10 = point.y;
        }
        if (i10 != -1) {
            return i10;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i10 = displayMetrics.heightPixels;
            }
        } catch (Throwable unused) {
        }
        return i10 == -1 ? DtbConstants.DEFAULT_PLAYER_HEIGHT : i10;
    }

    public static int e() {
        int i10;
        WindowManager windowManager;
        Display defaultDisplay;
        if (f26796a == null || (windowManager = (WindowManager) IAConfigManager.O.f23227v.a().getSystemService(LJjmO.pVwjiP)) == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            i10 = -1;
        } else {
            Point point = new Point();
            defaultDisplay.getSize(point);
            i10 = point.x;
        }
        if (i10 != -1) {
            return i10;
        }
        try {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            if (displayMetrics != null) {
                i10 = displayMetrics.widthPixels;
            }
        } catch (Throwable unused) {
        }
        if (i10 == -1) {
            return 320;
        }
        return i10;
    }

    public static void f() {
    }

    public static void g() {
    }

    public static String h() throws InterruptedException {
        IAConfigManager iAConfigManager;
        int i10 = 0;
        while (true) {
            iAConfigManager = IAConfigManager.O;
            if (!iAConfigManager.f23230y.f26811a.get() || iAConfigManager.f23230y.f26814d.compareAndSet(true, true) || i10 >= 25) {
                break;
            }
            IAlog.a("UserAgentProvider | waiting on user agent", new Object[0]);
            try {
                Thread.sleep(100L);
            } catch (InterruptedException unused) {
            }
            i10++;
        }
        return iAConfigManager.f23230y.a();
    }

    public static boolean a(String str) {
        return f26796a.checkCallingOrSelfPermission(str) == 0;
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static int a(int i10) {
        return Math.round(((IAConfigManager.O.f23227v.a().getResources().getConfiguration().densityDpi / 160.0f) * i10) + 0.5f);
    }

    public static int c(int i10) {
        try {
            return (int) ((i10 / (IAConfigManager.O.f23227v.a().getResources().getConfiguration().densityDpi / 160.0f)) + 0.5f);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int a(float f10) {
        return (int) (TypedValue.applyDimension(1, f10, IAConfigManager.O.f23227v.a().getResources().getDisplayMetrics()) + 0.5f);
    }

    public static Drawable d(int i10) {
        return IAConfigManager.O.f23227v.a().getDrawable(i10);
    }

    public static String a(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 26) {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) ",");
                }
            }
            return sb2.toString();
        }
        return TextUtils.join(",", arrayList);
    }

    public static void a(Context context, byte[] bArr) {
        FileOutputStream fileOutputStreamOpenFileOutput;
        try {
            fileOutputStreamOpenFileOutput = context.openFileOutput("session_details.json", 0);
        } catch (Throwable unused) {
            fileOutputStreamOpenFileOutput = null;
        }
        try {
            fileOutputStreamOpenFileOutput.write(bArr);
            fileOutputStreamOpenFileOutput.flush();
        } catch (Throwable unused2) {
            try {
                IAlog.a("writeFileWithContext failed writing %s", "session_details.json");
            } finally {
                v.a(fileOutputStreamOpenFileOutput);
            }
        }
    }

    public static int b(int i10) {
        return (int) (((IAConfigManager.O.f23227v.a().getResources().getConfiguration().densityDpi / 160.0f) * i10) + 0.5f);
    }

    public static String a(Context context) throws NoSuchAlgorithmException {
        if (context != null) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
                if (signatureArr.length > 0) {
                    Signature signature = signatureArr[0];
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                    messageDigest.update(signature.toByteArray());
                    byte[] bArrDigest = messageDigest.digest();
                    StringBuilder sb2 = new StringBuilder();
                    for (byte b10 : bArrDigest) {
                        String hexString = Integer.toHexString(b10 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
                        if (hexString.length() == 1) {
                            sb2.append("0");
                        }
                        sb2.append(hexString);
                    }
                    return sb2.toString();
                }
                return "";
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    public static int b() {
        return ((WindowManager) IAConfigManager.O.f23227v.a().getSystemService("window")).getDefaultDisplay().getRotation();
    }

    public static void a(View view, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = i10;
        } else if (layoutParams instanceof LinearLayout.LayoutParams) {
            ((LinearLayout.LayoutParams) layoutParams).gravity = i10;
        } else if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (i10 == 17) {
                layoutParams2.addRule(13);
            } else {
                int i11 = i10 & 7;
                if (i11 == 1) {
                    layoutParams2.addRule(14);
                } else if (i11 == 3) {
                    layoutParams2.addRule(9);
                } else if (i11 == 5) {
                    layoutParams2.addRule(11);
                }
                int i12 = i10 & 112;
                if (i12 == 16) {
                    layoutParams2.addRule(15);
                } else if (i12 == 48) {
                    layoutParams2.addRule(10);
                } else if (i12 == 80) {
                    layoutParams2.addRule(12);
                }
            }
        }
        view.setLayoutParams(layoutParams);
    }

    public static Context a(View view) {
        if (view != null) {
            return view.getContext();
        }
        return f26796a;
    }
}

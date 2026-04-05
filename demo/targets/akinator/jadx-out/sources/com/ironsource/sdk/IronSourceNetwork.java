package com.ironsource.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.A8;
import com.ironsource.B8;
import com.ironsource.C3422r4;
import com.ironsource.C3477u8;
import com.ironsource.I5;
import com.ironsource.M9;
import com.ironsource.Nc;
import com.ironsource.Q9;
import com.ironsource.W9;
import com.ironsource.Z9;
import com.ironsource.sdk.controller.e;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class IronSourceNetwork {

    /* renamed from: a, reason: collision with root package name */
    static final String f38382a = "IronSourceNetwork";

    /* renamed from: b, reason: collision with root package name */
    private static W9 f38383b;

    /* renamed from: c, reason: collision with root package name */
    private static List<Nc> f38384c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private static Z9 f38385d;

    private static void a(Context context, JSONObject jSONObject, String str, String str2, Map<String, String> map) throws Exception {
        if (jSONObject != null) {
            I5 i5A = B8.a(jSONObject);
            if (i5A.a()) {
                A8.a(i5A, B8.a(context, str, str2, map));
            }
        }
    }

    public static synchronized void addInitListener(Nc nc2) {
        Z9 z92 = f38385d;
        if (z92 == null) {
            f38384c.add(nc2);
        } else if (z92.b()) {
            nc2.onSuccess();
        } else {
            nc2.onFail(f38385d.a());
        }
    }

    public static synchronized void destroyAd(M9 m9) throws Exception {
        a();
        f38383b.b(m9);
    }

    public static synchronized e getControllerManager() {
        return f38383b.a();
    }

    public static String getVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static synchronized void initSDK(Context context, String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str)) {
            Logger.e(f38382a, "applicationKey is NULL");
            return;
        }
        if (f38383b == null) {
            SDKUtils.setInitSDKParams(map);
            try {
                a(context, SDKUtils.getNetworkConfiguration().optJSONObject("events"), str2, str, map);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                Logger.e(f38382a, "Failed to init event tracker: " + e10.getMessage());
            }
            f38383b = Q9.a(context, str, str2);
        }
    }

    public static synchronized boolean isAdAvailableForInstance(M9 m9) {
        W9 w92 = f38383b;
        if (w92 == null) {
            return false;
        }
        return w92.a(m9);
    }

    public static synchronized void loadAd(M9 m9, Map<String, String> map) throws Exception {
        a();
        f38383b.a(m9, map);
    }

    public static synchronized void loadAdView(Activity activity, M9 m9, Map<String, String> map) throws Exception {
        a();
        f38383b.b(activity, m9, map);
    }

    public static void onPause(Activity activity) {
        W9 w92 = f38383b;
        if (w92 == null) {
            return;
        }
        w92.onPause(activity);
    }

    public static void onResume(Activity activity) {
        W9 w92 = f38383b;
        if (w92 == null) {
            return;
        }
        w92.onResume(activity);
    }

    public static synchronized void release(Activity activity) {
        W9 w92 = f38383b;
        if (w92 == null) {
            return;
        }
        w92.a(activity);
    }

    public static synchronized void showAd(Activity activity, M9 m9, Map<String, String> map) throws Exception {
        a();
        f38383b.a(activity, m9, map);
    }

    public static synchronized void updateInitFailed(C3477u8 c3477u8) {
        try {
            f38385d = new Z9(c3477u8);
            Iterator<Nc> it = f38384c.iterator();
            while (it.hasNext()) {
                it.next().onFail(c3477u8);
            }
            f38384c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static synchronized void updateInitSucceeded() {
        try {
            f38385d = new Z9();
            Iterator<Nc> it = f38384c.iterator();
            while (it.hasNext()) {
                it.next().onSuccess();
            }
            f38384c.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static synchronized void a() throws Exception {
        if (f38383b == null) {
            throw new NullPointerException("Call initSDK first");
        }
    }
}

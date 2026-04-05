package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import com.mbridge.msdk.interstitial.signalcommon.interstitial;
import com.mbridge.msdk.mbsignalcommon.communication.BannerSignalPlugin;
import com.mbridge.msdk.mbsignalcommon.mraid.MraidSignalCommunication;
import com.mbridge.msdk.mbsignalcommon.webEnvCheck.WebGLCheckSignal;
import com.mbridge.msdk.splash.signal.SplashSignal;
import com.mbridge.msdk.video.signal.communication.RewardSignal;
import com.mbridge.msdk.video.signal.communication.VideoCommunication;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: d, reason: collision with root package name */
    private static HashMap<String, Class> f41942d = new HashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private Context f41943a;

    /* renamed from: b, reason: collision with root package name */
    private Object f41944b;

    /* renamed from: c, reason: collision with root package name */
    private WindVaneWebView f41945c;

    public e(Context context, WindVaneWebView windVaneWebView) throws ClassNotFoundException {
        this.f41943a = context;
        this.f41945c = windVaneWebView;
        a();
    }

    public void a(Context context) {
        this.f41943a = context;
    }

    public void a(Object obj) {
        this.f41944b = obj;
    }

    private Object a(String str, WindVaneWebView windVaneWebView, Context context) {
        Class cls = f41942d.get(str);
        if (cls == null) {
            return null;
        }
        try {
            if (!g.class.isAssignableFrom(cls)) {
                return null;
            }
            g gVar = (g) cls.newInstance();
            gVar.initialize(context, windVaneWebView);
            gVar.initialize(this.f41944b, windVaneWebView);
            return gVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public void a(String str, Class cls) {
        if (f41942d == null) {
            f41942d = new HashMap<>();
        }
        f41942d.put(str, cls);
    }

    public Object a(String str) {
        if (f41942d == null) {
            f41942d = new HashMap<>();
        }
        return a(str, this.f41945c, this.f41943a);
    }

    public void a() throws ClassNotFoundException {
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f41815a, interstitial.class);
        } catch (ClassNotFoundException unused) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f41816b, RewardSignal.class);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f41817c, VideoCommunication.class);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f41819e, MraidSignalCommunication.class);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f41820f, BannerSignalPlugin.class);
        } catch (ClassNotFoundException unused5) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f41821g, SplashSignal.class);
        } catch (ClassNotFoundException unused6) {
        }
        try {
            a(com.mbridge.msdk.mbsignalcommon.base.e.f41822h, WebGLCheckSignal.class);
        } catch (ClassNotFoundException unused7) {
        }
        try {
            if (com.mbridge.msdk.util.b.a()) {
                Class<?> cls = Class.forName("com.mbridge.msdk.mbsignalcommon.confirmation.bridge.ConfirmationJsBridgePlugin");
                a(cls.getSimpleName(), cls);
            }
        } catch (Exception unused8) {
        }
    }
}

package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.mbridge.msdk.out.NativeListener;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public interface a extends e {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.video.signal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0353a extends NativeListener.NativeTrackingListener {
        void a();

        void a(int i10, String str);

        void a(boolean z10);

        void onInitSuccess();
    }

    void a(int i10);

    void a(int i10, String str);

    void a(InterfaceC0353a interfaceC0353a);

    void a(String str);

    void a(boolean z10);

    boolean a();

    int b();

    void b(int i10);

    void b(boolean z10);

    String c();

    void c(int i10);

    int d();

    void d(int i10);

    String e();

    void e(int i10);

    String f(int i10);

    void f();

    String g();

    void g(int i10);

    void h();

    int i();

    void release();

    void setActivity(Activity activity);

    void setAdEvents(AdEvents adEvents);

    void setAdSession(AdSession adSession);

    void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar);

    void setUnitId(String str);

    void setVideoEvents(MediaEvents mediaEvents);

    void setWebViewFront(int i10);
}

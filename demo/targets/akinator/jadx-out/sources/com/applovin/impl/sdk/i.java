package com.applovin.impl.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i extends BroadcastReceiver implements AppLovinBroadcastManager.Receiver {

    /* renamed from: h, reason: collision with root package name */
    public static int f15436h = -1;

    /* renamed from: i, reason: collision with root package name */
    private static final Float f15437i = Float.valueOf(15.0f);

    /* renamed from: a, reason: collision with root package name */
    private final AudioManager f15438a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f15439b;

    /* renamed from: c, reason: collision with root package name */
    private final k f15440c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f15441d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    private final Object f15442e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private boolean f15443f;

    /* renamed from: g, reason: collision with root package name */
    private int f15444g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(int i10);
    }

    public i(k kVar) {
        this.f15440c = kVar;
        Context contextO = k.o();
        this.f15439b = contextO;
        this.f15438a = (AudioManager) contextO.getSystemService("audio");
    }

    public static boolean a(int i10) {
        return i10 == 0 || i10 == 1;
    }

    private void d() {
        this.f15440c.O();
        if (o.a()) {
            this.f15440c.O().a("AudioSessionManager", "Observing ringer mode...");
        }
        this.f15444g = f15436h;
        this.f15439b.registerReceiver(this, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    private void e() {
        this.f15440c.O();
        if (o.a()) {
            this.f15440c.O().a("AudioSessionManager", "Stopping observation of mute switch state...");
        }
        this.f15439b.unregisterReceiver(this);
        AppLovinBroadcastManager.unregisterReceiver(this);
    }

    public int c() {
        return this.f15438a.getRingerMode();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.RINGER_MODE_CHANGED".equals(intent.getAction())) {
            b(this.f15438a.getRingerMode());
        }
    }

    private Float a() {
        if (this.f15438a == null) {
            return f15437i;
        }
        try {
            return Float.valueOf(r0.getStreamMaxVolume(3));
        } catch (Throwable th2) {
            this.f15440c.O();
            if (o.a()) {
                this.f15440c.O().a("AudioSessionManager", "Unable to collect the maximum device volume", th2);
            }
            return f15437i;
        }
    }

    public Float b() {
        if (this.f15438a == null) {
            return null;
        }
        try {
            return Float.valueOf(r0.getStreamVolume(3) / a().floatValue());
        } catch (Throwable th2) {
            this.f15440c.O();
            if (o.a()) {
                this.f15440c.O().a("AudioSessionManager", "Unable to collect device volume", th2);
            }
            return null;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f15443f = true;
            this.f15444g = this.f15438a.getRingerMode();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f15443f = false;
            if (this.f15444g != this.f15438a.getRingerMode()) {
                this.f15444g = f15436h;
                b(this.f15438a.getRingerMode());
            }
        }
    }

    public void b(a aVar) {
        synchronized (this.f15442e) {
            try {
                if (this.f15441d.contains(aVar)) {
                    this.f15441d.remove(aVar);
                    if (this.f15441d.isEmpty()) {
                        e();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(a aVar) {
        synchronized (this.f15442e) {
            try {
                if (this.f15441d.contains(aVar)) {
                    return;
                }
                this.f15441d.add(aVar);
                if (this.f15441d.size() == 1) {
                    d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void b(int i10) {
        if (this.f15443f) {
            return;
        }
        this.f15440c.O();
        if (o.a()) {
            this.f15440c.O().a("AudioSessionManager", "Ringer mode is " + i10);
        }
        synchronized (this.f15442e) {
            try {
                Iterator it = this.f15441d.iterator();
                while (it.hasNext()) {
                    AppLovinSdkUtils.runOnUiThread(new com.applovin.impl.adview.p((a) it.next(), i10, 1));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.mbridge.msdk.mbsignalcommon.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: f, reason: collision with root package name */
    public static double f41891f = -1.0d;

    /* renamed from: a, reason: collision with root package name */
    private Context f41892a;

    /* renamed from: b, reason: collision with root package name */
    private AudioManager f41893b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41894c = false;

    /* renamed from: d, reason: collision with root package name */
    private b f41895d;

    /* renamed from: e, reason: collision with root package name */
    private a f41896e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<d> f41897a;

        public a(d dVar) {
            this.f41897a = new WeakReference<>(dVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            d dVar;
            b bVarB;
            if (!"android.media.VOLUME_CHANGED_ACTION".equals(intent.getAction()) || intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) != 3 || (dVar = this.f41897a.get()) == null || (bVarB = dVar.b()) == null) {
                return;
            }
            double dA = dVar.a();
            if (dA >= 0.0d) {
                bVarB.a(dA);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(double d10);
    }

    public d(Context context) {
        this.f41892a = context;
        this.f41893b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }

    public double a() {
        AudioManager audioManager = this.f41893b;
        double streamVolume = ((this.f41893b != null ? r3.getStreamVolume(3) : -1) * 100.0d) / (audioManager != null ? audioManager.getStreamMaxVolume(3) : -1);
        f41891f = streamVolume;
        return streamVolume;
    }

    public b b() {
        return this.f41895d;
    }

    public void c() {
        if (this.f41892a != null) {
            this.f41896e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.f41892a.registerReceiver(this.f41896e, intentFilter);
            this.f41894c = true;
        }
    }

    public void d() {
        Context context;
        if (!this.f41894c || (context = this.f41892a) == null) {
            return;
        }
        try {
            context.unregisterReceiver(this.f41896e);
            this.f41895d = null;
            this.f41894c = false;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void a(b bVar) {
        this.f41895d = bVar;
    }
}

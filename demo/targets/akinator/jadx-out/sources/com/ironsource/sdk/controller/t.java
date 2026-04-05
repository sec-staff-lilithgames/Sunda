package com.ironsource.sdk.controller;

import android.app.Activity;
import android.media.AudioManager;
import com.ironsource.C3422r4;
import com.ironsource.V7;
import com.ironsource.mediationsdk.logger.IronLog;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
class t {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f38679a;

        public a(AudioManager audioManager) {
            this.f38679a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.a(this.f38679a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AudioManager f38680a;

        public b(AudioManager audioManager) {
            this.f38680a = audioManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            t.b(this.f38680a);
        }
    }

    public static void a(Activity activity) {
        V7.f35633a.b(new a((AudioManager) activity.getSystemService("audio")));
    }

    public static void b(Activity activity) {
        V7.f35633a.b(new b((AudioManager) activity.getSystemService("audio")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(AudioManager audioManager) {
        try {
            audioManager.abandonAudioFocus(null);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(AudioManager audioManager) {
        try {
            audioManager.requestAudioFocus(null, 3, 2);
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronLog.INTERNAL.error(th2.toString());
        }
    }
}

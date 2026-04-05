package io.odeeo.internal.b;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Context f62611a;

    /* renamed from: b, reason: collision with root package name */
    public final a f62612b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62613c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class a extends BroadcastReceiver implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC0590b f62614a;

        /* renamed from: b, reason: collision with root package name */
        public final Handler f62615b;

        public a(Handler handler, InterfaceC0590b interfaceC0590b) {
            this.f62615b = handler;
            this.f62614a = interfaceC0590b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f62615b.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.f62613c) {
                this.f62614a.onAudioBecomingNoisy();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.b.b$b, reason: collision with other inner class name */
    public interface InterfaceC0590b {
        void onAudioBecomingNoisy();
    }

    public b(Context context, Handler handler, InterfaceC0590b interfaceC0590b) {
        this.f62611a = context.getApplicationContext();
        this.f62612b = new a(handler, interfaceC0590b);
    }

    public void setEnabled(boolean z10) {
        if (z10 && !this.f62613c) {
            this.f62611a.registerReceiver(this.f62612b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f62613c = true;
        } else {
            if (z10 || !this.f62613c) {
                return;
            }
            this.f62611a.unregisterReceiver(this.f62612b);
            this.f62613c = false;
        }
    }
}

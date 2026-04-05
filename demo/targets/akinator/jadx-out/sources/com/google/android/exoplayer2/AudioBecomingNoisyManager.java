package com.google.android.exoplayer2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class AudioBecomingNoisyManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f27010a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioBecomingNoisyReceiver f27011b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27012c;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final b f27013b;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f27014c;

        public AudioBecomingNoisyReceiver(Handler handler, b bVar) {
            this.f27014c = handler;
            this.f27013b = bVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f27014c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AudioBecomingNoisyManager.this.f27012c) {
                ((p0) this.f27013b).onAudioBecomingNoisy();
            }
        }
    }

    public AudioBecomingNoisyManager(Context context, Handler handler, b bVar) {
        this.f27010a = context.getApplicationContext();
        this.f27011b = new AudioBecomingNoisyReceiver(handler, bVar);
    }

    public void setEnabled(boolean z10) {
        AudioBecomingNoisyReceiver audioBecomingNoisyReceiver = this.f27011b;
        Context context = this.f27010a;
        if (z10 && !this.f27012c) {
            context.registerReceiver(audioBecomingNoisyReceiver, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f27012c = true;
        } else {
            if (z10 || !this.f27012c) {
                return;
            }
            context.unregisterReceiver(audioBecomingNoisyReceiver);
            this.f27012c = false;
        }
    }
}

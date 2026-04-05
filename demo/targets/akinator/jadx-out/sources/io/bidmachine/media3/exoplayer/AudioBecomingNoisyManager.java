package io.bidmachine.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Looper;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class AudioBecomingNoisyManager {

    /* renamed from: a, reason: collision with root package name */
    public final Context f60823a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioBecomingNoisyReceiver f60824b;

    /* renamed from: c, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.v f60825c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f60826d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class AudioBecomingNoisyReceiver extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final d f60827a;

        /* renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.common.util.v f60828b;

        public AudioBecomingNoisyReceiver(io.bidmachine.media3.common.util.v vVar, d dVar) {
            this.f60828b = vVar;
            this.f60827a = dVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f60828b.post(new c(this, 0));
            }
        }
    }

    public AudioBecomingNoisyManager(Context context, Looper looper, Looper looper2, d dVar, io.bidmachine.media3.common.util.g gVar) {
        this.f60823a = context.getApplicationContext();
        io.bidmachine.media3.common.util.q0 q0Var = (io.bidmachine.media3.common.util.q0) gVar;
        this.f60825c = q0Var.createHandler(looper, null);
        this.f60824b = new AudioBecomingNoisyReceiver(q0Var.createHandler(looper2, null), dVar);
    }

    public void setEnabled(boolean z10) {
        if (z10 == this.f60826d) {
            return;
        }
        io.bidmachine.media3.common.util.v vVar = this.f60825c;
        if (z10) {
            final int i10 = 0;
            vVar.post(new Runnable(this) { // from class: io.bidmachine.media3.exoplayer.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ AudioBecomingNoisyManager f61117c;

                {
                    this.f61117c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i10) {
                        case 0:
                            AudioBecomingNoisyManager audioBecomingNoisyManager = this.f61117c;
                            audioBecomingNoisyManager.f60823a.registerReceiver(audioBecomingNoisyManager.f60824b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            AudioBecomingNoisyManager audioBecomingNoisyManager2 = this.f61117c;
                            audioBecomingNoisyManager2.f60823a.unregisterReceiver(audioBecomingNoisyManager2.f60824b);
                            break;
                    }
                }
            });
            this.f60826d = true;
        } else {
            final int i11 = 1;
            vVar.post(new Runnable(this) { // from class: io.bidmachine.media3.exoplayer.b

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ AudioBecomingNoisyManager f61117c;

                {
                    this.f61117c = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            AudioBecomingNoisyManager audioBecomingNoisyManager = this.f61117c;
                            audioBecomingNoisyManager.f60823a.registerReceiver(audioBecomingNoisyManager.f60824b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
                            break;
                        default:
                            AudioBecomingNoisyManager audioBecomingNoisyManager2 = this.f61117c;
                            audioBecomingNoisyManager2.f60823a.unregisterReceiver(audioBecomingNoisyManager2.f60824b);
                            break;
                    }
                }
            });
            this.f60826d = false;
        }
    }
}

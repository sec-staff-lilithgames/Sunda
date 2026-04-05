package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzabe implements Choreographer.FrameCallback, Handler.Callback {
    private static final zzabe zzb = new zzabe();
    public volatile long zza = C.TIME_UNSET;
    private final Handler zzc;
    private final HandlerThread zzd;
    private Choreographer zze;
    private int zzf;

    private zzabe() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.zzd = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        String str = zzep.zza;
        Handler handler = new Handler(looper, this);
        this.zzc = handler;
        handler.sendEmptyMessage(1);
    }

    public static zzabe zza() {
        return zzb;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.zza = j10;
        Choreographer choreographer = this.zze;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            try {
                this.zze = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                zzdt.zzd("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e10);
            }
            return true;
        }
        if (i10 == 2) {
            Choreographer choreographer = this.zze;
            if (choreographer != null) {
                int i11 = this.zzf + 1;
                this.zzf = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 3) {
            return false;
        }
        Choreographer choreographer2 = this.zze;
        if (choreographer2 != null) {
            int i12 = this.zzf - 1;
            this.zzf = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.zza = C.TIME_UNSET;
            }
        }
        return true;
    }

    public final void zzb() {
        this.zzc.sendEmptyMessage(2);
    }

    public final void zzc() {
        this.zzc.sendEmptyMessage(3);
    }
}

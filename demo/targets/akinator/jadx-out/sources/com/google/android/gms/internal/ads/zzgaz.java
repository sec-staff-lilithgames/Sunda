package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import java.util.ArrayDeque;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgaz {
    private MotionEvent zzb;
    private final ArrayDeque zza = new ArrayDeque();
    private zzgax zzc = new zzgax();

    public final synchronized void zza(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.zzb = MotionEvent.obtain(motionEvent);
            }
            this.zzc.zza(motionEvent);
            ArrayDeque arrayDeque = this.zza;
            if (arrayDeque.size() >= 6) {
                arrayDeque.remove();
            }
            arrayDeque.add(new zzgay(motionEvent));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzb(Map map) {
        try {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                map.put(SFPXhf.hZf, motionEvent);
            }
            map.put("oe", this.zzc);
            ArrayDeque arrayDeque = this.zza;
            map.put("ro", arrayDeque.toArray(new zzgay[arrayDeque.size()]));
            this.zzc = new zzgax();
            arrayDeque.clear();
            MotionEvent motionEvent2 = this.zzb;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.zzb = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

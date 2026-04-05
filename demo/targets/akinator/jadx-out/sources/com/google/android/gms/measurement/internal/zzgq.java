package com.google.android.gms.measurement.internal;

import android.content.Context;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLogging;
import com.google.android.gms.common.internal.TelemetryLoggingClient;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.tasks.OnFailureListener;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgq {
    private static zzgq zza;
    private final zzic zzb;
    private final TelemetryLoggingClient zzc;
    private final AtomicLong zzd = new AtomicLong(-1);

    private zzgq(Context context, zzic zzicVar) {
        this.zzc = TelemetryLogging.getClient(context, TelemetryLoggingOptions.builder().setApi("measurement:api").build());
        this.zzb = zzicVar;
    }

    public static zzgq zza(zzic zzicVar) {
        if (zza == null) {
            zza = new zzgq(zzicVar.zzaY(), zzicVar);
        }
        return zza;
    }

    public final synchronized void zzb(int i10, int i11, long j10, long j11, int i12) {
        final long jElapsedRealtime = this.zzb.zzaZ().elapsedRealtime();
        AtomicLong atomicLong = this.zzd;
        if (atomicLong.get() != -1 && jElapsedRealtime - atomicLong.get() <= 1800000) {
            return;
        }
        this.zzc.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(36301, i11, 0, j10, j11, null, null, 0, i12)))).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.gms.measurement.internal.zzgp
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final /* synthetic */ void onFailure(Exception exc) {
                this.zza.zzc(jElapsedRealtime, exc);
            }
        });
    }

    public final /* synthetic */ void zzc(long j10, Exception exc) {
        this.zzd.set(j10);
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdzr extends zzfvc {
    private final Context zza;
    private SensorManager zzb;
    private Sensor zzc;
    private long zzd;
    private int zze;
    private zzdzq zzf;
    private boolean zzg;

    public zzdzr(Context context) {
        super("ShakeDetector", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS);
        this.zza = context;
    }

    public final void zza(zzdzq zzdzqVar) {
        this.zzf = zzdzqVar;
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjX)).booleanValue()) {
                    if (this.zzb == null) {
                        SensorManager sensorManager2 = (SensorManager) this.zza.getSystemService("sensor");
                        this.zzb = sensorManager2;
                        if (sensorManager2 == null) {
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzi("Shake detection failed to initialize. Failed to obtain accelerometer.");
                            return;
                        }
                        this.zzc = sensorManager2.getDefaultSensor(1);
                    }
                    if (!this.zzg && (sensorManager = this.zzb) != null && (sensor = this.zzc) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjZ)).intValue();
                        this.zzg = true;
                        com.google.android.gms.ads.internal.util.zze.zza("Listening for shake gestures.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc() {
        synchronized (this) {
            try {
                if (this.zzg) {
                    SensorManager sensorManager = this.zzb;
                    if (sensorManager != null) {
                        sensorManager.unregisterListener(this, this.zzc);
                        com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for shake gestures.");
                    }
                    this.zzg = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfvc
    public final void zzd(SensorEvent sensorEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjX)).booleanValue()) {
            float[] fArr = sensorEvent.values;
            float f10 = fArr[0] / 9.80665f;
            float f11 = fArr[1] / 9.80665f;
            float f12 = fArr[2] / 9.80665f;
            float f13 = f12 * f12;
            if (((float) Math.sqrt(f13 + (f11 * f11) + (f10 * f10))) >= ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjY)).floatValue()) {
                long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
                if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjZ)).intValue() <= jCurrentTimeMillis) {
                    if (this.zzd + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzka)).intValue() < jCurrentTimeMillis) {
                        this.zze = 0;
                    }
                    com.google.android.gms.ads.internal.util.zze.zza("Shake detected.");
                    this.zzd = jCurrentTimeMillis;
                    int i10 = this.zze + 1;
                    this.zze = i10;
                    zzdzq zzdzqVar = this.zzf;
                    if (zzdzqVar != null) {
                        if (i10 == ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkb)).intValue()) {
                            zzdyo zzdyoVar = (zzdyo) zzdzqVar;
                            zzdyoVar.zzo(new zzdyl(zzdyoVar), zzdyn.GESTURE);
                        }
                    }
                }
            }
        }
    }
}

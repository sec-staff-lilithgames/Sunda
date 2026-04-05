package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class GmsClientSupervisor {
    static HandlerThread zza = null;
    private static final Object zzb = new Object();
    private static int zzc = 9;
    private static zzs zzd = null;
    private static Executor zze = null;
    private static boolean zzf = false;

    public static int getDefaultBindFlags() {
        return 4225;
    }

    public static GmsClientSupervisor getInstance(Context context) {
        synchronized (zzb) {
            try {
                if (zzd == null) {
                    zzd = new zzs(context.getApplicationContext(), zzf ? getOrStartHandlerThread().getLooper() : context.getMainLooper(), zze);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzd;
    }

    public static HandlerThread getOrStartHandlerThread() {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", zzc);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setDefaultBindExecutor(Executor executor) {
        synchronized (zzb) {
            try {
                zzs zzsVar = zzd;
                if (zzsVar != null) {
                    zzsVar.zzi(executor);
                }
                zze = executor;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean setGamHandlerThreadPriorityIfNotInitialized(int i10) {
        synchronized (zzb) {
            try {
                if (zza != null) {
                    return false;
                }
                zzc = i10;
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void setUseHandlerThreadForCallbacks() {
        synchronized (zzb) {
            try {
                zzs zzsVar = zzd;
                if (zzsVar != null && !zzf) {
                    zzsVar.zzj(getOrStartHandlerThread().getLooper());
                }
                zzf = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        return zza(new zzo(componentName, 4225), serviceConnection, str, null).isSuccess();
    }

    public void unbindService(ComponentName componentName, ServiceConnection serviceConnection, String str) {
        zzb(new zzo(componentName, 4225), serviceConnection, str);
    }

    public abstract ConnectionResult zza(zzo zzoVar, ServiceConnection serviceConnection, String str, Executor executor);

    public abstract void zzb(zzo zzoVar, ServiceConnection serviceConnection, String str);

    public final void zzc(String str, String str2, int i10, ServiceConnection serviceConnection, String str3, boolean z10) {
        zzb(new zzo(str, str2, 4225, z10), serviceConnection, str3);
    }

    public void unbindService(String str, ServiceConnection serviceConnection, String str2) {
        zzb(new zzo(str, 4225, false), serviceConnection, str2);
    }

    public boolean bindService(ComponentName componentName, ServiceConnection serviceConnection, String str, Executor executor) {
        return zza(new zzo(componentName, 4225), serviceConnection, str, executor).isSuccess();
    }

    public static HandlerThread getOrStartHandlerThread(int i10) {
        synchronized (zzb) {
            try {
                HandlerThread handlerThread = zza;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", i10);
                zza = handlerThread2;
                handlerThread2.start();
                return zza;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean bindService(String str, ServiceConnection serviceConnection, String str2) {
        return zza(new zzo(str, 4225, false), serviceConnection, str2, null).isSuccess();
    }
}

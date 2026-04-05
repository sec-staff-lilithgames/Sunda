package com.google.android.gms.internal.ads;

import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgcw extends zzgdh {
    private static volatile Long zza;
    private static final Object zzb = new Object();

    public zzgcw(zzauc zzaucVar, zzgcd zzgcdVar, zzgjd zzgjdVar) {
        super("Zh6cd+aDndZV+YUcVHG1KoZXWtL97j2QmZXbwOqvXvMv7NRw9MmD/Gx8wRyupV8R", "kj+4OypsnIcMTfpnmlGzqqY0pqeQ7F3FRQZTzB0M60E=", zzaucVar, zzgcdVar, zzgjdVar.zza(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE));
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                try {
                    if (zza == null) {
                        Long l9 = (Long) method.invoke("", null);
                        if (l9 == null) {
                            throw null;
                        }
                        zza = l9;
                    }
                } finally {
                }
            }
        }
        synchronized (zzaucVar) {
            try {
                if (zza != null) {
                    zzaucVar.zzm(zza.longValue());
                }
            } finally {
            }
        }
    }
}

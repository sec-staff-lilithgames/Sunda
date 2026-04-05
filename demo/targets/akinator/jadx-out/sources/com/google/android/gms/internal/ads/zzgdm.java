package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgdm extends zzgdh {
    private final DisplayMetrics zza;
    private final View zzb;

    public zzgdm(zzauc zzaucVar, zzgcd zzgcdVar, DisplayMetrics displayMetrics, View view, zzgjd zzgjdVar) {
        super("P6F0ZRwWAQfQFwxv0Pq3Kr7GsgVJK2iuMjcPK+Aq3kgEIqqz95IgzklzBsNVE1/z", "noWWhxc3WlXlb4cqOg7NtD3uZWHj+L+uVXJvY7XilyA=", zzaucVar, zzgcdVar, zzgjdVar.zza(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE));
        this.zza = displayMetrics;
        this.zzb = view;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view = this.zzb;
        if (view == null) {
            return;
        }
        Object objInvoke = method.invoke("", this.zza, view);
        objInvoke.getClass();
        Long[] lArr = (Long[]) objInvoke;
        zzaux zzauxVarZza = zzauy.zza();
        zzauxVarZza.zzb(lArr[2].longValue());
        zzauxVarZza.zzc(lArr[1].longValue());
        zzauxVarZza.zzd(lArr[0].longValue());
        zzauxVarZza.zza(lArr[3].longValue());
        zzauxVarZza.zze(lArr[4].longValue());
        zzaucVar.zzM((zzauy) zzauxVarZza.zzbu());
    }
}

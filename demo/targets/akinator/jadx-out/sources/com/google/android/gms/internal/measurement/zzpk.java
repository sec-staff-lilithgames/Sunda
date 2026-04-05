package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzpk implements zzpj {
    public static final zzkm zza;
    public static final zzkm zzb;

    static {
        zzkg zzkgVarZzb = new zzkg(zzkb.zza("com.google.android.gms.measurement")).zza().zzb();
        zzkgVarZzb.zzd("measurement.set_default_event_parameters_with_backfill.client.dev", false);
        zzkgVarZzb.zzd("measurement.set_default_event_parameters_with_backfill.service", true);
        zzkgVarZzb.zzc("measurement.id.set_default_event_parameters.fix_service_request_ordering", 0L);
        zza = zzkgVarZzb.zzd("measurement.set_default_event_parameters.fix_app_update_logging", true);
        zzb = zzkgVarZzb.zzd("measurement.set_default_event_parameters.fix_service_request_ordering", false);
        zzkgVarZzb.zzd("measurement.set_default_event_parameters.fix_subsequent_launches", true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean zza() {
        return ((Boolean) zza.zzd()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpj
    public final boolean zzb() {
        return ((Boolean) zzb.zzd()).booleanValue();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfon {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ScheduledExecutorService zzc;
    private final ClientApi zzd = new ClientApi();
    private final zzfhj zze;
    private final Clock zzf;

    public zzfon(Context context, VersionInfoParcel versionInfoParcel, ScheduledExecutorService scheduledExecutorService, zzfhj zzfhjVar, Clock clock) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = scheduledExecutorService;
        this.zzf = clock;
        this.zze = zzfhjVar;
    }

    private static zzfnq zzc() {
        return new zzfnq(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzD)).longValue(), 2.0d, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzE)).longValue(), 0.2d);
    }

    public final zzfom zza(com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfns(clientApi, context, versionInfoParcel.clientJarVersion, this.zze, zzftVar, zzceVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zzd;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfoq(clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zze, zzftVar, zzceVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zzd;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfnp(clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zze, zzftVar, zzceVar, this.zzc, zzc(), this.zzf);
    }

    public final zzfom zzb(String str, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzch zzchVar) {
        AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
        if (adFormat == null) {
            return null;
        }
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            ClientApi clientApi = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzb;
            return new zzfns(str, clientApi, context, versionInfoParcel.clientJarVersion, this.zze, zzftVar, zzchVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal == 2) {
            ClientApi clientApi2 = this.zzd;
            Context context2 = this.zza;
            VersionInfoParcel versionInfoParcel2 = this.zzb;
            return new zzfoq(str, clientApi2, context2, versionInfoParcel2.clientJarVersion, this.zze, zzftVar, zzchVar, this.zzc, zzc(), this.zzf);
        }
        if (iOrdinal != 5) {
            return null;
        }
        ClientApi clientApi3 = this.zzd;
        Context context3 = this.zza;
        VersionInfoParcel versionInfoParcel3 = this.zzb;
        return new zzfnp(str, clientApi3, context3, versionInfoParcel3.clientJarVersion, this.zze, zzftVar, zzchVar, this.zzc, zzc(), this.zzf);
    }
}

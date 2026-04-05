package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzn {
    private Bundle zza = new Bundle();
    private List zzb = new ArrayList();
    private boolean zzc = false;
    private int zzd = -1;
    private final Bundle zze = new Bundle();
    private final Bundle zzf = new Bundle();
    private final List zzg = new ArrayList();
    private int zzh = -1;
    private String zzi = null;
    private final List zzj = new ArrayList();
    private int zzk = DtbConstants.NETWORK_READ_TIMEOUT;
    private final int zzl = RequestConfiguration.PublisherPrivacyPersonalizationState.DEFAULT.getValue();
    private long zzm = 0;

    public final zzm zza() {
        Bundle bundle = this.zza;
        Bundle bundle2 = this.zze;
        List list = this.zzb;
        boolean z10 = this.zzc;
        int i10 = this.zzd;
        int i11 = this.zzh;
        String str = this.zzi;
        List list2 = this.zzj;
        int i12 = this.zzl;
        return new zzm(8, -1L, bundle, -1, list, z10, i10, false, null, null, null, null, bundle2, this.zzf, this.zzg, null, null, false, null, i11, str, list2, this.zzk, null, i12, this.zzm, 0L);
    }

    public final zzn zzb(Bundle bundle) {
        this.zza = bundle;
        return this;
    }

    public final zzn zzc(List list) {
        this.zzb = list;
        return this;
    }

    public final zzn zzd(boolean z10) {
        this.zzc = z10;
        return this;
    }

    public final zzn zze(int i10) {
        this.zzd = i10;
        return this;
    }

    public final zzn zzf(int i10) {
        this.zzh = i10;
        return this;
    }

    public final zzn zzg(String str) {
        this.zzi = str;
        return this;
    }

    public final zzn zzh(int i10) {
        this.zzk = i10;
        return this;
    }

    public final zzn zzi(long j10) {
        this.zzm = j10;
        return this;
    }
}

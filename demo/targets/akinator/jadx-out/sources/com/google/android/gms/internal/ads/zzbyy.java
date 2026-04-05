package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbyy implements RewardItem {
    private final zzbyl zza;

    public zzbyy(zzbyl zzbylVar) {
        this.zza = zzbylVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzbyl zzbylVar = this.zza;
        if (zzbylVar != null) {
            try {
                return zzbylVar.zzf();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e10);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzbyl zzbylVar = this.zza;
        if (zzbylVar != null) {
            try {
                return zzbylVar.zze();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e10);
            }
        }
        return null;
    }
}

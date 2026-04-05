package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgip implements zzgia {
    private final List zza = new ArrayList();

    public final synchronized void zza(List list) {
        List list2 = this.zza;
        list2.clear();
        list2.addAll(list);
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final synchronized void zzc(Map map, Context context, View view) {
        List list = this.zza;
        map.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, new ArrayList(list));
        list.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzb(Map map) {
    }

    @Override // com.google.android.gms.internal.ads.zzgia
    public final void zzd(Map map) {
    }
}

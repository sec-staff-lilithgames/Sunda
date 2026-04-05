package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdds extends zzdem implements zzbkp {
    public zzdds(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbkp
    public final synchronized void zzb(final String str, final String str2) {
        zzs(new zzdel() { // from class: com.google.android.gms.internal.ads.zzddr
            @Override // com.google.android.gms.internal.ads.zzdel
            public final /* synthetic */ void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}

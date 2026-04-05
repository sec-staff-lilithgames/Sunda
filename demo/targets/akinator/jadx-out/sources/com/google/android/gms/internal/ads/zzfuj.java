package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzfuj implements Closeable {
    public static zzfuv zza() {
        return new zzfuv();
    }

    public static zzfuv zzb(zzgmv<Integer> zzgmvVar, zzgmv<Integer> zzgmvVar2, zzful zzfulVar) {
        return new zzfuv(zzgmvVar, zzgmvVar2, zzfulVar);
    }

    public static zzfuv zzc(final int i10, zzful zzfulVar) {
        return new zzfuv(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzfui
            @Override // com.google.android.gms.internal.ads.zzgmv
            public final /* synthetic */ Object zza() {
                return Integer.valueOf(i10);
            }
        }, zzfuh.zza, zzfulVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Integer zzf() {
        return -1;
    }
}

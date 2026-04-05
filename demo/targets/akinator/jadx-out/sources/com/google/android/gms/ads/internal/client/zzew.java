package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.internal.ads.zzboc;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzew extends zzboc {
    final /* synthetic */ zzex zza;

    public /* synthetic */ zzew(zzex zzexVar, byte[] bArr) {
        Objects.requireNonNull(zzexVar);
        this.zza = zzexVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbod
    public final void zzb(List list) throws RemoteException {
        int i10;
        ArrayList arrayList;
        zzex zzexVar = this.zza;
        synchronized (zzexVar.zzv()) {
            zzexVar.zzx(false);
            zzexVar.zzy(true);
            arrayList = new ArrayList(zzexVar.zzw());
            zzexVar.zzw().clear();
        }
        InitializationStatus initializationStatusZzA = zzex.zzA(list);
        int size = arrayList.size();
        for (i10 = 0; i10 < size; i10++) {
            ((OnInitializationCompleteListener) arrayList.get(i10)).onInitializationComplete(initializationStatusZzA);
        }
    }
}

package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.zzapc;
import com.google.android.gms.internal.ads.zzapy;
import com.google.android.gms.internal.ads.zzapz;
import com.google.android.gms.internal.ads.zzaqx;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbh extends zzaqx {
    final /* synthetic */ byte[] zza;
    final /* synthetic */ Map zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzl zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbh(zzbl zzblVar, int i10, String str, zzapz zzapzVar, zzapy zzapyVar, byte[] bArr, Map map, com.google.android.gms.ads.internal.util.client.zzl zzlVar) {
        super(i10, str, zzapzVar, zzapyVar);
        this.zza = bArr;
        this.zzb = map;
        this.zzc = zzlVar;
        Objects.requireNonNull(zzblVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final Map zzm() throws zzapc {
        Map map = this.zzb;
        return map == null ? Collections.EMPTY_MAP : map;
    }

    @Override // com.google.android.gms.internal.ads.zzapu
    public final byte[] zzn() throws zzapc {
        byte[] bArr = this.zza;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzaqx, com.google.android.gms.internal.ads.zzapu
    /* renamed from: zzz */
    public final void zzs(String str) throws IOException {
        this.zzc.zze(str);
        super.zzs(str);
    }
}

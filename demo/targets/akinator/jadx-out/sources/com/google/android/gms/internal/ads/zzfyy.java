package com.google.android.gms.internal.ads;

import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.concurrent.ExecutorService;
import sh.n1;
import w2.j;
import w2.l;
import w2.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfyy implements zzfys {
    private final ExecutorService zza;
    private final String zzb;
    private final long zzc;

    public zzfyy(ExecutorService executorService, String str, long j10) {
        this.zza = executorService;
        this.zzb = str;
        this.zzc = j10;
    }

    private final n1 zze(final String str, final boolean z10, final byte[] bArr, final String str2) {
        return o.getFuture(new l() { // from class: com.google.android.gms.internal.ads.zzfyv
            @Override // w2.l
            public final /* synthetic */ Object attachCompleter(j jVar) {
                return this.zza.zzc(str, z10, str2, bArr, jVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ void zzd(java.lang.String r6, w2.j r7, boolean r8, java.lang.String r9, byte[] r10) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfyy.zzd(java.lang.String, w2.j, boolean, java.lang.String, byte[]):void");
    }

    @Override // com.google.android.gms.internal.ads.zzfys
    public final n1 zza(String str) {
        return zze(str, false, new byte[0], null);
    }

    @Override // com.google.android.gms.internal.ads.zzfys
    public final n1 zzb(String str, byte[] bArr, String str2) {
        return zze(str, true, bArr, CommonGatewayClient.HEADER_PROTOBUF);
    }

    public final /* synthetic */ Object zzc(final String str, final boolean z10, final String str2, final byte[] bArr, final j jVar) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfyu
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzd(str, jVar, z10, str2, bArr);
            }
        });
        return "";
    }
}

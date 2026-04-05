package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.RawResourceDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgh implements zzgb {
    private final Context zza;
    private final List zzb = new ArrayList();
    private final zzgb zzc;
    private zzgb zzd;
    private zzgb zze;
    private zzgb zzf;
    private zzgb zzg;
    private zzgb zzh;
    private zzgb zzi;
    private zzgb zzj;
    private zzgb zzk;

    public zzgh(Context context, zzgb zzgbVar) {
        this.zza = context.getApplicationContext();
        this.zzc = zzgbVar;
    }

    private final zzgb zzf() {
        if (this.zze == null) {
            zzfs zzfsVar = new zzfs(this.zza);
            this.zze = zzfsVar;
            zzg(zzfsVar);
        }
        return this.zze;
    }

    private final void zzg(zzgb zzgbVar) {
        int i10 = 0;
        while (true) {
            List list = this.zzb;
            if (i10 >= list.size()) {
                return;
            }
            zzgbVar.zze((zzgz) list.get(i10));
            i10++;
        }
    }

    private static final void zzh(zzgb zzgbVar, zzgz zzgzVar) {
        if (zzgbVar != null) {
            zzgbVar.zze(zzgzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzj
    public final int zza(byte[] bArr, int i10, int i11) throws IOException {
        zzgb zzgbVar = this.zzk;
        zzgbVar.getClass();
        return zzgbVar.zza(bArr, i10, i11);
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final long zzb(zzgf zzgfVar) throws IOException {
        zzgb zzgbVar;
        zzgmd.zzh(this.zzk == null);
        Uri uri = zzgfVar.zza;
        String scheme = uri.getScheme();
        String str = zzep.zza;
        String scheme2 = uri.getScheme();
        if (TextUtils.isEmpty(scheme2) || Objects.equals(scheme2, C3191e4.h.f36473b)) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.zzd == null) {
                    zzgo zzgoVar = new zzgo();
                    this.zzd = zzgoVar;
                    zzg(zzgoVar);
                }
                this.zzk = this.zzd;
            } else {
                this.zzk = zzf();
            }
        } else if ("asset".equals(scheme)) {
            this.zzk = zzf();
        } else if ("content".equals(scheme)) {
            if (this.zzf == null) {
                zzfy zzfyVar = new zzfy(this.zza);
                this.zzf = zzfyVar;
                zzg(zzfyVar);
            }
            this.zzk = this.zzf;
        } else if ("rtmp".equals(scheme)) {
            if (this.zzg == null) {
                try {
                    zzgb zzgbVar2 = (zzgb) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                    this.zzg = zzgbVar2;
                    zzg(zzgbVar2);
                } catch (ClassNotFoundException unused) {
                    zzdt.zzc("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating RTMP extension", e10);
                }
                if (this.zzg == null) {
                    this.zzg = this.zzc;
                }
            }
            this.zzk = this.zzg;
        } else if ("udp".equals(scheme)) {
            if (this.zzh == null) {
                zzhb zzhbVar = new zzhb(2000);
                this.zzh = zzhbVar;
                zzg(zzhbVar);
            }
            this.zzk = this.zzh;
        } else if ("data".equals(scheme)) {
            if (this.zzi == null) {
                zzfz zzfzVar = new zzfz();
                this.zzi = zzfzVar;
                zzg(zzfzVar);
            }
            this.zzk = this.zzi;
        } else {
            if (RawResourceDataSource.RAW_RESOURCE_SCHEME.equals(scheme) || "android.resource".equals(scheme)) {
                if (this.zzj == null) {
                    zzgx zzgxVar = new zzgx(this.zza);
                    this.zzj = zzgxVar;
                    zzg(zzgxVar);
                }
                zzgbVar = this.zzj;
            } else {
                zzgbVar = this.zzc;
            }
            this.zzk = zzgbVar;
        }
        return this.zzk.zzb(zzgfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final Uri zzc() {
        zzgb zzgbVar = this.zzk;
        if (zzgbVar == null) {
            return null;
        }
        return zzgbVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zzd() throws IOException {
        zzgb zzgbVar = this.zzk;
        if (zzgbVar != null) {
            try {
                zzgbVar.zzd();
            } finally {
                this.zzk = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgb
    public final void zze(zzgz zzgzVar) {
        zzgzVar.getClass();
        this.zzc.zze(zzgzVar);
        this.zzb.add(zzgzVar);
        zzh(this.zzd, zzgzVar);
        zzh(this.zze, zzgzVar);
        zzh(this.zzf, zzgzVar);
        zzh(this.zzg, zzgzVar);
        zzh(this.zzh, zzgzVar);
        zzh(this.zzi, zzgzVar);
        zzh(this.zzj, zzgzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgb, com.google.android.gms.internal.ads.zzgu
    public final Map zzj() {
        zzgb zzgbVar = this.zzk;
        return zzgbVar == null ? Collections.EMPTY_MAP : zzgbVar.zzj();
    }
}

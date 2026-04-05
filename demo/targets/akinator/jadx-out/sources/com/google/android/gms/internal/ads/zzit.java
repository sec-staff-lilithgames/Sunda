package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzit implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzabs, zzqa, zzwy, zzts, zzhl, zzlz {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzju zza;

    public /* synthetic */ zzit(zzju zzjuVar, byte[] bArr) {
        Objects.requireNonNull(zzjuVar);
        this.zza = zzjuVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        zzju zzjuVar = this.zza;
        zzjuVar.zzQ(surfaceTexture);
        zzjuVar.zzS(i10, i11);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzju zzjuVar = this.zza;
        zzjuVar.zzR(null);
        zzjuVar.zzS(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.zza.zzS(i10, i11);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.zza.zzS(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.zza.zzS(0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zza(zzhs zzhsVar) {
        this.zza.zzU().zzN(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzb(String str, long j10, long j11) {
        this.zza.zzU().zzO(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzc(zzv zzvVar, zzht zzhtVar) {
        this.zza.zzU().zzP(zzvVar, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzd(int i10, long j10) {
        this.zza.zzU().zzQ(i10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zze(final zzbv zzbvVar) {
        zzdn zzdnVar = new zzdn() { // from class: com.google.android.gms.internal.ads.zzir
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzt(zzbvVar);
            }
        };
        zzds zzdsVarZzT = this.zza.zzT();
        zzdsVarZzT.zzd(25, zzdnVar);
        zzdsVarZzT.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzf(Object obj, long j10) {
        zzju zzjuVar = this.zza;
        zzjuVar.zzU().zzT(obj, j10);
        if (zzjuVar.zzW() == obj) {
            zzds zzdsVarZzT = zzjuVar.zzT();
            zzdsVarZzT.zzd(26, zzis.zza);
            zzdsVarZzT.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzg(String str) {
        this.zza.zzU().zzR(str);
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzh(zzhs zzhsVar) {
        this.zza.zzU().zzS(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzi(long j10, int i10) {
        this.zza.zzU().zzU(j10, i10);
    }

    @Override // com.google.android.gms.internal.ads.zzabs
    public final void zzj(Exception exc) {
        this.zza.zzU().zzV(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzk(zzhs zzhsVar) {
        this.zza.zzU().zzC(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzl(String str, long j10, long j11) {
        this.zza.zzU().zzD(str, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzm(zzv zzvVar, zzht zzhtVar) {
        this.zza.zzU().zzE(zzvVar, zzhtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzn(long j10) {
        this.zza.zzU().zzF(j10);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzo(int i10, long j10, long j11) {
        this.zza.zzU().zzG(i10, j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzp(String str) {
        this.zza.zzU().zzH(str);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzq(zzhs zzhsVar) {
        this.zza.zzU().zzI(zzhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzr(final boolean z10) {
        zzju zzjuVar = this.zza;
        if (zzjuVar.zzX() == z10) {
            return;
        }
        zzjuVar.zzY(z10);
        zzds zzdsVarZzT = zzjuVar.zzT();
        zzdsVarZzT.zzd(23, new zzdn() { // from class: com.google.android.gms.internal.ads.zzio
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj) {
                ((zzaz) obj).zzs(z10);
            }
        });
        zzdsVarZzT.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzs(Exception exc) {
        this.zza.zzU().zzJ(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzt(Exception exc) {
        this.zza.zzU().zzK(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzu(zzqb zzqbVar) {
        this.zza.zzU().zzL(zzqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzv(zzqb zzqbVar) {
        this.zza.zzU().zzM(zzqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzqa
    public final void zzw(final int i10) {
        this.zza.zzV().zza(new zzglu() { // from class: com.google.android.gms.internal.ads.zzip
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i10);
            }
        }, new zzglu() { // from class: com.google.android.gms.internal.ads.zziq
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return Integer.valueOf(i10);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzlz
    public final void zzx(zzmf zzmfVar) {
        this.zza.zzP(zzib.zzc(zzmfVar, IronSourceError.AUCTION_ERROR_DECRYPTION));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }
}

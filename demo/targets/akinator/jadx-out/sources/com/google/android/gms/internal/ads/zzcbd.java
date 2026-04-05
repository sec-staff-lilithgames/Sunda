package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcbd {
    private final Clock zza;
    private final zzcbn zzb;
    private final String zze;
    private final String zzf;
    private final Object zzd = new Object();
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = 0;
    private long zzj = -1;
    private long zzk = -1;
    private final LinkedList zzc = new LinkedList();

    public zzcbd(Clock clock, zzcbn zzcbnVar, String str, String str2) {
        this.zza = clock;
        this.zzb = zzcbnVar;
        this.zze = str;
        this.zzf = str2;
    }

    public final void zza(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        synchronized (this.zzd) {
            long jElapsedRealtime = this.zza.elapsedRealtime();
            this.zzj = jElapsedRealtime;
            this.zzb.zzf(zzmVar, jElapsedRealtime);
        }
    }

    public final void zzb() {
        synchronized (this.zzd) {
            this.zzb.zzg();
        }
    }

    public final void zzc() {
        synchronized (this.zzd) {
            this.zzb.zzh();
        }
    }

    public final void zzd(long j10) {
        synchronized (this.zzd) {
            try {
                this.zzk = j10;
                if (j10 != -1) {
                    this.zzb.zzb(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1 && this.zzg == -1) {
                    this.zzg = this.zza.elapsedRealtime();
                    this.zzb.zzb(this);
                }
                this.zzb.zze();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    zzcbc zzcbcVar = new zzcbc(this);
                    zzcbcVar.zzc();
                    this.zzc.add(zzcbcVar);
                    this.zzi++;
                    zzcbn zzcbnVar = this.zzb;
                    zzcbnVar.zzd();
                    zzcbnVar.zzb(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzg() {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    LinkedList linkedList = this.zzc;
                    if (!linkedList.isEmpty()) {
                        zzcbc zzcbcVar = (zzcbc) linkedList.getLast();
                        if (zzcbcVar.zza() == -1) {
                            zzcbcVar.zzb();
                            this.zzb.zzb(this);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzh(boolean z10) {
        synchronized (this.zzd) {
            try {
                if (this.zzk != -1) {
                    this.zzh = this.zza.elapsedRealtime();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Bundle zzi() {
        Bundle bundle;
        synchronized (this.zzd) {
            try {
                bundle = new Bundle();
                bundle.putString("seq_num", this.zze);
                bundle.putString("slotid", this.zzf);
                bundle.putBoolean("ismediation", false);
                bundle.putLong("treq", this.zzj);
                bundle.putLong("tresponse", this.zzk);
                bundle.putLong("timp", this.zzg);
                bundle.putLong("tload", this.zzh);
                bundle.putLong("pcc", this.zzi);
                bundle.putLong("tfetch", -1L);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it = this.zzc.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zzcbc) it.next()).zzd());
                }
                bundle.putParcelableArrayList("tclick", arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public final String zzj() {
        return this.zze;
    }

    public final /* synthetic */ Clock zzk() {
        return this.zza;
    }
}

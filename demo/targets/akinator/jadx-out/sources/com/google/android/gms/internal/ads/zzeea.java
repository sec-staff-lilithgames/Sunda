package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.mbridge.msdk.foundation.download.Command;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeea extends zzbww {
    private final Context zza;
    private final zzgus zzb;
    private final zzeei zzc;
    private final zzcnr zzd;
    private final ArrayDeque zze;
    private final zzflp zzf;
    private final zzbxr zzg;

    public zzeea(Context context, zzgus zzgusVar, zzbxr zzbxrVar, zzcnr zzcnrVar, zzeei zzeeiVar, ArrayDeque arrayDeque, zzeef zzeefVar, zzflp zzflpVar) {
        zzbeu.zza(context);
        this.zza = context;
        this.zzb = zzgusVar;
        this.zzg = zzbxrVar;
        this.zzc = zzeeiVar;
        this.zzd = zzcnrVar;
        this.zze = arrayDeque;
        this.zzf = zzflpVar;
    }

    private static n1 zzm(final zzbxj zzbxjVar, zzfks zzfksVar, final zzezc zzezcVar) {
        zzgtq zzgtqVar = new zzgtq() { // from class: com.google.android.gms.internal.ads.zzedo
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return zzezcVar.zzc().zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbxjVar.zzm, false);
            }
        };
        return zzfksVar.zza(zzfkm.GMS_SIGNALS, zzgui.zza(zzbxjVar.zza)).zzc(zzgtqVar).zzb(zzedp.zza).zzi();
    }

    private static n1 zzn(n1 n1Var, zzfks zzfksVar, zzbqp zzbqpVar, zzflm zzflmVar, zzflc zzflcVar) {
        zzbqf zzbqfVarZza = zzbqpVar.zza("AFMA_getAdDictionary", zzbqm.zza, zzedu.zza);
        zzfll.zzb(n1Var, zzflcVar);
        zzfjz zzfjzVarZzi = zzfksVar.zza(zzfkm.BUILD_URL, n1Var).zzc(zzbqfVarZza).zzi();
        zzfll.zzf(zzfjzVarZzi, zzflmVar, zzflcVar);
        return zzfjzVarZzi;
    }

    private final void zzo(n1 n1Var, zzbxb zzbxbVar, zzbxj zzbxjVar) {
        zzgui.zzr(zzgui.zzj(n1Var, new zzgtq(this) { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return zzgui.zza(zzfho.zza((InputStream) obj));
            }
        }, zzcbv.zza), new zzedl(this, zzbxjVar, zzbxbVar), zzcbv.zzg);
    }

    private final synchronized void zzp() {
        int iIntValue = ((Long) zzbhb.zzb.zze()).intValue();
        while (true) {
            ArrayDeque arrayDeque = this.zze;
            if (arrayDeque.size() >= iIntValue) {
                arrayDeque.removeFirst();
            }
        }
    }

    private final synchronized void zzq(zzedv zzedvVar) {
        zzp();
        this.zze.addLast(zzedvVar);
    }

    private final synchronized zzedv zzr(String str) {
        Iterator it = this.zze.iterator();
        while (it.hasNext()) {
            zzedv zzedvVar = (zzedv) it.next();
            if (zzedvVar.zzc.equals(str)) {
                it.remove();
                return zzedvVar;
            }
        }
        return null;
    }

    public final n1 zzb(final zzbxj zzbxjVar, int i10) {
        zzedv zzedvVarZzr;
        zzfjz zzfjzVarZzi;
        zzbqg zzbqgVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbqp zzbqpVarZza = zzbqgVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzezc zzezcVarZzy = this.zzd.zzy(zzbxjVar, i10);
        zzbqf zzbqfVarZza = zzbqpVarZza.zza("google.afma.response.normalize", zzedx.zzd, zzbqm.zzb);
        if (((Boolean) zzbhb.zza.zze()).booleanValue()) {
            zzedvVarZzr = zzr(zzbxjVar.zzh);
            if (zzedvVarZzr == null) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but no matching parameters were found.");
            }
        } else {
            String str = zzbxjVar.zzj;
            zzedvVarZzr = null;
            if (str != null && !str.isEmpty()) {
                com.google.android.gms.ads.internal.util.zze.zza("Request contained a PoolKey but split request is disabled.");
            }
        }
        zzedv zzedvVar = zzedvVarZzr;
        zzflc zzflcVarZzn = zzedvVar == null ? zzflc.zzn(context, 9) : zzedvVar.zzd;
        zzflm zzflmVarZzf = zzezcVarZzy.zzf();
        zzflmVarZzf.zzb(zzbxjVar.zza.getStringArrayList("ad_types"));
        zzeeh zzeehVar = new zzeeh(zzbxjVar.zzg, zzflmVarZzf, zzflcVarZzn);
        zzeee zzeeeVar = new zzeee(context, zzbxjVar.zzb.afmaVersion, this.zzg, i10, null);
        zzfks zzfksVarZze = zzezcVarZzy.zze();
        zzflc zzflcVarZzn2 = zzflc.zzn(context, 11);
        if (zzedvVar == null) {
            final n1 n1VarZzm = zzm(zzbxjVar, zzfksVarZze, zzezcVarZzy);
            final n1 n1VarZzn = zzn(n1VarZzm, zzfksVarZze, zzbqpVarZza, zzflmVarZzf, zzflcVarZzn);
            zzflc zzflcVarZzn3 = zzflc.zzn(context, 10);
            final zzfjz zzfjzVarZzi2 = zzfksVarZze.zzb(zzfkm.HTTP, n1VarZzn, n1VarZzm).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedt
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    zzbxl zzbxlVar = (zzbxl) n1VarZzn.get();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue() && (bundle = zzbxjVar.zzm) != null) {
                        bundle.putLong(zzduq.GET_AD_DICTIONARY_SDKCORE_START.zza(), zzbxlVar.zzj());
                        bundle.putLong(zzduq.GET_AD_DICTIONARY_SDKCORE_END.zza(), zzbxlVar.zzk());
                    }
                    return new zzeeg((JSONObject) n1VarZzm.get(), zzbxlVar);
                }
            }).zzb(zzeehVar).zzb(zzfll.zzc(zzflcVarZzn3)).zzb(zzeeeVar).zzi();
            zzfll.zzd(zzfjzVarZzi2, zzflmVarZzf, zzflcVarZzn3);
            zzfll.zzb(zzfjzVarZzi2, zzflcVarZzn2);
            zzfjzVarZzi = zzfksVarZze.zzb(zzfkm.PRE_PROCESS, n1VarZzm, n1VarZzn, zzfjzVarZzi2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedm
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    Bundle bundle;
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue() && (bundle = zzbxjVar.zzm) != null) {
                        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundle, zzduq.HTTP_RESPONSE_READY.zza());
                    }
                    return new zzedx((zzeed) zzfjzVarZzi2.get(), (JSONObject) n1VarZzm.get(), (zzbxl) n1VarZzn.get());
                }
            }).zzc(zzbqfVarZza).zzi();
        } else {
            zzeeg zzeegVar = new zzeeg(zzedvVar.zzb, zzedvVar.zza);
            zzflc zzflcVarZzn4 = zzflc.zzn(context, 10);
            final zzfjz zzfjzVarZzi3 = zzfksVarZze.zza(zzfkm.HTTP, zzgui.zza(zzeegVar)).zzb(zzeehVar).zzb(zzfll.zzc(zzflcVarZzn4)).zzb(zzeeeVar).zzi();
            zzfll.zzd(zzfjzVarZzi3, zzflmVarZzf, zzflcVarZzn4);
            final n1 n1VarZza = zzgui.zza(zzedvVar);
            zzfll.zzb(zzfjzVarZzi3, zzflcVarZzn2);
            zzfjzVarZzi = zzfksVarZze.zzb(zzfkm.PRE_PROCESS, zzfjzVarZzi3, n1VarZza).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedn
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    zzeed zzeedVar = (zzeed) zzfjzVarZzi3.get();
                    n1 n1Var = n1VarZza;
                    return new zzedx(zzeedVar, ((zzedv) n1Var.get()).zzb, ((zzedv) n1Var.get()).zza);
                }
            }).zzc(zzbqfVarZza).zzi();
        }
        zzfll.zzd(zzfjzVarZzi, zzflmVarZzf, zzflcVarZzn2);
        return zzfjzVarZzi;
    }

    public final n1 zzc(final zzbxj zzbxjVar, int i10) {
        if (!((Boolean) zzbhb.zza.zze()).booleanValue()) {
            return zzgui.zzc(new Exception("Split request is disabled."));
        }
        zzfij zzfijVar = zzbxjVar.zzi;
        if (zzfijVar == null) {
            return zzgui.zzc(new Exception("Pool configuration missing from request."));
        }
        if (zzfijVar.zzc == 0 || zzfijVar.zzd == 0) {
            return zzgui.zzc(new Exception("Caching is disabled."));
        }
        Context context = this.zza;
        zzbqp zzbqpVarZza = com.google.android.gms.ads.internal.zzt.zzr().zza(context, VersionInfoParcel.forPackage(), this.zzf);
        zzezc zzezcVarZzy = this.zzd.zzy(zzbxjVar, i10);
        zzfks zzfksVarZze = zzezcVarZzy.zze();
        final n1 n1VarZzm = zzm(zzbxjVar, zzfksVarZze, zzezcVarZzy);
        zzflm zzflmVarZzf = zzezcVarZzy.zzf();
        final zzflc zzflcVarZzn = zzflc.zzn(context, 9);
        final n1 n1VarZzn = zzn(n1VarZzm, zzfksVarZze, zzbqpVarZza, zzflmVarZzf, zzflcVarZzn);
        return zzfksVarZze.zzb(zzfkm.GET_URL_AND_CACHE_KEY, n1VarZzm, n1VarZzn).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzedq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(n1VarZzn, n1VarZzm, zzbxjVar, zzflcVarZzn);
            }
        }).zzi();
    }

    public final n1 zzd(String str) {
        if (((Boolean) zzbhb.zza.zze()).booleanValue()) {
            return zzr(str) == null ? zzgui.zzc(new Exception("URL to be removed not found for cache key: ".concat(String.valueOf(str)))) : zzgui.zza(new zzedk(this));
        }
        return zzgui.zzc(new Exception("Split request is disabled."));
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zze(zzbxj zzbxjVar, zzbxb zzbxbVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue() && (bundle = zzbxjVar.zzm) != null) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundle, zzduq.SERVICE_CONNECTED.zza());
        }
        n1 n1VarZzb = zzb(zzbxjVar, Binder.getCallingUid());
        zzo(n1VarZzb, zzbxbVar, zzbxjVar);
        if (((Boolean) zzbgu.zzg.zze()).booleanValue()) {
            final zzeei zzeeiVar = this.zzc;
            Objects.requireNonNull(zzeeiVar);
            n1VarZzb.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeeiVar.zza();
                }
            }, this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzf(zzbxj zzbxjVar, zzbxb zzbxbVar) {
        Bundle bundle;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcv)).booleanValue() && (bundle = zzbxjVar.zzm) != null) {
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.q(bundle, zzduq.SERVICE_CONNECTED.zza());
        }
        zzo(zzk(zzbxjVar, Binder.getCallingUid()), zzbxbVar, zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzg(zzbxj zzbxjVar, zzbxb zzbxbVar) {
        zzo(zzc(zzbxjVar, Binder.getCallingUid()), zzbxbVar, zzbxjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzh(String str, zzbxb zzbxbVar) {
        zzo(zzd(str), zzbxbVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzi(String str) throws RemoteException {
        int callingUid = Binder.getCallingUid();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoQ)).booleanValue()) {
            String str2 = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoR);
            if (str2.isEmpty()) {
                return;
            }
            Iterable<String> iterableZzd = zzgms.zza(zzglr.zzc(AbstractJsonLexerKt.COMMA)).zzd(str2);
            com.google.android.gms.ads.internal.util.zze.zza("AdRequestServiceImpl: Preconnecting");
            for (String str3 : iterableZzd) {
                Context context = this.zza;
                zzeee zzeeeVar = new zzeee(context, str, this.zzg, callingUid, "HEAD");
                HashMap map = new HashMap();
                map.put(Command.HTTP_HEADER_USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str));
                try {
                    zzeed zzeedVarZzb = zzeeeVar.zza(new zzeec(str3, 30000, map, new byte[0], "", false));
                    if (zzeedVarZzb.zza != 200) {
                        int i10 = zzeedVarZzb.zza;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
                        sb2.append("Unexpected preconnect response: ");
                        sb2.append(i10);
                        throw new RemoteException(sb2.toString());
                    }
                } catch (Exception e10) {
                    throw new RemoteException(e10.getMessage());
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwx
    public final void zzj(zzbwt zzbwtVar, zzbxc zzbxcVar) {
        if (((Boolean) zzbhj.zza.zze()).booleanValue()) {
            this.zzd.zzF();
            String str = zzbwtVar.zza;
            zzgui.zzr(zzgui.zza(null), new zzedj(this, zzbxcVar, zzbwtVar), zzcbv.zzg);
        } else {
            try {
                zzbxcVar.zze("", zzbwtVar);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e10);
            }
        }
    }

    public final n1 zzk(final zzbxj zzbxjVar, int i10) {
        zzbqg zzbqgVarZzr = com.google.android.gms.ads.internal.zzt.zzr();
        Context context = this.zza;
        zzbqp zzbqpVarZza = zzbqgVarZzr.zza(context, VersionInfoParcel.forPackage(), this.zzf);
        if (!((Boolean) zzbhh.zza.zze()).booleanValue()) {
            return zzgui.zzc(new Exception("Signal collection disabled."));
        }
        zzezc zzezcVarZzy = this.zzd.zzy(zzbxjVar, i10);
        final zzeyd zzeydVarZzd = zzezcVarZzy.zzd();
        zzbqf zzbqfVarZza = zzbqpVarZza.zza("google.afma.request.getSignals", zzbqm.zza, zzbqm.zzb);
        zzflc zzflcVarZzn = zzflc.zzn(context, 22);
        zzfks zzfksVarZze = zzezcVarZzy.zze();
        zzfkm zzfkmVar = zzfkm.GET_SIGNALS;
        Bundle bundle = zzbxjVar.zza;
        zzfjz zzfjzVarZzi = zzfksVarZze.zza(zzfkmVar, zzgui.zza(bundle)).zzb(zzfll.zzc(zzflcVarZzn)).zzc(new zzgtq() { // from class: com.google.android.gms.internal.ads.zzedr
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) throws JSONException {
                return zzeydVarZzd.zza(com.google.android.gms.ads.internal.client.zzbb.zza().zzm((Bundle) obj), zzbxjVar.zzm, false);
            }
        }).zzj(zzfkm.JS_SIGNALS).zzc(zzbqfVarZza).zzi();
        zzflm zzflmVarZzf = zzezcVarZzy.zzf();
        zzflmVarZzf.zzb(bundle.getStringArrayList("ad_types"));
        zzflmVarZzf.zzd(bundle.getBundle("extras"));
        zzfll.zze(zzfjzVarZzi, zzflmVarZzf, zzflcVarZzn);
        if (((Boolean) zzbgu.zzh.zze()).booleanValue()) {
            final zzeei zzeeiVar = this.zzc;
            Objects.requireNonNull(zzeeiVar);
            zzfjzVarZzi.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedy
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzeeiVar.zza();
                }
            }, this.zzb);
        }
        return zzfjzVarZzi;
    }

    public final /* synthetic */ InputStream zzl(n1 n1Var, n1 n1Var2, zzbxj zzbxjVar, zzflc zzflcVar) {
        String strZzi = ((zzbxl) n1Var.get()).zzi();
        zzq(new zzedv((zzbxl) n1Var.get(), (JSONObject) n1Var2.get(), zzbxjVar.zzh, strZzi, zzflcVar));
        return new ByteArrayInputStream(strZzi.getBytes(StandardCharsets.UTF_8));
    }
}

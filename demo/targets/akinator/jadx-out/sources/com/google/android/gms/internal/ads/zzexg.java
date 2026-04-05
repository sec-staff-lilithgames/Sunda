package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzexg implements zzeya {
    public static final /* synthetic */ int zzb = 0;
    private static final zzexh zzc = new zzexh(new JSONArray().toString(), new Bundle(), "");
    final String zza;
    private final zzgus zzd;
    private final ScheduledExecutorService zze;
    private final zzeno zzf;
    private final Context zzg;
    private final zzfgn zzh;
    private final zzenj zzi;
    private final zzdsy zzj;
    private final zzdxv zzk;
    private final int zzl;

    public zzexg(zzgus zzgusVar, ScheduledExecutorService scheduledExecutorService, String str, zzeno zzenoVar, Context context, zzfgn zzfgnVar, zzenj zzenjVar, zzdsy zzdsyVar, zzdxv zzdxvVar, int i10) {
        this.zzd = zzgusVar;
        this.zze = scheduledExecutorService;
        this.zza = str;
        this.zzf = zzenoVar;
        this.zzg = context;
        this.zzh = zzfgnVar;
        this.zzi = zzenjVar;
        this.zzj = zzdsyVar;
        this.zzk = zzdxvVar;
        this.zzl = i10;
    }

    private final void zzf(List list, Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            zzens zzensVar = (zzens) ((Map.Entry) it.next()).getValue();
            String str = zzensVar.zza;
            list.add(zzh(str, Collections.singletonList(zzensVar.zze), zzg(str), zzensVar.zzb, zzensVar.zzc));
        }
    }

    private final Bundle zzg(String str) {
        Bundle bundle = this.zzh.zzd.zzm;
        if (bundle != null) {
            return bundle.getBundle(str);
        }
        return null;
    }

    private final zzgua zzh(final String str, final List list, final Bundle bundle, final boolean z10, final boolean z11) {
        zzgtp zzgtpVar = new zzgtp() { // from class: com.google.android.gms.internal.ads.zzexb
            @Override // com.google.android.gms.internal.ads.zzgtp
            public final /* synthetic */ n1 zza() {
                return this.zza.zzd(str, list, bundle, z10, z11);
            }
        };
        zzgus zzgusVar = this.zzd;
        zzgua zzguaVarZzw = zzgua.zzw(zzgui.zzf(zzgtpVar, zzgusVar));
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbQ)).booleanValue()) {
            zzguaVarZzw = (zzgua) zzgui.zzi(zzguaVarZzw, ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbJ)).longValue(), TimeUnit.MILLISECONDS, this.zze);
        }
        return (zzgua) zzgui.zzg(zzguaVarZzw, Throwable.class, new zzglu() { // from class: com.google.android.gms.internal.ads.zzexc
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                int i10 = zzexg.zzb;
                String str2 = str;
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error calling adapter: ".concat(String.valueOf(str2)));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzoc)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                    return null;
                }
                com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "rtbSignal.fetchRtbJsonInfo-".concat(String.valueOf(str2)));
                return null;
            }
        }, zzgusVar);
    }

    private final void zzi(zzbti zzbtiVar, Bundle bundle, List list, zzenr zzenrVar) throws RemoteException {
        zzbtiVar.zze(ObjectWrapper.wrap(this.zzg), this.zza, bundle, (Bundle) list.get(0), this.zzh.zzf, zzenrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final n1 zza() {
        if (this.zzl == 2) {
            return zzgui.zza(zzc);
        }
        zzfgn zzfgnVar = this.zzh;
        if (zzfgnVar.zzs) {
            if (!Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbW)).split(",")).contains(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfgnVar.zzd)))) {
                return zzgui.zza(zzc);
            }
        }
        return zzgui.zzf(new zzgtp() { // from class: com.google.android.gms.internal.ads.zzexe
            @Override // com.google.android.gms.internal.ads.zzgtp
            public final /* synthetic */ n1 zza() {
                return this.zza.zzc();
            }
        }, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzeya
    public final int zzb() {
        return 32;
    }

    public final /* synthetic */ n1 zzc() {
        final String str;
        zzexg zzexgVar;
        String lowerCase = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlU)).booleanValue() ? this.zzh.zzg.toLowerCase(Locale.ROOT) : this.zzh.zzg;
        final Bundle bundleZzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbU)).booleanValue() ? this.zzk.zzg() : new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeL)).booleanValue()) {
            int iZzk = com.google.android.gms.ads.internal.zzt.zzh().zzo().zzi().zzk();
            str = iZzk != 1 ? iZzk != 2 ? "EMPTY" : "INVALID" : "VALID";
        } else {
            str = "";
        }
        final ArrayList arrayList = new ArrayList();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcd)).booleanValue()) {
            zzexgVar = this;
            zzf(arrayList, zzexgVar.zzf.zzd(zzexgVar.zza, lowerCase));
        } else {
            zzeno zzenoVar = this.zzf;
            for (Map.Entry entry : zzenoVar.zzc(this.zza, lowerCase).entrySet()) {
                String str2 = (String) entry.getKey();
                arrayList.add(zzh(str2, (List) entry.getValue(), zzg(str2), true, true));
            }
            zzexgVar = this;
            zzf(arrayList, zzenoVar.zzb());
        }
        return zzgui.zzp(arrayList).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzexa
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                int i10 = zzexg.zzb;
                JSONArray jSONArray = new JSONArray();
                for (n1 n1Var : arrayList) {
                    if (((JSONObject) n1Var.get()) != null) {
                        jSONArray.put(n1Var.get());
                    }
                }
                String str3 = str;
                Bundle bundle = bundleZzg;
                if (jSONArray.length() != 0) {
                    return new zzexh(jSONArray.toString(), bundle, str3);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeL)).booleanValue()) {
                    return new zzexh(new JSONArray().toString(), bundle, str3);
                }
                return null;
            }
        }, zzexgVar.zzd);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ sh.n1 zzd(java.lang.String r8, final java.util.List r9, final android.os.Bundle r10, boolean r11, boolean r12) throws android.os.RemoteException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzcca r3 = new com.google.android.gms.internal.ads.zzcca
            r3.<init>()
            r1 = 0
            if (r12 == 0) goto L25
            com.google.android.gms.internal.ads.zzbel r12 = com.google.android.gms.internal.ads.zzbeu.zzbV
            com.google.android.gms.internal.ads.zzbes r0 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r12 = r0.zzd(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 != 0) goto L25
            com.google.android.gms.internal.ads.zzenj r12 = r7.zzi
            r12.zza(r8)
            com.google.android.gms.internal.ads.zzbti r12 = r12.zzb(r8)
        L23:
            r2 = r12
            goto L34
        L25:
            com.google.android.gms.internal.ads.zzdsy r12 = r7.zzj     // Catch: android.os.RemoteException -> L2c
            com.google.android.gms.internal.ads.zzbti r12 = r12.zzb(r8)     // Catch: android.os.RemoteException -> L2c
            goto L23
        L2c:
            r0 = move-exception
            r12 = r0
            java.lang.String r0 = "Couldn't create RTB adapter : "
            com.google.android.gms.ads.internal.util.zze.zzb(r0, r12)
            r2 = r1
        L34:
            if (r2 != 0) goto L4f
            com.google.android.gms.internal.ads.zzbel r9 = com.google.android.gms.internal.ads.zzbeu.zzbL
            com.google.android.gms.internal.ads.zzbes r10 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r9 = r10.zzd(r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L4e
            com.google.android.gms.internal.ads.zzenr.zzd(r8, r3)
            r1 = r7
            goto Lbb
        L4e:
            throw r1
        L4f:
            com.google.android.gms.internal.ads.zzenr r0 = new com.google.android.gms.internal.ads.zzenr
            com.google.android.gms.common.util.Clock r12 = com.google.android.gms.ads.internal.zzt.zzk()
            long r4 = r12.elapsedRealtime()
            r1 = r8
            r0.<init>(r1, r2, r3, r4)
            com.google.android.gms.internal.ads.zzbel r8 = com.google.android.gms.internal.ads.zzbeu.zzbQ
            com.google.android.gms.internal.ads.zzbes r12 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r12.zzd(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L8b
            java.util.concurrent.ScheduledExecutorService r8 = r7.zze
            com.google.android.gms.internal.ads.zzexf r12 = new com.google.android.gms.internal.ads.zzexf
            r12.<init>()
            com.google.android.gms.internal.ads.zzbel r1 = com.google.android.gms.internal.ads.zzbeu.zzbJ
            com.google.android.gms.internal.ads.zzbes r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r4.zzd(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r4 = r1.longValue()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r8.schedule(r12, r4, r1)
        L8b:
            if (r11 == 0) goto Lb7
            com.google.android.gms.internal.ads.zzbel r8 = com.google.android.gms.internal.ads.zzbeu.zzbX
            com.google.android.gms.internal.ads.zzbes r11 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r8 = r11.zzd(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto Lb0
            com.google.android.gms.internal.ads.zzgus r8 = r7.zzd
            r5 = r0
            com.google.android.gms.internal.ads.zzexd r0 = new com.google.android.gms.internal.ads.zzexd
            r1 = r7
            r4 = r9
            r6 = r3
            r3 = r10
            r0.<init>()
            r3 = r6
            r8.submit(r0)
            goto Lbb
        Lb0:
            r1 = r7
            r4 = r9
            r8 = r10
            r7.zzi(r2, r8, r4, r0)
            goto Lbb
        Lb7:
            r1 = r7
            r0.zzb()
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzexg.zzd(java.lang.String, java.util.List, android.os.Bundle, boolean, boolean):sh.n1");
    }

    public final /* synthetic */ void zze(zzbti zzbtiVar, Bundle bundle, List list, zzenr zzenrVar, zzcca zzccaVar) {
        try {
            zzi(zzbtiVar, bundle, list, zzenrVar);
        } catch (RemoteException e10) {
            zzccaVar.zzd(e10);
        }
    }
}

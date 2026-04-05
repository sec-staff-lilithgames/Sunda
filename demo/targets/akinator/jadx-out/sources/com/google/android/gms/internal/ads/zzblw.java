package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.util.HashMap;
import java.util.Map;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzblw {
    public static final zzblx zza = zzblv.zza;
    public static final zzblx zzb = zzblm.zza;
    public static final zzblx zzc = zzbln.zza;
    public static final zzblx zzd = new zzble();
    public static final zzblx zze = new zzblf();
    public static final zzblx zzf = zzbls.zza;
    public static final zzblx zzg = new zzblg();
    public static final zzblx zzh = new zzblh();
    public static final zzblx zzi = zzblt.zza;
    public static final zzblx zzj = new zzbli();
    public static final zzblx zzk = new zzblj();
    public static final zzblx zzl = new zzces();
    public static final zzblx zzm = new zzcet();
    public static final zzblx zzn = new zzbkq();
    public static final zzbmo zzo = new zzbmo();
    public static final zzblx zzp = new zzblk();
    public static final zzblx zzq = new zzbll();
    public static final zzblx zzr = new zzbkr();
    public static final zzblx zzs = new zzbks();
    public static final zzblx zzt = new zzbkt();
    public static final zzblx zzu = new zzbku();
    public static final zzblx zzv = new zzbkv();
    public static final zzblx zzw = new zzbkw();
    public static final zzblx zzx = new zzbkx();
    public static final zzblx zzy = new zzbky();
    public static final zzblx zzz = new zzbkz();
    public static final zzblx zzA = new zzbla();
    public static final zzblx zzB = new zzblc();
    public static final zzblx zzC = new zzbld();

    public static n1 zza(zzcgy zzcgyVar, String str) {
        Uri uriZzd = Uri.parse(str);
        try {
            zzaxa zzaxaVarZzS = zzcgyVar.zzS();
            zzfgr zzfgrVarZzT = zzcgyVar.zzT();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmY)).booleanValue() || zzfgrVarZzT == null) {
                if (zzaxaVarZzS != null && zzaxaVarZzS.zza(uriZzd)) {
                    uriZzd = zzaxaVarZzS.zzd(uriZzd, zzcgyVar.getContext(), zzcgyVar.zzE(), zzcgyVar.zzj());
                }
            } else if (zzaxaVarZzS != null && zzaxaVarZzS.zza(uriZzd)) {
                uriZzd = zzfgrVarZzT.zza(uriZzd, zzcgyVar.getContext(), zzcgyVar.zzE(), zzcgyVar.zzj());
            }
        } catch (zzaxb unused) {
            String strConcat = "Unable to append parameter to URL: ".concat(str);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
        }
        Map map = new HashMap();
        if (zzcgyVar.zzC() != null) {
            map = zzcgyVar.zzC().zzaw;
        }
        final String strZzb = zzcah.zzb(uriZzd, zzcgyVar.getContext(), map);
        long jLongValue = ((Long) zzbgt.zze.zze()).longValue();
        if (jLongValue <= 0 || jLongValue > 253830000) {
            return zzgui.zza(strZzb);
        }
        zzgua zzguaVarZzw = zzgua.zzw(zzcgyVar.zzaF());
        zzblo zzbloVar = zzblo.zza;
        zzgus zzgusVar = zzcbv.zzg;
        return (zzgua) zzgui.zzg((zzgua) zzgui.zzk((zzgua) zzgui.zzg(zzguaVarZzw, Throwable.class, zzbloVar, zzgusVar), new zzglu() { // from class: com.google.android.gms.internal.ads.zzblp
            /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
            @Override // com.google.android.gms.internal.ads.zzglu
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final /* synthetic */ java.lang.Object apply(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r6 = (java.lang.String) r6
                    com.google.android.gms.internal.ads.zzblx r0 = com.google.android.gms.internal.ads.zzblw.zza
                    java.lang.String r0 = r1
                    if (r6 != 0) goto L9
                    goto L74
                L9:
                    com.google.android.gms.internal.ads.zzbge r1 = com.google.android.gms.internal.ads.zzbgt.zzf
                    java.lang.Object r1 = r1.zze()
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L18
                    goto L39
                L18:
                    java.lang.String r1 = ".googleadservices.com"
                    java.lang.String r2 = ".googlesyndication.com"
                    java.lang.String r3 = ".doubleclick.net"
                    java.lang.String[] r1 = new java.lang.String[]{r3, r1, r2}
                    android.net.Uri r2 = android.net.Uri.parse(r0)
                    java.lang.String r2 = r2.getHost()
                    r3 = 0
                L2b:
                    r4 = 3
                    if (r3 >= r4) goto L74
                    r4 = r1[r3]
                    boolean r4 = r2.endsWith(r4)
                    if (r4 != 0) goto L39
                    int r3 = r3 + 1
                    goto L2b
                L39:
                    com.google.android.gms.internal.ads.zzbge r1 = com.google.android.gms.internal.ads.zzbgt.zza
                    java.lang.Object r1 = r1.zze()
                    java.lang.String r1 = (java.lang.String) r1
                    com.google.android.gms.internal.ads.zzbge r2 = com.google.android.gms.internal.ads.zzbgt.zzb
                    java.lang.Object r2 = r2.zze()
                    java.lang.String r2 = (java.lang.String) r2
                    boolean r3 = android.text.TextUtils.isEmpty(r1)
                    if (r3 != 0) goto L53
                    java.lang.String r0 = r0.replace(r1, r6)
                L53:
                    boolean r1 = android.text.TextUtils.isEmpty(r2)
                    if (r1 != 0) goto L74
                    android.net.Uri r1 = android.net.Uri.parse(r0)
                    java.lang.String r3 = r1.getQueryParameter(r2)
                    boolean r3 = android.text.TextUtils.isEmpty(r3)
                    if (r3 == 0) goto L74
                    android.net.Uri$Builder r0 = r1.buildUpon()
                    android.net.Uri$Builder r6 = r0.appendQueryParameter(r2, r6)
                    java.lang.String r6 = r6.toString()
                    return r6
                L74:
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzblp.apply(java.lang.Object):java.lang.Object");
            }
        }, zzgusVar), Throwable.class, new zzglu() { // from class: com.google.android.gms.internal.ads.zzblq
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                Throwable th2 = (Throwable) obj;
                zzblx zzblxVar = zzblw.zza;
                if (((Boolean) zzbgt.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "prepareClickUrl.attestation2");
                }
                return strZzb;
            }
        }, zzgusVar);
    }

    public static zzblx zzb(final zzdgv zzdgvVar, final zzcpe zzcpeVar) {
        return new zzblx() { // from class: com.google.android.gms.internal.ads.zzblr
            @Override // com.google.android.gms.internal.ads.zzblx
            public final /* synthetic */ void zza(Object obj, Map map) {
                zzcgy zzcgyVar = (zzcgy) obj;
                zzblw.zzc(map, zzdgvVar);
                final String str = (String) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_URL);
                if (str == null) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("URL missing from click GMSG.");
                    return;
                }
                final zzcpe zzcpeVar2 = zzcpeVar;
                zzgua zzguaVarZzw = zzgua.zzw(zzblw.zza(zzcgyVar, str));
                zzgtq zzgtqVar = new zzgtq() { // from class: com.google.android.gms.internal.ads.zzblu
                    @Override // com.google.android.gms.internal.ads.zzgtq
                    public final /* synthetic */ n1 zza(Object obj2) {
                        zzcpe zzcpeVar3;
                        String str2 = (String) obj2;
                        zzblx zzblxVar = zzblw.zza;
                        return (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlb)).booleanValue() && (zzcpeVar3 = zzcpeVar2) != null && zzcpe.zzc(str)) ? zzcpeVar3.zzb(str2, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgui.zza(str2);
                    }
                };
                zzgus zzgusVar = zzcbv.zza;
                zzgui.zzr((zzgua) zzgui.zzj(zzguaVarZzw, zzgtqVar, zzgusVar), new zzblb(zzcgyVar), zzgusVar);
            }
        };
    }

    public static void zzc(Map map, zzdgv zzdgvVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlL)).booleanValue() && map.containsKey("sc") && ((String) map.get("sc")).equals("1") && zzdgvVar != null) {
            zzdgvVar.zzdz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zze(com.google.android.gms.internal.ads.zzcik r16, java.util.Map r17) throws org.json.JSONException, java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzblw.zze(com.google.android.gms.internal.ads.zzcik, java.util.Map):void");
    }
}

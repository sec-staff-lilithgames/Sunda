package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.v;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzaxb;
import com.google.android.gms.internal.ads.zzbel;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbgn;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbvx;
import com.google.android.gms.internal.ads.zzbwa;
import com.google.android.gms.internal.ads.zzcar;
import com.google.android.gms.internal.ads.zzcaw;
import com.google.android.gms.internal.ads.zzcbv;
import com.google.android.gms.internal.ads.zzcjn;
import com.google.android.gms.internal.ads.zzdqt;
import com.google.android.gms.internal.ads.zzdvn;
import com.google.android.gms.internal.ads.zzfgr;
import com.google.android.gms.internal.ads.zzfhm;
import com.google.android.gms.internal.ads.zzflm;
import com.google.android.gms.internal.ads.zzflp;
import com.google.android.gms.internal.ads.zzfng;
import com.google.android.gms.internal.ads.zzglu;
import com.google.android.gms.internal.ads.zzgmu;
import com.google.android.gms.internal.ads.zzgtp;
import com.google.android.gms.internal.ads.zzgtq;
import com.google.android.gms.internal.ads.zzgua;
import com.google.android.gms.internal.ads.zzgui;
import com.google.android.gms.internal.ads.zzgus;
import com.google.android.gms.internal.play_billing.a;
import com.ironsource.C3191e4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzau extends zzcar {
    protected static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    protected static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    protected static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    protected static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbfz zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzcjn zzf;
    private Context zzg;
    private final zzaxa zzh;
    private final zzfgr zzi;
    private final zzfhm zzj;
    private final zzgus zzk;
    private final ScheduledExecutorService zzl;
    private zzbwa zzm;
    private final zzdvn zzp;
    private final zzfng zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhN)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhM)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhP)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhR)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhQ);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhS);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhT);

    public zzau(zzcjn zzcjnVar, Context context, zzaxa zzaxaVar, zzfhm zzfhmVar, zzgus zzgusVar, ScheduledExecutorService scheduledExecutorService, zzdvn zzdvnVar, zzfng zzfngVar, VersionInfoParcel versionInfoParcel, zzbfz zzbfzVar, zzfgr zzfgrVar, zzo zzoVar, zzf zzfVar) {
        List listZzaa;
        this.zzf = zzcjnVar;
        this.zzg = context;
        this.zzh = zzaxaVar;
        this.zzi = zzfgrVar;
        this.zzj = zzfhmVar;
        this.zzk = zzgusVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdvnVar;
        this.zzq = zzfngVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbfzVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhU)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhV));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhW));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhX));
            listZzaa = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhY));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? zzZ(uri, "nas", str) : uri;
    }

    private final void zzR(final List list, final IObjectWrapper iObjectWrapper, zzbvx zzbvxVar, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzik)).booleanValue()) {
            try {
                zzbvxVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                return;
            }
        }
        zzgus zzgusVar = this.zzk;
        n1 n1VarSubmit = zzgusVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzo(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            n1VarSubmit = zzgui.zzj(n1VarSubmit, new zzgtq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // com.google.android.gms.internal.ads.zzgtq
                public final /* synthetic */ n1 zza(Object obj) {
                    return this.zza.zzp((ArrayList) obj);
                }
            }, zzgusVar);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        zzgui.zzr(n1VarSubmit, new zzae(this, zzbvxVar, z10), this.zzf.zzb());
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbvx zzbvxVar, boolean z10) {
        n1 n1VarSubmit;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzik)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzbvxVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                i11++;
            }
        }
        if (i11 > 1) {
            String strValueOf = String.valueOf(list);
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzd(uri)) {
                zzgus zzgusVar = this.zzk;
                n1VarSubmit = zzgusVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.zza.zzq(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    n1VarSubmit = zzgui.zzj(n1VarSubmit, new zzgtq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
                        @Override // com.google.android.gms.internal.ads.zzgtq
                        public final /* synthetic */ n1 zza(Object obj) {
                            return this.zza.zzr((Uri) obj);
                        }
                    }, zzgusVar);
                } else {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf2));
                n1VarSubmit = zzgui.zza(uri);
            }
            arrayList.add(n1VarSubmit);
        }
        zzgui.zzr(zzgui.zzm(arrayList), new zzaf(this, zzbvxVar, z10), this.zzf.zzb());
    }

    private final void zzT() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkC)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkF)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkJ)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        zzau zzauVar;
        n1 n1VarZza;
        if (((Boolean) zzbgz.zze.zze()).booleanValue()) {
            this.zzJ.zza();
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmd)).booleanValue()) {
            n1VarZza = zzgui.zzf(new zzgtp() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // com.google.android.gms.internal.ads.zzgtp
                public final /* synthetic */ n1 zza() {
                    return this.zza.zzs();
                }
            }, zzcbv.zza);
            zzauVar = this;
        } else {
            zzauVar = this;
            n1VarZza = zzauVar.zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
        }
        zzgui.zzr(n1VarZza, new zzag(this), zzauVar.zzf.zzb());
    }

    private static boolean zzV(Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.ads.nonagon.signalgeneration.zzac zzW(android.content.Context r6, java.lang.String r7, java.lang.String r8, com.google.android.gms.ads.internal.client.zzr r9, com.google.android.gms.ads.internal.client.zzm r10, int r11, java.lang.String r12, android.os.Bundle r13, com.google.android.gms.internal.ads.zzcaw r14) {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzfgm r0 = new com.google.android.gms.internal.ads.zzfgm
            r0.<init>()
            java.lang.String r1 = "REWARDED"
            boolean r2 = r1.equals(r8)
            java.lang.String r3 = "REWARDED_INTERSTITIAL"
            if (r2 == 0) goto L18
            com.google.android.gms.internal.ads.zzfga r2 = r0.zzj()
            r4 = 2
            r2.zza(r4)
            goto L26
        L18:
            boolean r2 = r3.equals(r8)
            if (r2 == 0) goto L26
            com.google.android.gms.internal.ads.zzfga r2 = r0.zzj()
            r4 = 3
            r2.zza(r4)
        L26:
            com.google.android.gms.internal.ads.zzcjn r2 = r5.zzf
            com.google.android.gms.ads.nonagon.signalgeneration.zzab r2 = r2.zzr()
            com.google.android.gms.internal.ads.zzcxw r4 = new com.google.android.gms.internal.ads.zzcxw
            r4.<init>()
            r4.zza(r6)
            if (r7 != 0) goto L38
            java.lang.String r7 = "adUnitId"
        L38:
            r0.zzg(r7)
            if (r10 != 0) goto L46
            com.google.android.gms.ads.internal.client.zzn r7 = new com.google.android.gms.ads.internal.client.zzn
            r7.<init>()
            com.google.android.gms.ads.internal.client.zzm r10 = r7.zza()
        L46:
            r0.zza(r10)
            if (r9 != 0) goto L94
            int r7 = r8.hashCode()
            switch(r7) {
                case -1999289321: goto L82;
                case -428325382: goto L75;
                case 543046670: goto L6a;
                case 1854800829: goto L63;
                case 1951953708: goto L53;
                default: goto L52;
            }
        L52:
            goto L8f
        L53:
            java.lang.String r7 = "BANNER"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L8f
            com.google.android.gms.ads.internal.client.zzr r9 = new com.google.android.gms.ads.internal.client.zzr
            com.google.android.gms.ads.AdSize r7 = com.google.android.gms.ads.AdSize.BANNER
            r9.<init>(r6, r7)
            goto L94
        L63:
            boolean r6 = r8.equals(r3)
            if (r6 == 0) goto L8f
            goto L70
        L6a:
            boolean r6 = r8.equals(r1)
            if (r6 == 0) goto L8f
        L70:
            com.google.android.gms.ads.internal.client.zzr r9 = com.google.android.gms.ads.internal.client.zzr.zzc()
            goto L94
        L75:
            java.lang.String r6 = "APP_OPEN_AD"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L8f
            com.google.android.gms.ads.internal.client.zzr r9 = com.google.android.gms.ads.internal.client.zzr.zzd()
            goto L94
        L82:
            java.lang.String r6 = "NATIVE"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L8f
            com.google.android.gms.ads.internal.client.zzr r9 = com.google.android.gms.ads.internal.client.zzr.zzb()
            goto L94
        L8f:
            com.google.android.gms.ads.internal.client.zzr r9 = new com.google.android.gms.ads.internal.client.zzr
            r9.<init>()
        L94:
            r0.zzc(r9)
            r6 = 1
            r0.zzu(r6)
            r0.zzv(r13)
            com.google.android.gms.internal.ads.zzfgn r6 = r0.zzz()
            r4.zzb(r6)
            r4.zzh(r11)
            com.google.android.gms.internal.ads.zzcxx r6 = r4.zze()
            r2.zzc(r6)
            com.google.android.gms.ads.nonagon.signalgeneration.zzax r6 = new com.google.android.gms.ads.nonagon.signalgeneration.zzax
            r6.<init>()
            r6.zza(r8)
            r6.zzb(r12)
            r6.zzc(r14)
            com.google.android.gms.ads.nonagon.signalgeneration.zzay r7 = new com.google.android.gms.ads.nonagon.signalgeneration.zzay
            r8 = 0
            r7.<init>(r6, r8)
            r2.zzb(r7)
            com.google.android.gms.internal.ads.zzden r6 = new com.google.android.gms.internal.ads.zzden
            r6.<init>()
            com.google.android.gms.ads.nonagon.signalgeneration.zzac r6 = r2.zza()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zzW(android.content.Context, java.lang.String, java.lang.String, com.google.android.gms.ads.internal.client.zzr, com.google.android.gms.ads.internal.client.zzm, int, java.lang.String, android.os.Bundle, com.google.android.gms.internal.ads.zzcaw):com.google.android.gms.ads.nonagon.signalgeneration.zzac");
    }

    private final n1 zzX(final String str) {
        final zzdqt[] zzdqtVarArr = new zzdqt[1];
        n1 n1VarZzb = this.zzj.zzb();
        zzgtq zzgtqVar = new zzgtq() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzas
            @Override // com.google.android.gms.internal.ads.zzgtq
            public final /* synthetic */ n1 zza(Object obj) {
                return this.zza.zzu(zzdqtVarArr, str, (zzdqt) obj);
            }
        };
        zzgus zzgusVar = this.zzk;
        n1 n1VarZzj = zzgui.zzj(n1VarZzb, zzgtqVar, zzgusVar);
        n1VarZzj.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzv(zzdqtVarArr);
            }
        }, zzgusVar);
        return (zzgua) zzgui.zzg((zzgua) zzgui.zzk((zzgua) zzgui.zzi(zzgua.zzw(n1VarZzj), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzil)).intValue(), TimeUnit.MILLISECONDS, this.zzl), zzaq.zza, zzgusVar), Exception.class, zzar.zza, zzgusVar);
    }

    private final boolean zzY() {
        Map map;
        zzbwa zzbwaVar = this.zzm;
        return (zzbwaVar == null || (map = zzbwaVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf == -1) {
            return uri.buildUpon().appendQueryParameter(str, str2).build();
        }
        int i10 = iIndexOf + 1;
        StringBuilder sb2 = new StringBuilder(string.substring(0, i10));
        a.B(sb2, str, C3191e4.i.f36525b, str2, C3191e4.i.f36527c);
        sb2.append(string.substring(i10));
        return Uri.parse(sb2.toString());
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, ",");
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzgmu.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ zzflm zzy(n1 n1Var, zzcaw zzcawVar) {
        if (!zzflp.zza() || !((Boolean) zzbgn.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzflm zzflmVarZzb = ((zzac) zzgui.zzs(n1Var)).zzb();
            zzflmVarZzb.zzb(new ArrayList(Collections.singletonList(zzcawVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzcawVar.zzd;
            zzflmVarZzb.zzc(zzmVar == null ? "" : zzmVar.zzp);
            zzflmVarZzb.zzd(zzmVar.zzm);
            return zzflmVarZzb;
        } catch (ExecutionException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ zzdvn zzA() {
        return this.zzp;
    }

    public final /* synthetic */ zzfng zzB() {
        return this.zzq;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zzs;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzt;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzu;
    }

    public final /* synthetic */ String zzG() {
        return this.zzv;
    }

    public final /* synthetic */ String zzH() {
        return this.zzw;
    }

    public final /* synthetic */ AtomicInteger zzI() {
        return this.zzx;
    }

    public final /* synthetic */ VersionInfoParcel zzJ() {
        return this.zzy;
    }

    public final /* synthetic */ String zzK() {
        return this.zzz;
    }

    public final /* synthetic */ void zzL(String str) {
        this.zzz = str;
    }

    public final /* synthetic */ String zzM() {
        return this.zzA;
    }

    public final /* synthetic */ AtomicBoolean zzN() {
        return this.zzG;
    }

    public final /* synthetic */ AtomicInteger zzO() {
        return this.zzH;
    }

    public final boolean zzc(Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    public final boolean zzd(Uri uri) {
        return zzV(uri, this.zzB, this.zzC);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00cd  */
    @Override // com.google.android.gms.internal.ads.zzcas
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zze(com.google.android.gms.dynamic.IObjectWrapper r11, final com.google.android.gms.internal.ads.zzcaw r12, com.google.android.gms.internal.ads.zzcap r13) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzau.zze(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.internal.ads.zzcaw, com.google.android.gms.internal.ads.zzcap):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzik)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbwa zzbwaVar = this.zzm;
            this.zzn = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, zzbwaVar == null ? null : zzbwaVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.zzc(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbvx zzbvxVar) {
        zzR(list, iObjectWrapper, zzbvxVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbvx zzbvxVar) {
        zzS(list, iObjectWrapper, zzbvxVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzi(zzbwa zzbwaVar) {
        this.zzm = zzbwaVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkB)).booleanValue()) {
            zzbel zzbelVar = zzbeu.zzib;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
                zzT();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            zzf zzfVar = this.zzK;
            final zzj zzjVar = new zzj(webView, zzfVar, zzcbv.zzf);
            webView.addJavascriptInterface(new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzfVar, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkL)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzm();
            }
            if (((Boolean) zzbgz.zzc.zze()).booleanValue()) {
                zzfVar.zza(webView);
                if (((Boolean) zzbgz.zzd.zze()).booleanValue()) {
                    zzcbv.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzjVar.zza();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkM)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue()) {
                zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbvx zzbvxVar) {
        zzR(list, iObjectWrapper, zzbvxVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbvx zzbvxVar) {
        zzS(list, iObjectWrapper, zzbvxVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcas
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkP)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        v vVar = (v) ObjectWrapper.unwrap(iObjectWrapper2);
        e eVar = (e) ObjectWrapper.unwrap(iObjectWrapper3);
        zzbfz zzbfzVar = this.zzI;
        zzbfzVar.zza(context, vVar, str, eVar);
        if (((Boolean) zzbgz.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((Boolean) zzbgz.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return ObjectWrapper.wrap(zzbfzVar.zzb());
    }

    public final /* synthetic */ zzac zzn(zzcaw zzcawVar, int i10, Bundle bundle) {
        return zzW(this.zzg, zzcawVar.zza, zzcawVar.zzb, zzcawVar.zzc, zzcawVar.zzd, i10, zzcawVar.zzf, bundle, zzcawVar);
    }

    public final /* synthetic */ ArrayList zzo(List list, IObjectWrapper iObjectWrapper) throws Exception {
        zzaxa zzaxaVar = this.zzh;
        String strZzj = zzaxaVar.zzb() != null ? zzaxaVar.zzb().zzj(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzj));
            } else {
                String strValueOf = String.valueOf(uri);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ n1 zzp(final ArrayList arrayList) {
        return zzgui.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzglu() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzt(arrayList, (String) obj);
            }
        }, this.zzk);
    }

    public final /* synthetic */ Uri zzq(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfgr zzfgrVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmY)).booleanValue() || (zzfgrVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfgrVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzaxb e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ n1 zzr(final Uri uri) {
        return zzgui.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzglu(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
            @Override // com.google.android.gms.internal.ads.zzglu
            public final /* synthetic */ Object apply(Object obj) {
                return zzau.zzQ(uri, (String) obj);
            }
        }, this.zzk);
    }

    public final /* synthetic */ n1 zzs() {
        return zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
    }

    public final /* synthetic */ ArrayList zzt(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public final /* synthetic */ n1 zzu(zzdqt[] zzdqtVarArr, String str, zzdqt zzdqtVar) throws JSONException {
        zzdqtVarArr[0] = zzdqtVar;
        Context context = this.zzg;
        zzbwa zzbwaVar = this.zzm;
        Map map = zzbwaVar.zzb;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map, zzbwaVar.zza, null);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(this.zzm.zza);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZze);
        jSONObject.put("ad_view_signal", jSONObjectZzb);
        jSONObject.put("scroll_view_signal", jSONObjectZzc);
        jSONObject.put("lock_screen_signal", jSONObjectZzd);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", com.google.android.gms.ads.internal.util.zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdqtVar.zzc(str, jSONObject);
    }

    public final /* synthetic */ void zzv(zzdqt[] zzdqtVarArr) {
        zzdqt zzdqtVar = zzdqtVarArr[0];
        if (zzdqtVar != null) {
            this.zzj.zzc(zzgui.zza(zzdqtVar));
        }
    }

    public final /* synthetic */ void zzw(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }

    public final /* synthetic */ Context zzz() {
        return this.zzg;
    }
}

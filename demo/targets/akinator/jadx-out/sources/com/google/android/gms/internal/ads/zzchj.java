package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzchj extends WebViewClient implements zzciw {
    public static final /* synthetic */ int zzc = 0;
    private zzdvi zzA;
    private boolean zzB;
    private boolean zzC;
    private int zzD;
    private boolean zzE;
    private final zzegj zzG;
    private View.OnAttachStateChangeListener zzH;
    protected final zzcgy zza;
    protected zzbzt zzb;
    private final zzbdt zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzciu zzi;
    private zzciv zzj;
    private zzbkn zzk;
    private zzbkp zzl;
    private zzdgv zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;
    private zzbum zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbuh zzz = null;
    private final HashSet zzF = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgm)).split(",")));

    public zzchj(zzcgy zzcgyVar, zzbdt zzbdtVar, boolean z10, zzbum zzbumVar, zzbuh zzbuhVar, zzegj zzegjVar) {
        this.zzd = zzbdtVar;
        this.zza = zzcgyVar;
        this.zzs = z10;
        this.zzx = zzbumVar;
        this.zzG = zzegjVar;
    }

    private final void zzaa(final View view, final zzbzt zzbztVar, final int i10) {
        if (!zzbztVar.zzc() || i10 <= 0) {
            return;
        }
        zzbztVar.zzd(view);
        if (zzbztVar.zzc()) {
            com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchh
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzS(view, zzbztVar, i10);
                }
            }, 100L);
        }
    }

    private final void zzab() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzH;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    private static WebResourceResponse zzac() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbb)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x010a, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.zzt.zzc();
        r0 = r13.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0118, code lost:
    
        r4 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011c, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x011e, code lost:
    
        r15 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0120, code lost:
    
        r15 = r0.split(";")[0].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012b, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzc();
        r0 = r13.getContentType();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0136, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0138, code lost:
    
        r16 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x013b, code lost:
    
        r0 = r0.split(";");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0140, code lost:
    
        if (r0.length != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0143, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0145, code lost:
    
        if (r1 >= r0.length) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0153, code lost:
    
        if (r0[r1].trim().startsWith("charset") == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0155, code lost:
    
        r2 = r0[r1].trim().split(com.ironsource.C3191e4.i.f36525b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0162, code lost:
    
        if (r2.length <= 1) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0164, code lost:
    
        r4 = r2[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x016b, code lost:
    
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016e, code lost:
    
        r0 = r13.getHeaderFields();
        r1 = new java.util.HashMap(r0.size());
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0187, code lost:
    
        if (r0.hasNext() == false) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0189, code lost:
    
        r2 = r0.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0193, code lost:
    
        if (r2.getKey() == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0199, code lost:
    
        if (r2.getValue() == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a5, code lost:
    
        if (r2.getValue().isEmpty() != false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a7, code lost:
    
        r1.put(r2.getKey(), r2.getValue().get(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bd, code lost:
    
        r9 = com.google.android.gms.ads.internal.zzt.zzf().zzc(r15, r16, r13.getResponseCode(), r13.getResponseMessage(), r1, r13.getInputStream());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final android.webkit.WebResourceResponse zzad(java.lang.String r22, java.util.Map r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchj.zzad(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzae, reason: merged with bridge method [inline-methods] */
    public final void zzY(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzblx) it.next()).zza(this.zza, map);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzaf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzW(boolean z10, long j10) {
        this.zza.zzu(z10, j10);
    }

    private static final boolean zzag(zzcgy zzcgyVar) {
        return zzcgyVar.zzC() != null && zzcgyVar.zzC().zzb();
    }

    private static final boolean zzah(boolean z10, zzcgy zzcgyVar) {
        return (!z10 || zzcgyVar.zzN().zzg() || zzcgyVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(str)));
        Uri uri = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzO(uri);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.zzf) {
            try {
                zzcgy zzcgyVar = this.zza;
                if (zzcgyVar.zzX()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                    zzcgyVar.zzY();
                    return;
                }
                this.zzB = true;
                zzciv zzcivVar = this.zzj;
                if (zzcivVar != null) {
                    zzcivVar.zza();
                    this.zzj = null;
                }
                zzu();
                zzcgy zzcgyVar2 = this.zza;
                if (zzcgyVar2.zzL() != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmU)).booleanValue()) {
                        zzcgyVar2.zzL().zzz(str);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzJ(str, Collections.EMPTY_MAP);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case TsExtractor.TS_STREAM_TYPE_DVBSUBS /* 89 */:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(str)));
        Uri uriZzd = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzO(uriZzd);
        } else {
            if (this.zzn && webView == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if ("http".equalsIgnoreCase(scheme) || HttpRequest.DEFAULT_SCHEME.equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzbzt zzbztVar = this.zzb;
                        if (zzbztVar != null) {
                            zzbztVar.zzb(str);
                        }
                        this.zzg = null;
                    }
                    zzdgv zzdgvVar = this.zzm;
                    if (zzdgvVar != null) {
                        zzdgvVar.zzdz();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            zzcgy zzcgyVar = this.zza;
            if (zzcgyVar.zzD().willNotDraw()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(str)));
            } else {
                try {
                    zzaxa zzaxaVarZzS = zzcgyVar.zzS();
                    zzfgr zzfgrVarZzT = zzcgyVar.zzT();
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmY)).booleanValue() || zzfgrVarZzT == null) {
                        if (zzaxaVarZzS != null && zzaxaVarZzS.zza(uriZzd)) {
                            uriZzd = zzaxaVarZzS.zzd(uriZzd, zzcgyVar.getContext(), (View) zzcgyVar, zzcgyVar.zzj());
                        }
                    } else if (zzaxaVarZzS != null && zzaxaVarZzS.zza(uriZzd)) {
                        uriZzd = zzfgrVarZzT.zza(uriZzd, zzcgyVar.getContext(), (View) zzcgyVar, zzcgyVar.zzj());
                    }
                } catch (zzaxb unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(str)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar == null || zzbVar.zzb()) {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzcgy zzcgyVar2 = this.zza;
                    zzv(zzcVar, true, false, zzcgyVar2 != null ? zzcgyVar2.zzn() : "");
                } else {
                    zzbVar.zzc(str);
                }
            }
        }
        return true;
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbuh zzbuhVar = this.zzz;
        boolean zZzd = zzbuhVar != null ? zzbuhVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzbzt zzbztVar = this.zzb;
        if (zzbztVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzbztVar.zzb(str);
        }
    }

    public final void zzB(String str, zzblx zzblxVar) {
        synchronized (this.zzf) {
            try {
                HashMap map = this.zze;
                List copyOnWriteArrayList = (List) map.get(str);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList();
                    map.put(str, copyOnWriteArrayList);
                }
                copyOnWriteArrayList.add(zzblxVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzC(String str, zzblx zzblxVar) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.remove(zzblxVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            try {
                List list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                list.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            try {
                List<zzblx> list = (List) this.zze.get(str);
                if (list == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (zzblx zzblxVar : list) {
                    if (predicate.apply(zzblxVar)) {
                        arrayList.add(zzblxVar);
                    }
                }
                list.removeAll(arrayList);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzF() {
        zzbzt zzbztVar = this.zzb;
        if (zzbztVar != null) {
            zzbztVar.zzf();
            this.zzb = null;
        }
        zzab();
        synchronized (this.zzf) {
            try {
                this.zze.clear();
                this.zzg = null;
                this.zzh = null;
                this.zzi = null;
                this.zzj = null;
                this.zzk = null;
                this.zzl = null;
                this.zzn = false;
                this.zzs = false;
                this.zzt = false;
                this.zzu = false;
                this.zzw = null;
                this.zzy = null;
                this.zzx = null;
                zzbuh zzbuhVar = this.zzz;
                if (zzbuhVar != null) {
                    zzbuhVar.zzb(true);
                    this.zzz = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzG(zzciu zzciuVar) {
        this.zzi = zzciuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzH(zzciv zzcivVar) {
        this.zzj = zzcivVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final zzdvi zzI() {
        return this.zzA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02e3 A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020e A[Catch: all -> 0x01bb, TryCatch #12 {all -> 0x01bb, blocks: (B:71:0x01a0, B:73:0x01b2, B:77:0x01be, B:81:0x01fc, B:83:0x020e, B:84:0x0215), top: B:111:0x00e8 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02cd A[Catch: NoClassDefFoundError -> 0x0020, Exception -> 0x0023, TryCatch #11 {Exception -> 0x0023, NoClassDefFoundError -> 0x0020, blocks: (B:3:0x000c, B:5:0x0019, B:10:0x0026, B:12:0x0036, B:14:0x003d, B:16:0x004b, B:18:0x0067, B:20:0x0080, B:22:0x0097, B:23:0x009a, B:25:0x009d, B:28:0x00b9, B:30:0x00cd, B:33:0x00e8, B:78:0x01c8, B:50:0x017c, B:97:0x02cd, B:100:0x02dd, B:102:0x02e3, B:104:0x02f1, B:86:0x024b, B:87:0x027e, B:85:0x0219, B:49:0x014b, B:32:0x00db, B:88:0x027f, B:90:0x0289, B:92:0x028f, B:94:0x02c2), top: B:112:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.webkit.WebResourceResponse zzJ(java.lang.String r21, java.util.Map r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzchj.zzJ(java.lang.String, java.util.Map):android.webkit.WebResourceResponse");
    }

    public final void zzK(boolean z10) {
        this.zzn = false;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzL() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchf
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws JSONException {
                    zzcgy zzcgyVar = this.zza.zza;
                    zzcgyVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcgyVar.zzL();
                    if (zzmVarZzL != null) {
                        zzmVarZzL.zzv();
                    }
                }
            });
        }
    }

    public final void zzM(boolean z10) {
        this.zzE = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzN(int i10, int i11) {
        zzbuh zzbuhVar = this.zzz;
        if (zzbuhVar != null) {
            zzbuhVar.zze(i10, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzO(Uri uri) {
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path == null || list == null) {
            com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzhl)).booleanValue() || com.google.android.gms.ads.internal.zzt.zzh().zza() == null) {
                return;
            }
            final String strSubstring = (path == null || path.length() < 2) ? AbstractJsonLexerKt.NULL : path.substring(1);
            zzcbv.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchg
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    int i10 = zzchj.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(strSubstring);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgl)).booleanValue() && this.zzF.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzgn)).intValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                zzgui.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcha(this, list, path, uri), zzcbv.zzf);
                return;
            }
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        zzY(com.google.android.gms.ads.internal.util.zzs.zzU(uri), list, path);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzP(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzQ(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzR(boolean z10) {
        synchronized (this.zzf) {
            this.zzv = z10;
        }
    }

    public final /* synthetic */ void zzS(View view, zzbzt zzbztVar, int i10) {
        zzaa(view, zzbztVar, i10 - 1);
    }

    public final /* synthetic */ void zzT(boolean z10, long j10) {
        zzW(true, j10);
    }

    public final /* synthetic */ void zzX(View view, zzbzt zzbztVar, int i10) {
        zzaa(view, zzbztVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzZ(com.google.android.gms.ads.internal.client.zza zzaVar, zzbkn zzbknVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbkp zzbkpVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z10, zzbma zzbmaVar, com.google.android.gms.ads.internal.zzb zzbVar, zzbuo zzbuoVar, zzbzt zzbztVar, zzefy zzefyVar, zzfng zzfngVar, zzdvi zzdviVar, zzbms zzbmsVar, zzdgv zzdgvVar, zzbmr zzbmrVar, zzbml zzbmlVar, zzbly zzblyVar, zzcpe zzcpeVar, zzdwl zzdwlVar, zzcxn zzcxnVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzbztVar, null) : zzbVar;
        zzcgy zzcgyVar = this.zza;
        this.zzz = new zzbuh(zzcgyVar, zzbuoVar);
        this.zzb = zzbztVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbk)).booleanValue()) {
            zzB("/adMetadata", new zzbkm(zzbknVar));
        }
        if (zzbkpVar != null) {
            zzB("/appEvent", new zzbko(zzbkpVar));
        }
        zzB("/backButton", zzblw.zzj);
        zzB("/refresh", zzblw.zzk);
        zzB("/canOpenApp", zzblw.zzb);
        zzB("/canOpenURLs", zzblw.zza);
        zzB("/canOpenIntents", zzblw.zzc);
        zzB("/close", zzblw.zzd);
        zzB("/customClose", zzblw.zze);
        zzB("/instrument", zzblw.zzn);
        zzB("/delayPageLoaded", zzblw.zzp);
        zzB("/delayPageClosed", zzblw.zzq);
        zzB("/getLocationInfo", zzblw.zzr);
        zzB("/log", zzblw.zzg);
        zzB("/mraid", new zzbme(zzbVar2, this.zzz, zzbuoVar));
        zzbum zzbumVar = this.zzx;
        if (zzbumVar != null) {
            zzB("/mraidLoaded", zzbumVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbmk(zzbVar3, this.zzz, zzefyVar, zzdviVar, zzcpeVar, zzcxnVar));
        zzB("/precache", new zzcff());
        zzB("/touch", zzblw.zzi);
        zzB("/video", zzblw.zzl);
        zzB("/videoMeta", zzblw.zzm);
        if (zzefyVar == null || zzfngVar == null) {
            zzB("/click", zzblw.zzb(zzdgvVar, zzcpeVar));
            zzB("/httpTrack", zzblw.zzf);
        } else {
            zzB("/click", zzfgy.zza(zzefyVar, zzfngVar, zzcpeVar, zzdgvVar));
            zzB("/httpTrack", zzfgy.zzb(zzefyVar, zzfngVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcgyVar.getContext())) {
            Map map = new HashMap();
            if (zzcgyVar.zzC() != null) {
                map = zzcgyVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbmd(zzcgyVar.getContext(), map));
        }
        if (zzbmaVar != null) {
            zzB("/setInterstitialProperties", new zzblz(zzbmaVar));
        }
        if (zzbmsVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjT)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbmsVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkm)).booleanValue() && zzbmrVar != null) {
            zzB("/shareSheet", zzbmrVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zziu)).booleanValue() && zzdwlVar != null) {
            zzB("/onDeviceStorageEvent", new zzbmf(zzdwlVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkr)).booleanValue() && zzbmlVar != null) {
            zzB("/inspectorOutOfContextTest", zzbmlVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzkw)).booleanValue() && zzblyVar != null) {
            zzB("/inspectorStorage", zzblyVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmz)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzblw.zzu);
            zzB("/presentPlayStoreOverlay", zzblw.zzv);
            zzB("/expandPlayStoreOverlay", zzblw.zzw);
            zzB("/collapsePlayStoreOverlay", zzblw.zzx);
            zzB("/closePlayStoreOverlay", zzblw.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzdN)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzblw.zzA);
            zzB("/resetPAID", zzblw.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzmT)).booleanValue() && zzcgyVar.zzC() != null && zzcgyVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzblw.zzB);
            zzB("/clearLocalStorageKeys", zzblw.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbknVar;
        this.zzl = zzbkpVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdgvVar;
        this.zzA = zzdviVar;
        this.zzn = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zza(int i10, int i11, boolean z10) {
        zzbum zzbumVar = this.zzx;
        if (zzbumVar != null) {
            zzbumVar.zzb(i10, i11);
        }
        zzbuh zzbuhVar = this.zzz;
        if (zzbuhVar != null) {
            zzbuhVar.zzc(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzb(zzffu zzffuVar) {
        zzcgy zzcgyVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcgyVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbmd(zzcgyVar.getContext(), zzffuVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzc(zzcpe zzcpeVar) {
        zzD("/click");
        zzB("/click", zzblw.zzb(this.zzm, zzcpeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzd(zzcpe zzcpeVar, zzefy zzefyVar, zzfng zzfngVar) {
        zzD("/click");
        if (zzefyVar == null || zzfngVar == null) {
            zzB("/click", zzblw.zzb(this.zzm, zzcpeVar));
        } else {
            zzB("/click", zzfgy.zza(zzefyVar, zzfngVar, zzcpeVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdV() {
        zzdgv zzdgvVar = this.zzm;
        if (zzdgvVar != null) {
            zzdgvVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdz() {
        zzdgv zzdgvVar = this.zzm;
        if (zzdgvVar != null) {
            zzdgvVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zze(zzcpe zzcpeVar, zzefy zzefyVar, zzdvi zzdviVar) {
        zzD("/open");
        zzB("/open", new zzbmk(this.zzy, this.zzz, zzefyVar, zzdviVar, zzcpeVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzi(com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzj(zzbzt zzbztVar) {
        this.zzb = zzbztVar;
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final boolean zzk() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    public final boolean zzm() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    public final boolean zzn() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzv;
        }
        return z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzq() {
        zzbzt zzbztVar = this.zzb;
        if (zzbztVar != null) {
            zzcgy zzcgyVar = this.zza;
            WebView webViewZzD = zzcgyVar.zzD();
            if (z1.isAttachedToWindow(webViewZzD)) {
                zzaa(webViewZzD, zzbztVar, 10);
                return;
            }
            zzab();
            zzcgz zzcgzVar = new zzcgz(this, zzbztVar);
            this.zzH = zzcgzVar;
            ((View) zzcgyVar).addOnAttachStateChangeListener(zzcgzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzD++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzs() {
        this.zzD--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzciw
    public final void zzt() {
        zzbdt zzbdtVar = this.zzd;
        if (zzbdtVar != null) {
            zzbdtVar.zzc(10005);
        }
        this.zzC = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzB && this.zzD <= 0) || this.zzC || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzch)).booleanValue()) {
                zzcgy zzcgyVar = this.zza;
                if (zzcgyVar.zzq() != null) {
                    zzbfb.zza(zzcgyVar.zzq().zzc(), zzcgyVar.zzi(), "awfllc");
                }
            }
            zzciu zzciuVar = this.zzi;
            boolean z10 = false;
            if (!this.zzC && !this.zzo) {
                z10 = true;
            }
            zzciuVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        boolean z12;
        zzcgy zzcgyVar = this.zza;
        boolean zZzW = zzcgyVar.zzW();
        boolean z13 = false;
        boolean z14 = zzah(zZzW, zzcgyVar) || z11;
        if (z14 || !z10) {
            z12 = zZzW;
            z13 = true;
        } else {
            z12 = zZzW;
        }
        zzA(new AdOverlayInfoParcel(zzcVar, z14 ? null : this.zzg, z12 ? null : this.zzh, this.zzw, zzcgyVar.zzs(), zzcgyVar, z13 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i10) {
        zzegj zzegjVar = this.zzG;
        zzcgy zzcgyVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcgyVar, zzcgyVar.zzs(), str, str2, 14, zzegjVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [com.google.android.gms.internal.ads.zzbvb] */
    /* JADX WARN: Type inference failed for: r9v2 */
    public final void zzx(boolean z10, int i10, boolean z11) {
        com.google.android.gms.ads.internal.client.zza zzaVar;
        zzdgv zzdgvVar;
        ?? r92;
        int i11;
        com.google.android.gms.ads.internal.client.zza zzaVar2;
        boolean z12;
        zzcgy zzcgyVar = this.zza;
        boolean zZzah = zzah(zzcgyVar.zzW(), zzcgyVar);
        boolean z13 = true;
        if (!zZzah && z11) {
            z13 = false;
        }
        if (zZzah) {
            zzaVar = null;
            zzdgvVar = null;
        } else {
            zzaVar = this.zzg;
            zzdgvVar = null;
        }
        com.google.android.gms.ads.internal.overlay.zzr zzrVar = this.zzh;
        zzdgv zzdgvVar2 = zzdgvVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcgyVar.zzs();
        zzdgv zzdgvVar3 = z13 ? zzdgvVar2 : this.zzm;
        if (zzag(zzcgyVar)) {
            r92 = this.zzG;
            z12 = z10;
            i11 = i10;
            zzaVar2 = zzaVar;
        } else {
            r92 = zzdgvVar2;
            i11 = i10;
            zzaVar2 = zzaVar;
            z12 = z10;
        }
        zzA(new AdOverlayInfoParcel(zzaVar2, zzrVar, zzadVar, zzcgyVar, z12, i11, versionInfoParcelZzs, zzdgvVar3, r92));
    }

    public final void zzy(boolean z10, int i10, String str, boolean z11, boolean z12) {
        zzcgy zzcgyVar = this.zza;
        boolean zZzW = zzcgyVar.zzW();
        boolean zZzah = zzah(zZzW, zzcgyVar);
        boolean z13 = true;
        if (!zZzah && z11) {
            z13 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzah ? null : this.zzg;
        zzchi zzchiVar = zZzW ? null : new zzchi(zzcgyVar, this.zzh);
        zzbkn zzbknVar = this.zzk;
        zzegj zzegjVar = null;
        zzbkp zzbkpVar = this.zzl;
        boolean z14 = z13;
        zzchi zzchiVar2 = zzchiVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcgyVar.zzs();
        zzdgv zzdgvVar = z14 ? null : this.zzm;
        if (zzag(zzcgyVar)) {
            zzegjVar = this.zzG;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzchiVar2, zzbknVar, zzbkpVar, zzadVar, zzcgyVar, z10, i10, str, versionInfoParcelZzs, zzdgvVar, zzegjVar, z12));
    }

    public final void zzz(boolean z10, int i10, String str, String str2, boolean z11) {
        zzcgy zzcgyVar = this.zza;
        boolean zZzW = zzcgyVar.zzW();
        boolean zZzah = zzah(zZzW, zzcgyVar);
        boolean z12 = true;
        if (!zZzah && z11) {
            z12 = false;
        }
        com.google.android.gms.ads.internal.client.zza zzaVar = zZzah ? null : this.zzg;
        zzchi zzchiVar = zZzW ? null : new zzchi(zzcgyVar, this.zzh);
        zzbkn zzbknVar = this.zzk;
        zzegj zzegjVar = null;
        zzbkp zzbkpVar = this.zzl;
        boolean z13 = z12;
        zzchi zzchiVar2 = zzchiVar;
        com.google.android.gms.ads.internal.overlay.zzad zzadVar = this.zzw;
        VersionInfoParcel versionInfoParcelZzs = zzcgyVar.zzs();
        zzdgv zzdgvVar = z13 ? null : this.zzm;
        if (zzag(zzcgyVar)) {
            zzegjVar = this.zzG;
        }
        zzA(new AdOverlayInfoParcel(zzaVar, zzchiVar2, zzbknVar, zzbkpVar, zzadVar, zzcgyVar, z10, i10, str, str2, versionInfoParcelZzs, zzdgvVar, zzegjVar));
    }
}

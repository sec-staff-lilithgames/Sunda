package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbbu extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbbl zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzbbu() {
        zzbbl zzbblVar = new zzbbl();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbblVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbgl.zzd.zze()).intValue();
        this.zzg = ((Long) zzbgl.zza.zze()).intValue();
        this.zzh = ((Long) zzbgl.zze.zze()).intValue();
        this.zzi = ((Long) zzbgl.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzan)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzao)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzap)).intValue();
        this.zze = ((Long) zzbgl.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzar);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzas)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzat)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzau)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0082, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0094, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.extractContent");
        r2 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00cd, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzt.zzh().zzg(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00de, code lost:
    
        r1 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e8 A[EXC_TOP_SPLITTER, LOOP:1: B:64:0x00e8->B:73:0x00e8, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() throws java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbu.run():void");
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzb(View view) {
        try {
            zzbbk zzbbkVar = new zzbbk(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZze = com.google.android.gms.ads.internal.zzt.zzg().zze();
            if (contextZze != null) {
                String str = this.zzm;
                if (!TextUtils.isEmpty(str)) {
                    String str2 = (String) view.getTag(contextZze.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaq), "id", contextZze.getPackageName()));
                    if (str2 != null && str2.equals(str)) {
                        return;
                    }
                }
            }
            zzbbt zzbbtVarZzc = zzc(view, zzbbkVar);
            zzbbkVar.zzi();
            if (zzbbtVarZzc.zza == 0 && zzbbtVarZzc.zzb == 0) {
                return;
            }
            int i10 = zzbbtVarZzc.zzb;
            if (i10 != 0) {
                if (i10 == 0) {
                }
                this.zzd.zzc(zzbbkVar);
            } else if (zzbbkVar.zzl() == 0) {
                return;
            }
            if (this.zzd.zza(zzbbkVar)) {
                return;
            }
            this.zzd.zzc(zzbbkVar);
        } catch (Exception e10) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception in fetchContentOnUIThread", e10);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "ContentFetchTask.fetchContent");
        }
    }

    public final zzbbt zzc(View view, zzbbk zzbbkVar) {
        if (view == null) {
            return new zzbbt(this, 0, 0);
        }
        boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
        if ((view instanceof TextView) && !(view instanceof EditText)) {
            CharSequence text = ((TextView) view).getText();
            if (TextUtils.isEmpty(text)) {
                return new zzbbt(this, 0, 0);
            }
            zzbbkVar.zzg(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
            return new zzbbt(this, 1, 0);
        }
        if ((view instanceof WebView) && !(view instanceof zzcgy)) {
            WebView webView = (WebView) view;
            zzbbkVar.zze();
            webView.post(new zzbbs(this, zzbbkVar, webView, globalVisibleRect));
            return new zzbbt(this, 0, 1);
        }
        if (!(view instanceof ViewGroup)) {
            return new zzbbt(this, 0, 0);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
            zzbbt zzbbtVarZzc = zzc(viewGroup.getChildAt(i12), zzbbkVar);
            i10 += zzbbtVarZzc.zza;
            i11 += zzbbtVarZzc.zzb;
        }
        return new zzbbt(this, i10, i11);
    }

    public final void zzd(zzbbk zzbbkVar, WebView webView, String str, boolean z10) {
        zzbbk zzbbkVar2;
        zzbbkVar.zzd();
        try {
            if (TextUtils.isEmpty(str)) {
                zzbbkVar2 = zzbbkVar;
            } else {
                String strOptString = new JSONObject(str).optString("text");
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzbbkVar2 = zzbbkVar;
                    zzbbkVar2.zzf(strOptString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    String title = webView.getTitle();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(title).length() + 1 + String.valueOf(strOptString).length());
                    sb2.append(title);
                    sb2.append("\n");
                    sb2.append(strOptString);
                    zzbbkVar.zzf(sb2.toString(), z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                    zzbbkVar2 = zzbbkVar;
                }
            }
            if (zzbbkVar2.zza()) {
                this.zzd.zzb(zzbbkVar2);
            }
        } catch (JSONException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Json string may be malformed.");
        } catch (Throwable th2) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to get webview content.", th2);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("ContentFetchThread: paused, pause = true");
            String string = sb2.toString();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        }
    }
}

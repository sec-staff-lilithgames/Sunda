package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import k6.v;
import k6.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfpg {
    private final zzfpi zza;
    private final WebView zzb;
    private zzfrj zzc;
    private final HashMap zzd;
    private final zzfpw zze;

    private zzfpg(zzfpi zzfpiVar, WebView webView, boolean z10) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzfpw();
        zzfqs.zza();
        this.zza = zzfpiVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzfou) it.next()).zzb(webView);
            }
            this.zzc = new zzfrj(webView);
        }
        if (!w.isFeatureSupported("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        v.addWebMessageListener(this.zzb, "omidJsSessionService", new HashSet(Arrays.asList("*")), new zzfpe(this));
    }

    public static zzfpg zza(zzfpi zzfpiVar, WebView webView, boolean z10) {
        return new zzfpg(zzfpiVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        v.removeWebMessageListener(this.zzb, "omidJsSessionService");
    }

    public final void zzb(zzfpf zzfpfVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfou) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfpd(this, zzfpfVar, timer), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzc() {
        zzfrj zzfrjVar = this.zzc;
        if (zzfrjVar == null) {
            return null;
        }
        return (View) zzfrjVar.get();
    }

    public final void zzd(View view, zzfpb zzfpbVar, String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzfou) it.next()).zzd(view, zzfpbVar, "Ad overlay");
        }
        this.zze.zzb(view, zzfpbVar, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(String str) {
        zzfoz zzfozVar = zzfoz.DEFINED_BY_JAVASCRIPT;
        zzfpc zzfpcVar = zzfpc.DEFINED_BY_JAVASCRIPT;
        zzfph zzfphVar = zzfph.JAVASCRIPT;
        zzfoy zzfoyVar = new zzfoy(zzfov.zza(zzfozVar, zzfpcVar, zzfphVar, zzfphVar, false), zzfow.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzfoyVar);
        zzfoyVar.zzb(zzc());
        for (zzfpv zzfpvVar : this.zze.zza()) {
            zzfoyVar.zzd((View) zzfpvVar.zza().get(), zzfpvVar.zzc(), zzfpvVar.zzd());
        }
        zzfoyVar.zza();
    }

    public final /* synthetic */ void zzg(String str) {
        HashMap map = this.zzd;
        zzfou zzfouVar = (zzfou) map.get(str);
        if (zzfouVar != null) {
            zzfouVar.zzc();
            map.remove(str);
        }
    }
}

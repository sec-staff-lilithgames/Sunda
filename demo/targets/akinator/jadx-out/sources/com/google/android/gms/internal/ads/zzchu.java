package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzchu extends FrameLayout implements zzcgy {
    private final zzcgy zza;
    private final zzcdg zzb;
    private final AtomicBoolean zzc;

    /* JADX WARN: Multi-variable type inference failed */
    public zzchu(zzcgy zzcgyVar, zzdvi zzdviVar) {
        super(zzcgyVar.getContext());
        this.zzc = new AtomicBoolean();
        this.zza = zzcgyVar;
        this.zzb = new zzcdg(zzcgyVar.zzK(), this, this, zzdviVar);
        addView((View) zzcgyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean canGoBack() {
        return this.zza.canGoBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void destroy() {
        final zzehd zzehdVarZzV;
        final zzehf zzehfVarZzU = zzU();
        if (zzehfVarZzU != null) {
            zzfuz zzfuzVar = com.google.android.gms.ads.internal.util.zzs.zza;
            zzfuzVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcht
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.internal.zzt.zzu().zzf(zzehfVarZzU.zza());
                }
            });
            final zzcgy zzcgyVar = this.zza;
            Objects.requireNonNull(zzcgyVar);
            zzfuzVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcgyVar.destroy();
                }
            }, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfQ)).intValue());
            return;
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfS)).booleanValue() || (zzehdVarZzV = zzV()) == null) {
            this.zza.destroy();
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchr
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    final zzchu zzchuVar = this.zza;
                    zzehdVarZzV.zze(new zzfpf() { // from class: com.google.android.gms.internal.ads.zzchs
                        @Override // com.google.android.gms.internal.ads.zzfpf
                        public final /* synthetic */ void zza(boolean z10) {
                            zzchuVar.zzaM(true);
                        }
                    });
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void goBack() {
        this.zza.goBack();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void loadData(String str, String str2, String str3) {
        this.zza.loadData(str, "text/html", str3);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.zza.loadDataWithBaseURL(str, str2, "text/html", C.UTF8_NAME, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void loadUrl(String str) {
        this.zza.loadUrl(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar != null) {
            zzcgyVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void onPause() {
        this.zzb.zze();
        this.zza.onPause();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void onResume() {
        this.zza.onResume();
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgy
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.zza.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcgy
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.zza.setOnTouchListener(onTouchListener);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.zza.setWebChromeClient(webChromeClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.zza.setWebViewClient(webViewClient);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcgp
    public final zzffu zzC() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final WebView zzD() {
        return (WebView) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final List zzF() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.zza) {
                arrayList.add(childAt);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzG() {
        this.zza.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzH(int i10) {
        this.zza.zzH(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzI() {
        this.zza.zzI();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzJ() {
        this.zza.zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final Context zzK() {
        return this.zza.zzK();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final com.google.android.gms.ads.internal.overlay.zzm zzL() {
        return this.zza.zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final com.google.android.gms.ads.internal.overlay.zzm zzM() {
        return this.zza.zzM();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzciq
    public final zzcji zzN() {
        return this.zza.zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final String zzO() {
        return this.zza.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final zzciw zzP() {
        return ((zzcib) this.zza).zzaS();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final WebViewClient zzQ() {
        return this.zza.zzQ();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean zzR() {
        return this.zza.zzR();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcir
    public final zzaxa zzS() {
        return this.zza.zzS();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final zzfgr zzT() {
        return this.zza.zzT();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final zzehf zzU() {
        return this.zza.zzU();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final zzehd zzV() {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean zzW() {
        return this.zza.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean zzX() {
        return this.zza.zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzY() {
        this.zzb.zzf();
        this.zza.zzY();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean zzZ() {
        return this.zza.zzZ();
    }

    @Override // com.google.android.gms.internal.ads.zzbpf
    public final void zza(String str) {
        ((zzcib) this.zza).zzaP(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean zzaA(boolean z10, int i10) {
        if (!this.zzc.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzbd)).booleanValue()) {
            return false;
        }
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzcgyVar.getParent()).removeView((View) zzcgyVar);
        }
        zzcgyVar.zzaA(z10, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean zzaB() {
        return this.zzc.get();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcif
    public final zzffx zzaC() {
        return this.zza.zzaC();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaD(zzffu zzffuVar, zzffx zzffxVar) {
        this.zza.zzaD(zzffuVar, zzffxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaE(boolean z10) {
        this.zza.zzaE(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final n1 zzaF() {
        return this.zza.zzaF();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaG(boolean z10) {
        this.zza.zzaG(true);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzaH(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        this.zza.zzaH(zzcVar, z10, z11, str);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzaI(boolean z10, int i10, boolean z11) {
        this.zza.zzaI(z10, i10, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzaJ(boolean z10, int i10, String str, boolean z11, boolean z12) {
        this.zza.zzaJ(z10, i10, str, z11, z12);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzaK(boolean z10, int i10, String str, String str2, boolean z11) {
        this.zza.zzaK(z10, i10, str, str2, z11);
    }

    @Override // com.google.android.gms.internal.ads.zzcio
    public final void zzaL(String str, String str2, int i10) {
        this.zza.zzaL(str, str2, 14);
    }

    public final /* synthetic */ void zzaM(boolean z10) {
        final zzcgy zzcgyVar = this.zza;
        zzfuz zzfuzVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcgyVar);
        zzfuzVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzchp
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzcgyVar.destroy();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final boolean zzaa() {
        return this.zza.zzaa();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzab(String str, zzblx zzblxVar) {
        this.zza.zzab(str, zzblxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzac(String str, zzblx zzblxVar) {
        this.zza.zzac(str, zzblxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzad(String str, Predicate predicate) {
        this.zza.zzad(str, predicate);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzae(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzae(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaf(zzcji zzcjiVar) {
        this.zza.zzaf(zzcjiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzag(boolean z10) {
        this.zza.zzag(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzah() {
        this.zza.zzah();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzai(Context context) {
        this.zza.zzai(context);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaj(boolean z10) {
        this.zza.zzaj(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzak(zzehf zzehfVar) {
        this.zza.zzak(zzehfVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzal(zzehd zzehdVar) {
        this.zza.zzal(zzehdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzam(int i10) {
        this.zza.zzam(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzan(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        this.zza.zzan(zzmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzao(boolean z10) {
        this.zza.zzao(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzap() {
        this.zza.zzap();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaq(zzbhv zzbhvVar) {
        this.zza.zzaq(zzbhvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final zzbhv zzar() {
        return this.zza.zzar();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzas(boolean z10) {
        this.zza.zzas(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzat() {
        setBackgroundColor(0);
        this.zza.setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzau(String str, String str2, String str3) {
        this.zza.zzau(str, str2, null);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzav() {
        zzehf zzehfVarZzU;
        zzehd zzehdVarZzV;
        TextView textView = new TextView(getContext());
        com.google.android.gms.ads.internal.zzt.zzc();
        textView.setText(com.google.android.gms.ads.internal.util.zzs.zzC());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfS)).booleanValue() && (zzehdVarZzV = zzV()) != null) {
            zzehdVarZzV.zzf(textView);
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzfR)).booleanValue() && (zzehfVarZzU = zzU()) != null && zzehfVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzehfVarZzU.zza(), textView);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzaw(boolean z10) {
        this.zza.zzaw(z10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzax(zzbhs zzbhsVar) {
        this.zza.zzax(zzbhsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final void zzay(zzbch zzbchVar) {
        this.zza.zzay(zzbchVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy
    public final zzbch zzaz() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbpf
    public final void zzb(String str, JSONObject jSONObject) {
        ((zzcib) this.zza).zzc(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzbpf
    public final void zzc(String str, String str2) {
        this.zza.zzc("window.inspectorInfo", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    public final void zzd(String str, JSONObject jSONObject) {
        this.zza.zzd(str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdV() {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar != null) {
            zzcgyVar.zzdV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbau
    public final void zzdo(zzbat zzbatVar) {
        this.zza.zzdo(zzbatVar);
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdp() {
        this.zza.zzdp();
    }

    @Override // com.google.android.gms.ads.internal.zzn
    public final void zzdq() {
        this.zza.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final zzcdg zzdr() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzds(boolean z10) {
        this.zza.zzds(false);
    }

    @Override // com.google.android.gms.internal.ads.zzdgv
    public final void zzdz() {
        zzcgy zzcgyVar = this.zza;
        if (zzcgyVar != null) {
            zzcgyVar.zzdz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbot
    public final void zze(String str, Map map) {
        this.zza.zze(str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcdr
    public final zzcie zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final zzbfg zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcik, com.google.android.gms.internal.ads.zzcdr
    public final Activity zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcdr
    public final com.google.android.gms.ads.internal.zza zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzl() {
        this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final String zzm() {
        return this.zza.zzm();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final String zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzo(int i10) {
        this.zza.zzo(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final int zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcdr
    public final zzbfh zzq() {
        return this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final zzcfe zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcis, com.google.android.gms.internal.ads.zzcdr
    public final VersionInfoParcel zzs() {
        return this.zza.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcdr
    public final void zzt(String str, zzcfe zzcfeVar) {
        this.zza.zzt(str, zzcfeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzu(boolean z10, long j10) {
        this.zza.zzu(z10, j10);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzv(int i10) {
        this.zzb.zzg(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcdr
    public final void zzw(zzcie zzcieVar) {
        this.zza.zzw(zzcieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final int zzx() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzet)).booleanValue() ? this.zza.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final int zzy() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzet)).booleanValue() ? this.zza.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzz() {
        this.zza.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzcgy, com.google.android.gms.internal.ads.zzcit
    public final View zzE() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzA(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.zzcdr
    public final void zzB(int i10) {
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import com.amazon.device.ads.DTBMetricReport;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.ironsource.C3191e4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcdf extends FrameLayout implements zzccw {
    final zzcdt zza;
    private final zzcdr zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbfj zze;
    private final long zzf;
    private final zzccx zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcdf(Context context, zzcdr zzcdrVar, int i10, boolean z10, zzbfj zzbfjVar, zzcdq zzcdqVar, zzdvi zzdviVar) {
        zzccx zzccvVar;
        zzbfj zzbfjVar2;
        zzccx zzcgnVar;
        super(context);
        this.zzb = zzcdrVar;
        this.zze = zzbfjVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcdrVar.zzk());
        zzccy zzccyVar = zzcdrVar.zzk().zza;
        zzcds zzcdsVar = new zzcds(context, zzcdrVar.zzs(), zzcdrVar.zzm(), zzbfjVar, zzcdrVar.zzi());
        if (i10 == 3) {
            zzcgnVar = new zzcgn(context, zzcdsVar);
            zzbfjVar2 = zzbfjVar;
        } else {
            if (i10 == 2) {
                zzccvVar = new zzcej(context, zzcdsVar, zzcdrVar, z10, zzccy.zza(zzcdrVar), zzcdqVar, zzdviVar);
                zzbfjVar2 = zzbfjVar;
            } else {
                zzbfjVar2 = zzbfjVar;
                zzccvVar = new zzccv(context, zzcdrVar, z10, zzccy.zza(zzcdrVar), zzcdqVar, new zzcds(context, zzcdrVar.zzs(), zzcdrVar.zzm(), zzbfjVar, zzcdrVar.zzi()), zzdviVar);
            }
            zzcgnVar = zzccvVar;
        }
        this.zzg = zzcgnVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcgnVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaa)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzX)).booleanValue()) {
            zzD();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzac)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzZ)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbfjVar2 != null) {
            zzbfjVar2.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzcdt(this);
        zzcgnVar.zzb(this);
    }

    private final boolean zzJ() {
        return this.zzq.getParent() != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzI(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zze("onVideoEvent", map);
    }

    private final void zzL() {
        zzcdr zzcdrVar = this.zzb;
        if (zzcdrVar.zzj() == null || !this.zzi || this.zzj) {
            return;
        }
        zzcdrVar.zzj().getWindow().clearFlags(128);
        this.zzi = false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzccx zzccxVar = this.zzg;
            if (zzccxVar != null) {
                zzcbv.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdc
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        zzccxVar.zzd();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcde
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzG(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzccw
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcdb(this, z10));
    }

    public final void zzA(int i10) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzB(i10);
    }

    public final void zzB(int i10) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzC(i10);
    }

    public final void zzC(MotionEvent motionEvent) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzD() {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        TextView textView = new TextView(zzccxVar.getContext());
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        textView.setText(String.valueOf(resourcesZzf == null ? "AdMob - " : resourcesZzf.getString(R.string.watermark_label_prefix)).concat(zzccxVar.zza()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        FrameLayout frameLayout = this.zzc;
        frameLayout.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        frameLayout.bringChildToFront(textView);
    }

    public final void zzE() {
        this.zza.zza();
        zzccx zzccxVar = this.zzg;
        if (zzccxVar != null) {
            zzccxVar.zzd();
        }
        zzL();
    }

    public final void zzF() {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        long jZzh = zzccxVar.zzh();
        if (this.zzl == jZzh || jZzh <= 0) {
            return;
        }
        float f10 = jZzh / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzch)).booleanValue()) {
            zzI("timeupdate", DTBMetricReport.TIME, String.valueOf(f10), "totalBytes", String.valueOf(zzccxVar.zzo()), "qoeCachedBytes", String.valueOf(zzccxVar.zzn()), "qoeLoadedBytes", String.valueOf(zzccxVar.zzm()), "droppedFrames", String.valueOf(zzccxVar.zzp()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
        } else {
            zzI("timeupdate", DTBMetricReport.TIME, String.valueOf(f10));
        }
        this.zzl = jZzh;
    }

    public final /* synthetic */ void zzG(boolean z10) {
        zzI("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
    }

    public final /* synthetic */ void zzH() {
        zzI("firstFrameRendered", new String[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zza() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzccz(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzb() {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar != null && this.zzm == 0) {
            zzI("canplaythrough", IronSourceConstants.EVENTS_DURATION, String.valueOf(zzccxVar.zzg() / 1000.0f), "videoWidth", String.valueOf(zzccxVar.zzk()), "videoHeight", String.valueOf(zzccxVar.zzl()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzc() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcj)).booleanValue()) {
            this.zza.zzb();
        }
        zzcdr zzcdrVar = this.zzb;
        if (zzcdrVar.zzj() != null && !this.zzi) {
            boolean z10 = (zzcdrVar.zzj().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z10;
            if (!z10) {
                zzcdrVar.zzj().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzd() {
        zzI(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        zzL();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcj)).booleanValue()) {
            this.zza.zza();
        }
        zzI(C3191e4.h.f36484g0, new String[0]);
        zzL();
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzf(String str, String str2) {
        zzI("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzg(String str, String str2) {
        zzI("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzh() {
        if (this.zzr && this.zzp != null && !zzJ()) {
            ImageView imageView = this.zzq;
            imageView.setImageBitmap(this.zzp);
            imageView.invalidate();
            FrameLayout frameLayout = this.zzc;
            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(imageView);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcda(this));
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzi() {
        if (this.zzh && zzJ()) {
            this.zzc.removeView(this.zzq);
        }
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        if (zzccxVar.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 26);
            sb2.append("Spinner frame grab took ");
            sb2.append(jElapsedRealtime2);
            sb2.append("ms");
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbfj zzbfjVar = this.zze;
            if (zzbfjVar != null) {
                zzbfjVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbel zzbelVar = zzbeu.zzab;
            int iMax = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).intValue(), 1);
            int iMax2 = Math.max(i11 / ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzccw
    public final void zzk() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzH();
            }
        });
    }

    public final Integer zzl() {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar != null) {
            return zzccxVar.zzw();
        }
        return null;
    }

    public final void zzm(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzaa)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzn(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            int length = String.valueOf(i10).length();
            StringBuilder sb2 = new StringBuilder(length + 25 + String.valueOf(i11).length() + 3 + String.valueOf(i12).length() + 3 + String.valueOf(i13).length());
            com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i10, i11, "Set video bounds to x:", ";y:", sb2);
            sb2.append(";w:");
            sb2.append(i12);
            sb2.append(";h:");
            sb2.append(i13);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
        }
        if (i12 == 0 || i13 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
        layoutParams.setMargins(i10, i11, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzo(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzp(float f10, float f11) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar != null) {
            zzccxVar.zzj(f10, f11);
        }
    }

    public final void zzq(Integer num) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzI("no_src", new String[0]);
        } else {
            zzccxVar.zzx(this.zzn, this.zzo, num);
        }
    }

    public final void zzr() {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzf();
    }

    public final void zzs() {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zze();
    }

    public final void zzt(int i10) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzi(i10);
    }

    public final void zzu() {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzb.zza(true);
        zzccxVar.zzq();
    }

    public final void zzv() {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzb.zza(false);
        zzccxVar.zzq();
    }

    public final void zzw(float f10) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzb.zzb(f10);
        zzccxVar.zzq();
    }

    public final void zzx(int i10) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzy(i10);
    }

    public final void zzy(int i10) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzz(i10);
    }

    public final void zzz(int i10) {
        zzccx zzccxVar = this.zzg;
        if (zzccxVar == null) {
            return;
        }
        zzccxVar.zzA(i10);
    }
}

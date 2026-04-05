package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.amazon.device.ads.MraidResizeCommand;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.ads.BuildConfig;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbuh extends zzbun {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcgy zzj;
    private final Activity zzk;
    private zzcji zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbuo zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf(C3191e4.e.f36430c, C3191e4.e.f36429b, "top-center", TtmlNode.CENTER, C3191e4.e.f36432e, C3191e4.e.f36431d, "bottom-center");
    }

    public zzbuh(zzcgy zzcgyVar, zzbuo zzbuoVar) {
        super(zzcgyVar, MraidResizeCommand.NAME);
        this.zza = C3191e4.e.f36429b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcgyVar;
        this.zzk = zzcgyVar.zzj();
        this.zzo = zzbuoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z10) throws JSONException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlQ)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlR)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlS)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcgy zzcgyVar = this.zzj;
                    viewGroup2.addView((View) zzcgyVar);
                    zzcgyVar.zzaf(this.zzl);
                } catch (IllegalStateException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e10);
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcgy zzcgyVar2 = this.zzj;
                viewGroup3.addView((View) zzcgyVar2);
                zzcgyVar2.zzaf(this.zzl);
            }
        }
        if (z10) {
            zzk(BuildConfig.FLAVOR);
            zzbuo zzbuoVar = this.zzo;
            if (zzbuoVar != null) {
                zzbuoVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024f A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0122, B:63:0x0130, B:123:0x024f, B:124:0x0254, B:126:0x0256, B:128:0x0273, B:130:0x027f, B:132:0x02b6, B:138:0x032a, B:161:0x0381, B:162:0x0399, B:163:0x03b6, B:165:0x03be, B:166:0x03c5, B:167:0x03ec, B:170:0x03ef, B:172:0x041d, B:173:0x042f, B:142:0x0339, B:146:0x0348, B:150:0x0357, B:154:0x0366, B:159:0x0377, B:160:0x037b, B:131:0x02b3, B:175:0x0431, B:176:0x0436, B:65:0x013c, B:67:0x0140, B:73:0x0159, B:74:0x0164, B:99:0x01df, B:101:0x01e3, B:103:0x01e7, B:106:0x01ef, B:78:0x0171, B:84:0x0194, B:83:0x018a, B:88:0x019f, B:92:0x01af, B:96:0x01bf, B:97:0x01d2, B:107:0x01fe, B:113:0x0226, B:119:0x0236, B:116:0x022c, B:118:0x0234, B:110:0x021e, B:112:0x0224, B:120:0x023b, B:121:0x0244, B:178:0x0438, B:179:0x043d, B:181:0x043f, B:182:0x0444), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0256 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0122, B:63:0x0130, B:123:0x024f, B:124:0x0254, B:126:0x0256, B:128:0x0273, B:130:0x027f, B:132:0x02b6, B:138:0x032a, B:161:0x0381, B:162:0x0399, B:163:0x03b6, B:165:0x03be, B:166:0x03c5, B:167:0x03ec, B:170:0x03ef, B:172:0x041d, B:173:0x042f, B:142:0x0339, B:146:0x0348, B:150:0x0357, B:154:0x0366, B:159:0x0377, B:160:0x037b, B:131:0x02b3, B:175:0x0431, B:176:0x0436, B:65:0x013c, B:67:0x0140, B:73:0x0159, B:74:0x0164, B:99:0x01df, B:101:0x01e3, B:103:0x01e7, B:106:0x01ef, B:78:0x0171, B:84:0x0194, B:83:0x018a, B:88:0x019f, B:92:0x01af, B:96:0x01bf, B:97:0x01d2, B:107:0x01fe, B:113:0x0226, B:119:0x0236, B:116:0x022c, B:118:0x0234, B:110:0x021e, B:112:0x0224, B:120:0x023b, B:121:0x0244, B:178:0x0438, B:179:0x043d, B:181:0x043f, B:182:0x0444), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x037b A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0122, B:63:0x0130, B:123:0x024f, B:124:0x0254, B:126:0x0256, B:128:0x0273, B:130:0x027f, B:132:0x02b6, B:138:0x032a, B:161:0x0381, B:162:0x0399, B:163:0x03b6, B:165:0x03be, B:166:0x03c5, B:167:0x03ec, B:170:0x03ef, B:172:0x041d, B:173:0x042f, B:142:0x0339, B:146:0x0348, B:150:0x0357, B:154:0x0366, B:159:0x0377, B:160:0x037b, B:131:0x02b3, B:175:0x0431, B:176:0x0436, B:65:0x013c, B:67:0x0140, B:73:0x0159, B:74:0x0164, B:99:0x01df, B:101:0x01e3, B:103:0x01e7, B:106:0x01ef, B:78:0x0171, B:84:0x0194, B:83:0x018a, B:88:0x019f, B:92:0x01af, B:96:0x01bf, B:97:0x01d2, B:107:0x01fe, B:113:0x0226, B:119:0x0236, B:116:0x022c, B:118:0x0234, B:110:0x021e, B:112:0x0224, B:120:0x023b, B:121:0x0244, B:178:0x0438, B:179:0x043d, B:181:0x043f, B:182:0x0444), top: B:186:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d2 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:11:0x0017, B:13:0x001f, B:14:0x0024, B:16:0x0026, B:18:0x0030, B:19:0x0035, B:21:0x0037, B:23:0x003d, B:24:0x0042, B:26:0x0044, B:28:0x0052, B:29:0x0063, B:31:0x0071, B:32:0x0082, B:34:0x0090, B:35:0x00a1, B:37:0x00af, B:38:0x00c0, B:40:0x00ce, B:41:0x00dc, B:43:0x00ea, B:44:0x00ec, B:46:0x00f0, B:48:0x00f4, B:50:0x00fa, B:53:0x0102, B:57:0x0122, B:63:0x0130, B:123:0x024f, B:124:0x0254, B:126:0x0256, B:128:0x0273, B:130:0x027f, B:132:0x02b6, B:138:0x032a, B:161:0x0381, B:162:0x0399, B:163:0x03b6, B:165:0x03be, B:166:0x03c5, B:167:0x03ec, B:170:0x03ef, B:172:0x041d, B:173:0x042f, B:142:0x0339, B:146:0x0348, B:150:0x0357, B:154:0x0366, B:159:0x0377, B:160:0x037b, B:131:0x02b3, B:175:0x0431, B:176:0x0436, B:65:0x013c, B:67:0x0140, B:73:0x0159, B:74:0x0164, B:99:0x01df, B:101:0x01e3, B:103:0x01e7, B:106:0x01ef, B:78:0x0171, B:84:0x0194, B:83:0x018a, B:88:0x019f, B:92:0x01af, B:96:0x01bf, B:97:0x01d2, B:107:0x01fe, B:113:0x0226, B:119:0x0236, B:116:0x022c, B:118:0x0234, B:110:0x021e, B:112:0x0224, B:120:0x023b, B:121:0x0244, B:178:0x0438, B:179:0x043d, B:181:0x043f, B:182:0x0444), top: B:186:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbuh.zza(java.util.Map):void");
    }

    public final void zzb(final boolean z10) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzlP)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzf(z10);
                    } else {
                        zzcbv.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbug
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() throws JSONException {
                                this.zza.zzf(z10);
                            }
                        });
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzc(int i10, int i11, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zzi) {
            z10 = this.zzp != null;
        }
        return z10;
    }

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }
}

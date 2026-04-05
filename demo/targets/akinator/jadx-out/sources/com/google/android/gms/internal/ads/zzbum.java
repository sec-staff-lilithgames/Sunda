package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbum extends zzbun implements zzblx {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcgy zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbeb zzk;
    private float zzl;
    private int zzm;

    public zzbum(zzcgy zzcgyVar, Context context, zzbeb zzbebVar) {
        super(zzcgyVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcgyVar;
        this.zzi = context;
        this.zzk = zzbebVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* synthetic */ void zza(Object obj, Map map) throws JSONException {
        JSONObject jSONObjectPut;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzbb.zza();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = com.google.android.gms.ads.internal.util.client.zzf.zzA(displayMetrics2, displayMetrics2.heightPixels);
        zzcgy zzcgyVar = this.zzh;
        Activity activityZzj = zzcgyVar.zzj();
        if (activityZzj == null || activityZzj.getWindow() == null) {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            int[] iArrZzW = com.google.android.gms.ads.internal.util.zzs.zzW(activityZzj);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zzd = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzW[0]);
            com.google.android.gms.ads.internal.client.zzbb.zza();
            this.zze = com.google.android.gms.ads.internal.util.client.zzf.zzA(this.zza, iArrZzW[1]);
        }
        if (zzcgyVar.zzN().zzg()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            zzcgyVar.measure(0, 0);
        }
        zzl(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbul zzbulVar = new zzbul();
        zzbeb zzbebVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbulVar.zzb(zzbebVar.zzc(intent));
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbulVar.zza(zzbebVar.zzc(intent2));
        zzbulVar.zzc(zzbebVar.zzb());
        zzbulVar.zzd(zzbebVar.zza());
        zzbulVar.zze(true);
        boolean zZzf = zzbulVar.zzf();
        boolean zZzg = zzbulVar.zzg();
        boolean zZzh = zzbulVar.zzh();
        boolean zZzi = zzbulVar.zzi();
        try {
            jSONObjectPut = new JSONObject().put("sms", zZzf).put("tel", zZzg).put("calendar", zZzh).put("storePicture", zZzi).put("inlineVideo", zzbulVar.zzj());
        } catch (JSONException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error occurred while obtaining the MRAID capabilities.", e10);
            jSONObjectPut = null;
        }
        zzcgyVar.zzd("onDeviceFeaturesReceived", jSONObjectPut);
        int[] iArr = new int[2];
        zzcgyVar.getLocationOnScreen(iArr);
        Context context = this.zzi;
        zzb(com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[0]), com.google.android.gms.ads.internal.client.zzbb.zza().zza(context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(2)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Dispatching Ready Event.");
        }
        zzh(zzcgyVar.zzs().afmaVersion);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060 A[PHI: r4
      0x0060: PHI (r4v2 int) = (r4v1 int), (r4v6 int) binds: [B:11:0x003f, B:17:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzb(int r9, int r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.zzi
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto L14
            com.google.android.gms.ads.internal.zzt.zzc()
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            int[] r1 = com.google.android.gms.ads.internal.util.zzs.zzX(r1)
            r1 = r1[r2]
            goto L15
        L14:
            r1 = r2
        L15:
            com.google.android.gms.internal.ads.zzcgy r3 = r8.zzh
            com.google.android.gms.internal.ads.zzcji r4 = r3.zzN()
            if (r4 == 0) goto L27
            com.google.android.gms.internal.ads.zzcji r4 = r3.zzN()
            boolean r4 = r4.zzg()
            if (r4 != 0) goto L75
        L27:
            int r4 = r3.getWidth()
            int r5 = r3.getHeight()
            com.google.android.gms.internal.ads.zzbel r6 = com.google.android.gms.internal.ads.zzbeu.zzal
            com.google.android.gms.internal.ads.zzbes r7 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r6 = r7.zzd(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L60
            if (r4 != 0) goto L51
            com.google.android.gms.internal.ads.zzcji r4 = r3.zzN()
            if (r4 == 0) goto L50
            com.google.android.gms.internal.ads.zzcji r4 = r3.zzN()
            int r4 = r4.zzb
            goto L51
        L50:
            r4 = r2
        L51:
            if (r5 != 0) goto L60
            com.google.android.gms.internal.ads.zzcji r5 = r3.zzN()
            if (r5 == 0) goto L61
            com.google.android.gms.internal.ads.zzcji r2 = r3.zzN()
            int r2 = r2.zza
            goto L61
        L60:
            r2 = r5
        L61:
            com.google.android.gms.ads.internal.util.client.zzf r5 = com.google.android.gms.ads.internal.client.zzbb.zza()
            int r4 = r5.zza(r0, r4)
            r8.zzf = r4
            com.google.android.gms.ads.internal.util.client.zzf r4 = com.google.android.gms.ads.internal.client.zzbb.zza()
            int r0 = r4.zza(r0, r2)
            r8.zzg = r0
        L75:
            int r0 = r10 - r1
            int r1 = r8.zzf
            int r2 = r8.zzg
            r8.zzj(r9, r0, r1, r2)
            com.google.android.gms.internal.ads.zzciw r0 = r3.zzP()
            r0.zzN(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbum.zzb(int, int):void");
    }
}

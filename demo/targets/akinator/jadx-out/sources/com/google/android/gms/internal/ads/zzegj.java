package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.customtabs.e;
import androidx.core.app.NotificationCompat;
import b0.e2;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.NotificationHandlerActivity;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import k3.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzegj extends zzbva {
    final Map zza = new HashMap();
    private final Context zzb;
    private final zzdvi zzc;
    private final com.google.android.gms.ads.internal.util.client.zzu zzd;
    private final zzefy zze;
    private String zzf;
    private String zzg;

    public zzegj(Context context, zzefy zzefyVar, com.google.android.gms.ads.internal.util.client.zzu zzuVar, zzdvi zzdviVar) {
        this.zzb = context;
        this.zzc = zzdviVar;
        this.zzd = zzuVar;
        this.zze = zzefyVar;
    }

    public static void zzd(Context context, zzdvi zzdviVar, zzefy zzefyVar, String str, String str2) {
        zzk(context, zzdviVar, zzefyVar, str, str2, new HashMap());
    }

    public static void zzk(Context context, zzdvi zzdviVar, zzefy zzefyVar, String str, String str2, Map map) {
        String strZzg;
        String str3 = true != com.google.android.gms.ads.internal.zzt.zzh().zzs(context) ? "offline" : e.ONLINE_EXTRAS_KEY;
        if (zzdviVar != null) {
            zzdvh zzdvhVarZza = zzdviVar.zza();
            zzdvhVarZza.zzc("gqi", str);
            zzdvhVarZza.zzc("action", str2);
            zzdvhVarZza.zzc("device_connectivity", str3);
            zzdvhVarZza.zzc("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()));
            for (Map.Entry entry : map.entrySet()) {
                zzdvhVarZza.zzc((String) entry.getKey(), (String) entry.getValue());
            }
            strZzg = zzdvhVarZza.zzg();
        } else {
            strZzg = "";
        }
        zzefyVar.zze(new zzega(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis(), str, strZzg, 2));
    }

    public static final PendingIntent zzr(Context context, String str, String str2, String str3) {
        Intent intent = new Intent();
        intent.setAction(str);
        intent.putExtra("offline_notification_action", str);
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str3);
        if (Build.VERSION.SDK_INT < 29 || !str.equals("offline_notification_clicked")) {
            intent.setClassName(context, AdService.CLASS_NAME);
            return zzgjf.zzb(context, 0, intent, 1140850688, 0);
        }
        intent.setClassName(context, NotificationHandlerActivity.CLASS_NAME);
        return zzgjf.zza(context, 0, intent, 201326592);
    }

    private final void zzs(final Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        com.google.android.gms.ads.internal.zzt.zzc();
        if (r0.from(activity).areNotificationsEnabled()) {
            zzt();
            zzu(activity, zzmVar);
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 12345);
                zzw(this.zzf, "asnpdi", zzgph.zza());
                return;
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(activity);
            builderZzO.setTitle(zzx(R.string.notifications_permission_title, "Allow app to send you notifications?")).setPositiveButton(zzx(R.string.notifications_permission_confirm, "Allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzege
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                    this.zza.zzo(activity, zzmVar, dialogInterface, i10);
                }
            }).setNegativeButton(zzx(R.string.notifications_permission_decline, "Don't allow"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegf
                @Override // android.content.DialogInterface.OnClickListener
                public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i10) {
                    this.zza.zzp(zzmVar, dialogInterface, i10);
                }
            }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegg
                @Override // android.content.DialogInterface.OnCancelListener
                public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                    this.zza.zzq(zzmVar, dialogInterface);
                }
            });
            builderZzO.create().show();
            zzw(this.zzf, "rtsdi", zzgph.zza());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zzt() throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            r7 = this;
            com.google.android.gms.ads.internal.zzt.zzc()     // Catch: android.os.RemoteException -> L20
            android.content.Context r0 = r7.zzb     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.ads.internal.util.zzbo r1 = com.google.android.gms.ads.internal.util.zzs.zzD(r0)     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.dynamic.IObjectWrapper r2 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.ads.internal.offline.buffering.zza r3 = new com.google.android.gms.ads.internal.offline.buffering.zza     // Catch: android.os.RemoteException -> L20
            java.lang.String r4 = r7.zzg     // Catch: android.os.RemoteException -> L20
            java.lang.String r5 = r7.zzf     // Catch: android.os.RemoteException -> L20
            java.util.Map r6 = r7.zza     // Catch: android.os.RemoteException -> L20
            java.lang.Object r6 = r6.get(r5)     // Catch: android.os.RemoteException -> L20
            com.google.android.gms.internal.ads.zzefq r6 = (com.google.android.gms.internal.ads.zzefq) r6     // Catch: android.os.RemoteException -> L20
            if (r6 != 0) goto L22
            java.lang.String r6 = ""
            goto L26
        L20:
            r0 = move-exception
            goto L40
        L22:
            java.lang.String r6 = r6.zzb()     // Catch: android.os.RemoteException -> L20
        L26:
            r3.<init>(r4, r5, r6)     // Catch: android.os.RemoteException -> L20
            boolean r2 = r1.zzg(r2, r3)     // Catch: android.os.RemoteException -> L20
            if (r2 != 0) goto L3e
            com.google.android.gms.dynamic.IObjectWrapper r0 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r0)     // Catch: android.os.RemoteException -> L3c
            java.lang.String r3 = r7.zzg     // Catch: android.os.RemoteException -> L3c
            java.lang.String r4 = r7.zzf     // Catch: android.os.RemoteException -> L3c
            boolean r0 = r1.zze(r0, r3, r4)     // Catch: android.os.RemoteException -> L3c
            goto L49
        L3c:
            r0 = move-exception
            goto L41
        L3e:
            r0 = 1
            goto L49
        L40:
            r2 = 0
        L41:
            int r1 = com.google.android.gms.ads.internal.util.zze.zza
            java.lang.String r1 = "Failed to schedule offline notification poster."
            com.google.android.gms.ads.internal.util.client.zzo.zzg(r1, r0)
            r0 = r2
        L49:
            if (r0 != 0) goto L5d
            com.google.android.gms.internal.ads.zzefy r0 = r7.zze
            java.lang.String r1 = r7.zzf
            r0.zzd(r1)
            java.lang.String r0 = r7.zzf
            java.lang.String r1 = "offline_notification_worker_not_scheduled"
            com.google.android.gms.internal.ads.zzgph r2 = com.google.android.gms.internal.ads.zzgph.zza()
            r7.zzw(r0, r1, r2)
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegj.zzt():void");
    }

    private final void zzu(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        AlertDialog alertDialogZzv = zzv(activity, zzmVar);
        alertDialogZzv.show();
        Timer timer = new Timer();
        timer.schedule(new zzegb(this, alertDialogZzv, timer, zzmVar), 3000L);
    }

    private final AlertDialog zzv(Activity activity, final com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder onCancelListener = com.google.android.gms.ads.internal.util.zzs.zzO(activity).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegh
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                com.google.android.gms.ads.internal.overlay.zzm zzmVar2 = zzmVar;
                if (zzmVar2 != null) {
                    zzmVar2.zzb();
                }
            }
        });
        XmlResourceParser xmlResourceParserZzy = zzy(R.layout.offline_ads_dialog);
        if (xmlResourceParserZzy == null) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
        try {
            View viewInflate = activity.getLayoutInflater().inflate(xmlResourceParserZzy, (ViewGroup) null);
            onCancelListener.setView(viewInflate);
            String strZzz = zzz();
            if (!TextUtils.isEmpty(strZzz)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.offline_dialog_advertiser_name);
                textView.setVisibility(0);
                textView.setText(strZzz);
            }
            zzefq zzefqVar = (zzefq) this.zza.get(this.zzf);
            Drawable drawableZzc = zzefqVar != null ? zzefqVar.zzc() : null;
            if (drawableZzc != null) {
                ((ImageView) viewInflate.findViewById(R.id.offline_dialog_image)).setImageDrawable(drawableZzc);
            }
            AlertDialog alertDialogCreate = onCancelListener.create();
            alertDialogCreate.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            return alertDialogCreate;
        } catch (Resources.NotFoundException unused) {
            onCancelListener.setMessage(zzx(R.string.offline_dialog_text, "Thanks for your interest.\nWe will share more once you're back online."));
            return onCancelListener.create();
        }
    }

    private final void zzw(String str, String str2, Map map) {
        zzk(this.zzb, this.zzc, this.zze, str, str2, map);
    }

    private static String zzx(int i10, String str) {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            return str;
        }
        try {
            return resourcesZzf.getString(i10);
        } catch (Resources.NotFoundException unused) {
            return str;
        }
    }

    private static XmlResourceParser zzy(int i10) {
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        if (resourcesZzf == null) {
            return null;
        }
        try {
            return resourcesZzf.getLayout(i10);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    private final String zzz() {
        zzefq zzefqVar = (zzefq) this.zza.get(this.zzf);
        return zzefqVar == null ? "" : zzefqVar.zza();
    }

    public final void zzc(String str, zzdlq zzdlqVar) {
        String strZzQ = zzdlqVar.zzQ();
        String strZzB = zzdlqVar.zzB();
        String string = "";
        if (TextUtils.isEmpty(strZzQ)) {
            strZzQ = strZzB != null ? strZzB : "";
        }
        zzbii zzbiiVarZzD = zzdlqVar.zzD();
        if (zzbiiVarZzD != null) {
            try {
                string = zzbiiVarZzD.zzc().toString();
            } catch (RemoteException unused) {
            }
        }
        zzbii zzbiiVarZzP = zzdlqVar.zzP();
        Drawable drawable = null;
        if (zzbiiVarZzP != null) {
            try {
                IObjectWrapper iObjectWrapperZzb = zzbiiVarZzP.zzb();
                if (iObjectWrapperZzb != null) {
                    drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapperZzb);
                }
            } catch (RemoteException unused2) {
            }
        }
        this.zza.put(str, new zzefn(strZzQ, string, drawable));
    }

    @Override // com.google.android.gms.internal.ads.zzbvb
    public final void zze(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra != null) {
            if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
                String stringExtra2 = intent.getStringExtra("gws_query_id");
                String stringExtra3 = intent.getStringExtra("uri");
                Context context = this.zzb;
                boolean zZzs = com.google.android.gms.ads.internal.zzt.zzh().zzs(context);
                HashMap map = new HashMap();
                if (stringExtra.equals("offline_notification_clicked")) {
                    map.put("offline_notification_action", "offline_notification_clicked");
                    c = true == zZzs ? (char) 1 : (char) 2;
                    map.put("obvs", String.valueOf(Build.VERSION.SDK_INT));
                    map.put("olaih", String.valueOf(stringExtra3.startsWith("http")));
                    try {
                        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                        if (launchIntentForPackage == null) {
                            launchIntentForPackage = new Intent("android.intent.action.VIEW");
                            launchIntentForPackage.setData(Uri.parse(stringExtra3));
                        }
                        launchIntentForPackage.addFlags(268435456);
                        context.startActivity(launchIntentForPackage);
                        map.put("olaa", "olas");
                    } catch (ActivityNotFoundException unused) {
                        map.put("olaa", "olaf");
                    }
                } else {
                    map.put("offline_notification_action", "offline_notification_dismissed");
                }
                zzw(stringExtra2, "offline_notification_action", map);
                try {
                    SQLiteDatabase writableDatabase = this.zze.getWritableDatabase();
                    if (c == 1) {
                        this.zze.zzb(writableDatabase, this.zzd, stringExtra2);
                    } else {
                        zzefy.zzi(writableDatabase, stringExtra2);
                    }
                } catch (SQLiteException e10) {
                    String strConcat = "Failed to get writable offline buffering database: ".concat(e10.toString());
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzf(strConcat);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvb
    public final void zzf(IObjectWrapper iObjectWrapper, String str, String str2) {
        zzj(iObjectWrapper, new com.google.android.gms.ads.internal.offline.buffering.zza(str, str2, ""));
    }

    @Override // com.google.android.gms.internal.ads.zzbvb
    public final void zzg() {
        final com.google.android.gms.ads.internal.util.client.zzu zzuVar = this.zzd;
        this.zze.zza(new zzfjx() { // from class: com.google.android.gms.internal.ads.zzefw
            @Override // com.google.android.gms.internal.ads.zzfjx
            public final /* synthetic */ Object zza(Object obj) throws Throwable {
                zzefy.zzf(zzuVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbvb
    public final void zzh(IObjectWrapper iObjectWrapper) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzegl zzeglVar = (zzegl) ObjectWrapper.unwrap(iObjectWrapper);
        final Activity activityZza = zzeglVar.zza();
        final com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzeglVar.zzb();
        this.zzf = zzeglVar.zzc();
        this.zzg = zzeglVar.zzd();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjp)).booleanValue()) {
            zzs(activityZza, zzmVarZzb);
            return;
        }
        zzw(this.zzf, "dialog_impression", zzgph.zza());
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(activityZza);
        builderZzO.setTitle(zzx(R.string.offline_opt_in_title, "Open ad when you're back online.")).setMessage(zzx(R.string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.")).setPositiveButton(zzx(R.string.offline_opt_in_confirm, "OK"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegi
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.zza.zzl(activityZza, zzmVarZzb, dialogInterface, i10);
            }
        }).setNegativeButton(zzx(R.string.offline_opt_in_decline, "No thanks"), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzegc
            @Override // android.content.DialogInterface.OnClickListener
            public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i10) {
                this.zza.zzm(zzmVarZzb, dialogInterface, i10);
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.internal.ads.zzegd
            @Override // android.content.DialogInterface.OnCancelListener
            public final /* synthetic */ void onCancel(DialogInterface dialogInterface) {
                this.zza.zzn(zzmVarZzb, dialogInterface);
            }
        });
        builderZzO.create().show();
    }

    @Override // com.google.android.gms.internal.ads.zzbvb
    public final void zzi(String[] strArr, int[] iArr, IObjectWrapper iObjectWrapper) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals("android.permission.POST_NOTIFICATIONS")) {
                zzegl zzeglVar = (zzegl) ObjectWrapper.unwrap(iObjectWrapper);
                Activity activityZza = zzeglVar.zza();
                com.google.android.gms.ads.internal.overlay.zzm zzmVarZzb = zzeglVar.zzb();
                HashMap map = new HashMap();
                if (iArr[i10] == 0) {
                    map.put("dialog_action", "confirm");
                    zzt();
                    zzu(activityZza, zzmVarZzb);
                } else {
                    map.put("dialog_action", "dismiss");
                    if (zzmVarZzb != null) {
                        zzmVarZzb.zzb();
                    }
                }
                zzw(this.zzf, "asnpdc", map);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvb
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.offline.buffering.zza zzaVar) {
        Bitmap bitmapDecodeStream;
        String str;
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        String str2 = zzaVar.zza;
        String str3 = zzaVar.zzb;
        String str4 = zzaVar.zzc;
        String strZzz = zzz();
        com.google.android.gms.ads.internal.zzt.zzf().zzg(context, "offline_notification_channel", "AdMob Offline Notifications");
        PendingIntent pendingIntentZzr = zzr(context, "offline_notification_clicked", str3, str2);
        PendingIntent pendingIntentZzr2 = zzr(context, "offline_notification_dismissed", str3, str2);
        NotificationCompat.d dVar = new NotificationCompat.d(context, "offline_notification_channel");
        if (TextUtils.isEmpty(strZzz)) {
            dVar.setContentTitle(zzx(R.string.offline_notification_title, "You are back online! Let's pick up where we left off"));
        } else {
            dVar.setContentTitle(String.format(zzx(R.string.offline_notification_title_with_advertiser, "You are back online! Continue learning about %s"), strZzz));
        }
        dVar.setAutoCancel(true).setDeleteIntent(pendingIntentZzr2).setContentIntent(pendingIntentZzr).setSmallIcon(context.getApplicationInfo().icon).setPriority(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjq)).intValue());
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzjs)).booleanValue() || str4.isEmpty()) {
            bitmapDecodeStream = null;
        } else {
            try {
                bitmapDecodeStream = BitmapFactory.decodeStream(new URL(str4).openConnection().getInputStream());
            } catch (IOException unused) {
            }
        }
        if (bitmapDecodeStream != null) {
            try {
                dVar.setLargeIcon(bitmapDecodeStream).setStyle(new NotificationCompat.b().bigPicture(bitmapDecodeStream).bigLargeIcon((Bitmap) null));
            } catch (Resources.NotFoundException unused2) {
            }
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        HashMap map = new HashMap();
        try {
            notificationManager.notify(str3, 54321, dVar.build());
            str = "offline_notification_impression";
        } catch (IllegalArgumentException e10) {
            map.put("notification_not_shown_reason", e10.getMessage());
            str = "offline_notification_failed";
        }
        zzw(str3, str, map);
    }

    public final /* synthetic */ void zzl(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzw(this.zzf, "dialog_click", e2.s("dialog_action", "confirm"));
        zzs(activity, zzmVar);
    }

    public final /* synthetic */ void zzm(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzn(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "dialog_click", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzo(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        zzw(this.zzf, "rtsdc", e2.s("dialog_action", "confirm"));
        activity.startActivity(com.google.android.gms.ads.internal.zzt.zzf().zzi(activity));
        zzt();
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzp(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface, int i10) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }

    public final /* synthetic */ void zzq(com.google.android.gms.ads.internal.overlay.zzm zzmVar, DialogInterface dialogInterface) {
        this.zze.zzd(this.zzf);
        HashMap map = new HashMap();
        map.put("dialog_action", "dismiss");
        zzw(this.zzf, "rtsdc", map);
        if (zzmVar != null) {
            zzmVar.zzb();
        }
    }
}

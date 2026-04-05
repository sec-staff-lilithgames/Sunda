package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import bp.oM.DwaEpyvxz;
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbue extends zzbun {
    private final Map zza;
    private final Context zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;
    private final String zzf;
    private final String zzg;

    private final String zzd(String str) {
        Map map = this.zza;
        return TextUtils.isEmpty((CharSequence) map.get(str)) ? "" : (String) map.get(str);
    }

    private final long zze(String str) {
        String str2 = (String) this.zza.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void zza() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbeb(context).zzb()) {
            zzg("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(context);
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        builderZzO.setTitle(resourcesZzf != null ? resourcesZzf.getString(R.string.f28834s5) : "Create calendar event");
        builderZzO.setMessage(resourcesZzf != null ? resourcesZzf.getString(R.string.f28835s6) : "Allow Ad to create a calendar event?");
        builderZzO.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f28832s3) : "Accept", new zzbuc(this));
        builderZzO.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f28833s4) : "Decline", new zzbud(this));
        builderZzO.create().show();
    }

    public final Intent zzb() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzc);
        data.putExtra("eventLocation", this.zzg);
        data.putExtra("description", this.zzf);
        long j10 = this.zzd;
        if (j10 > -1) {
            data.putExtra("beginTime", j10);
        }
        long j11 = this.zze;
        if (j11 > -1) {
            data.putExtra("endTime", j11);
        }
        data.setFlags(268435456);
        return data;
    }

    public final /* synthetic */ Context zzc() {
        return this.zzb;
    }

    public zzbue(zzcgy zzcgyVar, Map map) {
        super(zzcgyVar, "createCalendarEvent");
        this.zza = map;
        this.zzb = zzcgyVar.zzj();
        this.zzc = zzd(DwaEpyvxz.bGONRNQJpXL);
        this.zzf = zzd("summary");
        this.zzd = zze("start_ticks");
        this.zze = zze("end_ticks");
        this.zzg = zzd(DtbConstants.PRIVACY_LOCATION_KEY);
    }
}

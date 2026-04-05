package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.ads.impl.R;
import java.util.Map;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbuk extends zzbun {
    private final Map zza;
    private final Context zzb;

    public zzbuk(zzcgy zzcgyVar, Map map) {
        super(zzcgyVar, "storePicture");
        this.zza = map;
        this.zzb = zzcgyVar.zzj();
    }

    public final void zza() throws JSONException {
        Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new zzbeb(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        String str = (String) this.zza.get("iurl");
        if (TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!URLUtil.isValidUrl(str)) {
            zzg("Invalid image url: ".concat(String.valueOf(str)));
            return;
        }
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzc();
        if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            zzg("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
            return;
        }
        Resources resourcesZzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        com.google.android.gms.ads.internal.zzt.zzc();
        AlertDialog.Builder builderZzO = com.google.android.gms.ads.internal.util.zzs.zzO(context);
        builderZzO.setTitle(resourcesZzf != null ? resourcesZzf.getString(R.string.f28830s1) : "Save image");
        builderZzO.setMessage(resourcesZzf != null ? resourcesZzf.getString(R.string.f28831s2) : "Allow Ad to store image in Picture gallery?");
        builderZzO.setPositiveButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f28832s3) : "Accept", new zzbui(this, str, lastPathSegment));
        builderZzO.setNegativeButton(resourcesZzf != null ? resourcesZzf.getString(R.string.f28833s4) : "Decline", new zzbuj(this));
        builderZzO.create().show();
    }

    public final /* synthetic */ Context zzb() {
        return this.zzb;
    }
}

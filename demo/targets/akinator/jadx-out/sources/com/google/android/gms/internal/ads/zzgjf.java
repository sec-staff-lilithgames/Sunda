package com.google.android.gms.internal.ads;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgjf {
    public static final ClipData zza = ClipData.newIntent("", new Intent());

    public static PendingIntent zza(Context context, int i10, Intent intent, int i11) {
        return PendingIntent.getActivity(context, 0, zzc(intent, 201326592, 0), 201326592);
    }

    public static PendingIntent zzb(Context context, int i10, Intent intent, int i11, int i12) {
        return PendingIntent.getService(context, 0, zzc(intent, 1140850688, 0), 1140850688);
    }

    private static Intent zzc(Intent intent, int i10, int i11) {
        zzgmd.zzb((i10 & 88) == 0, "Cannot set any dangerous parts of intent to be mutable.");
        zzgmd.zzb((i10 & 1) == 0 || zzd(0, 3), "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
        zzgmd.zzb((i10 & 2) == 0 || zzd(0, 5), "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
        zzgmd.zzb((i10 & 4) == 0 || zzd(0, 9), "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
        zzgmd.zzb((i10 & 128) == 0 || zzd(0, 17), "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
        zzgmd.zzb(intent.getComponent() != null, "Must set component on Intent.");
        if (zzd(0, 1)) {
            zzgmd.zzb(!zzd(i10, 67108864), "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
        } else {
            zzgmd.zzb(zzd(i10, 67108864), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
        }
        Intent intent2 = new Intent(intent);
        if (!zzd(i10, 67108864)) {
            if (intent2.getPackage() == null) {
                intent2.setPackage(intent2.getComponent().getPackageName());
            }
            if (!zzd(0, 3) && intent2.getAction() == null) {
                intent2.setAction("");
            }
            if (!zzd(0, 9) && intent2.getCategories() == null) {
                intent2.addCategory("");
            }
            if (!zzd(0, 5) && intent2.getData() == null) {
                intent2.setDataAndType(Uri.EMPTY, "*/*");
            }
            if (!zzd(0, 17) && intent2.getClipData() == null) {
                intent2.setClipData(zza);
            }
        }
        return intent2;
    }

    private static boolean zzd(int i10, int i11) {
        return (i10 & i11) == i11;
    }
}

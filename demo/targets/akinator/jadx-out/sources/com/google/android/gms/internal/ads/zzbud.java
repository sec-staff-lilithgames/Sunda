package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbud implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbue zza;

    public zzbud(zzbue zzbueVar) {
        Objects.requireNonNull(zzbueVar);
        this.zza = zzbueVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) throws JSONException {
        this.zza.zzg("Operation denied by user.");
    }
}

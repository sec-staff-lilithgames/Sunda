package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfpw {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfpb zzfpbVar, String str) {
        zzfpv zzfpvVar;
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (!zza.matcher("Ad overlay").matches()) {
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        List list = this.zzb;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzfpvVar = null;
                break;
            } else {
                zzfpvVar = (zzfpv) it.next();
                if (zzfpvVar.zza().get() == view) {
                    break;
                }
            }
        }
        if (zzfpvVar == null) {
            list.add(new zzfpv(view, zzfpbVar, "Ad overlay"));
        }
    }

    public final void zzc() {
        this.zzb.clear();
    }
}

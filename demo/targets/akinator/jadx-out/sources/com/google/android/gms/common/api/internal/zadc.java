package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zadc {
    public static final Status zaa = new Status(8, "The connection to Google Play services was lost");
    final Set zab = Collections.synchronizedSet(Collections.newSetFromMap(new WeakHashMap()));
    private final zadb zac = new zadb(this);

    public final void zaa(BasePendingResult basePendingResult) {
        this.zab.add(basePendingResult);
        basePendingResult.zan(this.zac);
    }

    public final void zab() {
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.zan(null);
            if (basePendingResult.zam()) {
                this.zab.remove(basePendingResult);
            }
        }
    }
}

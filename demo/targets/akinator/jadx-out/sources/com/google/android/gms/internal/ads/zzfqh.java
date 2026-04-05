package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfqh implements zzfqe {
    private final int[] zza = new int[2];

    @Override // com.google.android.gms.internal.ads.zzfqe
    public final JSONObject zza(View view) {
        if (view == null) {
            return zzfqo.zzb(0, 0, 0, 0);
        }
        int[] iArr = this.zza;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        return zzfqo.zzb(iArr[0], iArr[1], width, height);
    }

    @Override // com.google.android.gms.internal.ads.zzfqe
    public final void zzb(View view, JSONObject jSONObject, zzfqd zzfqdVar, boolean z10, boolean z11) {
        int i10;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z10) {
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    zzfqdVar.zza(viewGroup.getChildAt(i11), this, jSONObject, z11);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                View childAt = viewGroup.getChildAt(i12);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i13));
                int size2 = arrayList3.size();
                int i14 = 0;
                while (true) {
                    i10 = i13 + 1;
                    if (i14 < size2) {
                        zzfqdVar.zza((View) arrayList3.get(i14), this, jSONObject, z11);
                        i14++;
                    }
                }
                i13 = i10;
            }
        }
    }
}

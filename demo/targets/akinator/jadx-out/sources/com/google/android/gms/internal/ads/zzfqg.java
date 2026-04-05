package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfqg implements zzfqe {
    private final zzfqe zza;

    public zzfqg(zzfqe zzfqeVar) {
        this.zza = zzfqeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqe
    public final JSONObject zza(View view) throws JSONException {
        JSONObject jSONObjectZzb = zzfqo.zzb(0, 0, 0, 0);
        int iZzb = zzfqr.zzb();
        int i10 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i10 == 0);
            return jSONObjectZzb;
        } catch (JSONException e10) {
            zzfqp.zza("Error with setting output device status", e10);
            return jSONObjectZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqe
    public final void zzb(View view, JSONObject jSONObject, zzfqd zzfqdVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfps zzfpsVarZza = zzfps.zza();
        if (zzfpsVarZza != null) {
            Collection collectionZzf = zzfpsVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfoy) it.next()).zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z12) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                            }
                        } else if (view2.getAlpha() != 0.0f) {
                            Object parent = view2.getParent();
                            view2 = parent instanceof View ? (View) parent : null;
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfqdVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}

package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zaao extends zaav {
    final /* synthetic */ zaaw zaa;
    private final Map zac;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zaao(zaaw zaawVar, Map map) {
        super(zaawVar, null);
        this.zaa = zaawVar;
        this.zac = map;
    }

    @Override // com.google.android.gms.common.api.internal.zaav
    public final void zaa() {
        com.google.android.gms.common.internal.zal zalVar = new com.google.android.gms.common.internal.zal(this.zaa.zad);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Api.Client client : this.zac.keySet()) {
            if (!client.requiresGooglePlayServices() || ((zaal) this.zac.get(client)).zac) {
                arrayList2.add(client);
            } else {
                arrayList.add(client);
            }
        }
        int i10 = 0;
        int iZab = -1;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            while (i10 < size) {
                iZab = zalVar.zab(this.zaa.zac, (Api.Client) arrayList.get(i10));
                i10++;
                if (iZab != 0) {
                    break;
                }
            }
        } else {
            int size2 = arrayList2.size();
            while (i10 < size2) {
                iZab = zalVar.zab(this.zaa.zac, (Api.Client) arrayList2.get(i10));
                i10++;
                if (iZab == 0) {
                    break;
                }
            }
        }
        if (iZab != 0) {
            ConnectionResult connectionResult = new ConnectionResult(iZab, null);
            zaaw zaawVar = this.zaa;
            zaawVar.zaa.zal(new zaam(this, zaawVar, connectionResult));
            return;
        }
        zaaw zaawVar2 = this.zaa;
        if (zaawVar2.zam && zaawVar2.zak != null) {
            zaawVar2.zak.zab();
        }
        for (Api.Client client2 : this.zac.keySet()) {
            BaseGmsClient.ConnectionProgressReportCallbacks connectionProgressReportCallbacks = (BaseGmsClient.ConnectionProgressReportCallbacks) this.zac.get(client2);
            if (!client2.requiresGooglePlayServices() || zalVar.zab(this.zaa.zac, client2) == 0) {
                client2.connect(connectionProgressReportCallbacks);
            } else {
                zaaw zaawVar3 = this.zaa;
                zaawVar3.zaa.zal(new zaan(this, zaawVar3, connectionProgressReportCallbacks));
            }
        }
    }
}

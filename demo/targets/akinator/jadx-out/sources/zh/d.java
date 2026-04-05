package zh;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.Objects;
import nh.l6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f97974a;

    public d(e eVar) {
        Objects.requireNonNull(eVar);
        this.f97974a = eVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjq
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        e eVar = this.f97974a;
        if (eVar.f97975a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            l6 l6Var = c.f97968a;
            String strZza = zzjm.zza(str2);
            if (strZza != null) {
                str2 = strZza;
            }
            bundle2.putString("events", str2);
            eVar.f97976b.onMessageTriggered(2, bundle2);
        }
    }
}

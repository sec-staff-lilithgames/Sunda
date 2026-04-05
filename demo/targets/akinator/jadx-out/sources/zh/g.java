package zh;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g implements a {

    /* renamed from: a, reason: collision with root package name */
    public final yh.b f97978a;

    public g(AppMeasurementSdk appMeasurementSdk, yh.b bVar) {
        this.f97978a = bVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new f(this));
    }

    @Override // zh.a
    public final yh.b zza() {
        return this.f97978a;
    }

    @Override // zh.a
    public final void zzc() {
    }

    @Override // zh.a
    public final void zzb(Set set) {
    }
}

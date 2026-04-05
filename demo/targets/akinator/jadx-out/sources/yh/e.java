package yh;

import com.google.android.gms.measurement.AppMeasurement;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f94575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f94576b;

    public e(f fVar, String str) {
        this.f94575a = str;
        this.f94576b = fVar;
    }

    @Override // yh.a
    public void registerEventNames(Set<String> set) {
        f fVar = this.f94576b;
        String str = this.f94575a;
        if (!fVar.a(str) || !str.equals(AppMeasurement.FIAM_ORIGIN) || set == null || set.isEmpty()) {
            return;
        }
        ((zh.a) fVar.f94579b.get(str)).zzb(set);
    }

    @Override // yh.a
    public final void unregister() {
        f fVar = this.f94576b;
        String str = this.f94575a;
        if (fVar.a(str)) {
            ConcurrentHashMap concurrentHashMap = fVar.f94579b;
            b bVarZza = ((zh.a) concurrentHashMap.get(str)).zza();
            if (bVarZza != null) {
                bVarZza.onMessageTriggered(0, null);
            }
            concurrentHashMap.remove(str);
        }
    }

    @Override // yh.a
    public void unregisterEventNames() {
        f fVar = this.f94576b;
        String str = this.f94575a;
        if (fVar.a(str) && str.equals(AppMeasurement.FIAM_ORIGIN)) {
            ((zh.a) fVar.f94579b.get(str)).zzc();
        }
    }
}

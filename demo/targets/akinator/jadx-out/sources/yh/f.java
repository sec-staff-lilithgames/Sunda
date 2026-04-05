package yh;

import android.content.Context;
import android.os.Bundle;
import bi.t;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfb;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjh;
import com.google.android.gms.measurement.internal.zzlt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nh.l6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements d {

    /* renamed from: c, reason: collision with root package name */
    public static volatile f f94577c;

    /* renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f94578a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f94579b;

    public f(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f94578a = appMeasurementSdk;
        this.f94579b = new ConcurrentHashMap();
    }

    public static d getInstance() {
        return getInstance(com.google.firebase.g.getInstance());
    }

    public final boolean a(String str) {
        if (str.isEmpty()) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = this.f94579b;
        return concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null;
    }

    @Override // yh.d
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        if (str2 == null || zh.c.zzb(str2, bundle)) {
            this.f94578a.clearConditionalUserProperty(str, str2, bundle);
        }
    }

    @Override // yh.d
    public List<c> getConditionalUserProperties(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : this.f94578a.getConditionalUserProperties(str, str2)) {
            l6 l6Var = zh.c.f97968a;
            Preconditions.checkNotNull(bundle);
            c cVar = new c();
            cVar.f94560a = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "origin", String.class, null));
            cVar.f94561b = (String) Preconditions.checkNotNull((String) zzjh.zzb(bundle, "name", String.class, null));
            cVar.f94562c = zzjh.zzb(bundle, "value", Object.class, null);
            cVar.f94563d = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            cVar.f94564e = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            cVar.f94565f = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            cVar.f94566g = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            cVar.f94567h = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            cVar.f94568i = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            cVar.f94569j = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            cVar.f94570k = (String) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            cVar.f94571l = (Bundle) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            cVar.f94573n = ((Boolean) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            cVar.f94572m = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            cVar.f94574o = ((Long) zzjh.zzb(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(cVar);
        }
        return arrayList;
    }

    @Override // yh.d
    public int getMaxUserProperties(String str) {
        return this.f94578a.getMaxUserProperties(str);
    }

    @Override // yh.d
    public Map<String, Object> getUserProperties(boolean z10) {
        return this.f94578a.getUserProperties(null, null, z10);
    }

    @Override // yh.d
    public void logEvent(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (zh.c.zza(str) && zh.c.zzb(str2, bundle) && zh.c.zze(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f94578a.logEvent(str, str2, bundle);
        }
    }

    @Override // yh.d
    public a registerAnalyticsConnectorListener(String str, b bVar) {
        Preconditions.checkNotNull(bVar);
        if (zh.c.zza(str) && !a(str)) {
            boolean zEquals = AppMeasurement.FIAM_ORIGIN.equals(str);
            AppMeasurementSdk appMeasurementSdk = this.f94578a;
            zh.a eVar = zEquals ? new zh.e(appMeasurementSdk, bVar) : "clx".equals(str) ? new zh.g(appMeasurementSdk, bVar) : null;
            if (eVar != null) {
                this.f94579b.put(str, eVar);
                return new e(this, str);
            }
        }
        return null;
    }

    @Override // yh.d
    public void setConditionalUserProperty(c cVar) {
        String str;
        l6 l6Var = zh.c.f97968a;
        if (cVar == null || (str = cVar.f94560a) == null || str.isEmpty()) {
            return;
        }
        Object obj = cVar.f94562c;
        if ((obj == null || zzlt.zzb(obj) != null) && zh.c.zza(str) && zh.c.zzd(str, cVar.f94561b)) {
            String str2 = cVar.f94570k;
            if (str2 == null || (zh.c.zzb(str2, cVar.f94571l) && zh.c.zze(str, cVar.f94570k, cVar.f94571l))) {
                String str3 = cVar.f94567h;
                if (str3 == null || (zh.c.zzb(str3, cVar.f94568i) && zh.c.zze(str, cVar.f94567h, cVar.f94568i))) {
                    String str4 = cVar.f94565f;
                    if (str4 == null || (zh.c.zzb(str4, cVar.f94566g) && zh.c.zze(str, cVar.f94565f, cVar.f94566g))) {
                        Bundle bundle = new Bundle();
                        String str5 = cVar.f94560a;
                        if (str5 != null) {
                            bundle.putString("origin", str5);
                        }
                        String str6 = cVar.f94561b;
                        if (str6 != null) {
                            bundle.putString("name", str6);
                        }
                        Object obj2 = cVar.f94562c;
                        if (obj2 != null) {
                            zzjh.zza(bundle, obj2);
                        }
                        String str7 = cVar.f94563d;
                        if (str7 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str7);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, cVar.f94564e);
                        String str8 = cVar.f94565f;
                        if (str8 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str8);
                        }
                        Bundle bundle2 = cVar.f94566g;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str9 = cVar.f94567h;
                        if (str9 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str9);
                        }
                        Bundle bundle3 = cVar.f94568i;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, cVar.f94569j);
                        String str10 = cVar.f94570k;
                        if (str10 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str10);
                        }
                        Bundle bundle4 = cVar.f94571l;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, cVar.f94572m);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, cVar.f94573n);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, cVar.f94574o);
                        this.f94578a.setConditionalUserProperty(bundle);
                    }
                }
            }
        }
    }

    @Override // yh.d
    public void setUserProperty(String str, String str2, Object obj) {
        if (zh.c.zza(str) && zh.c.zzd(str, str2)) {
            this.f94578a.setUserProperty(str, str2, obj);
        }
    }

    public static d getInstance(com.google.firebase.g gVar) {
        return (d) gVar.get(d.class);
    }

    public static d getInstance(com.google.firebase.g gVar, Context context, yi.d dVar) {
        Preconditions.checkNotNull(gVar);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(dVar);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (f94577c == null) {
            synchronized (f.class) {
                try {
                    if (f94577c == null) {
                        Bundle bundle = new Bundle(1);
                        if (gVar.isDefaultApp()) {
                            ((t) dVar).subscribe(com.google.firebase.b.class, h.f94581b, g.f94580a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", gVar.isDataCollectionDefaultEnabled());
                        }
                        f94577c = new f(zzfb.zza(context, bundle).zzb());
                    }
                } finally {
                }
            }
        }
        return f94577c;
    }
}

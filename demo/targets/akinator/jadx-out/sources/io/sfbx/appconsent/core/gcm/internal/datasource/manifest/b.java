package io.sfbx.appconsent.core.gcm.internal.datasource.manifest;

import android.content.Context;
import android.os.Bundle;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Boolean> f68213a;

    public b(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.f68213a = p1.emptyMap();
        Context applicationContext = context.getApplicationContext();
        try {
            Bundle bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
            if (bundle != null) {
                a(bundle);
            }
        } catch (Throwable unused) {
        }
    }

    private final Boolean a(Map<String, Boolean> map, String str) {
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return null;
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.manifest.a
    public Boolean b() {
        return a(this.f68213a, "google_analytics_default_allow_ad_storage");
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.manifest.a
    public Boolean c() {
        return a(this.f68213a, "google_analytics_default_allow_ad_personalization_signals");
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.manifest.a
    public Boolean d() {
        return a(this.f68213a, "google_analytics_default_allow_analytics_storage");
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.manifest.a
    public Boolean a() {
        return a(this.f68213a, "google_analytics_default_allow_ad_user_data");
    }

    private final void a(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (bundle.containsKey("google_analytics_default_allow_analytics_storage")) {
            linkedHashMap.put("google_analytics_default_allow_analytics_storage", Boolean.valueOf(bundle.getBoolean("google_analytics_default_allow_analytics_storage")));
        }
        if (bundle.containsKey("google_analytics_default_allow_ad_storage")) {
            linkedHashMap.put("google_analytics_default_allow_ad_storage", Boolean.valueOf(bundle.getBoolean("google_analytics_default_allow_ad_storage")));
        }
        if (bundle.containsKey("google_analytics_default_allow_ad_user_data")) {
            linkedHashMap.put("google_analytics_default_allow_ad_user_data", Boolean.valueOf(bundle.getBoolean("google_analytics_default_allow_ad_user_data")));
        }
        if (bundle.containsKey("google_analytics_default_allow_ad_personalization_signals")) {
            linkedHashMap.put("google_analytics_default_allow_ad_personalization_signals", Boolean.valueOf(bundle.getBoolean("google_analytics_default_allow_ad_personalization_signals")));
        }
        this.f68213a = p1.toMap(linkedHashMap);
    }
}

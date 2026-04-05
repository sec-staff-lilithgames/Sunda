package io.sfbx.appconsent.core.gcm.internal.datasource.preferences;

import android.content.SharedPreferences;
import java.util.Map;
import kotlin.jvm.internal.e0;
import uu.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f68214a;

    public b(SharedPreferences sharedPreferences) {
        e0.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.f68214a = sharedPreferences;
    }

    private final Boolean a(String str) {
        if (this.f68214a.contains(str)) {
            try {
                return Boolean.valueOf(this.f68214a.getBoolean(str, false));
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a
    public Boolean b() {
        return a("appconsent_ad_storage");
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a
    public Boolean c() {
        return a("appconsent_ad_personalization_signals");
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a
    public Boolean d() {
        return a("appconsent_analytics_storage");
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a
    public void e() {
        SharedPreferences.Editor editorEdit = this.f68214a.edit();
        editorEdit.remove("appconsent_analytics_storage");
        editorEdit.remove("appconsent_ad_storage");
        editorEdit.remove("appconsent_ad_user_data");
        editorEdit.remove("appconsent_ad_personalization_signals");
        editorEdit.apply();
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a
    public Boolean a() {
        return a("appconsent_ad_user_data");
    }

    @Override // io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a
    public void a(Map<String, Boolean> values) {
        e0.checkNotNullParameter(values, "values");
        SharedPreferences.Editor editorEdit = this.f68214a.edit();
        for (Map.Entry<String, Boolean> entry : values.entrySet()) {
            if (k0.contains(io.sfbx.appconsent.core.gcm.internal.datasource.a.f68211a.a(), entry.getKey())) {
                editorEdit.putBoolean(entry.getKey(), entry.getValue().booleanValue());
            }
        }
        editorEdit.apply();
    }
}

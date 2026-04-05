package io.sfbx.appconsent.core.gcm.di;

import android.content.Context;
import android.content.SharedPreferences;
import io.sfbx.appconsent.core.gcm.internal.datasource.manifest.a;
import io.sfbx.appconsent.core.gcm.internal.datasource.manifest.b;
import io.sfbx.appconsent.core.gcm.repository.GCMRepositoryContract;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class CoreGCMInjector {
    public static final CoreGCMInjector INSTANCE = new CoreGCMInjector();

    private CoreGCMInjector() {
    }

    private final a provideGCMManifest(Context context) {
        return new b(context);
    }

    private final io.sfbx.appconsent.core.gcm.internal.datasource.preferences.a provideGCMSharedPreferences(SharedPreferences sharedPreferences) {
        return new io.sfbx.appconsent.core.gcm.internal.datasource.preferences.b(sharedPreferences);
    }

    public final GCMRepositoryContract provideGCMRepository(Context context, SharedPreferences sharedPreferences) {
        e0.checkNotNullParameter(context, "context");
        e0.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        return new io.sfbx.appconsent.core.gcm.internal.repository.a(provideGCMManifest(context), provideGCMSharedPreferences(sharedPreferences));
    }
}

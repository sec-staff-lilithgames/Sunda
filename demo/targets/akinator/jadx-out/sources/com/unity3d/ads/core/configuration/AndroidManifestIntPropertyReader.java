package com.unity3d.ads.core.configuration;

import android.content.Context;
import android.os.Bundle;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class AndroidManifestIntPropertyReader {
    private final Context context;

    public AndroidManifestIntPropertyReader(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Integer getPropertyByName(String propertyName) {
        Bundle bundle;
        Integer numValueOf;
        e0.checkNotNullParameter(propertyName, "propertyName");
        try {
            bundle = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128).metaData;
            numValueOf = Integer.valueOf(bundle.getInt(propertyName));
        } catch (Exception unused) {
        }
        if (bundle.containsKey(propertyName)) {
            return numValueOf;
        }
        return null;
    }
}

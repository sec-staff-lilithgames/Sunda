package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.Provider;
import java.security.Security;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhdc {
    private static final String[] zza = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt"};

    public static Provider zza() {
        String[] strArr = zza;
        for (int i10 = 0; i10 < 3; i10++) {
            Provider provider = Security.getProvider(strArr[i10]);
            if (provider != null) {
                return provider;
            }
        }
        return null;
    }
}

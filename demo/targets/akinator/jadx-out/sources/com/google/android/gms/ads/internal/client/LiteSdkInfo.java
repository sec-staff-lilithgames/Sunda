package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbrj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class LiteSdkInfo extends zzcx {
    public LiteSdkInfo(Context context) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public zzbrj getAdapterCreator() {
        return new zzbrf();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcy
    public zzfc getLiteSdkVersion() {
        return new zzfc(ModuleDescriptor.MODULE_VERSION, ModuleDescriptor.MODULE_VERSION, "24.7.0");
    }
}

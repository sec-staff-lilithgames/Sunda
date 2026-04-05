package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzyg;
import com.google.android.gms.internal.gtm.zzyh;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzyg<MessageType extends zzyh<MessageType, BuilderType>, BuilderType extends zzyg<MessageType, BuilderType>> implements zzadk {
    @Override // 
    public abstract zzyg zzv();

    public abstract zzyg zzw(zzyh zzyhVar);

    @Override // com.google.android.gms.internal.gtm.zzadk
    public final /* bridge */ /* synthetic */ zzadk zzx(zzadl zzadlVar) {
        if (zzay().getClass().isInstance(zzadlVar)) {
            return zzw((zzyh) zzadlVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // com.google.android.gms.internal.gtm.zzadk
    public /* bridge */ /* synthetic */ zzadk zzy(zzzb zzzbVar, zzabq zzabqVar) throws IOException {
        throw null;
    }
}

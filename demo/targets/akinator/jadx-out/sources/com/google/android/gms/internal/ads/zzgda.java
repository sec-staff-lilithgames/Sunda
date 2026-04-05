package com.google.android.gms.internal.ads;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgda extends zzgdh {
    private final Context zza;

    public zzgda(zzauc zzaucVar, zzgcd zzgcdVar, Context context, zzgjd zzgjdVar) {
        super("fPyGoeDuTUuDJV03GsNFpCGRO2J3Ui8HA6QvnuqOeQaxvLcgOY5Y2sf90BXpAioC", "znAIQ1vWTnsSA3nf0QmMCBs/bj4g6mmUyXonbfu9VUs=", zzaucVar, zzgcdVar, zzgjdVar.zza(Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, InvocationTargetException {
        Object[] objArr = (Object[]) method.invoke("", this.zza);
        objArr.getClass();
        synchronized (zzaucVar) {
            zzaucVar.zzc(((Long) objArr[0]).longValue());
            zzaucVar.zzP(((Long) objArr[1]).longValue());
        }
    }
}

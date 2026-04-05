package com.google.android.gms.internal.ads;

import android.net.NetworkCapabilities;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgcy extends zzgdh {
    private final Map zza;

    public zzgcy(zzauc zzaucVar, zzgcd zzgcdVar, Map map, zzgjd zzgjdVar) {
        super("xLMBD0ZYDeFbDZVCzCownSP8NNmORP0EKF5jeEnOGlb2W22XICiCfQYSI28gi51p", "CL6HTaJ4+bHVCQXLR1XCftwOp39gWYfgPib+AnvHUWA=", zzaucVar, zzgcdVar, zzgjdVar.zza(Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE));
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgdh
    public final void zza(Method method, zzauc zzaucVar) throws IllegalAccessException, InvocationTargetException {
        Map map = this.zza;
        Object[] objArr = (Object[]) method.invoke("", (NetworkCapabilities) map.get("ntc"), (Long) map.get("vs"), (Long) map.get(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG));
        objArr.getClass();
        synchronized (zzaucVar) {
            try {
                zzaucVar.zzf(((Long) objArr[0]).longValue());
                long jLongValue = ((Long) objArr[1]).longValue();
                if (jLongValue >= 0) {
                    zzaucVar.zzW(jLongValue);
                }
                long jLongValue2 = ((Long) objArr[2]).longValue();
                if (jLongValue2 >= 0) {
                    zzaucVar.zzX(jLongValue2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

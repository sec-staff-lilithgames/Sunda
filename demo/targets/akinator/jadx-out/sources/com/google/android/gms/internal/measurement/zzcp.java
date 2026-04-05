package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcp extends zzbl implements zzcr {
    public zzcp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void beginAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j10);
        zzc(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzc(parcelZza, bundle);
        zzc(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void clearMeasurementEnabled(long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void endAdUnitExposure(String str, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j10);
        zzc(24, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void generateEventId(zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(22, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getAppInstanceId(zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(20, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCachedAppInstanceId(zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(19, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCurrentScreenClass(zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(17, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getCurrentScreenName(zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(16, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getGmpAppId(zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getMaxUserProperties(String str, zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getSessionId(zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(46, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getTestFlag(zzcu zzcuVar, int i10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcuVar);
        parcelZza.writeInt(i10);
        zzc(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void getUserProperties(String str, String str2, boolean z10, zzcu zzcuVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        int i10 = zzbn.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzbn.zzd(parcelZza, zzcuVar);
        zzc(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void initForTests(Map map) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, iObjectWrapper);
        zzbn.zzc(parcelZza, zzddVar);
        parcelZza.writeLong(j10);
        zzc(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void isDataCollectionEnabled(zzcu zzcuVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzc(parcelZza, bundle);
        parcelZza.writeInt(z10 ? 1 : 0);
        parcelZza.writeInt(z11 ? 1 : 0);
        parcelZza.writeLong(j10);
        zzc(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(5);
        parcelZza.writeString(str);
        zzbn.zzd(parcelZza, iObjectWrapper);
        zzbn.zzd(parcelZza, iObjectWrapper2);
        zzbn.zzd(parcelZza, iObjectWrapper3);
        zzc(33, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, zzdfVar);
        zzbn.zzc(parcelZza, bundle);
        parcelZza.writeLong(j10);
        zzc(53, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, zzdfVar);
        parcelZza.writeLong(j10);
        zzc(54, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, zzdfVar);
        parcelZza.writeLong(j10);
        zzc(55, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, zzdfVar);
        parcelZza.writeLong(j10);
        zzc(56, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, zzdfVar);
        zzbn.zzd(parcelZza, zzcuVar);
        parcelZza.writeLong(j10);
        zzc(57, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, zzdfVar);
        parcelZza.writeLong(j10);
        zzc(51, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, zzdfVar);
        parcelZza.writeLong(j10);
        zzc(52, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void performAction(Bundle bundle, zzcu zzcuVar, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, bundle);
        zzbn.zzd(parcelZza, zzcuVar);
        parcelZza.writeLong(j10);
        zzc(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzdaVar);
        zzc(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void resetAnalyticsData(long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzc(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void retrieveAndUploadBatches(zzcx zzcxVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzcxVar);
        zzc(58, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, bundle);
        parcelZza.writeLong(j10);
        zzc(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConsent(Bundle bundle, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, bundle);
        parcelZza.writeLong(j10);
        zzc(45, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, zzdfVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        parcelZza.writeLong(j10);
        zzc(50, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setDataCollectionEnabled(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzbn.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzc(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, bundle);
        zzc(42, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setEventInterceptor(zzda zzdaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzdaVar);
        zzc(34, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setInstanceIdProvider(zzdc zzdcVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setMeasurementEnabled(boolean z10, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzbn.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        parcelZza.writeLong(j10);
        zzc(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setMinimumSessionDuration(long j10) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setSessionTimeoutDuration(long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeLong(j10);
        zzc(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setSgtmDebugInfo(Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzc(parcelZza, intent);
        zzc(48, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setUserId(String str, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeLong(j10);
        zzc(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbn.zzd(parcelZza, iObjectWrapper);
        parcelZza.writeInt(z10 ? 1 : 0);
        parcelZza.writeLong(j10);
        zzc(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.measurement.zzcr
    public final void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbn.zzd(parcelZza, zzdaVar);
        zzc(36, parcelZza);
    }
}

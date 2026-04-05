package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public interface zzcr extends IInterface {
    void beginAdUnitExposure(String str, long j10) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j10) throws RemoteException;

    void endAdUnitExposure(String str, long j10) throws RemoteException;

    void generateEventId(zzcu zzcuVar) throws RemoteException;

    void getAppInstanceId(zzcu zzcuVar) throws RemoteException;

    void getCachedAppInstanceId(zzcu zzcuVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, zzcu zzcuVar) throws RemoteException;

    void getCurrentScreenClass(zzcu zzcuVar) throws RemoteException;

    void getCurrentScreenName(zzcu zzcuVar) throws RemoteException;

    void getGmpAppId(zzcu zzcuVar) throws RemoteException;

    void getMaxUserProperties(String str, zzcu zzcuVar) throws RemoteException;

    void getSessionId(zzcu zzcuVar) throws RemoteException;

    void getTestFlag(zzcu zzcuVar, int i10) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z10, zzcu zzcuVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(IObjectWrapper iObjectWrapper, zzdd zzddVar, long j10) throws RemoteException;

    void isDataCollectionEnabled(zzcu zzcuVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, zzcu zzcuVar, long j10) throws RemoteException;

    void logHealthData(int i10, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j10) throws RemoteException;

    void onActivityCreatedByScionActivityInfo(zzdf zzdfVar, Bundle bundle, long j10) throws RemoteException;

    void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException;

    void onActivityDestroyedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void onActivityPaused(IObjectWrapper iObjectWrapper, long j10) throws RemoteException;

    void onActivityPausedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void onActivityResumed(IObjectWrapper iObjectWrapper, long j10) throws RemoteException;

    void onActivityResumedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, zzcu zzcuVar, long j10) throws RemoteException;

    void onActivitySaveInstanceStateByScionActivityInfo(zzdf zzdfVar, zzcu zzcuVar, long j10) throws RemoteException;

    void onActivityStarted(IObjectWrapper iObjectWrapper, long j10) throws RemoteException;

    void onActivityStartedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void onActivityStopped(IObjectWrapper iObjectWrapper, long j10) throws RemoteException;

    void onActivityStoppedByScionActivityInfo(zzdf zzdfVar, long j10) throws RemoteException;

    void performAction(Bundle bundle, zzcu zzcuVar, long j10) throws RemoteException;

    void registerOnMeasurementEventListener(zzda zzdaVar) throws RemoteException;

    void resetAnalyticsData(long j10) throws RemoteException;

    void retrieveAndUploadBatches(zzcx zzcxVar) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j10) throws RemoteException;

    void setConsent(Bundle bundle, long j10) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j10) throws RemoteException;

    void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j10) throws RemoteException;

    void setCurrentScreenByScionActivityInfo(zzdf zzdfVar, String str, String str2, long j10) throws RemoteException;

    void setDataCollectionEnabled(boolean z10) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(zzda zzdaVar) throws RemoteException;

    void setInstanceIdProvider(zzdc zzdcVar) throws RemoteException;

    void setMeasurementEnabled(boolean z10, long j10) throws RemoteException;

    void setMinimumSessionDuration(long j10) throws RemoteException;

    void setSessionTimeoutDuration(long j10) throws RemoteException;

    void setSgtmDebugInfo(Intent intent) throws RemoteException;

    void setUserId(String str, long j10) throws RemoteException;

    void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z10, long j10) throws RemoteException;

    void unregisterOnMeasurementEventListener(zzda zzdaVar) throws RemoteException;
}

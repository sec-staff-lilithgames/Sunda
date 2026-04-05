package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.unity3d.services.UnityAdsConstants;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import rw.hIT.uQjDr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zabe extends GoogleApiClient implements zabz {
    zabx zab;
    final Map zac;
    Set zad;
    final ClientSettings zae;
    final Map zaf;
    final Api.AbstractClientBuilder zag;
    Set zah;
    final zadc zai;
    private final Lock zaj;
    private final com.google.android.gms.common.internal.zak zak;
    private final int zam;
    private final Context zan;
    private final Looper zao;
    private volatile boolean zap;
    private long zaq;
    private long zar;
    private final zabc zas;
    private final GoogleApiAvailability zat;
    private final ListenerHolders zau;
    private final ArrayList zav;
    private Integer zaw;
    private final com.google.android.gms.common.internal.zaj zax;
    private zaca zal = null;
    final Queue zaa = new LinkedList();

    public zabe(Context context, Lock lock, Looper looper, ClientSettings clientSettings, GoogleApiAvailability googleApiAvailability, Api.AbstractClientBuilder abstractClientBuilder, Map map, List list, List list2, Map map2, int i10, int i11, ArrayList arrayList) {
        this.zaq = true != ClientLibraryUtils.isPackageSide() ? UnityAdsConstants.Timeout.INIT_TIMEOUT_MS : 10000L;
        this.zar = 5000L;
        this.zad = new HashSet();
        this.zau = new ListenerHolders();
        this.zaw = null;
        this.zah = null;
        zaay zaayVar = new zaay(this);
        this.zax = zaayVar;
        this.zan = context;
        this.zaj = lock;
        this.zak = new com.google.android.gms.common.internal.zak(looper, zaayVar);
        this.zao = looper;
        this.zas = new zabc(this, looper);
        this.zat = googleApiAvailability;
        this.zam = i10;
        if (i10 >= 0) {
            this.zaw = Integer.valueOf(i11);
        }
        this.zaf = map;
        this.zac = map2;
        this.zav = arrayList;
        this.zai = new zadc();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.zak.zaf((GoogleApiClient.ConnectionCallbacks) it.next());
        }
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            this.zak.zag((GoogleApiClient.OnConnectionFailedListener) it2.next());
        }
        this.zae = clientSettings;
        this.zag = abstractClientBuilder;
    }

    public static int zad(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        while (it.hasNext()) {
            Api.Client client = (Api.Client) it.next();
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        if (zRequiresSignIn) {
            return (zProvidesSignIn && z10) ? 2 : 1;
        }
        return 3;
    }

    public static String zag(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "SIGN_IN_MODE_NONE" : "SIGN_IN_MODE_OPTIONAL" : "SIGN_IN_MODE_REQUIRED";
    }

    public static /* bridge */ /* synthetic */ void zai(zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zap) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    public static /* bridge */ /* synthetic */ void zaj(zabe zabeVar) {
        zabeVar.zaj.lock();
        try {
            if (zabeVar.zak()) {
                zabeVar.zan();
            }
        } finally {
            zabeVar.zaj.unlock();
        }
    }

    private final void zal(int i10) {
        zabe zabeVar;
        Integer num = this.zaw;
        if (num == null) {
            this.zaw = Integer.valueOf(i10);
        } else if (num.intValue() != i10) {
            throw new IllegalStateException("Cannot use sign-in mode: " + zag(i10) + ". Mode was already set to " + zag(this.zaw.intValue()));
        }
        if (this.zal != null) {
            return;
        }
        boolean zRequiresSignIn = false;
        boolean zProvidesSignIn = false;
        for (Api.Client client : this.zac.values()) {
            zRequiresSignIn |= client.requiresSignIn();
            zProvidesSignIn |= client.providesSignIn();
        }
        int iIntValue = this.zaw.intValue();
        if (iIntValue == 1) {
            zabeVar = this;
            if (!zRequiresSignIn) {
                throw new IllegalStateException("SIGN_IN_MODE_REQUIRED cannot be used on a GoogleApiClient that does not contain any authenticated APIs. Use connect() instead.");
            }
            if (zProvidesSignIn) {
                throw new IllegalStateException("Cannot use SIGN_IN_MODE_REQUIRED with GOOGLE_SIGN_IN_API. Use connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
        } else {
            if (iIntValue == 2 && zRequiresSignIn) {
                this.zal = zaaa.zag(this.zan, this, this.zaj, this.zao, this.zat, this.zac, this.zae, this.zaf, this.zag, this.zav);
                return;
            }
            zabeVar = this;
        }
        zabeVar.zal = new zabi(zabeVar.zan, zabeVar, zabeVar.zaj, zabeVar.zao, zabeVar.zat, zabeVar.zac, zabeVar.zae, zabeVar.zaf, zabeVar.zag, zabeVar.zav, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zam(GoogleApiClient googleApiClient, StatusPendingResult statusPendingResult, boolean z10) {
        Common.zaa.zaa(googleApiClient).setResultCallback(new zabb(this, statusPendingResult, z10, googleApiClient));
    }

    private final void zan() {
        this.zak.zab();
        ((zaca) Preconditions.checkNotNull(this.zal)).zaq();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final ConnectionResult blockingConnect() {
        boolean z10 = true;
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        this.zaj.lock();
        try {
            if (this.zam >= 0) {
                if (this.zaw == null) {
                    z10 = false;
                }
                Preconditions.checkState(z10, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            zal(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult connectionResultZab = ((zaca) Preconditions.checkNotNull(this.zal)).zab();
            this.zaj.unlock();
            return connectionResultZab;
        } catch (Throwable th2) {
            this.zaj.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final PendingResult<Status> clearDefaultAccountAndReconnect() {
        Preconditions.checkState(isConnected(), "GoogleApiClient is not connected yet.");
        Integer num = this.zaw;
        boolean z10 = true;
        if (num != null && num.intValue() == 2) {
            z10 = false;
        }
        Preconditions.checkState(z10, "Cannot use clearDefaultAccountAndReconnect with GOOGLE_SIGN_IN_API");
        StatusPendingResult statusPendingResult = new StatusPendingResult(this);
        if (this.zac.containsKey(Common.CLIENT_KEY)) {
            zam(this, statusPendingResult, false);
            return statusPendingResult;
        }
        AtomicReference atomicReference = new AtomicReference();
        zaaz zaazVar = new zaaz(this, atomicReference, statusPendingResult);
        zaba zabaVar = new zaba(this, statusPendingResult);
        GoogleApiClient.Builder builder = new GoogleApiClient.Builder(this.zan);
        builder.addApi(Common.API);
        builder.addConnectionCallbacks(zaazVar);
        builder.addOnConnectionFailedListener(zabaVar);
        builder.setHandler(this.zas);
        GoogleApiClient googleApiClientBuild = builder.build();
        atomicReference.set(googleApiClientBuild);
        googleApiClientBuild.connect();
        return statusPendingResult;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect() {
        this.zaj.lock();
        try {
            int i10 = 2;
            boolean z10 = false;
            if (this.zam >= 0) {
                Preconditions.checkState(this.zaw != null, "Sign-in mode should have been set explicitly by auto-manage.");
            } else {
                Integer num = this.zaw;
                if (num == null) {
                    this.zaw = Integer.valueOf(zad(this.zac.values(), false));
                } else if (num.intValue() == 2) {
                    throw new IllegalStateException("Cannot call connect() when SignInMode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
                }
            }
            int iIntValue = ((Integer) Preconditions.checkNotNull(this.zaw)).intValue();
            this.zaj.lock();
            try {
                if (iIntValue != 3 && iIntValue != 1) {
                    if (iIntValue != 2) {
                        i10 = iIntValue;
                    }
                    Preconditions.checkArgument(z10, "Illegal sign-in mode: " + i10);
                    zal(i10);
                    zan();
                    this.zaj.unlock();
                    return;
                }
                i10 = iIntValue;
                Preconditions.checkArgument(z10, "Illegal sign-in mode: " + i10);
                zal(i10);
                zan();
                this.zaj.unlock();
                return;
            } finally {
                this.zaj.unlock();
            }
            z10 = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void disconnect() {
        this.zaj.lock();
        try {
            this.zai.zab();
            zaca zacaVar = this.zal;
            if (zacaVar != null) {
                zacaVar.zar();
            }
            this.zau.zab();
            for (BaseImplementation.ApiMethodImpl apiMethodImpl : this.zaa) {
                apiMethodImpl.zan(null);
                apiMethodImpl.cancel();
            }
            this.zaa.clear();
            if (this.zal != null) {
                zak();
                this.zak.zaa();
            }
            this.zaj.unlock();
        } catch (Throwable th2) {
            this.zaj.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append((CharSequence) str).append("mContext=").println(this.zan);
        printWriter.append((CharSequence) str).append("mResuming=").print(this.zap);
        printWriter.append(" mWorkQueue.size()=").print(this.zaa.size());
        printWriter.append(" mUnconsumedApiCalls.size()=").println(this.zai.zab.size());
        zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zas(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, R extends Result, T extends BaseImplementation.ApiMethodImpl<R, A>> T enqueue(T t10) {
        Api<?> api = t10.getApi();
        Preconditions.checkArgument(this.zac.containsKey(t10.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.zad() : "the API") + " required for this call.");
        this.zaj.lock();
        try {
            zaca zacaVar = this.zal;
            if (zacaVar == null) {
                this.zaa.add(t10);
            } else {
                t10 = (T) zacaVar.zae(t10);
            }
            this.zaj.unlock();
            return t10;
        } catch (Throwable th2) {
            this.zaj.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    @ResultIgnorabilityUnspecified
    public final <A extends Api.AnyClient, T extends BaseImplementation.ApiMethodImpl<? extends Result, A>> T execute(T t10) {
        Map map = this.zac;
        Api<?> api = t10.getApi();
        Preconditions.checkArgument(map.containsKey(t10.getClientKey()), "GoogleApiClient is not configured to use " + (api != null ? api.zad() : "the API") + " required for this call.");
        this.zaj.lock();
        try {
            zaca zacaVar = this.zal;
            if (zacaVar == null) {
                throw new IllegalStateException("GoogleApiClient is not connected yet.");
            }
            if (this.zap) {
                this.zaa.add(t10);
                while (!this.zaa.isEmpty()) {
                    BaseImplementation.ApiMethodImpl apiMethodImpl = (BaseImplementation.ApiMethodImpl) this.zaa.remove();
                    this.zai.zaa(apiMethodImpl);
                    apiMethodImpl.setFailedResult(Status.RESULT_INTERNAL_ERROR);
                }
            } else {
                t10 = (T) zacaVar.zaf(t10);
            }
            this.zaj.unlock();
            return t10;
        } catch (Throwable th2) {
            this.zaj.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <C extends Api.Client> C getClient(Api.AnyClientKey<C> anyClientKey) {
        C c10 = (C) this.zac.get(anyClientKey);
        Preconditions.checkNotNull(c10, "Appropriate Api was not requested.");
        return c10;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult getConnectionResult(Api<?> api) {
        ConnectionResult connectionResult;
        this.zaj.lock();
        try {
            if (!isConnected() && !this.zap) {
                throw new IllegalStateException("Cannot invoke getConnectionResult unless GoogleApiClient is connected");
            }
            if (!this.zac.containsKey(api.zab())) {
                throw new IllegalArgumentException(api.zad() + " was never registered with GoogleApiClient");
            }
            ConnectionResult connectionResultZad = ((zaca) Preconditions.checkNotNull(this.zal)).zad(api);
            if (connectionResultZad != null) {
                this.zaj.unlock();
                return connectionResultZad;
            }
            if (this.zap) {
                connectionResult = ConnectionResult.RESULT_SUCCESS;
            } else {
                Log.w("GoogleApiClientImpl", zaf());
                Log.wtf("GoogleApiClientImpl", api.zad() + " requested in getConnectionResult is not connected but is not present in the failed  connections map", new Exception());
                connectionResult = new ConnectionResult(8, null);
            }
            this.zaj.unlock();
            return connectionResult;
        } catch (Throwable th2) {
            this.zaj.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Context getContext() {
        return this.zan;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final Looper getLooper() {
        return this.zao;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasApi(Api<?> api) {
        return this.zac.containsKey(api.zab());
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean hasConnectedApi(Api<?> api) {
        Api.Client client;
        return isConnected() && (client = (Api.Client) this.zac.get(api.zab())) != null && client.isConnected();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnected() {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zaw();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnecting() {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zax();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionCallbacksRegistered(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        return this.zak.zaj(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean isConnectionFailedListenerRegistered(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return this.zak.zak(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final boolean maybeSignIn(SignInConnectionListener signInConnectionListener) {
        zaca zacaVar = this.zal;
        return zacaVar != null && zacaVar.zay(signInConnectionListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void maybeSignOut() {
        zaca zacaVar = this.zal;
        if (zacaVar != null) {
            zacaVar.zau();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void reconnect() {
        disconnect();
        connect();
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zaf(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void registerConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zag(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final <L> ListenerHolder<L> registerListener(L l9) {
        this.zaj.lock();
        try {
            return this.zau.zaa(l9, this.zao, "NO_TYPE");
        } finally {
            this.zaj.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void stopAutoManage(FragmentActivity fragmentActivity) {
        LifecycleActivity lifecycleActivity = new LifecycleActivity((Activity) fragmentActivity);
        if (this.zam < 0) {
            throw new IllegalStateException("Called stopAutoManage but automatic lifecycle management is not enabled.");
        }
        zak.zaa(lifecycleActivity).zae(this.zam);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionCallbacks(GoogleApiClient.ConnectionCallbacks connectionCallbacks) {
        this.zak.zah(connectionCallbacks);
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void unregisterConnectionFailedListener(GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.zak.zai(onConnectionFailedListener);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zaa(ConnectionResult connectionResult) {
        if (!this.zat.isPlayServicesPossiblyUpdating(this.zan, connectionResult.getErrorCode())) {
            zak();
        }
        if (this.zap) {
            return;
        }
        this.zak.zac(connectionResult);
        this.zak.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zab(Bundle bundle) {
        while (!this.zaa.isEmpty()) {
            execute((BaseImplementation.ApiMethodImpl) this.zaa.remove());
        }
        this.zak.zad(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.zabz
    public final void zac(int i10, boolean z10) {
        if (i10 == 1) {
            if (!z10 && !this.zap) {
                this.zap = true;
                if (this.zab == null && !ClientLibraryUtils.isPackageSide()) {
                    try {
                        this.zab = this.zat.zac(this.zan.getApplicationContext(), new zabd(this));
                    } catch (SecurityException unused) {
                    }
                }
                zabc zabcVar = this.zas;
                zabcVar.sendMessageDelayed(zabcVar.obtainMessage(1), this.zaq);
                zabc zabcVar2 = this.zas;
                zabcVar2.sendMessageDelayed(zabcVar2.obtainMessage(2), this.zar);
            }
            i10 = 1;
        }
        for (BasePendingResult basePendingResult : (BasePendingResult[]) this.zai.zab.toArray(new BasePendingResult[0])) {
            basePendingResult.forceFailureUnlessReady(zadc.zaa);
        }
        this.zak.zae(i10);
        this.zak.zaa();
        if (i10 == 2) {
            zan();
        }
    }

    public final String zaf() {
        StringWriter stringWriter = new StringWriter();
        dump("", null, new PrintWriter(stringWriter), null);
        return stringWriter.toString();
    }

    @ResultIgnorabilityUnspecified
    public final boolean zak() {
        if (!this.zap) {
            return false;
        }
        this.zap = false;
        this.zas.removeMessages(2);
        this.zas.removeMessages(1);
        zabx zabxVar = this.zab;
        if (zabxVar != null) {
            zabxVar.zab();
            this.zab = null;
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zao(zada zadaVar) {
        this.zaj.lock();
        try {
            if (this.zah == null) {
                this.zah = new HashSet();
            }
            this.zah.add(zadaVar);
            this.zaj.unlock();
        } catch (Throwable th2) {
            this.zaj.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void zap(zada zadaVar) {
        this.zaj.lock();
        try {
            Set set = this.zah;
            if (set == null) {
                Log.wtf("GoogleApiClientImpl", uQjDr.BoLxf, new Exception());
            } else if (set.remove(zadaVar)) {
                this.zaj.lock();
                try {
                    Set set2 = this.zah;
                    if (set2 == null) {
                        this.zaj.unlock();
                    } else {
                        boolean zIsEmpty = set2.isEmpty();
                        this.zaj.unlock();
                        if (zIsEmpty) {
                        }
                    }
                    zaca zacaVar = this.zal;
                    if (zacaVar != null) {
                        zacaVar.zat();
                    }
                } finally {
                    this.zaj.unlock();
                }
            } else {
                Log.wtf("GoogleApiClientImpl", "Failed to remove pending transform - this may lead to memory leaks!", new Exception());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final ConnectionResult blockingConnect(long j10, TimeUnit timeUnit) {
        Preconditions.checkState(Looper.myLooper() != Looper.getMainLooper(), "blockingConnect must not be called on the UI thread");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        this.zaj.lock();
        try {
            Integer num = this.zaw;
            if (num == null) {
                this.zaw = Integer.valueOf(zad(this.zac.values(), false));
            } else if (num.intValue() == 2) {
                throw new IllegalStateException("Cannot call blockingConnect() when sign-in mode is set to SIGN_IN_MODE_OPTIONAL. Call connect(SIGN_IN_MODE_OPTIONAL) instead.");
            }
            zal(((Integer) Preconditions.checkNotNull(this.zaw)).intValue());
            this.zak.zab();
            ConnectionResult connectionResultZac = ((zaca) Preconditions.checkNotNull(this.zal)).zac(j10, timeUnit);
            this.zaj.unlock();
            return connectionResultZac;
        } catch (Throwable th2) {
            this.zaj.unlock();
            throw th2;
        }
    }

    @Override // com.google.android.gms.common.api.GoogleApiClient
    public final void connect(int i10) {
        this.zaj.lock();
        boolean z10 = true;
        if (i10 != 3 && i10 != 1) {
            if (i10 == 2) {
                i10 = 2;
            } else {
                z10 = false;
            }
        }
        try {
            Preconditions.checkArgument(z10, "Illegal sign-in mode: " + i10);
            zal(i10);
            zan();
        } finally {
            this.zaj.unlock();
        }
    }
}

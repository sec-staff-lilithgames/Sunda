package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusExceptionMapper;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnTokenCanceledListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.inmobi.commons.core.configs.CrashConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class FusedLocationProviderClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public static final String KEY_MOCK_LOCATION = "mockLocation";
    public static final String KEY_VERTICAL_ACCURACY = "verticalAccuracy";

    public FusedLocationProviderClient(Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, (StatusExceptionMapper) new ApiExceptionMapper());
    }

    private final Task<Void> zze(final com.google.android.gms.internal.location.zzba zzbaVar, final LocationCallback locationCallback, Looper looper, final zzan zzanVar, int i10) {
        final ListenerHolder listenerHolderCreateListenerHolder = ListenerHolders.createListenerHolder(locationCallback, com.google.android.gms.internal.location.zzbj.zza(looper), "LocationCallback");
        final zzak zzakVar = new zzak(this, listenerHolderCreateListenerHolder);
        return doRegisterEventListener(RegistrationMethods.builder().register(new RemoteCall(this, zzakVar, locationCallback, zzanVar, zzbaVar, listenerHolderCreateListenerHolder) { // from class: com.google.android.gms.location.zzae
            private final FusedLocationProviderClient zza;
            private final zzap zzb;
            private final LocationCallback zzc;
            private final zzan zzd;
            private final com.google.android.gms.internal.location.zzba zze;
            private final ListenerHolder zzf;

            {
                this.zza = this;
                this.zzb = zzakVar;
                this.zzc = locationCallback;
                this.zzd = zzanVar;
                this.zze = zzbaVar;
                this.zzf = listenerHolderCreateListenerHolder;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zza.zzb(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
            }
        }).unregister(zzakVar).withHolder(listenerHolderCreateListenerHolder).setMethodKey(i10).build());
    }

    public Task<Void> flushLocations() {
        return doWrite(TaskApiCall.builder().run(zzw.zza).setMethodKey(2422).build());
    }

    public Task<Location> getCurrentLocation(int i10, final CancellationToken cancellationToken) {
        LocationRequest locationRequestCreate = LocationRequest.create();
        locationRequestCreate.setPriority(i10);
        locationRequestCreate.setInterval(0L);
        locationRequestCreate.setFastestInterval(0L);
        locationRequestCreate.setExpirationDuration(CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        final com.google.android.gms.internal.location.zzba zzbaVarZza = com.google.android.gms.internal.location.zzba.zza(null, locationRequestCreate);
        zzbaVarZza.zzd(true);
        zzbaVarZza.zzb(10000L);
        Task taskDoRead = doRead(TaskApiCall.builder().run(new RemoteCall(this, cancellationToken, zzbaVarZza) { // from class: com.google.android.gms.location.zzab
            private final FusedLocationProviderClient zza;
            private final CancellationToken zzb;
            private final com.google.android.gms.internal.location.zzba zzc;

            {
                this.zza = this;
                this.zzb = cancellationToken;
                this.zzc = zzbaVarZza;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zza.zzc(this.zzb, this.zzc, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
            }
        }).setFeatures(zzu.zzd).setMethodKey(2415).build());
        if (cancellationToken == null) {
            return taskDoRead;
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
        taskDoRead.continueWithTask(new Continuation(taskCompletionSource) { // from class: com.google.android.gms.location.zzac
            private final TaskCompletionSource zza;

            {
                this.zza = taskCompletionSource;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                TaskCompletionSource taskCompletionSource2 = this.zza;
                if (task.isSuccessful()) {
                    taskCompletionSource2.trySetResult((Location) task.getResult());
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        taskCompletionSource2.setException(exception);
                    }
                }
                return taskCompletionSource2.getTask();
            }
        });
        return taskCompletionSource.getTask();
    }

    public Task<Location> getLastLocation() {
        return doRead(TaskApiCall.builder().run(new RemoteCall(this) { // from class: com.google.android.gms.location.zzv
            private final FusedLocationProviderClient zza;

            {
                this.zza = this;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zza.zzd((com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(2414).build());
    }

    public Task<LocationAvailability> getLocationAvailability() {
        return doRead(TaskApiCall.builder().run(zzad.zza).setMethodKey(2416).build());
    }

    public Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(pendingIntent) { // from class: com.google.android.gms.location.zzag
            private final PendingIntent zza;

            {
                this.zza = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzG(this.zza, new zzao((TaskCompletionSource) obj2));
            }
        }).setMethodKey(2418).build());
    }

    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, final PendingIntent pendingIntent) {
        final com.google.android.gms.internal.location.zzba zzbaVarZza = com.google.android.gms.internal.location.zzba.zza(null, locationRequest);
        return doWrite(TaskApiCall.builder().run(new RemoteCall(this, zzbaVarZza, pendingIntent) { // from class: com.google.android.gms.location.zzaf
            private final FusedLocationProviderClient zza;
            private final com.google.android.gms.internal.location.zzba zzb;
            private final PendingIntent zzc;

            {
                this.zza = this;
                this.zzb = zzbaVarZza;
                this.zzc = pendingIntent;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                this.zza.zza(this.zzb, this.zzc, (com.google.android.gms.internal.location.zzaz) obj, (TaskCompletionSource) obj2);
            }
        }).setMethodKey(2417).build());
    }

    public Task<Void> setMockLocation(final Location location) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(location) { // from class: com.google.android.gms.location.zzai
            private final Location zza;

            {
                this.zza = location;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzJ(this.zza);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2421).build());
    }

    public Task<Void> setMockMode(final boolean z10) {
        return doWrite(TaskApiCall.builder().run(new RemoteCall(z10) { // from class: com.google.android.gms.location.zzah
            private final boolean zza;

            {
                this.zza = z10;
            }

            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) throws RemoteException {
                ((com.google.android.gms.internal.location.zzaz) obj).zzI(this.zza);
                ((TaskCompletionSource) obj2).setResult(null);
            }
        }).setMethodKey(2420).build());
    }

    public final /* synthetic */ void zza(com.google.android.gms.internal.location.zzba zzbaVar, PendingIntent pendingIntent, com.google.android.gms.internal.location.zzaz zzazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzao zzaoVar = new zzao(taskCompletionSource);
        zzbaVar.zzc(getContextAttributionTag());
        zzazVar.zzD(zzbaVar, pendingIntent, zzaoVar);
    }

    public final /* synthetic */ void zzb(final zzap zzapVar, final LocationCallback locationCallback, final zzan zzanVar, com.google.android.gms.internal.location.zzba zzbaVar, ListenerHolder listenerHolder, com.google.android.gms.internal.location.zzaz zzazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        zzam zzamVar = new zzam(taskCompletionSource, new zzan(this, zzapVar, locationCallback, zzanVar) { // from class: com.google.android.gms.location.zzx
            private final FusedLocationProviderClient zza;
            private final zzap zzb;
            private final LocationCallback zzc;
            private final zzan zzd;

            {
                this.zza = this;
                this.zzb = zzapVar;
                this.zzc = locationCallback;
                this.zzd = zzanVar;
            }

            @Override // com.google.android.gms.location.zzan
            public final void zza() {
                FusedLocationProviderClient fusedLocationProviderClient = this.zza;
                zzap zzapVar2 = this.zzb;
                LocationCallback locationCallback2 = this.zzc;
                zzan zzanVar2 = this.zzd;
                zzapVar2.zzb(false);
                fusedLocationProviderClient.removeLocationUpdates(locationCallback2);
                if (zzanVar2 != null) {
                    zzanVar2.zza();
                }
            }
        });
        zzbaVar.zzc(getContextAttributionTag());
        zzazVar.zzB(zzbaVar, listenerHolder, zzamVar);
    }

    public final /* synthetic */ void zzc(CancellationToken cancellationToken, com.google.android.gms.internal.location.zzba zzbaVar, com.google.android.gms.internal.location.zzaz zzazVar, final TaskCompletionSource taskCompletionSource) throws RemoteException {
        final zzaj zzajVar = new zzaj(this, taskCompletionSource);
        if (cancellationToken != null) {
            cancellationToken.onCanceledRequested(new OnTokenCanceledListener(this, zzajVar) { // from class: com.google.android.gms.location.zzy
                private final FusedLocationProviderClient zza;
                private final LocationCallback zzb;

                {
                    this.zza = this;
                    this.zzb = zzajVar;
                }

                @Override // com.google.android.gms.tasks.OnTokenCanceledListener
                public final void onCanceled() {
                    this.zza.removeLocationUpdates(this.zzb);
                }
            });
        }
        zze(zzbaVar, zzajVar, Looper.getMainLooper(), new zzan(taskCompletionSource) { // from class: com.google.android.gms.location.zzz
            private final TaskCompletionSource zza;

            {
                this.zza = taskCompletionSource;
            }

            @Override // com.google.android.gms.location.zzan
            public final void zza() {
                this.zza.trySetResult(null);
            }
        }, 2437).continueWithTask(new Continuation(taskCompletionSource) { // from class: com.google.android.gms.location.zzaa
            private final TaskCompletionSource zza;

            {
                this.zza = taskCompletionSource;
            }

            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                TaskCompletionSource taskCompletionSource2 = this.zza;
                if (!task.isSuccessful()) {
                    if (task.getException() != null) {
                        Exception exception = task.getException();
                        if (exception != null) {
                            taskCompletionSource2.setException(exception);
                        }
                    } else {
                        taskCompletionSource2.trySetResult(null);
                    }
                }
                return taskCompletionSource2.getTask();
            }
        });
    }

    public final /* synthetic */ void zzd(com.google.android.gms.internal.location.zzaz zzazVar, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(zzazVar.zzz(getContextAttributionTag()));
    }

    public FusedLocationProviderClient(Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, new ApiExceptionMapper());
    }

    public Task<Void> removeLocationUpdates(LocationCallback locationCallback) {
        return TaskUtil.toVoidTaskThatFailsOnFalse(doUnregisterEventListener(ListenerHolders.createListenerKey(locationCallback, "LocationCallback")));
    }

    public Task<Void> requestLocationUpdates(LocationRequest locationRequest, LocationCallback locationCallback, Looper looper) {
        return zze(com.google.android.gms.internal.location.zzba.zza(null, locationRequest), locationCallback, looper, null, 2436);
    }
}

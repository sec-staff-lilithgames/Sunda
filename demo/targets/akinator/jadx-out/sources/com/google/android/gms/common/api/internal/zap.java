package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;

    public zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new AtomicReference(null);
        this.zad = new com.google.android.gms.internal.base.zau(Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zaa(ConnectionResult connectionResult, int i10) {
        this.zab.set(null);
        zab(connectionResult, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zad() {
        this.zab.set(null);
        zac();
    }

    private static final int zae(zam zamVar) {
        if (zamVar == null) {
            return -1;
        }
        return zamVar.zaa();
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i10, int i11, Intent intent) {
        zam zamVar = (zam) this.zab.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                if (iIsGooglePlayServicesAvailable == 0) {
                    zad();
                    return;
                } else {
                    if (zamVar == null) {
                        return;
                    }
                    if (zamVar.zab().getErrorCode() == 18 && iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            zad();
            return;
        } else if (i11 == 0) {
            if (zamVar != null) {
                zaa(new ConnectionResult(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, zamVar.zab().toString()), zae(zamVar));
                return;
            }
            return;
        }
        if (zamVar != null) {
            zaa(zamVar.zab(), zamVar.zaa());
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        zaa(new ConnectionResult(13, null), zae((zam) this.zab.get()));
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        zam zamVar = (zam) this.zab.get();
        if (zamVar == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", zamVar.zaa());
        bundle.putInt("failed_status", zamVar.zab().getErrorCode());
        bundle.putParcelable("failed_resolution", zamVar.zab().getResolution());
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        super.onStart();
        this.zaa = true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        super.onStop();
        this.zaa = false;
    }

    public abstract void zab(ConnectionResult connectionResult, int i10);

    public abstract void zac();

    public final void zah(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        zam zamVar = new zam(connectionResult, i10);
        do {
            atomicReference = this.zab;
            while (!atomicReference.compareAndSet(null, zamVar)) {
                if (atomicReference.get() != null) {
                }
            }
            this.zad.post(new zao(this, zamVar));
            return;
        } while (atomicReference.get() == null);
    }
}

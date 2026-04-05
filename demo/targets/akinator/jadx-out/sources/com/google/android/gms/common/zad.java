package com.google.android.gms.common;

import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.base.zau;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zad extends zau {
    final /* synthetic */ GoogleApiAvailability zaa;
    private final Context zab;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zad(GoogleApiAvailability googleApiAvailability, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.zaa = googleApiAvailability;
        this.zab = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Resources.NotFoundException {
        int i10 = message.what;
        if (i10 != 1) {
            o2.u(i10, "Don't know how to handle this message: ", "GoogleApiAvailability");
            return;
        }
        GoogleApiAvailability googleApiAvailability = this.zaa;
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(this.zab);
        if (googleApiAvailability.isUserResolvableError(iIsGooglePlayServicesAvailable)) {
            this.zaa.showErrorNotification(this.zab, iIsGooglePlayServicesAvailable);
        }
    }
}

package com.google.android.gms.ads;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbvb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class NotificationHandlerActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            zzbvb zzbvbVarZzk = zzbb.zzb().zzk(this, new zzbrf());
            if (zzbvbVarZzk == null) {
                zzo.zzf("OfflineUtils is null");
            } else {
                zzbvbVarZzk.zze(getIntent());
            }
        } catch (RemoteException e10) {
            zzo.zzf("RemoteException calling handleNotificationIntent: ".concat(e10.toString()));
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        finish();
    }
}

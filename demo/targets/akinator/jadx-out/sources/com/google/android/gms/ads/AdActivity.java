package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbvi;
import hr.kNq.ikJMrW;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    private zzbvi zza;

    private final void zza() {
        zzbvi zzbviVar = this.zza;
        if (zzbviVar != null) {
            try {
                zzbviVar.zzs();
            } catch (RemoteException e10) {
                zzo.zzl("#007 Could not call remote method.", e10);
            }
        }
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i10, int i11, Intent intent) {
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzm(i10, i11, intent);
            }
        } catch (Exception e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                if (!zzbviVar.zzg()) {
                    return;
                }
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        super.onBackPressed();
        try {
            zzbvi zzbviVar2 = this.zza;
            if (zzbviVar2 != null) {
                zzbviVar2.zze();
            }
        } catch (RemoteException e11) {
            zzo.zzl("#007 Could not call remote method.", e11);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzn(ObjectWrapper.wrap(configuration));
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzo.zzd("AdActivity onCreate");
        zzbvi zzbviVarZzh = zzbb.zzb().zzh(this);
        this.zza = zzbviVarZzh;
        if (zzbviVarZzh == null) {
            zzo.zzl("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzbviVarZzh.zzh(bundle);
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        zzo.zzd("AdActivity onDestroy");
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzq();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final void onPause() {
        zzo.zzd("AdActivity onPause");
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzl();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzH(i10, strArr, iArr);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        zzo.zzd("AdActivity onRestart");
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzi();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onResume() {
        zzo.zzd("AdActivity onResume");
        super.onResume();
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzk();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzo(bundle);
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public final void onStart() {
        super.onStart();
        zzo.zzd("AdActivity onStart");
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzj();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzf();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i10) {
        super.setContentView(i10);
        zza();
    }

    @Override // android.app.Activity
    public final void onStop() {
        zzo.zzd(ikJMrW.lbYxZlLOktUTw);
        try {
            zzbvi zzbviVar = this.zza;
            if (zzbviVar != null) {
                zzbviVar.zzp();
            }
        } catch (RemoteException e10) {
            zzo.zzl("#007 Could not call remote method.", e10);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zza();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zza();
    }
}

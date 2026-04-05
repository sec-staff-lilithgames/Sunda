package com.google.android.gms.internal.gtm;

import android.util.Log;
import com.google.android.gms.analytics.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzct implements Logger {
    private int zza = 2;
    private boolean zzb;

    @Override // com.google.android.gms.analytics.Logger
    public final void error(Exception exc) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final int getLogLevel() {
        return this.zza;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void setLogLevel(int i10) {
        this.zza = i10;
        if (this.zzb) {
            return;
        }
        zzeg zzegVar = zzeh.zzb;
        Log.i((String) zzegVar.zzb(), "Logger is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag." + ((String) zzegVar.zzb()) + " DEBUG");
        this.zzb = true;
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void error(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void info(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void verbose(String str) {
    }

    @Override // com.google.android.gms.analytics.Logger
    public final void warn(String str) {
    }
}

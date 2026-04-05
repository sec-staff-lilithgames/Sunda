package com.google.android.gms.common.stats;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public class WakeLockTracker {
    private static final WakeLockTracker zza = new WakeLockTracker();

    public static WakeLockTracker getInstance() {
        return zza;
    }

    public void registerEvent(Context context, String str, int i10, String str2, String str3, String str4, int i11, List<String> list) {
    }

    public void registerEvent(Context context, String str, int i10, String str2, String str3, String str4, int i11, List<String> list, long j10) {
    }

    public void registerReleaseEvent(Context context, Intent intent) {
    }

    public void registerDeadlineEvent(Context context, String str, String str2, String str3, int i10, List<String> list, boolean z10, long j10) {
    }

    public void registerAcquireEvent(Context context, Intent intent, String str, String str2, String str3, int i10, String str4) {
    }
}

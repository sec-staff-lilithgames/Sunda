package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import io.bidmachine.protobuf.sdk.App;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f60377a;

    public i0(j0 j0Var) {
        this.f60377a = j0Var;
    }

    public final void a(Context context, App.Builder builder) {
        String appVersion = nm.j.getAppVersion(context);
        if (!TextUtils.isEmpty(appVersion)) {
            builder.setAppVer(appVersion);
        }
        String appName = nm.j.getAppName(context);
        if (!TextUtils.isEmpty(appName)) {
            builder.setAppName(appName);
        }
        builder.setInstallTime(pr.i.msToProtobufTimestamp(e3.f60347a.get()));
        n1 n1VarA = n1.a();
        long j10 = n1VarA.f61941x;
        if (j10 == 0) {
            SharedPreferences sharedPreferencesE = jh.i.E(context);
            long jOptLong = pr.m.optLong(sharedPreferencesE, "first_app_launch_ms", 0L);
            if (jOptLong != 0) {
                j10 = jOptLong;
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                pr.m.putLong(sharedPreferencesE, "first_app_launch_ms", Long.valueOf(jCurrentTimeMillis));
                j10 = jCurrentTimeMillis;
            }
            n1VarA.f61941x = j10;
        }
        builder.setFirstLaunchTime(pr.i.msToProtobufTimestamp(j10));
        this.f60377a.getClass();
        builder.setRelease(j0.a(context));
    }
}

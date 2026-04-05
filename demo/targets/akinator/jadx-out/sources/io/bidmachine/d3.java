package io.bidmachine;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final InstallReferrerClient f60340a;

    public d3(Context context) {
        this.f60340a = InstallReferrerClient.newBuilder(context).build();
    }

    public static long a(InstallReferrerClient installReferrerClient) {
        try {
            long installBeginTimestampSeconds = installReferrerClient.getInstallReferrer().getInstallBeginTimestampSeconds();
            if (installBeginTimestampSeconds != 0) {
                return installBeginTimestampSeconds * 1000;
            }
            return 0L;
        } catch (Exception e10) {
            nm.a.w(e10);
            return 0L;
        }
    }

    public final void b() {
        try {
            this.f60340a.startConnection(new c3(this));
        } catch (Throwable th2) {
            nm.a.w(th2);
        }
    }
}

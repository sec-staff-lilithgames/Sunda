package w;

import android.app.Notification;
import android.os.Bundle;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.ZQ.duhsDlGWdBkekB;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f90278a;

    /* renamed from: b, reason: collision with root package name */
    public final int f90279b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f90280c;

    /* renamed from: d, reason: collision with root package name */
    public final String f90281d;

    public g(String str, int i10, Notification notification, String str2) {
        this.f90278a = str;
        this.f90279b = i10;
        this.f90280c = notification;
        this.f90281d = str2;
    }

    public static g fromBundle(Bundle bundle) {
        p.n(bundle, "android.support.customtabs.trusted.PLATFORM_TAG");
        p.n(bundle, "android.support.customtabs.trusted.PLATFORM_ID");
        p.n(bundle, "android.support.customtabs.trusted.NOTIFICATION");
        p.n(bundle, "android.support.customtabs.trusted.CHANNEL_NAME");
        return new g(bundle.getString("android.support.customtabs.trusted.PLATFORM_TAG"), bundle.getInt("android.support.customtabs.trusted.PLATFORM_ID"), (Notification) bundle.getParcelable("android.support.customtabs.trusted.NOTIFICATION"), bundle.getString("android.support.customtabs.trusted.CHANNEL_NAME"));
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putString("android.support.customtabs.trusted.PLATFORM_TAG", this.f90278a);
        bundle.putInt("android.support.customtabs.trusted.PLATFORM_ID", this.f90279b);
        bundle.putParcelable(duhsDlGWdBkekB.oMGNeNhegklijRL, this.f90280c);
        bundle.putString("android.support.customtabs.trusted.CHANNEL_NAME", this.f90281d);
        return bundle;
    }
}

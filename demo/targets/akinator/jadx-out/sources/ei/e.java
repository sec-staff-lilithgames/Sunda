package ei;

import android.content.Context;
import hi.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final Context f54401a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.localbroadcastmanager.content.b f54402b = null;

    public e(Context context) {
        this.f54401a = context;
    }

    public static boolean isUnity(Context context) {
        return j.getResourcesIdentifier(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    public String getDevelopmentPlatform() {
        if (this.f54402b == null) {
            this.f54402b = new androidx.localbroadcastmanager.content.b(this);
        }
        return (String) this.f54402b.f6756a;
    }

    public String getDevelopmentPlatformVersion() {
        if (this.f54402b == null) {
            this.f54402b = new androidx.localbroadcastmanager.content.b(this);
        }
        return (String) this.f54402b.f6757b;
    }
}

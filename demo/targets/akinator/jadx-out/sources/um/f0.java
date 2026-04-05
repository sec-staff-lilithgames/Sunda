package um;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f88569a;

    public f0(Context context) {
        this.f88569a = context.getApplicationContext();
    }

    public boolean hasTelephony() {
        return this.f88569a.getPackageManager().hasSystemFeature("android.hardware.telephony");
    }
}

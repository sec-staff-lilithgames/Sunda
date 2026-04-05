package hi;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Float f58802a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f58803b;

    public e(Float f10, boolean z10) {
        this.f58803b = z10;
        this.f58802a = f10;
    }

    public static e get(Context context) {
        boolean z10 = false;
        Float fValueOf = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra != -1 && (intExtra == 2 || intExtra == 5)) {
                    z10 = true;
                }
                int intExtra2 = intentRegisterReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
                int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra2 != -1 && intExtra3 != -1) {
                    fValueOf = Float.valueOf(intExtra2 / intExtra3);
                }
            }
        } catch (IllegalStateException e10) {
            ei.f.getLogger().e("An error occurred getting battery state.", e10);
        }
        return new e(fValueOf, z10);
    }

    public Float getBatteryLevel() {
        return this.f58802a;
    }

    public int getBatteryVelocity() {
        Float f10;
        if (!this.f58803b || (f10 = this.f58802a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}

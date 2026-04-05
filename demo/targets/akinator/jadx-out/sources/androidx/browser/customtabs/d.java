package androidx.browser.customtabs;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f5208a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f5209b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f5210c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f5211d;

    public d(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f5208a = num;
        this.f5209b = num2;
        this.f5210c = num3;
        this.f5211d = num4;
    }

    public static d a(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle(0);
        }
        return new d((Integer) bundle.get("android.support.customtabs.extra.TOOLBAR_COLOR"), (Integer) bundle.get("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR"), (Integer) bundle.get("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR"));
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        Integer num = this.f5208a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f5209b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f5210c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f5211d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}

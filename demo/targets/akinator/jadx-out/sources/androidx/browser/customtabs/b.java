package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f5199a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5200b;

    /* renamed from: c, reason: collision with root package name */
    public final PendingIntent f5201c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5202d;

    public b(int i10, int i11, PendingIntent pendingIntent, String str) {
        this.f5199a = i10;
        this.f5200b = str;
        this.f5201c = pendingIntent;
        this.f5202d = i11;
    }

    public static b a(Bundle bundle) {
        if (!bundle.containsKey("androidx.browser.customtabs.customcontentaction.ID")) {
            return null;
        }
        int i10 = bundle.getInt("androidx.browser.customtabs.customcontentaction.ID");
        String string = bundle.getString("androidx.browser.customtabs.customcontentaction.LABEL");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        PendingIntent pendingIntent = Build.VERSION.SDK_INT >= 33 ? (PendingIntent) bundle.getParcelable("androidx.browser.customtabs.customcontentaction.PENDING_INTENT", PendingIntent.class) : (PendingIntent) bundle.getParcelable("androidx.browser.customtabs.customcontentaction.PENDING_INTENT");
        if (pendingIntent == null) {
            return null;
        }
        int i11 = bundle.getInt("androidx.browser.customtabs.customcontentaction.TARGET_TYPE", 0);
        if (i11 == 1 || i11 == 2) {
            return new b(i10, i11, pendingIntent, string);
        }
        return null;
    }

    public int getId() {
        return this.f5199a;
    }

    public String getLabel() {
        return this.f5200b;
    }

    public PendingIntent getPendingIntent() {
        return this.f5201c;
    }

    public int getTargetType() {
        return this.f5202d;
    }
}

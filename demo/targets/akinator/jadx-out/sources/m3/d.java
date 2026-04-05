package m3;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    public static Intent createManageUnusedAppRestrictionsIntent(Context context, String str) {
        if (!h.areUnusedAppRestrictionsAvailable(context.getPackageManager())) {
            throw new UnsupportedOperationException("Unused App Restriction features are not available on this device");
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", str, null));
        }
        Intent data = new Intent("android.intent.action.AUTO_REVOKE_PERMISSIONS").setData(Uri.fromParts("package", str, null));
        return i10 >= 30 ? data : data.setPackage((String) w3.i.checkNotNull(h.getPermissionRevocationVerifierApp(context.getPackageManager())));
    }

    public static Parcelable[] getParcelableArrayExtra(Intent intent, String str, Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) androidx.browser.customtabs.a.e(intent, str, cls) : intent.getParcelableArrayExtra(str);
    }

    public static <T> ArrayList<T> getParcelableArrayListExtra(Intent intent, String str, Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? androidx.browser.customtabs.a.g(intent, str, cls) : intent.getParcelableArrayListExtra(str);
    }

    public static <T> T getParcelableExtra(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.browser.customtabs.a.h(intent, str, cls);
        }
        T t10 = (T) intent.getParcelableExtra(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    public static <T extends Serializable> T getSerializableExtra(Intent intent, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.browser.customtabs.a.j(intent, str, cls);
        }
        T t10 = (T) intent.getSerializableExtra(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    public static Intent makeMainSelectorActivity(String str, String str2) {
        return Intent.makeMainSelectorActivity(str, str2);
    }
}

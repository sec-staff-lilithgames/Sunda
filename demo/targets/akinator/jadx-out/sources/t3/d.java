package t3;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {
    @Deprecated
    public static IBinder getBinder(Bundle bundle, String str) {
        return bundle.getBinder(str);
    }

    public static <T> T getParcelable(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.browser.customtabs.a.c(bundle, str, cls);
        }
        T t10 = (T) bundle.getParcelable(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    public static Parcelable[] getParcelableArray(Bundle bundle, String str, Class<? extends Parcelable> cls) {
        return Build.VERSION.SDK_INT >= 34 ? (Parcelable[]) androidx.browser.customtabs.a.d(bundle, str, cls) : bundle.getParcelableArray(str);
    }

    public static <T> ArrayList<T> getParcelableArrayList(Bundle bundle, String str, Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? androidx.browser.customtabs.a.f(bundle, str, cls) : bundle.getParcelableArrayList(str);
    }

    public static <T extends Serializable> T getSerializable(Bundle bundle, String str, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return (T) androidx.browser.customtabs.a.i(bundle, str, cls);
        }
        T t10 = (T) bundle.getSerializable(str);
        if (cls.isInstance(t10)) {
            return t10;
        }
        return null;
    }

    public static <T> SparseArray<T> getSparseParcelableArray(Bundle bundle, String str, Class<? extends T> cls) {
        return Build.VERSION.SDK_INT >= 34 ? androidx.browser.customtabs.a.l(bundle, str, cls) : bundle.getSparseParcelableArray(str);
    }

    @Deprecated
    public static void putBinder(Bundle bundle, String str, IBinder iBinder) {
        bundle.putBinder(str, iBinder);
    }
}

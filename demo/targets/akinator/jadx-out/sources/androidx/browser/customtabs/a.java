package androidx.browser.customtabs;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Insets;
import android.graphics.Path;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.SparseArray;
import android.view.DisplayCutout;
import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a {
    public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2, Path path) {
        DisplayCutout.Builder waterfallInsets = new DisplayCutout.Builder().setSafeInsets(insets).setWaterfallInsets(insets2);
        if (rect != null) {
            waterfallInsets.setBoundingRectLeft(rect);
        }
        if (rect2 != null) {
            waterfallInsets.setBoundingRectTop(rect2);
        }
        if (rect3 != null) {
            waterfallInsets.setBoundingRectRight(rect3);
        }
        if (rect4 != null) {
            waterfallInsets.setBoundingRectBottom(rect4);
        }
        if (path != null) {
            waterfallInsets.setCutoutPath(path);
        }
        return waterfallInsets.build();
    }

    public static Object b(Bundle bundle, String str) {
        return bundle.getParcelable(str, Uri.class);
    }

    public static Object c(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] d(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArray(str, cls);
    }

    public static Object[] e(Intent intent, String str, Class cls) {
        return intent.getParcelableArrayExtra(str, cls);
    }

    public static ArrayList f(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static ArrayList g(Intent intent, String str, Class cls) {
        return intent.getParcelableArrayListExtra(str, cls);
    }

    public static Object h(Intent intent, String str, Class cls) {
        return intent.getParcelableExtra(str, cls);
    }

    public static Serializable i(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static Serializable j(Intent intent, String str, Class cls) {
        return intent.getSerializableExtra(str, cls);
    }

    public static ServiceInfo k(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    public static SparseArray l(Bundle bundle, String str, Class cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    public static LocaleList m(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static LocaleList n(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }

    public static PackageManager.ComponentInfoFlags o() {
        return PackageManager.ComponentInfoFlags.of(640L);
    }
}

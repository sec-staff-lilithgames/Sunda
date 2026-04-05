package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k3.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: b, reason: collision with root package name */
    public static Field f5735b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f5736c;

    /* renamed from: e, reason: collision with root package name */
    public static Field f5738e;

    /* renamed from: f, reason: collision with root package name */
    public static Field f5739f;

    /* renamed from: g, reason: collision with root package name */
    public static Field f5740g;

    /* renamed from: h, reason: collision with root package name */
    public static Field f5741h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f5742i;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f5734a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f5737d = new Object();

    public static boolean a() throws NoSuchFieldException, ClassNotFoundException, SecurityException {
        if (f5742i) {
            return false;
        }
        try {
            if (f5738e == null) {
                Class<?> cls = Class.forName("android.app.Notification$Action");
                f5739f = cls.getDeclaredField("icon");
                f5740g = cls.getDeclaredField("title");
                f5741h = cls.getDeclaredField("actionIntent");
                Field declaredField = Notification.class.getDeclaredField("actions");
                f5738e = declaredField;
                declaredField.setAccessible(true);
            }
        } catch (ClassNotFoundException e10) {
            Log.e("NotificationCompat", "Unable to access notification actions", e10);
            f5742i = true;
        } catch (NoSuchFieldException e11) {
            Log.e("NotificationCompat", "Unable to access notification actions", e11);
            f5742i = true;
        }
        return !f5742i;
    }

    public static g1[] b(Bundle[] bundleArr) {
        if (bundleArr == null) {
            return null;
        }
        g1[] g1VarArr = new g1[bundleArr.length];
        for (int i10 = 0; i10 < bundleArr.length; i10++) {
            Bundle bundle = bundleArr[i10];
            ArrayList<String> stringArrayList = bundle.getStringArrayList("allowedDataTypes");
            HashSet hashSet = new HashSet();
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next());
                }
            }
            g1VarArr[i10] = new g1(bundle.getString("resultKey"), bundle.getCharSequence("label"), bundle.getCharSequenceArray("choices"), bundle.getBoolean("allowFreeFormInput"), 0, bundle.getBundle("extras"), hashSet);
        }
        return g1VarArr;
    }

    public static SparseArray<Bundle> buildActionExtrasMap(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            Bundle bundle = list.get(i10);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(i10, bundle);
            }
        }
        return sparseArray;
    }

    public static Object[] c(Notification notification) {
        synchronized (f5737d) {
            if (!a()) {
                return null;
            }
            try {
                return (Object[]) f5738e.get(notification);
            } catch (IllegalAccessException e10) {
                Log.e("NotificationCompat", "Unable to access notification actions", e10);
                f5742i = true;
                return null;
            }
        }
    }

    public static Bundle[] d(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Bundle[]) || parcelableArray == null) {
            return (Bundle[]) parcelableArray;
        }
        Bundle[] bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
        bundle.putParcelableArray(str, bundleArr);
        return bundleArr;
    }

    public static Bundle[] e(g1[] g1VarArr) {
        if (g1VarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[g1VarArr.length];
        for (int i10 = 0; i10 < g1VarArr.length; i10++) {
            g1 g1Var = g1VarArr[i10];
            Bundle bundle = new Bundle();
            bundle.putString("resultKey", g1Var.getResultKey());
            bundle.putCharSequence("label", g1Var.getLabel());
            bundle.putCharSequenceArray("choices", g1Var.getChoices());
            bundle.putBoolean("allowFreeFormInput", g1Var.getAllowFreeFormInput());
            bundle.putBundle("extras", g1Var.getExtras());
            Set<String> allowedDataTypes = g1Var.getAllowedDataTypes();
            if (allowedDataTypes != null && !allowedDataTypes.isEmpty()) {
                ArrayList<String> arrayList = new ArrayList<>(allowedDataTypes.size());
                Iterator<String> it = allowedDataTypes.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                bundle.putStringArrayList("allowedDataTypes", arrayList);
            }
            bundleArr[i10] = bundle;
        }
        return bundleArr;
    }

    public static NotificationCompat.a getAction(Notification notification, int i10) {
        SparseArray sparseParcelableArray;
        synchronized (f5737d) {
            try {
                try {
                    Object[] objArrC = c(notification);
                    if (objArrC != null) {
                        Object obj = objArrC[i10];
                        Bundle extras = getExtras(notification);
                        return readAction(f5739f.getInt(obj), (CharSequence) f5740g.get(obj), (PendingIntent) f5741h.get(obj), (extras == null || (sparseParcelableArray = extras.getSparseParcelableArray("android.support.actionExtras")) == null) ? null : (Bundle) sparseParcelableArray.get(i10));
                    }
                } catch (IllegalAccessException e10) {
                    Log.e("NotificationCompat", "Unable to access notification actions", e10);
                    f5742i = true;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static int getActionCount(Notification notification) {
        int length;
        synchronized (f5737d) {
            try {
                Object[] objArrC = c(notification);
                length = objArrC != null ? objArrC.length : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return length;
    }

    public static Bundle getExtras(Notification notification) {
        synchronized (f5734a) {
            if (f5736c) {
                return null;
            }
            try {
                if (f5735b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f5736c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f5735b = declaredField;
                }
                Bundle bundle = (Bundle) f5735b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f5735b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e10) {
                Log.e("NotificationCompat", "Unable to access notification extras", e10);
                f5736c = true;
                return null;
            } catch (NoSuchFieldException e11) {
                Log.e("NotificationCompat", "Unable to access notification extras", e11);
                f5736c = true;
                return null;
            }
        }
    }

    public static NotificationCompat.a readAction(int i10, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        boolean z10;
        g1[] g1VarArr;
        g1[] g1VarArr2;
        if (bundle != null) {
            g1[] g1VarArrB = b(d(bundle, "android.support.remoteInputs"));
            g1[] g1VarArrB2 = b(d(bundle, "android.support.dataRemoteInputs"));
            z10 = bundle.getBoolean("android.support.allowGeneratedReplies");
            g1VarArr = g1VarArrB;
            g1VarArr2 = g1VarArrB2;
        } else {
            z10 = false;
            g1VarArr = null;
            g1VarArr2 = null;
        }
        return new NotificationCompat.a(i10, charSequence, pendingIntent, bundle, g1VarArr, g1VarArr2, z10, 0, true, false, false);
    }

    public static Bundle writeActionAndGetExtras(Notification.Builder builder, NotificationCompat.a aVar) {
        IconCompat iconCompat = aVar.getIconCompat();
        builder.addAction(iconCompat != null ? iconCompat.getResId() : 0, aVar.getTitle(), aVar.getActionIntent());
        Bundle bundle = new Bundle(aVar.getExtras());
        if (aVar.getRemoteInputs() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.getRemoteInputs()));
        }
        if (aVar.getDataOnlyRemoteInputs() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.getDataOnlyRemoteInputs()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.getAllowGeneratedReplies());
        return bundle;
    }
}

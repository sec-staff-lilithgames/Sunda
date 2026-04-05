package e6;

import android.R;
import android.os.Build;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f53887a = {R.attr.interpolator, R.attr.duration, R.attr.startDelay, R.attr.matchOrder};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f53888b = {R.attr.resizeClip};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f53889c = {R.attr.transitionVisibilityMode};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f53890d = {R.attr.fadingMode};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f53891e = {R.attr.transitionOrdering};

    /* renamed from: f, reason: collision with root package name */
    public static boolean f53892f = true;

    public static ArrayList a(ArrayList arrayList, Object obj) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static ArrayList b(ArrayList arrayList, Object obj) {
        if (arrayList == null) {
            return arrayList;
        }
        arrayList.remove(obj);
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public static void c(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            y0.b(viewGroup, z10);
        } else if (f53892f) {
            try {
                y0.b(viewGroup, z10);
            } catch (NoSuchMethodError unused) {
                f53892f = false;
            }
        }
    }
}

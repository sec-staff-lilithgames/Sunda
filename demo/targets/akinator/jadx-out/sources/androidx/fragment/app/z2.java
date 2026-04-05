package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: b, reason: collision with root package name */
    public static final z2 f6507b;

    /* renamed from: c, reason: collision with root package name */
    public static final z2 f6508c;

    /* renamed from: e, reason: collision with root package name */
    public static final z2 f6509e;

    /* renamed from: f, reason: collision with root package name */
    public static final z2 f6510f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ z2[] f6511g;

    static {
        z2 z2Var = new z2("REMOVED", 0);
        f6507b = z2Var;
        z2 z2Var2 = new z2("VISIBLE", 1);
        f6508c = z2Var2;
        z2 z2Var3 = new z2("GONE", 2);
        f6509e = z2Var3;
        z2 z2Var4 = new z2("INVISIBLE", 3);
        f6510f = z2Var4;
        f6511g = new z2[]{z2Var, z2Var2, z2Var3, z2Var4};
    }

    public static z2 b(int i10) {
        if (i10 == 0) {
            return f6508c;
        }
        if (i10 == 4) {
            return f6510f;
        }
        if (i10 == 8) {
            return f6509e;
        }
        throw new IllegalArgumentException(a.b.e(i10, "Unknown visibility "));
    }

    public static z2 c(View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? f6510f : b(view.getVisibility());
    }

    public static z2 valueOf(String str) {
        return (z2) Enum.valueOf(z2.class, str);
    }

    public static z2[] values() {
        return (z2[]) f6511g.clone();
    }

    public final void a(View view) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            view.setVisibility(0);
            return;
        }
        if (iOrdinal == 2) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (iOrdinal != 3) {
            return;
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}

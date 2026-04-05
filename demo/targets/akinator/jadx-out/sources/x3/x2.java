package x3;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.digidust.elokence.akinator.freemium.R;
import java.util.List;
import x3.s2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x2 extends b3 {

    /* renamed from: f, reason: collision with root package name */
    public static final PathInterpolator f91704f = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* renamed from: g, reason: collision with root package name */
    public static final y4.a f91705g = new y4.a();

    /* renamed from: h, reason: collision with root package name */
    public static final DecelerateInterpolator f91706h = new DecelerateInterpolator(1.5f);

    /* renamed from: i, reason: collision with root package name */
    public static final AccelerateInterpolator f91707i = new AccelerateInterpolator(1.5f);

    public static void a(View view, s2 s2Var) {
        s2.b bVarF = f(view);
        if (bVarF != null) {
            bVarF.onEnd(s2Var);
            if (bVarF.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10), s2Var);
            }
        }
    }

    public static void b(View view, s2 s2Var, e3 e3Var, boolean z10) {
        s2.b bVarF = f(view);
        if (bVarF != null) {
            bVarF.f91671b = e3Var;
            if (!z10) {
                bVarF.onPrepare(s2Var);
                z10 = bVarF.getDispatchMode() == 0;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                b(viewGroup.getChildAt(i10), s2Var, e3Var, z10);
            }
        }
    }

    public static void c(View view, e3 e3Var, List list) {
        s2.b bVarF = f(view);
        if (bVarF != null) {
            e3Var = bVarF.onProgress(e3Var, list);
            if (bVarF.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                c(viewGroup.getChildAt(i10), e3Var, list);
            }
        }
    }

    public static void d(View view, s2 s2Var, s2.a aVar) {
        s2.b bVarF = f(view);
        if (bVarF != null) {
            bVarF.onStart(s2Var, aVar);
            if (bVarF.getDispatchMode() == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                d(viewGroup.getChildAt(i10), s2Var, aVar);
            }
        }
    }

    public static WindowInsets e(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static s2.b f(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof w2) {
            return ((w2) tag).f91700a;
        }
        return null;
    }
}

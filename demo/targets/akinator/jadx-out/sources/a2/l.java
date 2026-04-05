package a2;

import android.content.Context;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    public final AccessibilityManager f3697a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public l(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("accessibility");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.f3697a = (AccessibilityManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a2.j
    public long calculateRecommendedTimeoutMillis(long j10, boolean z10, boolean z11, boolean z12) {
        int i10 = z10;
        if (j10 < 2147483647L) {
            if (z11) {
                i10 = (z10 ? 1 : 0) | 2;
            }
            if (z12) {
                i10 = (i10 == true ? 1 : 0) | 4;
            }
            int i11 = Build.VERSION.SDK_INT;
            AccessibilityManager accessibilityManager = this.f3697a;
            if (i11 >= 29) {
                int recommendedTimeoutMillis = z1.f3898a.getRecommendedTimeoutMillis(accessibilityManager, (int) j10, i10);
                if (recommendedTimeoutMillis == Integer.MAX_VALUE) {
                    return Long.MAX_VALUE;
                }
                return recommendedTimeoutMillis;
            }
            if (z12 && accessibilityManager.isTouchExplorationEnabled()) {
                return Long.MAX_VALUE;
            }
        }
        return j10;
    }
}

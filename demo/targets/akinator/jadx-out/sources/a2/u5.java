package a2;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u5 implements w5 {

    /* renamed from: b, reason: collision with root package name */
    public static final u5 f3858b = new u5();

    @Override // a2.w5
    public final p0.n3 createRecomposer(View rootView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(rootView, "rootView");
        return i6.createLifecycleAwareWindowRecomposer$default(rootView, null, null, 3, null);
    }
}

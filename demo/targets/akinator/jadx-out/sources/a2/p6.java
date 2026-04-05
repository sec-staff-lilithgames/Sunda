package a2;

import android.view.ViewParent;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p6 {

    /* renamed from: a, reason: collision with root package name */
    public static final p6 f3775a = new p6();

    public final void onDescendantInvalidated(t ownerView) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ownerView, "ownerView");
        ViewParent parent = ownerView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(ownerView, ownerView);
        }
    }
}

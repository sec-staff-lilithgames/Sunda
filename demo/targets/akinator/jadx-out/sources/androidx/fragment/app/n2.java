package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f6421a;

    public n2(Rect rect) {
        this.f6421a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f6421a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return rect;
    }
}

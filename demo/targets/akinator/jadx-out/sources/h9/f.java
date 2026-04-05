package h9;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final int f58705a;

    public f(int i10) {
        this.f58705a = i10;
    }

    @Override // h9.k
    public Animation build(Context context) {
        return AnimationUtils.loadAnimation(context, this.f58705a);
    }
}

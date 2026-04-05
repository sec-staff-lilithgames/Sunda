package tm;

import android.content.Context;
import android.view.GestureDetector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class c1 extends GestureDetector {

    /* renamed from: a, reason: collision with root package name */
    public final b1 f86998a;

    public c1(Context context) {
        b1 b1Var = new b1();
        b1Var.f86995b = false;
        super(context, b1Var);
        this.f86998a = b1Var;
        setIsLongpressEnabled(false);
    }

    public boolean isClicked() {
        return this.f86998a.f86995b;
    }

    public void resetClick() {
        this.f86998a.f86995b = false;
    }
}

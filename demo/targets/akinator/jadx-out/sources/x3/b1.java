package x3;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f91542b;

    public /* synthetic */ b1(Object obj, int i10) {
        this.f91541a = i10;
        this.f91542b = obj;
    }

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i10) {
        switch (this.f91541a) {
            case 0:
                ((AtomicBoolean) this.f91542b).set((i10 & 8) != 0);
                return;
            default:
                if (((z3) this.f91542b).f91725a == windowInsetsController) {
                    throw null;
                }
                return;
        }
    }
}

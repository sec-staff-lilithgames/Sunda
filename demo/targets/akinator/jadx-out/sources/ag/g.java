package ag;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import i4.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f4403b;

    public g(h hVar) {
        this.f4403b = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        h hVar = this.f4403b;
        hVar.f4406c = false;
        m mVar = ((BottomSheetBehavior) hVar.f4408e).S;
        if (mVar != null && mVar.continueSettling(true)) {
            hVar.a(hVar.f4405b);
            return;
        }
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) hVar.f4408e;
        if (bottomSheetBehavior.Q == 2) {
            bottomSheetBehavior.j(hVar.f4405b);
        }
    }
}

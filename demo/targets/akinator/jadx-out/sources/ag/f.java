package ag;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import y3.p;
import y3.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f implements x {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4401b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f4402c;

    public f(BottomSheetBehavior bottomSheetBehavior, int i10) {
        this.f4402c = bottomSheetBehavior;
        this.f4401b = i10;
    }

    @Override // y3.x
    public boolean perform(View view, p pVar) {
        this.f4402c.setState(this.f4401b);
        return true;
    }
}

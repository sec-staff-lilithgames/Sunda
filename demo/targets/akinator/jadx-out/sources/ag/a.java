package ag;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f4392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4393c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f4394e;

    public a(BottomSheetBehavior bottomSheetBehavior, View view, int i10) {
        this.f4394e = bottomSheetBehavior;
        this.f4392b = view;
        this.f4393c = i10;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f4394e.l(this.f4392b, this.f4393c, false);
    }
}

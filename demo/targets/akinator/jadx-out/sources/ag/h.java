package ag;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4404a;

    /* renamed from: b, reason: collision with root package name */
    public int f4405b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4406c;

    /* renamed from: d, reason: collision with root package name */
    public final Runnable f4407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout.a f4408e;

    public h(SideSheetBehavior sideSheetBehavior) {
        this.f4404a = 1;
        this.f4408e = sideSheetBehavior;
        this.f4407d = new zg.h(this, 0);
    }

    public final void a(int i10) {
        switch (this.f4404a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f4408e;
                WeakReference weakReference = bottomSheetBehavior.f28980a0;
                if (weakReference != null && weakReference.get() != null) {
                    this.f4405b = i10;
                    if (!this.f4406c) {
                        ((View) bottomSheetBehavior.f28980a0.get()).postOnAnimation((g) this.f4407d);
                        this.f4406c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f4408e;
                WeakReference weakReference2 = sideSheetBehavior.f29380s;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f4405b = i10;
                    if (!this.f4406c) {
                        ((View) sideSheetBehavior.f29380s.get()).postOnAnimation((zg.h) this.f4407d);
                        this.f4406c = true;
                        break;
                    }
                }
                break;
        }
    }

    public h(BottomSheetBehavior bottomSheetBehavior) {
        this.f4404a = 0;
        this.f4408e = bottomSheetBehavior;
        this.f4407d = new g(this);
    }
}

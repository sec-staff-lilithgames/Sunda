package o9;

import android.view.View;
import android.view.WindowInsets;
import com.digidust.elokence.akinator.activities.MenuActivity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78088a;

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        switch (this.f78088a) {
            case 0:
                return MenuActivity.t(view, windowInsets);
            default:
                x3.c2.a(view, windowInsets);
                return x3.c2.f91555a;
        }
    }
}

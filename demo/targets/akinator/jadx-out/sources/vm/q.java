package vm;

import android.view.View;
import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VastView f89322b;

    public q(VastView vastView) {
        this.f89322b = vastView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        VastView.a(this.f89322b);
    }
}

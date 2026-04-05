package vm;

import android.view.View;
import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class s implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f89324b;

    public s(v vVar) {
        this.f89324b = vVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        v vVar = this.f89324b;
        VastView vastView = vVar.f89328i;
        int i10 = VastView.f60422k0;
        vastView.x();
        vVar.f89328i.t();
    }
}

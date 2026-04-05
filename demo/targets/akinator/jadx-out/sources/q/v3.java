package q;

import android.R;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v3 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final p.a f82284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.s f82285c;

    public v3(androidx.appcompat.widget.s sVar) {
        this.f82285c = sVar;
        this.f82284b = new p.a(sVar.f5174a.getContext(), 0, R.id.home, 0, 0, sVar.f5183j);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        androidx.appcompat.widget.s sVar = this.f82285c;
        Window.Callback callback = sVar.f5186m;
        if (callback == null || !sVar.f5187n) {
            return;
        }
        callback.onMenuItemSelected(0, this.f82284b);
    }
}

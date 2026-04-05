package an;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f4447b;

    public b(e eVar) {
        this.f4447b = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        a aVar = this.f4447b.f4459g;
        if (aVar != null) {
            aVar.onCloseClick();
        }
    }
}

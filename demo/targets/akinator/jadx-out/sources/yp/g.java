package yp;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f94758b;

    public g(k kVar) {
        this.f94758b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        k kVar = k.D;
        k kVar2 = this.f94758b;
        if (kVar2.d()) {
            if (kVar2.f94775p) {
                kVar2.f94770k.setVolume(1.0f, 1.0f);
                kVar2.f94775p = false;
            } else {
                kVar2.f94770k.setVolume(0.0f, 0.0f);
                kVar2.f94775p = true;
            }
            kVar2.j();
        }
    }
}

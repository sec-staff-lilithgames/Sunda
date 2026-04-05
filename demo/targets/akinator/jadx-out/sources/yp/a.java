package yp;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f94752b;

    public a(k kVar) {
        this.f94752b = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) throws IllegalStateException {
        k kVar = this.f94752b;
        kVar.f94779t = true;
        kVar.i();
    }
}

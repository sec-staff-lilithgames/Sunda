package b7;

import android.graphics.drawable.Drawable;
import b7.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements n7.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f8875b;

    public o(i iVar) {
        this.f8875b = iVar;
    }

    @Override // n7.d
    public void onStart(Drawable drawable) {
        i iVar = this.f8875b;
        iVar.f(new i.b.C0013b(drawable != null ? iVar.e(drawable) : null));
    }

    @Override // n7.d
    public void onError(Drawable drawable) {
    }

    @Override // n7.d
    public void onSuccess(Drawable drawable) {
    }
}

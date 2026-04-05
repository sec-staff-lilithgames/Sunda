package androidx.fragment.app;

import android.content.DialogInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s implements DialogInterface.OnCancelListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6451b;

    public s(w wVar) {
        this.f6451b = wVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        w wVar = this.f6451b;
        if (wVar.mDialog != null) {
            wVar.onCancel(wVar.mDialog);
        }
    }
}

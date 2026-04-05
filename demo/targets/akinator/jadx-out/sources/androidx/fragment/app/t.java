package androidx.fragment.app;

import android.content.DialogInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements DialogInterface.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w f6459b;

    public t(w wVar) {
        this.f6459b = wVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        w wVar = this.f6459b;
        if (wVar.mDialog != null) {
            wVar.onDismiss(wVar.mDialog);
        }
    }
}

package um;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f88639b;

    public q(s sVar) {
        this.f88639b = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        s sVar = this.f88639b;
        sVar.f88644d = false;
        View view = sVar.f88642b;
        if (view == null || sVar.f88643c == null) {
            return;
        }
        view.animate().alpha(0.0f).setDuration(400L).setListener(sVar.f88646f).withLayer();
    }
}

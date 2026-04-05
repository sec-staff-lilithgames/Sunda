package sg;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f85750a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f85751b;

    public d(e eVar, b bVar) {
        this.f85751b = eVar;
        this.f85750a = bVar;
    }

    public void onBackCancelled() {
        if (this.f85751b.f85749a != null) {
            this.f85750a.cancelBackProgress();
        }
    }

    public void onBackInvoked() {
        this.f85750a.handleBackInvoked();
    }

    public void onBackProgressed(BackEvent backEvent) {
        if (this.f85751b.f85749a != null) {
            this.f85750a.updateBackProgress(new f.c(backEvent));
        }
    }

    public void onBackStarted(BackEvent backEvent) {
        if (this.f85751b.f85749a != null) {
            this.f85750a.startBackProgress(new f.c(backEvent));
        }
    }
}

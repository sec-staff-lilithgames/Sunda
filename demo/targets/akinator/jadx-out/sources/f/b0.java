package f;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b0 implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kv.l f55196a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kv.l f55197b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kv.a f55198c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kv.a f55199d;

    public b0(kv.l lVar, kv.l lVar2, kv.a aVar, kv.a aVar2) {
        this.f55196a = lVar;
        this.f55197b = lVar2;
        this.f55198c = aVar;
        this.f55199d = aVar2;
    }

    public void onBackCancelled() {
        this.f55199d.invoke();
    }

    public void onBackInvoked() {
        this.f55198c.invoke();
    }

    public void onBackProgressed(BackEvent backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        this.f55197b.invoke(new c(backEvent));
    }

    public void onBackStarted(BackEvent backEvent) {
        kotlin.jvm.internal.e0.checkNotNullParameter(backEvent, "backEvent");
        this.f55196a.invoke(new c(backEvent));
    }
}

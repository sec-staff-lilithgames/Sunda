package zk;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.View;
import com.inmobi.media.C2738dc;
import com.inmobi.media.C2929p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f98171b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2929p0 f98172c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f98173e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f98174f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2738dc f98175g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f98176h;

    public /* synthetic */ q0(C2929p0 c2929p0, KeyEvent.Callback callback, long j10, boolean z10, C2738dc c2738dc, int i10) {
        this.f98171b = i10;
        this.f98172c = c2929p0;
        this.f98176h = callback;
        this.f98173e = j10;
        this.f98174f = z10;
        this.f98175g = c2738dc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f98171b) {
            case 0:
                C2929p0.a(this.f98172c, (View) this.f98176h, this.f98173e, this.f98174f, this.f98175g);
                break;
            default:
                C2929p0.a(this.f98172c, (Activity) this.f98176h, this.f98173e, this.f98174f, this.f98175g);
                break;
        }
    }
}

package tm;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import io.bidmachine.iab.mraid.MraidActivity;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q {

    /* renamed from: k, reason: collision with root package name */
    public static final AtomicInteger f87111k = new AtomicInteger(0);

    /* renamed from: d, reason: collision with root package name */
    public l0 f87115d;

    /* renamed from: e, reason: collision with root package name */
    public r f87116e;

    /* renamed from: a, reason: collision with root package name */
    public final int f87112a = f87111k.getAndIncrement();

    /* renamed from: f, reason: collision with root package name */
    public boolean f87117f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f87118g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f87119h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f87120i = true;

    /* renamed from: j, reason: collision with root package name */
    public boolean f87121j = false;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f87113b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final p f87114c = new p(this);

    public static void b(q qVar) {
        l0 l0Var;
        Activity activityPeekActivity;
        if (!qVar.f87121j || (l0Var = qVar.f87115d) == null || (activityPeekActivity = l0Var.peekActivity()) == null) {
            return;
        }
        ir.n.finishActivityWithoutAnimation(activityPeekActivity);
    }

    public static o newBuilder() {
        return new o(new q());
    }

    public final void a(MraidActivity mraidActivity, ViewGroup viewGroup, boolean z10, boolean z11) {
        if (isReady()) {
            this.f87120i = z11;
            this.f87121j = z10;
            um.h0.removeFromParent(this.f87115d);
            viewGroup.addView(this.f87115d, new ViewGroup.LayoutParams(-1, -1));
            this.f87115d.show(mraidActivity);
            return;
        }
        if (mraidActivity != null && z10) {
            ir.n.finishActivityWithoutAnimation(mraidActivity);
        }
        c(qm.b.incorrectState("Interstitial is not ready"));
        t.w("MraidInterstitial", "Show failed: interstitial is not ready", new Object[0]);
    }

    public final void c(qm.b bVar) {
        r rVar = this.f87116e;
        if (rVar != null) {
            rVar.onShowFailed(this, bVar);
        }
    }

    public boolean canBeClosed() {
        l0 l0Var = this.f87115d;
        return l0Var == null || l0Var.canBeClosed() || isReceivedError();
    }

    public void destroy() {
        t.d("MraidInterstitial", "destroy", new Object[0]);
        this.f87117f = false;
        this.f87116e = null;
        l0 l0Var = this.f87115d;
        if (l0Var != null) {
            l0Var.destroy();
            this.f87115d = null;
        }
    }

    public void dispatchClose() {
        if (this.f87115d == null || !canBeClosed()) {
            return;
        }
        this.f87115d.f();
    }

    public boolean isClosed() {
        return this.f87118g;
    }

    public boolean isReady() {
        return this.f87117f && this.f87115d != null;
    }

    public boolean isReceivedError() {
        return this.f87119h;
    }

    public boolean isShown() {
        return this.f87113b.get();
    }

    public void load(String str) {
        l0 l0Var = this.f87115d;
        if (l0Var == null) {
            throw new IllegalStateException("MraidView not created (mraidView == null)");
        }
        l0Var.load(str);
    }

    public Context peekContext() {
        l0 l0Var = this.f87115d;
        if (l0Var == null) {
            return null;
        }
        return l0Var.peekContext();
    }

    public void show(Context context, b0 b0Var) {
        MraidActivity.show(context, this, b0Var);
    }

    public void showInView(ViewGroup viewGroup, boolean z10) {
        a(null, viewGroup, false, z10);
    }
}

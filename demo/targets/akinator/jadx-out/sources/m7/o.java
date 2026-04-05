package m7;

import android.view.ViewTreeObserver;
import kotlinx.coroutines.CancellableContinuationImpl;
import tu.z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b, reason: collision with root package name */
    public boolean f74071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p f74072c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f74073e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f74074f;

    public o(p pVar, ViewTreeObserver viewTreeObserver, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f74072c = pVar;
        this.f74073e = viewTreeObserver;
        this.f74074f = cancellableContinuationImpl;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        p pVar = this.f74072c;
        j jVarA = m.a(pVar);
        if (jVarA != null) {
            m.access$removePreDrawListenerSafe(pVar, this.f74073e, this);
            if (!this.f74071b) {
                this.f74071b = true;
                this.f74074f.resumeWith(z.m7131constructorimpl(jVarA));
            }
        }
        return true;
    }
}

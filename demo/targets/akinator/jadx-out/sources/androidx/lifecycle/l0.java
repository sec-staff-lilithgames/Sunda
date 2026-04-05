package androidx.lifecycle;

import androidx.activity.ComponentActivity;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6646c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6647e;

    public /* synthetic */ l0(int i10, Object obj, Object obj2) {
        this.f6645b = i10;
        this.f6646c = obj;
        this.f6647e = obj2;
    }

    @Override // androidx.lifecycle.v0
    public final void onStateChanged(b1 source, i0 event) {
        int i10 = this.f6645b;
        Object obj = this.f6647e;
        Object obj2 = this.f6646c;
        switch (i10) {
            case 0:
                m0 m0Var = (m0) obj2;
                Job job = (Job) obj;
                kotlin.jvm.internal.e0.checkNotNullParameter(source, "source");
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "<unused var>");
                if (source.getLifecycle().getCurrentState() != j0.f6614b) {
                    j0 currentState = source.getLifecycle().getCurrentState();
                    j0 j0Var = m0Var.f6664b;
                    u uVar = m0Var.f6665c;
                    if (currentState.compareTo(j0Var) >= 0) {
                        uVar.resume();
                        break;
                    } else {
                        uVar.pause();
                        break;
                    }
                } else {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    m0Var.finish();
                    break;
                }
            case 1:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f.a((kv.a) obj2, (kv.a) obj, source, event);
                break;
            case 2:
                f.d0 d0Var = (f.d0) obj2;
                ComponentActivity componentActivity = (ComponentActivity) obj;
                int i11 = ComponentActivity.f4643b;
                kotlin.jvm.internal.e0.checkNotNullParameter(source, "<unused var>");
                kotlin.jvm.internal.e0.checkNotNullParameter(event, "event");
                if (event == i0.ON_CREATE) {
                    d0Var.setOnBackInvokedDispatcher(f.j.f55229a.getOnBackInvokedDispatcher(componentActivity));
                    break;
                }
                break;
            default:
                x3.c0 c0Var = (x3.c0) obj2;
                x3.g0 g0Var = (x3.g0) obj;
                c0Var.getClass();
                if (event == i0.ON_DESTROY) {
                    c0Var.removeMenuProvider(g0Var);
                    break;
                }
                break;
        }
    }
}

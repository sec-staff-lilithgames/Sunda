package a2;

import android.view.View;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x5 implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Job f3885b;

    public x5(Job job) {
        this.f3885b = job;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(v10, "v");
        v10.removeOnAttachStateChangeListener(this);
        Job.DefaultImpls.cancel$default(this.f3885b, (CancellationException) null, 1, (Object) null);
    }
}

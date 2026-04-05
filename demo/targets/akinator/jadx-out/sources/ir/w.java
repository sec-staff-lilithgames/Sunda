package ir;

import android.view.View;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.CancellableContinuationImpl;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f68371b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuationImpl f68372c;

    public w(View view, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f68371b = view;
        this.f68372c = cancellableContinuationImpl;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        e0.checkNotNullParameter(view, "view");
        this.f68371b.removeOnLayoutChangeListener(this);
        this.f68372c.resumeWith(tu.z.m7131constructorimpl(view));
    }
}

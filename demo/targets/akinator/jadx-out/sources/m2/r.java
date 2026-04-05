package m2;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.InputMethodManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final tu.o f73959a;

    public r(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        this.f73959a = tu.q.lazy(tu.s.f87405e, (kv.a) new q(context));
    }

    @Override // m2.p
    public void hideSoftInputFromWindow(IBinder iBinder) {
        ((InputMethodManager) this.f73959a.getValue()).hideSoftInputFromWindow(iBinder, 0);
    }

    @Override // m2.p
    public void restartInput(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        ((InputMethodManager) this.f73959a.getValue()).restartInput(view);
    }

    @Override // m2.p
    public void showSoftInput(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        ((InputMethodManager) this.f73959a.getValue()).showSoftInput(view, 0);
    }

    @Override // m2.p
    public void updateExtractedText(View view, int i10, ExtractedText extractedText) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        kotlin.jvm.internal.e0.checkNotNullParameter(extractedText, "extractedText");
        ((InputMethodManager) this.f73959a.getValue()).updateExtractedText(view, i10, extractedText);
    }

    @Override // m2.p
    public void updateSelection(View view, int i10, int i11, int i12, int i13) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        ((InputMethodManager) this.f73959a.getValue()).updateSelection(view, i10, i11, i12, i13);
    }
}

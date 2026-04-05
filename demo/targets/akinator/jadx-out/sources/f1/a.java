package f1;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillManager;
import e6.h0;
import j1.w1;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final View f55280a;

    /* renamed from: b, reason: collision with root package name */
    public final i f55281b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f55282c;

    public a(View view, i autofillTree) {
        e0.checkNotNullParameter(view, "view");
        e0.checkNotNullParameter(autofillTree, "autofillTree");
        this.f55280a = view;
        this.f55281b = autofillTree;
        AutofillManager autofillManagerB = h0.b(view.getContext().getSystemService(h0.c()));
        if (autofillManagerB == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f55282c = autofillManagerB;
        view.setImportantForAutofill(1);
    }

    @Override // f1.d
    public void cancelAutofillForNode(h autofillNode) {
        e0.checkNotNullParameter(autofillNode, "autofillNode");
        this.f55282c.notifyViewExited(this.f55280a, autofillNode.getId());
    }

    public final AutofillManager getAutofillManager() {
        return this.f55282c;
    }

    public final i getAutofillTree() {
        return this.f55281b;
    }

    public final View getView() {
        return this.f55280a;
    }

    @Override // f1.d
    public void requestAutofillForNode(h autofillNode) {
        Rect androidRect;
        e0.checkNotNullParameter(autofillNode, "autofillNode");
        AutofillManager autofillManager = this.f55282c;
        int id2 = autofillNode.getId();
        i1.j boundingBox = autofillNode.getBoundingBox();
        if (boundingBox == null || (androidRect = w1.toAndroidRect(boundingBox)) == null) {
            throw new IllegalStateException("requestAutofill called before onChildPositioned()");
        }
        autofillManager.notifyViewEntered(this.f55280a, id2, androidRect);
    }
}

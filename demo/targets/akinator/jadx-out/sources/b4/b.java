package b4;

import a2.o;
import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.browser.customtabs.w;
import java.util.List;
import java.util.Objects;
import x3.q2;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f8746a;

    /* renamed from: b, reason: collision with root package name */
    public final View f8747b;

    public b(ContentCaptureSession contentCaptureSession, View view) {
        this.f8746a = contentCaptureSession;
        this.f8747b = view;
    }

    public static b toContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        return new b(contentCaptureSession, view);
    }

    public AutofillId newAutofillId(long j10) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionE = o.e(this.f8746a);
        a4.a autofillId = z1.getAutofillId(this.f8747b);
        Objects.requireNonNull(autofillId);
        return contentCaptureSessionE.newAutofillId(autofillId.toAutofillId(), j10);
    }

    public q2 newVirtualViewStructure(AutofillId autofillId, long j10) {
        if (Build.VERSION.SDK_INT >= 29) {
            return q2.toViewStructureCompat(o.e(this.f8746a).newVirtualViewStructure(autofillId, j10));
        }
        return null;
    }

    public void notifyViewTextChanged(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.notifyViewTextChanged(o.e(this.f8746a), autofillId, charSequence);
        }
    }

    public void notifyViewsAppeared(List<ViewStructure> list) {
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f8746a;
        if (i10 >= 34) {
            w.h(o.e(obj), list);
            return;
        }
        if (i10 >= 29) {
            ContentCaptureSession contentCaptureSessionE = o.e(obj);
            View view = this.f8747b;
            ViewStructure viewStructureNewViewStructure = contentCaptureSessionE.newViewStructure(view);
            viewStructureNewViewStructure.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            contentCaptureSessionE.notifyViewAppeared(viewStructureNewViewStructure);
            for (int i11 = 0; i11 < list.size(); i11++) {
                contentCaptureSessionE.notifyViewAppeared(list.get(i11));
            }
            ViewStructure viewStructureNewViewStructure2 = contentCaptureSessionE.newViewStructure(view);
            viewStructureNewViewStructure2.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            contentCaptureSessionE.notifyViewAppeared(viewStructureNewViewStructure2);
        }
    }

    public void notifyViewsDisappeared(long[] jArr) {
        int i10 = Build.VERSION.SDK_INT;
        View view = this.f8747b;
        Object obj = this.f8746a;
        if (i10 >= 34) {
            ContentCaptureSession contentCaptureSessionE = o.e(obj);
            a4.a autofillId = z1.getAutofillId(view);
            Objects.requireNonNull(autofillId);
            contentCaptureSessionE.notifyViewsDisappeared(autofillId.toAutofillId(), jArr);
            return;
        }
        if (i10 >= 29) {
            ViewStructure viewStructureNewViewStructure = o.e(obj).newViewStructure(view);
            viewStructureNewViewStructure.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            o.e(obj).notifyViewAppeared(viewStructureNewViewStructure);
            ContentCaptureSession contentCaptureSessionE2 = o.e(obj);
            a4.a autofillId2 = z1.getAutofillId(view);
            Objects.requireNonNull(autofillId2);
            contentCaptureSessionE2.notifyViewsDisappeared(autofillId2.toAutofillId(), jArr);
            ViewStructure viewStructureNewViewStructure2 = o.e(obj).newViewStructure(view);
            viewStructureNewViewStructure2.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            o.e(obj).notifyViewAppeared(viewStructureNewViewStructure2);
        }
    }

    public ContentCaptureSession toContentCaptureSession() {
        return o.e(this.f8746a);
    }
}

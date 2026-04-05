package dh;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f52276a;

    /* renamed from: b, reason: collision with root package name */
    public final q f52277b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f52278c;

    /* renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f52279d;

    public r(q qVar) {
        this.f52276a = qVar.f52254b;
        this.f52277b = qVar;
        this.f52278c = qVar.getContext();
        this.f52279d = qVar.f52260i;
    }

    public int b() {
        return 0;
    }

    public int c() {
        return 0;
    }

    public View.OnFocusChangeListener d() {
        return null;
    }

    public View.OnClickListener e() {
        return null;
    }

    public View.OnFocusChangeListener f() {
        return null;
    }

    public boolean g(int i10) {
        return true;
    }

    public AccessibilityManager.TouchExplorationStateChangeListener getTouchExplorationStateChangeListener() {
        return null;
    }

    public boolean h() {
        return this instanceof l;
    }

    public boolean i() {
        return false;
    }

    public final void k() {
        this.f52277b.f(false);
    }

    public void a() {
    }

    public void l() {
    }

    public void m() {
    }

    public void afterEditTextChanged(Editable editable) {
    }

    public void j(boolean z10) {
    }

    public void onEditTextAttached(EditText editText) {
    }

    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
    }
}

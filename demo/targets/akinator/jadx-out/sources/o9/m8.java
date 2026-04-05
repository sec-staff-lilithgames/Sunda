package o9;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class m8 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78368a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p8 f78369b;

    public /* synthetic */ m8(p8 p8Var, int i10) {
        this.f78368a = i10;
        this.f78369b = p8Var;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        switch (this.f78368a) {
            case 0:
                p8 p8Var = this.f78369b;
                if (i10 == 6) {
                    p8Var.f78442c.clearFocus();
                    ((InputMethodManager) p8Var.f78123b.getSystemService("input_method")).hideSoftInputFromWindow(p8Var.f78442c.getWindowToken(), 0);
                } else {
                    p8Var.getClass();
                }
                return false;
            default:
                p8 p8Var2 = this.f78369b;
                if ((p8Var2.f78442c.length() < 3 || keyEvent == null || keyEvent.getKeyCode() != 66) && ((p8Var2.f78442c.length() < 3 || i10 != 5) && (p8Var2.f78442c.length() < 3 || i10 != 6))) {
                    return false;
                }
                p8Var2.f78123b.manageNextFragment();
                return true;
        }
    }
}

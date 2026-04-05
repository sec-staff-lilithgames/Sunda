package q9;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.e0;
import lb.b1;
import q9.b;
import q9.d;
import q9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82609a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EditText f82610b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p9.e f82611c;

    public /* synthetic */ a(EditText editText, d dVar) {
        this.f82609a = 1;
        this.f82610b = editText;
        this.f82611c = dVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11 = this.f82609a;
        EditText editText = this.f82610b;
        p9.e eVar = this.f82611c;
        switch (i11) {
            case 0:
                b bVar = (b) eVar;
                b.a aVar = b.f82612g;
                if (i10 == 6) {
                    Object systemService = bVar.requireActivity().getSystemService("input_method");
                    e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    bVar.f82615f = editText.getText().toString();
                    p9.d mCallback = bVar.getMCallback();
                    if (mCallback != null) {
                        mCallback.onAddMagicActionNext();
                    }
                }
                return true;
            case 1:
                d dVar = (d) eVar;
                d.a aVar2 = d.f82618g;
                if (i10 != 6) {
                    return true;
                }
                if (editText.getText().length() < 2 || editText.getText().length() > 255) {
                    FragmentActivity fragmentActivityRequireActivity = dVar.requireActivity();
                    e0.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                    new da.f(fragmentActivityRequireActivity).setTypeOk(b1.f72741d.sharedInstance().getTraductionFromToken("LA_LONGUEUR_DU_NOM_DOIT_ETRE_COMPRISE_ENTRE_2_ET_255_CARACTERES"));
                    return false;
                }
                dVar.f82621f = editText.getText().toString();
                p9.d mCallback2 = dVar.getMCallback();
                if (mCallback2 == null) {
                    return true;
                }
                mCallback2.onAddMagicActionNext();
                return true;
            default:
                e eVar2 = (e) eVar;
                e.a aVar3 = e.f82622g;
                if (i10 == 6) {
                    Object systemService2 = eVar2.requireActivity().getSystemService("input_method");
                    e0.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    ((InputMethodManager) systemService2).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                    eVar2.f82625f = editText.getText().toString();
                    p9.d mCallback3 = eVar2.getMCallback();
                    if (mCallback3 != null) {
                        mCallback3.onAddMagicActionNext();
                    }
                }
                return true;
        }
    }

    public /* synthetic */ a(p9.e eVar, EditText editText, int i10) {
        this.f82609a = i10;
        this.f82611c = eVar;
        this.f82610b = editText;
    }
}

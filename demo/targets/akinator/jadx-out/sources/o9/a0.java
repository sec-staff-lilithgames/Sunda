package o9;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.digidust.elokence.akinator.activities.ConnectActivity;
import com.digidust.elokence.akinator.activities.SendFormActivity;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddQuestionBinding;
import com.digidust.elokence.akinator.paid.databinding.FragmentSearchQuestionBinding;
import t9.a;
import t9.g;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final /* synthetic */ class a0 implements TextView.OnEditorActionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f78015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f78016b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f78015a = i10;
        this.f78016b = obj;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
        int i11 = this.f78015a;
        Object obj = this.f78016b;
        switch (i11) {
            case 0:
                ConnectActivity connectActivity = (ConnectActivity) obj;
                if (i10 != 6) {
                    int i12 = ConnectActivity.U;
                    connectActivity.getClass();
                    break;
                } else {
                    connectActivity.I.clearFocus();
                    ((InputMethodManager) connectActivity.getSystemService("input_method")).hideSoftInputFromWindow(connectActivity.I.getWindowToken(), 0);
                    break;
                }
            case 1:
                SendFormActivity sendFormActivity = (SendFormActivity) obj;
                if (i10 != 6) {
                    int i13 = SendFormActivity.O;
                    sendFormActivity.getClass();
                    break;
                } else {
                    sendFormActivity.C.clearFocus();
                    ((InputMethodManager) sendFormActivity.getSystemService("input_method")).hideSoftInputFromWindow(sendFormActivity.C.getWindowToken(), 0);
                    break;
                }
            case 2:
                d8 d8Var = (d8) obj;
                if (i10 != 6) {
                    d8Var.getClass();
                    break;
                } else {
                    d8Var.f78096c.clearFocus();
                    ((InputMethodManager) d8Var.f78123b.getSystemService("input_method")).hideSoftInputFromWindow(d8Var.f78096c.getWindowToken(), 0);
                    break;
                }
            case 3:
                g8 g8Var = (g8) obj;
                if (i10 != 6) {
                    g8Var.getClass();
                    break;
                } else {
                    g8Var.f78172g.clearFocus();
                    ((InputMethodManager) g8Var.f78123b.getSystemService("input_method")).hideSoftInputFromWindow(g8Var.f78172g.getWindowToken(), 0);
                    break;
                }
            case 4:
                t9.a aVar = (t9.a) obj;
                if (i10 != 6) {
                    a.C0785a c0785a = t9.a.f86583j;
                    break;
                } else {
                    FragmentAddQuestionBinding fragmentAddQuestionBinding = aVar.f86589i;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentAddQuestionBinding);
                    fragmentAddQuestionBinding.questionFieldValue.clearFocus();
                    Object systemService = aVar.requireActivity().getSystemService("input_method");
                    kotlin.jvm.internal.e0.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    FragmentAddQuestionBinding fragmentAddQuestionBinding2 = aVar.f86589i;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentAddQuestionBinding2);
                    ((InputMethodManager) systemService).hideSoftInputFromWindow(fragmentAddQuestionBinding2.questionFieldValue.getWindowToken(), 0);
                    break;
                }
            default:
                t9.g gVar = (t9.g) obj;
                if (i10 != 6) {
                    g.a aVar2 = t9.g.f86609g;
                    break;
                } else {
                    FragmentSearchQuestionBinding fragmentSearchQuestionBinding = gVar.f86612f;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentSearchQuestionBinding);
                    fragmentSearchQuestionBinding.searchQuestionFieldValue.clearFocus();
                    Object systemService2 = gVar.requireActivity().getSystemService("input_method");
                    kotlin.jvm.internal.e0.checkNotNull(systemService2, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                    FragmentSearchQuestionBinding fragmentSearchQuestionBinding2 = gVar.f86612f;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentSearchQuestionBinding2);
                    ((InputMethodManager) systemService2).hideSoftInputFromWindow(fragmentSearchQuestionBinding2.searchQuestionFieldValue.getWindowToken(), 0);
                    FragmentSearchQuestionBinding fragmentSearchQuestionBinding3 = gVar.f86612f;
                    kotlin.jvm.internal.e0.checkNotNull(fragmentSearchQuestionBinding3);
                    gVar.f86611e = fragmentSearchQuestionBinding3.searchQuestionFieldValue.getText().toString();
                    if (gVar.getMCallback() != null) {
                        p9.d mCallback = gVar.getMCallback();
                        kotlin.jvm.internal.e0.checkNotNull(mCallback);
                        mCallback.onAddMagicActionNext();
                        break;
                    }
                }
                break;
        }
        return false;
    }
}

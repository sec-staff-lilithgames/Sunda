package q9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentCorrectNameBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends p9.e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f82622g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f82623c = AkApplication.f21719f.getTypeFace();

    /* renamed from: e, reason: collision with root package name */
    public FragmentCorrectNameBinding f82624e;

    /* renamed from: f, reason: collision with root package name */
    public String f82625f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final e newInstance(String str) {
            e eVar = new e();
            Bundle bundle = new Bundle();
            bundle.putString("nameDisplayed", str);
            eVar.setArguments(bundle);
            return eVar;
        }
    }

    public final String getNameDisplayed() {
        return this.f82625f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f82625f = arguments.getString("nameDisplayed");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentCorrectNameBinding fragmentCorrectNameBindingInflate = FragmentCorrectNameBinding.inflate(inflater, viewGroup, false);
        this.f82624e = fragmentCorrectNameBindingInflate;
        e0.checkNotNull(fragmentCorrectNameBindingInflate);
        LinearLayout root = fragmentCorrectNameBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f82624e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentCorrectNameBinding fragmentCorrectNameBinding = this.f82624e;
        e0.checkNotNull(fragmentCorrectNameBinding);
        TextView textView = fragmentCorrectNameBinding.actualName;
        Typeface typeface = this.f82623c;
        textView.setTypeface(typeface);
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "NOUVEAU_NOM", textView);
        FragmentCorrectNameBinding fragmentCorrectNameBinding2 = this.f82624e;
        e0.checkNotNull(fragmentCorrectNameBinding2);
        EditText editText = fragmentCorrectNameBinding2.newNameEdit;
        editText.setTypeface(typeface);
        editText.setText(this.f82625f);
        editText.setOnEditorActionListener(new q9.a(this, editText, 2));
        editText.addTextChangedListener(new f(this, editText));
        FragmentCorrectNameBinding fragmentCorrectNameBinding3 = this.f82624e;
        e0.checkNotNull(fragmentCorrectNameBinding3);
        TextView textView2 = fragmentCorrectNameBinding3.tips;
        textView2.setTypeface(typeface);
        textView2.setText(aVar.sharedInstance().getTraductionFromToken("EXPLICATION_NOUVEAU_NOM"));
    }

    public final void setNameDisplayed(String str) {
        this.f82625f = str;
    }
}

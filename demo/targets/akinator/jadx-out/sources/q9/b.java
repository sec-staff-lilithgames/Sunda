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
import com.digidust.elokence.akinator.paid.databinding.FragmentCorrectDescriptionBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends p9.e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f82612g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f82613c = AkApplication.f21719f.getTypeFace();

    /* renamed from: e, reason: collision with root package name */
    public FragmentCorrectDescriptionBinding f82614e;

    /* renamed from: f, reason: collision with root package name */
    public String f82615f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final b newInstance(String str) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putString("descDisplayed", str);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    public final String getDescDisplayed() {
        return this.f82615f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f82615f = arguments.getString("descDisplayed");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentCorrectDescriptionBinding fragmentCorrectDescriptionBindingInflate = FragmentCorrectDescriptionBinding.inflate(inflater, viewGroup, false);
        this.f82614e = fragmentCorrectDescriptionBindingInflate;
        e0.checkNotNull(fragmentCorrectDescriptionBindingInflate);
        LinearLayout root = fragmentCorrectDescriptionBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f82614e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentCorrectDescriptionBinding fragmentCorrectDescriptionBinding = this.f82614e;
        e0.checkNotNull(fragmentCorrectDescriptionBinding);
        TextView textView = fragmentCorrectDescriptionBinding.actualDescription;
        Typeface typeface = this.f82613c;
        textView.setTypeface(typeface);
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "NOUVELLE_DESCRIPTION", textView);
        FragmentCorrectDescriptionBinding fragmentCorrectDescriptionBinding2 = this.f82614e;
        e0.checkNotNull(fragmentCorrectDescriptionBinding2);
        EditText editText = fragmentCorrectDescriptionBinding2.newDescriptionEdit;
        editText.setTypeface(typeface);
        editText.setText(this.f82615f);
        editText.setOnEditorActionListener(new q9.a(this, editText, 0));
        editText.addTextChangedListener(new c(this, editText));
        FragmentCorrectDescriptionBinding fragmentCorrectDescriptionBinding3 = this.f82614e;
        e0.checkNotNull(fragmentCorrectDescriptionBinding3);
        TextView textView2 = fragmentCorrectDescriptionBinding3.tips;
        textView2.setTypeface(typeface);
        textView2.setText(aVar.sharedInstance().getTraductionFromToken("EXPLICATION_NOUVELLE_DESCRIPTION"));
    }

    public final void setDescDisplayed(String str) {
        this.f82615f = str;
    }
}

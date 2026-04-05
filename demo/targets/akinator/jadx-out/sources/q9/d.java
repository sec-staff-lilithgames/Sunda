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
import com.digidust.elokence.akinator.paid.databinding.FragmentCorrectLinkBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class d extends p9.e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f82618g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f82619c = AkApplication.f21719f.getTypeFace();

    /* renamed from: e, reason: collision with root package name */
    public FragmentCorrectLinkBinding f82620e;

    /* renamed from: f, reason: collision with root package name */
    public String f82621f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final d newInstance(String str) {
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("link", str);
            dVar.setArguments(bundle);
            return dVar;
        }
    }

    public final String getLink() {
        return this.f82621f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f82621f = arguments.getString("link");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentCorrectLinkBinding fragmentCorrectLinkBindingInflate = FragmentCorrectLinkBinding.inflate(inflater, viewGroup, false);
        this.f82620e = fragmentCorrectLinkBindingInflate;
        e0.checkNotNull(fragmentCorrectLinkBindingInflate);
        LinearLayout root = fragmentCorrectLinkBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f82620e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentCorrectLinkBinding fragmentCorrectLinkBinding = this.f82620e;
        e0.checkNotNull(fragmentCorrectLinkBinding);
        TextView textView = fragmentCorrectLinkBinding.linkDescription;
        Typeface typeface = this.f82619c;
        textView.setTypeface(typeface);
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "LIEN_PAGE_PERSONNAGE", textView);
        FragmentCorrectLinkBinding fragmentCorrectLinkBinding2 = this.f82620e;
        e0.checkNotNull(fragmentCorrectLinkBinding2);
        EditText editText = fragmentCorrectLinkBinding2.linkEdit;
        editText.setTypeface(typeface);
        editText.setText(this.f82621f);
        editText.setOnEditorActionListener(new q9.a(editText, this));
        FragmentCorrectLinkBinding fragmentCorrectLinkBinding3 = this.f82620e;
        e0.checkNotNull(fragmentCorrectLinkBinding3);
        TextView textView2 = fragmentCorrectLinkBinding3.tips;
        textView2.setTypeface(typeface);
        textView2.setText(aVar.sharedInstance().getTraductionFromToken("EXPLICATION_LIEN_PERSONNAGE"));
    }

    public final void setLink(String str) {
        this.f82621f = str;
    }
}

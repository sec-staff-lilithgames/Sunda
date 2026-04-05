package t9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentSearchQuestionBinding;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import o9.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g extends p9.e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f86609g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f86610c = AkApplication.f21719f.getTypeFace();

    /* renamed from: e, reason: collision with root package name */
    public String f86611e;

    /* renamed from: f, reason: collision with root package name */
    public FragmentSearchQuestionBinding f86612f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final g newInstance(String str) {
            g gVar = new g();
            Bundle bundle = new Bundle();
            bundle.putString("question", str);
            gVar.setArguments(bundle);
            return gVar;
        }
    }

    public static final FragmentSearchQuestionBinding access$getBinding(g gVar) {
        FragmentSearchQuestionBinding fragmentSearchQuestionBinding = gVar.f86612f;
        e0.checkNotNull(fragmentSearchQuestionBinding);
        return fragmentSearchQuestionBinding;
    }

    public final String getQuestion() {
        return this.f86611e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f86611e = requireArguments().getString("question");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentSearchQuestionBinding fragmentSearchQuestionBindingInflate = FragmentSearchQuestionBinding.inflate(inflater, viewGroup, false);
        this.f86612f = fragmentSearchQuestionBindingInflate;
        e0.checkNotNull(fragmentSearchQuestionBindingInflate);
        TextView textView = fragmentSearchQuestionBindingInflate.searchQuestionContentText;
        Typeface typeface = this.f86610c;
        textView.setTypeface(typeface);
        FragmentSearchQuestionBinding fragmentSearchQuestionBinding = this.f86612f;
        e0.checkNotNull(fragmentSearchQuestionBinding);
        TextView textView2 = fragmentSearchQuestionBinding.searchQuestionContentText;
        b1.a aVar = b1.f72741d;
        textView2.setText(aVar.sharedInstance().getTraductionFromToken("VERIFIONS_SI_UNE_QUESTION_SEMBLABLE_N_EXISTE_PAS") + ".\n" + aVar.sharedInstance().getTraductionFromToken("RECHERCHER_LES_QUESTIONS_CONTENANT_CETTE_SUITE_DE_CARACTERES") + ".");
        FragmentSearchQuestionBinding fragmentSearchQuestionBinding2 = this.f86612f;
        e0.checkNotNull(fragmentSearchQuestionBinding2);
        fragmentSearchQuestionBinding2.searchQuestionFieldValue.setTypeface(typeface);
        if (this.f86611e != null) {
            FragmentSearchQuestionBinding fragmentSearchQuestionBinding3 = this.f86612f;
            e0.checkNotNull(fragmentSearchQuestionBinding3);
            fragmentSearchQuestionBinding3.searchQuestionFieldValue.setText(this.f86611e);
        }
        FragmentSearchQuestionBinding fragmentSearchQuestionBinding4 = this.f86612f;
        e0.checkNotNull(fragmentSearchQuestionBinding4);
        fragmentSearchQuestionBinding4.searchQuestionFieldValue.addTextChangedListener(new h(this));
        FragmentSearchQuestionBinding fragmentSearchQuestionBinding5 = this.f86612f;
        e0.checkNotNull(fragmentSearchQuestionBinding5);
        fragmentSearchQuestionBinding5.searchQuestionFieldValue.setOnEditorActionListener(new a0(this, 5));
        FragmentSearchQuestionBinding fragmentSearchQuestionBinding6 = this.f86612f;
        e0.checkNotNull(fragmentSearchQuestionBinding6);
        LinearLayout root = fragmentSearchQuestionBinding6.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f86612f = null;
    }
}

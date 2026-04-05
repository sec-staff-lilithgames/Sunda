package q9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentCorrectReasonBinding;
import j1.o2;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import q9.h;
import uu.p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class h extends p9.e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f82630g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final ArrayList f82631h;

    /* renamed from: e, reason: collision with root package name */
    public FragmentCorrectReasonBinding f82633e;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f82632c = AkApplication.f21719f.getTypeFace();

    /* renamed from: f, reason: collision with root package name */
    public int f82634f = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final ArrayList<String> getReasons() {
            return h.f82631h;
        }

        public final h newInstance(int i10) {
            h hVar = new h();
            Bundle bundle = new Bundle();
            bundle.putInt("index", i10);
            hVar.setArguments(bundle);
            return hVar;
        }
    }

    static {
        b1.a aVar = b1.f72741d;
        f82631h = p0.arrayListOf(aVar.sharedInstance().getTraductionFromToken("CORRECTION_ORTHOGRAPHE"), aVar.sharedInstance().getTraductionFromToken("ELEMENT_NOM_MANQUANT"), aVar.sharedInstance().getTraductionFromToken("PRECISION_SUR_DESCRIPTION"), aVar.sharedInstance().getTraductionFromToken("DESCRIPTION_ERRONEE"));
    }

    public final int getIndex() {
        return this.f82634f;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f82634f = arguments.getInt("index");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentCorrectReasonBinding fragmentCorrectReasonBindingInflate = FragmentCorrectReasonBinding.inflate(inflater, viewGroup, false);
        this.f82633e = fragmentCorrectReasonBindingInflate;
        e0.checkNotNull(fragmentCorrectReasonBindingInflate);
        LinearLayout root = fragmentCorrectReasonBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f82633e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentCorrectReasonBinding fragmentCorrectReasonBinding = this.f82633e;
        e0.checkNotNull(fragmentCorrectReasonBinding);
        TextView textView = fragmentCorrectReasonBinding.raisonCorrection;
        o2.A(b1.f72741d, "RAISON_CORRECTION", textView);
        Typeface typeface = this.f82632c;
        textView.setTypeface(typeface);
        FragmentCorrectReasonBinding fragmentCorrectReasonBinding2 = this.f82633e;
        e0.checkNotNull(fragmentCorrectReasonBinding2);
        final RadioGroup radioGroupCorrect = fragmentCorrectReasonBinding2.radioGroupCorrect;
        e0.checkNotNullExpressionValue(radioGroupCorrect, "radioGroupCorrect");
        int i10 = this.f82634f;
        if (i10 != -1) {
            View childAt = radioGroupCorrect.getChildAt(i10);
            e0.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.RadioButton");
            ((RadioButton) childAt).setChecked(true);
        }
        radioGroupCorrect.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: q9.g
            @Override // android.widget.RadioGroup.OnCheckedChangeListener
            public final void onCheckedChanged(RadioGroup radioGroup, int i11) {
                h.a aVar = h.f82630g;
                e0.checkNotNullParameter(radioGroup, "<unused var>");
                RadioGroup radioGroup2 = radioGroupCorrect;
                int iIndexOfChild = radioGroup2.indexOfChild(radioGroup2.findViewById(i11));
                h hVar = this;
                hVar.f82634f = iIndexOfChild;
                p9.d mCallback = hVar.getMCallback();
                if (mCallback != null) {
                    mCallback.onAddMagicActionNext();
                }
            }
        });
        FragmentCorrectReasonBinding fragmentCorrectReasonBinding3 = this.f82633e;
        e0.checkNotNull(fragmentCorrectReasonBinding3);
        RadioButton radioButton = fragmentCorrectReasonBinding3.radioCorrectionOrthographe;
        radioButton.setTypeface(typeface);
        ArrayList arrayList = f82631h;
        radioButton.setText((CharSequence) arrayList.get(0));
        FragmentCorrectReasonBinding fragmentCorrectReasonBinding4 = this.f82633e;
        e0.checkNotNull(fragmentCorrectReasonBinding4);
        RadioButton radioButton2 = fragmentCorrectReasonBinding4.radioElementManquant;
        radioButton2.setTypeface(typeface);
        radioButton2.setText((CharSequence) arrayList.get(1));
        FragmentCorrectReasonBinding fragmentCorrectReasonBinding5 = this.f82633e;
        e0.checkNotNull(fragmentCorrectReasonBinding5);
        RadioButton radioButton3 = fragmentCorrectReasonBinding5.radioPrecisionDescription;
        radioButton3.setTypeface(typeface);
        radioButton3.setText((CharSequence) arrayList.get(2));
        FragmentCorrectReasonBinding fragmentCorrectReasonBinding6 = this.f82633e;
        e0.checkNotNull(fragmentCorrectReasonBinding6);
        RadioButton radioButton4 = fragmentCorrectReasonBinding6.radioDescriptionErreur;
        radioButton4.setTypeface(typeface);
        radioButton4.setText((CharSequence) arrayList.get(3));
    }

    public final void setIndex(int i10) {
        this.f82634f = i10;
    }
}

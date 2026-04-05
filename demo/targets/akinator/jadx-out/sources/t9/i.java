package t9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import androidx.fragment.app.FragmentActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentSoundlikeQuestionBinding;
import java.util.ArrayList;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import lb.e;
import o9.j0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i extends p9.e {

    /* renamed from: i, reason: collision with root package name */
    public static final a f86614i = new a(null);

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f86616e;

    /* renamed from: g, reason: collision with root package name */
    public y9.h f86618g;

    /* renamed from: h, reason: collision with root package name */
    public FragmentSoundlikeQuestionBinding f86619h;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f86615c = AkApplication.f21719f.getTypeFace();

    /* renamed from: f, reason: collision with root package name */
    public int f86617f = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final i newInstance(ArrayList<e.h> l9, int i10) {
            e0.checkNotNullParameter(l9, "l");
            i iVar = new i();
            Bundle bundle = new Bundle();
            bundle.putSerializable("questions", l9);
            bundle.putSerializable("soundlikeSelectedQuestion", Integer.valueOf(i10));
            iVar.setArguments(bundle);
            return iVar;
        }
    }

    public final int getSelectedIndex() {
        return this.f86617f;
    }

    public final ArrayList<e.h> getSoundLikeQuestions() {
        return this.f86616e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f86616e = (ArrayList) requireArguments().getSerializable("questions");
            this.f86617f = requireArguments().getInt("soundlikeSelectedQuestion");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentSoundlikeQuestionBinding fragmentSoundlikeQuestionBindingInflate = FragmentSoundlikeQuestionBinding.inflate(inflater, viewGroup, false);
        this.f86619h = fragmentSoundlikeQuestionBindingInflate;
        e0.checkNotNull(fragmentSoundlikeQuestionBindingInflate);
        RelativeLayout root = fragmentSoundlikeQuestionBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f86619h = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentActivity activity = getActivity();
        ArrayList arrayList = this.f86616e;
        e0.checkNotNull(arrayList);
        this.f86618g = new y9.h(activity, arrayList, this.f86617f);
        FragmentSoundlikeQuestionBinding fragmentSoundlikeQuestionBinding = this.f86619h;
        e0.checkNotNull(fragmentSoundlikeQuestionBinding);
        fragmentSoundlikeQuestionBinding.questionsList.setAdapter((ListAdapter) this.f86618g);
        FragmentSoundlikeQuestionBinding fragmentSoundlikeQuestionBinding2 = this.f86619h;
        e0.checkNotNull(fragmentSoundlikeQuestionBinding2);
        fragmentSoundlikeQuestionBinding2.questionsList.setDivider(null);
        FragmentSoundlikeQuestionBinding fragmentSoundlikeQuestionBinding3 = this.f86619h;
        e0.checkNotNull(fragmentSoundlikeQuestionBinding3);
        fragmentSoundlikeQuestionBinding3.questionsList.setDividerHeight(0);
        FragmentSoundlikeQuestionBinding fragmentSoundlikeQuestionBinding4 = this.f86619h;
        e0.checkNotNull(fragmentSoundlikeQuestionBinding4);
        fragmentSoundlikeQuestionBinding4.questionsList.setOnItemClickListener(new ia.a(this, 4));
        FragmentSoundlikeQuestionBinding fragmentSoundlikeQuestionBinding5 = this.f86619h;
        e0.checkNotNull(fragmentSoundlikeQuestionBinding5);
        fragmentSoundlikeQuestionBinding5.addQuestionButton.setTypeface(this.f86615c);
        FragmentSoundlikeQuestionBinding fragmentSoundlikeQuestionBinding6 = this.f86619h;
        e0.checkNotNull(fragmentSoundlikeQuestionBinding6);
        fragmentSoundlikeQuestionBinding6.addQuestionButton.setText(b1.f72741d.sharedInstance().getTraductionFromToken("MA_QUESTION_PAS_DANS_LA_LISTE"));
        FragmentSoundlikeQuestionBinding fragmentSoundlikeQuestionBinding7 = this.f86619h;
        e0.checkNotNull(fragmentSoundlikeQuestionBinding7);
        fragmentSoundlikeQuestionBinding7.addQuestionButton.setOnClickListener(new j0(this, 11));
    }
}

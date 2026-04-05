package t9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddQuestionBinding;
import j1.o2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import lb.e;
import o9.a0;
import y9.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends p9.e {

    /* renamed from: j, reason: collision with root package name */
    public static final C0785a f86583j = new C0785a(null);

    /* renamed from: e, reason: collision with root package name */
    public e.h f86585e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f86586f;

    /* renamed from: h, reason: collision with root package name */
    public y9.b f86588h;

    /* renamed from: i, reason: collision with root package name */
    public FragmentAddQuestionBinding f86589i;

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f86584c = AkApplication.f21719f.getTypeFace();

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f86587g = new ArrayList();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: t9.a$a, reason: collision with other inner class name */
    public static final class C0785a {
        public C0785a(u uVar) {
        }

        public final a newInstance(ArrayList<e.b> l9, e.h hVar) {
            e0.checkNotNullParameter(l9, "l");
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putSerializable("objets", l9);
            bundle.putSerializable("questionChoosen", hVar);
            aVar.setArguments(bundle);
            return aVar;
        }
    }

    public final String getCustomQuestion() {
        FragmentAddQuestionBinding fragmentAddQuestionBinding = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding);
        return fragmentAddQuestionBinding.questionFieldValue.getText().toString();
    }

    public final ArrayList<b.a> getMLimuleObjectsAnswer() {
        return this.f86587g;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.f86585e = (e.h) requireArguments().getSerializable("questionChoosen");
            this.f86586f = (ArrayList) requireArguments().getSerializable("objets");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentAddQuestionBinding fragmentAddQuestionBindingInflate = FragmentAddQuestionBinding.inflate(inflater, viewGroup, false);
        this.f86589i = fragmentAddQuestionBindingInflate;
        e0.checkNotNull(fragmentAddQuestionBindingInflate);
        RelativeLayout root = fragmentAddQuestionBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f86589i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentAddQuestionBinding fragmentAddQuestionBinding = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding);
        TextView textView = fragmentAddQuestionBinding.questionText;
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "REPONDRE_QUESTION_POUR_PERSONNAGES_CONNUS", textView);
        FragmentAddQuestionBinding fragmentAddQuestionBinding2 = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding2);
        TextView textView2 = fragmentAddQuestionBinding2.questionText;
        Typeface typeface = this.f86584c;
        textView2.setTypeface(typeface);
        FragmentAddQuestionBinding fragmentAddQuestionBinding3 = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding3);
        fragmentAddQuestionBinding3.questionFieldValue.setTypeface(typeface);
        FragmentAddQuestionBinding fragmentAddQuestionBinding4 = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding4);
        fragmentAddQuestionBinding4.questionFieldValue.setOnEditorActionListener(new a0(this, 4));
        FragmentAddQuestionBinding fragmentAddQuestionBinding5 = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding5);
        fragmentAddQuestionBinding5.title.setTypeface(typeface);
        if (this.f86585e != null) {
            FragmentAddQuestionBinding fragmentAddQuestionBinding6 = this.f86589i;
            e0.checkNotNull(fragmentAddQuestionBinding6);
            EditText editText = fragmentAddQuestionBinding6.questionFieldValue;
            e.h hVar = this.f86585e;
            e0.checkNotNull(hVar);
            editText.setText(hVar.getQuestion());
            FragmentAddQuestionBinding fragmentAddQuestionBinding7 = this.f86589i;
            e0.checkNotNull(fragmentAddQuestionBinding7);
            fragmentAddQuestionBinding7.questionFieldValue.setKeyListener(null);
        }
        FragmentAddQuestionBinding fragmentAddQuestionBinding8 = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding8);
        o2.A(aVar, "NOUVELLE_QUESTION", fragmentAddQuestionBinding8.title);
        FragmentAddQuestionBinding fragmentAddQuestionBinding9 = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding9);
        fragmentAddQuestionBinding9.characterList.setDivider(null);
        FragmentAddQuestionBinding fragmentAddQuestionBinding10 = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding10);
        fragmentAddQuestionBinding10.characterList.setDividerHeight(0);
        FragmentAddQuestionBinding fragmentAddQuestionBinding11 = this.f86589i;
        e0.checkNotNull(fragmentAddQuestionBinding11);
        fragmentAddQuestionBinding11.characterList.setOnItemClickListener(new ia.a(this, 3));
        ArrayList arrayList = this.f86586f;
        e0.checkNotNull(arrayList);
        Iterator it = arrayList.iterator();
        e0.checkNotNullExpressionValue(it, "iterator(...)");
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList2 = this.f86587g;
            if (!zHasNext) {
                this.f86588h = new y9.b(getActivity(), arrayList2);
                FragmentAddQuestionBinding fragmentAddQuestionBinding12 = this.f86589i;
                e0.checkNotNull(fragmentAddQuestionBinding12);
                fragmentAddQuestionBinding12.characterList.setAdapter((ListAdapter) this.f86588h);
                return;
            }
            Object next = it.next();
            e0.checkNotNullExpressionValue(next, "next(...)");
            b.a aVar2 = new b.a();
            aVar2.setObject((e.b) next);
            aVar2.setAnswer(-2);
            arrayList2.add(aVar2);
        }
    }
}

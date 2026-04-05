package r9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.freemium.R;
import com.digidust.elokence.akinator.paid.databinding.FragmentMoreQuestionsBinding;
import io.bidmachine.media3.exoplayer.b1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.e;
import r9.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class b extends p9.e implements View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public static final a f84049h = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public e f84050c;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f84051e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public e.b f84052f;

    /* renamed from: g, reason: collision with root package name */
    public FragmentMoreQuestionsBinding f84053g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final b newInstance(List<? extends lb.d> questions) {
            e0.checkNotNullParameter(questions, "questions");
            b bVar = new b();
            bVar.peupleResList(questions);
            return bVar;
        }
    }

    public b() {
        e.g persoPropose = ca.u.sharedInstance().getPersoPropose();
        e0.checkNotNullExpressionValue(persoPropose, "getPersoPropose(...)");
        this.f84052f = persoPropose;
    }

    public static final b newInstance(List<? extends lb.d> list) {
        return f84049h.newInstance(list);
    }

    public final void a(String str) {
        e eVar;
        ArrayList arrayList = this.f84051e;
        Object obj = arrayList.get(0);
        e0.checkNotNullExpressionValue(obj, "get(...)");
        new Thread(new b1(this, 13, (lb.d) obj, str)).start();
        arrayList.remove(0);
        if (b() || (eVar = this.f84050c) == null) {
            return;
        }
        eVar.manageFinished();
    }

    public final boolean b() {
        ArrayList arrayList = this.f84051e;
        if (arrayList.isEmpty()) {
            FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding = this.f84053g;
            e0.checkNotNull(fragmentMoreQuestionsBinding);
            fragmentMoreQuestionsBinding.bulleText.setText("");
            FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding2 = this.f84053g;
            e0.checkNotNull(fragmentMoreQuestionsBinding2);
            fragmentMoreQuestionsBinding2.yesQuestionButton.setText("");
            FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding3 = this.f84053g;
            e0.checkNotNull(fragmentMoreQuestionsBinding3);
            fragmentMoreQuestionsBinding3.dontknowQuestionButton.setText("");
            FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding4 = this.f84053g;
            e0.checkNotNull(fragmentMoreQuestionsBinding4);
            fragmentMoreQuestionsBinding4.noQuestionButton.setText("");
            FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding5 = this.f84053g;
            e0.checkNotNull(fragmentMoreQuestionsBinding5);
            fragmentMoreQuestionsBinding5.probablyQuestionButton.setText("");
            FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding6 = this.f84053g;
            e0.checkNotNull(fragmentMoreQuestionsBinding6);
            fragmentMoreQuestionsBinding6.probablyNotQuestionButton.setText("");
            return false;
        }
        Object obj = arrayList.get(0);
        e0.checkNotNullExpressionValue(obj, "get(...)");
        lb.d dVar = (lb.d) obj;
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding7 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding7);
        TextView textView = fragmentMoreQuestionsBinding7.bulleText;
        String str = dVar.f72795b;
        ArrayList arrayList2 = dVar.f72796c;
        textView.setText(str);
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding8 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding8);
        fragmentMoreQuestionsBinding8.yesQuestionButton.setText((CharSequence) arrayList2.get(0));
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding9 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding9);
        fragmentMoreQuestionsBinding9.dontknowQuestionButton.setText((CharSequence) arrayList2.get(2));
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding10 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding10);
        fragmentMoreQuestionsBinding10.noQuestionButton.setText((CharSequence) arrayList2.get(1));
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding11 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding11);
        fragmentMoreQuestionsBinding11.probablyQuestionButton.setText((CharSequence) arrayList2.get(3));
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding12 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding12);
        fragmentMoreQuestionsBinding12.probablyNotQuestionButton.setText((CharSequence) arrayList2.get(4));
        return true;
    }

    public final e.b getCharacter() {
        return this.f84052f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        e0.checkNotNullParameter(v10, "v");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBindingInflate = FragmentMoreQuestionsBinding.inflate(inflater, viewGroup, false);
        this.f84053g = fragmentMoreQuestionsBindingInflate;
        e0.checkNotNull(fragmentMoreQuestionsBindingInflate);
        RelativeLayout root = fragmentMoreQuestionsBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f84053g = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding);
        fragmentMoreQuestionsBinding.akinatorImage.setImageResource(R.drawable.akitude_fixe_serein_2);
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding2 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding2);
        final int i10 = 0;
        fragmentMoreQuestionsBinding2.yesQuestionButton.setOnClickListener(new View.OnClickListener(this) { // from class: r9.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f84048c;

            {
                this.f84048c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                b bVar = this.f84048c;
                switch (i11) {
                    case 0:
                        b.a aVar = b.f84049h;
                        bVar.a("0");
                        break;
                    case 1:
                        b.a aVar2 = b.f84049h;
                        bVar.a("2");
                        break;
                    case 2:
                        b.a aVar3 = b.f84049h;
                        bVar.a("1");
                        break;
                    case 3:
                        b.a aVar4 = b.f84049h;
                        bVar.a("3");
                        break;
                    default:
                        b.a aVar5 = b.f84049h;
                        bVar.a("4");
                        break;
                }
            }
        });
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding3 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding3);
        final int i11 = 1;
        fragmentMoreQuestionsBinding3.dontknowQuestionButton.setOnClickListener(new View.OnClickListener(this) { // from class: r9.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f84048c;

            {
                this.f84048c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                b bVar = this.f84048c;
                switch (i112) {
                    case 0:
                        b.a aVar = b.f84049h;
                        bVar.a("0");
                        break;
                    case 1:
                        b.a aVar2 = b.f84049h;
                        bVar.a("2");
                        break;
                    case 2:
                        b.a aVar3 = b.f84049h;
                        bVar.a("1");
                        break;
                    case 3:
                        b.a aVar4 = b.f84049h;
                        bVar.a("3");
                        break;
                    default:
                        b.a aVar5 = b.f84049h;
                        bVar.a("4");
                        break;
                }
            }
        });
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding4 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding4);
        final int i12 = 2;
        fragmentMoreQuestionsBinding4.noQuestionButton.setOnClickListener(new View.OnClickListener(this) { // from class: r9.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f84048c;

            {
                this.f84048c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                b bVar = this.f84048c;
                switch (i112) {
                    case 0:
                        b.a aVar = b.f84049h;
                        bVar.a("0");
                        break;
                    case 1:
                        b.a aVar2 = b.f84049h;
                        bVar.a("2");
                        break;
                    case 2:
                        b.a aVar3 = b.f84049h;
                        bVar.a("1");
                        break;
                    case 3:
                        b.a aVar4 = b.f84049h;
                        bVar.a("3");
                        break;
                    default:
                        b.a aVar5 = b.f84049h;
                        bVar.a("4");
                        break;
                }
            }
        });
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding5 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding5);
        final int i13 = 3;
        fragmentMoreQuestionsBinding5.probablyQuestionButton.setOnClickListener(new View.OnClickListener(this) { // from class: r9.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f84048c;

            {
                this.f84048c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i13;
                b bVar = this.f84048c;
                switch (i112) {
                    case 0:
                        b.a aVar = b.f84049h;
                        bVar.a("0");
                        break;
                    case 1:
                        b.a aVar2 = b.f84049h;
                        bVar.a("2");
                        break;
                    case 2:
                        b.a aVar3 = b.f84049h;
                        bVar.a("1");
                        break;
                    case 3:
                        b.a aVar4 = b.f84049h;
                        bVar.a("3");
                        break;
                    default:
                        b.a aVar5 = b.f84049h;
                        bVar.a("4");
                        break;
                }
            }
        });
        FragmentMoreQuestionsBinding fragmentMoreQuestionsBinding6 = this.f84053g;
        e0.checkNotNull(fragmentMoreQuestionsBinding6);
        final int i14 = 4;
        fragmentMoreQuestionsBinding6.probablyNotQuestionButton.setOnClickListener(new View.OnClickListener(this) { // from class: r9.a

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ b f84048c;

            {
                this.f84048c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i14;
                b bVar = this.f84048c;
                switch (i112) {
                    case 0:
                        b.a aVar = b.f84049h;
                        bVar.a("0");
                        break;
                    case 1:
                        b.a aVar2 = b.f84049h;
                        bVar.a("2");
                        break;
                    case 2:
                        b.a aVar3 = b.f84049h;
                        bVar.a("1");
                        break;
                    case 3:
                        b.a aVar4 = b.f84049h;
                        bVar.a("3");
                        break;
                    default:
                        b.a aVar5 = b.f84049h;
                        bVar.a("4");
                        break;
                }
            }
        });
        b();
    }

    public final void peupleResList(List<? extends lb.d> liste) {
        e0.checkNotNullParameter(liste, "liste");
        this.f84051e.addAll(liste);
    }

    public final void setCharacter(e.b bVar) {
        e0.checkNotNullParameter(bVar, "<set-?>");
        this.f84052f = bVar;
    }

    public final void setManager(e mManager) {
        e0.checkNotNullParameter(mManager, "mManager");
        this.f84050c = mManager;
    }
}

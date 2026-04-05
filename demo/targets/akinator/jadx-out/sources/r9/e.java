package r9;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bj.v0;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.graphic.AkinatorAddMagicButton;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddMagicManagerBinding;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;
import mt.n0;
import o9.b3;
import ou.j;
import r9.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends p9.c implements p9.a {

    /* renamed from: h, reason: collision with root package name */
    public static final a f84058h = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public FragmentAddMagicManagerBinding f84059c;

    /* renamed from: e, reason: collision with root package name */
    public pt.c f84060e;

    /* renamed from: f, reason: collision with root package name */
    public AkActivity f84061f;

    /* renamed from: g, reason: collision with root package name */
    public List f84062g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final e newInstance() {
            e eVar = new e();
            eVar.setArguments(new Bundle());
            return eVar;
        }
    }

    public static final e newInstance() {
        return f84058h.newInstance();
    }

    @Override // p9.a
    public void manageDefaultDisplay(View v10) {
        e0.checkNotNullParameter(v10, "v");
        n0 n0VarCreate = n0.create(new b3(this, 10));
        e0.checkNotNullExpressionValue(n0VarCreate, "create(...)");
        this.f84060e = n0VarCreate.observeOn(ot.c.mainThread()).subscribeOn(j.newThread()).subscribe(new v0(new d(this, 0), 25), new v0(new d(this, 1), 26));
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f84059c;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        fragmentAddMagicManagerBinding.precedant.setVisibility(4);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f84059c;
        e0.checkNotNull(fragmentAddMagicManagerBinding2);
        fragmentAddMagicManagerBinding2.suivant.setVisibility(4);
    }

    @Override // p9.a
    public void manageFinished() {
        displayFinalFragment();
    }

    @Override // p9.a
    public void manageNextFragment() {
        manageFinished();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f84061f = (AkActivity) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBindingInflate = FragmentAddMagicManagerBinding.inflate(inflater, viewGroup, false);
        this.f84059c = fragmentAddMagicManagerBindingInflate;
        e0.checkNotNull(fragmentAddMagicManagerBindingInflate);
        RelativeLayout root = fragmentAddMagicManagerBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        pt.c cVar;
        super.onDestroyView();
        pt.c cVar2 = this.f84060e;
        if (cVar2 != null && !cVar2.isDisposed() && (cVar = this.f84060e) != null) {
            cVar.dispose();
        }
        this.f84059c = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding = this.f84059c;
        e0.checkNotNull(fragmentAddMagicManagerBinding);
        AkinatorAddMagicButton akinatorAddMagicButton = fragmentAddMagicManagerBinding.precedant;
        b1.a aVar = b1.f72741d;
        akinatorAddMagicButton.setText(aVar.sharedInstance().getTraductionFromToken("PRECEDENT"));
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding2 = this.f84059c;
        e0.checkNotNull(fragmentAddMagicManagerBinding2);
        fragmentAddMagicManagerBinding2.suivant.setText(aVar.sharedInstance().getTraductionFromToken("SUIVANT"));
        manageDefaultDisplay(view);
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding3 = this.f84059c;
        e0.checkNotNull(fragmentAddMagicManagerBinding3);
        final int i10 = 0;
        fragmentAddMagicManagerBinding3.closeAddMagic.closeAddMagic.setOnClickListener(new View.OnClickListener(this) { // from class: r9.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f84055c;

            {
                this.f84055c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i11 = i10;
                e eVar = this.f84055c;
                switch (i11) {
                    case 0:
                        AkActivity akActivity = eVar.f84061f;
                        if (akActivity != null) {
                            akActivity.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f84058h;
                        eVar.managePreviousFragment();
                        break;
                    default:
                        e.a aVar3 = e.f84058h;
                        eVar.manageNextFragment();
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding4 = this.f84059c;
        e0.checkNotNull(fragmentAddMagicManagerBinding4);
        final int i11 = 1;
        fragmentAddMagicManagerBinding4.precedant.setOnClickListener(new View.OnClickListener(this) { // from class: r9.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f84055c;

            {
                this.f84055c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i11;
                e eVar = this.f84055c;
                switch (i112) {
                    case 0:
                        AkActivity akActivity = eVar.f84061f;
                        if (akActivity != null) {
                            akActivity.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f84058h;
                        eVar.managePreviousFragment();
                        break;
                    default:
                        e.a aVar3 = e.f84058h;
                        eVar.manageNextFragment();
                        break;
                }
            }
        });
        FragmentAddMagicManagerBinding fragmentAddMagicManagerBinding5 = this.f84059c;
        e0.checkNotNull(fragmentAddMagicManagerBinding5);
        final int i12 = 2;
        fragmentAddMagicManagerBinding5.suivant.setOnClickListener(new View.OnClickListener(this) { // from class: r9.c

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f84055c;

            {
                this.f84055c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i112 = i12;
                e eVar = this.f84055c;
                switch (i112) {
                    case 0:
                        AkActivity akActivity = eVar.f84061f;
                        if (akActivity != null) {
                            akActivity.onBackPressed();
                            break;
                        }
                        break;
                    case 1:
                        e.a aVar2 = e.f84058h;
                        eVar.managePreviousFragment();
                        break;
                    default:
                        e.a aVar3 = e.f84058h;
                        eVar.manageNextFragment();
                        break;
                }
            }
        });
    }

    @Override // p9.a
    public void managePreviousFragment() {
    }
}

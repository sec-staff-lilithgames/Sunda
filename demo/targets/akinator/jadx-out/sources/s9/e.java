package s9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentAddPhotoReasonBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends p9.e {

    /* renamed from: h, reason: collision with root package name */
    public static final a f85518h = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public g f85519c;

    /* renamed from: e, reason: collision with root package name */
    public final Typeface f85520e = AkApplication.f21719f.getTypeFace();

    /* renamed from: f, reason: collision with root package name */
    public FragmentAddPhotoReasonBinding f85521f;

    /* renamed from: g, reason: collision with root package name */
    public int f85522g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final e newInstance() {
            return new e();
        }
    }

    public static final e newInstance() {
        return f85518h.newInstance();
    }

    public final int getReason() {
        return this.f85522g;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentAddPhotoReasonBinding fragmentAddPhotoReasonBindingInflate = FragmentAddPhotoReasonBinding.inflate(inflater, viewGroup, false);
        this.f85521f = fragmentAddPhotoReasonBindingInflate;
        e0.checkNotNull(fragmentAddPhotoReasonBindingInflate);
        RelativeLayout root = fragmentAddPhotoReasonBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f85521f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentAddPhotoReasonBinding fragmentAddPhotoReasonBinding = this.f85521f;
        e0.checkNotNull(fragmentAddPhotoReasonBinding);
        TextView textView = fragmentAddPhotoReasonBinding.textAskReason;
        Typeface typeface = this.f85520e;
        textView.setTypeface(typeface);
        b1.a aVar = b1.f72741d;
        o2.A(aVar, "RAISON_CORRECTION", textView);
        TextView textView2 = fragmentAddPhotoReasonBinding.textReasonIncorrect;
        textView2.setTypeface(typeface);
        textView2.setText(aVar.sharedInstance().getTraductionFromToken("REMPLACER_PHOTO_EXISTANTE"));
        final int i10 = 0;
        textView2.setOnClickListener(new View.OnClickListener(this) { // from class: s9.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f85517c;

            {
                this.f85517c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i10) {
                    case 0:
                        e eVar = this.f85517c;
                        eVar.f85522g = 0;
                        g gVar = eVar.f85519c;
                        if (gVar != null) {
                            gVar.manageNextFragment();
                            break;
                        }
                        break;
                    default:
                        e eVar2 = this.f85517c;
                        eVar2.f85522g = 1;
                        g gVar2 = eVar2.f85519c;
                        if (gVar2 != null) {
                            gVar2.manageNextFragment();
                            break;
                        }
                        break;
                }
            }
        });
        TextView textView3 = fragmentAddPhotoReasonBinding.textReasonDuel;
        textView3.setTypeface(typeface);
        textView3.setText(aVar.sharedInstance().getTraductionFromToken("PROPOSER_UN_DUEL"));
        final int i11 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: s9.d

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f85517c;

            {
                this.f85517c = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i11) {
                    case 0:
                        e eVar = this.f85517c;
                        eVar.f85522g = 0;
                        g gVar = eVar.f85519c;
                        if (gVar != null) {
                            gVar.manageNextFragment();
                            break;
                        }
                        break;
                    default:
                        e eVar2 = this.f85517c;
                        eVar2.f85522g = 1;
                        g gVar2 = eVar2.f85519c;
                        if (gVar2 != null) {
                            gVar2.manageNextFragment();
                            break;
                        }
                        break;
                }
            }
        });
    }

    public final void setManager(g manager) {
        e0.checkNotNullParameter(manager, "manager");
        this.f85519c = manager;
    }
}

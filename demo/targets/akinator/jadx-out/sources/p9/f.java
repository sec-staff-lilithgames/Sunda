package p9;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentMerciBinding;
import j1.o2;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f extends e {

    /* renamed from: g, reason: collision with root package name */
    public static final a f80919g = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final Typeface f80920c = AkApplication.f21719f.getTypeFace();

    /* renamed from: e, reason: collision with root package name */
    public String f80921e;

    /* renamed from: f, reason: collision with root package name */
    public FragmentMerciBinding f80922f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }

        public final f newInstance() {
            return new f();
        }
    }

    public final String getNameDisplayed() {
        return this.f80921e;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            this.f80921e = arguments != null ? arguments.getString("nameDisplayed") : null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        e0.checkNotNullParameter(inflater, "inflater");
        FragmentMerciBinding fragmentMerciBindingInflate = FragmentMerciBinding.inflate(inflater, viewGroup, false);
        this.f80922f = fragmentMerciBindingInflate;
        e0.checkNotNull(fragmentMerciBindingInflate);
        RelativeLayout root = fragmentMerciBindingInflate.getRoot();
        e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f80922f = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        e0.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        FragmentMerciBinding fragmentMerciBinding = this.f80922f;
        e0.checkNotNull(fragmentMerciBinding);
        fragmentMerciBinding.merci.setTypeface(this.f80920c);
        FragmentMerciBinding fragmentMerciBinding2 = this.f80922f;
        e0.checkNotNull(fragmentMerciBinding2);
        o2.A(b1.f72741d, "MERCI_POUR_TON_AIDE", fragmentMerciBinding2.merci);
    }

    public final void setNameDisplayed(String str) {
        this.f80921e = str;
    }
}

package o9;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.digidust.elokence.akinator.activities.AkActivity;
import com.digidust.elokence.akinator.activities.PopPedagogiqueActivity;
import com.digidust.elokence.akinator.factories.AkApplication;
import com.digidust.elokence.akinator.paid.databinding.FragmentAwardsBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends c1 implements View.OnClickListener {

    /* renamed from: k, reason: collision with root package name */
    public static final b f78231k = new b(null);

    /* renamed from: l, reason: collision with root package name */
    public static final Typeface f78232l = AkApplication.f21719f.getTypeFace();

    /* renamed from: c, reason: collision with root package name */
    public FragmentAwardsBinding f78233c;

    /* renamed from: e, reason: collision with root package name */
    public AkActivity f78234e;

    /* renamed from: g, reason: collision with root package name */
    public int f78236g;

    /* renamed from: h, reason: collision with root package name */
    public ViewGroup f78237h;

    /* renamed from: i, reason: collision with root package name */
    public View f78238i;

    /* renamed from: f, reason: collision with root package name */
    public List f78235f = new ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public View.OnClickListener f78239j = new h(this, 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f78240a;

        /* renamed from: b, reason: collision with root package name */
        public final int f78241b;

        /* renamed from: c, reason: collision with root package name */
        public final int f78242c;

        /* renamed from: d, reason: collision with root package name */
        public final int f78243d;

        /* renamed from: e, reason: collision with root package name */
        public final int f78244e;

        /* renamed from: f, reason: collision with root package name */
        public final int f78245f;

        /* renamed from: g, reason: collision with root package name */
        public final int f78246g;

        /* renamed from: h, reason: collision with root package name */
        public final int f78247h;

        public a(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            this.f78240a = i10;
            this.f78241b = i11;
            this.f78242c = i12;
            this.f78243d = i13;
            this.f78244e = i14;
            this.f78245f = i15;
            this.f78246g = i16;
            this.f78247h = i17;
        }

        public static /* synthetic */ a copy$default(a aVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Object obj) {
            if ((i18 & 1) != 0) {
                i10 = aVar.f78240a;
            }
            if ((i18 & 2) != 0) {
                i11 = aVar.f78241b;
            }
            if ((i18 & 4) != 0) {
                i12 = aVar.f78242c;
            }
            if ((i18 & 8) != 0) {
                i13 = aVar.f78243d;
            }
            if ((i18 & 16) != 0) {
                i14 = aVar.f78244e;
            }
            if ((i18 & 32) != 0) {
                i15 = aVar.f78245f;
            }
            if ((i18 & 64) != 0) {
                i16 = aVar.f78246g;
            }
            if ((i18 & 128) != 0) {
                i17 = aVar.f78247h;
            }
            int i19 = i16;
            int i20 = i17;
            int i21 = i14;
            int i22 = i15;
            return aVar.copy(i10, i11, i12, i13, i21, i22, i19, i20);
        }

        public final int component1() {
            return this.f78240a;
        }

        public final int component2() {
            return this.f78241b;
        }

        public final int component3() {
            return this.f78242c;
        }

        public final int component4() {
            return this.f78243d;
        }

        public final int component5() {
            return this.f78244e;
        }

        public final int component6() {
            return this.f78245f;
        }

        public final int component7() {
            return this.f78246g;
        }

        public final int component8() {
            return this.f78247h;
        }

        public final a copy(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            return new a(i10, i11, i12, i13, i14, i15, i16, i17);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f78240a == aVar.f78240a && this.f78241b == aVar.f78241b && this.f78242c == aVar.f78242c && this.f78243d == aVar.f78243d && this.f78244e == aVar.f78244e && this.f78245f == aVar.f78245f && this.f78246g == aVar.f78246g && this.f78247h == aVar.f78247h;
        }

        public final int getQ1() {
            return this.f78240a;
        }

        public final int getQ2() {
            return this.f78241b;
        }

        public final int getQ3() {
            return this.f78242c;
        }

        public final int getQ4() {
            return this.f78243d;
        }

        public final int getQ5() {
            return this.f78244e;
        }

        public final int getQ6() {
            return this.f78245f;
        }

        public final int getQ7() {
            return this.f78246g;
        }

        public final int getQ8() {
            return this.f78247h;
        }

        public int hashCode() {
            return Integer.hashCode(this.f78247h) + e3.g.d(this.f78246g, e3.g.d(this.f78245f, e3.g.d(this.f78244e, e3.g.d(this.f78243d, e3.g.d(this.f78242c, e3.g.d(this.f78241b, Integer.hashCode(this.f78240a) * 31, 31), 31), 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder sbF = w0.i.f(this.f78240a, this.f78241b, "AwardsCounts(q1=", ", q2=", ", q3=");
            a.b.x(this.f78242c, this.f78243d, ", q4=", ", q5=", sbF);
            a.b.x(this.f78244e, this.f78245f, ", q6=", ", q7=", sbF);
            sbF.append(this.f78246g);
            sbF.append(", q8=");
            sbF.append(this.f78247h);
            sbF.append(")");
            return sbF.toString();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        public final j newInstance() {
            return new j();
        }
    }

    public static final String access$lang(j jVar) {
        jVar.getClass();
        String currentLanguage = ca.m.sharedInstance().getCurrentLanguage();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(currentLanguage, "getCurrentLanguage(...)");
        return currentLanguage;
    }

    public static final int access$subj(j jVar) {
        jVar.getClass();
        return ca.m.sharedInstance().getCurrentSubject();
    }

    public static final j newInstance() {
        return f78231k.newInstance();
    }

    public final FragmentAwardsBinding a() {
        FragmentAwardsBinding fragmentAwardsBinding = this.f78233c;
        if (fragmentAwardsBinding != null) {
            return fragmentAwardsBinding;
        }
        kotlin.jvm.internal.e0.throwUninitializedPropertyAccessException("_binding");
        return null;
    }

    public final View.OnClickListener getAwardClickListener() {
        return this.f78239j;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == a().whatIsAkiAward) {
            AkActivity akActivity = this.f78234e;
            kotlin.jvm.internal.e0.checkNotNull(akActivity);
            akActivity.disableAdOneTime();
            Intent intent = new Intent(this.f78234e, (Class<?>) PopPedagogiqueActivity.class);
            intent.putExtra("PostPedagogiqueActivityModeAkiAward", true);
            startActivity(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.e0.checkNotNullParameter(inflater, "inflater");
        this.f78233c = FragmentAwardsBinding.inflate(inflater, viewGroup, false);
        this.f78234e = (AkActivity) getActivity();
        a().whatIsAkiAward.setOnClickListener(this);
        a().layoutAwardsDetails.setVisibility(4);
        BuildersKt__Builders_commonKt.launch$default(androidx.lifecycle.c1.getLifecycleScope(this), null, null, new n(this, null), 3, null);
        RelativeLayout root = a().getRoot();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // o9.c1
    public final boolean removeCreatedView() {
        if (this.f78237h == null || this.f78238i == null) {
            return false;
        }
        AkActivity akActivity = this.f78234e;
        kotlin.jvm.internal.e0.checkNotNull(akActivity);
        akActivity.runOnUiThread(new ji.t(this, 23));
        return true;
    }

    public final void setAwardClickListener(View.OnClickListener onClickListener) {
        kotlin.jvm.internal.e0.checkNotNullParameter(onClickListener, "<set-?>");
        this.f78239j = onClickListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z10) {
        super.setUserVisibleHint(z10);
        if (z10) {
            jb.h hVarSharedInstance = jb.h.f69257d.sharedInstance();
            String str = String.format("%s_displayed", Arrays.copyOf(new Object[]{"podium"}, 1));
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(str, "format(...)");
            hVarSharedInstance.incMetricCompteur(str);
        }
    }
}

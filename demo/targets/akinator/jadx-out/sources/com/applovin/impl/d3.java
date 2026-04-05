package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import com.applovin.impl.b3;
import com.applovin.impl.o2;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.sdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d3 extends p2 {

    /* renamed from: e, reason: collision with root package name */
    private final b3 f13851e;

    /* renamed from: f, reason: collision with root package name */
    private List f13852f;

    /* renamed from: g, reason: collision with root package name */
    private final List f13853g;

    /* renamed from: h, reason: collision with root package name */
    private final List f13854h;

    /* renamed from: i, reason: collision with root package name */
    private final List f13855i;

    /* renamed from: j, reason: collision with root package name */
    private final List f13856j;

    /* renamed from: k, reason: collision with root package name */
    private SpannedString f13857k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        INTEGRATIONS,
        PERMISSIONS,
        CONFIGURATION,
        DEPENDENCIES,
        TEST_ADS,
        COUNT
    }

    public d3(b3 b3Var, Context context) {
        super(context);
        this.f13851e = b3Var;
        if (b3Var.q() == b3.a.INVALID_INTEGRATION) {
            SpannableString spannableString = new SpannableString("Tap for more information");
            spannableString.setSpan(new AbsoluteSizeSpan(12, true), 0, spannableString.length(), 33);
            this.f13857k = new SpannedString(spannableString);
        } else {
            this.f13857k = new SpannedString("");
        }
        this.f13852f = g();
        this.f13853g = b(b3Var.n());
        this.f13854h = e();
        this.f13855i = a(b3Var.f());
        this.f13856j = j();
        notifyDataSetChanged();
    }

    private o2 f() {
        if (this.f13851e.I()) {
            return null;
        }
        return o2.a().d("Initialization Status").c(f(this.f13851e.i())).a(false).a();
    }

    private List g() {
        ArrayList arrayList = new ArrayList(3);
        CollectionUtils.addObjectIfExists(i(), arrayList);
        CollectionUtils.addObjectIfExists(d(), arrayList);
        CollectionUtils.addObjectIfExists(f(), arrayList);
        return arrayList;
    }

    private o2 i() {
        o2.b bVarC = o2.a().d("SDK").c(this.f13851e.p());
        if (TextUtils.isEmpty(this.f13851e.p())) {
            bVarC.a(a(this.f13851e.G())).b(b(this.f13851e.G()));
        }
        return bVarC.a();
    }

    private List j() {
        ArrayList arrayList = new ArrayList(3);
        if (StringUtils.isValidString(this.f13851e.v())) {
            arrayList.add(o2.a(o2.c.DETAIL).d(this.f13851e.v()).a());
        }
        if (this.f13851e.y() == b3.b.NOT_SUPPORTED) {
            return arrayList;
        }
        if (this.f13851e.s() != null) {
            arrayList.add(c(this.f13851e.s()));
        }
        arrayList.add(a(this.f13851e.y()));
        return arrayList;
    }

    public boolean a(i2 i2Var) {
        return i2Var.b() == a.TEST_ADS.ordinal() && i2Var.a() == this.f13856j.size() - 1;
    }

    @Override // com.applovin.impl.p2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.p2
    public List c(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? this.f13852f : i10 == a.PERMISSIONS.ordinal() ? this.f13853g : i10 == a.CONFIGURATION.ordinal() ? this.f13854h : i10 == a.DEPENDENCIES.ordinal() ? this.f13855i : this.f13856j;
    }

    @Override // com.applovin.impl.p2
    public int d(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? this.f13852f.size() : i10 == a.PERMISSIONS.ordinal() ? this.f13853g.size() : i10 == a.CONFIGURATION.ordinal() ? this.f13854h.size() : i10 == a.DEPENDENCIES.ordinal() ? this.f13855i.size() : this.f13856j.size();
    }

    @Override // com.applovin.impl.p2
    public o2 e(int i10) {
        return i10 == a.INTEGRATIONS.ordinal() ? new t4("INTEGRATIONS") : i10 == a.PERMISSIONS.ordinal() ? new t4("PERMISSIONS") : i10 == a.CONFIGURATION.ordinal() ? new t4("CONFIGURATION") : i10 == a.DEPENDENCIES.ordinal() ? new t4("DEPENDENCIES") : new t4("TEST ADS");
    }

    public b3 h() {
        return this.f13851e;
    }

    public void k() {
        this.f13852f = g();
    }

    public String toString() {
        return "MediatedNetworkListAdapter{}";
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j1 j1Var = (j1) it.next();
                arrayList.add(a(j1Var.b(), j1Var.a(), j1Var.c(), true));
            }
        }
        return arrayList;
    }

    private List b(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        if (list.size() > 0) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                m4 m4Var = (m4) it.next();
                arrayList.add(a(m4Var.b(), m4Var.a(), m4Var.c(), true));
            }
        }
        return arrayList;
    }

    private String f(int i10) {
        if (MaxAdapter.InitializationStatus.INITIALIZED_SUCCESS.getCode() != i10 && MaxAdapter.InitializationStatus.INITIALIZED_UNKNOWN.getCode() != i10 && MaxAdapter.InitializationStatus.DOES_NOT_APPLY.getCode() != i10) {
            if (MaxAdapter.InitializationStatus.INITIALIZED_FAILURE.getCode() == i10) {
                return "Failure";
            }
            if (MaxAdapter.InitializationStatus.INITIALIZING.getCode() == i10) {
                return "Initializing...";
            }
            return "Not Initialized";
        }
        return "Initialized";
    }

    private o2 a(b3.b bVar) {
        o2.b bVarA = o2.a();
        if (bVar == b3.b.READY) {
            bVarA.a(this.f15022a);
        }
        return bVarA.d("Test Mode").c(bVar.c()).c(bVar.d()).b("Restart Required").a(bVar.b()).a(true).a();
    }

    private int b(boolean z10) {
        return m0.a(z10 ? R.color.applovin_sdk_checkmarkColor : R.color.applovin_sdk_xmarkColor, this.f15022a);
    }

    private o2 c(List list) {
        return o2.a().d("Region/VPN Required").c(CollectionUtils.implode(list, ", ", list.size())).a();
    }

    private o2 d() {
        o2.b bVarC = o2.a().d("Adapter").c(this.f13851e.c());
        if (TextUtils.isEmpty(this.f13851e.c())) {
            bVarC.a(a(this.f13851e.A())).b(b(this.f13851e.A()));
        }
        return bVarC.a();
    }

    private List e() {
        ArrayList arrayList = new ArrayList(1);
        if (this.f13851e.E()) {
            arrayList.add(a("Java 8", "For optimal performance, please enable Java 8 support. See: https://developers.applovin.com/en/android/overview/integration", com.applovin.impl.sdk.k.G0(), true));
        }
        return arrayList;
    }

    private int c(boolean z10) {
        return z10 ? R.drawable.applovin_ic_x_mark : R.drawable.applovin_ic_warning;
    }

    private int d(boolean z10) {
        return m0.a(z10 ? R.color.applovin_sdk_xmarkColor : R.color.applovin_sdk_warningColor, this.f15022a);
    }

    private o2 a(String str, String str2, boolean z10, boolean z11) {
        return o2.a(z10 ? o2.c.RIGHT_DETAIL : o2.c.DETAIL).d(str).a(z10 ? null : this.f13857k).b("Instructions").a(str2).a(z10 ? R.drawable.applovin_ic_check_mark_bordered : c(z11)).b(z10 ? m0.a(R.color.applovin_sdk_checkmarkColor, this.f15022a) : d(z11)).a(!z10).a();
    }

    private int a(boolean z10) {
        return z10 ? R.drawable.applovin_ic_check_mark_bordered : R.drawable.applovin_ic_x_mark;
    }
}

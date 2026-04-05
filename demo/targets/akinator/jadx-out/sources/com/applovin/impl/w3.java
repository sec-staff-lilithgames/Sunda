package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.b3;
import com.applovin.impl.o2;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class w3 extends o2 {

    /* renamed from: n, reason: collision with root package name */
    private final b3 f16136n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f16137o;

    public w3(b3 b3Var, Context context) {
        super(o2.c.DETAIL);
        this.f16136n = b3Var;
        this.f16137o = context;
        this.f14906c = t();
        this.f14907d = s();
    }

    private SpannedString q() {
        if (!this.f16136n.A()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", -65536);
        }
        if (TextUtils.isEmpty(this.f16136n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f16136n.c(), -16777216));
        if (this.f16136n.B()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", m0.a(R.color.applovin_sdk_orangeColor, this.f16137o)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f16136n.k(), -16777216));
        }
        if (!this.f16136n.C()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) q());
        if (this.f16136n.q() == b3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", -65536));
        } else if (this.f16136n.q() == b3.a.INCOMPLETE_INTEGRATION && this.f16136n.F()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", -65536));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.f16136n.g(), o() ? -16777216 : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (!this.f16136n.G()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", -65536);
        }
        if (!StringUtils.isValidString(this.f16136n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.f16136n.A() ? "Retrieving SDK Version..." : "SDK Found", -16777216);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.f16136n.p(), -16777216));
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.o2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.o2
    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f16137o);
    }

    @Override // com.applovin.impl.o2
    public int h() {
        int iH = this.f16136n.h();
        return iH > 0 ? iH : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.o2
    public boolean o() {
        return this.f16136n.q() != b3.a.MISSING;
    }

    public b3 r() {
        return this.f16136n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.f14906c) + ", detailText=" + ((Object) this.f14907d) + ", network=" + this.f16136n + "}";
    }
}

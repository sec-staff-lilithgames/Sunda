package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.o2;
import com.applovin.sdk.R;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class o1 extends o2 {

    /* renamed from: n, reason: collision with root package name */
    private final p1 f14902n;

    /* renamed from: o, reason: collision with root package name */
    private final Context f14903o;

    public o1(p1 p1Var, Context context) {
        super(o2.c.DETAIL);
        this.f14902n = p1Var;
        this.f14903o = context;
        this.f14906c = r();
        this.f14907d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + k7.a(this.f14902n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.f14902n.c());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.f14902n.d());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.o2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.o2
    public int e() {
        return m0.a(R.color.applovin_sdk_disclosureButtonColor, this.f14903o);
    }

    @Override // com.applovin.impl.o2
    public boolean o() {
        return true;
    }
}

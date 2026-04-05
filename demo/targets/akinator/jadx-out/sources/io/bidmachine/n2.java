package io.bidmachine;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n2 implements l2 {

    /* renamed from: b, reason: collision with root package name */
    public final m2 f61944b = new m2(this);

    /* renamed from: c, reason: collision with root package name */
    public Boolean f61945c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f61946d;

    /* renamed from: e, reason: collision with root package name */
    public String f61947e;

    /* renamed from: f, reason: collision with root package name */
    public String f61948f;

    /* renamed from: g, reason: collision with root package name */
    public String f61949g;

    /* renamed from: h, reason: collision with root package name */
    public String f61950h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f61951i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.SharedPreferences r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.n2.a(android.content.SharedPreferences, java.lang.String):void");
    }

    @Override // io.bidmachine.l2
    public String getGDPRConsentString() {
        return this.f61947e;
    }

    @Override // io.bidmachine.l2
    public List<Integer> getGPPIds() {
        return this.f61951i;
    }

    @Override // io.bidmachine.l2
    public String getGPPString() {
        return this.f61950h;
    }

    @Override // io.bidmachine.l2
    public Boolean getSubjectToGDPR() {
        return this.f61945c;
    }

    @Override // io.bidmachine.l2
    public Boolean getTcfGdprApplies() {
        return this.f61946d;
    }

    @Override // io.bidmachine.l2
    public String getTcfTcString() {
        return this.f61948f;
    }

    @Override // io.bidmachine.l2
    public String getUSPrivacyString() {
        return this.f61949g;
    }

    @Override // io.bidmachine.l2
    public void initialize(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this.f61944b);
        for (int i10 = 0; i10 < 7; i10++) {
            a(defaultSharedPreferences, l2.f60591a[i10]);
        }
    }
}

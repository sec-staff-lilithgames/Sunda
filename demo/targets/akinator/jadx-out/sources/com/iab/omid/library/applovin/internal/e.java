package com.iab.omid.library.applovin.internal;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.applovin.weakreference.a f30250a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30251b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f30252c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30253d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f30250a = new com.iab.omid.library.applovin.weakreference.a(view);
        this.f30251b = view.getClass().getCanonicalName();
        this.f30252c = friendlyObstructionPurpose;
        this.f30253d = str;
    }

    public String a() {
        return this.f30253d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f30252c;
    }

    public com.iab.omid.library.applovin.weakreference.a c() {
        return this.f30250a;
    }

    public String d() {
        return this.f30251b;
    }
}

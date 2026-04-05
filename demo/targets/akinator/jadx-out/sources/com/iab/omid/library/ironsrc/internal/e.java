package com.iab.omid.library.ironsrc.internal;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.weakreference.a f30922a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30923b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f30924c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30925d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f30922a = new com.iab.omid.library.ironsrc.weakreference.a(view);
        this.f30923b = view.getClass().getCanonicalName();
        this.f30924c = friendlyObstructionPurpose;
        this.f30925d = str;
    }

    public String a() {
        return this.f30925d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f30924c;
    }

    public com.iab.omid.library.ironsrc.weakreference.a c() {
        return this.f30922a;
    }

    public String d() {
        return this.f30923b;
    }
}

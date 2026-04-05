package com.iab.omid.library.fyber.internal;

import android.view.View;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.fyber.weakreference.a f30651a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30652b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f30653c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30654d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f30651a = new com.iab.omid.library.fyber.weakreference.a(view);
        this.f30652b = view.getClass().getCanonicalName();
        this.f30653c = friendlyObstructionPurpose;
        this.f30654d = str;
    }

    public String a() {
        return this.f30654d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f30653c;
    }

    public com.iab.omid.library.fyber.weakreference.a c() {
        return this.f30651a;
    }

    public String d() {
        return this.f30652b;
    }
}

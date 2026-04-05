package com.iab.omid.library.amazon.internal;

import android.view.View;
import com.iab.omid.library.amazon.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.amazon.weakreference.a f30121a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30122b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f30123c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30124d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f30121a = new com.iab.omid.library.amazon.weakreference.a(view);
        this.f30122b = view.getClass().getCanonicalName();
        this.f30123c = friendlyObstructionPurpose;
        this.f30124d = str;
    }

    public String a() {
        return this.f30124d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f30123c;
    }

    public com.iab.omid.library.amazon.weakreference.a c() {
        return this.f30121a;
    }

    public String d() {
        return this.f30122b;
    }
}

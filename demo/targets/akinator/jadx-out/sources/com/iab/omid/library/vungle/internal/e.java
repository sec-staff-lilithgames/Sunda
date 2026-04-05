package com.iab.omid.library.vungle.internal;

import android.view.View;
import com.iab.omid.library.vungle.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.vungle.weakreference.a f31437a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31438b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f31439c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31440d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f31437a = new com.iab.omid.library.vungle.weakreference.a(view);
        this.f31438b = view.getClass().getCanonicalName();
        this.f31439c = friendlyObstructionPurpose;
        this.f31440d = str;
    }

    public String a() {
        return this.f31440d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f31439c;
    }

    public com.iab.omid.library.vungle.weakreference.a c() {
        return this.f31437a;
    }

    public String d() {
        return this.f31438b;
    }
}

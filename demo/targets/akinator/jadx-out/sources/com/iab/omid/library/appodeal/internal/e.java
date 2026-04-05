package com.iab.omid.library.appodeal.internal;

import android.view.View;
import com.iab.omid.library.appodeal.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.weakreference.a f30386a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30387b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f30388c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30389d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f30386a = new com.iab.omid.library.appodeal.weakreference.a(view);
        this.f30387b = view.getClass().getCanonicalName();
        this.f30388c = friendlyObstructionPurpose;
        this.f30389d = str;
    }

    public String a() {
        return this.f30389d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f30388c;
    }

    public com.iab.omid.library.appodeal.weakreference.a c() {
        return this.f30386a;
    }

    public String d() {
        return this.f30387b;
    }
}

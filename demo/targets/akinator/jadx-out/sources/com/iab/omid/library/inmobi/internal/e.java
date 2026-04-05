package com.iab.omid.library.inmobi.internal;

import android.view.View;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.weakreference.a f30787a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30788b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f30789c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30790d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f30787a = new com.iab.omid.library.inmobi.weakreference.a(view);
        this.f30788b = view.getClass().getCanonicalName();
        this.f30789c = friendlyObstructionPurpose;
        this.f30790d = str;
    }

    public String a() {
        return this.f30790d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f30789c;
    }

    public com.iab.omid.library.inmobi.weakreference.a c() {
        return this.f30787a;
    }

    public String d() {
        return this.f30788b;
    }
}

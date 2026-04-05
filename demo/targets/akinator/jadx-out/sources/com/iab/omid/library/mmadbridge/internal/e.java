package com.iab.omid.library.mmadbridge.internal;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.weakreference.a f31057a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31058b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f31059c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31060d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f31057a = new com.iab.omid.library.mmadbridge.weakreference.a(view);
        this.f31058b = view.getClass().getCanonicalName();
        this.f31059c = friendlyObstructionPurpose;
        this.f31060d = str;
    }

    public String a() {
        return this.f31060d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f31059c;
    }

    public com.iab.omid.library.mmadbridge.weakreference.a c() {
        return this.f31057a;
    }

    public String d() {
        return this.f31058b;
    }
}

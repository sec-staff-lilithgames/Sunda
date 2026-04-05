package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.weakreference.a f30521a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30522b;

    /* renamed from: c, reason: collision with root package name */
    private final FriendlyObstructionPurpose f30523c;

    /* renamed from: d, reason: collision with root package name */
    private final String f30524d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f30521a = new com.iab.omid.library.bytedance2.weakreference.a(view);
        this.f30522b = view.getClass().getCanonicalName();
        this.f30523c = friendlyObstructionPurpose;
        this.f30524d = str;
    }

    public String a() {
        return this.f30524d;
    }

    public FriendlyObstructionPurpose b() {
        return this.f30523c;
    }

    public com.iab.omid.library.bytedance2.weakreference.a c() {
        return this.f30521a;
    }

    public String d() {
        return this.f30522b;
    }
}

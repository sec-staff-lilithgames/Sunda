package io.bidmachine;

import android.content.Context;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class m1 implements cr.s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f60609a;

    public m1(Context context) {
        this.f60609a = context.getApplicationContext();
    }

    @Override // cr.s
    public String getUserAgent() {
        return UserAgentManager.getUserAgent(this.f60609a);
    }
}

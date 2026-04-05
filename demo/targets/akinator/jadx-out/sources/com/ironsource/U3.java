package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class U3 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f35541a = true;

    /* renamed from: b, reason: collision with root package name */
    private IronSourceError f35542b = null;

    public void a(IronSourceError ironSourceError) {
        this.f35541a = false;
        this.f35542b = ironSourceError;
    }

    public boolean b() {
        return this.f35541a;
    }

    public void c() {
        this.f35541a = true;
        this.f35542b = null;
    }

    public String toString() {
        if (b()) {
            return "valid:" + this.f35541a;
        }
        return "valid:" + this.f35541a + ", IronSourceError:" + this.f35542b;
    }

    public IronSourceError a() {
        return this.f35542b;
    }
}

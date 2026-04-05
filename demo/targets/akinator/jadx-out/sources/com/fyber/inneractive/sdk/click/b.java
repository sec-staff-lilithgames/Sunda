package com.fyber.inneractive.sdk.click;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final q f23160a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f23161b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23162c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23163d;

    /* renamed from: e, reason: collision with root package name */
    public long f23164e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f23165f = new ArrayList();

    public b(String str, q qVar, String str2, Exception exc) {
        this.f23163d = str;
        this.f23160a = qVar;
        this.f23162c = str2;
        this.f23161b = exc;
    }

    public final String toString() {
        q qVar = this.f23160a;
        if (qVar == q.FAILED) {
            Throwable th2 = this.f23161b;
            return a.b.k("Open result: Failed! error: ", th2 != null ? th2.getMessage() : "none");
        }
        return "Open result: Success! target: " + qVar + " method: " + this.f23162c;
    }
}

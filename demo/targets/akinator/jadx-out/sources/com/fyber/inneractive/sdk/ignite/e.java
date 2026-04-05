package com.fyber.inneractive.sdk.ignite;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f23973a;

    public e(h hVar) {
        this.f23973a = hVar;
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2) {
        Iterator it = this.f23973a.f23985h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(str, str2);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void b(String str) {
        Iterator it = this.f23973a.f23985h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.b(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void c(String str) {
        Iterator it = this.f23973a.f23985h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.c(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, int i10, double d10) {
        Iterator it = this.f23973a.f23985h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(str, i10, d10);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str) {
        Iterator it = this.f23973a.f23985h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(str);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.ignite.r
    public final void a(String str, String str2, String str3) {
        Iterator it = this.f23973a.f23985h.iterator();
        while (it.hasNext()) {
            r rVar = (r) it.next();
            if (rVar != null) {
                rVar.a(str, str2, str3);
            }
        }
    }
}

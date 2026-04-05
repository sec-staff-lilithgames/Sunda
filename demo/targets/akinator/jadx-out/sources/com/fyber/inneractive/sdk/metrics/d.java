package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final d f24047d = new d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f24048a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f24049b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final f f24050c = new f();

    public final g a(String str) {
        try {
            if (str == null) {
                return this.f24050c;
            }
            g gVar = (g) this.f24048a.get(str);
            if (gVar != null) {
                return gVar;
            }
            e eVar = new e();
            this.f24048a.put(str, eVar);
            return eVar;
        } catch (Exception unused) {
            return this.f24050c;
        }
    }

    public final i b(String str) {
        i iVar = (i) this.f24049b.get(str);
        if (iVar == null) {
            iVar = new i();
        }
        this.f24049b.put(str, iVar);
        return iVar;
    }
}

package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i implements d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f23297a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23298b;

    public i(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f23297a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f23298b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f23297a.isEmpty() || eVar.f23284b == null) {
            return false;
        }
        Iterator it = this.f23297a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f23284b)) {
                return !this.f23298b;
            }
        }
        return this.f23298b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "pub_id", this.f23297a, Boolean.valueOf(this.f23298b));
    }
}

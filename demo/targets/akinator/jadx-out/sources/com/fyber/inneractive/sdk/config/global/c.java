package com.fyber.inneractive.sdk.config.global;

import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f23281a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23282b;

    public c(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                long jOptLong = jSONArray.optLong(i10);
                if (jOptLong != 0) {
                    this.f23281a.add(Long.valueOf(jOptLong));
                }
            }
        }
        this.f23282b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f23281a.isEmpty() || eVar.f23283a == null) {
            return false;
        }
        Iterator it = this.f23281a.iterator();
        while (it.hasNext()) {
            if (((Long) it.next()).equals(eVar.f23283a)) {
                return !this.f23282b;
            }
        }
        return this.f23282b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "demand", this.f23281a, Boolean.valueOf(this.f23282b));
    }
}

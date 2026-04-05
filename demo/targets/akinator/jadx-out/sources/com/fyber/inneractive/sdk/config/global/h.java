package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class h implements d {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f23295a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f23296b;

    public h(JSONArray jSONArray, boolean z10) {
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                String strOptString = jSONArray.optString(i10);
                if (!TextUtils.isEmpty(strOptString)) {
                    this.f23295a.add(strOptString);
                }
            }
        }
        this.f23296b = z10;
    }

    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        if (this.f23295a.isEmpty() || eVar.f23285c == null) {
            return false;
        }
        Iterator it = this.f23295a.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(eVar.f23285c.value())) {
                return !this.f23296b;
            }
        }
        return this.f23296b;
    }

    public final String toString() {
        return String.format("%s - %s include: %b", "placement_type", this.f23295a, Boolean.valueOf(this.f23296b));
    }
}

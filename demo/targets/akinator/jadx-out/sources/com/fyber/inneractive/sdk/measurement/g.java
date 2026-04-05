package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements com.fyber.inneractive.sdk.response.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f24019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f24020b;

    public g(List list, i iVar) {
        this.f24019a = list;
        this.f24020b = iVar;
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        if (xVar == null || this.f24019a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f24019a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f24020b.mReason)));
            }
        }
        return arrayList;
    }
}

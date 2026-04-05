package wr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class n extends k {

    /* renamed from: a, reason: collision with root package name */
    public final List f91053a;

    public n(List list) {
        this.f91053a = list;
    }

    public static k create(k... kVarArr) {
        if (kVarArr.length == 0) {
            throw new IllegalArgumentException("At least one credential is required");
        }
        for (k kVar : kVarArr) {
            kVar.getClass();
        }
        return new n(Collections.unmodifiableList(new ArrayList(Arrays.asList(kVarArr))));
    }

    public List<k> getCredentialsList() {
        return this.f91053a;
    }

    @Override // wr.k
    public k withoutBearerTokens() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f91053a.iterator();
        while (it.hasNext()) {
            arrayList.add(((k) it.next()).withoutBearerTokens());
        }
        return new n(Collections.unmodifiableList(arrayList));
    }
}

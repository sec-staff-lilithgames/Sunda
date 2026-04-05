package wr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o extends n5 {

    /* renamed from: a, reason: collision with root package name */
    public final List f91077a;

    public o(n5... n5VarArr) {
        for (n5 n5Var : n5VarArr) {
            n5Var.getClass();
        }
        this.f91077a = Collections.unmodifiableList(new ArrayList(Arrays.asList(n5VarArr)));
    }

    public static n5 create(n5... n5VarArr) {
        if (n5VarArr.length != 0) {
            return new o(n5VarArr);
        }
        throw new IllegalArgumentException("At least one credential is required");
    }

    public List<n5> getCredentialsList() {
        return this.f91077a;
    }
}

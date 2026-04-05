package nh;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final /* synthetic */ class j3 implements mh.q1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f76383b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mh.q1 f76384c;

    public /* synthetic */ j3(mh.q1 q1Var, int i10) {
        this.f76383b = i10;
        this.f76384c = q1Var;
    }

    @Override // mh.q1
    public final boolean apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        switch (this.f76383b) {
            case 0:
                return this.f76384c.apply(le.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size()));
            default:
                return this.f76384c.apply(ec.immutableEntry(entry.getValue(), entry.getKey()));
        }
    }
}

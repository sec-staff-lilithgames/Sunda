package nh;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class s3 extends e4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t3 f76619b;

    public s3(t3 t3Var) {
        this.f76619b = t3Var;
    }

    @Override // nh.e4
    /* renamed from: c */
    public final Collection delegate() {
        t3 t3Var = this.f76619b;
        return y1.filter(t3Var.f76652h.entries(), t3Var.entryPredicate());
    }

    @Override // nh.e4, java.util.Collection
    public boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        t3 t3Var = this.f76619b;
        if (t3Var.f76652h.containsKey(entry.getKey()) && t3Var.f76653i.apply(entry.getKey())) {
            return t3Var.f76652h.remove(entry.getKey(), entry.getValue());
        }
        return false;
    }
}

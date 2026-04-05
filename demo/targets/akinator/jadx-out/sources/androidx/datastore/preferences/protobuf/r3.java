package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r3 extends u3 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v3 f5978c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(v3 v3Var) {
        super(v3Var);
        this.f5978c = v3Var;
    }

    @Override // androidx.datastore.preferences.protobuf.u3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new q3(this.f5978c);
    }
}

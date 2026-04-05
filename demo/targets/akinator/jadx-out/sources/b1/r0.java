package b1;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 implements Map.Entry, lv.f {

    /* renamed from: b, reason: collision with root package name */
    public final Object f8676b;

    /* renamed from: c, reason: collision with root package name */
    public Object f8677c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s0 f8678e;

    public r0(s0 s0Var) {
        this.f8678e = s0Var;
        Map.Entry entry = s0Var.f8688f;
        kotlin.jvm.internal.e0.checkNotNull(entry);
        this.f8676b = entry.getKey();
        Map.Entry entry2 = s0Var.f8688f;
        kotlin.jvm.internal.e0.checkNotNull(entry2);
        this.f8677c = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public Object getKey() {
        return this.f8676b;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.f8677c;
    }

    @Override // java.util.Map.Entry
    public void setValue(Object obj) {
        this.f8677c = obj;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        s0 s0Var = this.f8678e;
        if (s0Var.getMap().getModification$runtime() != s0Var.f8687e) {
            throw new ConcurrentModificationException();
        }
        Object value = getValue();
        s0Var.getMap().put(getKey(), obj);
        setValue(obj);
        return value;
    }
}

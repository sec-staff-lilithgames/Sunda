package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class j5 extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f76385b;

    public j5(Map.Entry entry) {
        this.f76385b = entry;
    }

    @Override // nh.a0, java.util.Map.Entry
    public Object getKey() {
        return this.f76385b.getKey();
    }

    @Override // nh.a0, java.util.Map.Entry
    public l6 getValue() {
        return l6.of(this.f76385b.getValue());
    }
}

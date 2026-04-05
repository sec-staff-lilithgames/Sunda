package nh;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class na extends a0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f76501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ya f76502c;

    public na(Map.Entry entry, ya yaVar) {
        this.f76501b = entry;
        this.f76502c = yaVar;
    }

    @Override // nh.a0, java.util.Map.Entry
    public Object getKey() {
        return this.f76501b.getKey();
    }

    @Override // nh.a0, java.util.Map.Entry
    public Object getValue() {
        Map.Entry entry = this.f76501b;
        return this.f76502c.transformEntry(entry.getKey(), entry.getValue());
    }
}

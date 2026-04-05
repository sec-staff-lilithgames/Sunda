package nh;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class ai extends h4 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f76107b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bb f76108c;

    public ai(bb bbVar, Map.Entry entry) {
        this.f76107b = entry;
        this.f76108c = bbVar;
    }

    @Override // nh.h4
    public final Map.Entry c() {
        return this.f76107b;
    }

    @Override // nh.l4
    public final Object delegate() {
        return this.f76107b;
    }

    @Override // nh.h4, java.util.Map.Entry
    public Collection<Object> getValue() {
        return jh.i.c(((bi) this.f76108c.f76128e).f76516c, (Collection) this.f76107b.getValue());
    }
}

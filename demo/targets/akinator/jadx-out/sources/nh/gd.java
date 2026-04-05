package nh;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class gd extends be {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f76301b;

    public gd(Map.Entry entry) {
        this.f76301b = entry;
    }

    @Override // nh.be, nh.td
    public int getCount() {
        return ((Collection) this.f76301b.getValue()).size();
    }

    @Override // nh.be, nh.td
    public Object getElement() {
        return this.f76301b.getKey();
    }
}

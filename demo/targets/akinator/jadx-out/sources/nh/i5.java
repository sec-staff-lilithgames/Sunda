package nh;

import java.util.Collection;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class i5 extends m5 {
    @Override // nh.m5
    public final l6 a() {
        return new h5(this);
    }

    @Override // nh.m5
    public l6 b() {
        return new o5(this);
    }

    @Override // nh.m5
    public final u4 c() {
        return new r5(this);
    }

    @Override // nh.m5, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return entrySet();
    }

    public abstract ej h();

    @Override // nh.m5, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // nh.m5, java.util.Map
    public /* bridge */ /* synthetic */ Collection values() {
        return values();
    }
}

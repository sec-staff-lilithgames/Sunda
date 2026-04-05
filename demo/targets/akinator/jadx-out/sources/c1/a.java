package c1;

import kotlin.jvm.internal.u;
import kv.l;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final l f11731a;

    /* renamed from: b, reason: collision with root package name */
    public final l f11732b;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final l getReadObserver() {
        return this.f11731a;
    }

    public final l getWriteObserver() {
        return this.f11732b;
    }

    public a(l lVar, l lVar2) {
        this.f11731a = lVar;
        this.f11732b = lVar2;
    }

    public /* synthetic */ a(l lVar, l lVar2, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : lVar, (i10 & 2) != 0 ? null : lVar2);
    }
}

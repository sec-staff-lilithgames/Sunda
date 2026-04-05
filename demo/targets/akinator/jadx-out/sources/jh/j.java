package jh;

import java.util.concurrent.atomic.AtomicReference;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class j implements e {

    /* renamed from: b, reason: collision with root package name */
    public static final j f69551b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f69552c;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ j[] f69553e;

    static {
        j jVar = new j("INSTANCE", 0);
        f69551b = jVar;
        f69553e = new j[]{jVar};
        f69552c = new AtomicReference(null);
    }

    public static j[] values() {
        return (j[]) f69553e.clone();
    }

    @Override // jh.e
    public final f zza() {
        return (f) f69552c.get();
    }

    public final void zzb(f fVar) {
        f69552c.set(fVar);
    }
}

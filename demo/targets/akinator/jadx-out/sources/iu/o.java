package iu;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public static final o f68416b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ o[] f68417c;

    static {
        o oVar = new o("INSTANCE", 0);
        f68416b = oVar;
        f68417c = new o[]{oVar};
    }

    public static <K, V> Callable<Map<K, V>> asCallable() {
        return f68416b;
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f68417c.clone();
    }

    @Override // java.util.concurrent.Callable
    public Map<Object, Object> call() throws Exception {
        return new HashMap();
    }
}

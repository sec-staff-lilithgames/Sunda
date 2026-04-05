package ut;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public static final v f88693b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ v[] f88694c;

    static {
        v vVar = new v("INSTANCE", 0);
        f88693b = vVar;
        f88694c = new v[]{vVar};
    }

    public static v valueOf(String str) {
        return (v) Enum.valueOf(v.class, str);
    }

    public static v[] values() {
        return (v[]) f88694c.clone();
    }

    @Override // java.util.concurrent.Callable
    public Set<Object> call() throws Exception {
        return new HashSet();
    }
}

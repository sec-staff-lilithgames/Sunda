package du;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class o1 implements Callable {

    /* renamed from: b, reason: collision with root package name */
    public static final o1 f52806b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ o1[] f52807c;

    static {
        o1 o1Var = new o1("INSTANCE", 0);
        f52806b = o1Var;
        f52807c = new o1[]{o1Var};
    }

    public static o1 valueOf(String str) {
        return (o1) Enum.valueOf(o1.class, str);
    }

    public static o1[] values() {
        return (o1[]) f52807c.clone();
    }

    @Override // java.util.concurrent.Callable
    public NoSuchElementException call() throws Exception {
        return new NoSuchElementException();
    }
}

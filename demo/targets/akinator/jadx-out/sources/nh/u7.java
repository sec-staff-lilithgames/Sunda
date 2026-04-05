package nh;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class u7 implements Iterator {

    /* renamed from: b, reason: collision with root package name */
    public static final u7 f76687b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ u7[] f76688c;

    static {
        u7 u7Var = new u7("INSTANCE", 0);
        f76687b = u7Var;
        f76688c = new u7[]{u7Var};
    }

    public static u7 valueOf(String str) {
        return (u7) Enum.valueOf(u7.class, str);
    }

    public static u7[] values() {
        return (u7[]) f76688c.clone();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public void remove() {
        jh.i.t(false);
    }
}

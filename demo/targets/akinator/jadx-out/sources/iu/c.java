package iu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c implements Callable, st.o {

    /* renamed from: b, reason: collision with root package name */
    public static final c f68405b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ c[] f68406c;

    static {
        c cVar = new c("INSTANCE", 0);
        f68405b = cVar;
        f68406c = new c[]{cVar};
    }

    public static <T> Callable<List<T>> asCallable() {
        return f68405b;
    }

    public static <T, O> st.o asFunction() {
        return f68405b;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f68406c.clone();
    }

    @Override // st.o
    public List<Object> apply(Object obj) throws Exception {
        return new ArrayList();
    }

    @Override // java.util.concurrent.Callable
    public List<Object> call() throws Exception {
        return new ArrayList();
    }
}

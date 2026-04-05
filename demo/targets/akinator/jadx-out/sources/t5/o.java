package t5;

import kotlin.jvm.internal.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class o extends l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final o f86356b = new o(y5.c.class, "version", "getVersion()I", 0);

    @Override // kotlin.jvm.internal.l0, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return Integer.valueOf(((y5.c) obj).getVersion());
    }

    @Override // kotlin.jvm.internal.l0, kotlin.reflect.KMutableProperty1
    public void set(Object obj, Object obj2) {
        ((y5.c) obj).setVersion(((Number) obj2).intValue());
    }
}

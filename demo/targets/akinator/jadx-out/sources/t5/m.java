package t5;

import kotlin.jvm.internal.l0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class m extends l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m f86354b = new m(y5.c.class, "pageSize", "getPageSize()J", 0);

    @Override // kotlin.jvm.internal.l0, kotlin.reflect.KProperty1
    public Object get(Object obj) {
        return Long.valueOf(((y5.c) obj).getPageSize());
    }

    @Override // kotlin.jvm.internal.l0, kotlin.reflect.KMutableProperty1
    public void set(Object obj, Object obj2) {
        ((y5.c) obj).setPageSize(((Number) obj2).longValue());
    }
}

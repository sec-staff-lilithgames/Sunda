package oc;

import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    public static final HashSet f78949a = new HashSet();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, AtomicInteger.class, AtomicLong.class, StackTraceElement.class, ByteBuffer.class, Void.class, ThreadGroup.class};
        for (int i10 = 0; i10 < 8; i10++) {
            f78949a.add(clsArr[i10].getName());
        }
        for (Class<?> cls : t.types()) {
            f78949a.add(cls.getName());
        }
    }

    public static jc.q find(jc.k kVar, Class<?> cls, String str) throws jc.r {
        if (!f78949a.contains(str)) {
            return null;
        }
        t tVarFindDeserializer = t.findDeserializer(cls);
        if (tVarFindDeserializer != null) {
            return tVarFindDeserializer;
        }
        if (cls == UUID.class) {
            return new k1();
        }
        if (cls == StackTraceElement.class) {
            return q0.construct(kVar);
        }
        if (cls == AtomicBoolean.class) {
            return new b();
        }
        if (cls == AtomicInteger.class) {
            return new c();
        }
        if (cls == AtomicLong.class) {
            return new d();
        }
        if (cls == ByteBuffer.class) {
            return new g(ByteBuffer.class);
        }
        if (cls == Void.class) {
            return c0.f78800f;
        }
        if (cls == ThreadGroup.class) {
            return new h1(ThreadGroup.class);
        }
        return null;
    }

    public static boolean hasDeserializerFor(Class<?> cls) {
        return f78949a.contains(cls.getName());
    }
}

package qc;

import jc.q;
import jc.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f82732a = new b();

    public static a instance() {
        return f82732a;
    }

    public abstract Class<?> getClassJavaNioFilePath();

    public abstract q getDeserializerForJavaNioFilePath(Class<?> cls);

    public abstract w getSerializerForJavaNioFilePath(Class<?> cls);
}

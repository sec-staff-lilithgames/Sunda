package ov;

import java.io.Serializable;
import java.util.Random;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends ov.a implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public final Random f79859e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public e(Random impl) {
        e0.checkNotNullParameter(impl, "impl");
        this.f79859e = impl;
    }

    @Override // ov.a
    public Random getImpl() {
        return this.f79859e;
    }
}

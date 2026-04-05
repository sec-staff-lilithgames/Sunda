package tu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class q {
    public static <T> o lazy(kv.a initializer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializer, "initializer");
        kotlin.jvm.internal.u uVar = null;
        return new c0(initializer, uVar, 2, uVar);
    }

    public static <T> o lazy(s mode, kv.a initializer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(mode, "mode");
        kotlin.jvm.internal.e0.checkNotNullParameter(initializer, "initializer");
        int i10 = p.$EnumSwitchMapping$0[mode.ordinal()];
        int i11 = 2;
        if (i10 == 1) {
            kotlin.jvm.internal.u uVar = null;
            return new c0(initializer, uVar, i11, uVar);
        }
        if (i10 == 2) {
            return new b0(initializer);
        }
        if (i10 == 3) {
            return new y0(initializer);
        }
        throw new t();
    }

    public static final <T> o lazy(Object obj, kv.a initializer) {
        kotlin.jvm.internal.e0.checkNotNullParameter(initializer, "initializer");
        return new c0(initializer, obj);
    }
}

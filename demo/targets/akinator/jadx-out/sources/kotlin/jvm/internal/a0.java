package kotlin.jvm.internal;

import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class a0 extends z {
    public a0(int i10, KDeclarationContainer kDeclarationContainer, String str, String str2) {
        super(i10, p.NO_RECEIVER, ((r) kDeclarationContainer).getJClass(), str, str2, !(kDeclarationContainer instanceof KClass) ? 1 : 0);
    }

    public a0(int i10, Class cls, String str, String str2, int i11) {
        super(i10, p.NO_RECEIVER, cls, str, str2, i11);
    }

    public a0(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(i10, obj, cls, str, str2, i11);
    }
}

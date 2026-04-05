package l6;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 implements k6.d {

    /* renamed from: a, reason: collision with root package name */
    public final ScriptHandlerBoundaryInterface f72449a;

    public d0(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface) {
        this.f72449a = scriptHandlerBoundaryInterface;
    }

    public static d0 toScriptHandler(InvocationHandler invocationHandler) {
        return new d0((ScriptHandlerBoundaryInterface) rw.a.castToSuppLibClass(ScriptHandlerBoundaryInterface.class, invocationHandler));
    }

    @Override // k6.d
    public void remove() {
        this.f72449a.remove();
    }
}

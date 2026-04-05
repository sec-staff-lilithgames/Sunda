package l6;

import java.lang.reflect.InvocationHandler;
import k6.m;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class k0 implements WebMessageCallbackBoundaryInterface {

    /* renamed from: b, reason: collision with root package name */
    public final m.a f72465b;

    public k0(m.a aVar) {
        this.f72465b = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        k6.l lVarWebMessageCompatFromBoundaryInterface = j0.webMessageCompatFromBoundaryInterface((WebMessageBoundaryInterface) rw.a.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler2));
        if (lVarWebMessageCompatFromBoundaryInterface != null) {
            this.f72465b.onMessage(new n0(invocationHandler), lVarWebMessageCompatFromBoundaryInterface);
        }
    }
}

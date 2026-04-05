package l6;

import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j0 implements WebMessageBoundaryInterface {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f72462c = {"WEB_MESSAGE_ARRAY_BUFFER"};

    /* renamed from: b, reason: collision with root package name */
    public final k6.l f72463b;

    public j0(k6.l lVar) {
        this.f72463b = lVar;
    }

    public static boolean isMessagePayloadTypeSupportedByWebView(int i10) {
        return i10 == 0 || (i10 == 1 && t0.f72495q.isSupportedByWebView());
    }

    public static k6.l webMessageCompatFromBoundaryInterface(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        InvocationHandler[] ports = webMessageBoundaryInterface.getPorts();
        k6.m[] mVarArr = new k6.m[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            mVarArr[i10] = new n0(ports[i10]);
        }
        if (!t0.f72495q.isSupportedByWebView()) {
            return new k6.l(webMessageBoundaryInterface.getData(), mVarArr);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) rw.a.castToSuppLibClass(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type = webMessagePayloadBoundaryInterface.getType();
        if (type == 0) {
            return new k6.l(webMessagePayloadBoundaryInterface.getAsString(), mVarArr);
        }
        if (type != 1) {
            return null;
        }
        return new k6.l(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), mVarArr);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Deprecated
    public String getData() {
        return this.f72463b.getData();
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler getMessagePayload() {
        m0 m0Var;
        k6.l lVar = this.f72463b;
        int type = lVar.getType();
        if (type == 0) {
            m0Var = new m0(lVar.getData());
        } else {
            if (type != 1) {
                throw new IllegalStateException("Unknown web message payload type: " + lVar.getType());
            }
            byte[] arrayBuffer = lVar.getArrayBuffer();
            Objects.requireNonNull(arrayBuffer);
            m0Var = new m0(arrayBuffer);
        }
        return rw.a.createInvocationHandlerFor(m0Var);
    }

    @Override // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    public InvocationHandler[] getPorts() {
        k6.m[] ports = this.f72463b.getPorts();
        if (ports == null) {
            return null;
        }
        InvocationHandler[] invocationHandlerArr = new InvocationHandler[ports.length];
        for (int i10 = 0; i10 < ports.length; i10++) {
            invocationHandlerArr[i10] = ports[i10].getInvocationHandler();
        }
        return invocationHandlerArr;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return f72462c;
    }
}

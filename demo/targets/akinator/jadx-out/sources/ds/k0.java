package ds;

import mh.p1;
import wr.k4;
import wr.m5;
import wr.m6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class k0 {
    public static <ReqT, RespT> m5 asyncBidiStreamingCall(y yVar) {
        return new f0(yVar, true);
    }

    public static <ReqT, RespT> m5 asyncClientStreamingCall(z zVar) {
        return new f0(zVar, false);
    }

    public static <ReqT, RespT> m5 asyncServerStreamingCall(c0 c0Var) {
        return new j0(c0Var, true);
    }

    public static <ReqT, RespT> m5 asyncUnaryCall(g0 g0Var) {
        return new j0(g0Var, false);
    }

    public static <ReqT> l0 asyncUnimplementedStreamingCall(k4 k4Var, l0 l0Var) {
        asyncUnimplementedUnaryCall(k4Var, l0Var);
        return new a0();
    }

    public static void asyncUnimplementedUnaryCall(k4 k4Var, l0 l0Var) {
        p1.checkNotNull(k4Var, "methodDescriptor");
        p1.checkNotNull(l0Var, "responseObserver");
        l0Var.onError(m6.f91045m.withDescription("Method " + k4Var.getFullMethodName() + " is unimplemented").asRuntimeException());
    }
}

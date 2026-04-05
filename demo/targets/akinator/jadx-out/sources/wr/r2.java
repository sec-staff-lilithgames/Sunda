package wr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class r2 {
    public static <ReqT, RespT> m5 interceptCallHandlerCreate(o5 o5Var, m5 m5Var) {
        return s5.create(o5Var, m5Var);
    }

    public static <OrigReqT, OrigRespT, WrapReqT, WrapRespT> t5 wrapMethod(t5 t5Var, k4 k4Var) {
        return t5.create(k4Var, new r5(t5Var.getMethodDescriptor(), k4Var, t5Var.getServerCallHandler()));
    }
}

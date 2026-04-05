package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.TransactionEventRequestOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final q0 f57502a = new q0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i10) {
        return TransactionEventRequestOuterClass.StoreType.forNumber(i10) != null;
    }
}

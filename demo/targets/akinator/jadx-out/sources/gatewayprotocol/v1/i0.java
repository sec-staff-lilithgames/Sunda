package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.NativeConfigurationOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class i0 implements Internal.EnumVerifier {

    /* renamed from: a, reason: collision with root package name */
    public static final i0 f57493a = new i0();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i10) {
        return NativeConfigurationOuterClass.ShowCompletionState.forNumber(i10) != null;
    }
}

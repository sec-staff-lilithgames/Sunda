package gatewayprotocol.v1;

import com.google.protobuf.Internal;
import gatewayprotocol.v1.AdFormatOuterClass;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d0 implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public AdFormatOuterClass.AdFormat convert(Integer num) {
        AdFormatOuterClass.AdFormat adFormatForNumber = AdFormatOuterClass.AdFormat.forNumber(num.intValue());
        return adFormatForNumber == null ? AdFormatOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
    }
}

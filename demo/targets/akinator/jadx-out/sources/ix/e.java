package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;
import xchange.Cargo$CargoFieldCounter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface e extends MessageLiteOrBuilder {
    Cargo$CargoFieldCounter getFields(int i10);

    int getFieldsCount();

    List<Cargo$CargoFieldCounter> getFieldsList();

    String getPurcharseOrder();

    ByteString getPurcharseOrderBytes();
}

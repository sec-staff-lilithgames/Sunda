package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;
import xchange.Cargo$CargoPOCounter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface g extends MessageLiteOrBuilder {
    String getAccountName();

    ByteString getAccountNameBytes();

    Cargo$CargoPOCounter getContent(int i10);

    int getContentCount();

    List<Cargo$CargoPOCounter> getContentList();

    Timestamp getDeliveredAt();

    String getDeliveryHandler();

    ByteString getDeliveryHandlerBytes();

    String getDeliveryId();

    ByteString getDeliveryIdBytes();

    String getSaleOrder();

    ByteString getSaleOrderBytes();

    boolean hasDeliveredAt();
}

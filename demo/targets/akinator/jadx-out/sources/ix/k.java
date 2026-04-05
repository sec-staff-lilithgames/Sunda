package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface k extends MessageLiteOrBuilder {
    int getIabId();

    String getId();

    ByteString getIdBytes();

    String getName();

    ByteString getNameBytes();

    String getPurchaseOrders(int i10);

    ByteString getPurchaseOrdersBytes(int i10);

    int getPurchaseOrdersCount();

    List<String> getPurchaseOrdersList();

    String getSaleOrders(int i10);

    ByteString getSaleOrdersBytes(int i10);

    int getSaleOrdersCount();

    List<String> getSaleOrdersList();
}

package ix;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Timestamp;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface m extends MessageLiteOrBuilder {
    boolean getAcceptPrivacyShield();

    boolean getActive();

    String getAppKeys(int i10);

    ByteString getAppKeysBytes(int i10);

    int getAppKeysCount();

    List<String> getAppKeysList();

    String getAvailableFields(int i10);

    ByteString getAvailableFieldsBytes(int i10);

    int getAvailableFieldsCount();

    List<String> getAvailableFieldsList();

    String getBlacklistedIds(int i10);

    ByteString getBlacklistedIdsBytes(int i10);

    int getBlacklistedIdsCount();

    List<String> getBlacklistedIdsList();

    String getBuyerId(int i10);

    ByteString getBuyerIdBytes(int i10);

    int getBuyerIdCount();

    List<String> getBuyerIdList();

    Timestamp getEndDate();

    String getId();

    ByteString getIdBytes();

    String getOrderNumber();

    ByteString getOrderNumberBytes();

    String getSellerId();

    ByteString getSellerIdBytes();

    int getSources(int i10);

    int getSourcesCount();

    List<Integer> getSourcesList();

    Timestamp getStartDate();

    boolean hasEndDate();

    boolean hasStartDate();
}

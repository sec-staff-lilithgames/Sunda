package uk;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface e extends MessageLiteOrBuilder {
    String getDetail();

    ByteString getDetailBytes();

    String getStackEntries(int i10);

    ByteString getStackEntriesBytes(int i10);

    int getStackEntriesCount();

    List<String> getStackEntriesList();
}

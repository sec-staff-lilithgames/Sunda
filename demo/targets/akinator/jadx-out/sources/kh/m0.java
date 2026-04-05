package kh;

import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface m0 extends MessageLiteOrBuilder {
    String getAllowedRequestExtensions(int i10);

    ByteString getAllowedRequestExtensionsBytes(int i10);

    int getAllowedRequestExtensionsCount();

    List<String> getAllowedRequestExtensionsList();

    String getAllowedResponseExtensions(int i10);

    ByteString getAllowedResponseExtensionsBytes(int i10);

    int getAllowedResponseExtensionsCount();

    List<String> getAllowedResponseExtensionsList();

    String getProvided(int i10);

    ByteString getProvidedBytes(int i10);

    int getProvidedCount();

    List<String> getProvidedList();

    String getRequested(int i10);

    ByteString getRequestedBytes(int i10);

    int getRequestedCount();

    List<String> getRequestedList();

    String getSelector();

    ByteString getSelectorBytes();
}

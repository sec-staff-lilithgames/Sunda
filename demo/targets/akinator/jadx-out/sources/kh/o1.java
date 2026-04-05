package kh;

import com.google.api.CustomHttpPattern;
import com.google.api.HttpRule;
import com.google.protobuf.ByteString;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface o1 extends MessageLiteOrBuilder {
    HttpRule getAdditionalBindings(int i10);

    int getAdditionalBindingsCount();

    List<HttpRule> getAdditionalBindingsList();

    String getBody();

    ByteString getBodyBytes();

    CustomHttpPattern getCustom();

    String getDelete();

    ByteString getDeleteBytes();

    String getGet();

    ByteString getGetBytes();

    String getPatch();

    ByteString getPatchBytes();

    n1 getPatternCase();

    String getPost();

    ByteString getPostBytes();

    String getPut();

    ByteString getPutBytes();

    String getResponseBody();

    ByteString getResponseBodyBytes();

    String getSelector();

    ByteString getSelectorBytes();

    boolean hasCustom();

    boolean hasDelete();

    boolean hasGet();

    boolean hasPatch();

    boolean hasPost();

    boolean hasPut();
}

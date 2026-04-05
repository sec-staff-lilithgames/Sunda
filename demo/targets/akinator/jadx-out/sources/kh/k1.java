package kh;

import com.google.api.HttpRule;
import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public interface k1 extends MessageLiteOrBuilder {
    boolean getFullyDecodeReservedExpansion();

    HttpRule getRules(int i10);

    int getRulesCount();

    List<HttpRule> getRulesList();
}

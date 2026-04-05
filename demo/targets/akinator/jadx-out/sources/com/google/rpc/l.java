package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.QuotaFailure;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface l extends MessageLiteOrBuilder {
    QuotaFailure.Violation getViolations(int i10);

    int getViolationsCount();

    List<QuotaFailure.Violation> getViolationsList();
}

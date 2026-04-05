package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.PreconditionFailure;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface i extends MessageLiteOrBuilder {
    PreconditionFailure.Violation getViolations(int i10);

    int getViolationsCount();

    List<PreconditionFailure.Violation> getViolationsList();
}

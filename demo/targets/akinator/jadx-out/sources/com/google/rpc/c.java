package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import com.google.rpc.BadRequest;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface c extends MessageLiteOrBuilder {
    BadRequest.FieldViolation getFieldViolations(int i10);

    int getFieldViolationsCount();

    List<BadRequest.FieldViolation> getFieldViolationsList();
}

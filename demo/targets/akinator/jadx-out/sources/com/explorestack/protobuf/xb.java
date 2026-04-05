package com.explorestack.protobuf;

import com.explorestack.protobuf.Descriptors;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class xb {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f22893b = Logger.getLogger(xb.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final Map f22894a;

    public xb(Map map) {
        this.f22894a = map;
    }

    public static xb getEmptyTypeRegistry() {
        return wb.f22818a;
    }

    public static vb newBuilder() {
        return new vb();
    }

    public Descriptors.Descriptor find(String str) {
        return (Descriptors.Descriptor) this.f22894a.get(str);
    }

    public final Descriptors.Descriptor getDescriptorForTypeUrl(String str) throws InvalidProtocolBufferException {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length != 1) {
            return find(strArrSplit[strArrSplit.length - 1]);
        }
        throw new InvalidProtocolBufferException("Invalid type url found: ".concat(str));
    }
}

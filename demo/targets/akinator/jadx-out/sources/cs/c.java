package cs;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import wr.v3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements v3 {

    /* renamed from: a, reason: collision with root package name */
    public final MessageLite f50937a;

    public c(MessageLite messageLite) {
        this.f50937a = messageLite;
    }

    @Override // wr.v3
    public MessageLite parseBytes(byte[] bArr) {
        try {
            return this.f50937a.getParserForType().parseFrom(bArr, d.f50938a);
        } catch (InvalidProtocolBufferException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // wr.v3
    public byte[] toBytes(MessageLite messageLite) {
        return messageLite.toByteArray();
    }
}

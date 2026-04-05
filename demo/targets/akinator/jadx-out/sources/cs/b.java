package cs;

import com.google.protobuf.CodedInputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import mh.p1;
import wr.i4;
import wr.m6;
import wr.w2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b implements i4 {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f50933d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final Parser f50934a;

    /* renamed from: b, reason: collision with root package name */
    public final MessageLite f50935b;

    /* renamed from: c, reason: collision with root package name */
    public final int f50936c;

    public b(MessageLite messageLite, int i10) {
        this.f50935b = (MessageLite) p1.checkNotNull(messageLite, "defaultInstance cannot be null");
        this.f50934a = messageLite.getParserForType();
        this.f50936c = i10;
    }

    @Override // wr.i4, wr.j4
    public Class<MessageLite> getMessageClass() {
        return this.f50935b.getClass();
    }

    @Override // wr.i4
    public MessageLite getMessagePrototype() {
        return this.f50935b;
    }

    @Override // wr.i4, wr.j4, wr.g4
    public MessageLite parse(InputStream inputStream) throws IOException {
        CodedInputStream codedInputStreamNewInstance;
        byte[] bArr;
        if ((inputStream instanceof a) && ((a) inputStream).f50931c == this.f50934a) {
            try {
                MessageLite messageLite = ((a) inputStream).f50930b;
                if (messageLite != null) {
                    return messageLite;
                }
                throw new IllegalStateException("message not available");
            } catch (IllegalStateException unused) {
            }
        }
        try {
            if (inputStream instanceof w2) {
                int iAvailable = inputStream.available();
                if (iAvailable <= 0 || iAvailable > 4194304) {
                    if (iAvailable == 0) {
                        return this.f50935b;
                    }
                    codedInputStreamNewInstance = null;
                } else {
                    ThreadLocal threadLocal = f50933d;
                    Reference reference = (Reference) threadLocal.get();
                    if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < iAvailable) {
                        bArr = new byte[iAvailable];
                        threadLocal.set(new WeakReference(bArr));
                    }
                    int i10 = iAvailable;
                    while (i10 > 0) {
                        int i11 = inputStream.read(bArr, iAvailable - i10, i10);
                        if (i11 == -1) {
                            break;
                        }
                        i10 -= i11;
                    }
                    if (i10 != 0) {
                        throw new RuntimeException("size inaccurate: " + iAvailable + " != " + (iAvailable - i10));
                    }
                    codedInputStreamNewInstance = CodedInputStream.newInstance(bArr, 0, iAvailable);
                }
            } else {
                codedInputStreamNewInstance = null;
            }
            if (codedInputStreamNewInstance == null) {
                codedInputStreamNewInstance = CodedInputStream.newInstance(inputStream);
            }
            codedInputStreamNewInstance.setSizeLimit(Integer.MAX_VALUE);
            int i12 = this.f50936c;
            if (i12 >= 0) {
                codedInputStreamNewInstance.setRecursionLimit(i12);
            }
            try {
                MessageLite messageLite2 = (MessageLite) this.f50934a.parseFrom(codedInputStreamNewInstance, d.f50938a);
                try {
                    codedInputStreamNewInstance.checkLastTagWas(0);
                    return messageLite2;
                } catch (InvalidProtocolBufferException e10) {
                    e10.setUnfinishedMessage(messageLite2);
                    throw e10;
                }
            } catch (InvalidProtocolBufferException e11) {
                throw m6.f91046n.withDescription("Invalid protobuf byte sequence").withCause(e11).asRuntimeException();
            }
        } catch (IOException e12) {
            throw new RuntimeException(e12);
        }
    }

    @Override // wr.i4, wr.j4, wr.g4
    public InputStream stream(MessageLite messageLite) {
        return new a(messageLite, this.f50934a);
    }
}

package cs;

import com.applovin.shadow.okio.Segment;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import mh.p1;
import wr.e1;
import wr.w2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a extends InputStream implements e1, w2 {

    /* renamed from: b, reason: collision with root package name */
    public MessageLite f50930b;

    /* renamed from: c, reason: collision with root package name */
    public final Parser f50931c;

    /* renamed from: e, reason: collision with root package name */
    public ByteArrayInputStream f50932e;

    public a(MessageLite messageLite, Parser parser) {
        this.f50930b = messageLite;
        this.f50931c = parser;
    }

    @Override // java.io.InputStream, wr.w2
    public int available() {
        MessageLite messageLite = this.f50930b;
        if (messageLite != null) {
            return messageLite.getSerializedSize();
        }
        ByteArrayInputStream byteArrayInputStream = this.f50932e;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    @Override // wr.e1
    public int drainTo(OutputStream outputStream) throws IOException {
        MessageLite messageLite = this.f50930b;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            this.f50930b.writeTo(outputStream);
            this.f50930b = null;
            return serializedSize;
        }
        ByteArrayInputStream byteArrayInputStream = this.f50932e;
        if (byteArrayInputStream == null) {
            return 0;
        }
        ExtensionRegistryLite extensionRegistryLite = d.f50938a;
        p1.checkNotNull(byteArrayInputStream, "inputStream cannot be null!");
        p1.checkNotNull(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[Segment.SIZE];
        long j10 = 0;
        while (true) {
            int i10 = byteArrayInputStream.read(bArr);
            if (i10 == -1) {
                int i11 = (int) j10;
                this.f50932e = null;
                return i11;
            }
            outputStream.write(bArr, 0, i10);
            j10 += i10;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        if (this.f50930b != null) {
            this.f50932e = new ByteArrayInputStream(this.f50930b.toByteArray());
            this.f50930b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f50932e;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        MessageLite messageLite = this.f50930b;
        if (messageLite != null) {
            int serializedSize = messageLite.getSerializedSize();
            if (serializedSize == 0) {
                this.f50930b = null;
                this.f50932e = null;
                return -1;
            }
            if (i11 >= serializedSize) {
                CodedOutputStream codedOutputStreamNewInstance = CodedOutputStream.newInstance(bArr, i10, serializedSize);
                this.f50930b.writeTo(codedOutputStreamNewInstance);
                codedOutputStreamNewInstance.flush();
                codedOutputStreamNewInstance.checkNoSpaceLeft();
                this.f50930b = null;
                this.f50932e = null;
                return serializedSize;
            }
            this.f50932e = new ByteArrayInputStream(this.f50930b.toByteArray());
            this.f50930b = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f50932e;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i10, i11);
        }
        return -1;
    }
}

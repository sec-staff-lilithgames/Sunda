package vo;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f89507a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f89508b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f89507a = byteArrayOutputStream;
        this.f89508b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] encode(a aVar) throws IOException {
        DataOutputStream dataOutputStream = this.f89508b;
        ByteArrayOutputStream byteArrayOutputStream = this.f89507a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.f89501a);
            dataOutputStream.writeByte(0);
            String str = aVar.f89502b;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.f89503c);
            dataOutputStream.writeLong(aVar.f89504d);
            dataOutputStream.write(aVar.f89505e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}

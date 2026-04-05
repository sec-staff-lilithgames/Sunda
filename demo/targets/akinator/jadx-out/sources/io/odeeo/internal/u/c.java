package io.odeeo.internal.u;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f66517a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f66518b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f66517a = byteArrayOutputStream;
        this.f66518b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void a(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] encode(a aVar) throws IOException {
        this.f66517a.reset();
        try {
            a(this.f66518b, aVar.f66511a);
            String str = aVar.f66512b;
            if (str == null) {
                str = "";
            }
            a(this.f66518b, str);
            this.f66518b.writeLong(aVar.f66513c);
            this.f66518b.writeLong(aVar.f66514d);
            this.f66518b.write(aVar.f66515e);
            this.f66518b.flush();
            return this.f66517a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}

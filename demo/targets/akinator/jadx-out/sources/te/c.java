package te;

import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f86829a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f86830b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f86829a = byteArrayOutputStream;
        this.f86830b = new DataOutputStream(byteArrayOutputStream);
    }

    public byte[] encode(EventMessage eventMessage) throws IOException {
        DataOutputStream dataOutputStream = this.f86830b;
        ByteArrayOutputStream byteArrayOutputStream = this.f86829a;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(eventMessage.f27715b);
            dataOutputStream.writeByte(0);
            String str = eventMessage.f27716c;
            if (str == null) {
                str = "";
            }
            dataOutputStream.writeBytes(str);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(eventMessage.f27717e);
            dataOutputStream.writeLong(eventMessage.f27718f);
            dataOutputStream.write(eventMessage.f27719g);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}

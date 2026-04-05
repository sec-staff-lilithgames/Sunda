package zj;

import com.google.firebase.messaging.a0;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class g {

    /* renamed from: b, reason: collision with root package name */
    public static final g f98044b = new f().build();

    /* renamed from: a, reason: collision with root package name */
    public final e f98045a;

    public g(e eVar) {
        this.f98045a = eVar;
    }

    public static g getDefaultInstance() {
        return f98044b;
    }

    public static f newBuilder() {
        return new f();
    }

    public e getMessagingClientEvent() {
        e eVar = this.f98045a;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public e getMessagingClientEventInternal() {
        return this.f98045a;
    }

    public byte[] toByteArray() {
        return a0.encode(this);
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        a0.encode(this, outputStream);
    }
}
